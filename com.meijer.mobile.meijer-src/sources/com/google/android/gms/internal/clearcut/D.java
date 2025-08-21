package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class D extends H {

    /* renamed from: e, reason: collision with root package name */
    private final int f81945e;

    /* renamed from: f, reason: collision with root package name */
    private final int f81946f;

    D(byte[] bArr, int i10, int i11) {
        super(bArr);
        A.m(i10, i10 + i11, bArr.length);
        this.f81945e = i10;
        this.f81946f = i11;
    }

    @Override // com.google.android.gms.internal.clearcut.H, com.google.android.gms.internal.clearcut.A
    public final byte p(int i10) {
        int size = size();
        if (((size - (i10 + 1)) | i10) >= 0) {
            return this.f81974d[this.f81945e + i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.clearcut.H, com.google.android.gms.internal.clearcut.A
    public final int size() {
        return this.f81946f;
    }

    @Override // com.google.android.gms.internal.clearcut.H
    protected final int t() {
        return this.f81945e;
    }
}
