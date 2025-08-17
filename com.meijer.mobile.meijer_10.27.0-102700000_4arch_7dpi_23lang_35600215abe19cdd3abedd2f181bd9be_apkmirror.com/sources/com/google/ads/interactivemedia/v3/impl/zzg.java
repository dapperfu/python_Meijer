package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.impl.data.zzcj;
import com.google.ads.interactivemedia.v3.impl.data.zzcp;
import com.google.ads.interactivemedia.v3.internal.zzrz;
import java.util.HashMap;

/* loaded from: classes4.dex */
final class zzg implements VideoAdPlayer.VideoAdPlayerCallback {
    private zzf zzb;
    private boolean zzc = false;
    private final HashMap zza = zzrz.zzb(2);

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPlay(AdMediaInfo adMediaInfo) {
    }

    final void zza(zzf zzfVar) {
        this.zzb = zzfVar;
    }

    final void zzb() {
        this.zzc = true;
    }

    final void zzc() {
        this.zzc = false;
    }

    private final void zzd(JavaScriptMessage.MsgType msgType, AdMediaInfo adMediaInfo, Object obj) {
        zzf zzfVar = this.zzb;
        if (zzfVar != null) {
            zzfVar.zzb(msgType, adMediaInfo, obj);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate) {
        if (this.zzc && videoProgressUpdate != null && videoProgressUpdate.getDuration() > 0.0f) {
            if (this.zza.get(adMediaInfo) == null && videoProgressUpdate.getCurrentTime() > 0.0f) {
                zzd(JavaScriptMessage.MsgType.start, adMediaInfo, null);
                this.zza.put(adMediaInfo, Boolean.TRUE);
            }
            zzd(JavaScriptMessage.MsgType.timeupdate, adMediaInfo, zzcj.create(videoProgressUpdate));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onBuffering(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(JavaScriptMessage.MsgType.waiting, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onContentComplete() {
        zzf zzfVar = this.zzb;
        if (zzfVar != null) {
            zzfVar.zzv(JavaScriptMessage.MsgChannel.adsLoader, JavaScriptMessage.MsgType.contentComplete);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onEnded(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(JavaScriptMessage.MsgType.end, adMediaInfo, null);
            this.zza.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onError(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(JavaScriptMessage.MsgType.error, adMediaInfo, null);
            this.zza.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onLoaded(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(JavaScriptMessage.MsgType.loaded, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPause(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(JavaScriptMessage.MsgType.pause, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onResume(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(JavaScriptMessage.MsgType.play, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onVolumeChanged(AdMediaInfo adMediaInfo, int i10) {
        if (this.zzc) {
            zzd(JavaScriptMessage.MsgType.volumeChange, adMediaInfo, zzcp.builder().volumePercentage(i10).build());
        }
    }

    zzg() {
    }
}
