package Kg;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f16632a;

    private int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int iH = this.f16632a.h(iArr[i10]);
            int iJ = 1;
            for (int i11 = 0; i11 < length; i11++) {
                if (i10 != i11) {
                    int iJ2 = this.f16632a.j(iArr[i11], iH);
                    iJ = this.f16632a.j(iJ, (iJ2 & 1) == 0 ? iJ2 | 1 : iJ2 & (-2));
                }
            }
            iArr2[i10] = this.f16632a.j(bVar.c(iH), this.f16632a.h(iJ));
            if (this.f16632a.d() != 0) {
                iArr2[i10] = this.f16632a.j(iArr2[i10], iH);
            }
        }
        return iArr2;
    }

    public int a(int[] iArr, int i10) throws ReedSolomonException {
        b bVar = new b(this.f16632a, iArr);
        int[] iArr2 = new int[i10];
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = this.f16632a;
            int iC = bVar.c(aVar.c(aVar.d() + i11));
            iArr2[(i10 - 1) - i11] = iC;
            if (iC != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        b[] bVarArrD = d(this.f16632a.b(i10, 1), new b(this.f16632a, iArr2), i10);
        b bVar2 = bVarArrD[0];
        b bVar3 = bVarArrD[1];
        int[] iArrB = b(bVar2);
        int[] iArrC = c(bVar3, iArrB);
        for (int i12 = 0; i12 < iArrB.length; i12++) {
            int length = (iArr.length - 1) - this.f16632a.i(iArrB[i12]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = a.a(iArr[length], iArrC[i12]);
        }
        return iArrB.length;
    }

    public c(a aVar) {
        this.f16632a = aVar;
    }

    private int[] b(b bVar) throws ReedSolomonException {
        int iF = bVar.f();
        if (iF == 1) {
            return new int[]{bVar.d(1)};
        }
        int[] iArr = new int[iF];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f16632a.f() && i10 < iF; i11++) {
            if (bVar.c(i11) == 0) {
                iArr[i10] = this.f16632a.h(i11);
                i10++;
            }
        }
        if (i10 == iF) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private b[] d(b bVar, b bVar2, int i10) throws ReedSolomonException {
        if (bVar.f() < bVar2.f()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        b bVarG = this.f16632a.g();
        b bVarE = this.f16632a.e();
        do {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
            b bVar4 = bVarE;
            b bVar5 = bVarG;
            bVarG = bVar4;
            if (bVar.f() * 2 >= i10) {
                if (!bVar.g()) {
                    b bVarG2 = this.f16632a.g();
                    int iH = this.f16632a.h(bVar.d(bVar.f()));
                    while (bVar2.f() >= bVar.f() && !bVar2.g()) {
                        int iF = bVar2.f() - bVar.f();
                        int iJ = this.f16632a.j(bVar2.d(bVar2.f()), iH);
                        bVarG2 = bVarG2.a(this.f16632a.b(iF, iJ));
                        bVar2 = bVar2.a(bVar.j(iF, iJ));
                    }
                    bVarE = bVarG2.i(bVarG).a(bVar5);
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            } else {
                int iD = bVarG.d(0);
                if (iD != 0) {
                    int iH2 = this.f16632a.h(iD);
                    return new b[]{bVarG.h(iH2), bVar.h(iH2)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
        } while (bVar2.f() < bVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar2 + ", rLast: " + bVar);
    }
}
