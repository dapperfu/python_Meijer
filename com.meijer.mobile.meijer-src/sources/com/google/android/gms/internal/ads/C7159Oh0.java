package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7159Oh0 {
    static Object[] b(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }
}
