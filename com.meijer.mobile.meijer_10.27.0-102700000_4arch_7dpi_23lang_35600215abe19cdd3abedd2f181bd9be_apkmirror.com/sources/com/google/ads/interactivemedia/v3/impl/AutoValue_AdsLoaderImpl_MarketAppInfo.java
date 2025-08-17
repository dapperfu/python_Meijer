package com.google.ads.interactivemedia.v3.impl;

/* loaded from: classes4.dex */
final class AutoValue_AdsLoaderImpl_MarketAppInfo extends zzw {
    private final int appVersion;
    private final String packageName;

    @Override // com.google.ads.interactivemedia.v3.impl.zzw
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.appVersion == zzwVar.appVersion() && this.packageName.equals(zzwVar.packageName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzw
    public String packageName() {
        return this.packageName;
    }

    public int hashCode() {
        return ((this.appVersion ^ 1000003) * 1000003) ^ this.packageName.hashCode();
    }

    public String toString() {
        return "MarketAppInfo{appVersion=" + this.appVersion + ", packageName=" + this.packageName + "}";
    }

    AutoValue_AdsLoaderImpl_MarketAppInfo(int i10, String str) {
        this.appVersion = i10;
        if (str != null) {
            this.packageName = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }
}
