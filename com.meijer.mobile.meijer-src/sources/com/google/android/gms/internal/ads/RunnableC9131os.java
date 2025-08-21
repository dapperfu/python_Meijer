package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9131os implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78269a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78270b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f78271c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f78272d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f78273e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f78274f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f78275g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f78276h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f78277i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f78278j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ AbstractC9772us f78279k;

    RunnableC9131os(AbstractC9772us abstractC9772us, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.f78269a = str;
        this.f78270b = str2;
        this.f78271c = j10;
        this.f78272d = j11;
        this.f78273e = j12;
        this.f78274f = j13;
        this.f78275g = j14;
        this.f78276h = z10;
        this.f78277i = i10;
        this.f78278j = i11;
        this.f78279k = abstractC9772us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f78269a);
        map.put("cachedSrc", this.f78270b);
        map.put("bufferedDuration", Long.toString(this.f78271c));
        map.put("totalDuration", Long.toString(this.f78272d));
        if (((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f78273e));
            map.put("qoeCachedBytes", Long.toString(this.f78274f));
            map.put("totalBytes", Long.toString(this.f78275g));
            map.put("reportTime", Long.toString(Nc.v.c().a()));
        }
        map.put("cacheReady", true != this.f78276h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f78277i));
        map.put("playerPreparedCount", Integer.toString(this.f78278j));
        AbstractC9772us.a(this.f78279k, "onPrecacheEvent", map);
    }
}
