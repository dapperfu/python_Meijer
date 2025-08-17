package com.meijer.mobile.meijer.activity.find;

import Jk.AppVersion;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes9.dex */
public final class Y implements InterfaceC16421a<FindActivity> {
    public static void a(FindActivity findActivity, InterfaceC14261a interfaceC14261a) {
        findActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(FindActivity findActivity, AppVersion appVersion) {
        findActivity.appVersion = appVersion;
    }

    public static void c(FindActivity findActivity, yl.k kVar) {
        findActivity.featureManager = kVar;
    }

    public static void d(FindActivity findActivity, C12098m0 c12098m0) {
        findActivity.locationUpdatesProvider = c12098m0;
    }

    public static void e(FindActivity findActivity, Cl.e eVar) {
        findActivity.meijerIntent = eVar;
    }

    public static void f(FindActivity findActivity, Tq.j jVar) {
        findActivity.storeProvider = jVar;
    }
}
