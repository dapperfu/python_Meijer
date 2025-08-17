package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class ShopperProfile {

    @InterfaceC15617c("api_version")
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
