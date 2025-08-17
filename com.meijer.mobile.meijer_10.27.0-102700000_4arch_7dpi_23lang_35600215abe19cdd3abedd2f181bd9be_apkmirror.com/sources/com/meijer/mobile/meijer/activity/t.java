package com.meijer.mobile.meijer.activity;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes9.dex */
public final class t implements InterfaceC16421a<UniversalDeepLinkRedirectActivity> {
    public static void a(UniversalDeepLinkRedirectActivity universalDeepLinkRedirectActivity, InterfaceC14261a interfaceC14261a) {
        universalDeepLinkRedirectActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(UniversalDeepLinkRedirectActivity universalDeepLinkRedirectActivity, Cl.e eVar) {
        universalDeepLinkRedirectActivity.meijerIntent = eVar;
    }
}
