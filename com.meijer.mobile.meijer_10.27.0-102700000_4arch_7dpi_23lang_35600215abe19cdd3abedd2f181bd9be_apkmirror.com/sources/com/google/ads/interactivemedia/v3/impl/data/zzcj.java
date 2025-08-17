package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzav.class)
/* loaded from: classes4.dex */
public abstract class zzcj {
    private static final String DEFAULT_TIME_UNIT = "ms";

    public abstract long currentTime();

    public abstract long duration();

    public abstract String timeUnit();

    public static zzcj create(VideoProgressUpdate videoProgressUpdate) {
        return new zzav(videoProgressUpdate.getCurrentTimeMs(), videoProgressUpdate.getDurationMs(), DEFAULT_TIME_UNIT);
    }
}
