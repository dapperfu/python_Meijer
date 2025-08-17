package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzaho;
import com.google.ads.interactivemedia.v3.internal.zzahr;
import com.google.ads.interactivemedia.v3.internal.zzqc;
import com.google.ads.interactivemedia.v3.internal.zzqd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbs {
    public final Map<String, String> consentKeyTypes;

    public zzbs(Map<String, String> map) {
        this.consentKeyTypes = map;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaho.zzf(this, obj, false, null, false, new String[0]);
    }

    public int hashCode() {
        return zzahr.zza(this, new String[0]);
    }

    public Map<String, Object> constructMap() {
        HashMap map = new HashMap();
        map.put("consentKeyTypes", this.consentKeyTypes);
        return map;
    }

    public String toString() {
        zzqc zzqcVarZza = zzqd.zza(this);
        zzqcVarZza.zza("consentKeyTypes", this.consentKeyTypes);
        return zzqcVarZza.toString();
    }
}
