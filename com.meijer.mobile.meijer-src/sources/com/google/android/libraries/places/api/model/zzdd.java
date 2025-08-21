package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzdd implements Parcelable.Creator {
    zzdd() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzde((Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzde[i10];
    }
}
