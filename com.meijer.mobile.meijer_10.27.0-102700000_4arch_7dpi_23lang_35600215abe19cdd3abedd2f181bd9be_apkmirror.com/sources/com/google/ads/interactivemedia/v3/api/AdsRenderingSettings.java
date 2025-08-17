package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public interface AdsRenderingSettings {
    int getBitrateKbps();

    boolean getDisableUi();

    boolean getEnableCustomTabs();

    boolean getEnablePreloading();

    boolean getFocusSkipButtonWhenAvailable();

    List<String> getMimeTypes();

    void setBitrateKbps(int i10);

    void setDisableUi(boolean z10);

    void setEnableCustomTabs(boolean z10);

    void setEnablePreloading(boolean z10);

    void setFocusSkipButtonWhenAvailable(boolean z10);

    void setLoadVideoTimeout(int i10);

    void setMimeTypes(List<String> list);

    void setPlayAdsAfterTime(double d10);

    void setUiElements(Set<UiElement> set);
}
