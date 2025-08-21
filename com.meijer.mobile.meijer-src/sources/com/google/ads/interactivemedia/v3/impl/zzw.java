package com.google.ads.interactivemedia.v3.impl;

/* loaded from: classes4.dex */
public abstract class zzw {
    public abstract int appVersion();

    public abstract String packageName();

    public static zzw create(int i10, String str) {
        return new AutoValue_AdsLoaderImpl_MarketAppInfo(i10, str);
    }
}
