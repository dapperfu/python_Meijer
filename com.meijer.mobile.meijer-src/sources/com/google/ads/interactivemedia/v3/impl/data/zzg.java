package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzps;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrr;

@zzps(zza = zzn.class)
/* loaded from: classes4.dex */
public abstract class zzg {
    public abstract int bitrate();

    public abstract boolean disableUi();

    public abstract boolean enableFocusSkipButton();

    public abstract boolean enablePreloading();

    public abstract int loadVideoTimeout();

    public abstract zzrm<String> mimeTypes();

    public abstract double playAdsAfterTime();

    abstract zzf toBuilder();

    public abstract zzrr<UiElement> uiElements();

    public static zzf builder(AdsRenderingSettings adsRenderingSettings) {
        zzh zzhVar = (zzh) adsRenderingSettings;
        zzl zzlVar = new zzl();
        zzlVar.setBitrate(zzhVar.getBitrateKbps());
        zzlVar.setDisableUi(zzhVar.getDisableUi());
        zzlVar.setEnablePreloading(zzhVar.getEnablePreloading());
        zzlVar.setEnableFocusSkipButton(zzhVar.getFocusSkipButtonWhenAvailable());
        zzlVar.setLoadVideoTimeout(zzhVar.getLoadVideoTimeout());
        zzlVar.setMimeTypes(zzhVar.getMimeTypes());
        zzlVar.setPlayAdsAfterTime(zzhVar.getPlayAdsAfterTime());
        zzlVar.setUiElements(zzhVar.getUiElements());
        return zzlVar;
    }
}
