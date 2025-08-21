package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface AdsRequest extends BaseRequest {
    String getAdTagUrl();

    String getAdsResponse();

    ContentProgressProvider getContentProgressProvider();

    @Deprecated
    String getExtraParameter(String str);

    @Deprecated
    Map<String, String> getExtraParameters();

    void setAdTagUrl(String str);

    void setAdWillAutoPlay(boolean z10);

    void setAdWillPlayMuted(boolean z10);

    void setAdsResponse(String str);

    void setContentDuration(float f10);

    void setContentKeywords(List<String> list);

    void setContentProgressProvider(ContentProgressProvider contentProgressProvider);

    void setContentTitle(String str);

    void setContinuousPlayback(boolean z10);

    @Deprecated
    void setExtraParameter(String str, String str2);

    void setLiveStreamPrefetchSeconds(float f10);

    void setVastLoadTimeout(float f10);
}
