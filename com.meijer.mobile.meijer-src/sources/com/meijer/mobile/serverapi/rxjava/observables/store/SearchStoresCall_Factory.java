package com.meijer.mobile.serverapi.rxjava.observables.store;

import Zq.b;
import xu.InterfaceC18226d;

/* loaded from: classes12.dex */
public final class SearchStoresCall_Factory implements InterfaceC18226d {
    private final InterfaceC18226d<GeocoderCall> geocoderCallProvider;
    private final InterfaceC18226d<b> storeInfoRepositoryProvider;

    public static SearchStoresCall_Factory create(InterfaceC18226d<b> interfaceC18226d, InterfaceC18226d<GeocoderCall> interfaceC18226d2) {
        return new SearchStoresCall_Factory(interfaceC18226d, interfaceC18226d2);
    }

    public static SearchStoresCall newInstance(b bVar, GeocoderCall geocoderCall) {
        return new SearchStoresCall(bVar, geocoderCall);
    }

    @Override // gv.InterfaceC14411a
    public SearchStoresCall get() {
        return newInstance(this.storeInfoRepositoryProvider.get(), this.geocoderCallProvider.get());
    }

    private SearchStoresCall_Factory(InterfaceC18226d<b> interfaceC18226d, InterfaceC18226d<GeocoderCall> interfaceC18226d2) {
        this.storeInfoRepositoryProvider = interfaceC18226d;
        this.geocoderCallProvider = interfaceC18226d2;
    }
}
