package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdo extends zzau {
    public static final Parcelable.Creator<zzdo> CREATOR = new zzdn();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdo(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (getCompoundCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getCompoundCode());
        }
        if (getGlobalCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getGlobalCode());
        }
    }
}
