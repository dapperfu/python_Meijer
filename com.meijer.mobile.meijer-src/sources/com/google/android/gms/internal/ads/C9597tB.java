package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9597tB implements ZB, LF, InterfaceC10245zE, InterfaceC9279qC, InterfaceC9952wb {

    /* renamed from: a, reason: collision with root package name */
    private final C9492sC f79343a;

    /* renamed from: b, reason: collision with root package name */
    private final Z50 f79344b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f79345c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f79346d;

    /* renamed from: f, reason: collision with root package name */
    private ScheduledFuture f79348f;

    /* renamed from: h, reason: collision with root package name */
    private final String f79350h;

    /* renamed from: e, reason: collision with root package name */
    private final C8369hk0 f79347e = C8369hk0.D();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f79349g = new AtomicBoolean();

    final /* synthetic */ void i() {
        synchronized (this) {
            try {
                if (this.f79347e.isDone()) {
                    return;
                }
                this.f79347e.g(Boolean.TRUE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9279qC
    public final synchronized void j(Oc.W0 w02) {
        try {
            if (this.f79347e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f79348f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f79347e.h(new Exception());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6963Io interfaceC6963Io, String str, String str2) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC10245zE
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10245zE
    public final synchronized void zzj() {
        try {
            if (this.f79347e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f79348f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f79347e.g(Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzl() {
    }

    private final boolean q() {
        return this.f79350h.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final void C0(C9845vb c9845vb) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77325qb)).booleanValue() && q() && c9845vb.f79930j && this.f79349g.compareAndSet(false, true) && this.f79344b.f72869e != 3) {
            Rc.p0.k("Full screen 1px impression occurred");
            this.f79343a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() {
        Z50 z50 = this.f79344b;
        if (z50.f72869e == 3) {
            return;
        }
        int i10 = z50.f72859Y;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77325qb)).booleanValue() && q()) {
                return;
            }
            this.f79343a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzk() {
        if (this.f79344b.f72869e == 3) {
            return;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76784E1)).booleanValue()) {
            Z50 z50 = this.f79344b;
            if (z50.f72859Y == 2) {
                if (z50.f72893q == 0) {
                    this.f79343a.zza();
                } else {
                    Mj0.r(this.f79347e, new C9490sB(this), this.f79346d);
                    this.f79348f = this.f79345c.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.rB
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f78798a.i();
                        }
                    }, this.f79344b.f72893q, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    C9597tB(C9492sC c9492sC, Z50 z50, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f79343a = c9492sC;
        this.f79344b = z50;
        this.f79345c = scheduledExecutorService;
        this.f79346d = executor;
        this.f79350h = str;
    }
}
