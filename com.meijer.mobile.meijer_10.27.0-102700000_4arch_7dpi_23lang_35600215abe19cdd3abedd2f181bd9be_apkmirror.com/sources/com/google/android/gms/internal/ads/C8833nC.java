package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.nC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8833nC extends WE implements InterfaceC7766dC {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f77011b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f77012c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f77013d;

    final /* synthetic */ void R0() {
        synchronized (this) {
            Qc.p.d("Timeout waiting for show call succeed to be called.");
            k0(new zzdgb("Timeout for show call succeed."));
            this.f77013d = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f77012c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void i(final Mc.W0 w02) {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.eC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC7766dC) obj).i(w02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void k0(final zzdgb zzdgbVar) {
        if (this.f77013d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f77012c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        K0(new VE() { // from class: com.google.android.gms.internal.ads.iC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC7766dC) obj).k0(zzdgbVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void zzb() {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.fC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC7766dC) obj).zzb();
            }
        });
    }

    public final void zzf() {
        this.f77012c = this.f77011b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.hC
            @Override // java.lang.Runnable
            public final void run() {
                this.f74632a.R0();
            }
        }, ((Integer) Mc.A.c().a(C8659lf.f75925Ca)).intValue(), TimeUnit.MILLISECONDS);
    }

    public C8833nC(C8726mC c8726mC, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f77013d = false;
        this.f77011b = scheduledExecutorService;
        super.H0(c8726mC, executor);
    }
}
