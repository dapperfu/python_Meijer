package com.meijer.mobile.accounts.ux.basescreen;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* loaded from: classes8.dex */
public final class o implements InterfaceC15612a<AccountOverviewActivity> {
    public static void a(AccountOverviewActivity accountOverviewActivity, InterfaceC14523a interfaceC14523a) {
        accountOverviewActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(AccountOverviewActivity accountOverviewActivity, zl.k kVar) {
        accountOverviewActivity.featureManager = kVar;
    }

    public static void c(AccountOverviewActivity accountOverviewActivity, Dl.e eVar) {
        accountOverviewActivity.meijerDeepLinkParser = eVar;
    }
}
