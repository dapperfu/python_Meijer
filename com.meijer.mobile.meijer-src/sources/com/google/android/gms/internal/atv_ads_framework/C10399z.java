package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10399z {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
