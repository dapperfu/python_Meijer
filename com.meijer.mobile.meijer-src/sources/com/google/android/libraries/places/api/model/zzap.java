package com.google.android.libraries.places.api.model;

import android.net.Uri;

/* loaded from: classes6.dex */
abstract class zzap extends PhotoMetadata {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final AuthorAttributions zzf;
    private final Uri zzg;

    public final boolean equals(Object obj) {
        String str;
        AuthorAttributions authorAttributions;
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoMetadata) {
            PhotoMetadata photoMetadata = (PhotoMetadata) obj;
            if (this.zza.equals(photoMetadata.getAttributions()) && this.zzb == photoMetadata.getHeight() && this.zzc == photoMetadata.getWidth() && this.zzd.equals(photoMetadata.zza()) && ((str = this.zze) != null ? str.equals(photoMetadata.zzb()) : photoMetadata.zzb() == null) && ((authorAttributions = this.zzf) != null ? authorAttributions.equals(photoMetadata.getAuthorAttributions()) : photoMetadata.getAuthorAttributions() == null) && ((uri = this.zzg) != null ? uri.equals(photoMetadata.zzc()) : photoMetadata.zzc() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public String getAttributions() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public AuthorAttributions getAuthorAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getWidth() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final String zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final Uri zzc() {
        return this.zzg;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd.hashCode();
        String str = this.zze;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AuthorAttributions authorAttributions = this.zzf;
        int iHashCode3 = (iHashCode2 ^ (authorAttributions == null ? 0 : authorAttributions.hashCode())) * 1000003;
        Uri uri = this.zzg;
        return iHashCode3 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.zzg;
        String strValueOf = String.valueOf(this.zzf);
        String strValueOf2 = String.valueOf(uri);
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zzc;
        int length2 = String.valueOf(i11).length();
        String str = this.zze;
        int length3 = String.valueOf(str).length();
        int length4 = strValueOf.length();
        int length5 = strValueOf2.length();
        String str2 = this.zza;
        int length6 = str2.length() + 36 + length + 8 + length2;
        String str3 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length6 + 17 + str3.length() + 7 + length3 + 21 + length4 + 17 + length5 + 1);
        sb2.append("PhotoMetadata{attributions=");
        sb2.append(str2);
        sb2.append(", height=");
        sb2.append(i10);
        sb2.append(", width=");
        sb2.append(i11);
        sb2.append(", photoReference=");
        sb2.append(str3);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", authorAttributions=");
        sb2.append(strValueOf);
        sb2.append(", flagContentUri=");
        sb2.append(strValueOf2);
        sb2.append("}");
        return sb2.toString();
    }

    zzap(String str, int i10, int i11, String str2, String str3, AuthorAttributions authorAttributions, Uri uri) {
        if (str != null) {
            this.zza = str;
            this.zzb = i10;
            this.zzc = i11;
            if (str2 != null) {
                this.zzd = str2;
                this.zze = str3;
                this.zzf = authorAttributions;
                this.zzg = uri;
                return;
            }
            throw new NullPointerException("Null photoReference");
        }
        throw new NullPointerException("Null attributions");
    }
}
