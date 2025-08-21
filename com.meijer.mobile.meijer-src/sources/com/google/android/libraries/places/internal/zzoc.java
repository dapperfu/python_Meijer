package com.google.android.libraries.places.internal;

import De.p;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public enum zzoc implements Parcelable {
    FRAGMENT,
    INTENT;

    public static final Parcelable.Creator<zzoc> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.zzob
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new zzoc[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (zzoc) Enum.valueOf(zzoc.class, (String) p.q(parcel.readString()));
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
