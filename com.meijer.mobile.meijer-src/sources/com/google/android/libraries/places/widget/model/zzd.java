package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intrinsics.j(parcel, "parcel");
        return new AutocompleteUiCustomization(parcel.readInt() == 0 ? null : AutocompleteListDensity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? AutocompleteUiIcon.CREATOR.createFromParcel(parcel) : null, parcel.readString(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AutocompleteUiCustomization[i10];
    }
}
