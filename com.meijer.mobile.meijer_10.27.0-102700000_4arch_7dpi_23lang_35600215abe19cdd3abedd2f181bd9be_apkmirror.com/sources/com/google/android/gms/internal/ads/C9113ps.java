package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9113ps {

    /* renamed from: d, reason: collision with root package name */
    public static final C9113ps f77644d = new C9113ps(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f77645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77646b;

    /* renamed from: c, reason: collision with root package name */
    public final float f77647c;

    public C9113ps(int i10, int i11, float f10) {
        this.f77645a = i10;
        this.f77646b = i11;
        this.f77647c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9113ps) {
            C9113ps c9113ps = (C9113ps) obj;
            if (this.f77645a == c9113ps.f77645a && this.f77646b == c9113ps.f77646b && this.f77647c == c9113ps.f77647c) {
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
        return ((((this.f77645a + 217) * 31) + this.f77646b) * 31) + Float.floatToRawIntBits(this.f77647c);
    }
}
