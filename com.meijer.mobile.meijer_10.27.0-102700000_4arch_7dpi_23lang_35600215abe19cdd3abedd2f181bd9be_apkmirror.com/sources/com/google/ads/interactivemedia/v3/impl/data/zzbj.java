package com.google.ads.interactivemedia.v3.impl.data;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl;
import com.google.ads.interactivemedia.v3.internal.zzel;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzro;
import com.google.ads.interactivemedia.v3.internal.zzrp;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzbj {
    private static final boolean SUPPORTS_NATIVE_NETWORKING = true;

    public static zzbi builder() {
        return new zzw();
    }

    public abstract zzrp<String, String> adTagParameters();

    public abstract String adTagUrl();

    public abstract String adsResponse();

    public abstract String apiKey();

    public abstract String assetKey();

    public abstract String authToken();

    public abstract zzrp<String, String> companionSlots();

    public abstract zzrp<String, String> consentSettings();

    public abstract Float contentDuration();

    public abstract zzrm<String> contentKeywords();

    public abstract String contentSourceId();

    public abstract String contentSourceUrl();

    public abstract String contentTitle();

    public abstract String contentUrl();

    abstract String customAssetKey();

    public abstract Boolean enableNonce();

    public abstract String env();

    public abstract String format();

    public abstract zzbn identifierInfo();

    public abstract Boolean isAndroidTvAdsFramework();

    public abstract Boolean isTv();

    public abstract Integer linearAdSlotHeight();

    public abstract Integer linearAdSlotWidth();

    public abstract String liveStreamEventId();

    public abstract Float liveStreamPrefetchSeconds();

    public abstract com.google.ads.interactivemedia.v3.impl.zzw marketAppInfo();

    public abstract String msParameter();

    public abstract String network();

    public abstract String networkCode();

    public abstract String oAuthToken();

    public abstract Boolean omidAdSessionsOnStartedOnly();

    public abstract zzrp<String, String> platformSignals();

    public abstract String projectNumber();

    public abstract String region();

    public abstract int rubidiumApiVersion();

    public abstract zzrm<zzcf> secureSignals();

    public abstract ImaSdkSettings settings();

    public abstract String streamActivityMonitorId();

    public abstract Boolean supportsExternalNavigation();

    public abstract Boolean supportsIconClickFallback();

    public abstract Boolean supportsNativeNetworking();

    public abstract Boolean supportsResizing();

    public abstract Boolean useQAStreamBaseUrl();

    public abstract Boolean usesCustomVideoPlayback();

    public abstract Float vastLoadTimeout();

    public abstract AdsRequestImpl.ContinuousPlayState videoContinuousPlay();

    public abstract zzcn videoEnvironment();

    public abstract String videoId();

    public abstract AdsRequestImpl.AutoPlayState videoPlayActivation();

    public abstract AdsRequestImpl.MutePlayState videoPlayMuted();

    public abstract zzrp<String, Object> videoStitcherSessionOptions();

    public abstract String vodConfigId();

    public static zzbj createFromStreamRequest(StreamRequest streamRequest, String str, Map<String, String> map, List<zzcf> list, Map<String, String> map2, String str2, zzcn zzcnVar, ImaSdkSettings imaSdkSettings, com.google.ads.interactivemedia.v3.impl.zzw zzwVar, boolean z10, boolean z11, String str3, zzbn zzbnVar, StreamDisplayContainer streamDisplayContainer) {
        Map<String, String> companionSlots = getCompanionSlots((com.google.ads.interactivemedia.v3.impl.zzbx) streamDisplayContainer);
        ViewGroup adContainer = streamDisplayContainer.getAdContainer();
        StreamRequest.StreamFormat format = streamRequest.getFormat();
        StreamRequest.StreamFormat streamFormat = StreamRequest.StreamFormat.DASH;
        zzbi zzbiVarBuilder = builder();
        zzbiVarBuilder.adTagParameters(streamRequest.getAdTagParameters());
        zzbiVarBuilder.apiKey(streamRequest.getApiKey());
        zzbiVarBuilder.assetKey(streamRequest.getAssetKey());
        zzbiVarBuilder.authToken(streamRequest.getAuthToken());
        zzbiVarBuilder.companionSlots(companionSlots);
        zzbiVarBuilder.consentSettings(map);
        zzbiVarBuilder.contentSourceId(streamRequest.getContentSourceId());
        zzbiVarBuilder.contentUrl(streamRequest.getContentUrl());
        zzbiVarBuilder.customAssetKey(streamRequest.getCustomAssetKey());
        zzbiVarBuilder.enableNonce(Boolean.valueOf(streamRequest.getEnableNonce()));
        zzbiVarBuilder.env(str);
        zzbiVarBuilder.secureSignals(list);
        zzbiVarBuilder.format(format == streamFormat ? "dash" : "hls");
        zzbiVarBuilder.identifierInfo(zzbnVar);
        Boolean boolValueOf = Boolean.valueOf(z10);
        zzbiVarBuilder.isTv(boolValueOf);
        zzbiVarBuilder.isAndroidTvAdsFramework(Boolean.valueOf(z11));
        zzbiVarBuilder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        zzbiVarBuilder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        zzbiVarBuilder.liveStreamEventId(streamRequest.getLiveStreamEventId());
        zzbiVarBuilder.marketAppInfo(zzwVar);
        zzbiVarBuilder.msParameter(str3);
        zzbiVarBuilder.network(str2);
        zzbiVarBuilder.videoEnvironment(zzcnVar);
        zzbiVarBuilder.networkCode(streamRequest.getNetworkCode());
        zzbiVarBuilder.contentSourceUrl(streamRequest.getContentSourceUrl());
        zzbiVarBuilder.adTagUrl(streamRequest.getAdTagUrl());
        zzbiVarBuilder.oAuthToken(streamRequest.getOAuthToken());
        Boolean bool = Boolean.TRUE;
        zzbiVarBuilder.omidAdSessionsOnStartedOnly(bool);
        zzbiVarBuilder.platformSignals(map2);
        zzbiVarBuilder.projectNumber(streamRequest.getProjectNumber());
        zzbiVarBuilder.region(streamRequest.getRegion());
        zzbiVarBuilder.settings(imaSdkSettings);
        zzbiVarBuilder.streamActivityMonitorId(streamRequest.getStreamActivityMonitorId());
        zzbiVarBuilder.supportsExternalNavigation(Boolean.valueOf(!z10));
        zzbiVarBuilder.supportsIconClickFallback(boolValueOf);
        zzbiVarBuilder.supportsNativeNetworking(bool);
        zzbiVarBuilder.supportsResizing(Boolean.valueOf(streamDisplayContainer.getVideoStreamPlayer() instanceof ResizablePlayer));
        zzbiVarBuilder.useQAStreamBaseUrl(streamRequest.getUseQAStreamBaseUrl());
        zzbiVarBuilder.videoId(streamRequest.getVideoId());
        zzbiVarBuilder.videoStitcherSessionOptions(streamRequest.getVideoStitcherSessionOptions());
        zzbiVarBuilder.vodConfigId(streamRequest.getVodConfigId());
        zzbiVarBuilder.rubidiumApiVersion(zzel.zza());
        return zzbiVarBuilder.build();
    }

    public static zzbj create(AdsRequest adsRequest, String str, Map<String, String> map, List<zzcf> list, Map<String, String> map2, String str2, zzcn zzcnVar, ImaSdkSettings imaSdkSettings, com.google.ads.interactivemedia.v3.impl.zzw zzwVar, boolean z10, boolean z11, String str3, zzbn zzbnVar, AdDisplayContainer adDisplayContainer) {
        String adTagUrl = adsRequest.getAdTagUrl();
        String adsResponse = adsRequest.getAdsResponse();
        AdsRequestImpl adsRequestImpl = (AdsRequestImpl) adsRequest;
        AdsRequestImpl.AutoPlayState autoPlayStateZzd = adsRequestImpl.zzd();
        AdsRequestImpl.MutePlayState mutePlayStateZzf = adsRequestImpl.zzf();
        AdsRequestImpl.ContinuousPlayState continuousPlayStateZze = adsRequestImpl.zze();
        Float fZzg = adsRequestImpl.zzg();
        List<String> listZzk = adsRequestImpl.zzk();
        String strZzj = adsRequestImpl.zzj();
        String contentUrl = adsRequest.getContentUrl();
        Float fZzi = adsRequestImpl.zzi();
        Float fZzh = adsRequestImpl.zzh();
        Map<String, String> companionSlots = getCompanionSlots((com.google.ads.interactivemedia.v3.impl.zzc) adDisplayContainer);
        ViewGroup adContainer = adDisplayContainer.getAdContainer();
        zzbi zzbiVarBuilder = builder();
        zzbiVarBuilder.adTagUrl(adTagUrl);
        zzbiVarBuilder.adsResponse(adsResponse);
        zzbiVarBuilder.companionSlots(companionSlots);
        zzbiVarBuilder.consentSettings(map);
        zzbiVarBuilder.contentDuration(fZzg);
        zzbiVarBuilder.contentKeywords(listZzk);
        zzbiVarBuilder.contentTitle(strZzj);
        zzbiVarBuilder.contentUrl(contentUrl);
        zzbiVarBuilder.env(str);
        zzbiVarBuilder.secureSignals(list);
        zzbiVarBuilder.identifierInfo(zzbnVar);
        Boolean boolValueOf = Boolean.valueOf(z10);
        zzbiVarBuilder.isTv(boolValueOf);
        zzbiVarBuilder.isAndroidTvAdsFramework(Boolean.valueOf(z11));
        zzbiVarBuilder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        zzbiVarBuilder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        zzbiVarBuilder.liveStreamPrefetchSeconds(fZzh);
        zzbiVarBuilder.marketAppInfo(zzwVar);
        zzbiVarBuilder.msParameter(str3);
        zzbiVarBuilder.network(str2);
        zzbiVarBuilder.videoEnvironment(zzcnVar);
        Boolean bool = Boolean.TRUE;
        zzbiVarBuilder.omidAdSessionsOnStartedOnly(bool);
        zzbiVarBuilder.platformSignals(map2);
        zzbiVarBuilder.settings(imaSdkSettings);
        zzbiVarBuilder.supportsExternalNavigation(Boolean.valueOf(!z10));
        zzbiVarBuilder.supportsIconClickFallback(boolValueOf);
        zzbiVarBuilder.supportsNativeNetworking(bool);
        zzbiVarBuilder.supportsResizing(Boolean.valueOf(adDisplayContainer.getPlayer() instanceof ResizablePlayer));
        zzbiVarBuilder.usesCustomVideoPlayback(bool);
        zzbiVarBuilder.vastLoadTimeout(fZzi);
        zzbiVarBuilder.videoContinuousPlay(continuousPlayStateZze);
        zzbiVarBuilder.videoPlayActivation(autoPlayStateZzd);
        zzbiVarBuilder.videoPlayMuted(mutePlayStateZzf);
        zzbiVarBuilder.rubidiumApiVersion(zzel.zza());
        return zzbiVarBuilder.build();
    }

    private static Map<String, String> getCompanionSlots(com.google.ads.interactivemedia.v3.impl.zzaf zzafVar) {
        Map mapZza = zzafVar.zza();
        if (mapZza != null && !mapZza.isEmpty()) {
            zzro zzroVar = new zzro();
            for (String str : mapZza.keySet()) {
                CompanionAdSlot companionAdSlot = (CompanionAdSlot) mapZza.get(str);
                zzroVar.zza(str, companionAdSlot.getWidth() + "x" + companionAdSlot.getHeight());
            }
            return zzroVar.zzc();
        }
        return null;
    }
}
