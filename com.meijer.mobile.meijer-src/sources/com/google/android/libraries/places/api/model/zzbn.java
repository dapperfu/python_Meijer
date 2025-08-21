package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzbn implements Parcelable.Creator {
    zzbn() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzbo((Place.BooleanPlaceAttributeValue) parcel.readParcelable(AccessibilityOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(AccessibilityOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(AccessibilityOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(AccessibilityOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbo[i10];
    }
}
