package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzdb implements Parcelable.Creator {
    zzdb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzdc((Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdc[i10];
    }
}
