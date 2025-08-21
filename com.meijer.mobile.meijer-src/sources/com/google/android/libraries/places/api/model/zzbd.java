package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* loaded from: classes6.dex */
final class zzbd extends RoutingParameters.Builder {
    private LatLng zza;
    private RoutingParameters.TravelMode zzb;
    private RouteModifiers zzc;
    private RoutingParameters.RoutingPreference zzd;

    zzbd() {
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters build() {
        return new zzdy(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final LatLng getOrigin() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RouteModifiers getRouteModifiers() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.RoutingPreference getRoutingPreference() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.TravelMode getTravelMode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setOrigin(LatLng latLng) {
        this.zza = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setRouteModifiers(RouteModifiers routeModifiers) {
        this.zzc = routeModifiers;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setRoutingPreference(RoutingParameters.RoutingPreference routingPreference) {
        this.zzd = routingPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setTravelMode(RoutingParameters.TravelMode travelMode) {
        this.zzb = travelMode;
        return this;
    }
}
