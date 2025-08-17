package com.meijer.mobile.meijer.activity.home.legacy.viewmodel;

import Bu.d;
import Tq.j;
import gi.InterfaceC14261a;
import hl.m;
import yl.k;

/* loaded from: classes9.dex */
public final class NavBarItem_Factory implements d {
    private final d<InterfaceC14261a> analyticsEngineProvider;
    private final d<m> cartRepositoryProvider;
    private final d<k> featureManagerProvider;
    private final d<j> storeProvider;
    private final d<yo.k> userManagerProvider;

    public static NavBarItem_Factory create(d<yo.k> dVar, d<j> dVar2, d<m> dVar3, d<InterfaceC14261a> dVar4, d<k> dVar5) {
        return new NavBarItem_Factory(dVar, dVar2, dVar3, dVar4, dVar5);
    }

    public static NavBarItem newInstance(yo.k kVar, j jVar, m mVar, InterfaceC14261a interfaceC14261a, k kVar2) {
        return new NavBarItem(kVar, jVar, mVar, interfaceC14261a, kVar2);
    }

    @Override // kv.InterfaceC15323a
    public NavBarItem get() {
        return newInstance(this.userManagerProvider.get(), this.storeProvider.get(), this.cartRepositoryProvider.get(), this.analyticsEngineProvider.get(), this.featureManagerProvider.get());
    }

    private NavBarItem_Factory(d<yo.k> dVar, d<j> dVar2, d<m> dVar3, d<InterfaceC14261a> dVar4, d<k> dVar5) {
        this.userManagerProvider = dVar;
        this.storeProvider = dVar2;
        this.cartRepositoryProvider = dVar3;
        this.analyticsEngineProvider = dVar4;
        this.featureManagerProvider = dVar5;
    }
}
