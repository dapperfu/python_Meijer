package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8899ns implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77150a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f77151b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f77152c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f77153d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC9647us f77154e;

    RunnableC8899ns(AbstractC9647us abstractC9647us, String str, String str2, int i10, int i11, boolean z10) {
        this.f77150a = str;
        this.f77151b = str2;
        this.f77152c = i10;
        this.f77153d = i11;
        this.f77154e = abstractC9647us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f77150a);
        map.put("cachedSrc", this.f77151b);
        map.put("bytesLoaded", Integer.toString(this.f77152c));
        map.put("totalBytes", Integer.toString(this.f77153d));
        map.put("cacheReady", "0");
        AbstractC9647us.a(this.f77154e, "onPrecacheEvent", map);
    }
}
