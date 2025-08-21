package com.meijer.mobile.serverapi.rxjava.observables.store;

import android.location.Geocoder;
import android.location.LocationManager;
import xu.InterfaceC18226d;

/* loaded from: classes12.dex */
public final class GeocoderCall_Factory implements InterfaceC18226d {
    private final InterfaceC18226d<Geocoder> geocoderProvider;
    private final InterfaceC18226d<LocationManager> locationManagerProvider;

    public static GeocoderCall_Factory create(InterfaceC18226d<Geocoder> interfaceC18226d, InterfaceC18226d<LocationManager> interfaceC18226d2) {
        return new GeocoderCall_Factory(interfaceC18226d, interfaceC18226d2);
    }

    public static GeocoderCall newInstance(Geocoder geocoder, LocationManager locationManager) {
        return new GeocoderCall(geocoder, locationManager);
    }

    @Override // gv.InterfaceC14411a
    public GeocoderCall get() {
        return newInstance(this.geocoderProvider.get(), this.locationManagerProvider.get());
    }

    private GeocoderCall_Factory(InterfaceC18226d<Geocoder> interfaceC18226d, InterfaceC18226d<LocationManager> interfaceC18226d2) {
        this.geocoderProvider = interfaceC18226d;
        this.locationManagerProvider = interfaceC18226d2;
    }
}
