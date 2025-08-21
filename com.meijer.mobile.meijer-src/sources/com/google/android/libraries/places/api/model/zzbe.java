package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* loaded from: classes6.dex */
abstract class zzbe extends RoutingParameters {
    private final LatLng zza;
    private final RoutingParameters.TravelMode zzb;
    private final RouteModifiers zzc;
    private final RoutingParameters.RoutingPreference zzd;

    zzbe(LatLng latLng, RoutingParameters.TravelMode travelMode, RouteModifiers routeModifiers, RoutingParameters.RoutingPreference routingPreference) {
        this.zza = latLng;
        this.zzb = travelMode;
        this.zzc = routeModifiers;
        this.zzd = routingPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RoutingParameters) {
            RoutingParameters routingParameters = (RoutingParameters) obj;
            LatLng latLng = this.zza;
            if (latLng != null ? latLng.equals(routingParameters.getOrigin()) : routingParameters.getOrigin() == null) {
                RoutingParameters.TravelMode travelMode = this.zzb;
                if (travelMode != null ? travelMode.equals(routingParameters.getTravelMode()) : routingParameters.getTravelMode() == null) {
                    RouteModifiers routeModifiers = this.zzc;
                    if (routeModifiers != null ? routeModifiers.equals(routingParameters.getRouteModifiers()) : routingParameters.getRouteModifiers() == null) {
                        RoutingParameters.RoutingPreference routingPreference = this.zzd;
                        if (routingPreference != null ? routingPreference.equals(routingParameters.getRoutingPreference()) : routingParameters.getRoutingPreference() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final LatLng getOrigin() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RouteModifiers getRouteModifiers() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RoutingParameters.RoutingPreference getRoutingPreference() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RoutingParameters.TravelMode getTravelMode() {
        return this.zzb;
    }

    public final int hashCode() {
        LatLng latLng = this.zza;
        int iHashCode = latLng == null ? 0 : latLng.hashCode();
        RoutingParameters.TravelMode travelMode = this.zzb;
        int iHashCode2 = travelMode == null ? 0 : travelMode.hashCode();
        int i10 = iHashCode ^ 1000003;
        RouteModifiers routeModifiers = this.zzc;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (routeModifiers == null ? 0 : routeModifiers.hashCode())) * 1000003;
        RoutingParameters.RoutingPreference routingPreference = this.zzd;
        return iHashCode3 ^ (routingPreference != null ? routingPreference.hashCode() : 0);
    }

    public final String toString() {
        RoutingParameters.RoutingPreference routingPreference = this.zzd;
        RouteModifiers routeModifiers = this.zzc;
        RoutingParameters.TravelMode travelMode = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(travelMode);
        String strValueOf3 = String.valueOf(routeModifiers);
        String strValueOf4 = String.valueOf(routingPreference);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 17 + strValueOf3.length() + 20 + strValueOf4.length() + 1);
        sb2.append("RoutingParameters{origin=");
        sb2.append(strValueOf);
        sb2.append(", travelMode=");
        sb2.append(strValueOf2);
        sb2.append(", routeModifiers=");
        sb2.append(strValueOf3);
        sb2.append(", routingPreference=");
        sb2.append(strValueOf4);
        sb2.append("}");
        return sb2.toString();
    }
}
