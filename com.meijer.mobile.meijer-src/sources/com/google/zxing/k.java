package com.google.zxing;

/* loaded from: classes8.dex */
public final class k extends h {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f91670c;

    /* renamed from: d, reason: collision with root package name */
    private final int f91671d;

    /* renamed from: e, reason: collision with root package name */
    private final int f91672e;

    /* renamed from: f, reason: collision with root package name */
    private final int f91673f;

    /* renamed from: g, reason: collision with root package name */
    private final int f91674g;

    private void h(int i10, int i11) {
        byte[] bArr = this.f91670c;
        int i12 = (this.f91674g * this.f91671d) + this.f91673f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f91671d;
        }
    }

    @Override // com.google.zxing.h
    public byte[] c(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i10);
        }
        int iD = d();
        if (bArr == null || bArr.length < iD) {
            bArr = new byte[iD];
        }
        System.arraycopy(this.f91670c, ((i10 + this.f91674g) * this.f91671d) + this.f91673f, bArr, 0, iD);
        return bArr;
    }

    public k(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 <= i10 && i13 + i15 <= i11) {
            this.f91670c = bArr;
            this.f91671d = i10;
            this.f91672e = i11;
            this.f91673f = i12;
            this.f91674g = i13;
            if (z10) {
                h(i14, i15);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override // com.google.zxing.h
    public byte[] b() {
        int iD = d();
        int iA = a();
        int i10 = this.f91671d;
        if (iD == i10 && iA == this.f91672e) {
            return this.f91670c;
        }
        int i11 = iD * iA;
        byte[] bArr = new byte[i11];
        int i12 = (this.f91674g * i10) + this.f91673f;
        if (iD == i10) {
            System.arraycopy(this.f91670c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < iA; i13++) {
            System.arraycopy(this.f91670c, i12, bArr, i13 * iD, iD);
            i12 += this.f91671d;
        }
        return bArr;
    }
}
