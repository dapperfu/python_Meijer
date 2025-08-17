package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* loaded from: classes6.dex */
final class zzcg extends zzp {
    public static final Parcelable.Creator<zzcg> CREATOR = new zzcf();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcg(EVConnectorType eVConnectorType, Double d10, Integer num, Integer num2, Integer num3, Instant instant) {
        super(eVConnectorType, d10, num, num2, num3, instant);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getType(), i10);
        parcel.writeDouble(getMaxChargeRateKw().doubleValue());
        parcel.writeInt(getCount().intValue());
        if (getAvailableCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getAvailableCount().intValue());
        }
        if (getOutOfServiceCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getOutOfServiceCount().intValue());
        }
        if (getAvailabilityLastUpdateTime() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(getAvailabilityLastUpdateTime());
        }
    }
}
