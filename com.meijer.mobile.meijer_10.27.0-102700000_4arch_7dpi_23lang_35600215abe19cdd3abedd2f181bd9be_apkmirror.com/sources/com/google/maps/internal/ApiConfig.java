package com.google.maps.internal;

import com.google.gson.c;

/* loaded from: classes7.dex */
public class ApiConfig {
    public String path;
    public c fieldNamingPolicy = c.f89420e;
    public String hostName = "https://maps.googleapis.com";
    public boolean supportsClientId = true;
    public String requestVerb = "GET";

    public ApiConfig fieldNamingPolicy(c cVar) {
        this.fieldNamingPolicy = cVar;
        return this;
    }

    public ApiConfig hostName(String str) {
        this.hostName = str;
        return this;
    }

    public ApiConfig requestVerb(String str) {
        this.requestVerb = str;
        return this;
    }

    public ApiConfig supportsClientId(boolean z10) {
        this.supportsClientId = z10;
        return this;
    }

    public ApiConfig(String str) {
        this.path = str;
    }
}
