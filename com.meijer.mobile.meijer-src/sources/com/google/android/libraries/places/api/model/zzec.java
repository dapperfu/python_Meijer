package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzec extends zzbg {
    public static final Parcelable.Creator<zzec> CREATOR = new zzeb();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzec(Polyline polyline) {
        super(polyline);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getPolyline(), i10);
    }
}
