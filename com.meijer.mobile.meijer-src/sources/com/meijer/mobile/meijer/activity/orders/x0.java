package com.meijer.mobile.meijer.activity.orders;

import Kk.AppVersion;
import lu.InterfaceC15612a;
import tp.C17278c;

/* loaded from: classes10.dex */
public final class x0 implements InterfaceC15612a<OrdersActivity> {
    public static void a(OrdersActivity ordersActivity, AppVersion appVersion) {
        ordersActivity.appVersion = appVersion;
    }

    public static void b(OrdersActivity ordersActivity, Bl.g gVar) {
        ordersActivity.featureEntryPoint = gVar;
    }

    public static void c(OrdersActivity ordersActivity, zl.k kVar) {
        ordersActivity.featureManager = kVar;
    }

    public static void d(OrdersActivity ordersActivity, C17278c c17278c) {
        ordersActivity.rateAndTipUpdater = c17278c;
    }
}
