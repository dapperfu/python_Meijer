package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.impl.data.zzcj;
import java.util.SortedSet;

/* loaded from: classes4.dex */
final class zzaq implements zzbv {
    private final SortedSet zza;
    private final zzbi zzb;
    private final String zzc;
    private long zzd = 0;
    private VideoProgressUpdate zze = new VideoProgressUpdate(0, 0);

    zzaq(zzbi zzbiVar, SortedSet sortedSet, String str) {
        this.zza = sortedSet;
        this.zzb = zzbiVar;
        this.zzc = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbv
    public final void zzw(VideoProgressUpdate videoProgressUpdate) {
        if (videoProgressUpdate == null || videoProgressUpdate.getDuration() < 0.0f || videoProgressUpdate.equals(this.zze)) {
            return;
        }
        float currentTime = this.zze.getCurrentTime();
        float currentTime2 = videoProgressUpdate.getCurrentTime();
        if (!(currentTime < currentTime2 ? this.zza.subSet(Float.valueOf(currentTime), Float.valueOf(currentTime2)) : this.zza.subSet(Float.valueOf(currentTime2), Float.valueOf(currentTime))).isEmpty() || this.zza.contains(Float.valueOf(videoProgressUpdate.getCurrentTime())) || System.currentTimeMillis() - this.zzd >= 1000) {
            this.zzd = System.currentTimeMillis();
            this.zze = videoProgressUpdate;
            this.zzb.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.contentTimeUpdate, JavaScriptMessage.MsgType.contentTimeUpdate, this.zzc, zzcj.create(videoProgressUpdate)));
        }
    }
}
