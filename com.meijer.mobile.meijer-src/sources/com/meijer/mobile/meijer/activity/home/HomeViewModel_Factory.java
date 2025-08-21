package com.meijer.mobile.meijer.activity.home;

import dl.C13702d;
import hi.InterfaceC14523a;
import hm.C14536a;
import im.C14781c;
import jm.C15052a;
import jm.C15053b;
import jp.C15058b;
import mv.AbstractC15779K;
import qp.C16753b;
import sp.C17115a;
import xu.InterfaceC18226d;
import yo.C18335a;

/* loaded from: classes10.dex */
public final class HomeViewModel_Factory implements InterfaceC18226d {
    private final InterfaceC18226d<Ch.c> accountsAMSRepositoryProvider;
    private final InterfaceC18226d<InterfaceC14523a> analyticsEngineProvider;
    private final InterfaceC18226d<C18335a> appPrefManagerProvider;
    private final InterfaceC18226d<C16753b> beaconClientProvider;
    private final InterfaceC18226d<wr.f> cartInteractorProvider;
    private final InterfaceC18226d<C13702d> couponsRepositoryProvider;
    private final InterfaceC18226d<Yk.u> couponsStateRepositoryProvider;
    private final InterfaceC18226d<Dl.e> deeplinkParserProvider;
    private final InterfaceC18226d<zl.k> featureManagerProvider;
    private final InterfaceC18226d<C14536a> homeChipsRepositoryProvider;
    private final InterfaceC18226d<C15052a> homeRepositoryProvider;
    private final InterfaceC18226d<AbstractC15779K> ioDispatcherProvider;
    private final InterfaceC18226d<C15053b> marketingBannerRepositoryProvider;
    private final InterfaceC18226d<C17115a> multiChannelProductsStateRepositoryProvider;
    private final InterfaceC18226d<C14781c> orderStatusRepositoryProvider;
    private final InterfaceC18226d<com.meijer.mobile.digitalshopping.api.orders.a> ordersRepositoryProvider;
    private final InterfaceC18226d<pp.d> productMetadataStoreProvider;
    private final InterfaceC18226d<C15058b> productRecommendationsRepositoryProvider;
    private final InterfaceC18226d<Ro.c> productsRepositoryProvider;
    private final InterfaceC18226d<Ch.e> profileRepositoryProvider;
    private final InterfaceC18226d<fo.e> rewardsRepositoryProvider;
    private final InterfaceC18226d<Tq.j> storeProvider;
    private final InterfaceC18226d<yo.k> userManagerProvider;

    public static HomeViewModel_Factory create(InterfaceC18226d<yo.k> interfaceC18226d, InterfaceC18226d<zl.k> interfaceC18226d2, InterfaceC18226d<C18335a> interfaceC18226d3, InterfaceC18226d<C15052a> interfaceC18226d4, InterfaceC18226d<C14536a> interfaceC18226d5, InterfaceC18226d<Ch.e> interfaceC18226d6, InterfaceC18226d<Ch.c> interfaceC18226d7, InterfaceC18226d<InterfaceC14523a> interfaceC18226d8, InterfaceC18226d<C14781c> interfaceC18226d9, InterfaceC18226d<com.meijer.mobile.digitalshopping.api.orders.a> interfaceC18226d10, InterfaceC18226d<C13702d> interfaceC18226d11, InterfaceC18226d<Yk.u> interfaceC18226d12, InterfaceC18226d<fo.e> interfaceC18226d13, InterfaceC18226d<wr.f> interfaceC18226d14, InterfaceC18226d<C17115a> interfaceC18226d15, InterfaceC18226d<C15053b> interfaceC18226d16, InterfaceC18226d<C15058b> interfaceC18226d17, InterfaceC18226d<pp.d> interfaceC18226d18, InterfaceC18226d<Dl.e> interfaceC18226d19, InterfaceC18226d<C16753b> interfaceC18226d20, InterfaceC18226d<Tq.j> interfaceC18226d21, InterfaceC18226d<Ro.c> interfaceC18226d22, InterfaceC18226d<AbstractC15779K> interfaceC18226d23) {
        return new HomeViewModel_Factory(interfaceC18226d, interfaceC18226d2, interfaceC18226d3, interfaceC18226d4, interfaceC18226d5, interfaceC18226d6, interfaceC18226d7, interfaceC18226d8, interfaceC18226d9, interfaceC18226d10, interfaceC18226d11, interfaceC18226d12, interfaceC18226d13, interfaceC18226d14, interfaceC18226d15, interfaceC18226d16, interfaceC18226d17, interfaceC18226d18, interfaceC18226d19, interfaceC18226d20, interfaceC18226d21, interfaceC18226d22, interfaceC18226d23);
    }

    public static HomeViewModel newInstance(yo.k kVar, zl.k kVar2, C18335a c18335a, C15052a c15052a, C14536a c14536a, Ch.e eVar, Ch.c cVar, InterfaceC14523a interfaceC14523a, C14781c c14781c, com.meijer.mobile.digitalshopping.api.orders.a aVar, C13702d c13702d, Yk.u uVar, fo.e eVar2, wr.f fVar, C17115a c17115a, C15053b c15053b, C15058b c15058b, pp.d dVar, Dl.e eVar3, C16753b c16753b, Tq.j jVar, Ro.c cVar2, AbstractC15779K abstractC15779K) {
        return new HomeViewModel(kVar, kVar2, c18335a, c15052a, c14536a, eVar, cVar, interfaceC14523a, c14781c, aVar, c13702d, uVar, eVar2, fVar, c17115a, c15053b, c15058b, dVar, eVar3, c16753b, jVar, cVar2, abstractC15779K);
    }

    @Override // gv.InterfaceC14411a
    public HomeViewModel get() {
        return newInstance(this.userManagerProvider.get(), this.featureManagerProvider.get(), this.appPrefManagerProvider.get(), this.homeRepositoryProvider.get(), this.homeChipsRepositoryProvider.get(), this.profileRepositoryProvider.get(), this.accountsAMSRepositoryProvider.get(), this.analyticsEngineProvider.get(), this.orderStatusRepositoryProvider.get(), this.ordersRepositoryProvider.get(), this.couponsRepositoryProvider.get(), this.couponsStateRepositoryProvider.get(), this.rewardsRepositoryProvider.get(), this.cartInteractorProvider.get(), this.multiChannelProductsStateRepositoryProvider.get(), this.marketingBannerRepositoryProvider.get(), this.productRecommendationsRepositoryProvider.get(), this.productMetadataStoreProvider.get(), this.deeplinkParserProvider.get(), this.beaconClientProvider.get(), this.storeProvider.get(), this.productsRepositoryProvider.get(), this.ioDispatcherProvider.get());
    }

    private HomeViewModel_Factory(InterfaceC18226d<yo.k> interfaceC18226d, InterfaceC18226d<zl.k> interfaceC18226d2, InterfaceC18226d<C18335a> interfaceC18226d3, InterfaceC18226d<C15052a> interfaceC18226d4, InterfaceC18226d<C14536a> interfaceC18226d5, InterfaceC18226d<Ch.e> interfaceC18226d6, InterfaceC18226d<Ch.c> interfaceC18226d7, InterfaceC18226d<InterfaceC14523a> interfaceC18226d8, InterfaceC18226d<C14781c> interfaceC18226d9, InterfaceC18226d<com.meijer.mobile.digitalshopping.api.orders.a> interfaceC18226d10, InterfaceC18226d<C13702d> interfaceC18226d11, InterfaceC18226d<Yk.u> interfaceC18226d12, InterfaceC18226d<fo.e> interfaceC18226d13, InterfaceC18226d<wr.f> interfaceC18226d14, InterfaceC18226d<C17115a> interfaceC18226d15, InterfaceC18226d<C15053b> interfaceC18226d16, InterfaceC18226d<C15058b> interfaceC18226d17, InterfaceC18226d<pp.d> interfaceC18226d18, InterfaceC18226d<Dl.e> interfaceC18226d19, InterfaceC18226d<C16753b> interfaceC18226d20, InterfaceC18226d<Tq.j> interfaceC18226d21, InterfaceC18226d<Ro.c> interfaceC18226d22, InterfaceC18226d<AbstractC15779K> interfaceC18226d23) {
        this.userManagerProvider = interfaceC18226d;
        this.featureManagerProvider = interfaceC18226d2;
        this.appPrefManagerProvider = interfaceC18226d3;
        this.homeRepositoryProvider = interfaceC18226d4;
        this.homeChipsRepositoryProvider = interfaceC18226d5;
        this.profileRepositoryProvider = interfaceC18226d6;
        this.accountsAMSRepositoryProvider = interfaceC18226d7;
        this.analyticsEngineProvider = interfaceC18226d8;
        this.orderStatusRepositoryProvider = interfaceC18226d9;
        this.ordersRepositoryProvider = interfaceC18226d10;
        this.couponsRepositoryProvider = interfaceC18226d11;
        this.couponsStateRepositoryProvider = interfaceC18226d12;
        this.rewardsRepositoryProvider = interfaceC18226d13;
        this.cartInteractorProvider = interfaceC18226d14;
        this.multiChannelProductsStateRepositoryProvider = interfaceC18226d15;
        this.marketingBannerRepositoryProvider = interfaceC18226d16;
        this.productRecommendationsRepositoryProvider = interfaceC18226d17;
        this.productMetadataStoreProvider = interfaceC18226d18;
        this.deeplinkParserProvider = interfaceC18226d19;
        this.beaconClientProvider = interfaceC18226d20;
        this.storeProvider = interfaceC18226d21;
        this.productsRepositoryProvider = interfaceC18226d22;
        this.ioDispatcherProvider = interfaceC18226d23;
    }
}
