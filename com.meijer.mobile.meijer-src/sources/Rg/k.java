package Rg;

import com.google.zxing.NotFoundException;

/* loaded from: classes8.dex */
public final class k extends y {

    /* renamed from: i, reason: collision with root package name */
    private final int[] f32598i = new int[4];

    @Override // Rg.y
    protected int l(Ig.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f32598i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < iL; i11++) {
            sb2.append((char) (y.j(aVar, iArr2, i10, y.f32627g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = y.n(aVar, i10, true, y.f32625e)[1];
        for (int i14 = 0; i14 < 4 && i13 < iL; i14++) {
            sb2.append((char) (y.j(aVar, iArr2, i13, y.f32627g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // Rg.y
    com.google.zxing.a q() {
        return com.google.zxing.a.EAN_8;
    }
}
