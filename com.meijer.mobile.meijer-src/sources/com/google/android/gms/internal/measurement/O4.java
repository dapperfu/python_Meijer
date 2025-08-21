package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class O4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f82787a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82788b;

    O4(Object obj, int i10) {
        this.f82787a = obj;
        this.f82788b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O4)) {
            return false;
        }
        O4 o42 = (O4) obj;
        return this.f82787a == o42.f82787a && this.f82788b == o42.f82788b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f82787a) * 65535) + this.f82788b;
    }
}
