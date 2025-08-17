package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzee extends zzbi {
    public static final Parcelable.Creator<zzee> CREATOR = new zzed();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzee(LocalDate localDate, boolean z10) {
        super(localDate, z10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getDate(), i10);
        parcel.writeInt(isExceptional() ? 1 : 0);
    }
}
