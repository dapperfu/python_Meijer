package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.FuelPrice;
import j$.time.Instant;

/* loaded from: classes6.dex */
final class zzcq extends zzy {
    public static final Parcelable.Creator<zzcq> CREATOR = new zzcp();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcq(FuelPrice.FuelType fuelType, Money money, Instant instant) {
        super(fuelType, money, instant);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getType(), i10);
        parcel.writeParcelable(getPrice(), i10);
        parcel.writeSerializable(getUpdateTime());
    }
}
