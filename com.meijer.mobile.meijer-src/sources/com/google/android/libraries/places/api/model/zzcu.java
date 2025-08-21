package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzcu extends zzab {
    public static final Parcelable.Creator<zzcu> CREATOR = new zzct();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcu(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(getYear());
        parcel.writeInt(getMonth());
        parcel.writeInt(getDay());
    }
}
