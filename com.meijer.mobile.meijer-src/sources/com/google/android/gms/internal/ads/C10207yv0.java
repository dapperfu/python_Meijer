package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.yv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10207yv0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10207yv0 f81148c = new C10207yv0();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f81149d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f81151b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Iv0 f81150a = new C8391hv0();

    public static C10207yv0 a() {
        return f81148c;
    }

    public final Hv0 b(Class cls) {
        Tu0.c(cls, "messageType");
        Hv0 hv0 = (Hv0) this.f81151b.get(cls);
        if (hv0 != null) {
            return hv0;
        }
        Hv0 hv0Zza = this.f81150a.zza(cls);
        Tu0.c(cls, "messageType");
        Hv0 hv02 = (Hv0) this.f81151b.putIfAbsent(cls, hv0Zza);
        return hv02 == null ? hv0Zza : hv02;
    }

    private C10207yv0() {
    }
}
