package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import j$.time.Instant;

/* loaded from: classes6.dex */
public abstract class FuelPrice implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract FuelPrice build();

        @RecentlyNonNull
        public abstract Builder setPrice(@RecentlyNonNull Money money);

        @RecentlyNonNull
        public abstract Builder setType(@RecentlyNonNull FuelType fuelType);

        @RecentlyNonNull
        public abstract Builder setUpdateTime(@RecentlyNonNull Instant instant);
    }

    @RecentlyNonNull
    public abstract Money getPrice();

    @RecentlyNonNull
    public abstract FuelType getType();

    @RecentlyNonNull
    public abstract Instant getUpdateTime();

    public enum FuelType implements Parcelable {
        FUEL_TYPE_UNSPECIFIED,
        DIESEL,
        REGULAR_UNLEADED,
        MIDGRADE,
        PREMIUM,
        SP91,
        SP91_E10,
        SP92,
        SP95,
        SP95_E10,
        SP98,
        SP99,
        SP100,
        LPG,
        E80,
        E85,
        METHANE,
        BIO_DIESEL,
        TRUCK_DIESEL;


        @RecentlyNonNull
        public static final Parcelable.Creator<FuelType> CREATOR = new zzen();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static FuelPrice newInstance(@RecentlyNonNull FuelType fuelType, @RecentlyNonNull Money money, @RecentlyNonNull Instant instant) {
        zzx zzxVar = new zzx();
        zzxVar.setType(fuelType);
        zzxVar.setPrice(money);
        zzxVar.setUpdateTime(instant);
        return zzxVar.build();
    }
}
