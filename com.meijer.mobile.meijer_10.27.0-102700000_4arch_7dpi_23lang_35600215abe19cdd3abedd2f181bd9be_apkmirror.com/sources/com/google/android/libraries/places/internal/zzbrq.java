package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbrq extends zzbna {
    final zzbgd zza;
    final zzbiu zzb;
    final zzbfd zzc;
    final /* synthetic */ zzbrr zzd;
    private final long zze;

    @Override // com.google.android.libraries.places.internal.zzbna
    protected final void zzg() {
        zzbrp zzbrpVar = new zzbrp(this);
        zzbkd zzbkdVar = this.zzd.zza.zze;
        zzbkdVar.zzb(zzbrpVar);
        zzbkdVar.zza();
    }

    final void zzl() {
        zzbgd zzbgdVarZzb = this.zza.zzb();
        try {
            zzbfi zzbfiVarZze = this.zzd.zze(this.zzb, this.zzc.zzh(zzbfp.zza, Long.valueOf(System.nanoTime() - this.zze)));
            this.zza.zzc(zzbgdVarZzb);
            Runnable runnableZzf = zzf(zzbfiVarZze);
            if (runnableZzf != null) {
                zzbrr zzbrrVar = this.zzd;
                zzbrrVar.zza.zzp(this.zzc).execute(new zzbro(this, runnableZzf));
            } else {
                zzbrr zzbrrVar2 = this.zzd;
                zzbrp zzbrpVar = new zzbrp(this);
                zzbkd zzbkdVar = zzbrrVar2.zza.zze;
                zzbkdVar.zzb(zzbrpVar);
                zzbkdVar.zza();
            }
        } catch (Throwable th2) {
            this.zza.zzc(zzbgdVarZzb);
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbrq(zzbrr zzbrrVar, zzbgd zzbgdVar, zzbiu zzbiuVar, zzbfd zzbfdVar) {
        super(zzbrrVar.zza.zzp(zzbfdVar), zzbrrVar.zza.zzv(), zzbfdVar.zzb());
        Objects.requireNonNull(zzbrrVar);
        this.zzd = zzbrrVar;
        this.zza = zzbgdVar;
        this.zzb = zzbiuVar;
        this.zzc = zzbfdVar;
        this.zze = System.nanoTime();
    }
}
