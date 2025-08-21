package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;

/* loaded from: classes4.dex */
public interface AdDisplayContainer extends BaseDisplayContainer {
    VideoAdPlayer getPlayer();

    @Deprecated
    void setPlayer(VideoAdPlayer videoAdPlayer);
}
