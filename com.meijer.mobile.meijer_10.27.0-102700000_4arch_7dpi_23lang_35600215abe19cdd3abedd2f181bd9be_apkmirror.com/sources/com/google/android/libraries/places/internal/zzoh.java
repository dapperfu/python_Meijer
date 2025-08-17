package com.google.android.libraries.places.internal;

import Be.p;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public enum zzoh implements Parcelable {
    PABLO,
    ONE_PLATFORM,
    JWT_AND_ONE_PLATFORM;

    public static final Parcelable.Creator<zzoh> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.zzog
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new zzoh[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (zzoh) Enum.valueOf(zzoh.class, (String) p.q(parcel.readString()));
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
