package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzeg extends zzbk {
    public static final Parcelable.Creator<zzeg> CREATOR = new zzef();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzeg(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getId());
        parcel.writeString(getName());
    }
}
