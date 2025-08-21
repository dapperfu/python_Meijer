package com.meijer.mobile.serverapi.rxjava.observables.reward;

import Zq.b;
import xu.InterfaceC18226d;

/* loaded from: classes12.dex */
public final class FetchGasStationAndRewardsCall_Factory implements InterfaceC18226d {
    private final InterfaceC18226d<b> storeInfoRepositoryProvider;

    public static FetchGasStationAndRewardsCall_Factory create(InterfaceC18226d<b> interfaceC18226d) {
        return new FetchGasStationAndRewardsCall_Factory(interfaceC18226d);
    }

    public static FetchGasStationAndRewardsCall newInstance(b bVar) {
        return new FetchGasStationAndRewardsCall(bVar);
    }

    @Override // gv.InterfaceC14411a
    public FetchGasStationAndRewardsCall get() {
        return newInstance(this.storeInfoRepositoryProvider.get());
    }

    private FetchGasStationAndRewardsCall_Factory(InterfaceC18226d<b> interfaceC18226d) {
        this.storeInfoRepositoryProvider = interfaceC18226d;
    }
}
