package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzdc extends zzaj {
    public static final Parcelable.Creator<zzdc> CREATOR = new zzdb();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getFreeParkingLot(), i10);
        parcel.writeParcelable(getPaidParkingLot(), i10);
        parcel.writeParcelable(getFreeStreetParking(), i10);
        parcel.writeParcelable(getPaidStreetParking(), i10);
        parcel.writeParcelable(getValetParking(), i10);
        parcel.writeParcelable(getFreeGarageParking(), i10);
        parcel.writeParcelable(getPaidGarageParking(), i10);
    }
}
