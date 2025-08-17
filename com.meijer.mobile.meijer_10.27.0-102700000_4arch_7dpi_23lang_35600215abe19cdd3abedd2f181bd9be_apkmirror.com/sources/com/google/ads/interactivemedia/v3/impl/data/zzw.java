package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrp;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzw implements zzbi {
    private zzrp<String, String> adTagParameters;
    private String adTagUrl;
    private String adsResponse;
    private String apiKey;
    private String assetKey;
    private String authToken;
    private zzrp<String, String> companionSlots;
    private zzrp<String, String> consentSettings;
    private Float contentDuration;
    private zzrm<String> contentKeywords;
    private String contentSourceId;
    private String contentSourceUrl;
    private String contentTitle;
    private String contentUrl;
    private String customAssetKey;
    private Boolean enableNonce;
    private String env;
    private String format;
    private zzbn identifierInfo;
    private Boolean isAndroidTvAdsFramework;
    private Boolean isTv;
    private Integer linearAdSlotHeight;
    private Integer linearAdSlotWidth;
    private String liveStreamEventId;
    private Float liveStreamPrefetchSeconds;
    private com.google.ads.interactivemedia.v3.impl.zzw marketAppInfo;
    private String msParameter;
    private String network;
    private String networkCode;
    private String oAuthToken;
    private Boolean omidAdSessionsOnStartedOnly;
    private zzrp<String, String> platformSignals;
    private String projectNumber;
    private String region;
    private int rubidiumApiVersion;
    private zzrm<zzcf> secureSignals;
    private byte set$0;
    private ImaSdkSettings settings;
    private String streamActivityMonitorId;
    private Boolean supportsExternalNavigation;
    private Boolean supportsIconClickFallback;
    private Boolean supportsNativeNetworking;
    private Boolean supportsResizing;
    private Boolean useQAStreamBaseUrl;
    private Boolean usesCustomVideoPlayback;
    private Float vastLoadTimeout;
    private AdsRequestImpl.ContinuousPlayState videoContinuousPlay;
    private zzcn videoEnvironment;
    private String videoId;
    private AdsRequestImpl.AutoPlayState videoPlayActivation;
    private AdsRequestImpl.MutePlayState videoPlayMuted;
    private zzrp<String, Object> videoStitcherSessionOptions;
    private String vodConfigId;

    zzw() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi adTagUrl(String str) {
        this.adTagUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi adsResponse(String str) {
        this.adsResponse = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi apiKey(String str) {
        this.apiKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi assetKey(String str) {
        this.assetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi authToken(String str) {
        this.authToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi contentDuration(Float f10) {
        this.contentDuration = f10;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi contentSourceId(String str) {
        this.contentSourceId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi contentSourceUrl(String str) {
        this.contentSourceUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi contentTitle(String str) {
        this.contentTitle = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi contentUrl(String str) {
        this.contentUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi customAssetKey(String str) {
        this.customAssetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi enableNonce(Boolean bool) {
        this.enableNonce = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi env(String str) {
        this.env = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi format(String str) {
        this.format = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi identifierInfo(zzbn zzbnVar) {
        this.identifierInfo = zzbnVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi isAndroidTvAdsFramework(Boolean bool) {
        this.isAndroidTvAdsFramework = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi isTv(Boolean bool) {
        this.isTv = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi linearAdSlotHeight(Integer num) {
        this.linearAdSlotHeight = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi linearAdSlotWidth(Integer num) {
        this.linearAdSlotWidth = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi liveStreamEventId(String str) {
        this.liveStreamEventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi liveStreamPrefetchSeconds(Float f10) {
        this.liveStreamPrefetchSeconds = f10;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi marketAppInfo(com.google.ads.interactivemedia.v3.impl.zzw zzwVar) {
        this.marketAppInfo = zzwVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi msParameter(String str) {
        this.msParameter = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi network(String str) {
        this.network = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi networkCode(String str) {
        this.networkCode = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi oAuthToken(String str) {
        this.oAuthToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi omidAdSessionsOnStartedOnly(Boolean bool) {
        this.omidAdSessionsOnStartedOnly = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi projectNumber(String str) {
        this.projectNumber = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi region(String str) {
        this.region = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi rubidiumApiVersion(int i10) {
        this.rubidiumApiVersion = i10;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi settings(ImaSdkSettings imaSdkSettings) {
        this.settings = imaSdkSettings;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi streamActivityMonitorId(String str) {
        this.streamActivityMonitorId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi supportsExternalNavigation(Boolean bool) {
        this.supportsExternalNavigation = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi supportsIconClickFallback(Boolean bool) {
        this.supportsIconClickFallback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi supportsNativeNetworking(Boolean bool) {
        this.supportsNativeNetworking = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi supportsResizing(Boolean bool) {
        this.supportsResizing = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi useQAStreamBaseUrl(Boolean bool) {
        this.useQAStreamBaseUrl = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi usesCustomVideoPlayback(Boolean bool) {
        this.usesCustomVideoPlayback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi vastLoadTimeout(Float f10) {
        this.vastLoadTimeout = f10;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi videoContinuousPlay(AdsRequestImpl.ContinuousPlayState continuousPlayState) {
        this.videoContinuousPlay = continuousPlayState;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi videoEnvironment(zzcn zzcnVar) {
        this.videoEnvironment = zzcnVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi videoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi videoPlayActivation(AdsRequestImpl.AutoPlayState autoPlayState) {
        this.videoPlayActivation = autoPlayState;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi videoPlayMuted(AdsRequestImpl.MutePlayState mutePlayState) {
        this.videoPlayMuted = mutePlayState;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi vodConfigId(String str) {
        this.vodConfigId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi adTagParameters(Map<String, String> map) {
        this.adTagParameters = map == null ? null : zzrp.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbj build() {
        if (this.set$0 == 1) {
            return new zzy(this.adTagParameters, this.adTagUrl, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentSourceUrl, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.customAssetKey, this.enableNonce, this.env, this.secureSignals, this.format, this.identifierInfo, this.isTv, this.isAndroidTvAdsFramework, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamEventId, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.videoEnvironment, this.networkCode, this.oAuthToken, this.omidAdSessionsOnStartedOnly, this.platformSignals, this.projectNumber, this.region, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeNetworking, this.streamActivityMonitorId, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted, this.videoStitcherSessionOptions, this.vodConfigId, this.rubidiumApiVersion);
        }
        throw new IllegalStateException("Missing required properties: rubidiumApiVersion");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi companionSlots(Map<String, String> map) {
        this.companionSlots = map == null ? null : zzrp.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi consentSettings(Map<String, String> map) {
        this.consentSettings = map == null ? null : zzrp.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi contentKeywords(List<String> list) {
        this.contentKeywords = list == null ? null : zzrm.zzk(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi platformSignals(Map<String, String> map) {
        this.platformSignals = map == null ? null : zzrp.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi secureSignals(List<zzcf> list) {
        this.secureSignals = list == null ? null : zzrm.zzk(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public zzbi videoStitcherSessionOptions(Map<String, Object> map) {
        this.videoStitcherSessionOptions = map == null ? null : zzrp.zzc(map);
        return this;
    }
}
