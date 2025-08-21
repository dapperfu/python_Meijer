package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzed implements Parcelable.Creator {
    zzed() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzee((LocalDate) parcel.readParcelable(SpecialDay.class.getClassLoader()), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzee[i10];
    }
}
