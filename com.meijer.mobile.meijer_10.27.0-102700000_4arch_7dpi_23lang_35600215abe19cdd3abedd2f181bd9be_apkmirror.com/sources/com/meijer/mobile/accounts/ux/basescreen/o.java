package com.meijer.mobile.accounts.ux.basescreen;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes7.dex */
public final class o implements InterfaceC16421a<AccountOverviewActivity> {
    public static void a(AccountOverviewActivity accountOverviewActivity, InterfaceC14261a interfaceC14261a) {
        accountOverviewActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(AccountOverviewActivity accountOverviewActivity, yl.k kVar) {
        accountOverviewActivity.featureManager = kVar;
    }

    public static void c(AccountOverviewActivity accountOverviewActivity, Cl.e eVar) {
        accountOverviewActivity.meijerDeepLinkParser = eVar;
    }
}
