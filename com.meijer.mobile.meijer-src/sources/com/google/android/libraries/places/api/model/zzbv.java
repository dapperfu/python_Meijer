package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzbv implements Parcelable.Creator {
    zzbv() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzbw(parcel.readArrayList(AuthorAttributions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbw[i10];
    }
}
