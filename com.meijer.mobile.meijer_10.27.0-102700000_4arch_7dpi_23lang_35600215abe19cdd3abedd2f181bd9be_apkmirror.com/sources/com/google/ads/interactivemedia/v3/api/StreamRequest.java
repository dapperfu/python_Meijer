package com.google.ads.interactivemedia.v3.api;

import java.util.Map;

/* loaded from: classes4.dex */
public interface StreamRequest extends BaseRequest {

    public enum StreamFormat {
        DASH,
        HLS
    }

    Map<String, String> getAdTagParameters();

    String getAdTagUrl();

    String getApiKey();

    String getAssetKey();

    String getAuthToken();

    String getContentSourceId();

    String getContentSourceUrl();

    String getCustomAssetKey();

    boolean getEnableNonce();

    StreamFormat getFormat();

    String getLiveStreamEventId();

    String getManifestSuffix();

    String getNetworkCode();

    String getOAuthToken();

    String getProjectNumber();

    String getRegion();

    String getStreamActivityMonitorId();

    Boolean getUseQAStreamBaseUrl();

    String getVideoId();

    Map<String, Object> getVideoStitcherSessionOptions();

    String getVodConfigId();

    void setAdTagParameters(Map<String, String> map);

    void setAuthToken(String str);

    void setEnableNonce(boolean z10);

    void setFormat(StreamFormat streamFormat);

    void setManifestSuffix(String str);

    void setStreamActivityMonitorId(String str);

    void setUseQAStreamBaseUrl(Boolean bool);

    void setVideoStitcherSessionOptions(Map<String, Object> map);
}
