package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
final class zzds extends zzay {
    public static final Parcelable.Creator<zzds> CREATOR = new zzdr();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzds(LatLng latLng, LatLng latLng2) {
        super(latLng, latLng2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getSouthwest(), i10);
        parcel.writeParcelable(getNortheast(), i10);
    }
}
