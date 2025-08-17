package com.google.ads.interactivemedia.pal;

import io.constructor.data.local.PreferencesHelper;

/* loaded from: classes4.dex */
enum zzr {
    CORRELATOR("c"),
    EVENT_ID("lid"),
    LOGGER_ID(PreferencesHelper.PREF_ID),
    PALV("palv"),
    SDKV("sdkv");

    private final String zzg;

    final String zza() {
        return this.zzg;
    }

    zzr(String str) {
        this.zzg = str;
    }
}
