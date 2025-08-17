package com.meijer.mobile.home.ux;

import Jk.AppVersion;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import tp.C17129c;
import um.C17279b;
import wm.C17838h;
import yl.C18223b;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class U implements InterfaceC16421a<HomeComposeActivity> {
    public static void a(HomeComposeActivity homeComposeActivity, InterfaceC14261a interfaceC14261a) {
        homeComposeActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(HomeComposeActivity homeComposeActivity, C17279b c17279b) {
        homeComposeActivity.appBackgroundManager = c17279b;
    }

    public static void c(HomeComposeActivity homeComposeActivity, C18264a c18264a) {
        homeComposeActivity.appPrefManager = c18264a;
    }

    public static void d(HomeComposeActivity homeComposeActivity, C18223b c18223b) {
        homeComposeActivity.appUpdateConfigManager = c18223b;
    }

    public static void e(HomeComposeActivity homeComposeActivity, AppVersion appVersion) {
        homeComposeActivity.appVersion = appVersion;
    }

    public static void f(HomeComposeActivity homeComposeActivity, Al.g gVar) {
        homeComposeActivity.featureEntryPoint = gVar;
    }

    public static void g(HomeComposeActivity homeComposeActivity, yl.k kVar) {
        homeComposeActivity.featureManager = kVar;
    }

    public static void h(HomeComposeActivity homeComposeActivity, Fh.b bVar) {
        homeComposeActivity.inboxManager = bVar;
    }

    public static void i(HomeComposeActivity homeComposeActivity, Cl.e eVar) {
        homeComposeActivity.meijerIntent = eVar;
    }

    public static void j(HomeComposeActivity homeComposeActivity, C17838h c17838h) {
        homeComposeActivity.notificationManager = c17838h;
    }

    public static void k(HomeComposeActivity homeComposeActivity, Bh.d dVar) {
        homeComposeActivity.preferencesRepository = dVar;
    }

    public static void l(HomeComposeActivity homeComposeActivity, C17129c c17129c) {
        homeComposeActivity.rateAndTipUpdater = c17129c;
    }

    public static void m(HomeComposeActivity homeComposeActivity, Tq.j jVar) {
        homeComposeActivity.storeProvider = jVar;
    }

    public static void n(HomeComposeActivity homeComposeActivity, yo.k kVar) {
        homeComposeActivity.userManager = kVar;
    }
}
