package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public final class zzmc {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e10) {
            FS.log_w("Ads", "", e10);
            return null;
        }
    }
}
