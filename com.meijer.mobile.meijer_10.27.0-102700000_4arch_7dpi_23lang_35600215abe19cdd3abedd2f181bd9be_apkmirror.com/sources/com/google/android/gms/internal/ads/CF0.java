package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class CF0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65748a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65749b;

    public CF0(int i10, boolean z10) {
        this.f65748a = i10;
        this.f65749b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CF0.class == obj.getClass()) {
            CF0 cf0 = (CF0) obj;
            if (this.f65748a == cf0.f65748a && this.f65749b == cf0.f65749b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f65748a * 31) + (this.f65749b ? 1 : 0);
    }
}
