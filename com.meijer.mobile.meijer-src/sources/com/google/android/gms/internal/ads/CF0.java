package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class CF0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f66588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66589b;

    public CF0(int i10, boolean z10) {
        this.f66588a = i10;
        this.f66589b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CF0.class == obj.getClass()) {
            CF0 cf0 = (CF0) obj;
            if (this.f66588a == cf0.f66588a && this.f66589b == cf0.f66589b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f66588a * 31) + (this.f66589b ? 1 : 0);
    }
}
