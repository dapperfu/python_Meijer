package com.google.ads.interactivemedia.v3.impl;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;

/* loaded from: classes4.dex */
public final class zzbx extends zzaf implements StreamDisplayContainer {
    private VideoStreamPlayer zza;

    @Override // com.google.ads.interactivemedia.v3.api.StreamDisplayContainer
    public final VideoStreamPlayer getVideoStreamPlayer() {
        return this.zza;
    }

    public zzbx(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        super(viewGroup);
        this.zza = videoStreamPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamDisplayContainer
    public final void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer) {
        videoStreamPlayer.getClass();
        this.zza = videoStreamPlayer;
    }
}
