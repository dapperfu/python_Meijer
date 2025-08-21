package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzi implements Parcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzh();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzi(String photoUri, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.j(photoUri, "photoUri");
        this.zza = photoUri;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return Intrinsics.e(this.zza, zziVar.zza) && Intrinsics.e(this.zzb, zziVar.zzb) && Intrinsics.e(this.zzc, zziVar.zzc) && Intrinsics.e(this.zzd, zziVar.zzd) && Intrinsics.e(this.zze, zziVar.zze) && Intrinsics.e(this.zzf, zziVar.zzf);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzd;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zze;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zzf;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        String str6 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 43 + length2 + 17 + length3 + 18 + length4 + 15 + length5 + 17 + String.valueOf(str6).length() + 1);
        sb2.append("PhotoPageData(photoUri=");
        sb2.append(str);
        sb2.append(", photoThumbnailUri=");
        sb2.append(str2);
        sb2.append(", reportPhotoUri=");
        sb2.append(str3);
        sb2.append(", userDisplayName=");
        sb2.append(str4);
        sb2.append(", userImageUri=");
        sb2.append(str5);
        sb2.append(", userProfileUri=");
        sb2.append(str6);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.zza);
        dest.writeString(this.zzb);
        dest.writeString(this.zzc);
        dest.writeString(this.zzd);
        dest.writeString(this.zze);
        dest.writeString(this.zzf);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }
}
