package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.FuelPrice;
import j$.time.Instant;

/* loaded from: classes6.dex */
final class zzcp implements Parcelable.Creator {
    zzcp() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzcq((FuelPrice.FuelType) parcel.readParcelable(FuelPrice.class.getClassLoader()), (Money) parcel.readParcelable(FuelPrice.class.getClassLoader()), (Instant) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcq[i10];
    }
}
