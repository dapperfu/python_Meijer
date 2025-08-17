package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;

/* loaded from: classes6.dex */
final class zzcs extends zzz {
    public static final Parcelable.Creator<zzcs> CREATOR = new zzcr();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcs(Duration duration, int i10) {
        super(duration, i10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(getDuration());
        parcel.writeInt(getDistanceMeters());
    }
}
