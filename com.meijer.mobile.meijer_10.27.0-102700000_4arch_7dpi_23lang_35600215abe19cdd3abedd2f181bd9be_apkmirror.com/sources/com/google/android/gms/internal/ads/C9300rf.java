package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9300rf {
    public static final void a(C9194qf c9194qf, C8980of c8980of) {
        if (c8980of.a() != null) {
            if (!TextUtils.isEmpty(c8980of.b())) {
                c9194qf.d(c8980of.a(), c8980of.b(), c8980of.c(), c8980of.d());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
