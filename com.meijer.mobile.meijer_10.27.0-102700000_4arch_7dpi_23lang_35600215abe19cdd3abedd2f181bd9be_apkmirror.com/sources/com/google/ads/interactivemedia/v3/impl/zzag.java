package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.internal.zzaho;
import com.google.ads.interactivemedia.v3.internal.zzahr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzag {
    public final AdEvent.AdEventType zza;
    public final com.google.ads.interactivemedia.v3.impl.data.zzc zzb;
    public Map zzc;
    public List zzd = new ArrayList();
    AdProgressInfo zze;
    public List zzf;
    public double zzg;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaho.zzf(this, obj, false, null, false, new String[0]);
    }

    public final int hashCode() {
        return zzahr.zza(this, new String[0]);
    }

    public zzag(AdEvent.AdEventType adEventType, com.google.ads.interactivemedia.v3.impl.data.zzc zzcVar) {
        this.zza = adEventType;
        this.zzb = zzcVar;
    }
}
