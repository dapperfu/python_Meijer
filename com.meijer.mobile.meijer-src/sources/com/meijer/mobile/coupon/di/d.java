package com.meijer.mobile.coupon.di;

import Bl.g;
import Dl.e;
import Kk.AppVersion;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import zl.k;

/* loaded from: classes10.dex */
public final class d implements InterfaceC15612a<CouponFeatureActivity> {
    public static void a(CouponFeatureActivity couponFeatureActivity, InterfaceC14523a interfaceC14523a) {
        couponFeatureActivity.analyticsEngine = interfaceC14523a;
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
