package com.google.ads.interactivemedia.v3.impl;

import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;

/* loaded from: classes4.dex */
final class zzar extends zzbw {
    protected final ContentProgressProvider zza;

    zzar(ContentProgressProvider contentProgressProvider, long j10) {
        super(200L);
        this.zza = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbw
    public final VideoProgressUpdate zza() {
        VideoProgressUpdate contentProgress = this.zza.getContentProgress();
        if (contentProgress != null) {
            return contentProgress;
        }
        FS.log_w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
}
