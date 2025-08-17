package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class SiteAuthenticationProvider implements AuthenticationProvider {
    private final String uas;

    public String getUas() {
        return this.uas;
    }

    public SiteAuthenticationProvider(String str) {
        this.uas = str;
    }
}
