package com.meijer.mobile.weeklyad;

import Jk.AppVersion;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes11.dex */
public final class s implements InterfaceC16421a<WeeklyAdSelectionActivity> {
    public static void a(WeeklyAdSelectionActivity weeklyAdSelectionActivity, InterfaceC14261a interfaceC14261a) {
        weeklyAdSelectionActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(WeeklyAdSelectionActivity weeklyAdSelectionActivity, AppVersion appVersion) {
        weeklyAdSelectionActivity.appVersion = appVersion;
    }

    public static void c(WeeklyAdSelectionActivity weeklyAdSelectionActivity, Al.g gVar) {
        weeklyAdSelectionActivity.featureEntryPoint = gVar;
    }

    public static void d(WeeklyAdSelectionActivity weeklyAdSelectionActivity, yl.k kVar) {
        weeklyAdSelectionActivity.featureManager = kVar;
    }

    public static void e(WeeklyAdSelectionActivity weeklyAdSelectionActivity, yo.k kVar) {
        weeklyAdSelectionActivity.userManager = kVar;
    }
}
