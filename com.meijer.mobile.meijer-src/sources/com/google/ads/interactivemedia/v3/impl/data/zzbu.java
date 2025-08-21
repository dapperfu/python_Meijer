package com.google.ads.interactivemedia.v3.impl.data;

import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.internal.zzaho;
import com.google.ads.interactivemedia.v3.internal.zzahr;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public final class zzbu {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public zzc adData;
    public double adPeriodDuration;
    public zzd adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public List<Long> adsDurationsMs;
    public long appSetIdTimeoutMs;
    public double bufferedTime;
    public Map<String, zzbe> companions;
    public zzbs consentSettingsConfig;
    public List<zzbf> cuepoints;
    public double currentTime;
    public boolean disableAppSetId;
    public boolean disableJsIdLessEvaluation;
    public double duration;
    public boolean enableGks;
    public boolean enableInstrumentation;
    public int errorCode;
    public String errorMessage;
    public Integer espAdapterTimeoutMs;
    public List<String> espAdapters;
    public String eventId;
    public List<String> gksDaiNativeXhrApps;
    public List<String> gksFirstPartyAdServers;
    public int gksTimeoutMs;
    public List<zzbk> iconClickFallbackImages;
    public zzbm iconsView;
    public String innerError;
    public SortedSet<Float> internalCuePoints;
    public Set<String> jsConsentCheckRequiredParameters;

    /* renamed from: ln, reason: collision with root package name */
    public String f65241ln;
    public zzbt logData;

    /* renamed from: m, reason: collision with root package name */
    public String f65242m;
    public boolean monitorAppLifecycle;
    public Integer msParameterTimeoutMs;

    /* renamed from: n, reason: collision with root package name */
    public String f65243n;
    public zzby networkRequest;
    public Integer platformSignalCollectorTimeoutMs;
    public String queryId;
    public zzce resizeAndPositionVideo;
    public double seekTime;
    public zzci skipView;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public String vastEvent;
    public String videoUrl;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaho.zzf(this, obj, false, null, false, new String[0]);
    }

    public int hashCode() {
        return zzahr.zza(this, new String[0]);
    }

    public String toString() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JavaScriptMsgData[");
        for (Field field : zzbu.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb2.append(field.getName());
                sb2.append(":");
                sb2.append(obj);
                sb2.append(",");
            } catch (IllegalAccessException e10) {
                FS.log_e("IMASDK", "IllegalAccessException occurred", e10);
            } catch (IllegalArgumentException e11) {
                FS.log_e("IMASDK", "IllegalArgumentException occurred", e11);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
