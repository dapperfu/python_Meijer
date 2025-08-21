package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* loaded from: classes6.dex */
final class zzdy extends zzbe {
    public static final Parcelable.Creator<zzdy> CREATOR = new zzdx();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdy(LatLng latLng, RoutingParameters.TravelMode travelMode, RouteModifiers routeModifiers, RoutingParameters.RoutingPreference routingPreference) {
        super(latLng, travelMode, routeModifiers, routingPreference);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getOrigin(), i10);
        parcel.writeParcelable(getTravelMode(), i10);
        parcel.writeParcelable(getRouteModifiers(), i10);
        parcel.writeParcelable(getRoutingPreference(), i10);
    }
}
