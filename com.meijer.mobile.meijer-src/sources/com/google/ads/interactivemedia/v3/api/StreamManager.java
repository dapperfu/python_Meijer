package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface StreamManager extends BaseManager {
    @Deprecated
    double getContentTimeForStreamTime(double d10);

    long getContentTimeMsForStreamTimeMs(long j10);

    List<CuePoint> getCuePoints();

    @Deprecated
    CuePoint getPreviousCuePointForStreamTime(double d10);

    CuePoint getPreviousCuePointForStreamTimeMs(long j10);

    String getStreamId();

    @Deprecated
    double getStreamTimeForContentTime(double d10);

    long getStreamTimeMsForContentTimeMs(long j10);

    void loadThirdPartyStream(String str, List<? extends Map<String, String>> list);

    void replaceAdTagParameters(Map<String, String> map);
}
