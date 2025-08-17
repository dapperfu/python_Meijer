package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ag0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6557Ag0 {
    static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static void b(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
