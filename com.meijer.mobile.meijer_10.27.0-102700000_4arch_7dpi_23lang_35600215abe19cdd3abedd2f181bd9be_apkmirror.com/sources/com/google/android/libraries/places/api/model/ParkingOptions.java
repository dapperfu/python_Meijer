package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
public abstract class ParkingOptions implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract ParkingOptions build();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getFreeGarageParking();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getFreeParkingLot();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getFreeStreetParking();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getPaidGarageParking();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getPaidParkingLot();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getPaidStreetParking();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getValetParking();

        @RecentlyNonNull
        public abstract Builder setFreeGarageParking(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setFreeParkingLot(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setFreeStreetParking(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setPaidGarageParking(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setPaidParkingLot(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setPaidStreetParking(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setValetParking(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getFreeGarageParking();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getFreeParkingLot();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getFreeStreetParking();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getPaidGarageParking();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getPaidParkingLot();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getPaidStreetParking();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getValetParking();

    @RecentlyNonNull
    public static Builder builder() {
        zzai zzaiVar = new zzai();
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = Place.BooleanPlaceAttributeValue.UNKNOWN;
        zzaiVar.setFreeParkingLot(booleanPlaceAttributeValue);
        zzaiVar.setPaidParkingLot(booleanPlaceAttributeValue);
        zzaiVar.setFreeStreetParking(booleanPlaceAttributeValue);
        zzaiVar.setPaidStreetParking(booleanPlaceAttributeValue);
        zzaiVar.setValetParking(booleanPlaceAttributeValue);
        zzaiVar.setFreeGarageParking(booleanPlaceAttributeValue);
        zzaiVar.setPaidGarageParking(booleanPlaceAttributeValue);
        return zzaiVar;
    }
}
