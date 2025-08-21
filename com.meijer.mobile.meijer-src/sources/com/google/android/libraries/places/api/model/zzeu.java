package com.google.android.libraries.places.api.model;

import De.p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzeu implements Parcelable.Creator {
    zzeu() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Place.BusinessStatus[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Place.BusinessStatus.valueOf((String) p.q(parcel.readString()));
    }
}
