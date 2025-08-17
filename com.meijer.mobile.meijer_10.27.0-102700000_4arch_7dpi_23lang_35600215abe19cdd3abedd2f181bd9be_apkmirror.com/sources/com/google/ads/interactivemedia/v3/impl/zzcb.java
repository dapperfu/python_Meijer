package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.impl.data.zzce;
import com.google.ads.interactivemedia.v3.impl.data.zzcj;
import com.google.ads.interactivemedia.v3.impl.data.zzcp;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzfq;
import com.google.ads.interactivemedia.v3.internal.zzgh;
import com.google.ads.interactivemedia.v3.internal.zzqm;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzcb implements VideoStreamPlayer.VideoStreamPlayerCallback, zzcc, zzbv, zzbh {
    private final VideoStreamPlayer zza;
    private final zzbi zzb;
    private final zzat zzc;
    private boolean zzd;
    private final zzar zze;
    private final zzcd zzf;
    private final String zzg;
    private final String zzh;
    private final StreamDisplayContainer zzi;

    private final void zzn(JavaScriptMessage.MsgType msgType, Object obj) {
        this.zzb.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.videoDisplay1, msgType, this.zzg, obj));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.zza.getContentProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onContentComplete() {
        this.zzb.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.adsLoader, JavaScriptMessage.MsgType.contentComplete, "*", null));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onPause() {
        zzn(JavaScriptMessage.MsgType.pause, null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onResume() {
        zzn(JavaScriptMessage.MsgType.play, null);
    }

    public final void zzb() {
        this.zza.onAdBreakEnded();
        this.zzf.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzc() {
        zzfk.zzc("Destroying StreamVideoDisplay");
        this.zza.removeCallback(this);
        this.zze.zzf();
        this.zze.zzd(this);
        this.zzf.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzd() {
        this.zze.zzc(this);
        this.zze.zze();
    }

    public final void zze() {
        this.zza.onAdBreakStarted();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzf(zzce zzceVar) {
        if (!(this.zza instanceof ResizablePlayer)) {
            zzfk.zza("Stream player does not support resizing.");
            return;
        }
        if (!zzfq.zza(this.zzi, zzceVar)) {
            zzfk.zza("Video resize parameters were not within the container bounds.");
            return;
        }
        int width = this.zzi.getAdContainer().getWidth();
        int height = this.zzi.getAdContainer().getHeight();
        ((ResizablePlayer) this.zza).resize(zzceVar.x().intValue(), zzceVar.y().intValue(), (width - zzceVar.x().intValue()) - zzceVar.width().intValue(), (height - zzceVar.y().intValue()) - zzceVar.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzcc
    public final void zzg() {
        VideoStreamPlayer videoStreamPlayer = this.zza;
        if (videoStreamPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoStreamPlayer).resize(0, 0, 0, 0);
        }
    }

    public final void zzh() {
        this.zza.onAdPeriodEnded();
    }

    public final void zzi() {
        this.zza.onAdPeriodStarted();
    }

    public final void zzj() {
        this.zza.addCallback(this);
    }

    public final void zzk(long j10) {
        this.zza.seek(j10);
    }

    final void zzm() {
        this.zzf.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbv
    public final void zzw(VideoProgressUpdate videoProgressUpdate) {
        if (!this.zzd) {
            zzn(JavaScriptMessage.MsgType.start, zzcp.builder().volumePercentage(this.zza.getVolume()).build());
            this.zzd = true;
        }
        zzn(JavaScriptMessage.MsgType.timeupdate, zzcj.create(videoProgressUpdate));
    }

    zzcb(String str, zzbi zzbiVar, zzat zzatVar, StreamDisplayContainer streamDisplayContainer, String str2, zzar zzarVar, zzcd zzcdVar, Context context) {
        this.zzd = false;
        this.zza = streamDisplayContainer.getVideoStreamPlayer();
        this.zzc = zzatVar;
        this.zzg = str;
        this.zzb = zzbiVar;
        this.zzh = str2;
        this.zzd = false;
        this.zzi = streamDisplayContainer;
        this.zze = zzarVar;
        this.zzf = zzcdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onUserTextReceived(String str) {
        if (zzqm.zzc(str)) {
            return;
        }
        zzn(JavaScriptMessage.MsgType.timedMetadata, zzca.create(str));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onVolumeChanged(int i10) {
        zzn(JavaScriptMessage.MsgType.volumeChange, zzcp.builder().volumePercentage(i10).build());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        String string;
        JavaScriptMessage.MsgType msgTypeZzb = javaScriptMessage.zzb();
        com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar = (com.google.ads.interactivemedia.v3.impl.data.zzbu) javaScriptMessage.zzc();
        JavaScriptMessage.MsgType msgType = JavaScriptMessage.MsgType.activate;
        int iOrdinal = msgTypeZzb.ordinal();
        if (iOrdinal != 47) {
            if (iOrdinal != 55) {
                if (iOrdinal != 56) {
                    return;
                }
                this.zza.resume();
                return;
            }
            this.zza.pause();
            return;
        }
        if (zzbuVar != null && (string = zzbuVar.streamUrl) != null) {
            int i10 = 0;
            this.zzd = false;
            String str = this.zzh;
            if (str != null && str.length() != 0) {
                String string2 = "";
                String strReplaceAll = str.trim().replaceAll("\\s+", "");
                if (strReplaceAll.charAt(0) == '?') {
                    strReplaceAll = strReplaceAll.substring(1);
                }
                if (strReplaceAll.length() != 0) {
                    Map mapZzc = zzgh.zzc(Uri.parse(string));
                    HashMap map = new HashMap();
                    Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                    builderBuildUpon.clearQuery();
                    Map mapZzc2 = zzgh.zzc(Uri.parse("http://www.dom.com/path?".concat(strReplaceAll)));
                    map.putAll(mapZzc2);
                    if (!mapZzc.isEmpty()) {
                        for (String str2 : mapZzc.keySet()) {
                            if (!mapZzc2.containsKey(str2)) {
                                map.put(str2, (String) mapZzc.get(str2));
                            }
                        }
                    }
                    if (!map.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder();
                        for (Map.Entry entry : map.entrySet()) {
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            sb2.append(str3);
                            sb2.append("=");
                            sb2.append(str4);
                            if (i10 < map.size() - 1) {
                                sb2.append("&");
                            }
                            i10++;
                        }
                        string2 = sb2.toString();
                    }
                    builderBuildUpon.encodedQuery(string2);
                    string = builderBuildUpon.build().toString();
                }
            }
            this.zza.loadUrl(string, zzbuVar.subtitles);
            return;
        }
        this.zzc.zzc(new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
    }

    final void zzl(com.google.ads.interactivemedia.v3.impl.data.zzc zzcVar) {
        if (zzcVar.isLinear()) {
            this.zzf.zzb();
        }
    }
}
