package com.meijer.mobile.mperks.ux;

import Jk.AppVersion;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class e0 implements InterfaceC16421a<MperksFeatureActivity> {
    public static void a(MperksFeatureActivity mperksFeatureActivity, InterfaceC14261a interfaceC14261a) {
        mperksFeatureActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(MperksFeatureActivity mperksFeatureActivity, C18264a c18264a) {
        mperksFeatureActivity.appPrefManager = c18264a;
    }

    public static void c(MperksFeatureActivity mperksFeatureActivity, AppVersion appVersion) {
        mperksFeatureActivity.appVersion = appVersion;
    }

    public static void d(MperksFeatureActivity mperksFeatureActivity, Al.g gVar) {
        mperksFeatureActivity.featureEntryPoint = gVar;
    }

    public static void e(MperksFeatureActivity mperksFeatureActivity, yl.k kVar) {
        mperksFeatureActivity.featureManager = kVar;
    }

    public static void f(MperksFeatureActivity mperksFeatureActivity, Cl.e eVar) {
        mperksFeatureActivity.meijerIntent = eVar;
    }

    public static void g(MperksFeatureActivity mperksFeatureActivity, yo.k kVar) {
        mperksFeatureActivity.userManager = kVar;
    }
}
