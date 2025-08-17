package com.meijer.mobile.coupon.di;

import Al.g;
import Cl.e;
import Jk.AppVersion;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import yl.k;

/* loaded from: classes9.dex */
public final class d implements InterfaceC16421a<CouponFeatureActivity> {
    public static void a(CouponFeatureActivity couponFeatureActivity, InterfaceC14261a interfaceC14261a) {
        couponFeatureActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(CouponFeatureActivity couponFeatureActivity, AppVersion appVersion) {
        couponFeatureActivity.appVersion = appVersion;
    }

    public static void c(CouponFeatureActivity couponFeatureActivity, g gVar) {
        couponFeatureActivity.featureEntryPoint = gVar;
    }

    public static void d(CouponFeatureActivity couponFeatureActivity, k kVar) {
        couponFeatureActivity.featureManager = kVar;
    }

    public static void e(CouponFeatureActivity couponFeatureActivity, e eVar) {
        couponFeatureActivity.meijerIntent = eVar;
    }

    public static void f(CouponFeatureActivity couponFeatureActivity, yo.k kVar) {
        couponFeatureActivity.userManager = kVar;
    }
}
