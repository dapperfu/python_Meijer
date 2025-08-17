package com.google.ads.interactivemedia.pal;

/* loaded from: classes4.dex */
enum zzu {
    ERROR_CODE("errcode"),
    NONCE_LENGTH("length"),
    NONCE_LOADED_TIME("nonload"),
    NONCE_LOADER_INIT_TIME("loaderinit"),
    NONCE_REQUESTED_TIME("nonreq"),
    SERVICE_END_TIME("srvcend"),
    SERVICE_START_TIME("srvcstrt");

    private final String zzi;

    final String zza() {
        return this.zzi;
    }

    zzu(String str) {
        this.zzi = str;
    }
}
