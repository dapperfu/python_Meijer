package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.BaseRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.zzcf;
import com.google.ads.interactivemedia.v3.impl.data.zzcn;
import com.google.ads.interactivemedia.v3.internal.zzahg;
import com.google.ads.interactivemedia.v3.internal.zzahh;
import com.google.ads.interactivemedia.v3.internal.zzahj;
import com.google.ads.interactivemedia.v3.internal.zzel;
import com.google.ads.interactivemedia.v3.internal.zzes;
import com.google.ads.interactivemedia.v3.internal.zzet;
import com.google.ads.interactivemedia.v3.internal.zzew;
import com.google.ads.interactivemedia.v3.internal.zzez;
import com.google.ads.interactivemedia.v3.internal.zzfd;
import com.google.ads.interactivemedia.v3.internal.zzfj;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzfl;
import com.google.ads.interactivemedia.v3.internal.zzfp;
import com.google.ads.interactivemedia.v3.internal.zzgd;
import com.google.ads.interactivemedia.v3.internal.zzgg;
import com.google.ads.interactivemedia.v3.internal.zzpr;
import com.google.ads.interactivemedia.v3.internal.zzqf;
import com.google.ads.interactivemedia.v3.internal.zzqm;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrp;
import com.google.ads.interactivemedia.v3.internal.zzuk;
import com.google.ads.interactivemedia.v3.internal.zzuu;
import com.google.ads.interactivemedia.v3.internal.zzuv;
import com.google.ads.interactivemedia.v3.internal.zzvb;
import com.google.ads.interactivemedia.v3.internal.zzvd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class zzy implements AdsLoader {
    private final Context zza;
    private final zzvd zzb;
    private final zzba zzc;
    private final zzat zze;
    private final zzbt zzi;
    private final ImaSdkSettings zzj;
    private final BaseDisplayContainer zzk;
    private final zzfp zzl;
    private final zzgd zzm;
    private final zzgg zzn;
    private final zzuv zzo;
    private final zzfd zzp;
    private final TestingConfiguration zzq;
    private zzet zzr;
    private final zzv zzd = new zzv(this);
    private final List zzf = Collections.synchronizedList(new ArrayList(1));
    private final Map zzg = new HashMap();
    private final Map zzh = new HashMap();

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final ImaSdkSettings getSettings() {
        return this.zzj;
    }

    public static zzy zzc(zzba zzbaVar, Context context, ImaSdkSettings imaSdkSettings, BaseDisplayContainer baseDisplayContainer, zzfj zzfjVar, ExecutorService executorService, zzfl zzflVar) {
        final zzy zzyVar = new zzy(zzbaVar, context, imaSdkSettings, baseDisplayContainer, zzfjVar, executorService, zzflVar);
        zzbaVar.zze().zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzo
            @Override // java.lang.Runnable
            public final void run() {
                zzy.zzo(this.zza);
            }
        }, executorService);
        return zzyVar;
    }

    static /* bridge */ /* synthetic */ void zzn(zzy zzyVar, AdsManagerLoadedEvent adsManagerLoadedEvent) {
        Iterator it = zzyVar.zzf.iterator();
        while (it.hasNext()) {
            ((AdsLoader.AdsLoadedListener) it.next()).onAdsManagerLoaded(adsManagerLoadedEvent);
        }
    }

    static /* synthetic */ void zzo(zzy zzyVar) {
        List<String> list;
        zzba zzbaVar = zzyVar.zzc;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar = (com.google.ads.interactivemedia.v3.impl.data.zzbu) zzs(zzbaVar.zze());
        if (zzbuVar == null) {
            zzyVar.zze.zzc(new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "core component initialization failed")));
            return;
        }
        zzyVar.zzp.zzh(zzbuVar.enableInstrumentation);
        Integer num = zzbuVar.espAdapterTimeoutMs;
        if (num != null && (list = zzbuVar.espAdapters) != null) {
            zzyVar.zzm.zzc(list, num);
            zzyVar.zzm.zzb();
        }
        zzyVar.zzl.zzb(zzbuVar.platformSignalCollectorTimeoutMs);
        zzet zzetVar = new zzet(zzyVar.zzc, zzyVar.zza, zzyVar.zzo, zzes.zza(zzbuVar), zzyVar.zzp);
        zzyVar.zzr = zzetVar;
        zzetVar.zze();
        zzyVar.zzp.zzb().zze(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
        zzyVar.zzb.zzc(zzbuVar);
    }

    static final Object zzs(Future future) {
        if (future == null) {
            return null;
        }
        try {
            return zzuk.zzd(future);
        } catch (Exception e10) {
            zzfk.zzb("Error during initialization", e10);
            return null;
        } catch (Throwable th2) {
            zzfk.zzb("Error during initialization", new Exception(th2));
            return null;
        }
    }

    private final zzw zzu() throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo;
        PackageManager packageManager = this.zza.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                return zzw.create(packageInfo.versionCode, activityInfo.packageName);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final zzcn zzv() {
        NetworkCapabilities networkCapabilities;
        Integer numValueOf;
        Map<String, String> featureFlags;
        boolean z10;
        if (this.zza.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zza.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                numValueOf = Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
            }
            featureFlags = this.zzj.getFeatureFlags();
            z10 = false;
            if (featureFlags != null && featureFlags.get("NATIVE_UI") != null) {
                z10 = true;
            }
            if (numValueOf == null || z10) {
                return zzcn.create(numValueOf, z10);
            }
            return null;
        }
        zzfk.zzd("Host application doesn't have ACCESS_NETWORK_STATE permission");
        numValueOf = null;
        featureFlags = this.zzj.getFeatureFlags();
        z10 = false;
        if (featureFlags != null) {
            z10 = true;
        }
        if (numValueOf == null) {
        }
        return zzcn.create(numValueOf, z10);
    }

    private final zzuu zzw(final BaseRequest baseRequest, final com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar, final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final zzahj zzahjVarZzc = this.zzp.zzc(str);
        final zzez zzezVar = new zzez(this.zza, new zzew(zzbuVar), this.zzp, this.zzj.getFeatureFlags(), this.zzq);
        final zzuu zzuuVarZza = this.zzo.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.impl.zzq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzg(zzezVar, baseRequest, str);
            }
        });
        zzuuVarZza.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzr
            @Override // java.lang.Runnable
            public final void run() {
                zzahjVarZzc.zzi(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
            }
        }, this.zzo);
        final zzuu zzuuVarZza2 = this.zzo.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.impl.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(zzbuVar);
            }
        });
        zzuuVarZza2.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzt
            @Override // java.lang.Runnable
            public final void run() {
                zzahjVarZzc.zzj(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
            }
        }, this.zzo);
        final zzgd zzgdVar = this.zzm;
        Objects.requireNonNull(zzgdVar);
        final zzuu zzuuVarZza3 = this.zzo.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.impl.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzgdVar.zze();
            }
        });
        zzuuVarZza3.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzahjVarZzc.zzl(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
            }
        }, this.zzo);
        final zzuu zzuuVarZza4 = zzpr.zza(this.zzl.zza(), null);
        zzuuVarZza4.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzk
            @Override // java.lang.Runnable
            public final void run() {
                zzahjVarZzc.zzm(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
            }
        }, this.zzo);
        return zzuk.zza(zzuuVarZza, zzuuVarZza2, zzuuVarZza3, zzuuVarZza4).zza(new Callable(this) { // from class: com.google.ads.interactivemedia.v3.impl.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SecureSignals secureSignals = baseRequest.getSecureSignals();
                List list = (List) zzy.zzt(zzuuVarZza3, new ArrayList());
                if (secureSignals != null) {
                    list.add(zzcf.createBy1stPartyData(secureSignals));
                }
                zzuu zzuuVar = zzuuVarZza4;
                zzuu zzuuVar2 = zzuuVarZza2;
                zzuu zzuuVar3 = zzuuVarZza;
                zzahjVarZzc.zzh(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
                com.google.ads.interactivemedia.v3.impl.data.zzbn zzbnVar = (com.google.ads.interactivemedia.v3.impl.data.zzbn) zzuk.zzd(zzuuVar3);
                return new zzad(zzqf.zzh(zzbnVar), (String) zzuk.zzd(zzuuVar2), zzrm.zzk(list), zzrp.zzc((Map) zzy.zzt(zzuuVar, new HashMap())));
            }
        }, this.zzo);
    }

    private final String zzx() {
        TestingConfiguration testingConfiguration = this.zzq;
        if (testingConfiguration == null || !testingConfiguration.ignoreStrictModeFalsePositives()) {
            return UUID.randomUUID().toString();
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
        String string = UUID.randomUUID().toString();
        StrictMode.setThreadPolicy(threadPolicy);
        return string;
    }

    private final String zzy() {
        return String.format("android%s:%s:%s", Build.VERSION.RELEASE, "3.35.1", this.zza.getPackageName());
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zze.zza(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.zzf.add(adsLoadedListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void contentComplete() {
        this.zzc.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.adsLoader, JavaScriptMessage.MsgType.contentComplete, "*", null));
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void release() {
        this.zzk.destroy();
        zzba zzbaVar = this.zzc;
        if (zzbaVar != null) {
            zzbaVar.zzk();
        }
        this.zzg.clear();
        this.zzf.clear();
        this.zze.zzb();
        this.zzh.clear();
        this.zzp.zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zze.zzd(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.zzf.remove(adsLoadedListener);
    }

    final /* synthetic */ com.google.ads.interactivemedia.v3.impl.data.zzbn zzg(zzez zzezVar, BaseRequest baseRequest, String str) throws Exception {
        return zzezVar.zza(baseRequest, this.zzr, str);
    }

    final /* synthetic */ String zzj(com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar) throws Exception {
        return this.zzn.zza(zzbuVar.msParameterTimeoutMs);
    }

    final String zzk(final StreamRequest streamRequest, final String str) {
        zzd zzdVar;
        com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar = (com.google.ads.interactivemedia.v3.impl.data.zzbu) zzs(this.zzb);
        if (zzbuVar == null) {
            zzdVar = new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Error initializing the SDK."), new Object());
        } else if (streamRequest == null) {
            zzdVar = new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "StreamRequest cannot be null."));
        } else {
            BaseDisplayContainer baseDisplayContainer = this.zzk;
            zzdVar = !(baseDisplayContainer instanceof StreamDisplayContainer) ? new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsLoader must be constructed with StreamDisplayContainer.")) : ((StreamDisplayContainer) baseDisplayContainer).getVideoStreamPlayer() == null ? new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream requests must specify a player.")) : null;
        }
        if (zzdVar != null) {
            this.zze.zzc(zzdVar);
            return str;
        }
        this.zzh.put(str, streamRequest);
        this.zzc.zzi(str, JavaScriptMessage.MsgChannel.adsLoader, this.zzd);
        final zzuu zzuuVarZzw = zzw(streamRequest, zzbuVar, str);
        zzuuVarZzw.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzm
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                this.zza.zzq(zzuuVarZzw, streamRequest, str);
            }
        }, this.zzo);
        return str;
    }

    final /* synthetic */ void zzp(zzuu zzuuVar, AdDisplayContainer adDisplayContainer, AdsRequest adsRequest, String str) throws PackageManager.NameNotFoundException {
        zzx zzxVar = (zzx) zzt(zzuuVar, zzx.zza());
        com.google.ads.interactivemedia.v3.impl.data.zzbn zzbnVar = (com.google.ads.interactivemedia.v3.impl.data.zzbn) zzxVar.zzb().zzd();
        String strZze = zzxVar.zze();
        zzrm zzrmVarZzc = zzxVar.zzc();
        zzrp zzrpVarZzd = zzxVar.zzd();
        zzet zzetVar = this.zzr;
        zzetVar.getClass();
        Map mapZza = zzetVar.zza();
        String strZzy = zzy();
        zzcn zzcnVarZzv = zzv();
        ImaSdkSettings imaSdkSettings = this.zzj;
        zzw zzwVarZzu = zzu();
        Context context = this.zza;
        TestingConfiguration testingConfiguration = this.zzq;
        JavaScriptMessage javaScriptMessage = new JavaScriptMessage(JavaScriptMessage.MsgChannel.adsLoader, JavaScriptMessage.MsgType.requestAds, str, com.google.ads.interactivemedia.v3.impl.data.zzbj.create(adsRequest, strZzy, mapZza, zzrmVarZzc, zzrpVarZzd, "android:0", zzcnVarZzv, imaSdkSettings, zzwVarZzu, zzel.zzd(context, testingConfiguration), zzel.zzc(context, testingConfiguration), strZze, zzbnVar, adDisplayContainer));
        this.zzc.zzj(zzbnVar);
        this.zzc.zzn(javaScriptMessage);
        zzahg zzahgVarZzc = zzahh.zzc();
        zzahgVarZzc.zza(System.currentTimeMillis());
        if (adsRequest.zzb().zze()) {
            zzahgVarZzc.zzb(((Long) adsRequest.zzb().zzb()).longValue());
        }
        this.zzp.zzc(str).zzf(zzahgVarZzc);
    }

    final /* synthetic */ void zzq(zzuu zzuuVar, StreamRequest streamRequest, String str) throws PackageManager.NameNotFoundException {
        zzx zzxVar = (zzx) zzt(zzuuVar, zzx.zza());
        StreamDisplayContainer streamDisplayContainer = (StreamDisplayContainer) this.zzk;
        com.google.ads.interactivemedia.v3.impl.data.zzbn zzbnVar = (com.google.ads.interactivemedia.v3.impl.data.zzbn) zzxVar.zzb().zzd();
        String strZze = zzxVar.zze();
        zzrm zzrmVarZzc = zzxVar.zzc();
        zzrp zzrpVarZzd = zzxVar.zzd();
        zzet zzetVar = this.zzr;
        zzetVar.getClass();
        Map mapZza = zzetVar.zza();
        String strZzy = zzy();
        zzcn zzcnVarZzv = zzv();
        ImaSdkSettings imaSdkSettings = this.zzj;
        zzw zzwVarZzu = zzu();
        Context context = this.zza;
        TestingConfiguration testingConfiguration = this.zzq;
        JavaScriptMessage javaScriptMessage = new JavaScriptMessage(JavaScriptMessage.MsgChannel.adsLoader, JavaScriptMessage.MsgType.requestStream, str, com.google.ads.interactivemedia.v3.impl.data.zzbj.createFromStreamRequest(streamRequest, strZzy, mapZza, zzrmVarZzc, zzrpVarZzd, "android:0", zzcnVarZzv, imaSdkSettings, zzwVarZzu, zzel.zzd(context, testingConfiguration), zzel.zzc(context, testingConfiguration), strZze, zzbnVar, streamDisplayContainer));
        this.zzc.zzj(zzbnVar);
        this.zzc.zzn(javaScriptMessage);
        zzahg zzahgVarZzc = zzahh.zzc();
        zzahgVarZzc.zza(System.currentTimeMillis());
        if (streamRequest.zzb().zze()) {
            zzahgVarZzc.zzb(((Long) streamRequest.zzb().zzb()).longValue());
        }
        this.zzp.zzc(str).zzf(zzahgVarZzc);
    }

    final void zzr(final AdsRequest adsRequest, final String str) {
        zzd zzdVar;
        com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar = (com.google.ads.interactivemedia.v3.impl.data.zzbu) zzs(this.zzb);
        if (zzbuVar == null) {
            zzdVar = new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Error initializing the SDK."), new Object());
        } else if (adsRequest == null) {
            zzdVar = new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsRequest cannot be null."));
        } else {
            BaseDisplayContainer baseDisplayContainer = this.zzk;
            zzdVar = !(baseDisplayContainer instanceof AdDisplayContainer) ? new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsLoader must be constructed with AdDisplayContainer.")) : baseDisplayContainer.getAdContainer() == null ? new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must have a UI container.")) : (zzqm.zzc(adsRequest.getAdTagUrl()) && zzqm.zzc(adsRequest.getAdsResponse())) ? new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Either ad tag url or ads response must non-null and non empty.")) : null;
        }
        if (zzdVar != null) {
            this.zze.zzc(zzdVar);
            return;
        }
        final AdDisplayContainer adDisplayContainer = (AdDisplayContainer) this.zzk;
        if (adDisplayContainer.getPlayer() == null) {
            this.zze.zzc(new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.ADS_PLAYER_NOT_PROVIDED, "VideoAdPlayer must be set on AdDisplayContainer before requesting ads."), new Object()));
            return;
        }
        this.zzg.put(str, adsRequest);
        this.zzc.zzi(str, JavaScriptMessage.MsgChannel.adsLoader, this.zzd);
        final zzuu zzuuVarZzw = zzw(adsRequest, zzbuVar, str);
        zzuuVarZzw.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzp
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                this.zza.zzp(zzuuVarZzw, adDisplayContainer, adsRequest, str);
            }
        }, this.zzo);
    }

    private zzy(zzba zzbaVar, Context context, ImaSdkSettings imaSdkSettings, BaseDisplayContainer baseDisplayContainer, zzfj zzfjVar, ExecutorService executorService, zzfl zzflVar) {
        ImaSdkSettings imaSdkSettingsCreateImaSdkSettings;
        this.zzc = zzbaVar;
        this.zza = context;
        if (imaSdkSettings == null) {
            imaSdkSettingsCreateImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
        } else {
            imaSdkSettingsCreateImaSdkSettings = imaSdkSettings;
        }
        this.zzj = imaSdkSettingsCreateImaSdkSettings;
        this.zzk = baseDisplayContainer;
        zzuv zzuvVarZza = zzvb.zza(executorService);
        this.zzo = zzuvVarZza;
        TestingConfiguration testingConfig = imaSdkSettings.getTestingConfig();
        this.zzq = testingConfig;
        this.zzi = new zzbt(zzbaVar, zzbaVar.zzb(), zzflVar);
        zzfd zzfdVar = new zzfd(zzbaVar, zzfjVar);
        this.zzp = zzfdVar;
        this.zze = new zzat(zzfdVar);
        baseDisplayContainer.claim();
        this.zzl = new zzfp(context, zzuvVarZza, zzfdVar, testingConfig);
        this.zzm = new zzgd(context, zzuvVarZza, zzfdVar);
        this.zzn = new zzgg(context, zzuvVarZza, testingConfig, zzfdVar);
        this.zzb = zzvd.zzs();
    }

    static final Object zzt(Future future, Object obj) {
        return zzqf.zzg(zzs(future)).zzc(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void requestAds(final AdsRequest adsRequest) {
        final String strZzx = zzx();
        long jCurrentTimeMillis = System.currentTimeMillis();
        adsRequest.zzc(jCurrentTimeMillis);
        this.zzb.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr(adsRequest, strZzx);
            }
        }, this.zzo);
        this.zzp.zzc(strZzx).zzc(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final String requestStream(final StreamRequest streamRequest) {
        final String strZzx = zzx();
        long jCurrentTimeMillis = System.currentTimeMillis();
        streamRequest.zzc(jCurrentTimeMillis);
        this.zzb.zzo(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(streamRequest, strZzx);
            }
        }, this.zzo);
        this.zzp.zzc(strZzx).zzc(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
        return strZzx;
    }
}
