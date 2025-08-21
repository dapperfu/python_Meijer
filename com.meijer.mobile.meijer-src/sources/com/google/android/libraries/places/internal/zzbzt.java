package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbzt {
    private final zzbzr zza;
    private final zzbyo zzb;

    public final zzbzr zza() {
        return this.zza;
    }

    public final zzbyo zzb() {
        return this.zzb;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Request{url=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    /* synthetic */ zzbzt(zzbzs zzbzsVar, byte[] bArr) {
        this.zza = zzbzsVar.zzd();
        this.zzb = zzbzsVar.zze().zzb();
    }
}
