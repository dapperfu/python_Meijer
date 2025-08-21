package com.google.maps;

import com.google.maps.DirectionsApi;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.LatLng;
import com.google.maps.model.TrafficModel;
import com.google.maps.model.TransitMode;
import com.google.maps.model.TransitRoutingPreference;
import com.google.maps.model.TravelMode;
import com.google.maps.model.Unit;
import j$.time.Instant;
import java.util.Objects;

/* loaded from: classes8.dex */
public class DirectionsApiRequest extends PendingResultBase<DirectionsResult, DirectionsApiRequest, DirectionsApi.Response> {
    protected boolean optimizeWaypoints;
    protected Waypoint[] waypoints;

    public static class Waypoint {
        private boolean isStopover;
        private String location;

        public Waypoint(String str) {
            this(str, true);
        }

        public Waypoint(String str, boolean z10) {
            Objects.requireNonNull(str, "address may not be null");
            this.location = str;
            this.isStopover = z10;
        }

        public String toString() {
            if (this.isStopover) {
                return this.location;
            }
            return "via:" + this.location;
        }

        public Waypoint(LatLng latLng) {
            this(latLng, true);
        }

        public Waypoint(LatLng latLng, boolean z10) {
            Objects.requireNonNull(latLng, "location may not be null");
            this.location = latLng.toString();
            this.isStopover = z10;
        }
    }

    public DirectionsApiRequest destination(String str) {
        return param("destination", str);
    }

    public DirectionsApiRequest origin(String str) {
        return param("origin", str);
    }

    public DirectionsApiRequest waypoints(Waypoint... waypointArr) {
        if (waypointArr == null || waypointArr.length == 0) {
            this.waypoints = new Waypoint[0];
            param("waypoints", "");
            return this;
        }
        this.waypoints = waypointArr;
        String[] strArr = new String[waypointArr.length];
        for (int i10 = 0; i10 < waypointArr.length; i10++) {
            strArr[i10] = waypointArr[i10].toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.optimizeWaypoints ? "optimize:true|" : "");
        sb2.append(StringJoin.join('|', strArr));
        param("waypoints", sb2.toString());
        return this;
    }

    public DirectionsApiRequest waypointsFromPlaceIds(String... strArr) {
        Waypoint[] waypointArr = new Waypoint[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            waypointArr[i10] = new Waypoint(prefixPlaceId(strArr[i10]));
        }
        return waypoints(waypointArr);
    }

    public DirectionsApiRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, DirectionsApi.API_CONFIG, DirectionsApi.Response.class);
    }

    public DirectionsApiRequest alternatives(boolean z10) {
        return z10 ? param("alternatives", "true") : param("alternatives", "false");
    }

    public DirectionsApiRequest avoid(DirectionsApi.RouteRestriction... routeRestrictionArr) {
        return param("avoid", StringJoin.join('|', (StringJoin.UrlValue[]) routeRestrictionArr));
    }

    public DirectionsApiRequest departureTimeNow() {
        return param("departure_time", "now");
    }

    public DirectionsApiRequest destination(LatLng latLng) {
        return destination(latLng.toString());
    }

    public DirectionsApiRequest destinationPlaceId(String str) {
        return param("destination", prefixPlaceId(str));
    }

    public DirectionsApiRequest mode(TravelMode travelMode) {
        return param("mode", travelMode);
    }

    public DirectionsApiRequest optimizeWaypoints(boolean z10) {
        this.optimizeWaypoints = z10;
        Waypoint[] waypointArr = this.waypoints;
        return waypointArr != null ? waypoints(waypointArr) : this;
    }

    public DirectionsApiRequest origin(LatLng latLng) {
        return origin(latLng.toString());
    }

    public DirectionsApiRequest originPlaceId(String str) {
        return param("origin", prefixPlaceId(str));
    }

    public String prefixPlaceId(String str) {
        return "place_id:" + str;
    }

    public DirectionsApiRequest region(String str) {
        return param("region", str);
    }

    public DirectionsApiRequest trafficModel(TrafficModel trafficModel) {
        return param("traffic_model", trafficModel);
    }

    public DirectionsApiRequest transitMode(TransitMode... transitModeArr) {
        return param("transit_mode", StringJoin.join('|', (StringJoin.UrlValue[]) transitModeArr));
    }

    public DirectionsApiRequest transitRoutingPreference(TransitRoutingPreference transitRoutingPreference) {
        return param("transit_routing_preference", transitRoutingPreference);
    }

    public DirectionsApiRequest units(Unit unit) {
        return param("units", unit);
    }

    public DirectionsApiRequest arrivalTime(Instant instant) {
        return param("arrival_time", Long.toString(instant.toEpochMilli() / 1000));
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase channel(String str) {
        return super.channel(str);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase custom(String str, String str2) {
        return super.custom(str, str2);
    }

    public DirectionsApiRequest departureTime(Instant instant) {
        return param("departure_time", Long.toString(instant.toEpochMilli() / 1000));
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase experienceIds(String[] strArr) {
        return super.experienceIds(strArr);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase header(String str, String str2) {
        return super.header(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        if (params().containsKey("origin")) {
            if (params().containsKey("destination")) {
                if (params().containsKey("arrival_time") && params().containsKey("departure_time")) {
                    throw new IllegalArgumentException("Transit request must not contain both a departureTime and an arrivalTime");
                }
                if (params().containsKey("traffic_model") && !params().containsKey("departure_time")) {
                    throw new IllegalArgumentException("Specifying a traffic model requires that departure time be provided.");
                }
                return;
            }
            throw new IllegalArgumentException("Request must contain 'destination'");
        }
        throw new IllegalArgumentException("Request must contain 'origin'");
    }

    public DirectionsApiRequest waypoints(String... strArr) {
        Waypoint[] waypointArr = new Waypoint[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            waypointArr[i10] = new Waypoint(strArr[i10]);
        }
        return waypoints(waypointArr);
    }

    public DirectionsApiRequest waypoints(LatLng... latLngArr) {
        Waypoint[] waypointArr = new Waypoint[latLngArr.length];
        for (int i10 = 0; i10 < latLngArr.length; i10++) {
            waypointArr[i10] = new Waypoint(latLngArr[i10]);
        }
        return waypoints(waypointArr);
    }
}
