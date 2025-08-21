package com.meijer.mobile.accounts.ux.basescreen;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes8.dex */
public final class G implements InterfaceC15612a<YourAccountActivity> {
    public static void a(YourAccountActivity yourAccountActivity, InterfaceC14523a interfaceC14523a) {
        yourAccountActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(YourAccountActivity yourAccountActivity, zl.k kVar) {
        yourAccountActivity.featureManager = kVar;
    }

    public static void c(YourAccountActivity yourAccountActivity, Dl.e eVar) {
        yourAccountActivity.meijerDeepLinkParser = eVar;
    }
}
