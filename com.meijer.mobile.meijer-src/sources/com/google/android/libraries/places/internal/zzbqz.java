package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class zzbqz extends zzbgo {
    private final zzbhb zza;
    private final zzbfe zzb;
    private final Executor zzc;
    private final zzbiu zzd;
    private final zzbgd zze;
    private zzbfd zzf;
    private zzbfi zzg;

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbjk
    protected final zzbfi zzf() {
        return this.zzg;
    }

    final /* synthetic */ zzbgd zzg() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        zzbfd zzbfdVar = this.zzf;
        zzbhs zzbhsVar = zzbrx.zzi;
        zzbiu zzbiuVar = this.zzd;
        zzbha zzbhaVarZza = this.zza.zza(new zzbtq(zzbiuVar, zzbipVar, zzbfdVar, zzbhsVar));
        zzbjv zzbjvVarZza = zzbhaVarZza.zza();
        if (!zzbjvVarZza.zzj()) {
            this.zzc.execute(new zzbqy(this, zzbfhVar, zzbpf.zzi(zzbjvVarZza)));
            this.zzg = zzbrx.zzaj;
        } else {
            zzbsf zzbsfVarZze = ((zzbsh) zzbhaVarZza.zzb()).zze(zzbiuVar);
            if (zzbsfVarZze != null) {
                this.zzf = this.zzf.zzh(zzbsf.zza, zzbsfVarZze);
            }
            zzbfi zzbfiVarZza = this.zzb.zza(zzbiuVar, this.zzf);
            this.zzg = zzbfiVarZza;
            zzbfiVarZza.zza(zzbfhVar, zzbipVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjk, com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th2) {
        zzbfi zzbfiVar = this.zzg;
        if (zzbfiVar != null) {
            zzbfiVar.zze(str, th2);
        }
    }

    zzbqz(zzbhb zzbhbVar, zzbfe zzbfeVar, Executor executor, zzbiu zzbiuVar, zzbfd zzbfdVar) {
        this.zza = zzbhbVar;
        this.zzb = zzbfeVar;
        this.zzd = zzbiuVar;
        executor = zzbfdVar.zzj() != null ? zzbfdVar.zzj() : executor;
        this.zzc = executor;
        this.zzf = zzbfdVar.zze(executor);
        this.zze = zzbgd.zza();
    }
}
