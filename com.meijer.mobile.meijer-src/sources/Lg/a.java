package Lg;

import Ig.e;
import Ig.g;
import Mg.d;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a implements l {

    /* renamed from: b, reason: collision with root package name */
    private static final o[] f18428b = new o[0];

    /* renamed from: a, reason: collision with root package name */
    private final d f18429a = new d();

    @Override // com.google.zxing.l
    public m b(c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.l
    public void reset() {
    }

    @Override // com.google.zxing.l
    public m a(c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        o[] oVarArrB;
        e eVarB;
        if (map == null || !map.containsKey(com.google.zxing.d.PURE_BARCODE)) {
            g gVarB = new Ng.a(cVar.a()).b();
            e eVarB2 = this.f18429a.b(gVarB.a());
            oVarArrB = gVarB.b();
            eVarB = eVarB2;
        } else {
            eVarB = this.f18429a.b(c(cVar.a()));
            oVarArrB = f18428b;
        }
        m mVar = new m(eVarB.k(), eVarB.g(), oVarArrB, com.google.zxing.a.DATA_MATRIX);
        List<byte[]> listA = eVarB.a();
        if (listA != null) {
            mVar.h(n.BYTE_SEGMENTS, listA);
        }
        String strB = eVarB.b();
        if (strB != null) {
            mVar.h(n.ERROR_CORRECTION_LEVEL, strB);
        }
        mVar.h(n.ERRORS_CORRECTED, eVarB.d());
        mVar.h(n.SYMBOLOGY_IDENTIFIER, "]d" + eVarB.j());
        return mVar;
    }

    private static Ig.b c(Ig.b bVar) throws NotFoundException {
        int[] iArrL = bVar.l();
        int[] iArrG = bVar.g();
        if (iArrL != null && iArrG != null) {
            int iD = d(iArrL, bVar);
            int i10 = iArrL[1];
            int i11 = iArrG[1];
            int i12 = iArrL[0];
            int i13 = ((iArrG[0] - i12) + 1) / iD;
            int i14 = ((i11 - i10) + 1) / iD;
            if (i13 > 0 && i14 > 0) {
                int i15 = iD / 2;
                int i16 = i10 + i15;
                int i17 = i12 + i15;
                Ig.b bVar2 = new Ig.b(i13, i14);
                for (int i18 = 0; i18 < i14; i18++) {
                    int i19 = (i18 * iD) + i16;
                    for (int i20 = 0; i20 < i13; i20++) {
                        if (bVar.f((i20 * iD) + i17, i19)) {
                            bVar2.q(i20, i18);
                        }
                    }
                }
                return bVar2;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static int d(int[] iArr, Ig.b bVar) throws NotFoundException {
        int iM = bVar.m();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < iM && bVar.f(i10, i11)) {
            i10++;
        }
        if (i10 != iM) {
            int i12 = i10 - iArr[0];
            if (i12 != 0) {
                return i12;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }
}
