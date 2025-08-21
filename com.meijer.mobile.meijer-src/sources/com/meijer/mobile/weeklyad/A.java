package com.meijer.mobile.weeklyad;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes12.dex */
public final class A implements InterfaceC15612a<WeeklyAdViewActivity> {
    public static void a(WeeklyAdViewActivity weeklyAdViewActivity, InterfaceC14523a interfaceC14523a) {
        weeklyAdViewActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(WeeklyAdViewActivity weeklyAdViewActivity, Bl.g gVar) {
        weeklyAdViewActivity.featureEntryPoint = gVar;
    }

    public static void c(WeeklyAdViewActivity weeklyAdViewActivity, Dl.e eVar) {
        weeklyAdViewActivity.meijerIntent = eVar;
    }

    public static void d(WeeklyAdViewActivity weeklyAdViewActivity, Tq.j jVar) {
        weeklyAdViewActivity.storeProvider = jVar;
    }
}
