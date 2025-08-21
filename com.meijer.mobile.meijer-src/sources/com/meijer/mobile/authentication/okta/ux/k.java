package com.meijer.mobile.authentication.okta.ux;

import lu.InterfaceC15612a;
import xj.C18187d;

/* loaded from: classes8.dex */
public final class k implements InterfaceC15612a<OktaLoginActivity> {
    public static void a(OktaLoginActivity oktaLoginActivity, C18187d c18187d) {
        oktaLoginActivity.firebaseLoggingUtil = c18187d;
    }

    public static void b(OktaLoginActivity oktaLoginActivity, Dl.e eVar) {
        oktaLoginActivity.meijerIntent = eVar;
    }
}
