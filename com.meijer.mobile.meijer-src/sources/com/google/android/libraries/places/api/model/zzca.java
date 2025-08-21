package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzca extends zzl {
    public static final Parcelable.Creator<zzca> CREATOR = new zzbz();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzca(int i10, int i11) {
        super(i10, i11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
    }
}
