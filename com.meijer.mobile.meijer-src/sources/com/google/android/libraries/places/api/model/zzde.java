package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzde extends zzal {
    public static final Parcelable.Creator<zzde> CREATOR = new zzdd();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzde(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getAcceptsCreditCards(), i10);
        parcel.writeParcelable(getAcceptsDebitCards(), i10);
        parcel.writeParcelable(getAcceptsCashOnly(), i10);
        parcel.writeParcelable(getAcceptsNfc(), i10);
    }
}
