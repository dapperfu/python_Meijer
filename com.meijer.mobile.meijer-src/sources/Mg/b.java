package Mg;

import Mg.e;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f19881a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f19882b;

    byte[] a() {
        return this.f19882b;
    }

    int c() {
        return this.f19881a;
    }

    private b(int i10, byte[] bArr) {
        this.f19881a = i10;
        this.f19882b = bArr;
    }

    static b[] b(byte[] bArr, e eVar) {
        boolean z10;
        int i10;
        int i11;
        e.c cVarD = eVar.d();
        e.b[] bVarArrA = cVarD.a();
        int iA = 0;
        for (e.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        b[] bVarArr = new b[iA];
        int i12 = 0;
        for (e.b bVar2 : bVarArrA) {
            int i13 = 0;
            while (i13 < bVar2.a()) {
                int iB = bVar2.b();
                bVarArr[i12] = new b(iB, new byte[cVarD.b() + iB]);
                i13++;
                i12++;
            }
        }
        int length = bVarArr[0].f19882b.length - cVarD.b();
        int i14 = length - 1;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = 0;
            while (i17 < i12) {
                bVarArr[i17].f19882b[i16] = bArr[i15];
                i17++;
                i15++;
            }
        }
        if (eVar.i() == 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 8;
        } else {
            i10 = i12;
        }
        int i18 = 0;
        while (i18 < i10) {
            bVarArr[i18].f19882b[i14] = bArr[i15];
            i18++;
            i15++;
        }
        int length2 = bVarArr[0].f19882b.length;
        while (length < length2) {
            int i19 = 0;
            while (i19 < i12) {
                if (z10) {
                    i11 = (i19 + 8) % i12;
                } else {
                    i11 = i19;
                }
                bVarArr[i11].f19882b[(z10 && i11 > 7) ? length - 1 : length] = bArr[i15];
                i19++;
                i15++;
            }
            length++;
        }
        if (i15 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }
}
