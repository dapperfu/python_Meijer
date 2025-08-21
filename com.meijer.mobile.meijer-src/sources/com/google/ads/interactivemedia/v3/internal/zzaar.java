package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzaar implements zzwk {
    zzaar() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        Class clsZzc = zzacaVar.zzc();
        if (Enum.class.isAssignableFrom(clsZzc) && clsZzc != Enum.class) {
            if (!clsZzc.isEnum()) {
                clsZzc = clsZzc.getSuperclass();
            }
            return new zzabg(clsZzc);
        }
        return null;
    }
}
