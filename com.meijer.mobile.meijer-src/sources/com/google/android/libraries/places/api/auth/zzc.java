package com.google.android.libraries.places.api.auth;

/* loaded from: classes6.dex */
final class zzc extends zza {
    private boolean zza;
    private String zzb;
    private String zzc;
    private byte zzd;

    zzc() {
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zza zza(boolean z10) {
        this.zza = z10;
        this.zzd = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zza zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zza zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zzb zzd() {
        if (this.zzd == 1) {
            return new zzd(this.zza, this.zzb, this.zzc, null);
        }
        throw new IllegalStateException("Missing required properties: appCheckEnabled");
    }
}
