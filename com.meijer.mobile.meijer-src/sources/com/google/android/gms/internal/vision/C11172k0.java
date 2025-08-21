package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11172k0 extends C11195s0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f85404f;

    /* renamed from: g, reason: collision with root package name */
    private final int f85405g;

    @Override // com.google.android.gms.internal.vision.C11195s0, com.google.android.gms.internal.vision.AbstractC11161h0
    public final int e() {
        return this.f85405g;
    }

    @Override // com.google.android.gms.internal.vision.C11195s0, com.google.android.gms.internal.vision.AbstractC11161h0
    final byte p(int i10) {
        return this.f85486e[this.f85404f + i10];
    }

    @Override // com.google.android.gms.internal.vision.C11195s0
    protected final int x() {
        return this.f85404f;
    }

    C11172k0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC11161h0.r(i10, i10 + i11, bArr.length);
        this.f85404f = i10;
        this.f85405g = i11;
    }

    @Override // com.google.android.gms.internal.vision.C11195s0, com.google.android.gms.internal.vision.AbstractC11161h0
    public final byte a(int i10) {
        int iE = e();
        if (((iE - (i10 + 1)) | i10) < 0) {
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
            sb3.append(iE);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return this.f85486e[this.f85404f + i10];
    }
}
