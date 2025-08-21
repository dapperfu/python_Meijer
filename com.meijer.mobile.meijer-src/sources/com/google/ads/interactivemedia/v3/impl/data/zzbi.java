package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface zzbi {
    zzbi adTagParameters(Map<String, String> map);

    zzbi adTagUrl(String str);

    zzbi adsResponse(String str);

    zzbi apiKey(String str);

    zzbi assetKey(String str);

    zzbi authToken(String str);

    zzbj build();

    zzbi companionSlots(Map<String, String> map);

    zzbi consentSettings(Map<String, String> map);

    zzbi contentDuration(Float f10);

    zzbi contentKeywords(List<String> list);

    zzbi contentSourceId(String str);

    zzbi contentSourceUrl(String str);

    zzbi contentTitle(String str);

    zzbi contentUrl(String str);

    zzbi customAssetKey(String str);

    zzbi enableNonce(Boolean bool);

    zzbi env(String str);

    zzbi format(String str);

    zzbi identifierInfo(zzbn zzbnVar);

    zzbi isAndroidTvAdsFramework(Boolean bool);

    zzbi isTv(Boolean bool);

    zzbi linearAdSlotHeight(Integer num);

    zzbi linearAdSlotWidth(Integer num);

    zzbi liveStreamEventId(String str);

    zzbi liveStreamPrefetchSeconds(Float f10);

    zzbi marketAppInfo(com.google.ads.interactivemedia.v3.impl.zzw zzwVar);

    zzbi msParameter(String str);

    zzbi network(String str);

    zzbi networkCode(String str);

    zzbi oAuthToken(String str);

    zzbi omidAdSessionsOnStartedOnly(Boolean bool);

    zzbi platformSignals(Map<String, String> map);

    zzbi projectNumber(String str);

    zzbi region(String str);

    zzbi rubidiumApiVersion(int i10);

    zzbi secureSignals(List<zzcf> list);

    zzbi settings(ImaSdkSettings imaSdkSettings);

    zzbi streamActivityMonitorId(String str);

    zzbi supportsExternalNavigation(Boolean bool);

    zzbi supportsIconClickFallback(Boolean bool);

    zzbi supportsNativeNetworking(Boolean bool);

    zzbi supportsResizing(Boolean bool);

    zzbi useQAStreamBaseUrl(Boolean bool);

    zzbi usesCustomVideoPlayback(Boolean bool);

    zzbi vastLoadTimeout(Float f10);

    zzbi videoContinuousPlay(AdsRequestImpl.ContinuousPlayState continuousPlayState);

    zzbi videoEnvironment(zzcn zzcnVar);

    zzbi videoId(String str);

    zzbi videoPlayActivation(AdsRequestImpl.AutoPlayState autoPlayState);

    zzbi videoPlayMuted(AdsRequestImpl.MutePlayState mutePlayState);

    zzbi videoStitcherSessionOptions(Map<String, Object> map);

    zzbi vodConfigId(String str);
}
