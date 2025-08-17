package com.google.android.libraries.places.api.model;

import Be.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* loaded from: classes6.dex */
public enum TypeFilter implements Parcelable {
    ADDRESS,
    CITIES,
    ESTABLISHMENT,
    GEOCODE,
    REGIONS;


    @RecentlyNonNull
    public static final Parcelable.Creator<TypeFilter> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.api.model.zzfc
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new TypeFilter[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return TypeFilter.valueOf((String) p.q(parcel.readString()));
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
