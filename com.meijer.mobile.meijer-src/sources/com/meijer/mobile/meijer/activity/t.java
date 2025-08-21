package com.meijer.mobile.meijer.activity;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes10.dex */
public final class t implements InterfaceC15612a<UniversalDeepLinkRedirectActivity> {
    public static void a(UniversalDeepLinkRedirectActivity universalDeepLinkRedirectActivity, InterfaceC14523a interfaceC14523a) {
        universalDeepLinkRedirectActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(UniversalDeepLinkRedirectActivity universalDeepLinkRedirectActivity, Dl.e eVar) {
        universalDeepLinkRedirectActivity.meijerIntent = eVar;
    }
}
