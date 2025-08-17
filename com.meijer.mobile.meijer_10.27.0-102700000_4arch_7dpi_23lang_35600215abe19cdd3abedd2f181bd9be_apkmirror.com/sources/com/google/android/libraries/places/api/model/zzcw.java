package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzcw extends zzad {
    public static final Parcelable.Creator<zzcw> CREATOR = new zzcv();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcw(int i10, int i11) {
        super(i10, i11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(getHours());
        parcel.writeInt(getMinutes());
    }
}
