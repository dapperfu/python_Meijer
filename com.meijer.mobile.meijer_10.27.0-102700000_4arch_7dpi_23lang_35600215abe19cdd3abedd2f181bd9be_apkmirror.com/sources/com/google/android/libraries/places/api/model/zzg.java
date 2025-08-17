package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzg extends AuthorAttribution {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AuthorAttribution) {
            AuthorAttribution authorAttribution = (AuthorAttribution) obj;
            if (this.zza.equals(authorAttribution.getName()) && ((str = this.zzb) != null ? str.equals(authorAttribution.getUri()) : authorAttribution.getUri() == null) && ((str2 = this.zzc) != null ? str2.equals(authorAttribution.getPhotoUri()) : authorAttribution.getPhotoUri() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final String getPhotoUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final String getUri() {
        return this.zzb;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzc;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        StringBuilder sb2 = new StringBuilder(str3.length() + 29 + length + 11 + length2 + 1);
        sb2.append("AuthorAttribution{name=");
        sb2.append(str3);
        sb2.append(", uri=");
        sb2.append(str);
        sb2.append(", photoUri=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    zzg(String str, String str2, String str3) {
        if (str != null) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            return;
        }
        throw new NullPointerException("Null name");
    }
}
