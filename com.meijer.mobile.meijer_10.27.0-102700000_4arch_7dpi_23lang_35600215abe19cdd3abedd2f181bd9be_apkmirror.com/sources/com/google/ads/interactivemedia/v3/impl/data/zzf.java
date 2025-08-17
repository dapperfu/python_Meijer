package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzf {
    public abstract zzg build();

    abstract zzf setBitrate(int i10);

    abstract zzf setDisableUi(boolean z10);

    abstract zzf setEnableFocusSkipButton(boolean z10);

    abstract zzf setEnablePreloading(boolean z10);

    abstract zzf setLoadVideoTimeout(int i10);

    abstract zzf setMimeTypes(List<String> list);

    abstract zzf setPlayAdsAfterTime(double d10);

    abstract zzf setUiElements(Set<UiElement> set);
}
