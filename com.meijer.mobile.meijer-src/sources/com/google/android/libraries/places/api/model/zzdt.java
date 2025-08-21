package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdt implements Parcelable.Creator {
    zzdt() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzdu(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, Double.valueOf(parcel.readDouble()), (AuthorAttribution) parcel.readParcelable(Review.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(Review.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdu[i10];
    }
}
