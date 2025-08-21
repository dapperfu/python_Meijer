package com.meijer.mobile.meijer.activity.store;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import zl.k;

/* loaded from: classes10.dex */
public final class f implements InterfaceC15612a<StoreDetailActivity> {
    public static void a(StoreDetailActivity storeDetailActivity, InterfaceC14523a interfaceC14523a) {
        storeDetailActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(StoreDetailActivity storeDetailActivity, k kVar) {
        storeDetailActivity.featureManager = kVar;
    }

    public static void c(StoreDetailActivity storeDetailActivity, Un.a aVar) {
        storeDetailActivity.geoFenceStoreSetupPermissions = aVar;
    }

    public static void d(StoreDetailActivity storeDetailActivity, Dl.e eVar) {
        storeDetailActivity.meijerIntent = eVar;
    }

    public static void e(StoreDetailActivity storeDetailActivity, Zq.b bVar) {
        storeDetailActivity.storeInfoRepository = bVar;
    }

    public static void f(StoreDetailActivity storeDetailActivity, yo.f fVar) {
        storeDetailActivity.storeManager = fVar;
    }

    public static void g(StoreDetailActivity storeDetailActivity, Cs.b bVar) {
        storeDetailActivity.userManager = bVar;
    }
}
