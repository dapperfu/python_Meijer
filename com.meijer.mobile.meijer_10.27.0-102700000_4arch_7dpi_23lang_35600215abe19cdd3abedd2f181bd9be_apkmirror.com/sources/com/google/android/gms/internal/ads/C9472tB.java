package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9472tB implements ZB, LF, InterfaceC10120zE, InterfaceC9154qC, InterfaceC9827wb {

    /* renamed from: a, reason: collision with root package name */
    private final C9367sC f78503a;

    /* renamed from: b, reason: collision with root package name */
    private final Z50 f78504b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f78505c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f78506d;

    /* renamed from: f, reason: collision with root package name */
    private ScheduledFuture f78508f;

    /* renamed from: h, reason: collision with root package name */
    private final String f78510h;

    /* renamed from: e, reason: collision with root package name */
    private final C8244hk0 f78507e = C8244hk0.D();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f78509g = new AtomicBoolean();

    final /* synthetic */ void i() {
        synchronized (this) {
            try {
                if (this.f78507e.isDone()) {
                    return;
                }
                this.f78507e.g(Boolean.TRUE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9154qC
    public final synchronized void j(Mc.W0 w02) {
        try {
            if (this.f78507e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f78508f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f78507e.h(new Exception());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6838Io interfaceC6838Io, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10120zE
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10120zE
    public final synchronized void zzj() {
        try {
            if (this.f78507e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f78508f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f78507e.g(Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzl() {
    }

    private final boolean q() {
        return this.f78510h.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final void D0(C9720vb c9720vb) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76485qb)).booleanValue() && q() && c9720vb.f79090j && this.f78509g.compareAndSet(false, true) && this.f78504b.f72029e != 3) {
            Pc.p0.k("Full screen 1px impression occurred");
            this.f78503a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() {
        Z50 z50 = this.f78504b;
        if (z50.f72029e == 3) {
            return;
        }
        int i10 = z50.f72019Y;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76485qb)).booleanValue() && q()) {
                return;
            }
            this.f78503a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzk() {
        if (this.f78504b.f72029e == 3) {
            return;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f75944E1)).booleanValue()) {
            Z50 z50 = this.f78504b;
            if (z50.f72019Y == 2) {
                if (z50.f72053q == 0) {
                    this.f78503a.zza();
                } else {
                    Mj0.r(this.f78507e, new C9365sB(this), this.f78506d);
                    this.f78508f = this.f78505c.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.rB
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f77958a.i();
                        }
                    }, this.f78504b.f72053q, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    C9472tB(C9367sC c9367sC, Z50 z50, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f78503a = c9367sC;
        this.f78504b = z50;
        this.f78505c = scheduledExecutorService;
        this.f78506d = executor;
        this.f78510h = str;
    }
}
