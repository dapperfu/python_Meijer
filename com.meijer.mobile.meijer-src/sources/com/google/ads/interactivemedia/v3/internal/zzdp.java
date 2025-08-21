package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class zzdp {
    public static void zzb(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void zza(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }
}
