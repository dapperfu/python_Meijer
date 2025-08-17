package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7806df {
    public static final SharedPreferences a(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e10) {
            Qc.p.h("", e10);
            return null;
        }
    }
}
