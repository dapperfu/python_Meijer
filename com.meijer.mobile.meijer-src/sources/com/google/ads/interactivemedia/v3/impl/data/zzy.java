package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrp;

/* loaded from: classes4.dex */
final class zzy extends zzbj {
    private final zzrp<String, String> adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final zzrp<String, String> companionSlots;
    private final zzrp<String, String> consentSettings;
    private final Float contentDuration;
    private final zzrm<String> contentKeywords;
    private final String contentSourceId;
    private final String contentSourceUrl;
    private final String contentTitle;
    private final String contentUrl;
    private final String customAssetKey;
    private final Boolean enableNonce;
    private final String env;
    private final String format;
    private final zzbn identifierInfo;
    private final Boolean isAndroidTvAdsFramework;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final String liveStreamEventId;
    private final Float liveStreamPrefetchSeconds;
    private final com.google.ads.interactivemedia.v3.impl.zzw marketAppInfo;
    private final String msParameter;
    private final String network;
    private final String networkCode;
    private final String oAuthToken;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final zzrp<String, String> platformSignals;
    private final String projectNumber;
    private final String region;
    private final int rubidiumApiVersion;
    private final zzrm<zzcf> secureSignals;
    private final ImaSdkSettings settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeNetworking;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final AdsRequestImpl.ContinuousPlayState videoContinuousPlay;
    private final zzcn videoEnvironment;
    private final String videoId;
    private final AdsRequestImpl.AutoPlayState videoPlayActivation;
    private final AdsRequestImpl.MutePlayState videoPlayMuted;
    private final zzrp<String, Object> videoStitcherSessionOptions;
    private final String vodConfigId;

    private zzy(zzrp<String, String> zzrpVar, String str, String str2, String str3, String str4, String str5, zzrp<String, String> zzrpVar2, Float f10, zzrm<String> zzrmVar, String str6, String str7, String str8, String str9, zzrp<String, String> zzrpVar3, String str10, Boolean bool, String str11, zzrm<zzcf> zzrmVar2, String str12, zzbn zzbnVar, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str13, Float f11, com.google.ads.interactivemedia.v3.impl.zzw zzwVar, String str14, String str15, zzcn zzcnVar, String str16, String str17, Boolean bool4, zzrp<String, String> zzrpVar4, String str18, String str19, ImaSdkSettings imaSdkSettings, Boolean bool5, Boolean bool6, Boolean bool7, String str20, Boolean bool8, Boolean bool9, Boolean bool10, Float f12, String str21, AdsRequestImpl.AutoPlayState autoPlayState, AdsRequestImpl.ContinuousPlayState continuousPlayState, AdsRequestImpl.MutePlayState mutePlayState, zzrp<String, Object> zzrpVar5, String str22, int i10) {
        this.adTagParameters = zzrpVar;
        this.adTagUrl = str;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = zzrpVar2;
        this.contentDuration = f10;
        this.contentKeywords = zzrmVar;
        this.contentSourceUrl = str6;
        this.contentTitle = str7;
        this.contentUrl = str8;
        this.contentSourceId = str9;
        this.consentSettings = zzrpVar3;
        this.customAssetKey = str10;
        this.enableNonce = bool;
        this.env = str11;
        this.secureSignals = zzrmVar2;
        this.format = str12;
        this.identifierInfo = zzbnVar;
        this.isTv = bool2;
        this.isAndroidTvAdsFramework = bool3;
        this.linearAdSlotWidth = num;
        this.linearAdSlotHeight = num2;
        this.liveStreamEventId = str13;
        this.liveStreamPrefetchSeconds = f11;
        this.marketAppInfo = zzwVar;
        this.msParameter = str14;
        this.network = str15;
        this.videoEnvironment = zzcnVar;
        this.networkCode = str16;
        this.oAuthToken = str17;
        this.omidAdSessionsOnStartedOnly = bool4;
        this.platformSignals = zzrpVar4;
        this.projectNumber = str18;
        this.region = str19;
        this.settings = imaSdkSettings;
        this.supportsExternalNavigation = bool5;
        this.supportsIconClickFallback = bool6;
        this.supportsNativeNetworking = bool7;
        this.streamActivityMonitorId = str20;
        this.supportsResizing = bool8;
        this.useQAStreamBaseUrl = bool9;
        this.usesCustomVideoPlayback = bool10;
        this.vastLoadTimeout = f12;
        this.videoId = str21;
        this.videoPlayActivation = autoPlayState;
        this.videoContinuousPlay = continuousPlayState;
        this.videoPlayMuted = mutePlayState;
        this.videoStitcherSessionOptions = zzrpVar5;
        this.vodConfigId = str22;
        this.rubidiumApiVersion = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzrp<String, String> adTagParameters() {
        return this.adTagParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String adTagUrl() {
        return this.adTagUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String adsResponse() {
        return this.adsResponse;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String apiKey() {
        return this.apiKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String assetKey() {
        return this.assetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String authToken() {
        return this.authToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzrp<String, String> companionSlots() {
        return this.companionSlots;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzrp<String, String> consentSettings() {
        return this.consentSettings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Float contentDuration() {
        return this.contentDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzrm<String> contentKeywords() {
        return this.contentKeywords;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String contentSourceId() {
        return this.contentSourceId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String contentSourceUrl() {
        return this.contentSourceUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String contentTitle() {
        return this.contentTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String contentUrl() {
        return this.contentUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    String customAssetKey() {
        return this.customAssetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean enableNonce() {
        return this.enableNonce;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbj) {
            zzbj zzbjVar = (zzbj) obj;
            zzrp<String, String> zzrpVar = this.adTagParameters;
            if (zzrpVar != null ? zzrpVar.equals(zzbjVar.adTagParameters()) : zzbjVar.adTagParameters() == null) {
                String str = this.adTagUrl;
                if (str != null ? str.equals(zzbjVar.adTagUrl()) : zzbjVar.adTagUrl() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(zzbjVar.adsResponse()) : zzbjVar.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(zzbjVar.apiKey()) : zzbjVar.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(zzbjVar.assetKey()) : zzbjVar.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(zzbjVar.authToken()) : zzbjVar.authToken() == null) {
                                    zzrp<String, String> zzrpVar2 = this.companionSlots;
                                    if (zzrpVar2 != null ? zzrpVar2.equals(zzbjVar.companionSlots()) : zzbjVar.companionSlots() == null) {
                                        Float f10 = this.contentDuration;
                                        if (f10 != null ? f10.equals(zzbjVar.contentDuration()) : zzbjVar.contentDuration() == null) {
                                            zzrm<String> zzrmVar = this.contentKeywords;
                                            if (zzrmVar != null ? zzrmVar.equals(zzbjVar.contentKeywords()) : zzbjVar.contentKeywords() == null) {
                                                String str6 = this.contentSourceUrl;
                                                if (str6 != null ? str6.equals(zzbjVar.contentSourceUrl()) : zzbjVar.contentSourceUrl() == null) {
                                                    String str7 = this.contentTitle;
                                                    if (str7 != null ? str7.equals(zzbjVar.contentTitle()) : zzbjVar.contentTitle() == null) {
                                                        String str8 = this.contentUrl;
                                                        if (str8 != null ? str8.equals(zzbjVar.contentUrl()) : zzbjVar.contentUrl() == null) {
                                                            String str9 = this.contentSourceId;
                                                            if (str9 != null ? str9.equals(zzbjVar.contentSourceId()) : zzbjVar.contentSourceId() == null) {
                                                                zzrp<String, String> zzrpVar3 = this.consentSettings;
                                                                if (zzrpVar3 != null ? zzrpVar3.equals(zzbjVar.consentSettings()) : zzbjVar.consentSettings() == null) {
                                                                    String str10 = this.customAssetKey;
                                                                    if (str10 != null ? str10.equals(zzbjVar.customAssetKey()) : zzbjVar.customAssetKey() == null) {
                                                                        Boolean bool = this.enableNonce;
                                                                        if (bool != null ? bool.equals(zzbjVar.enableNonce()) : zzbjVar.enableNonce() == null) {
                                                                            String str11 = this.env;
                                                                            if (str11 != null ? str11.equals(zzbjVar.env()) : zzbjVar.env() == null) {
                                                                                zzrm<zzcf> zzrmVar2 = this.secureSignals;
                                                                                if (zzrmVar2 != null ? zzrmVar2.equals(zzbjVar.secureSignals()) : zzbjVar.secureSignals() == null) {
                                                                                    String str12 = this.format;
                                                                                    if (str12 != null ? str12.equals(zzbjVar.format()) : zzbjVar.format() == null) {
                                                                                        zzbn zzbnVar = this.identifierInfo;
                                                                                        if (zzbnVar != null ? zzbnVar.equals(zzbjVar.identifierInfo()) : zzbjVar.identifierInfo() == null) {
                                                                                            Boolean bool2 = this.isTv;
                                                                                            if (bool2 != null ? bool2.equals(zzbjVar.isTv()) : zzbjVar.isTv() == null) {
                                                                                                Boolean bool3 = this.isAndroidTvAdsFramework;
                                                                                                if (bool3 != null ? bool3.equals(zzbjVar.isAndroidTvAdsFramework()) : zzbjVar.isAndroidTvAdsFramework() == null) {
                                                                                                    Integer num = this.linearAdSlotWidth;
                                                                                                    if (num != null ? num.equals(zzbjVar.linearAdSlotWidth()) : zzbjVar.linearAdSlotWidth() == null) {
                                                                                                        Integer num2 = this.linearAdSlotHeight;
                                                                                                        if (num2 != null ? num2.equals(zzbjVar.linearAdSlotHeight()) : zzbjVar.linearAdSlotHeight() == null) {
                                                                                                            String str13 = this.liveStreamEventId;
                                                                                                            if (str13 != null ? str13.equals(zzbjVar.liveStreamEventId()) : zzbjVar.liveStreamEventId() == null) {
                                                                                                                Float f11 = this.liveStreamPrefetchSeconds;
                                                                                                                if (f11 != null ? f11.equals(zzbjVar.liveStreamPrefetchSeconds()) : zzbjVar.liveStreamPrefetchSeconds() == null) {
                                                                                                                    com.google.ads.interactivemedia.v3.impl.zzw zzwVar = this.marketAppInfo;
                                                                                                                    if (zzwVar != null ? zzwVar.equals(zzbjVar.marketAppInfo()) : zzbjVar.marketAppInfo() == null) {
                                                                                                                        String str14 = this.msParameter;
                                                                                                                        if (str14 != null ? str14.equals(zzbjVar.msParameter()) : zzbjVar.msParameter() == null) {
                                                                                                                            String str15 = this.network;
                                                                                                                            if (str15 != null ? str15.equals(zzbjVar.network()) : zzbjVar.network() == null) {
                                                                                                                                zzcn zzcnVar = this.videoEnvironment;
                                                                                                                                if (zzcnVar != null ? zzcnVar.equals(zzbjVar.videoEnvironment()) : zzbjVar.videoEnvironment() == null) {
                                                                                                                                    String str16 = this.networkCode;
                                                                                                                                    if (str16 != null ? str16.equals(zzbjVar.networkCode()) : zzbjVar.networkCode() == null) {
                                                                                                                                        String str17 = this.oAuthToken;
                                                                                                                                        if (str17 != null ? str17.equals(zzbjVar.oAuthToken()) : zzbjVar.oAuthToken() == null) {
                                                                                                                                            Boolean bool4 = this.omidAdSessionsOnStartedOnly;
                                                                                                                                            if (bool4 != null ? bool4.equals(zzbjVar.omidAdSessionsOnStartedOnly()) : zzbjVar.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                                                zzrp<String, String> zzrpVar4 = this.platformSignals;
                                                                                                                                                if (zzrpVar4 != null ? zzrpVar4.equals(zzbjVar.platformSignals()) : zzbjVar.platformSignals() == null) {
                                                                                                                                                    String str18 = this.projectNumber;
                                                                                                                                                    if (str18 != null ? str18.equals(zzbjVar.projectNumber()) : zzbjVar.projectNumber() == null) {
                                                                                                                                                        String str19 = this.region;
                                                                                                                                                        if (str19 != null ? str19.equals(zzbjVar.region()) : zzbjVar.region() == null) {
                                                                                                                                                            ImaSdkSettings imaSdkSettings = this.settings;
                                                                                                                                                            if (imaSdkSettings != null ? imaSdkSettings.equals(zzbjVar.settings()) : zzbjVar.settings() == null) {
                                                                                                                                                                Boolean bool5 = this.supportsExternalNavigation;
                                                                                                                                                                if (bool5 != null ? bool5.equals(zzbjVar.supportsExternalNavigation()) : zzbjVar.supportsExternalNavigation() == null) {
                                                                                                                                                                    Boolean bool6 = this.supportsIconClickFallback;
                                                                                                                                                                    if (bool6 != null ? bool6.equals(zzbjVar.supportsIconClickFallback()) : zzbjVar.supportsIconClickFallback() == null) {
                                                                                                                                                                        Boolean bool7 = this.supportsNativeNetworking;
                                                                                                                                                                        if (bool7 != null ? bool7.equals(zzbjVar.supportsNativeNetworking()) : zzbjVar.supportsNativeNetworking() == null) {
                                                                                                                                                                            String str20 = this.streamActivityMonitorId;
                                                                                                                                                                            if (str20 != null ? str20.equals(zzbjVar.streamActivityMonitorId()) : zzbjVar.streamActivityMonitorId() == null) {
                                                                                                                                                                                Boolean bool8 = this.supportsResizing;
                                                                                                                                                                                if (bool8 != null ? bool8.equals(zzbjVar.supportsResizing()) : zzbjVar.supportsResizing() == null) {
                                                                                                                                                                                    Boolean bool9 = this.useQAStreamBaseUrl;
                                                                                                                                                                                    if (bool9 != null ? bool9.equals(zzbjVar.useQAStreamBaseUrl()) : zzbjVar.useQAStreamBaseUrl() == null) {
                                                                                                                                                                                        Boolean bool10 = this.usesCustomVideoPlayback;
                                                                                                                                                                                        if (bool10 != null ? bool10.equals(zzbjVar.usesCustomVideoPlayback()) : zzbjVar.usesCustomVideoPlayback() == null) {
                                                                                                                                                                                            Float f12 = this.vastLoadTimeout;
                                                                                                                                                                                            if (f12 != null ? f12.equals(zzbjVar.vastLoadTimeout()) : zzbjVar.vastLoadTimeout() == null) {
                                                                                                                                                                                                String str21 = this.videoId;
                                                                                                                                                                                                if (str21 != null ? str21.equals(zzbjVar.videoId()) : zzbjVar.videoId() == null) {
                                                                                                                                                                                                    AdsRequestImpl.AutoPlayState autoPlayState = this.videoPlayActivation;
                                                                                                                                                                                                    if (autoPlayState != null ? autoPlayState.equals(zzbjVar.videoPlayActivation()) : zzbjVar.videoPlayActivation() == null) {
                                                                                                                                                                                                        AdsRequestImpl.ContinuousPlayState continuousPlayState = this.videoContinuousPlay;
                                                                                                                                                                                                        if (continuousPlayState != null ? continuousPlayState.equals(zzbjVar.videoContinuousPlay()) : zzbjVar.videoContinuousPlay() == null) {
                                                                                                                                                                                                            AdsRequestImpl.MutePlayState mutePlayState = this.videoPlayMuted;
                                                                                                                                                                                                            if (mutePlayState != null ? mutePlayState.equals(zzbjVar.videoPlayMuted()) : zzbjVar.videoPlayMuted() == null) {
                                                                                                                                                                                                                zzrp<String, Object> zzrpVar5 = this.videoStitcherSessionOptions;
                                                                                                                                                                                                                if (zzrpVar5 != null ? zzrpVar5.equals(zzbjVar.videoStitcherSessionOptions()) : zzbjVar.videoStitcherSessionOptions() == null) {
                                                                                                                                                                                                                    String str22 = this.vodConfigId;
                                                                                                                                                                                                                    if (str22 != null ? str22.equals(zzbjVar.vodConfigId()) : zzbjVar.vodConfigId() == null) {
                                                                                                                                                                                                                        if (this.rubidiumApiVersion == zzbjVar.rubidiumApiVersion()) {
                                                                                                                                                                                                                            return true;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String format() {
        return this.format;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzbn identifierInfo() {
        return this.identifierInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean isAndroidTvAdsFramework() {
        return this.isAndroidTvAdsFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean isTv() {
        return this.isTv;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String liveStreamEventId() {
        return this.liveStreamEventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public com.google.ads.interactivemedia.v3.impl.zzw marketAppInfo() {
        return this.marketAppInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String msParameter() {
        return this.msParameter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String network() {
        return this.network;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String networkCode() {
        return this.networkCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String oAuthToken() {
        return this.oAuthToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzrp<String, String> platformSignals() {
        return this.platformSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String projectNumber() {
        return this.projectNumber;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String region() {
        return this.region;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public int rubidiumApiVersion() {
        return this.rubidiumApiVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzrm<zzcf> secureSignals() {
        return this.secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public ImaSdkSettings settings() {
        return this.settings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public AdsRequestImpl.ContinuousPlayState videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzcn videoEnvironment() {
        return this.videoEnvironment;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String videoId() {
        return this.videoId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public AdsRequestImpl.AutoPlayState videoPlayActivation() {
        return this.videoPlayActivation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public AdsRequestImpl.MutePlayState videoPlayMuted() {
        return this.videoPlayMuted;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public zzrp<String, Object> videoStitcherSessionOptions() {
        return this.videoStitcherSessionOptions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String vodConfigId() {
        return this.vodConfigId;
    }

    public int hashCode() {
        zzrp<String, String> zzrpVar = this.adTagParameters;
        int iHashCode = zzrpVar == null ? 0 : zzrpVar.hashCode();
        String str = this.adTagUrl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i10 = iHashCode ^ 1000003;
        String str2 = this.adsResponse;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.apiKey;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.assetKey;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.authToken;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        zzrp<String, String> zzrpVar2 = this.companionSlots;
        int iHashCode7 = (iHashCode6 ^ (zzrpVar2 == null ? 0 : zzrpVar2.hashCode())) * 1000003;
        Float f10 = this.contentDuration;
        int iHashCode8 = (iHashCode7 ^ (f10 == null ? 0 : f10.hashCode())) * 1000003;
        zzrm<String> zzrmVar = this.contentKeywords;
        int iHashCode9 = (iHashCode8 ^ (zzrmVar == null ? 0 : zzrmVar.hashCode())) * 1000003;
        String str6 = this.contentSourceUrl;
        int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.contentTitle;
        int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.contentUrl;
        int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.contentSourceId;
        int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        zzrp<String, String> zzrpVar3 = this.consentSettings;
        int iHashCode14 = (iHashCode13 ^ (zzrpVar3 == null ? 0 : zzrpVar3.hashCode())) * 1000003;
        String str10 = this.customAssetKey;
        int iHashCode15 = (iHashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        Boolean bool = this.enableNonce;
        int iHashCode16 = (iHashCode15 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str11 = this.env;
        int iHashCode17 = (iHashCode16 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        zzrm<zzcf> zzrmVar2 = this.secureSignals;
        int iHashCode18 = (iHashCode17 ^ (zzrmVar2 == null ? 0 : zzrmVar2.hashCode())) * 1000003;
        String str12 = this.format;
        int iHashCode19 = (iHashCode18 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        zzbn zzbnVar = this.identifierInfo;
        int iHashCode20 = (iHashCode19 ^ (zzbnVar == null ? 0 : zzbnVar.hashCode())) * 1000003;
        Boolean bool2 = this.isTv;
        int iHashCode21 = (iHashCode20 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        int iHashCode22 = (iHashCode21 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Integer num = this.linearAdSlotWidth;
        int iHashCode23 = (iHashCode22 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.linearAdSlotHeight;
        int iHashCode24 = (iHashCode23 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str13 = this.liveStreamEventId;
        int iHashCode25 = (iHashCode24 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        Float f11 = this.liveStreamPrefetchSeconds;
        int iHashCode26 = (iHashCode25 ^ (f11 == null ? 0 : f11.hashCode())) * 1000003;
        com.google.ads.interactivemedia.v3.impl.zzw zzwVar = this.marketAppInfo;
        int iHashCode27 = (iHashCode26 ^ (zzwVar == null ? 0 : zzwVar.hashCode())) * 1000003;
        String str14 = this.msParameter;
        int iHashCode28 = (iHashCode27 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        String str15 = this.network;
        int iHashCode29 = (iHashCode28 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        zzcn zzcnVar = this.videoEnvironment;
        int iHashCode30 = (iHashCode29 ^ (zzcnVar == null ? 0 : zzcnVar.hashCode())) * 1000003;
        String str16 = this.networkCode;
        int iHashCode31 = (iHashCode30 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        String str17 = this.oAuthToken;
        int iHashCode32 = (iHashCode31 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        Boolean bool4 = this.omidAdSessionsOnStartedOnly;
        int iHashCode33 = (iHashCode32 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        zzrp<String, String> zzrpVar4 = this.platformSignals;
        int iHashCode34 = (iHashCode33 ^ (zzrpVar4 == null ? 0 : zzrpVar4.hashCode())) * 1000003;
        String str18 = this.projectNumber;
        int iHashCode35 = (iHashCode34 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        String str19 = this.region;
        int iHashCode36 = (iHashCode35 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        ImaSdkSettings imaSdkSettings = this.settings;
        int iHashCode37 = (iHashCode36 ^ (imaSdkSettings == null ? 0 : imaSdkSettings.hashCode())) * 1000003;
        Boolean bool5 = this.supportsExternalNavigation;
        int iHashCode38 = (iHashCode37 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Boolean bool6 = this.supportsIconClickFallback;
        int iHashCode39 = (iHashCode38 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.supportsNativeNetworking;
        int iHashCode40 = (iHashCode39 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        String str20 = this.streamActivityMonitorId;
        int iHashCode41 = (iHashCode40 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        Boolean bool8 = this.supportsResizing;
        int iHashCode42 = (iHashCode41 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.useQAStreamBaseUrl;
        int iHashCode43 = (iHashCode42 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Boolean bool10 = this.usesCustomVideoPlayback;
        int iHashCode44 = (iHashCode43 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
        Float f12 = this.vastLoadTimeout;
        int iHashCode45 = (iHashCode44 ^ (f12 == null ? 0 : f12.hashCode())) * 1000003;
        String str21 = this.videoId;
        int iHashCode46 = (iHashCode45 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
        AdsRequestImpl.AutoPlayState autoPlayState = this.videoPlayActivation;
        int iHashCode47 = (iHashCode46 ^ (autoPlayState == null ? 0 : autoPlayState.hashCode())) * 1000003;
        AdsRequestImpl.ContinuousPlayState continuousPlayState = this.videoContinuousPlay;
        int iHashCode48 = (iHashCode47 ^ (continuousPlayState == null ? 0 : continuousPlayState.hashCode())) * 1000003;
        AdsRequestImpl.MutePlayState mutePlayState = this.videoPlayMuted;
        int iHashCode49 = (iHashCode48 ^ (mutePlayState == null ? 0 : mutePlayState.hashCode())) * 1000003;
        zzrp<String, Object> zzrpVar5 = this.videoStitcherSessionOptions;
        int iHashCode50 = (iHashCode49 ^ (zzrpVar5 == null ? 0 : zzrpVar5.hashCode())) * 1000003;
        String str22 = this.vodConfigId;
        return ((iHashCode50 ^ (str22 != null ? str22.hashCode() : 0)) * 1000003) ^ this.rubidiumApiVersion;
    }

    public String toString() {
        zzrp<String, Object> zzrpVar = this.videoStitcherSessionOptions;
        AdsRequestImpl.MutePlayState mutePlayState = this.videoPlayMuted;
        AdsRequestImpl.ContinuousPlayState continuousPlayState = this.videoContinuousPlay;
        AdsRequestImpl.AutoPlayState autoPlayState = this.videoPlayActivation;
        ImaSdkSettings imaSdkSettings = this.settings;
        zzrp<String, String> zzrpVar2 = this.platformSignals;
        zzcn zzcnVar = this.videoEnvironment;
        com.google.ads.interactivemedia.v3.impl.zzw zzwVar = this.marketAppInfo;
        zzbn zzbnVar = this.identifierInfo;
        zzrm<zzcf> zzrmVar = this.secureSignals;
        zzrp<String, String> zzrpVar3 = this.consentSettings;
        zzrm<String> zzrmVar2 = this.contentKeywords;
        zzrp<String, String> zzrpVar4 = this.companionSlots;
        String strValueOf = String.valueOf(this.adTagParameters);
        String strValueOf2 = String.valueOf(zzrpVar4);
        String strValueOf3 = String.valueOf(zzrmVar2);
        String strValueOf4 = String.valueOf(zzrpVar3);
        String strValueOf5 = String.valueOf(zzrmVar);
        String strValueOf6 = String.valueOf(zzbnVar);
        String strValueOf7 = String.valueOf(zzwVar);
        String strValueOf8 = String.valueOf(zzcnVar);
        String strValueOf9 = String.valueOf(zzrpVar2);
        String strValueOf10 = String.valueOf(imaSdkSettings);
        String strValueOf11 = String.valueOf(autoPlayState);
        String strValueOf12 = String.valueOf(continuousPlayState);
        String strValueOf13 = String.valueOf(mutePlayState);
        String strValueOf14 = String.valueOf(zzrpVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GsonAdsRequest{adTagParameters=");
        sb2.append(strValueOf);
        sb2.append(", adTagUrl=");
        sb2.append(this.adTagUrl);
        sb2.append(", adsResponse=");
        sb2.append(this.adsResponse);
        sb2.append(", apiKey=");
        sb2.append(this.apiKey);
        sb2.append(", assetKey=");
        sb2.append(this.assetKey);
        sb2.append(", authToken=");
        sb2.append(this.authToken);
        sb2.append(", companionSlots=");
        sb2.append(strValueOf2);
        sb2.append(", contentDuration=");
        sb2.append(this.contentDuration);
        sb2.append(", contentKeywords=");
        sb2.append(strValueOf3);
        sb2.append(", contentSourceUrl=");
        sb2.append(this.contentSourceUrl);
        sb2.append(", contentTitle=");
        sb2.append(this.contentTitle);
        sb2.append(", contentUrl=");
        sb2.append(this.contentUrl);
        Float f10 = this.vastLoadTimeout;
        Boolean bool = this.usesCustomVideoPlayback;
        Boolean bool2 = this.useQAStreamBaseUrl;
        Boolean bool3 = this.supportsResizing;
        String str = this.streamActivityMonitorId;
        Boolean bool4 = this.supportsNativeNetworking;
        Boolean bool5 = this.supportsIconClickFallback;
        Boolean bool6 = this.supportsExternalNavigation;
        String str2 = this.region;
        String str3 = this.projectNumber;
        Boolean bool7 = this.omidAdSessionsOnStartedOnly;
        String str4 = this.oAuthToken;
        String str5 = this.networkCode;
        String str6 = this.network;
        String str7 = this.msParameter;
        Float f11 = this.liveStreamPrefetchSeconds;
        String str8 = this.liveStreamEventId;
        Integer num = this.linearAdSlotHeight;
        Integer num2 = this.linearAdSlotWidth;
        Boolean bool8 = this.isAndroidTvAdsFramework;
        Boolean bool9 = this.isTv;
        String str9 = this.format;
        String str10 = this.env;
        Boolean bool10 = this.enableNonce;
        String str11 = this.customAssetKey;
        String str12 = this.contentSourceId;
        sb2.append(", contentSourceId=");
        sb2.append(str12);
        sb2.append(", consentSettings=");
        sb2.append(strValueOf4);
        sb2.append(", customAssetKey=");
        sb2.append(str11);
        sb2.append(", enableNonce=");
        sb2.append(bool10);
        sb2.append(", env=");
        sb2.append(str10);
        sb2.append(", secureSignals=");
        sb2.append(strValueOf5);
        sb2.append(", format=");
        sb2.append(str9);
        sb2.append(", identifierInfo=");
        sb2.append(strValueOf6);
        sb2.append(", isTv=");
        sb2.append(bool9);
        sb2.append(", isAndroidTvAdsFramework=");
        sb2.append(bool8);
        sb2.append(", linearAdSlotWidth=");
        sb2.append(num2);
        sb2.append(", linearAdSlotHeight=");
        sb2.append(num);
        sb2.append(", liveStreamEventId=");
        sb2.append(str8);
        sb2.append(", liveStreamPrefetchSeconds=");
        sb2.append(f11);
        sb2.append(", marketAppInfo=");
        sb2.append(strValueOf7);
        sb2.append(", msParameter=");
        sb2.append(str7);
        sb2.append(", network=");
        sb2.append(str6);
        sb2.append(", videoEnvironment=");
        sb2.append(strValueOf8);
        sb2.append(", networkCode=");
        sb2.append(str5);
        sb2.append(", oAuthToken=");
        sb2.append(str4);
        sb2.append(", omidAdSessionsOnStartedOnly=");
        sb2.append(bool7);
        sb2.append(", platformSignals=");
        sb2.append(strValueOf9);
        sb2.append(", projectNumber=");
        sb2.append(str3);
        sb2.append(", region=");
        sb2.append(str2);
        sb2.append(", settings=");
        sb2.append(strValueOf10);
        sb2.append(", supportsExternalNavigation=");
        sb2.append(bool6);
        sb2.append(", supportsIconClickFallback=");
        sb2.append(bool5);
        sb2.append(", supportsNativeNetworking=");
        sb2.append(bool4);
        sb2.append(", streamActivityMonitorId=");
        sb2.append(str);
        sb2.append(", supportsResizing=");
        sb2.append(bool3);
        sb2.append(", useQAStreamBaseUrl=");
        sb2.append(bool2);
        sb2.append(", usesCustomVideoPlayback=");
        sb2.append(bool);
        sb2.append(", vastLoadTimeout=");
        sb2.append(f10);
        int i10 = this.rubidiumApiVersion;
        String str13 = this.vodConfigId;
        String str14 = this.videoId;
        sb2.append(", videoId=");
        sb2.append(str14);
        sb2.append(", videoPlayActivation=");
        sb2.append(strValueOf11);
        sb2.append(", videoContinuousPlay=");
        sb2.append(strValueOf12);
        sb2.append(", videoPlayMuted=");
        sb2.append(strValueOf13);
        sb2.append(", videoStitcherSessionOptions=");
        sb2.append(strValueOf14);
        sb2.append(", vodConfigId=");
        sb2.append(str13);
        sb2.append(", rubidiumApiVersion=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
