package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzbu extends zzg {
    public static final Parcelable.Creator<zzbu> CREATOR = new zzbt();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzbu(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getName());
        if (getUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUri());
        }
        if (getPhotoUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPhotoUri());
        }
    }
}
