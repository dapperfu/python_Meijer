package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdw extends zzbc {
    public static final Parcelable.Creator<zzdw> CREATOR = new zzdv();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdw(boolean z10, boolean z11, boolean z12, boolean z13) {
        super(z10, z11, z12, z13);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(isTollAvoided() ? 1 : 0);
        parcel.writeInt(isHighwayAvoided() ? 1 : 0);
        parcel.writeInt(isFerryAvoided() ? 1 : 0);
        parcel.writeInt(isIndoorAvoided() ? 1 : 0);
    }
}
