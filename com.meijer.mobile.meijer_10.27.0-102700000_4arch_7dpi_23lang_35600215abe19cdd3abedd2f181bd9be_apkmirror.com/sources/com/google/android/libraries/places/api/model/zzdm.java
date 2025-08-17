package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdm extends zzas {
    public static final Parcelable.Creator<zzdm> CREATOR = new zzdl();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdm(Place place, double d10) {
        super(place, d10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getPlace(), i10);
        parcel.writeDouble(getLikelihood());
    }
}
