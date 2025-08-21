package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzaay implements zzwk {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzwj zzb;

    zzaay(Class cls, zzwj zzwjVar) {
        this.zza = cls;
        this.zzb = zzwjVar;
    }

    public final String toString() {
        zzwj zzwjVar = this.zzb;
        return "Factory[typeHierarchy=" + this.zza.getName() + ",adapter=" + zzwjVar.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        Class cls = this.zza;
        Class<?> clsZzc = zzacaVar.zzc();
        if (cls.isAssignableFrom(clsZzc)) {
            return new zzaax(this, clsZzc);
        }
        return null;
    }
}
