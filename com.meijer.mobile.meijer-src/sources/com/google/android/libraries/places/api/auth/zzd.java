package com.google.android.libraries.places.api.auth;

/* loaded from: classes6.dex */
final class zzd extends zzb {
    private final boolean zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzd(boolean z10, String str, String str2, byte[] bArr) {
        this.zzb = z10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.zzb == zzbVar.zza() && ((str = this.zzc) != null ? str.equals(zzbVar.zzb()) : zzbVar.zzb() == null) && ((str2 = this.zzd) != null ? str2.equals(zzbVar.zzc()) : zzbVar.zzc() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final boolean zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final String zzc() {
        return this.zzd;
    }

    public final int hashCode() {
        String str = this.zzc;
        int iHashCode = (str == null ? 0 : str.hashCode()) ^ (((true != this.zzb ? 1237 : 1231) ^ 1000003) * 1000003);
        String str2 = this.zzd;
        return (iHashCode * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        boolean z10 = this.zzb;
        int length = String.valueOf(z10).length();
        String str = this.zzc;
        int length2 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 26 + String.valueOf(str2).length() + 1);
        sb2.append("AppCheckResult{appCheckEnabled=");
        sb2.append(z10);
        sb2.append(", appCheckToken=");
        sb2.append(str);
        sb2.append(", appCheckTokenFetchError=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
