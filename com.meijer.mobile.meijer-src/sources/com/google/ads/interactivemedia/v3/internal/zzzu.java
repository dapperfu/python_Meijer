package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzzu implements zzwk {
    private final zzaca zza;
    private final boolean zzb;
    private final zzwd zzc;
    private final zzvv zzd;

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        if (this.zza.equals(zzacaVar) || (this.zzb && this.zza.zzd() == zzacaVar.zzc())) {
            return new zzzv(this.zzc, this.zzd, zzvrVar, zzacaVar, this, true);
        }
        return null;
    }

    zzzu(Object obj, zzaca zzacaVar, boolean z10, Class cls) {
        zzwd zzwdVar;
        if (obj instanceof zzwd) {
            zzwdVar = (zzwd) obj;
        } else {
            zzwdVar = null;
        }
        this.zzc = zzwdVar;
        zzvv zzvvVar = obj instanceof zzvv ? (zzvv) obj : null;
        this.zzd = zzvvVar;
        boolean z11 = true;
        if (zzwdVar == null && zzvvVar == null) {
            z11 = false;
        }
        zzwn.zza(z11);
        this.zza = zzacaVar;
        this.zzb = z10;
    }
}
