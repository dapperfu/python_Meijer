package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.internal.zzaho;
import com.google.ads.interactivemedia.v3.internal.zzahr;

/* loaded from: classes4.dex */
public final class zzbc implements CompanionAd {
    private String apiFramework;
    private String resourceValue;
    private zzch size = zzch.create(0, 0);

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaho.zzf(this, obj, false, null, false, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getApiFramework() {
        return this.apiFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getResourceValue() {
        return this.resourceValue;
    }

    public int hashCode() {
        return zzahr.zza(this, new String[0]);
    }

    void setApiFramework(String str) {
        this.apiFramework = str;
    }

    void setResourceValue(String str) {
        this.resourceValue = str;
    }

    void setSize(zzch zzchVar) {
        this.size = zzchVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getHeight() {
        return this.size.height().intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getWidth() {
        return this.size.width().intValue();
    }

    public String toString() {
        return "CompanionAd [apiFramework=" + this.apiFramework + ", resourceUrl=" + this.resourceValue + ", width=" + this.size.width() + ", height=" + this.size.height() + "]";
    }
}
