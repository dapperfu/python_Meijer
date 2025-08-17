package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9433ss implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78308a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78309b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f78310c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9647us f78311d;

    RunnableC9433ss(AbstractC9647us abstractC9647us, String str, String str2, long j10) {
        this.f78308a = str;
        this.f78309b = str2;
        this.f78310c = j10;
        this.f78311d = abstractC9647us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f78308a);
        map.put("cachedSrc", this.f78309b);
        map.put("totalDuration", Long.toString(this.f78310c));
        AbstractC9647us.a(this.f78311d, "onPrecacheEvent", map);
    }
}
