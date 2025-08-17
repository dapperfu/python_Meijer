package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private final Object f80760a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f80761b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f80762c;

    G(Object obj, Object obj2, Object obj3) {
        this.f80760a = obj;
        this.f80761b = obj2;
        this.f80762c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f80760a) + "=" + String.valueOf(this.f80761b) + " and " + String.valueOf(this.f80760a) + "=" + String.valueOf(this.f80762c));
    }
}
