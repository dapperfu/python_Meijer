package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
public abstract class RoutingParameters implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract RoutingParameters build();

        @RecentlyNullable
        public abstract LatLng getOrigin();

        @RecentlyNullable
        public abstract RouteModifiers getRouteModifiers();

        @RecentlyNullable
        public abstract RoutingPreference getRoutingPreference();

        @RecentlyNullable
        public abstract TravelMode getTravelMode();

        @RecentlyNonNull
        public abstract Builder setOrigin(LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setRouteModifiers(RouteModifiers routeModifiers);

        @RecentlyNonNull
        public abstract Builder setRoutingPreference(RoutingPreference routingPreference);

        @RecentlyNonNull
        public abstract Builder setTravelMode(TravelMode travelMode);
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzbd();
    }

    @RecentlyNullable
    public abstract LatLng getOrigin();

    @RecentlyNullable
    public abstract RouteModifiers getRouteModifiers();

    @RecentlyNullable
    public abstract RoutingPreference getRoutingPreference();

    @RecentlyNullable
    public abstract TravelMode getTravelMode();

    public enum RoutingPreference implements Parcelable {
        ROUTING_PREFERENCE_UNSPECIFIED,
        TRAFFIC_UNAWARE,
        TRAFFIC_AWARE,
        TRAFFIC_AWARE_OPTIMAL;


        @RecentlyNonNull
        public static final Parcelable.Creator<RoutingPreference> CREATOR = new zzfa();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    public enum TravelMode implements Parcelable {
        TRAVEL_MODE_UNSPECIFIED,
        DRIVE,
        BICYCLE,
        WALK,
        TWO_WHEELER;


        @RecentlyNonNull
        public static final Parcelable.Creator<TravelMode> CREATOR = new zzfb();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }
}
