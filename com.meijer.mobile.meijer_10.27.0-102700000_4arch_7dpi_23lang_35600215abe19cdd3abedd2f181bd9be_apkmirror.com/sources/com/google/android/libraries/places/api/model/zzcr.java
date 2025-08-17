package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;

/* loaded from: classes6.dex */
final class zzcr implements Parcelable.Creator {
    zzcr() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzcs((Duration) parcel.readSerializable(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcs[i10];
    }
}
