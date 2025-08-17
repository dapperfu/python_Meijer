package com.google.zxing;

/* loaded from: classes7.dex */
public final class g extends h {

    /* renamed from: c, reason: collision with root package name */
    private final h f90824c;

    @Override // com.google.zxing.h
    public byte[] b() {
        byte[] bArrB = this.f90824c.b();
        int iD = d() * a();
        byte[] bArr = new byte[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bArr[i10] = (byte) (255 - (bArrB[i10] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.h
    public byte[] c(int i10, byte[] bArr) {
        byte[] bArrC = this.f90824c.c(i10, bArr);
        int iD = d();
        for (int i11 = 0; i11 < iD; i11++) {
            bArrC[i11] = (byte) (255 - (bArrC[i11] & 255));
        }
        return bArrC;
    }

    @Override // com.google.zxing.h
    public h e() {
        return this.f90824c;
    }

    @Override // com.google.zxing.h
    public boolean f() {
        return this.f90824c.f();
    }

    @Override // com.google.zxing.h
    public h g() {
        return new g(this.f90824c.g());
    }

    public g(h hVar) {
        super(hVar.d(), hVar.a());
        this.f90824c = hVar;
    }
}
