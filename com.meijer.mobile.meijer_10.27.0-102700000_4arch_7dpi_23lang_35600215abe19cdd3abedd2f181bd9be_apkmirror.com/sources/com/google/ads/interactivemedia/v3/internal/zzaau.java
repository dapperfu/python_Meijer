package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzaau implements zzwk {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzwj zzb;

    zzaau(Class cls, zzwj zzwjVar) {
        this.zza = cls;
        this.zzb = zzwjVar;
    }

    public final String toString() {
        zzwj zzwjVar = this.zzb;
        return "Factory[type=" + this.zza.getName() + ",adapter=" + zzwjVar.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        if (zzacaVar.zzc() == this.zza) {
            return this.zzb;
        }
        return null;
    }
}
