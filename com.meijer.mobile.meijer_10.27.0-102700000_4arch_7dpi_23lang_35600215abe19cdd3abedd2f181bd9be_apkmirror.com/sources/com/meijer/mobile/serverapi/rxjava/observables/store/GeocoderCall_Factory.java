package com.meijer.mobile.serverapi.rxjava.observables.store;

import Bu.d;
import android.location.Geocoder;
import android.location.LocationManager;

/* loaded from: classes11.dex */
public final class GeocoderCall_Factory implements d {
    private final d<Geocoder> geocoderProvider;
    private final d<LocationManager> locationManagerProvider;

    public static GeocoderCall_Factory create(d<Geocoder> dVar, d<LocationManager> dVar2) {
        return new GeocoderCall_Factory(dVar, dVar2);
    }

    public static GeocoderCall newInstance(Geocoder geocoder, LocationManager locationManager) {
        return new GeocoderCall(geocoder, locationManager);
    }

    @Override // kv.InterfaceC15323a
    public GeocoderCall get() {
        return newInstance(this.geocoderProvider.get(), this.locationManagerProvider.get());
    }

    private GeocoderCall_Factory(d<Geocoder> dVar, d<LocationManager> dVar2) {
        this.geocoderProvider = dVar;
        this.locationManagerProvider = dVar2;
    }
}
