package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
final class zzck extends zzt {
    public static final Parcelable.Creator<zzck> CREATOR = new zzcj();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzck(Double d10, List list) {
        super(d10, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (getMinimumChargingRateKw() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getMinimumChargingRateKw().doubleValue());
        }
        parcel.writeList(getConnectorTypes());
    }
}
