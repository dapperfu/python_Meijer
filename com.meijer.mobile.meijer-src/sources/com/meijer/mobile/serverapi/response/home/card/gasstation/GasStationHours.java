package com.meijer.mobile.serverapi.response.home.card.gasstation;

import android.os.Parcel;
import android.os.Parcelable;
import og.InterfaceC16127c;

/* loaded from: classes12.dex */
public class GasStationHours implements Parcelable {
    public static final Parcelable.Creator<GasStationHours> CREATOR = new a();

    @InterfaceC16127c("close")
    public String closeHours;

    @InterfaceC16127c("day")
    public Day dayOfWeek;

    @InterfaceC16127c("open")
    public String openHours;

    public enum Day {
        MONDAY("Mon"),
        TUESDAY("Tue"),
        WEDNESDAY("Wed"),
        THURSDAY("Thu"),
        FRIDAY("Fri"),
        SATURDAY("Sat"),
        SUNDAY("Sun");

        private String dayText;

        public String getDayText() {
            return this.dayText;
        }

        Day(String str) {
            this.dayText = str;
        }
    }

    class a implements Parcelable.Creator<GasStationHours> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GasStationHours createFromParcel(Parcel parcel) {
            return new GasStationHours(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GasStationHours[] newArray(int i10) {
            return new GasStationHours[i10];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.openHours);
        parcel.writeString(this.closeHours);
    }

    protected GasStationHours(Parcel parcel) {
        this.openHours = parcel.readString();
        this.closeHours = parcel.readString();
    }
}
