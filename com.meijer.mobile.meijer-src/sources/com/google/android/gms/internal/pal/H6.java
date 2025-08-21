package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class H6 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f83481a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f83482b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f83483c;

    H6(Object obj, Object obj2, Object obj3) {
        this.f83481a = obj;
        this.f83482b = obj2;
        this.f83483c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f83481a + "=" + this.f83482b + " and " + this.f83481a + "=" + this.f83483c);
    }
}
