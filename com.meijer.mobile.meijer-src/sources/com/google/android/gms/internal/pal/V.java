package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class V extends Y {

    /* renamed from: f, reason: collision with root package name */
    private final int f83759f;

    @Override // com.google.android.gms.internal.pal.Y
    protected final int B() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.Y, com.google.android.gms.internal.pal.AbstractC10730b0
    public final int f() {
        return this.f83759f;
    }

    @Override // com.google.android.gms.internal.pal.Y, com.google.android.gms.internal.pal.AbstractC10730b0
    public final byte a(int i10) {
        int i11 = this.f83759f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f83807e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.pal.Y, com.google.android.gms.internal.pal.AbstractC10730b0
    final byte e(int i10) {
        return this.f83807e[i10];
    }

    @Override // com.google.android.gms.internal.pal.Y, com.google.android.gms.internal.pal.AbstractC10730b0
    protected final void h(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f83807e, 0, bArr, 0, i12);
    }

    V(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC10730b0.q(0, i11, bArr.length);
        this.f83759f = i11;
    }
}
