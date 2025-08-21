package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9451rs implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78915a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78916b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f78917c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9772us f78918d;

    RunnableC9451rs(AbstractC9772us abstractC9772us, String str, String str2, int i10) {
        this.f78915a = str;
        this.f78916b = str2;
        this.f78917c = i10;
        this.f78918d = abstractC9772us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f78915a);
        map.put("cachedSrc", this.f78916b);
        map.put("totalBytes", Integer.toString(this.f78917c));
        AbstractC9772us.a(this.f78918d, "onPrecacheEvent", map);
    }
}
