package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzei extends zzbm {
    public static final Parcelable.Creator<zzei> CREATOR = new zzeh();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzei(LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10) {
        super(localDate, dayOfWeek, localTime, z10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getDate(), i10);
        parcel.writeParcelable(getDay(), i10);
        parcel.writeParcelable(getTime(), i10);
        parcel.writeInt(isTruncated() ? 1 : 0);
    }
}
