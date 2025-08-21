package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import cg.o;

/* loaded from: classes8.dex */
class i {

    /* renamed from: e, reason: collision with root package name */
    private static final Wf.a f89968e = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Runtime f89969a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityManager f89970b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f89971c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f89972d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    i(Runtime runtime, Context context) {
        this.f89969a = runtime;
        this.f89972d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f89970b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f89971c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public int a() {
        return o.c(cg.k.f62476f.b(this.f89971c.totalMem));
    }

    public int b() {
        return o.c(cg.k.f62476f.b(this.f89969a.maxMemory()));
    }

    public int c() {
        return o.c(cg.k.f62474d.b(this.f89970b.getMemoryClass()));
    }
}
