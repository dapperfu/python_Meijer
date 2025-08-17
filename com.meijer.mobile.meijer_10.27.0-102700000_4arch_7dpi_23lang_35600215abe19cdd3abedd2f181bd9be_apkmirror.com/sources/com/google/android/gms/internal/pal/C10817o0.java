package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.o0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10817o0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f83251a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83252b;

    C10817o0(Object obj, int i10) {
        this.f83251a = obj;
        this.f83252b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10817o0)) {
            return false;
        }
        C10817o0 c10817o0 = (C10817o0) obj;
        return this.f83251a == c10817o0.f83251a && this.f83252b == c10817o0.f83252b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f83251a) * 65535) + this.f83252b;
    }
}
