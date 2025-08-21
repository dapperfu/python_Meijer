package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zznz implements Parcelable.Creator {
    zznz() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzoa(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzoa[i10];
    }
}
