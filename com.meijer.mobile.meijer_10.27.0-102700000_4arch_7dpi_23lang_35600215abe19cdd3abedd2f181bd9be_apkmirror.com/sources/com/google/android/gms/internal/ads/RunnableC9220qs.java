package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9220qs implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77853a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f77854b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f77855c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f77856d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f77857e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f77858f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f77859g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f77860h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f77861i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ AbstractC9647us f77862j;

    RunnableC9220qs(AbstractC9647us abstractC9647us, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.f77853a = str;
        this.f77854b = str2;
        this.f77855c = i10;
        this.f77856d = i11;
        this.f77857e = j10;
        this.f77858f = j11;
        this.f77859g = z10;
        this.f77860h = i12;
        this.f77861i = i13;
        this.f77862j = abstractC9647us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f77853a);
        map.put("cachedSrc", this.f77854b);
        map.put("bytesLoaded", Integer.toString(this.f77855c));
        map.put("totalBytes", Integer.toString(this.f77856d));
        map.put("bufferedDuration", Long.toString(this.f77857e));
        map.put("totalDuration", Long.toString(this.f77858f));
        map.put("cacheReady", true != this.f77859g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f77860h));
        map.put("playerPreparedCount", Integer.toString(this.f77861i));
        AbstractC9647us.a(this.f77862j, "onPrecacheEvent", map);
    }
}
