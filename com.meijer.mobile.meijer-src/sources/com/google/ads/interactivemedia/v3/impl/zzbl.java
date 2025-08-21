package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.impl.data.zzce;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzfq;
import com.google.ads.interactivemedia.v3.internal.zzrf;

/* loaded from: classes4.dex */
public final class zzbl implements zzcc, zzf, zzbh {
    private final AdDisplayContainer zza;
    private final VideoAdPlayer zzb;
    private final zzat zzc;
    private final zzbi zzd;
    private final String zze;
    private final zzg zzf;
    private final zzrf zzg = zzrf.zzf(2);

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzd() {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.zzb.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzf
    public final void zzb(JavaScriptMessage.MsgType msgType, AdMediaInfo adMediaInfo, Object obj) {
        JavaScriptMessage.MsgChannel msgChannel = (JavaScriptMessage.MsgChannel) this.zzg.zze().get(adMediaInfo);
        if (msgChannel != null) {
            this.zzd.zzn(new JavaScriptMessage(msgChannel, msgType, this.zze, obj));
            return;
        }
        zzfk.zzd("The adMediaInfo for the " + String.valueOf(msgType) + " event is not active. This may occur if callbacks are triggered after the ad is unloaded.");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzc() {
        zzfk.zzc("Destroying NativeVideoDisplay");
        this.zzb.removeCallback(this.zzf);
        this.zzb.release();
    }

    public final void zze() {
        this.zzf.zzc();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzf(zzce zzceVar) {
        if (!(this.zzb instanceof ResizablePlayer)) {
            zzfk.zza("Video player does not support resizing.");
            return;
        }
        if (!zzfq.zza(this.zza, zzceVar)) {
            zzfk.zza("Creative resize parameters were not within the containers bounds.");
            return;
        }
        int width = this.zza.getAdContainer().getWidth();
        int height = this.zza.getAdContainer().getHeight();
        ((ResizablePlayer) this.zzb).resize(zzceVar.x().intValue(), zzceVar.y().intValue(), (width - zzceVar.x().intValue()) - zzceVar.width().intValue(), (height - zzceVar.y().intValue()) - zzceVar.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzg() {
        VideoAdPlayer videoAdPlayer = this.zzb;
        if (videoAdPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoAdPlayer).resize(0, 0, 0, 0);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzf
    public final void zzv(JavaScriptMessage.MsgChannel msgChannel, JavaScriptMessage.MsgType msgType) {
        this.zzd.zzn(new JavaScriptMessage(msgChannel, msgType, "*", null));
    }

    public zzbl(String str, zzbi zzbiVar, zzat zzatVar, AdDisplayContainer adDisplayContainer, Context context) {
        this.zza = adDisplayContainer;
        VideoAdPlayer player = adDisplayContainer.getPlayer();
        this.zzb = player;
        this.zzc = zzatVar;
        this.zzd = zzbiVar;
        this.zze = str;
        zzg zzgVar = new zzg();
        this.zzf = zzgVar;
        zzgVar.zza(this);
        player.addCallback(zzgVar);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        JavaScriptMessage.MsgChannel msgChannelZza = javaScriptMessage.zza();
        JavaScriptMessage.MsgType msgTypeZzb = javaScriptMessage.zzb();
        com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar = (com.google.ads.interactivemedia.v3.impl.data.zzbu) javaScriptMessage.zzc();
        AdMediaInfo adMediaInfo = (AdMediaInfo) this.zzg.get(msgChannelZza);
        JavaScriptMessage.MsgType msgType = JavaScriptMessage.MsgType.activate;
        int iOrdinal = msgTypeZzb.ordinal();
        if (iOrdinal != 34) {
            if (iOrdinal != 45) {
                if (iOrdinal != 75) {
                    if (iOrdinal != 55) {
                        if (iOrdinal != 56) {
                            return;
                        }
                        this.zzb.playAd(adMediaInfo);
                        this.zzf.zzb();
                        return;
                    }
                    this.zzb.pauseAd(adMediaInfo);
                    return;
                }
            } else {
                if (zzbuVar != null && zzbuVar.videoUrl != null) {
                    this.zzf.zzb();
                    AdMediaInfo adMediaInfo2 = new AdMediaInfo(zzbuVar.videoUrl);
                    com.google.ads.interactivemedia.v3.impl.data.zzd zzdVar = zzbuVar.adPodInfo;
                    if (zzdVar == null) {
                        zzdVar = null;
                    }
                    this.zzg.put(msgChannelZza, adMediaInfo2);
                    this.zzb.loadAd(adMediaInfo2, zzdVar);
                    return;
                }
                this.zzc.zzc(new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
                return;
            }
        }
        this.zzb.stopAd(adMediaInfo);
        this.zzg.remove(msgChannelZza);
    }
}
