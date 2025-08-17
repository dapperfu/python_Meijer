package com.meijer.mobile.meijer.activity.home;

import cl.C6412d;
import eo.C13719g;
import gi.InterfaceC14261a;
import gm.C14274a;
import hm.C14501c;
import im.C14742a;
import im.C14743b;
import jp.C15069b;
import qp.C16594b;
import qv.AbstractC16618K;
import sp.C16992a;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class HomeViewModel_Factory implements Bu.d {
    private final Bu.d<Bh.c> accountsAMSRepositoryProvider;
    private final Bu.d<InterfaceC14261a> analyticsEngineProvider;
    private final Bu.d<C18264a> appPrefManagerProvider;
    private final Bu.d<C16594b> beaconClientProvider;
    private final Bu.d<wr.f> cartInteractorProvider;
    private final Bu.d<C6412d> couponsRepositoryProvider;
    private final Bu.d<Xk.u> couponsStateRepositoryProvider;
    private final Bu.d<Cl.e> deeplinkParserProvider;
    private final Bu.d<yl.k> featureManagerProvider;
    private final Bu.d<C14274a> homeChipsRepositoryProvider;
    private final Bu.d<C14742a> homeRepositoryProvider;
    private final Bu.d<AbstractC16618K> ioDispatcherProvider;
    private final Bu.d<C14743b> marketingBannerRepositoryProvider;
    private final Bu.d<C16992a> multiChannelProductsStateRepositoryProvider;
    private final Bu.d<C14501c> orderStatusRepositoryProvider;
    private final Bu.d<com.meijer.mobile.digitalshopping.api.orders.a> ordersRepositoryProvider;
    private final Bu.d<pp.d> productMetadataStoreProvider;
    private final Bu.d<C15069b> productRecommendationsRepositoryProvider;
    private final Bu.d<Ro.c> productsRepositoryProvider;
    private final Bu.d<Bh.e> profileRepositoryProvider;
    private final Bu.d<C13719g> rewardsRepositoryProvider;
    private final Bu.d<Tq.j> storeProvider;
    private final Bu.d<yo.k> userManagerProvider;

    public static HomeViewModel_Factory create(Bu.d<yo.k> dVar, Bu.d<yl.k> dVar2, Bu.d<C18264a> dVar3, Bu.d<C14742a> dVar4, Bu.d<C14274a> dVar5, Bu.d<Bh.e> dVar6, Bu.d<Bh.c> dVar7, Bu.d<InterfaceC14261a> dVar8, Bu.d<C14501c> dVar9, Bu.d<com.meijer.mobile.digitalshopping.api.orders.a> dVar10, Bu.d<C6412d> dVar11, Bu.d<Xk.u> dVar12, Bu.d<C13719g> dVar13, Bu.d<wr.f> dVar14, Bu.d<C16992a> dVar15, Bu.d<C14743b> dVar16, Bu.d<C15069b> dVar17, Bu.d<pp.d> dVar18, Bu.d<Cl.e> dVar19, Bu.d<C16594b> dVar20, Bu.d<Tq.j> dVar21, Bu.d<Ro.c> dVar22, Bu.d<AbstractC16618K> dVar23) {
        return new HomeViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23);
    }

    public static HomeViewModel newInstance(yo.k kVar, yl.k kVar2, C18264a c18264a, C14742a c14742a, C14274a c14274a, Bh.e eVar, Bh.c cVar, InterfaceC14261a interfaceC14261a, C14501c c14501c, com.meijer.mobile.digitalshopping.api.orders.a aVar, C6412d c6412d, Xk.u uVar, C13719g c13719g, wr.f fVar, C16992a c16992a, C14743b c14743b, C15069b c15069b, pp.d dVar, Cl.e eVar2, C16594b c16594b, Tq.j jVar, Ro.c cVar2, AbstractC16618K abstractC16618K) {
        return new HomeViewModel(kVar, kVar2, c18264a, c14742a, c14274a, eVar, cVar, interfaceC14261a, c14501c, aVar, c6412d, uVar, c13719g, fVar, c16992a, c14743b, c15069b, dVar, eVar2, c16594b, jVar, cVar2, abstractC16618K);
    }

    @Override // kv.InterfaceC15323a
    public HomeViewModel get() {
        return newInstance(this.userManagerProvider.get(), this.featureManagerProvider.get(), this.appPrefManagerProvider.get(), this.homeRepositoryProvider.get(), this.homeChipsRepositoryProvider.get(), this.profileRepositoryProvider.get(), this.accountsAMSRepositoryProvider.get(), this.analyticsEngineProvider.get(), this.orderStatusRepositoryProvider.get(), this.ordersRepositoryProvider.get(), this.couponsRepositoryProvider.get(), this.couponsStateRepositoryProvider.get(), this.rewardsRepositoryProvider.get(), this.cartInteractorProvider.get(), this.multiChannelProductsStateRepositoryProvider.get(), this.marketingBannerRepositoryProvider.get(), this.productRecommendationsRepositoryProvider.get(), this.productMetadataStoreProvider.get(), this.deeplinkParserProvider.get(), this.beaconClientProvider.get(), this.storeProvider.get(), this.productsRepositoryProvider.get(), this.ioDispatcherProvider.get());
    }

    private HomeViewModel_Factory(Bu.d<yo.k> dVar, Bu.d<yl.k> dVar2, Bu.d<C18264a> dVar3, Bu.d<C14742a> dVar4, Bu.d<C14274a> dVar5, Bu.d<Bh.e> dVar6, Bu.d<Bh.c> dVar7, Bu.d<InterfaceC14261a> dVar8, Bu.d<C14501c> dVar9, Bu.d<com.meijer.mobile.digitalshopping.api.orders.a> dVar10, Bu.d<C6412d> dVar11, Bu.d<Xk.u> dVar12, Bu.d<C13719g> dVar13, Bu.d<wr.f> dVar14, Bu.d<C16992a> dVar15, Bu.d<C14743b> dVar16, Bu.d<C15069b> dVar17, Bu.d<pp.d> dVar18, Bu.d<Cl.e> dVar19, Bu.d<C16594b> dVar20, Bu.d<Tq.j> dVar21, Bu.d<Ro.c> dVar22, Bu.d<AbstractC16618K> dVar23) {
        this.userManagerProvider = dVar;
        this.featureManagerProvider = dVar2;
        this.appPrefManagerProvider = dVar3;
        this.homeRepositoryProvider = dVar4;
        this.homeChipsRepositoryProvider = dVar5;
        this.profileRepositoryProvider = dVar6;
        this.accountsAMSRepositoryProvider = dVar7;
        this.analyticsEngineProvider = dVar8;
        this.orderStatusRepositoryProvider = dVar9;
        this.ordersRepositoryProvider = dVar10;
        this.couponsRepositoryProvider = dVar11;
        this.couponsStateRepositoryProvider = dVar12;
        this.rewardsRepositoryProvider = dVar13;
        this.cartInteractorProvider = dVar14;
        this.multiChannelProductsStateRepositoryProvider = dVar15;
        this.marketingBannerRepositoryProvider = dVar16;
        this.productRecommendationsRepositoryProvider = dVar17;
        this.productMetadataStoreProvider = dVar18;
        this.deeplinkParserProvider = dVar19;
        this.beaconClientProvider = dVar20;
        this.storeProvider = dVar21;
        this.productsRepositoryProvider = dVar22;
        this.ioDispatcherProvider = dVar23;
    }
}
