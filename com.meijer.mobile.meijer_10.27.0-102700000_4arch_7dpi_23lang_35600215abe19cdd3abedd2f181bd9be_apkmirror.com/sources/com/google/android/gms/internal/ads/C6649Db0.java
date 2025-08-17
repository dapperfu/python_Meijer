package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Db0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6649Db0 {
    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a() {
        if (C6681Ea0.b()) {
        } else {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(String str, int i10, String str2) {
        if (str.length() <= 256) {
        } else {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
    }
}
