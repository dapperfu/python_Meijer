package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbs extends zze {
    public static final Parcelable.Creator<zzbs> CREATOR = new zzbr();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzbs(List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(asList());
    }
}
