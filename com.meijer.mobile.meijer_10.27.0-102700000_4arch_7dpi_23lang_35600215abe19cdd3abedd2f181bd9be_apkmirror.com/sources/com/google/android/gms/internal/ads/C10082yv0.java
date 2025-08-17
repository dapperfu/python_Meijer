package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.yv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10082yv0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10082yv0 f80308c = new C10082yv0();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f80309d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f80311b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Iv0 f80310a = new C8266hv0();

    public static C10082yv0 a() {
        return f80308c;
    }

    public final Hv0 b(Class cls) {
        Tu0.c(cls, "messageType");
        Hv0 hv0 = (Hv0) this.f80311b.get(cls);
        if (hv0 != null) {
            return hv0;
        }
        Hv0 hv0Zza = this.f80310a.zza(cls);
        Tu0.c(cls, "messageType");
        Hv0 hv02 = (Hv0) this.f80311b.putIfAbsent(cls, hv0Zza);
        return hv02 == null ? hv0Zza : hv02;
    }

    private C10082yv0() {
    }
}
