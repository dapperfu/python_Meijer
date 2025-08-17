package com.google.ads.interactivemedia.v3.internal;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes4.dex */
public final class zzdk {
    private static UiModeManager zza;

    public static com.google.ads.interactivemedia.omid.library.adsession.zzg zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return com.google.ads.interactivemedia.omid.library.adsession.zzg.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? com.google.ads.interactivemedia.omid.library.adsession.zzg.OTHER : com.google.ads.interactivemedia.omid.library.adsession.zzg.CTV : com.google.ads.interactivemedia.omid.library.adsession.zzg.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
