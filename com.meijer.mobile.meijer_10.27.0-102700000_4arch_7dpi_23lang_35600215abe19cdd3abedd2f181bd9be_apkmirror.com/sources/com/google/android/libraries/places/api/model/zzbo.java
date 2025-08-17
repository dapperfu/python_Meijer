package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzbo extends zzb {
    public static final Parcelable.Creator<zzbo> CREATOR = new zzbn();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzbo(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getWheelchairAccessibleParking(), i10);
        parcel.writeParcelable(getWheelchairAccessibleEntrance(), i10);
        parcel.writeParcelable(getWheelchairAccessibleRestroom(), i10);
        parcel.writeParcelable(getWheelchairAccessibleSeating(), i10);
    }
}
