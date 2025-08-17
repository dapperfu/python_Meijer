package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8024fh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f74139a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f74140b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f74141c;

    C8024fh0(Object obj, Object obj2, Object obj3) {
        this.f74139a = obj;
        this.f74140b = obj2;
        this.f74141c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f74141c;
        Object obj2 = this.f74140b;
        Object obj3 = this.f74139a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
