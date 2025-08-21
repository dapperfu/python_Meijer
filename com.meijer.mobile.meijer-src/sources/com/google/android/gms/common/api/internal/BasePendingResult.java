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
import com.google.android.gms.common.internal.InterfaceC6655l;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import jd.u0;
import yd.j;

@KeepName
/* loaded from: classes4.dex */
public abstract class BasePendingResult<R extends k> extends g<R> {

    /* renamed from: o, reason: collision with root package name */
    static final ThreadLocal f65597o = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f65598a;

    /* renamed from: b, reason: collision with root package name */
    protected final a f65599b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f65600c;

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f65601d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f65602e;

    /* renamed from: f, reason: collision with root package name */
    private l f65603f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f65604g;

    /* renamed from: h, reason: collision with root package name */
    private k f65605h;

    /* renamed from: i, reason: collision with root package name */
    private Status f65606i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f65607j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f65608k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f65609l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6655l f65610m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f65611n;

    @KeepName
    private d resultGuardian;

    public static class a<R extends k> extends j {
        public final void a(l lVar, k kVar) {
            ThreadLocal threadLocal = BasePendingResult.f65597o;
            sendMessage(obtainMessage(1, new Pair((l) r.l(lVar), kVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).c(Status.f65578i);
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
        this.f65598a = new Object();
        this.f65601d = new CountDownLatch(1);
        this.f65602e = new ArrayList();
        this.f65604g = new AtomicReference();
        this.f65611n = false;
        this.f65599b = new a(Looper.getMainLooper());
        this.f65600c = new WeakReference(null);
    }

    protected abstract R b(Status status);

    private final k f() {
        k kVar;
        synchronized (this.f65598a) {
            r.q(!this.f65607j, "Result has already been consumed.");
            r.q(d(), "Result is not ready.");
            kVar = this.f65605h;
            this.f65605h = null;
            this.f65603f = null;
            this.f65607j = true;
        }
        if (((b) this.f65604g.getAndSet(null)) == null) {
            return (k) r.l(kVar);
        }
        throw null;
    }

    private final void g(k kVar) {
        this.f65605h = kVar;
        this.f65606i = kVar.a();
        u0 u0Var = null;
        this.f65610m = null;
        this.f65601d.countDown();
        if (this.f65608k) {
            this.f65603f = null;
        } else {
            l lVar = this.f65603f;
            if (lVar != null) {
                this.f65599b.removeMessages(2);
                this.f65599b.a(lVar, f());
            } else if (this.f65605h instanceof i) {
                this.resultGuardian = new d(this, u0Var);
            }
        }
        ArrayList arrayList = this.f65602e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g.a) arrayList.get(i10)).a(this.f65606i);
        }
        this.f65602e.clear();
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
        synchronized (this.f65598a) {
            try {
                if (d()) {
                    aVar.a(this.f65606i);
                } else {
                    this.f65602e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void c(Status status) {
        synchronized (this.f65598a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.f65609l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        return this.f65601d.getCount() == 0;
    }

    public final void e(R r10) {
        synchronized (this.f65598a) {
            try {
                if (this.f65609l || this.f65608k) {
                    j(r10);
                    return;
                }
                d();
                r.q(!d(), "Results have already been set");
                r.q(!this.f65607j, "Result has already been consumed");
                g(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        boolean z10 = true;
        if (!this.f65611n && !((Boolean) f65597o.get()).booleanValue()) {
            z10 = false;
        }
        this.f65611n = z10;
    }

    protected BasePendingResult(com.google.android.gms.common.api.e eVar) {
        this.f65598a = new Object();
        this.f65601d = new CountDownLatch(1);
        this.f65602e = new ArrayList();
        this.f65604g = new AtomicReference();
        this.f65611n = false;
        this.f65599b = new a(eVar != null ? eVar.a() : Looper.getMainLooper());
        this.f65600c = new WeakReference(eVar);
    }
}
