package com.meijer.mobile.accounts.ux.profile;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes8.dex */
public final class k implements InterfaceC15612a<ProfileScreenActivity> {
    public static void a(ProfileScreenActivity profileScreenActivity, InterfaceC14523a interfaceC14523a) {
        profileScreenActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(ProfileScreenActivity profileScreenActivity, Bl.g gVar) {
        profileScreenActivity.featureEntryPoint = gVar;
    }

    public static void c(ProfileScreenActivity profileScreenActivity, Dl.e eVar) {
        profileScreenActivity.meijerDeepLinkParser = eVar;
    }

    public static void d(ProfileScreenActivity profileScreenActivity, yo.k kVar) {
        profileScreenActivity.userManager = kVar;
    }

    public static void e(ProfileScreenActivity profileScreenActivity, String str) {
        profileScreenActivity.versionName = str;
    }
}
