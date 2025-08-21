package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RouteModifiers;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* loaded from: classes6.dex */
final class zzjo {
    zzjo(zzhf zzhfVar) {
    }

    public static final zzaxm zza(RoutingParameters routingParameters) {
        int i10;
        zzaxl zzaxlVarZza = zzaxm.zza();
        LatLng origin = routingParameters.getOrigin();
        if (origin != null) {
            zzaxlVarZza.zza(zzhf.zza(origin));
        }
        RoutingParameters.TravelMode travelMode = routingParameters.getTravelMode();
        int i11 = 5;
        if (travelMode != null) {
            RoutingParameters.RoutingPreference routingPreference = RoutingParameters.RoutingPreference.ROUTING_PREFERENCE_UNSPECIFIED;
            int iOrdinal = travelMode.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            i10 = 2;
                        } else {
                            i10 = 6;
                        }
                    } else {
                        i10 = 5;
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 3;
            }
            zzaxlVarZza.zzc(i10);
        }
        RouteModifiers routeModifiers = routingParameters.getRouteModifiers();
        if (routeModifiers != null) {
            zzaxj zzaxjVarZza = zzaxk.zza();
            zzaxjVarZza.zza(routeModifiers.isTollAvoided());
            zzaxjVarZza.zzb(routeModifiers.isHighwayAvoided());
            zzaxjVarZza.zzc(routeModifiers.isFerryAvoided());
            zzaxjVarZza.zzd(routeModifiers.isIndoorAvoided());
            zzaxlVarZza.zzb((zzaxk) zzaxjVarZza.zzG());
        }
        RoutingParameters.RoutingPreference routingPreference2 = routingParameters.getRoutingPreference();
        if (routingPreference2 != null) {
            RoutingParameters.TravelMode travelMode2 = RoutingParameters.TravelMode.TRAVEL_MODE_UNSPECIFIED;
            int iOrdinal2 = routingPreference2.ordinal();
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        i11 = 2;
                    }
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 3;
            }
            zzaxlVarZza.zzd(i11);
        }
        return (zzaxm) zzaxlVarZza.zzG();
    }
}
