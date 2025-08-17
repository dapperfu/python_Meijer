package com.meijer.mobile.meijer.activity.store;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import yl.k;

/* loaded from: classes9.dex */
public final class f implements InterfaceC16421a<StoreDetailActivity> {
    public static void a(StoreDetailActivity storeDetailActivity, InterfaceC14261a interfaceC14261a) {
        storeDetailActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(StoreDetailActivity storeDetailActivity, k kVar) {
        storeDetailActivity.featureManager = kVar;
    }

    public static void c(StoreDetailActivity storeDetailActivity, Tn.a aVar) {
        storeDetailActivity.geoFenceStoreSetupPermissions = aVar;
    }

    public static void d(StoreDetailActivity storeDetailActivity, Cl.e eVar) {
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
