package com.meijer.mobile.home.ux;

import Kk.AppVersion;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import tp.C17278c;
import vm.C17693b;
import xm.C18197h;
import yo.C18335a;
import zl.C18499b;

/* loaded from: classes10.dex */
public final class U implements InterfaceC15612a<HomeComposeActivity> {
    public static void a(HomeComposeActivity homeComposeActivity, InterfaceC14523a interfaceC14523a) {
        homeComposeActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(HomeComposeActivity homeComposeActivity, C17693b c17693b) {
        homeComposeActivity.appBackgroundManager = c17693b;
    }

    public static void c(HomeComposeActivity homeComposeActivity, C18335a c18335a) {
        homeComposeActivity.appPrefManager = c18335a;
    }

    public static void d(HomeComposeActivity homeComposeActivity, C18499b c18499b) {
        homeComposeActivity.appUpdateConfigManager = c18499b;
    }

    public static void e(HomeComposeActivity homeComposeActivity, AppVersion appVersion) {
        homeComposeActivity.appVersion = appVersion;
    }

    public static void f(HomeComposeActivity homeComposeActivity, Bl.g gVar) {
        homeComposeActivity.featureEntryPoint = gVar;
    }

    public static void g(HomeComposeActivity homeComposeActivity, zl.k kVar) {
        homeComposeActivity.featureManager = kVar;
    }

    public static void h(HomeComposeActivity homeComposeActivity, Gh.b bVar) {
        homeComposeActivity.inboxManager = bVar;
    }

    public static void i(HomeComposeActivity homeComposeActivity, Dl.e eVar) {
        homeComposeActivity.meijerIntent = eVar;
    }

    public static void j(HomeComposeActivity homeComposeActivity, C18197h c18197h) {
        homeComposeActivity.notificationManager = c18197h;
    }

    public static void k(HomeComposeActivity homeComposeActivity, Ch.d dVar) {
        homeComposeActivity.preferencesRepository = dVar;
    }

    public static void l(HomeComposeActivity homeComposeActivity, C17278c c17278c) {
        homeComposeActivity.rateAndTipUpdater = c17278c;
    }

    public static void m(HomeComposeActivity homeComposeActivity, Tq.j jVar) {
        homeComposeActivity.storeProvider = jVar;
    }

    public static void n(HomeComposeActivity homeComposeActivity, yo.k kVar) {
        homeComposeActivity.userManager = kVar;
    }
}
