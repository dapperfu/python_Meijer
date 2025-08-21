package com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings;

import Ch.d;
import mv.AbstractC15779K;
import xu.InterfaceC18226d;

/* loaded from: classes12.dex */
public final class ReceiptsAndSavingsDataSource_Factory implements InterfaceC18226d {
    private final InterfaceC18226d<AbstractC15779K> ioDispatcherProvider;
    private final InterfaceC18226d<d> preferencesRepositoryProvider;
    private final InterfaceC18226d<Ep.d> receiptsRepositoryProvider;

    public static ReceiptsAndSavingsDataSource_Factory create(InterfaceC18226d<Ep.d> interfaceC18226d, InterfaceC18226d<d> interfaceC18226d2, InterfaceC18226d<AbstractC15779K> interfaceC18226d3) {
        return new ReceiptsAndSavingsDataSource_Factory(interfaceC18226d, interfaceC18226d2, interfaceC18226d3);
    }

    public static ReceiptsAndSavingsDataSource newInstance(Ep.d dVar, d dVar2, AbstractC15779K abstractC15779K) {
        return new ReceiptsAndSavingsDataSource(dVar, dVar2, abstractC15779K);
    }

    @Override // gv.InterfaceC14411a
    public ReceiptsAndSavingsDataSource get() {
        return newInstance(this.receiptsRepositoryProvider.get(), this.preferencesRepositoryProvider.get(), this.ioDispatcherProvider.get());
    }

    private ReceiptsAndSavingsDataSource_Factory(InterfaceC18226d<Ep.d> interfaceC18226d, InterfaceC18226d<d> interfaceC18226d2, InterfaceC18226d<AbstractC15779K> interfaceC18226d3) {
        this.receiptsRepositoryProvider = interfaceC18226d;
        this.preferencesRepositoryProvider = interfaceC18226d2;
        this.ioDispatcherProvider = interfaceC18226d3;
    }
}
