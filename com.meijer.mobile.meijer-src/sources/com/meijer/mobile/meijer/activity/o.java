package com.meijer.mobile.meijer.activity;

import Rn.C5283i;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import vm.C17693b;
import xj.C18187d;
import xm.C18197h;
import yo.C18335a;
import zj.InterfaceC18491a;
import zl.C18499b;

/* loaded from: classes10.dex */
public final class o implements InterfaceC15612a<MeijerActivity> {
    public static void a(MeijerActivity meijerActivity, InterfaceC14523a interfaceC14523a) {
        meijerActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(MeijerActivity meijerActivity, C17693b c17693b) {
        meijerActivity.appBackgroundManager = c17693b;
    }

    public static void c(MeijerActivity meijerActivity, C18335a c18335a) {
        meijerActivity.appPrefManager = c18335a;
    }

    public static void d(MeijerActivity meijerActivity, C18499b c18499b) {
        meijerActivity.appUpdateConfigManager = c18499b;
    }

    public static void e(MeijerActivity meijerActivity, Dk.b bVar) {
        meijerActivity.baseBus = bVar;
    }

    public static void f(MeijerActivity meijerActivity, C5283i c5283i) {
        meijerActivity.connectionChangeHelper = c5283i;
    }

    public static void g(MeijerActivity meijerActivity, Bl.g gVar) {
        meijerActivity.featureEntryPoint = gVar;
    }

    public static void h(MeijerActivity meijerActivity, zl.k kVar) {
        meijerActivity.featureManager = kVar;
    }

    public static void i(MeijerActivity meijerActivity, C18187d c18187d) {
        meijerActivity.firebaseLoggingUtil = c18187d;
    }

    public static void j(MeijerActivity meijerActivity, InterfaceC18491a interfaceC18491a) {
        meijerActivity.firebasePerformanceEngine = interfaceC18491a;
    }

    public static void k(MeijerActivity meijerActivity, Dl.e eVar) {
        meijerActivity.meijerIntent = eVar;
    }

    public static void l(MeijerActivity meijerActivity, C18197h c18197h) {
        meijerActivity.notificationManager = c18197h;
    }

    public static void m(MeijerActivity meijerActivity, yo.k kVar) {
        meijerActivity.userManager = kVar;
    }
}
