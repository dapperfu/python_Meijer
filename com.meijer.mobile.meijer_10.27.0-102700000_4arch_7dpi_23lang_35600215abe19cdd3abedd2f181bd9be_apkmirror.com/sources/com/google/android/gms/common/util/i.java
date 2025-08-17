package com.google.android.gms.common.util;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public class i implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final i f64952a = new i();

    private i() {
    }

    public static f d() {
        return f64952a;
    }

    @Override // com.google.android.gms.common.util.f
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.f
    public final long b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.f
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
