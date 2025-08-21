package com.google.ads.interactivemedia.v3.api.player;

import com.google.ads.interactivemedia.v3.api.AdPodInfo;

/* loaded from: classes4.dex */
public interface VideoAdPlayer extends AdProgressProvider, VolumeProvider {

    public interface VideoAdPlayerCallback {
        void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate);

        void onBuffering(AdMediaInfo adMediaInfo);

        void onContentComplete();

        void onEnded(AdMediaInfo adMediaInfo);

        void onError(AdMediaInfo adMediaInfo);

        void onLoaded(AdMediaInfo adMediaInfo);

        void onPause(AdMediaInfo adMediaInfo);

        void onPlay(AdMediaInfo adMediaInfo);

        void onResume(AdMediaInfo adMediaInfo);

        void onVolumeChanged(AdMediaInfo adMediaInfo, int i10);
    }

    void addCallback(VideoAdPlayerCallback videoAdPlayerCallback);

    void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo);

    void pauseAd(AdMediaInfo adMediaInfo);

    void playAd(AdMediaInfo adMediaInfo);

    void release();

    void removeCallback(VideoAdPlayerCallback videoAdPlayerCallback);

    void stopAd(AdMediaInfo adMediaInfo);
}
