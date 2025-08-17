package com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings;

import Bu.d;
import qv.AbstractC16618K;

/* loaded from: classes11.dex */
public final class ReceiptsAndSavingsDataSource_Factory implements d {
    private final d<AbstractC16618K> ioDispatcherProvider;
    private final d<Bh.d> preferencesRepositoryProvider;
    private final d<Ep.d> receiptsRepositoryProvider;

    public static ReceiptsAndSavingsDataSource_Factory create(d<Ep.d> dVar, d<Bh.d> dVar2, d<AbstractC16618K> dVar3) {
        return new ReceiptsAndSavingsDataSource_Factory(dVar, dVar2, dVar3);
    }

    public static ReceiptsAndSavingsDataSource newInstance(Ep.d dVar, Bh.d dVar2, AbstractC16618K abstractC16618K) {
        return new ReceiptsAndSavingsDataSource(dVar, dVar2, abstractC16618K);
    }

    @Override // kv.InterfaceC15323a
    public ReceiptsAndSavingsDataSource get() {
        return newInstance(this.receiptsRepositoryProvider.get(), this.preferencesRepositoryProvider.get(), this.ioDispatcherProvider.get());
    }

    private ReceiptsAndSavingsDataSource_Factory(d<Ep.d> dVar, d<Bh.d> dVar2, d<AbstractC16618K> dVar3) {
        this.receiptsRepositoryProvider = dVar;
        this.preferencesRepositoryProvider = dVar2;
        this.ioDispatcherProvider = dVar3;
    }
}
