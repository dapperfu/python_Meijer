package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzcy extends zzaf {
    public static final Parcelable.Creator<zzcy> CREATOR = new zzcx();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcy(String str, Long l10, Integer num) {
        super(str, l10, num);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getCurrencyCode());
        parcel.writeLong(getUnits().longValue());
        parcel.writeInt(getNanos().intValue());
    }
}
