package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9238ps {

    /* renamed from: d, reason: collision with root package name */
    public static final C9238ps f78484d = new C9238ps(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f78485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78486b;

    /* renamed from: c, reason: collision with root package name */
    public final float f78487c;

    public C9238ps(int i10, int i11, float f10) {
        this.f78485a = i10;
        this.f78486b = i11;
        this.f78487c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9238ps) {
            C9238ps c9238ps = (C9238ps) obj;
            if (this.f78485a == c9238ps.f78485a && this.f78486b == c9238ps.f78486b && this.f78487c == c9238ps.f78487c) {
                return true;
            }
        }
        return false;
    }

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public final int hashCode() {
        return ((((this.f78485a + 217) * 31) + this.f78486b) * 31) + Float.floatToRawIntBits(this.f78487c);
    }
}
