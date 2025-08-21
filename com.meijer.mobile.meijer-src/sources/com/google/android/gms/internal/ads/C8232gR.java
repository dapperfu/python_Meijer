package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8232gR {

    /* renamed from: c, reason: collision with root package name */
    public static final C8232gR f75152c = new C8232gR(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f75153a;

    /* renamed from: b, reason: collision with root package name */
    private final int f75154b;

    public final int a() {
        return this.f75154b;
    }

    public final int b() {
        return this.f75153a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8232gR) {
            C8232gR c8232gR = (C8232gR) obj;
            if (this.f75153a == c8232gR.f75153a && this.f75154b == c8232gR.f75154b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f75153a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f75154b;
    }

    static {
        new C8232gR(0, 0);
    }

    public final String toString() {
        return this.f75153a + "x" + this.f75154b;
    }

    public C8232gR(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        C8211gC.d(z10);
        this.f75153a = i10;
        this.f75154b = i11;
    }
}
