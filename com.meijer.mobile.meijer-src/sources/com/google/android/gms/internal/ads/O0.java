package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public final R0 f69826a;

    /* renamed from: b, reason: collision with root package name */
    public final R0 f69827b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O0.class == obj.getClass()) {
            O0 o02 = (O0) obj;
            if (this.f69826a.equals(o02.f69826a) && this.f69827b.equals(o02.f69827b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69826a.hashCode() * 31) + this.f69827b.hashCode();
    }

    public final String toString() {
        R0 r02 = this.f69826a;
        R0 r03 = this.f69827b;
        return "[" + r02.toString() + (r02.equals(r03) ? "" : ", ".concat(this.f69827b.toString())) + "]";
    }

    public O0(R0 r02, R0 r03) {
        this.f69826a = r02;
        this.f69827b = r03;
    }
}
