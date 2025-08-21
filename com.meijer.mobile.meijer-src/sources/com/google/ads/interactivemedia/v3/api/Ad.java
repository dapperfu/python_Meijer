package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public interface Ad {
    String getAdId();

    AdPodInfo getAdPodInfo();

    String getAdSystem();

    String[] getAdWrapperCreativeIds();

    String[] getAdWrapperIds();

    String[] getAdWrapperSystems();

    String getAdvertiserName();

    List<CompanionAd> getCompanionAds();

    String getContentType();

    String getCreativeAdId();

    String getCreativeId();

    String getDealId();

    String getDescription();

    double getDuration();

    int getHeight();

    double getSkipTimeOffset();

    String getSurveyUrl();

    String getTitle();

    String getTraffickingParameters();

    Set<UiElement> getUiElements();

    @Deprecated
    String getUniversalAdIdRegistry();

    @Deprecated
    String getUniversalAdIdValue();

    UniversalAdId[] getUniversalAdIds();

    int getVastMediaBitrate();

    int getVastMediaHeight();

    int getVastMediaWidth();

    int getWidth();

    boolean isLinear();

    boolean isSkippable();

    boolean isUiDisabled();
}
