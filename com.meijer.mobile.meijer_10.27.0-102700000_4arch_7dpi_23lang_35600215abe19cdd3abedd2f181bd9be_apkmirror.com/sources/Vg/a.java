package Vg;

import com.google.zxing.ChecksumException;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f37555a = b.f37556f;

    public int a(int[] iArr, int i10, int[] iArr2) throws ChecksumException {
        c cVar = new c(this.f37555a, iArr);
        int[] iArr3 = new int[i10];
        boolean z10 = false;
        for (int i11 = i10; i11 > 0; i11--) {
            int iB = cVar.b(this.f37555a.c(i11));
            iArr3[i10 - i11] = iB;
            if (iB != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        c cVarD = this.f37555a.d();
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                int iC = this.f37555a.c((iArr.length - 1) - i12);
                b bVar = this.f37555a;
                cVarD = cVarD.g(new c(bVar, new int[]{bVar.j(0, iC), 1}));
            }
        }
        c[] cVarArrD = d(this.f37555a.b(i10, 1), new c(this.f37555a, iArr3), i10);
        c cVar2 = cVarArrD[0];
        c cVar3 = cVarArrD[1];
        int[] iArrB = b(cVar2);
        int[] iArrC = c(cVar3, cVar2, iArrB);
        for (int i13 = 0; i13 < iArrB.length; i13++) {
            int length = (iArr.length - 1) - this.f37555a.h(iArrB[i13]);
            if (length < 0) {
                throw ChecksumException.a();
            }
            iArr[length] = this.f37555a.j(iArr[length], iArrC[i13]);
        }
        return iArrB.length;
    }

    private int[] b(c cVar) throws ChecksumException {
        int iD = cVar.d();
        int[] iArr = new int[iD];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f37555a.e() && i10 < iD; i11++) {
            if (cVar.b(i11) == 0) {
                iArr[i10] = this.f37555a.g(i11);
                i10++;
            }
        }
        if (i10 == iD) {
            return iArr;
        }
        throw ChecksumException.a();
    }

    private int[] c(c cVar, c cVar2, int[] iArr) {
        int iD = cVar2.d();
        if (iD < 1) {
            return new int[0];
        }
        int[] iArr2 = new int[iD];
        for (int i10 = 1; i10 <= iD; i10++) {
            iArr2[iD - i10] = this.f37555a.i(i10, cVar2.c(i10));
        }
        c cVar3 = new c(this.f37555a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int iG = this.f37555a.g(iArr[i11]);
            iArr3[i11] = this.f37555a.i(this.f37555a.j(0, cVar.b(iG)), this.f37555a.g(cVar3.b(iG)));
        }
        return iArr3;
    }

    private c[] d(c cVar, c cVar2, int i10) throws ChecksumException {
        if (cVar.d() < cVar2.d()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        c cVarF = this.f37555a.f();
        c cVarD = this.f37555a.d();
        while (true) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
            c cVar4 = cVarD;
            c cVar5 = cVarF;
            cVarF = cVar4;
            if (cVar.d() >= i10 / 2) {
                if (!cVar.e()) {
                    c cVarF2 = this.f37555a.f();
                    int iG = this.f37555a.g(cVar.c(cVar.d()));
                    while (cVar2.d() >= cVar.d() && !cVar2.e()) {
                        int iD = cVar2.d() - cVar.d();
                        int i11 = this.f37555a.i(cVar2.c(cVar2.d()), iG);
                        cVarF2 = cVarF2.a(this.f37555a.b(iD, i11));
                        cVar2 = cVar2.j(cVar.h(iD, i11));
                    }
                    cVarD = cVarF2.g(cVarF).j(cVar5).i();
                } else {
                    throw ChecksumException.a();
                }
            } else {
                int iC = cVarF.c(0);
                if (iC != 0) {
                    int iG2 = this.f37555a.g(iC);
                    return new c[]{cVarF.f(iG2), cVar.f(iG2)};
                }
                throw ChecksumException.a();
            }
        }
    }
}
