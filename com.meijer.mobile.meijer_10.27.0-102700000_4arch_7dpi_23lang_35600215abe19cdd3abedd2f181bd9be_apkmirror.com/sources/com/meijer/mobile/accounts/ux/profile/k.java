package com.meijer.mobile.accounts.ux.profile;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes7.dex */
public final class k implements InterfaceC16421a<ProfileScreenActivity> {
    public static void a(ProfileScreenActivity profileScreenActivity, InterfaceC14261a interfaceC14261a) {
        profileScreenActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(ProfileScreenActivity profileScreenActivity, Al.g gVar) {
        profileScreenActivity.featureEntryPoint = gVar;
    }

    public static void c(ProfileScreenActivity profileScreenActivity, Cl.e eVar) {
        profileScreenActivity.meijerDeepLinkParser = eVar;
    }

    public static void d(ProfileScreenActivity profileScreenActivity, yo.k kVar) {
        profileScreenActivity.userManager = kVar;
    }

    public static void e(ProfileScreenActivity profileScreenActivity, String str) {
        profileScreenActivity.versionName = str;
    }
}
