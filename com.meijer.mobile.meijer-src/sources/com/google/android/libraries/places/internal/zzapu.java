package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzapu extends zzbfh {
    boolean zza;
    final /* synthetic */ zzapy zzb;
    private final zzbfh zzc;

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(final zzbip zzbipVar) {
        this.zzb.zzq().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(zzbipVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(final Object obj) {
        this.zzb.zzq().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(obj);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(final zzbjv zzbjvVar, final zzbip zzbipVar) {
        this.zzb.zzq().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzbjvVar, zzbipVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzd() {
        this.zzb.zzq().execute(new Runnable() { // from class: com.google.android.libraries.places.internal.zzaps
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh();
            }
        });
    }

    final /* synthetic */ void zze(zzbip zzbipVar) {
        if (this.zza) {
            return;
        }
        this.zzc.zza(zzbipVar);
    }

    final /* synthetic */ void zzf(Object obj) {
        if (this.zza) {
            return;
        }
        this.zzc.zzb(obj);
    }

    final /* synthetic */ void zzg(zzbjv zzbjvVar, zzbip zzbipVar) {
        if (this.zza) {
            return;
        }
        try {
            this.zzc.zzc(zzbjvVar, zzbipVar);
        } finally {
            this.zza = true;
            this.zzb.zzs().zza();
        }
    }

    final /* synthetic */ void zzh() {
        if (this.zza) {
            return;
        }
        this.zzc.zzd();
    }

    zzapu(zzapy zzapyVar, zzbfh zzbfhVar) {
        Objects.requireNonNull(zzapyVar);
        this.zzb = zzapyVar;
        this.zza = false;
        this.zzc = zzbfhVar;
    }
}
