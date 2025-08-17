package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdi extends zzap {
    public static final Parcelable.Creator<zzdi> CREATOR = new zzdh();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdi(String str, int i10, int i11, String str2, String str3, AuthorAttributions authorAttributions, Uri uri) {
        super(str, i10, i11, str2, str3, authorAttributions, uri);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getAttributions());
        parcel.writeInt(getHeight());
        parcel.writeInt(getWidth());
        parcel.writeString(zza());
        if (zzb() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzb());
        }
        parcel.writeParcelable(getAuthorAttributions(), i10);
        parcel.writeParcelable(zzc(), i10);
    }
}
