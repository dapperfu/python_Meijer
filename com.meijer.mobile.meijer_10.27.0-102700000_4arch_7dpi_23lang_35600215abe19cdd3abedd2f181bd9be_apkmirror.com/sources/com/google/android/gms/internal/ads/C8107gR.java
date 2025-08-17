package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8107gR {

    /* renamed from: c, reason: collision with root package name */
    public static final C8107gR f74312c = new C8107gR(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f74313a;

    /* renamed from: b, reason: collision with root package name */
    private final int f74314b;

    public final int a() {
        return this.f74314b;
    }

    public final int b() {
        return this.f74313a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8107gR) {
            C8107gR c8107gR = (C8107gR) obj;
            if (this.f74313a == c8107gR.f74313a && this.f74314b == c8107gR.f74314b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f74313a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f74314b;
    }

    static {
        new C8107gR(0, 0);
    }

    public final String toString() {
        return this.f74313a + "x" + this.f74314b;
    }

    public C8107gR(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        C8086gC.d(z10);
        this.f74313a = i10;
        this.f74314b = i11;
    }
}
