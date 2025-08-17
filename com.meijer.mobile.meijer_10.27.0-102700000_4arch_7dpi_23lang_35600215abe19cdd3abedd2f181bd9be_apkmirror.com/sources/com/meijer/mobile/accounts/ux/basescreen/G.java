package com.meijer.mobile.accounts.ux.basescreen;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes7.dex */
public final class G implements InterfaceC16421a<YourAccountActivity> {
    public static void a(YourAccountActivity yourAccountActivity, InterfaceC14261a interfaceC14261a) {
        yourAccountActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(YourAccountActivity yourAccountActivity, yl.k kVar) {
        yourAccountActivity.featureManager = kVar;
    }

    public static void c(YourAccountActivity yourAccountActivity, Cl.e eVar) {
        yourAccountActivity.meijerDeepLinkParser = eVar;
    }
}
