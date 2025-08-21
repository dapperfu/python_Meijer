package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbq extends zzd {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbp();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzbq(String str, String str2, List list) {
        super(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getName());
        if (getShortName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getShortName());
        }
        parcel.writeList(getTypes());
    }
}
