package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private final Object f81600a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f81601b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f81602c;

    G(Object obj, Object obj2, Object obj3) {
        this.f81600a = obj;
        this.f81601b = obj2;
        this.f81602c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f81600a) + "=" + String.valueOf(this.f81601b) + " and " + String.valueOf(this.f81600a) + "=" + String.valueOf(this.f81602c));
    }
}
