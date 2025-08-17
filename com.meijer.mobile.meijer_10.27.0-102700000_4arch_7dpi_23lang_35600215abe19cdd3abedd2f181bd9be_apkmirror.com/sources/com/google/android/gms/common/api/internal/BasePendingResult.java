package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.fullstory.FS;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.InterfaceC6530l;
import com.google.android.gms.common.internal.r;
import hd.u0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import wd.j;

@KeepName
/* loaded from: classes4.dex */
public abstract class BasePendingResult<R extends k> extends g<R> {

    /* renamed from: o, reason: collision with root package name */
    static final ThreadLocal f64757o = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f64758a;

    /* renamed from: b, reason: collision with root package name */
    protected final a f64759b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f64760c;

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f64761d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f64762e;

    /* renamed from: f, reason: collision with root package name */
    private l f64763f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f64764g;

    /* renamed from: h, reason: collision with root package name */
    private k f64765h;

    /* renamed from: i, reason: collision with root package name */
    private Status f64766i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f64767j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f64768k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f64769l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6530l f64770m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f64771n;

    @KeepName
    private d resultGuardian;

    public static class a<R extends k> extends j {
        public final void a(l lVar, k kVar) {
            ThreadLocal threadLocal = BasePendingResult.f64757o;
            sendMessage(obtainMessage(1, new Pair((l) r.l(lVar), kVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).c(Status.f64738i);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            l lVar = (l) pair.first;
            k kVar = (k) pair.second;
            try {
                lVar.a(kVar);
            } catch (RuntimeException e10) {
                BasePendingResult.j(kVar);
                throw e10;
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f64758a = new Object();
        this.f64761d = new CountDownLatch(1);
        this.f64762e = new ArrayList();
        this.f64764g = new AtomicReference();
        this.f64771n = false;
        this.f64759b = new a(Looper.getMainLooper());
        this.f64760c = new WeakReference(null);
    }

    protected abstract R b(Status status);

    private final k f() {
        k kVar;
        synchronized (this.f64758a) {
            r.q(!this.f64767j, "Result has already been consumed.");
            r.q(d(), "Result is not ready.");
            kVar = this.f64765h;
            this.f64765h = null;
            this.f64763f = null;
            this.f64767j = true;
        }
        if (((b) this.f64764g.getAndSet(null)) == null) {
            return (k) r.l(kVar);
        }
        throw null;
    }

    private final void g(k kVar) {
        this.f64765h = kVar;
        this.f64766i = kVar.a();
        u0 u0Var = null;
        this.f64770m = null;
        this.f64761d.countDown();
        if (this.f64768k) {
            this.f64763f = null;
        } else {
            l lVar = this.f64763f;
            if (lVar != null) {
                this.f64759b.removeMessages(2);
                this.f64759b.a(lVar, f());
            } else if (this.f64765h instanceof i) {
                this.resultGuardian = new d(this, u0Var);
            }
        }
        ArrayList arrayList = this.f64762e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g.a) arrayList.get(i10)).a(this.f64766i);
        }
        this.f64762e.clear();
    }

    public static void j(k kVar) {
        if (kVar instanceof i) {
            try {
                ((i) kVar).release();
            } catch (RuntimeException e10) {
                FS.log_w("BasePendingResult", "Unable to release ".concat(String.valueOf(kVar)), e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void a(g.a aVar) {
        r.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f64758a) {
            try {
                if (d()) {
                    aVar.a(this.f64766i);
                } else {
                    this.f64762e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void c(Status status) {
        synchronized (this.f64758a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.f64769l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        return this.f64761d.getCount() == 0;
    }

    public final void e(R r10) {
        synchronized (this.f64758a) {
            try {
                if (this.f64769l || this.f64768k) {
                    j(r10);
                    return;
                }
                d();
                r.q(!d(), "Results have already been set");
                r.q(!this.f64767j, "Result has already been consumed");
                g(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        boolean z10 = true;
        if (!this.f64771n && !((Boolean) f64757o.get()).booleanValue()) {
            z10 = false;
        }
        this.f64771n = z10;
    }

    protected BasePendingResult(com.google.android.gms.common.api.e eVar) {
        this.f64758a = new Object();
        this.f64761d = new CountDownLatch(1);
        this.f64762e = new ArrayList();
        this.f64764g = new AtomicReference();
        this.f64771n = false;
        this.f64759b = new a(eVar != null ? eVar.a() : Looper.getMainLooper());
        this.f64760c = new WeakReference(eVar);
    }
}
