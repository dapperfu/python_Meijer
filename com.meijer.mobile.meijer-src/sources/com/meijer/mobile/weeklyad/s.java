package com.meijer.mobile.weeklyad;

import Kk.AppVersion;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes12.dex */
public final class s implements InterfaceC15612a<WeeklyAdSelectionActivity> {
    public static void a(WeeklyAdSelectionActivity weeklyAdSelectionActivity, InterfaceC14523a interfaceC14523a) {
        weeklyAdSelectionActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(WeeklyAdSelectionActivity weeklyAdSelectionActivity, AppVersion appVersion) {
        weeklyAdSelectionActivity.appVersion = appVersion;
    }

    public static void c(WeeklyAdSelectionActivity weeklyAdSelectionActivity, Bl.g gVar) {
        weeklyAdSelectionActivity.featureEntryPoint = gVar;
    }

    public static void d(WeeklyAdSelectionActivity weeklyAdSelectionActivity, zl.k kVar) {
        weeklyAdSelectionActivity.featureManager = kVar;
    }

    public static void e(WeeklyAdSelectionActivity weeklyAdSelectionActivity, yo.k kVar) {
        weeklyAdSelectionActivity.userManager = kVar;
    }
}
