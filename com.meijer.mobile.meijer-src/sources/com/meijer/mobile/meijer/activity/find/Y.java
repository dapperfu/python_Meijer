package com.meijer.mobile.meijer.activity.find;

import Kk.AppVersion;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes10.dex */
public final class Y implements InterfaceC15612a<FindActivity> {
    public static void a(FindActivity findActivity, InterfaceC14523a interfaceC14523a) {
        findActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(FindActivity findActivity, AppVersion appVersion) {
        findActivity.appVersion = appVersion;
    }

    public static void c(FindActivity findActivity, zl.k kVar) {
        findActivity.featureManager = kVar;
    }

    public static void d(FindActivity findActivity, C12223m0 c12223m0) {
        findActivity.locationUpdatesProvider = c12223m0;
    }

    public static void e(FindActivity findActivity, Dl.e eVar) {
        findActivity.meijerIntent = eVar;
    }

    public static void f(FindActivity findActivity, Tq.j jVar) {
        findActivity.storeProvider = jVar;
    }
}
