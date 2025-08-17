package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzxb implements zzya {
    final /* synthetic */ Class zza;

    zzxb(zzxl zzxlVar, Class cls) {
        this.zza = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzya
    public final Object zza() {
        try {
            return zzyl.zzc.zza(this.zza);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + String.valueOf(this.zza) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }
}
