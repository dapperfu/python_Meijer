package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzaav implements zzwk {
    final /* synthetic */ Class zza;
    final /* synthetic */ Class zzb;
    final /* synthetic */ zzwj zzc;

    zzaav(Class cls, Class cls2, zzwj zzwjVar) {
        this.zza = cls;
        this.zzb = cls2;
        this.zzc = zzwjVar;
    }

    public final String toString() {
        zzwj zzwjVar = this.zzc;
        Class cls = this.zza;
        return "Factory[type=" + this.zzb.getName() + "+" + cls.getName() + ",adapter=" + zzwjVar.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        Class clsZzc = zzacaVar.zzc();
        if (clsZzc != this.zza && clsZzc != this.zzb) {
            return null;
        }
        return this.zzc;
    }
}
