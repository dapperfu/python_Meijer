package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9425rf {
    public static final void a(C9319qf c9319qf, C9105of c9105of) {
        if (c9105of.a() != null) {
            if (!TextUtils.isEmpty(c9105of.b())) {
                c9319qf.d(c9105of.a(), c9105of.b(), c9105of.c(), c9105of.d());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
