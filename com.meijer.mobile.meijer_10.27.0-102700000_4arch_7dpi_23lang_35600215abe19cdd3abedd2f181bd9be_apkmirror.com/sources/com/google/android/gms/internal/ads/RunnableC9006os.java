package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9006os implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77429a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f77430b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f77431c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f77432d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f77433e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f77434f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f77435g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f77436h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f77437i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f77438j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ AbstractC9647us f77439k;

    RunnableC9006os(AbstractC9647us abstractC9647us, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.f77429a = str;
        this.f77430b = str2;
        this.f77431c = j10;
        this.f77432d = j11;
        this.f77433e = j12;
        this.f77434f = j13;
        this.f77435g = j14;
        this.f77436h = z10;
        this.f77437i = i10;
        this.f77438j = i11;
        this.f77439k = abstractC9647us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f77429a);
        map.put("cachedSrc", this.f77430b);
        map.put("bufferedDuration", Long.toString(this.f77431c));
        map.put("totalDuration", Long.toString(this.f77432d));
        if (((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f77433e));
            map.put("qoeCachedBytes", Long.toString(this.f77434f));
            map.put("totalBytes", Long.toString(this.f77435g));
            map.put("reportTime", Long.toString(Lc.v.c().a()));
        }
        map.put("cacheReady", true != this.f77436h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f77437i));
        map.put("playerPreparedCount", Integer.toString(this.f77438j));
        AbstractC9647us.a(this.f77439k, "onPrecacheEvent", map);
    }
}
