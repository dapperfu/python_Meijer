package Pg;

import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
public final class k extends y {

    /* renamed from: i, reason: collision with root package name */
    private final int[] f25384i = new int[4];

    @Override // Pg.y
    protected int l(Gg.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f25384i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < iL; i11++) {
            sb2.append((char) (y.j(aVar, iArr2, i10, y.f25413g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = y.n(aVar, i10, true, y.f25411e)[1];
        for (int i14 = 0; i14 < 4 && i13 < iL; i14++) {
            sb2.append((char) (y.j(aVar, iArr2, i13, y.f25413g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // Pg.y
    com.google.zxing.a q() {
        return com.google.zxing.a.EAN_8;
    }
}
