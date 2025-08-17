package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class BVHostedAuthenticationProvider implements AuthenticationProvider {
    private final String callbackUrl;
    private final String uas;
    private final String userEmailAddress;

    public BVHostedAuthenticationProvider(String str, String str2) {
        this.userEmailAddress = str;
        this.callbackUrl = str2;
        this.uas = "";
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public String getUas() {
        return this.uas;
    }

    public String getUserEmailAddress() {
        return this.userEmailAddress;
    }

    public BVHostedAuthenticationProvider(String str) {
        this.userEmailAddress = "";
        this.callbackUrl = "";
        this.uas = str;
    }
}
