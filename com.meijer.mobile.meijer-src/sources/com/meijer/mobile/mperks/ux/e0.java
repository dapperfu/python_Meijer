package com.meijer.mobile.mperks.ux;

import Kk.AppVersion;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import yo.C18335a;

/* loaded from: classes10.dex */
public final class e0 implements InterfaceC15612a<MperksFeatureActivity> {
    public static void a(MperksFeatureActivity mperksFeatureActivity, InterfaceC14523a interfaceC14523a) {
        mperksFeatureActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(MperksFeatureActivity mperksFeatureActivity, C18335a c18335a) {
        mperksFeatureActivity.appPrefManager = c18335a;
    }

    public static void c(MperksFeatureActivity mperksFeatureActivity, AppVersion appVersion) {
        mperksFeatureActivity.appVersion = appVersion;
    }

    public static void d(MperksFeatureActivity mperksFeatureActivity, Bl.g gVar) {
        mperksFeatureActivity.featureEntryPoint = gVar;
    }

    public static void e(MperksFeatureActivity mperksFeatureActivity, zl.k kVar) {
        mperksFeatureActivity.featureManager = kVar;
    }

    public static void f(MperksFeatureActivity mperksFeatureActivity, Dl.e eVar) {
        mperksFeatureActivity.meijerIntent = eVar;
    }

    public static void g(MperksFeatureActivity mperksFeatureActivity, yo.k kVar) {
        mperksFeatureActivity.userManager = kVar;
    }
}
