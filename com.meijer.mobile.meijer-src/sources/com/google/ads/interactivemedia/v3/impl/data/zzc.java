package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.UniversalAdId;
import com.google.ads.interactivemedia.v3.internal.zzaho;
import com.google.ads.interactivemedia.v3.internal.zzahp;
import com.google.ads.interactivemedia.v3.internal.zzahr;
import com.google.ads.interactivemedia.v3.internal.zzahs;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzc implements Ad {
    private String adId;
    private String adSystem;
    private com.google.ads.interactivemedia.v3.api.zza adUi;
    private String advertiserName;
    private String clickThroughUrl;
    private String contentType;
    private String creativeAdId;
    private String creativeId;
    private String dealId;
    private String description;
    private boolean disableUi;
    private double duration;
    private int height;
    private String surveyUrl;
    private String title;
    private String traffickingParameters;

    @zzahs
    @zzahp
    private Set<UiElement> uiElements;
    private String universalAdIdRegistry;
    private String universalAdIdValue;
    private int vastMediaBitrate;
    private int vastMediaHeight;
    private int vastMediaWidth;
    private int width;
    private boolean linear = false;
    private boolean skippable = false;
    private double skipTimeOffset = -1.0d;

    @zzahs
    @zzahp
    private zzd adPodInfo = new zzd();

    @zzahs
    @zzahp
    private zzbc[] companions = null;

    @zzahs
    @zzahp
    private String[] adWrapperIds = null;

    @zzahs
    @zzahp
    private String[] adWrapperSystems = null;

    @zzahs
    @zzahp
    private String[] adWrapperCreativeIds = null;

    @zzahs
    @zzahp
    private zzcm[] universalAdIds = null;

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getAdId() {
        return this.adId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public AdPodInfo getAdPodInfo() {
        return this.adPodInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getAdSystem() {
        return this.adSystem;
    }

    public com.google.ads.interactivemedia.v3.api.zza getAdUi() {
        return this.adUi;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String[] getAdWrapperCreativeIds() {
        return this.adWrapperCreativeIds;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String[] getAdWrapperIds() {
        return this.adWrapperIds;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String[] getAdWrapperSystems() {
        return this.adWrapperSystems;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getAdvertiserName() {
        return this.advertiserName;
    }

    public String getClickThruUrl() {
        return this.clickThroughUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getCreativeAdId() {
        return this.creativeAdId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getCreativeId() {
        return this.creativeId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getDealId() {
        return this.dealId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getDescription() {
        return this.description;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public double getDuration() {
        return this.duration;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getHeight() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public double getSkipTimeOffset() {
        return this.skipTimeOffset;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getSurveyUrl() {
        return this.surveyUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getTitle() {
        return this.title;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getTraffickingParameters() {
        return this.traffickingParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public Set<UiElement> getUiElements() {
        return this.uiElements;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getUniversalAdIdRegistry() {
        return this.universalAdIdRegistry;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getUniversalAdIdValue() {
        return this.universalAdIdValue;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public UniversalAdId[] getUniversalAdIds() {
        return this.universalAdIds;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getVastMediaBitrate() {
        return this.vastMediaBitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getVastMediaHeight() {
        return this.vastMediaHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getVastMediaWidth() {
        return this.vastMediaWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return zzahr.zza(this, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public boolean isLinear() {
        return this.linear;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public boolean isSkippable() {
        return this.skippable;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public boolean isUiDisabled() {
        return this.disableUi;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdPodInfo(zzd zzdVar) {
        this.adPodInfo = zzdVar;
    }

    public void setAdSystem(String str) {
        this.adSystem = str;
    }

    public void setAdUi(com.google.ads.interactivemedia.v3.api.zza zzaVar) {
        this.adUi = zzaVar;
    }

    public void setAdWrapperCreativeIds(String[] strArr) {
        this.adWrapperCreativeIds = strArr;
    }

    public void setAdWrapperIds(String[] strArr) {
        this.adWrapperIds = strArr;
    }

    public void setAdWrapperSystems(String[] strArr) {
        this.adWrapperSystems = strArr;
    }

    public void setAdvertiserName(String str) {
        this.advertiserName = str;
    }

    public void setClickThruUrl(String str) {
        this.clickThroughUrl = str;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setCreativeAdId(String str) {
        this.creativeAdId = str;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setDealId(String str) {
        this.dealId = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDuration(double d10) {
        this.duration = d10;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setLinear(boolean z10) {
        this.linear = z10;
    }

    public void setSkipTimeOffset(double d10) {
        this.skipTimeOffset = d10;
    }

    public void setSkippable(boolean z10) {
        this.skippable = z10;
    }

    public void setSurveyUrl(String str) {
        this.surveyUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTraffickingParameters(String str) {
        this.traffickingParameters = str;
    }

    public void setUiDisabled(boolean z10) {
        this.disableUi = z10;
    }

    public void setUiElements(Set<UiElement> set) {
        this.uiElements = set;
    }

    public void setUniversalAdIdRegistry(String str) {
        this.universalAdIdRegistry = str;
    }

    public void setUniversalAdIdValue(String str) {
        this.universalAdIdValue = str;
    }

    public void setUniversalAdIds(zzcm[] zzcmVarArr) {
        this.universalAdIds = zzcmVarArr;
    }

    public void setVastMediaBitrate(int i10) {
        this.vastMediaBitrate = i10;
    }

    public void setVastMediaHeight(int i10) {
        this.vastMediaHeight = i10;
    }

    public void setVastMediaWidth(int i10) {
        this.vastMediaWidth = i10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaho.zzf(this, obj, false, null, false, "vastMediaBitrate", "vastMediaHeight", "vastMediaWidth");
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public List<CompanionAd> getCompanionAds() {
        zzbc[] zzbcVarArr = this.companions;
        return zzbcVarArr != null ? Arrays.asList(zzbcVarArr) : Arrays.asList(new CompanionAd[0]);
    }

    public String toString() {
        return "Ad [adId=" + this.adId + ", creativeId=" + this.creativeId + ", creativeAdId=" + this.creativeAdId + ", universalAdIdValue=" + this.universalAdIdValue + ", universalAdIdRegistry=" + this.universalAdIdRegistry + ", title=" + this.title + ", description=" + this.description + ", contentType=" + this.contentType + ", adWrapperIds=" + Arrays.toString(this.adWrapperIds) + ", adWrapperSystems=" + Arrays.toString(this.adWrapperSystems) + ", adWrapperCreativeIds=" + Arrays.toString(this.adWrapperCreativeIds) + ", adSystem=" + this.adSystem + ", advertiserName=" + this.advertiserName + ", surveyUrl=" + this.surveyUrl + ", dealId=" + this.dealId + ", linear=" + this.linear + ", skippable=" + this.skippable + ", width=" + this.width + ", height=" + this.height + ", vastMediaHeight=" + this.vastMediaHeight + ", vastMediaWidth=" + this.vastMediaWidth + ", vastMediaBitrate=" + this.vastMediaBitrate + ", traffickingParameters=" + this.traffickingParameters + ", clickThroughUrl=" + this.clickThroughUrl + ", duration=" + this.duration + ", adPodInfo=" + String.valueOf(this.adPodInfo) + ", uiElements=" + String.valueOf(this.uiElements) + ", disableUi=" + this.disableUi + ", skipTimeOffset=" + this.skipTimeOffset + "]";
    }
}
