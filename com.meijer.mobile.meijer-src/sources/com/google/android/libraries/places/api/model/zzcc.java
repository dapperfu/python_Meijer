package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzcc extends zzm {
    public static final Parcelable.Creator<zzcc> CREATOR = new zzcb();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzcc(ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(zza(), i10);
    }
}
