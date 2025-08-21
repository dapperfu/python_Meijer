package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
final class zzci extends zzr {
    public static final Parcelable.Creator<zzci> CREATOR = new zzch();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzci(Integer num, List list) {
        super(num, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(getConnectorCount().intValue());
        parcel.writeList(getConnectorAggregations());
    }
}
