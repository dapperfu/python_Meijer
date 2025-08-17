package com.google.android.libraries.places.api.model;

import Be.p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;

/* loaded from: classes6.dex */
final class zzeq implements Parcelable.Creator {
    zzeq() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new OpeningHours.HoursType[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return OpeningHours.HoursType.valueOf((String) p.q(parcel.readString()));
    }
}
