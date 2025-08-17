package Gg;

import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
public class k extends com.google.zxing.b {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f11438d = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private byte[] f11439b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f11440c;

    private static int g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        if (i12 - i15 <= length / 16) {
            throw NotFoundException.a();
        }
        int i21 = i12 - 1;
        int i22 = -1;
        int i23 = i21;
        while (i21 > i15) {
            int i24 = i21 - i15;
            int i25 = i24 * i24 * (i12 - i21) * (i11 - iArr[i21]);
            if (i25 > i22) {
                i23 = i21;
                i22 = i25;
            }
            i21--;
        }
        return i23 << 3;
    }

    private void h(int i10) {
        if (this.f11439b.length < i10) {
            this.f11439b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f11440c[i11] = 0;
        }
    }

    public k(com.google.zxing.h hVar) {
        super(hVar);
        this.f11439b = f11438d;
        this.f11440c = new int[32];
    }

    @Override // com.google.zxing.b
    public b b() throws NotFoundException {
        com.google.zxing.h hVarE = e();
        int iD = hVarE.d();
        int iA = hVarE.a();
        b bVar = new b(iD, iA);
        h(iD);
        int[] iArr = this.f11440c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] bArrC = hVarE.c((iA * i10) / 5, this.f11439b);
            int i11 = (iD * 4) / 5;
            for (int i12 = iD / 5; i12 < i11; i12++) {
                int i13 = (bArrC[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int iG = g(iArr);
        byte[] bArrB = hVarE.b();
        for (int i14 = 0; i14 < iA; i14++) {
            int i15 = i14 * iD;
            for (int i16 = 0; i16 < iD; i16++) {
                if ((bArrB[i15 + i16] & 255) < iG) {
                    bVar.q(i16, i14);
                }
            }
        }
        return bVar;
    }

    @Override // com.google.zxing.b
    public a c(int i10, a aVar) throws NotFoundException {
        com.google.zxing.h hVarE = e();
        int iD = hVarE.d();
        if (aVar != null && aVar.l() >= iD) {
            aVar.d();
        } else {
            aVar = new a(iD);
        }
        h(iD);
        byte[] bArrC = hVarE.c(i10, this.f11439b);
        int[] iArr = this.f11440c;
        for (int i11 = 0; i11 < iD; i11++) {
            int i12 = (bArrC[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int iG = g(iArr);
        if (iD < 3) {
            for (int i13 = 0; i13 < iD; i13++) {
                if ((bArrC[i13] & 255) < iG) {
                    aVar.q(i13);
                }
            }
        } else {
            int i14 = bArrC[0] & 255;
            int i15 = bArrC[1] & 255;
            int i16 = 1;
            while (i16 < iD - 1) {
                int i17 = i16 + 1;
                int i18 = bArrC[i17] & 255;
                if ((((i15 * 4) - i14) - i18) / 2 < iG) {
                    aVar.q(i16);
                }
                i14 = i15;
                i16 = i17;
                i15 = i18;
            }
        }
        return aVar;
    }
}
