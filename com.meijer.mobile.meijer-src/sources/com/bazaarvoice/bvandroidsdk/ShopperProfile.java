package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class ShopperProfile {

    @InterfaceC16127c("api_version")
    private String apiVersion;
    private Profile profile;

    public String getApiVersion() {
        return this.apiVersion;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public String toString() {
        return "ShopperProfile{profile=" + this.profile + '}';
    }
}
