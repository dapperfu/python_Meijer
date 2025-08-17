package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzxm extends zzwj {
    final /* synthetic */ boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzvr zzc;
    final /* synthetic */ zzaca zzd;
    final /* synthetic */ zzxn zze;
    private volatile zzwj zzf;

    zzxm(zzxn zzxnVar, boolean z10, boolean z11, zzvr zzvrVar, zzaca zzacaVar) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = zzvrVar;
        this.zzd = zzacaVar;
        this.zze = zzxnVar;
    }

    private final zzwj zza() {
        zzwj zzwjVar = this.zzf;
        if (zzwjVar != null) {
            return zzwjVar;
        }
        zzwj zzwjVarZzb = this.zzc.zzb(this.zze, this.zzd);
        this.zzf = zzwjVarZzb;
        return zzwjVarZzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final Object read(zzacc zzaccVar) throws IOException {
        if (!this.zza) {
            return zza().read(zzaccVar);
        }
        zzaccVar.zzo();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, Object obj) throws IOException {
        if (this.zzb) {
            zzaceVar.zzg();
        } else {
            zza().write(zzaceVar, obj);
        }
    }
}
