package com.meijer.mobile.meijer.activity.home.legacy.viewmodel;

import Tq.j;
import hi.InterfaceC14523a;
import il.m;
import xu.InterfaceC18226d;
import zl.k;

/* loaded from: classes10.dex */
public final class NavBarItem_Factory implements InterfaceC18226d {
    private final InterfaceC18226d<InterfaceC14523a> analyticsEngineProvider;
    private final InterfaceC18226d<m> cartRepositoryProvider;
    private final InterfaceC18226d<k> featureManagerProvider;
    private final InterfaceC18226d<j> storeProvider;
    private final InterfaceC18226d<yo.k> userManagerProvider;

    public static NavBarItem_Factory create(InterfaceC18226d<yo.k> interfaceC18226d, InterfaceC18226d<j> interfaceC18226d2, InterfaceC18226d<m> interfaceC18226d3, InterfaceC18226d<InterfaceC14523a> interfaceC18226d4, InterfaceC18226d<k> interfaceC18226d5) {
        return new NavBarItem_Factory(interfaceC18226d, interfaceC18226d2, interfaceC18226d3, interfaceC18226d4, interfaceC18226d5);
    }

    public static NavBarItem newInstance(yo.k kVar, j jVar, m mVar, InterfaceC14523a interfaceC14523a, k kVar2) {
        return new NavBarItem(kVar, jVar, mVar, interfaceC14523a, kVar2);
    }

    @Override // gv.InterfaceC14411a
    public NavBarItem get() {
        return newInstance(this.userManagerProvider.get(), this.storeProvider.get(), this.cartRepositoryProvider.get(), this.analyticsEngineProvider.get(), this.featureManagerProvider.get());
    }

    private NavBarItem_Factory(InterfaceC18226d<yo.k> interfaceC18226d, InterfaceC18226d<j> interfaceC18226d2, InterfaceC18226d<m> interfaceC18226d3, InterfaceC18226d<InterfaceC14523a> interfaceC18226d4, InterfaceC18226d<k> interfaceC18226d5) {
        this.userManagerProvider = interfaceC18226d;
        this.storeProvider = interfaceC18226d2;
        this.cartRepositoryProvider = interfaceC18226d3;
        this.analyticsEngineProvider = interfaceC18226d4;
        this.featureManagerProvider = interfaceC18226d5;
    }
}
