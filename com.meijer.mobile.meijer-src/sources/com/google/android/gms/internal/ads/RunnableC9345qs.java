package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9345qs implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78693a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78694b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f78695c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f78696d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f78697e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f78698f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f78699g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f78700h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f78701i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ AbstractC9772us f78702j;

    RunnableC9345qs(AbstractC9772us abstractC9772us, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.f78693a = str;
        this.f78694b = str2;
        this.f78695c = i10;
        this.f78696d = i11;
        this.f78697e = j10;
        this.f78698f = j11;
        this.f78699g = z10;
        this.f78700h = i12;
        this.f78701i = i13;
        this.f78702j = abstractC9772us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f78693a);
        map.put("cachedSrc", this.f78694b);
        map.put("bytesLoaded", Integer.toString(this.f78695c));
        map.put("totalBytes", Integer.toString(this.f78696d));
        map.put("bufferedDuration", Long.toString(this.f78697e));
        map.put("totalDuration", Long.toString(this.f78698f));
        map.put("cacheReady", true != this.f78699g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f78700h));
        map.put("playerPreparedCount", Integer.toString(this.f78701i));
        AbstractC9772us.a(this.f78702j, "onPrecacheEvent", map);
    }
}
