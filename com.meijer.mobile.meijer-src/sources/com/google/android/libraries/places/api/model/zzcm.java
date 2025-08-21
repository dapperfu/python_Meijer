package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzcm extends zzu {
    public static final Parcelable.Creator<zzcm> CREATOR = new zzcl();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcm(String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getEncodedPolyline());
    }
}
