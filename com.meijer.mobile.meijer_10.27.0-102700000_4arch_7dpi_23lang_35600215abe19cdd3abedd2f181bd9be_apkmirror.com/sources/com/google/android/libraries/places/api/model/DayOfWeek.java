package com.google.android.libraries.places.api.model;

import Be.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public enum DayOfWeek implements Parcelable {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    @RecentlyNonNull
    public static final Parcelable.Creator<DayOfWeek> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.api.model.zzel
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
            return DayOfWeek.valueOf((String) p.q(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new DayOfWeek[i10];
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
