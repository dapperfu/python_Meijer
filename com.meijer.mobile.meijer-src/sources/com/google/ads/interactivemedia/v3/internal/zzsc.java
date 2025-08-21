package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzsc {
    static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }

    static Object zza(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }
}
