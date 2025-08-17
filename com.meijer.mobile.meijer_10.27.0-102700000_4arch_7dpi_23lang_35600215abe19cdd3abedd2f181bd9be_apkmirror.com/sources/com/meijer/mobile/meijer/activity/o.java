package com.meijer.mobile.meijer.activity;

import Qn.C5145i;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import um.C17279b;
import wj.C17828d;
import wm.C17838h;
import yj.InterfaceC18215a;
import yl.C18223b;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class o implements InterfaceC16421a<MeijerActivity> {
    public static void a(MeijerActivity meijerActivity, InterfaceC14261a interfaceC14261a) {
        meijerActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(MeijerActivity meijerActivity, C17279b c17279b) {
        meijerActivity.appBackgroundManager = c17279b;
    }

    public static void c(MeijerActivity meijerActivity, C18264a c18264a) {
        meijerActivity.appPrefManager = c18264a;
    }

    public static void d(MeijerActivity meijerActivity, C18223b c18223b) {
        meijerActivity.appUpdateConfigManager = c18223b;
    }

    public static void e(MeijerActivity meijerActivity, Ck.b bVar) {
        meijerActivity.baseBus = bVar;
    }

    public static void f(MeijerActivity meijerActivity, C5145i c5145i) {
        meijerActivity.connectionChangeHelper = c5145i;
    }

    public static void g(MeijerActivity meijerActivity, Al.g gVar) {
        meijerActivity.featureEntryPoint = gVar;
    }

    public static void h(MeijerActivity meijerActivity, yl.k kVar) {
        meijerActivity.featureManager = kVar;
    }

    public static void i(MeijerActivity meijerActivity, C17828d c17828d) {
        meijerActivity.firebaseLoggingUtil = c17828d;
    }

    public static void j(MeijerActivity meijerActivity, InterfaceC18215a interfaceC18215a) {
        meijerActivity.firebasePerformanceEngine = interfaceC18215a;
    }

    public static void k(MeijerActivity meijerActivity, Cl.e eVar) {
        meijerActivity.meijerIntent = eVar;
    }

    public static void l(MeijerActivity meijerActivity, C17838h c17838h) {
        meijerActivity.notificationManager = c17838h;
    }

    public static void m(MeijerActivity meijerActivity, yo.k kVar) {
        meijerActivity.userManager = kVar;
    }
}
