package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdh implements Parcelable.Creator {
    zzdh() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzdi(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (AuthorAttributions) parcel.readParcelable(PhotoMetadata.class.getClassLoader()), (Uri) parcel.readParcelable(PhotoMetadata.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdi[i10];
    }
}
