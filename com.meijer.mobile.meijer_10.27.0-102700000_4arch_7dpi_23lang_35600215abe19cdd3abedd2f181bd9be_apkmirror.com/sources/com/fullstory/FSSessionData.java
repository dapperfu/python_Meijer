package com.fullstory;

/* loaded from: classes.dex */
public final class FSSessionData {
    private final String sessionUrl;

    public FSSessionData(String str) {
        this.sessionUrl = str;
    }

    public String getCurrentSessionURL() {
        return this.sessionUrl;
    }
}
