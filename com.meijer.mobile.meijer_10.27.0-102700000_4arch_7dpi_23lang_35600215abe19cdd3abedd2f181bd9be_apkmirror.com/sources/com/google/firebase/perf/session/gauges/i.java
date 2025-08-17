package com.google.firebase.perf.session.gauges;

import ag.o;
import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes7.dex */
class i {

    /* renamed from: e, reason: collision with root package name */
    private static final Uf.a f89126e = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Runtime f89127a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityManager f89128b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f89129c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f89130d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    i(Runtime runtime, Context context) {
        this.f89127a = runtime;
        this.f89130d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f89128b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f89129c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public int a() {
        return o.c(ag.k.f45461f.b(this.f89129c.totalMem));
    }

    public int b() {
        return o.c(ag.k.f45461f.b(this.f89127a.maxMemory()));
    }

    public int c() {
        return o.c(ag.k.f45459d.b(this.f89128b.getMemoryClass()));
    }
}
