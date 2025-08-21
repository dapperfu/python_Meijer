package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9558ss implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f79148a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f79149b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f79150c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9772us f79151d;

    RunnableC9558ss(AbstractC9772us abstractC9772us, String str, String str2, long j10) {
        this.f79148a = str;
        this.f79149b = str2;
        this.f79150c = j10;
        this.f79151d = abstractC9772us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f79148a);
        map.put("cachedSrc", this.f79149b);
        map.put("totalDuration", Long.toString(this.f79150c));
        AbstractC9772us.a(this.f79151d, "onPrecacheEvent", map);
    }
}
