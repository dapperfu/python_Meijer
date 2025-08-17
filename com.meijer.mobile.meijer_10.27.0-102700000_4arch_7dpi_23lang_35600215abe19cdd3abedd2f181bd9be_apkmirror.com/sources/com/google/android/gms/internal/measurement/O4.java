package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class O4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f81947a;

    /* renamed from: b, reason: collision with root package name */
    private final int f81948b;

    O4(Object obj, int i10) {
        this.f81947a = obj;
        this.f81948b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O4)) {
            return false;
        }
        O4 o42 = (O4) obj;
        return this.f81947a == o42.f81947a && this.f81948b == o42.f81948b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f81947a) * 65535) + this.f81948b;
    }
}
