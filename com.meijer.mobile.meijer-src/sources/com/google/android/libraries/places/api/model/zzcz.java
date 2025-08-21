package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;
import j$.time.Instant;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class zzcz implements Parcelable.Creator {
    zzcz() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        OpeningHours.HoursType hoursType = (OpeningHours.HoursType) parcel.readParcelable(OpeningHours.class.getClassLoader());
        ArrayList arrayList = parcel.readArrayList(OpeningHours.class.getClassLoader());
        ArrayList arrayList2 = parcel.readArrayList(OpeningHours.class.getClassLoader());
        ArrayList arrayList3 = parcel.readArrayList(OpeningHours.class.getClassLoader());
        if (parcel.readInt() == 0) {
            boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            boolValueOf = null;
        }
        return new zzda(hoursType, arrayList, arrayList2, arrayList3, boolValueOf, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzda[i10];
    }
}
