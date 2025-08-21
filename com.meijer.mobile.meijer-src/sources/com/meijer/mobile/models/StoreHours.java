package com.meijer.mobile.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class StoreHours implements Parcelable {
    public static final Parcelable.Creator<StoreHours> CREATOR = new a();
    public String dayHours;
    public String dayOfTheWeek;

    class a implements Parcelable.Creator<StoreHours> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StoreHours createFromParcel(Parcel parcel) {
            return new StoreHours(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StoreHours[] newArray(int i10) {
            return new StoreHours[i10];
        }

        a() {
        }
    }

    public StoreHours(String str, String str2) {
        this.dayOfTheWeek = str;
        this.dayHours = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("%s: %s", this.dayOfTheWeek, this.dayHours);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.dayOfTheWeek);
        parcel.writeString(this.dayHours);
    }

    public StoreHours(Parcel parcel) {
        this.dayOfTheWeek = parcel.readString();
        this.dayHours = parcel.readString();
    }
}
