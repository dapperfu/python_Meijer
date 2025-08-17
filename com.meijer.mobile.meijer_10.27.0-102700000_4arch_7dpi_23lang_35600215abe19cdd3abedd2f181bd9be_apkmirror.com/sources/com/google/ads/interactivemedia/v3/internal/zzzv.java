package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzzv<T> extends zzzr<T> {
    final zzvr zza;
    private final zzwd zzb;
    private final zzvv zzc;
    private final zzaca zzd;
    private final zzwk zze;
    private final zzzt zzf = new zzzt(this, null);
    private final boolean zzg;
    private volatile zzwj zzh;

    public zzzv(zzwd zzwdVar, zzvv zzvvVar, zzvr zzvrVar, zzaca zzacaVar, zzwk zzwkVar, boolean z10) {
        this.zzb = zzwdVar;
        this.zzc = zzvvVar;
        this.zza = zzvrVar;
        this.zzd = zzacaVar;
        this.zze = zzwkVar;
        this.zzg = z10;
    }

    private final zzwj zzc() {
        zzwj zzwjVar = this.zzh;
        if (zzwjVar != null) {
            return zzwjVar;
        }
        zzwj zzwjVarZzb = this.zza.zzb(this.zze, this.zzd);
        this.zzh = zzwjVarZzb;
        return zzwjVarZzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final T read(zzacc zzaccVar) throws zzwa, IOException {
        if (this.zzc == null) {
            return (T) zzc().read(zzaccVar);
        }
        zzvw zzvwVarZza = zzyg.zza(zzaccVar);
        if (this.zzg && (zzvwVarZza instanceof zzvy)) {
            return null;
        }
        zzvv zzvvVar = this.zzc;
        this.zzd.zzd();
        return (T) zzvvVar.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, T t10) throws IOException {
        zzwd zzwdVar = this.zzb;
        if (zzwdVar == null) {
            zzc().write(zzaceVar, t10);
            return;
        }
        if (this.zzg && t10 == null) {
            zzaceVar.zzg();
            return;
        }
        zzaca zzacaVar = this.zzd;
        ((zzaaq) zzabh.zzV).write(zzaceVar, zzwdVar.zza(t10, zzacaVar.zzd(), this.zzf));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzr
    public final zzwj zza() {
        return this.zzb != null ? this : zzc();
    }

    public static zzwk zzb(zzaca zzacaVar, Object obj) {
        boolean z10;
        if (zzacaVar.zzd() == zzacaVar.zzc()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new zzzu(obj, zzacaVar, z10, null);
    }
}
