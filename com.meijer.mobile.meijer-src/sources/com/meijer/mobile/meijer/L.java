package com.meijer.mobile.meijer;

import Kk.AppVersion;
import com.meijer.mobile.models.account.MPerksAccountManager;
import fi.C13998c;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import xj.C18187d;
import xm.C18197h;
import yo.C18335a;

/* loaded from: classes10.dex */
public final class L implements InterfaceC15612a<Meijer> {
    public static void a(Meijer meijer, C13998c c13998c) {
        meijer.adobeManager = c13998c;
    }

    public static void b(Meijer meijer, InterfaceC14523a interfaceC14523a) {
        meijer.analyticsEngine = interfaceC14523a;
    }

    public static void c(Meijer meijer, Pn.a aVar) {
        meijer.appIconObserver = aVar;
    }

    public static void d(Meijer meijer, C18335a c18335a) {
        meijer.appPrefManager = c18335a;
    }

    public static void e(Meijer meijer, AppVersion appVersion) {
        meijer.appVersion = appVersion;
    }

    public static void f(Meijer meijer, InterfaceC15783O interfaceC15783O) {
        meijer.applicationScope = interfaceC15783O;
    }

    public static void g(Meijer meijer, il.m mVar) {
        meijer.cartRepository = mVar;
    }

    public static void h(Meijer meijer, a5.h hVar) {
        meijer.coilImageLoader = hVar;
    }

    public static void i(Meijer meijer, com.google.firebase.crashlytics.a aVar) {
        meijer.crashlytics = aVar;
    }

    public static void j(Meijer meijer, Vn.b bVar) {
        meijer.emarsysManager = bVar;
    }

    public static void k(Meijer meijer, zl.k kVar) {
        meijer.featureManager = kVar;
    }

    public static void l(Meijer meijer, C18187d c18187d) {
        meijer.firebaseLoggingUtil = c18187d;
    }

    public static void m(Meijer meijer, Rn.I i10) {
        meijer.flyBuyManager = i10;
    }

    public static void n(Meijer meijer, C12686p c12686p) {
        meijer.fullStoryManager = c12686p;
    }

    public static void o(Meijer meijer, Rn.P p10) {
        meijer.geoFenceManager = p10;
    }

    public static void p(Meijer meijer, AbstractC15779K abstractC15779K) {
        meijer.ioDispatcher = abstractC15779K;
    }

    public static void q(Meijer meijer, MPerksAccountManager mPerksAccountManager) {
        meijer.mPerksAccountManager = mPerksAccountManager;
    }

    public static void r(Meijer meijer, C18197h c18197h) {
        meijer.mperksNotificationManager = c18197h;
    }

    public static void s(Meijer meijer, Rn.V v10) {
        meijer.pollingManager = v10;
    }

    public static void t(Meijer meijer, yo.f fVar) {
        meijer.storeManager = fVar;
    }

    public static void u(Meijer meijer, yo.k kVar) {
        meijer.userManager = kVar;
    }

    public static void v(Meijer meijer, P2.a aVar) {
        meijer.workerFactory = aVar;
    }
}
