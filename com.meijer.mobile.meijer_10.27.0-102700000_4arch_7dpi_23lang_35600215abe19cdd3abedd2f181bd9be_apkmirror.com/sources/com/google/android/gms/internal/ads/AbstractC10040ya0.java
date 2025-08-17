package com.google.android.gms.internal.ads;

import Mc.InterfaceC4105c0;
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
public abstract class AbstractC10040ya0 {

    /* renamed from: a, reason: collision with root package name */
    protected final ClientApi f80243a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f80244b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f80245c;

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC6631Cl f80246d;

    /* renamed from: e, reason: collision with root package name */
    protected Mc.J1 f80247e;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4105c0 f80249g;

    /* renamed from: i, reason: collision with root package name */
    private final W90 f80251i;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f80253k;

    /* renamed from: n, reason: collision with root package name */
    private C8010fa0 f80256n;

    /* renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f80257o;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentLinkedQueue f80250h = new ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    protected final AtomicBoolean f80248f = new AtomicBoolean(true);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f80252j = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f80254l = new AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f80255m = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void A(Object obj) {
        try {
            this.f80252j.set(false);
            if (obj != null) {
                this.f80251i.c();
                this.f80255m.set(true);
                y(obj);
            }
            c(obj == null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void B() {
        if (this.f80254l.get()) {
            try {
                this.f80249g.p4(this.f80247e);
            } catch (RemoteException unused) {
                Qc.p.g("Failed to call onAdsAvailable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void C() {
        if (this.f80254l.get()) {
            try {
                this.f80249g.r1(this.f80247e);
            } catch (RemoteException unused) {
                Qc.p.g("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void D() {
        if (this.f80255m.get() && this.f80250h.isEmpty()) {
            this.f80255m.set(false);
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.va0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79080a.C();
                }
            });
            this.f80253k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wa0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79498a.r();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a(Mc.W0 w02) {
        this.f80252j.set(false);
        int i10 = w02.f19159a;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            c(true);
            return;
        }
        Mc.J1 j12 = this.f80247e;
        Qc.p.f("Preloading " + j12.f19146b + ", for adUnitId:" + j12.f19145a + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.f80248f.set(false);
    }

    private final synchronized void b() {
        Iterator it = this.f80250h.iterator();
        while (it.hasNext()) {
            if (((C8864na0) it.next()).c()) {
                it.remove();
            }
        }
    }

    private final synchronized void c(boolean z10) {
        try {
            if (this.f80251i.e()) {
                return;
            }
            if (z10) {
                this.f80251i.b();
            }
            this.f80253k.schedule(new RunnableC8971oa0(this), this.f80251i.a(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void y(Object obj) {
        C8864na0 c8864na0 = new C8864na0(obj, this.f80257o);
        this.f80250h.add(c8864na0);
        com.google.android.gms.common.util.f fVar = this.f80257o;
        final Optional optionalF = f(obj);
        final long jA = fVar.a();
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ta0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78596a.B();
            }
        });
        this.f80253k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78878a.q(jA, optionalF);
            }
        });
        this.f80253k.schedule(new RunnableC8971oa0(this), c8864na0.a(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void z(Throwable th2) {
        try {
            this.f80252j.set(false);
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

    public final synchronized AbstractC10040ya0 g() {
        this.f80253k.submit(new RunnableC8971oa0(this));
        return this;
    }

    protected final synchronized Object h() {
        C8864na0 c8864na0 = (C8864na0) this.f80250h.peek();
        if (c8864na0 == null) {
            return null;
        }
        return c8864na0.b();
    }

    public final synchronized Object i() {
        this.f80251i.c();
        C8864na0 c8864na0 = (C8864na0) this.f80250h.poll();
        this.f80255m.set(c8864na0 != null);
        p();
        if (c8864na0 == null) {
            return null;
        }
        return c8864na0.b();
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
        if (!this.f80252j.get() && this.f80248f.get() && this.f80250h.size() < this.f80247e.f19148d) {
            this.f80252j.set(true);
            Mj0.r(e(), new C9933xa0(this), this.f80253k);
        }
    }

    public final synchronized void s(int i10) {
        com.google.android.gms.common.internal.r.a(i10 >= 5);
        this.f80251i.d(i10);
    }

    public final synchronized void t() {
        this.f80248f.set(true);
        this.f80254l.set(true);
        this.f80253k.submit(new RunnableC8971oa0(this));
    }

    public final void u(C8010fa0 c8010fa0) {
        this.f80256n = c8010fa0;
    }

    protected final synchronized void w(int i10) {
        try {
            com.google.android.gms.common.internal.r.a(i10 > 0);
            Mc.J1 j12 = this.f80247e;
            String str = j12.f19145a;
            int i11 = j12.f19146b;
            Mc.Y1 y12 = j12.f19147c;
            if (i10 <= 0) {
                i10 = j12.f19148d;
            }
            this.f80247e = new Mc.J1(str, i11, y12, i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean x() {
        b();
        return !this.f80250h.isEmpty();
    }

    private static final Optional d(Optional optional) {
        final Class<SB> cls = SB.class;
        return optional.filter(new Predicate() { // from class: com.google.android.gms.internal.ads.pa0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((Mc.U0) obj);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.ra0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (SB) cls.cast((Mc.U0) obj);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.sa0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((SB) obj).zzk();
            }
        });
    }

    final /* synthetic */ void q(long j10, Optional optional) {
        C8010fa0 c8010fa0 = this.f80256n;
        if (c8010fa0 != null) {
            c8010fa0.b(Ec.b.a(this.f80247e.f19146b), j10, d(optional));
        }
    }

    final /* synthetic */ void r() {
        C8010fa0 c8010fa0 = this.f80256n;
        if (c8010fa0 != null) {
            c8010fa0.c(Ec.b.a(this.f80247e.f19146b), this.f80257o.a());
        }
    }

    public final void v() {
        this.f80248f.set(false);
        this.f80254l.set(false);
    }

    public AbstractC10040ya0(ClientApi clientApi, Context context, int i10, InterfaceC6631Cl interfaceC6631Cl, Mc.J1 j12, InterfaceC4105c0 interfaceC4105c0, ScheduledExecutorService scheduledExecutorService, W90 w90, com.google.android.gms.common.util.f fVar) {
        this.f80243a = clientApi;
        this.f80244b = context;
        this.f80245c = i10;
        this.f80246d = interfaceC6631Cl;
        this.f80247e = j12;
        this.f80249g = interfaceC4105c0;
        this.f80253k = scheduledExecutorService;
        this.f80251i = w90;
        this.f80257o = fVar;
    }
}
