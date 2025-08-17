package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class H6 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f82641a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f82642b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f82643c;

    H6(Object obj, Object obj2, Object obj3) {
        this.f82641a = obj;
        this.f82642b = obj2;
        this.f82643c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f82641a + "=" + this.f82642b + " and " + this.f82641a + "=" + this.f82643c);
    }
}
