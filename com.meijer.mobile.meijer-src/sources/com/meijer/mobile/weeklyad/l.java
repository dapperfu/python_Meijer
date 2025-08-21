package com.meijer.mobile.weeklyad;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes12.dex */
public final class l implements InterfaceC15612a<WeeklyAdDetailActivity> {
    public static void a(WeeklyAdDetailActivity weeklyAdDetailActivity, InterfaceC14523a interfaceC14523a) {
        weeklyAdDetailActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(WeeklyAdDetailActivity weeklyAdDetailActivity, zl.k kVar) {
        weeklyAdDetailActivity.featureManager = kVar;
    }

    public static void c(WeeklyAdDetailActivity weeklyAdDetailActivity, Ls.b bVar) {
        weeklyAdDetailActivity.getFlippWeeklyAdProductDetailsCall = bVar;
    }

    public static void d(WeeklyAdDetailActivity weeklyAdDetailActivity, Dl.e eVar) {
        weeklyAdDetailActivity.meijerIntent = eVar;
    }
}
