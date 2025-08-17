package com.meijer.mobile.weeklyad;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes11.dex */
public final class A implements InterfaceC16421a<WeeklyAdViewActivity> {
    public static void a(WeeklyAdViewActivity weeklyAdViewActivity, InterfaceC14261a interfaceC14261a) {
        weeklyAdViewActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(WeeklyAdViewActivity weeklyAdViewActivity, Al.g gVar) {
        weeklyAdViewActivity.featureEntryPoint = gVar;
    }

    public static void c(WeeklyAdViewActivity weeklyAdViewActivity, Cl.e eVar) {
        weeklyAdViewActivity.meijerIntent = eVar;
    }

    public static void d(WeeklyAdViewActivity weeklyAdViewActivity, Tq.j jVar) {
        weeklyAdViewActivity.storeProvider = jVar;
    }
}
