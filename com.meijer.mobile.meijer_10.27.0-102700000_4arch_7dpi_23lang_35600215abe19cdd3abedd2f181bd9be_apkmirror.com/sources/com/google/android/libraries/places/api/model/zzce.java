package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
final class zzce extends zzn {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcd();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzce(LatLng latLng, double d10) {
        super(latLng, d10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getCenter(), i10);
        parcel.writeDouble(getRadius());
    }
}
