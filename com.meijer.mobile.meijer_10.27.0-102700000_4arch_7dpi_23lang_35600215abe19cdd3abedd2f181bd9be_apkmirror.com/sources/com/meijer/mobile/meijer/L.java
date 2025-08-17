package com.meijer.mobile.meijer;

import Jk.AppVersion;
import com.meijer.mobile.models.account.MPerksAccountManager;
import ei.C13666c;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import qv.AbstractC16618K;
import qv.InterfaceC16622O;
import wj.C17828d;
import wm.C17838h;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class L implements InterfaceC16421a<Meijer> {
    public static void a(Meijer meijer, C13666c c13666c) {
        meijer.adobeManager = c13666c;
    }

    public static void b(Meijer meijer, InterfaceC14261a interfaceC14261a) {
        meijer.analyticsEngine = interfaceC14261a;
    }

    public static void c(Meijer meijer, On.a aVar) {
        meijer.appIconObserver = aVar;
    }

    public static void d(Meijer meijer, C18264a c18264a) {
        meijer.appPrefManager = c18264a;
    }

    public static void e(Meijer meijer, AppVersion appVersion) {
        meijer.appVersion = appVersion;
    }

    public static void f(Meijer meijer, InterfaceC16622O interfaceC16622O) {
        meijer.applicationScope = interfaceC16622O;
    }

    public static void g(Meijer meijer, hl.m mVar) {
        meijer.cartRepository = mVar;
    }

    public static void h(Meijer meijer, Z4.h hVar) {
        meijer.coilImageLoader = hVar;
    }

    public static void i(Meijer meijer, com.google.firebase.crashlytics.a aVar) {
        meijer.crashlytics = aVar;
    }

    public static void j(Meijer meijer, Un.b bVar) {
        meijer.emarsysManager = bVar;
    }

    public static void k(Meijer meijer, yl.k kVar) {
        meijer.featureManager = kVar;
    }

    public static void l(Meijer meijer, C17828d c17828d) {
        meijer.firebaseLoggingUtil = c17828d;
    }

    public static void m(Meijer meijer, Qn.I i10) {
        meijer.flyBuyManager = i10;
    }

    public static void n(Meijer meijer, C12560p c12560p) {
        meijer.fullStoryManager = c12560p;
    }

    public static void o(Meijer meijer, Qn.P p10) {
        meijer.geoFenceManager = p10;
    }

    public static void p(Meijer meijer, AbstractC16618K abstractC16618K) {
        meijer.ioDispatcher = abstractC16618K;
    }

    public static void q(Meijer meijer, MPerksAccountManager mPerksAccountManager) {
        meijer.mPerksAccountManager = mPerksAccountManager;
    }

    public static void r(Meijer meijer, C17838h c17838h) {
        meijer.mperksNotificationManager = c17838h;
    }

    public static void s(Meijer meijer, com.squareup.picasso.o oVar) {
        meijer.picasso = oVar;
    }

    public static void t(Meijer meijer, Qn.V v10) {
        meijer.pollingManager = v10;
    }

    public static void u(Meijer meijer, yo.f fVar) {
        meijer.storeManager = fVar;
    }

    public static void v(Meijer meijer, yo.k kVar) {
        meijer.userManager = kVar;
    }

    public static void w(Meijer meijer, P2.a aVar) {
        meijer.workerFactory = aVar;
    }
}
