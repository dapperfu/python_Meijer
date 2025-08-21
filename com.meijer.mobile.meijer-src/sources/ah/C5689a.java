package ah;

import Ig.g;
import bh.e;
import bh.i;
import ch.C6510c;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import java.util.List;
import java.util.Map;

/* renamed from: ah.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C5689a implements l {

    /* renamed from: b, reason: collision with root package name */
    private static final o[] f45394b = new o[0];

    /* renamed from: a, reason: collision with root package name */
    private final e f45395a = new e();

    @Override // com.google.zxing.l
    public m b(c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.l
    public void reset() {
    }

    @Override // com.google.zxing.l
    public final m a(c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        o[] oVarArrB;
        Ig.e eVarB;
        if (map == null || !map.containsKey(d.PURE_BARCODE)) {
            g gVarE = new C6510c(cVar.a()).e(map);
            Ig.e eVarB2 = this.f45395a.b(gVarE.a(), map);
            oVarArrB = gVarE.b();
            eVarB = eVarB2;
        } else {
            eVarB = this.f45395a.b(c(cVar.a()), map);
            oVarArrB = f45394b;
        }
        if (eVarB.f() instanceof i) {
            ((i) eVarB.f()).a(oVarArrB);
        }
        m mVar = new m(eVarB.k(), eVarB.g(), oVarArrB, com.google.zxing.a.QR_CODE);
        List<byte[]> listA = eVarB.a();
        if (listA != null) {
            mVar.h(n.BYTE_SEGMENTS, listA);
        }
        String strB = eVarB.b();
        if (strB != null) {
            mVar.h(n.ERROR_CORRECTION_LEVEL, strB);
        }
        if (eVarB.l()) {
            mVar.h(n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVarB.i()));
            mVar.h(n.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVarB.h()));
        }
        mVar.h(n.ERRORS_CORRECTED, eVarB.d());
        mVar.h(n.SYMBOLOGY_IDENTIFIER, "]Q" + eVarB.j());
        return mVar;
    }

    private static Ig.b c(Ig.b bVar) throws NotFoundException {
        int[] iArrL = bVar.l();
        int[] iArrG = bVar.g();
        if (iArrL != null && iArrG != null) {
            float fD = d(iArrL, bVar);
            int i10 = iArrL[1];
            int i11 = iArrG[1];
            int i12 = iArrL[0];
            int i13 = iArrG[0];
            if (i12 < i13 && i10 < i11) {
                int i14 = i11 - i10;
                if (i14 != i13 - i12 && (i13 = i12 + i14) >= bVar.m()) {
                    throw NotFoundException.a();
                }
                int iRound = Math.round(((i13 - i12) + 1) / fD);
                int iRound2 = Math.round((i14 + 1) / fD);
                if (iRound > 0 && iRound2 > 0) {
                    if (iRound2 == iRound) {
                        int i15 = (int) (fD / 2.0f);
                        int i16 = i10 + i15;
                        int i17 = i12 + i15;
                        int i18 = (((int) ((iRound - 1) * fD)) + i17) - i13;
                        if (i18 > 0) {
                            if (i18 <= i15) {
                                i17 -= i18;
                            } else {
                                throw NotFoundException.a();
                            }
                        }
                        int i19 = (((int) ((iRound2 - 1) * fD)) + i16) - i11;
                        if (i19 > 0) {
                            if (i19 <= i15) {
                                i16 -= i19;
                            } else {
                                throw NotFoundException.a();
                            }
                        }
                        Ig.b bVar2 = new Ig.b(iRound, iRound2);
                        for (int i20 = 0; i20 < iRound2; i20++) {
                            int i21 = ((int) (i20 * fD)) + i16;
                            for (int i22 = 0; i22 < iRound; i22++) {
                                if (bVar.f(((int) (i22 * fD)) + i17, i21)) {
                                    bVar2.q(i22, i20);
                                }
                            }
                        }
                        return bVar2;
                    }
                    throw NotFoundException.a();
                }
                throw NotFoundException.a();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static float d(int[] iArr, Ig.b bVar) throws NotFoundException {
        int iJ = bVar.j();
        int iM = bVar.m();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < iM && i11 < iJ) {
            if (z10 != bVar.f(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 != iM && i11 != iJ) {
            return (i10 - iArr[0]) / 7.0f;
        }
        throw NotFoundException.a();
    }
}
