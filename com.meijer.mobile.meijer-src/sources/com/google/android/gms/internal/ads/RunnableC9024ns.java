package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9024ns implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77990a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f77991b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f77992c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f77993d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC9772us f77994e;

    RunnableC9024ns(AbstractC9772us abstractC9772us, String str, String str2, int i10, int i11, boolean z10) {
        this.f77990a = str;
        this.f77991b = str2;
        this.f77992c = i10;
        this.f77993d = i11;
        this.f77994e = abstractC9772us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f77990a);
        map.put("cachedSrc", this.f77991b);
        map.put("bytesLoaded", Integer.toString(this.f77992c));
        map.put("totalBytes", Integer.toString(this.f77993d));
        map.put("cacheReady", "0");
        AbstractC9772us.a(this.f77994e, "onPrecacheEvent", map);
    }
}
