package com.meijer.mobile.meijer.activity.settings;

import Dn.G;
import Jk.AppVersion;
import pu.InterfaceC16421a;

/* loaded from: classes9.dex */
public final class k implements InterfaceC16421a<HelpActivity> {
    public static void a(HelpActivity helpActivity, AppVersion appVersion) {
        helpActivity.appVersion = appVersion;
    }

    public static void b(HelpActivity helpActivity, yl.k kVar) {
        helpActivity.featureManager = kVar;
    }

    public static void c(HelpActivity helpActivity, G g10) {
        helpActivity.helpViewModel = g10;
    }

    public static void d(HelpActivity helpActivity, Cl.e eVar) {
        helpActivity.meijerIntent = eVar;
    }
}
