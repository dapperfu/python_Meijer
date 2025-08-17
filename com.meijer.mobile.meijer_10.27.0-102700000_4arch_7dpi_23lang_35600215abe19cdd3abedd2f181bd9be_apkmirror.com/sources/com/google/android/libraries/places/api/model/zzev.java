package com.google.android.libraries.places.api.model;

import Be.p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzev implements Parcelable.Creator {
    zzev() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Place.Field[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Place.Field.valueOf((String) p.q(parcel.readString()));
    }
}
