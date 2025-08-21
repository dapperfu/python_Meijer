package com.meijer.mobile.meijer.activity.settings;

import En.G;
import Kk.AppVersion;
import lu.InterfaceC15612a;

/* loaded from: classes10.dex */
public final class k implements InterfaceC15612a<HelpActivity> {
    public static void a(HelpActivity helpActivity, AppVersion appVersion) {
        helpActivity.appVersion = appVersion;
    }

    public static void b(HelpActivity helpActivity, zl.k kVar) {
        helpActivity.featureManager = kVar;
    }

    public static void c(HelpActivity helpActivity, G g10) {
        helpActivity.helpViewModel = g10;
    }

    public static void d(HelpActivity helpActivity, Dl.e eVar) {
        helpActivity.meijerIntent = eVar;
    }
}
