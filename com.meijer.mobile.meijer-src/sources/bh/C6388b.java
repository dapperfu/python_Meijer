package bh;

import bh.j;

/* renamed from: bh.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6388b {

    /* renamed from: a, reason: collision with root package name */
    private final int f60375a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f60376b;

    static C6388b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length != jVar.h()) {
            throw new IllegalArgumentException();
        }
        j.b bVarF = jVar.f(fVar);
        j.a[] aVarArrA = bVarF.a();
        int iA = 0;
        for (j.a aVar : aVarArrA) {
            iA += aVar.a();
        }
        C6388b[] c6388bArr = new C6388b[iA];
        int i10 = 0;
        for (j.a aVar2 : aVarArrA) {
            int i11 = 0;
            while (i11 < aVar2.a()) {
                int iB = aVar2.b();
                c6388bArr[i10] = new C6388b(iB, new byte[bVarF.b() + iB]);
                i11++;
                i10++;
            }
        }
        int length = c6388bArr[0].f60376b.length;
        int i12 = iA - 1;
        while (i12 >= 0 && c6388bArr[i12].f60376b.length != length) {
            i12--;
        }
        int i13 = i12 + 1;
        int iB2 = length - bVarF.b();
        int i14 = 0;
        for (int i15 = 0; i15 < iB2; i15++) {
            int i16 = 0;
            while (i16 < i10) {
                c6388bArr[i16].f60376b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        int i17 = i13;
        while (i17 < i10) {
            c6388bArr[i17].f60376b[iB2] = bArr[i14];
            i17++;
            i14++;
        }
        int length2 = c6388bArr[0].f60376b.length;
        while (iB2 < length2) {
            int i18 = 0;
            while (i18 < i10) {
                c6388bArr[i18].f60376b[i18 < i13 ? iB2 : iB2 + 1] = bArr[i14];
                i18++;
                i14++;
            }
            iB2++;
        }
        return c6388bArr;
    }

    byte[] a() {
        return this.f60376b;
    }

    int c() {
        return this.f60375a;
    }

    private C6388b(int i10, byte[] bArr) {
        this.f60375a = i10;
        this.f60376b = bArr;
    }
}
