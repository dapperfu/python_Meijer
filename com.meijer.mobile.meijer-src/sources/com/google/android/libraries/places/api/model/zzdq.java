package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdq extends zzaw {
    public static final Parcelable.Creator<zzdq> CREATOR = new zzdp();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdq(Money money, Money money2) {
        super(money, money2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(zza(), i10);
        parcel.writeParcelable(zzb(), i10);
    }
}
