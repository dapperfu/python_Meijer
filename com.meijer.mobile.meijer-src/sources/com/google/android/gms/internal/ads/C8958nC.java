package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.nC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8958nC extends WE implements InterfaceC7891dC {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f77851b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f77852c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f77853d;

    final /* synthetic */ void R0() {
        synchronized (this) {
            Sc.p.d("Timeout waiting for show call succeed to be called.");
            k0(new zzdgb("Timeout for show call succeed."));
            this.f77853d = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f77852c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void i(final Oc.W0 w02) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.eC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC7891dC) obj).i(w02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void k0(final zzdgb zzdgbVar) {
        if (this.f77853d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f77852c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        J0(new VE() { // from class: com.google.android.gms.internal.ads.iC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC7891dC) obj).k0(zzdgbVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void zzb() {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.fC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC7891dC) obj).zzb();
            }
        });
    }

    public final void zzf() {
        this.f77852c = this.f77851b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.hC
            @Override // java.lang.Runnable
            public final void run() {
                this.f75472a.R0();
            }
        }, ((Integer) Oc.A.c().a(C8784lf.f76765Ca)).intValue(), TimeUnit.MILLISECONDS);
    }

    public C8958nC(C8851mC c8851mC, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f77853d = false;
        this.f77851b = scheduledExecutorService;
        super.G0(c8851mC, executor);
    }
}
