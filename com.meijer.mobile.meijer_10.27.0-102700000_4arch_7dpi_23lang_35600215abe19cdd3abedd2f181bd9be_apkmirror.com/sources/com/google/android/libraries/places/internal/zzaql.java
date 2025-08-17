package com.google.android.libraries.places.internal;

import Be.p;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class zzaql extends zzbfh {
    private final zzbfh zza;
    private final zzri zzb = zzri.zza();

    private final void zzh(Runnable runnable) {
        p.q(zzrl.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        if (zzqj.zze()) {
            runnable.run();
        } else {
            zzri.zzb(this.zzb, runnable).run();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(final zzbip zzbipVar) {
        zzh(new Runnable() { // from class: com.google.android.libraries.places.internal.zzaqk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(zzbipVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(final Object obj) {
        zzh(new Runnable() { // from class: com.google.android.libraries.places.internal.zzaqi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(obj);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(final zzbjv zzbjvVar, final zzbip zzbipVar) {
        zzh(new Runnable() { // from class: com.google.android.libraries.places.internal.zzaqj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzbjvVar, zzbipVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzd() {
        final zzbfh zzbfhVar = this.zza;
        Objects.requireNonNull(zzbfhVar);
        zzh(new Runnable() { // from class: com.google.android.libraries.places.internal.zzaqh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbfhVar.zzd();
            }
        });
    }

    final /* synthetic */ void zze(zzbip zzbipVar) {
        this.zza.zza(zzbipVar);
    }

    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzb(obj);
    }

    final /* synthetic */ void zzg(zzbjv zzbjvVar, zzbip zzbipVar) {
        this.zza.zzc(zzbjvVar, zzbipVar);
    }

    public zzaql(zzbfh zzbfhVar) {
        this.zza = zzbfhVar;
    }
}
