package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;

/* loaded from: classes4.dex */
public interface StreamDisplayContainer extends BaseDisplayContainer {
    VideoStreamPlayer getVideoStreamPlayer();

    @Deprecated
    void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer);
}
