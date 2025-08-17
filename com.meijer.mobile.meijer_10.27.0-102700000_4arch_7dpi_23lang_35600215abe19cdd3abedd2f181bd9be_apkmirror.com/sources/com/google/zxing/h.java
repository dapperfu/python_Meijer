package com.google.zxing;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f90825a;

    /* renamed from: b, reason: collision with root package name */
    private final int f90826b;

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public boolean f() {
        return false;
    }

    public final int a() {
        return this.f90826b;
    }

    public final int d() {
        return this.f90825a;
    }

    public h e() {
        return new g(this);
    }

    public h g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f90825a;
        byte[] bArrC = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f90826b * (i10 + 1));
        for (int i11 = 0; i11 < this.f90826b; i11++) {
            bArrC = c(i11, bArrC);
            for (int i12 = 0; i12 < this.f90825a; i12++) {
                int i13 = bArrC[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    protected h(int i10, int i11) {
        this.f90825a = i10;
        this.f90826b = i11;
    }
}
