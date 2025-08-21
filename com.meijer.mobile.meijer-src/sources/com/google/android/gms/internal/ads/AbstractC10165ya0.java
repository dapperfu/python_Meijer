package com.google.android.gms.internal.ads;

import Oc.InterfaceC4383c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;

/* renamed from: com.google.android.gms.internal.ads.ya0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10165ya0 {

    /* renamed from: a, reason: collision with root package name */
    protected final ClientApi f81083a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f81084b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f81085c;

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC6756Cl f81086d;

    /* renamed from: e, reason: collision with root package name */
    protected Oc.J1 f81087e;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4383c0 f81089g;

    /* renamed from: i, reason: collision with root package name */
    private final W90 f81091i;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f81093k;

    /* renamed from: n, reason: collision with root package name */
    private C8135fa0 f81096n;

    /* renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f81097o;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentLinkedQueue f81090h = new ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    protected final AtomicBoolean f81088f = new AtomicBoolean(true);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f81092j = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f81094l = new AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f81095m = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void A(Object obj) {
        try {
            this.f81092j.set(false);
            if (obj != null) {
                this.f81091i.c();
                this.f81095m.set(true);
                y(obj);
            }
            c(obj == null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void B() {
        if (this.f81094l.get()) {
            try {
                this.f81089g.r4(this.f81087e);
            } catch (RemoteException unused) {
                Sc.p.g("Failed to call onAdsAvailable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void C() {
        if (this.f81094l.get()) {
            try {
                this.f81089g.L3(this.f81087e);
            } catch (RemoteException unused) {
                Sc.p.g("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void D() {
        if (this.f81095m.get() && this.f81090h.isEmpty()) {
            this.f81095m.set(false);
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.va0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79920a.C();
                }
            });
            this.f81093k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wa0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80338a.r();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a(Oc.W0 w02) {
        this.f81092j.set(false);
        int i10 = w02.f23346a;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            c(true);
            return;
        }
        Oc.J1 j12 = this.f81087e;
        Sc.p.f("Preloading " + j12.f23333b + ", for adUnitId:" + j12.f23332a + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.f81088f.set(false);
    }

    private final synchronized void b() {
        Iterator it = this.f81090h.iterator();
        while (it.hasNext()) {
            if (((C8989na0) it.next()).c()) {
                it.remove();
            }
        }
    }

    private final synchronized void c(boolean z10) {
        try {
            if (this.f81091i.e()) {
                return;
            }
            if (z10) {
                this.f81091i.b();
            }
            this.f81093k.schedule(new RunnableC9096oa0(this), this.f81091i.a(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void y(Object obj) {
        C8989na0 c8989na0 = new C8989na0(obj, this.f81097o);
        this.f81090h.add(c8989na0);
        com.google.android.gms.common.util.f fVar = this.f81097o;
        final Optional optionalF = f(obj);
        final long jA = fVar.a();
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ta0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79436a.B();
            }
        });
        this.f81093k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79718a.q(jA, optionalF);
            }
        });
        this.f81093k.schedule(new RunnableC9096oa0(this), c8989na0.a(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void z(Throwable th2) {
        try {
            this.f81092j.set(false);
            if ((th2 instanceof zzfjc) && ((zzfjc) th2).a() == 0) {
                throw null;
            }
            c(true);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    protected abstract com.google.common.util.concurrent.q e();

    protected abstract Optional f(Object obj);

    public final synchronized AbstractC10165ya0 g() {
        this.f81093k.submit(new RunnableC9096oa0(this));
        return this;
    }

    protected final synchronized Object h() {
        C8989na0 c8989na0 = (C8989na0) this.f81090h.peek();
        if (c8989na0 == null) {
            return null;
        }
        return c8989na0.b();
    }

    public final synchronized Object i() {
        this.f81091i.c();
        C8989na0 c8989na0 = (C8989na0) this.f81090h.poll();
        this.f81095m.set(c8989na0 != null);
        p();
        if (c8989na0 == null) {
            return null;
        }
        return c8989na0.b();
    }

    public final synchronized Optional j() {
        Object objH;
        try {
            objH = h();
        } catch (Throwable th2) {
            throw th2;
        }
        return d(objH == null ? Optional.empty() : f(objH));
    }

    protected final synchronized void p() {
        b();
        D();
        if (!this.f81092j.get() && this.f81088f.get() && this.f81090h.size() < this.f81087e.f23335d) {
            this.f81092j.set(true);
            Mj0.r(e(), new C10058xa0(this), this.f81093k);
        }
    }

    public final synchronized void s(int i10) {
        com.google.android.gms.common.internal.r.a(i10 >= 5);
        this.f81091i.d(i10);
    }

    public final synchronized void t() {
        this.f81088f.set(true);
        this.f81094l.set(true);
        this.f81093k.submit(new RunnableC9096oa0(this));
    }

    public final void u(C8135fa0 c8135fa0) {
        this.f81096n = c8135fa0;
    }

    protected final synchronized void w(int i10) {
        try {
            com.google.android.gms.common.internal.r.a(i10 > 0);
            Oc.J1 j12 = this.f81087e;
            String str = j12.f23332a;
            int i11 = j12.f23333b;
            Oc.Y1 y12 = j12.f23334c;
            if (i10 <= 0) {
                i10 = j12.f23335d;
            }
            this.f81087e = new Oc.J1(str, i11, y12, i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean x() {
        b();
        return !this.f81090h.isEmpty();
    }

    private static final Optional d(Optional optional) {
        final Class<SB> cls = SB.class;
        return optional.filter(new Predicate() { // from class: com.google.android.gms.internal.ads.pa0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((Oc.U0) obj);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.ra0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (SB) cls.cast((Oc.U0) obj);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.sa0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((SB) obj).zzk();
            }
        });
    }

    final /* synthetic */ void q(long j10, Optional optional) {
        C8135fa0 c8135fa0 = this.f81096n;
        if (c8135fa0 != null) {
            c8135fa0.b(Gc.b.a(this.f81087e.f23333b), j10, d(optional));
        }
    }

    final /* synthetic */ void r() {
        C8135fa0 c8135fa0 = this.f81096n;
        if (c8135fa0 != null) {
            c8135fa0.c(Gc.b.a(this.f81087e.f23333b), this.f81097o.a());
        }
    }

    public final void v() {
        this.f81088f.set(false);
        this.f81094l.set(false);
    }

    public AbstractC10165ya0(ClientApi clientApi, Context context, int i10, InterfaceC6756Cl interfaceC6756Cl, Oc.J1 j12, InterfaceC4383c0 interfaceC4383c0, ScheduledExecutorService scheduledExecutorService, W90 w90, com.google.android.gms.common.util.f fVar) {
        this.f81083a = clientApi;
        this.f81084b = context;
        this.f81085c = i10;
        this.f81086d = interfaceC6756Cl;
        this.f81087e = j12;
        this.f81089g = interfaceC4383c0;
        this.f81093k = scheduledExecutorService;
        this.f81091i = w90;
        this.f81097o = fVar;
    }
}
