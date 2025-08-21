package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzaho;
import com.google.ads.interactivemedia.v3.internal.zzahr;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbt {
    public int errorCode;
    public String errorMessage;
    public String innerError;
    public String type;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaho.zzf(this, obj, false, null, false, new String[0]);
    }

    public int hashCode() {
        return zzahr.zza(this, new String[0]);
    }

    public Map<String, String> constructMap() {
        HashMap map = new HashMap();
        map.put("type", this.type);
        map.put("errorCode", String.valueOf(this.errorCode));
        map.put("errorMessage", this.errorMessage);
        String str = this.innerError;
        if (str != null) {
            map.put("innerError", str);
        }
        return map;
    }

    public String toString() {
        return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", this.type, Integer.valueOf(this.errorCode), this.errorMessage, this.innerError);
    }
}
