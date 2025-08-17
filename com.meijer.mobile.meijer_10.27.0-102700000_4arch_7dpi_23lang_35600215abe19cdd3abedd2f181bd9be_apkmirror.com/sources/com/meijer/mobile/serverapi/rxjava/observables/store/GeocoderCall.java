package com.meijer.mobile.serverapi.rxjava.observables.store;

import Ds.h;
import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
import java.util.List;
import sk.C16981a;

/* loaded from: classes11.dex */
public class GeocoderCall {
    private static final String CANADA_SUFFIX = ", Canada";
    private static final String USA_SUFFIX = ", USA";
    private List<Address> addresses;
    private final Geocoder geocoder;
    private final LocationManager locationManager;

    private boolean isCanadianPostalCode(String str) {
        return C16981a.CANADIAN_POSTAL_CODE_RAW_REGEX.matcher(str).matches();
    }

    private boolean isUSZipCode(String str) {
        return h.ZIP_CODE_PATTERN.matcher(str).matches();
    }

    private boolean isValidQuery(String str) {
        return (str == null || str.length() == 0) ? false : true;
    }

    public GeocoderCall(Geocoder geocoder, LocationManager locationManager) {
        this.geocoder = geocoder;
        this.locationManager = locationManager;
    }

    private String restrictQuery(String str, String str2) {
        if (str.toUpperCase().endsWith(str2)) {
            return str;
        }
        return str + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.maps.model.LatLng getLatLng(java.lang.String r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.isValidQuery(r11)
            if (r0 == 0) goto Lac
            boolean r0 = r10.isCanadianPostalCode(r11)
            java.lang.String r1 = "Unable to get a lat/lng for the given query: %s"
            r2 = 0
            if (r0 == 0) goto L12
            java.lang.String r12 = ", Canada"
            goto L65
        L12:
            boolean r0 = r10.isUSZipCode(r11)
            java.lang.String r3 = ", USA"
            if (r0 == 0) goto L1c
        L1a:
            r12 = r3
            goto L65
        L1c:
            if (r12 == 0) goto L1a
            android.location.LocationManager r12 = r10.locationManager
            if (r12 == 0) goto L1a
            java.lang.String r0 = "gps"
            android.location.Location r12 = r12.getLastKnownLocation(r0)
            if (r12 == 0) goto L1a
            android.location.Geocoder r4 = r10.geocoder     // Catch: java.io.IOException -> L5d
            double r5 = r12.getLatitude()     // Catch: java.io.IOException -> L5d
            double r7 = r12.getLongitude()     // Catch: java.io.IOException -> L5d
            r9 = 1
            java.util.List r12 = r4.getFromLocation(r5, r7, r9)     // Catch: java.io.IOException -> L5d
            if (r12 == 0) goto L1a
            boolean r0 = r12.isEmpty()     // Catch: java.io.IOException -> L5d
            if (r0 != 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5d
            r0.<init>()     // Catch: java.io.IOException -> L5d
            java.lang.String r4 = ", "
            r0.append(r4)     // Catch: java.io.IOException -> L5d
            java.lang.Object r12 = r12.get(r2)     // Catch: java.io.IOException -> L5d
            android.location.Address r12 = (android.location.Address) r12     // Catch: java.io.IOException -> L5d
            java.lang.String r12 = r12.getCountryName()     // Catch: java.io.IOException -> L5d
            r0.append(r12)     // Catch: java.io.IOException -> L5d
            java.lang.String r12 = r0.toString()     // Catch: java.io.IOException -> L5d
            goto L65
        L5d:
            java.lang.Object[] r12 = new java.lang.Object[]{r11}
            uw.a.g(r1, r12)
            goto L1a
        L65:
            android.location.Geocoder r0 = r10.geocoder     // Catch: java.io.IOException -> L9c
            java.lang.String r12 = r10.restrictQuery(r11, r12)     // Catch: java.io.IOException -> L9c
            r3 = 1
            java.util.List r12 = r0.getFromLocationName(r12, r3)     // Catch: java.io.IOException -> L9c
            r10.addresses = r12     // Catch: java.io.IOException -> L9c
            if (r12 == 0) goto Lac
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto Lac
            java.util.List<android.location.Address> r11 = r10.addresses
            java.lang.Object r11 = r11.get(r2)
            android.location.Address r11 = (android.location.Address) r11
            boolean r12 = r11.hasLatitude()
            if (r12 == 0) goto Lac
            boolean r12 = r11.hasLongitude()
            if (r12 == 0) goto Lac
            com.google.android.gms.maps.model.LatLng r12 = new com.google.android.gms.maps.model.LatLng
            double r0 = r11.getLatitude()
            double r2 = r11.getLongitude()
            r12.<init>(r0, r2)
            return r12
        L9c:
            r0 = move-exception
            r12 = r0
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            uw.a.g(r1, r11)
            com.meijer.mobile.serverapi.errorType.GeocoderErrorType r11 = com.meijer.mobile.serverapi.errorType.GeocoderErrorType.NO_RESULTS_FOUND
            com.meijer.mobile.core.networking.exceptions.RetrofitException r11 = com.meijer.mobile.core.networking.exceptions.RetrofitException.g(r11, r12)
            throw r11
        Lac:
            com.meijer.mobile.serverapi.errorType.GeocoderErrorType r11 = com.meijer.mobile.serverapi.errorType.GeocoderErrorType.NO_RESULTS_FOUND
            com.meijer.mobile.core.networking.exceptions.RetrofitException r11 = com.meijer.mobile.core.networking.exceptions.RetrofitException.f(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.serverapi.rxjava.observables.store.GeocoderCall.getLatLng(java.lang.String, boolean):com.google.android.gms.maps.model.LatLng");
    }
}
