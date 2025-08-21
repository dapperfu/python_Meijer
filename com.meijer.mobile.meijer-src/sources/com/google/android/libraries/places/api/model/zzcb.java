package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzcb implements Parcelable.Creator {
    zzcb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzcc((ParcelUuid) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcc[i10];
    }
}
