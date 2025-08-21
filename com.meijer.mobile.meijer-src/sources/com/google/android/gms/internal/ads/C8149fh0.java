package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8149fh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f74979a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f74980b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f74981c;

    C8149fh0(Object obj, Object obj2, Object obj3) {
        this.f74979a = obj;
        this.f74980b = obj2;
        this.f74981c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f74981c;
        Object obj2 = this.f74980b;
        Object obj3 = this.f74979a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
