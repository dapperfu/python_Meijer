package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
final class zzby extends zzj {
    public static final Parcelable.Creator<zzby> CREATOR = new zzbx();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzby(String str, Integer num, List list, List list2, String str2, String str3, String str4, List list3, List list4, List list5) {
        super(str, num, list, list2, str2, str3, str4, list3, list4, list5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getPlaceId());
        if (getDistanceMeters() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getDistanceMeters().intValue());
        }
        parcel.writeList(getPlaceTypes());
        parcel.writeList(getTypes());
        parcel.writeString(zza());
        parcel.writeString(zzb());
        parcel.writeString(zzc());
        parcel.writeList(zzd());
        parcel.writeList(zze());
        parcel.writeList(zzf());
    }
}
