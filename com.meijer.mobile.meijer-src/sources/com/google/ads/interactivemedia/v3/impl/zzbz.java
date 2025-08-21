package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.internal.zzex;
import com.google.ads.interactivemedia.v3.internal.zzey;
import com.google.ads.interactivemedia.v3.internal.zzqf;
import com.google.ads.interactivemedia.v3.internal.zzwm;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbz implements StreamRequest {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private Map zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private StreamRequest.StreamFormat zzs;
    private String zzt;
    private Map zzu;
    private zzqf zzv = zzqf.zzf();

    @zzwm(zza = "useQAStreamBaseUrl")
    private Boolean zzw;
    private SecureSignals zzx;
    private transient Object zzy;

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Map<String, String> getAdTagParameters() {
        return this.zzn;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAdTagUrl() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getApiKey() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAssetKey() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAuthToken() {
        return this.zzq;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentSourceId() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentSourceUrl() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final String getContentUrl() {
        return this.zzp;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getCustomAssetKey() {
        return this.zzi;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final boolean getEnableNonce() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final StreamRequest.StreamFormat getFormat() {
        return this.zzs;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getLiveStreamEventId() {
        return this.zzj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getManifestSuffix() {
        return this.zzo;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getNetworkCode() {
        return this.zzh;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getOAuthToken() {
        return this.zzm;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getProjectNumber() {
        return this.zzl;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getRegion() {
        return this.zzk;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final SecureSignals getSecureSignals() {
        return this.zzx;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getStreamActivityMonitorId() {
        return this.zzr;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Boolean getUseQAStreamBaseUrl() {
        return this.zzw;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final Object getUserRequestContext() {
        return this.zzy;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getVideoId() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Map<String, Object> getVideoStitcherSessionOptions() {
        return this.zzu;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getVodConfigId() {
        return this.zzt;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAdTagParameters(Map<String, String> map) {
        this.zzn = map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAuthToken(String str) {
        this.zzq = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setContentUrl(String str) {
        this.zzp = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setEnableNonce(boolean z10) {
        this.zzf = z10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setFormat(StreamRequest.StreamFormat streamFormat) {
        this.zzs = streamFormat;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setManifestSuffix(String str) {
        this.zzo = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setSecureSignals(SecureSignals secureSignals) {
        this.zzx = secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setStreamActivityMonitorId(String str) {
        this.zzr = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setUseQAStreamBaseUrl(Boolean bool) {
        this.zzw = bool;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setUserRequestContext(Object obj) {
        this.zzy = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setVideoStitcherSessionOptions(Map<String, Object> map) {
        this.zzu = map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final zzex zza() {
        return new zzey();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final zzqf zzb() {
        return this.zzv;
    }

    public final void zzd(String str) {
        this.zza = str;
    }

    public final void zze(String str) {
        this.zzc = str;
    }

    public final void zzf(String str) {
        this.zzb = str;
    }

    public final void zzg(String str) {
        this.zzd = str;
    }

    public final void zzh(String str) {
        this.zze = str;
    }

    public final void zzi(String str) {
        this.zzi = str;
    }

    public final void zzj(String str) {
        this.zzj = str;
    }

    public final void zzk(String str) {
        this.zzh = str;
    }

    public final void zzl(String str) {
        this.zzm = str;
    }

    public final void zzm(String str) {
        this.zzl = str;
    }

    public final void zzn(String str) {
        this.zzk = str;
    }

    public final void zzo(String str) {
        this.zzg = str;
    }

    public final void zzp(String str) {
        this.zzt = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void zzc(long j10) {
        this.zzv = zzqf.zzh(Long.valueOf(j10));
    }
}
