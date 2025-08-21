package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;

/* loaded from: classes4.dex */
public final class zzfq {
    public static boolean zza(BaseDisplayContainer baseDisplayContainer, com.google.ads.interactivemedia.v3.impl.data.zzce zzceVar) {
        int width = baseDisplayContainer.getAdContainer().getWidth();
        int height = baseDisplayContainer.getAdContainer().getHeight();
        if (zzceVar.x().intValue() >= 0 && zzceVar.width().intValue() >= 0 && zzceVar.x().intValue() + zzceVar.width().intValue() <= width && zzceVar.y().intValue() >= 0 && zzceVar.height().intValue() >= 0 && zzceVar.y().intValue() + zzceVar.height().intValue() <= height) {
            return true;
        }
        return false;
    }
}
