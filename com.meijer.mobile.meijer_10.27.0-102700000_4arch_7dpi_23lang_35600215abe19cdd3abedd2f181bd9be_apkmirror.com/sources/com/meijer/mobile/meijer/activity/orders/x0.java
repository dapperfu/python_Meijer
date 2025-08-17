package com.meijer.mobile.meijer.activity.orders;

import Jk.AppVersion;
import pu.InterfaceC16421a;
import tp.C17129c;

/* loaded from: classes9.dex */
public final class x0 implements InterfaceC16421a<OrdersActivity> {
    public static void a(OrdersActivity ordersActivity, AppVersion appVersion) {
        ordersActivity.appVersion = appVersion;
    }

    public static void b(OrdersActivity ordersActivity, Al.g gVar) {
        ordersActivity.featureEntryPoint = gVar;
    }

    public static void c(OrdersActivity ordersActivity, yl.k kVar) {
        ordersActivity.featureManager = kVar;
    }

    public static void d(OrdersActivity ordersActivity, C17129c c17129c) {
        ordersActivity.rateAndTipUpdater = c17129c;
    }
}
