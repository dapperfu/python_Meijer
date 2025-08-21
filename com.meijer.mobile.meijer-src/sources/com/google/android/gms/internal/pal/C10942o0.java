package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.o0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10942o0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f84091a;

    /* renamed from: b, reason: collision with root package name */
    private final int f84092b;

    C10942o0(Object obj, int i10) {
        this.f84091a = obj;
        this.f84092b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10942o0)) {
            return false;
        }
        C10942o0 c10942o0 = (C10942o0) obj;
        return this.f84091a == c10942o0.f84091a && this.f84092b == c10942o0.f84092b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f84091a) * 65535) + this.f84092b;
    }
}
