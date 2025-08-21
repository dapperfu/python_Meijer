package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* loaded from: classes6.dex */
final class zzcf implements Parcelable.Creator {
    zzcf() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzcg((EVConnectorType) parcel.readParcelable(ConnectorAggregation.class.getClassLoader()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcg[i10];
    }
}
