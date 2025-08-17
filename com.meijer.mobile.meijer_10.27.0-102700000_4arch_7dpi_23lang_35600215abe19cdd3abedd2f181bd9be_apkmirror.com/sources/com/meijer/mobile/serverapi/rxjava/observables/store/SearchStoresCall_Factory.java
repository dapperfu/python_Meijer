package com.meijer.mobile.serverapi.rxjava.observables.store;

import Bu.d;
import Zq.b;

/* loaded from: classes11.dex */
public final class SearchStoresCall_Factory implements d {
    private final d<GeocoderCall> geocoderCallProvider;
    private final d<b> storeInfoRepositoryProvider;

    public static SearchStoresCall_Factory create(d<b> dVar, d<GeocoderCall> dVar2) {
        return new SearchStoresCall_Factory(dVar, dVar2);
    }

    public static SearchStoresCall newInstance(b bVar, GeocoderCall geocoderCall) {
        return new SearchStoresCall(bVar, geocoderCall);
    }

    @Override // kv.InterfaceC15323a
    public SearchStoresCall get() {
        return newInstance(this.storeInfoRepositoryProvider.get(), this.geocoderCallProvider.get());
    }

    private SearchStoresCall_Factory(d<b> dVar, d<GeocoderCall> dVar2) {
        this.storeInfoRepositoryProvider = dVar;
        this.geocoderCallProvider = dVar2;
    }
}
