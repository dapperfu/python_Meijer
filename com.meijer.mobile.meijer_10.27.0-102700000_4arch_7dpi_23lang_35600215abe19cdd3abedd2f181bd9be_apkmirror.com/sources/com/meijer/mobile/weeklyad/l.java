package com.meijer.mobile.weeklyad;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes11.dex */
public final class l implements InterfaceC16421a<WeeklyAdDetailActivity> {
    public static void a(WeeklyAdDetailActivity weeklyAdDetailActivity, InterfaceC14261a interfaceC14261a) {
        weeklyAdDetailActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(WeeklyAdDetailActivity weeklyAdDetailActivity, yl.k kVar) {
        weeklyAdDetailActivity.featureManager = kVar;
    }

    public static void c(WeeklyAdDetailActivity weeklyAdDetailActivity, Ls.b bVar) {
        weeklyAdDetailActivity.getFlippWeeklyAdProductDetailsCall = bVar;
    }

    public static void d(WeeklyAdDetailActivity weeklyAdDetailActivity, Cl.e eVar) {
        weeklyAdDetailActivity.meijerIntent = eVar;
    }
}
