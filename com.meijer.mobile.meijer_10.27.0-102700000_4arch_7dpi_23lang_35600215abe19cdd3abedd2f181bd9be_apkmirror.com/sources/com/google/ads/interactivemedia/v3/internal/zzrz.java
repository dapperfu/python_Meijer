package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzrz {
    static Object zza(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static HashMap zzb(int i10) {
        int iCeil;
        if (i10 < 3) {
            zzqt.zza(i10, "expectedSize");
            iCeil = i10 + 1;
        } else {
            iCeil = i10 < 1073741824 ? (int) Math.ceil(i10 / 0.75d) : a.e.API_PRIORITY_OTHER;
        }
        return new HashMap(iCeil);
    }
}
