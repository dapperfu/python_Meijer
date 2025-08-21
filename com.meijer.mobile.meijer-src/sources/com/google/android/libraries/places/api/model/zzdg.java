package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdg extends zzan {
    public static final Parcelable.Creator<zzdg> CREATOR = new zzdf();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdg(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        super(timeOfWeek, timeOfWeek2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getOpen(), i10);
        parcel.writeParcelable(getClose(), i10);
    }
}
