package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9326rs implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78075a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78076b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f78077c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9647us f78078d;

    RunnableC9326rs(AbstractC9647us abstractC9647us, String str, String str2, int i10) {
        this.f78075a = str;
        this.f78076b = str2;
        this.f78077c = i10;
        this.f78078d = abstractC9647us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f78075a);
        map.put("cachedSrc", this.f78076b);
        map.put("totalBytes", Integer.toString(this.f78077c));
        AbstractC9647us.a(this.f78078d, "onPrecacheEvent", map);
    }
}
