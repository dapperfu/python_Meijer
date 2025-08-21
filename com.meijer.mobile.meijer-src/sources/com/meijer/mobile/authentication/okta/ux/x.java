package com.meijer.mobile.authentication.okta.ux;

import com.meijer.mobile.authentication.okta.ux.A;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import xj.C18187d;

/* loaded from: classes8.dex */
public final class x implements InterfaceC15612a<OktaLogoutActivity> {
    public static void a(OktaLogoutActivity oktaLogoutActivity, InterfaceC14523a interfaceC14523a) {
        oktaLogoutActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(OktaLogoutActivity oktaLogoutActivity, C18187d c18187d) {
        oktaLogoutActivity.firebaseLoggingUtil = c18187d;
    }

    public static void c(OktaLogoutActivity oktaLogoutActivity, Dl.e eVar) {
        oktaLogoutActivity.meijerIntent = eVar;
    }

    public static void d(OktaLogoutActivity oktaLogoutActivity, A.b bVar) {
        oktaLogoutActivity.vmFactory = bVar;
    }
}
