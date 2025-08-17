package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzahl {
    public static boolean zza(Object[] objArr, Object obj) {
        if (objArr != null) {
            if (obj == null) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        return true;
                    }
                }
            } else {
                for (Object obj3 : objArr) {
                    if (obj.equals(obj3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
