package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.internal.zzev;
import com.google.ads.interactivemedia.v3.internal.zzex;
import com.google.ads.interactivemedia.v3.internal.zzqf;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AdsRequestImpl implements AdsRequest {
    private String zza;
    private String zzb;
    private ContentProgressProvider zzc;
    private Float zzg;
    private List zzh;
    private String zzi;
    private String zzj;
    private Float zzk;
    private Float zzl;
    private SecureSignals zzm;
    private transient Object zzo;
    private AutoPlayState zzd = AutoPlayState.UNKNOWN;
    private MutePlayState zze = MutePlayState.UNKNOWN;
    private ContinuousPlayState zzf = ContinuousPlayState.UNKNOWN;
    private zzqf zzn = zzqf.zzf();

    public enum AutoPlayState {
        AUTO,
        CLICK,
        UNKNOWN
    }

    public enum ContinuousPlayState {
        OFF,
        ON,
        UNKNOWN
    }

    public enum MutePlayState {
        MUTED,
        UNKNOWN,
        UNMUTED
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdTagUrl() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdsResponse() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final ContentProgressProvider getContentProgressProvider() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final String getContentUrl() {
        return this.zzj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getExtraParameter(String str) {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Map<String, String> getExtraParameters() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final SecureSignals getSecureSignals() {
        return this.zzm;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final Object getUserRequestContext() {
        return this.zzo;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdTagUrl(String str) {
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdsResponse(String str) {
        this.zzb = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentKeywords(List<String> list) {
        this.zzh = list;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        this.zzc = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentTitle(String str) {
        this.zzi = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setContentUrl(String str) {
        this.zzj = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setExtraParameter(String str, String str2) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setSecureSignals(SecureSignals secureSignals) {
        this.zzm = secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setUserRequestContext(Object obj) {
        this.zzo = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final zzex zza() {
        return new zzev(this.zza);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final zzqf zzb() {
        return this.zzn;
    }

    public final AutoPlayState zzd() {
        return this.zzd;
    }

    public final ContinuousPlayState zze() {
        return this.zzf;
    }

    public final MutePlayState zzf() {
        return this.zze;
    }

    public final Float zzg() {
        return this.zzg;
    }

    public final Float zzh() {
        return this.zzl;
    }

    public final Float zzi() {
        return this.zzk;
    }

    public final String zzj() {
        return this.zzi;
    }

    public final List zzk() {
        return this.zzh;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillAutoPlay(boolean z10) {
        this.zzd = z10 ? AutoPlayState.AUTO : AutoPlayState.CLICK;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillPlayMuted(boolean z10) {
        this.zze = z10 ? MutePlayState.MUTED : MutePlayState.UNMUTED;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContinuousPlayback(boolean z10) {
        this.zzf = z10 ? ContinuousPlayState.ON : ContinuousPlayState.OFF;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentDuration(float f10) {
        this.zzg = Float.valueOf(f10);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setLiveStreamPrefetchSeconds(float f10) {
        this.zzl = Float.valueOf(f10);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setVastLoadTimeout(float f10) {
        this.zzk = Float.valueOf(f10);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void zzc(long j10) {
        this.zzn = zzqf.zzh(Long.valueOf(j10));
    }
}
