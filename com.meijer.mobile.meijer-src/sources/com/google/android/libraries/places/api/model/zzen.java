package com.google.android.libraries.places.api.model;

import De.p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.FuelPrice;

/* loaded from: classes6.dex */
final class zzen implements Parcelable.Creator {
    zzen() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FuelPrice.FuelType[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return FuelPrice.FuelType.valueOf((String) p.q(parcel.readString()));
    }
}
