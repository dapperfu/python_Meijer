package com.meijer.mobile.serverapi.rxjava.observables.reward;

import Bu.d;
import Zq.b;

/* loaded from: classes11.dex */
public final class FetchGasStationAndRewardsCall_Factory implements d {
    private final d<b> storeInfoRepositoryProvider;

    public static FetchGasStationAndRewardsCall_Factory create(d<b> dVar) {
        return new FetchGasStationAndRewardsCall_Factory(dVar);
    }

    public static FetchGasStationAndRewardsCall newInstance(b bVar) {
        return new FetchGasStationAndRewardsCall(bVar);
    }

    @Override // kv.InterfaceC15323a
    public FetchGasStationAndRewardsCall get() {
        return newInstance(this.storeInfoRepositoryProvider.get());
    }

    private FetchGasStationAndRewardsCall_Factory(d<b> dVar) {
        this.storeInfoRepositoryProvider = dVar;
    }
}
