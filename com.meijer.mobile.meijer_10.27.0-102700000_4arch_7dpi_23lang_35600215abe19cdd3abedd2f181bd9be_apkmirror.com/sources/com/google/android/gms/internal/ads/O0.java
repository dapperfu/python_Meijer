package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public final R0 f68986a;

    /* renamed from: b, reason: collision with root package name */
    public final R0 f68987b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O0.class == obj.getClass()) {
            O0 o02 = (O0) obj;
            if (this.f68986a.equals(o02.f68986a) && this.f68987b.equals(o02.f68987b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f68986a.hashCode() * 31) + this.f68987b.hashCode();
    }

    public final String toString() {
        R0 r02 = this.f68986a;
        R0 r03 = this.f68987b;
        return "[" + r02.toString() + (r02.equals(r03) ? "" : ", ".concat(this.f68987b.toString())) + "]";
    }

    public O0(R0 r02, R0 r03) {
        this.f68986a = r02;
        this.f68987b = r03;
    }
}
