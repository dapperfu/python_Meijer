package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intrinsics.j(parcel, "parcel");
        return new AutocompleteUiIcon(parcel.readInt(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AutocompleteUiIcon[i10];
    }
}
