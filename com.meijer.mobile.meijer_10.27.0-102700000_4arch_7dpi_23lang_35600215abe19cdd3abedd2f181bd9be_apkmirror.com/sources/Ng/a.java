package Ng;

import Gg.b;
import Gg.e;
import Og.c;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import java.util.Map;

/* loaded from: classes7.dex */
public final class a implements l {

    /* renamed from: b, reason: collision with root package name */
    private static final o[] f21533b = new o[0];

    /* renamed from: a, reason: collision with root package name */
    private final c f21534a = new c();

    @Override // com.google.zxing.l
    public m b(com.google.zxing.c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.l
    public void reset() {
    }

    private static b c(b bVar) throws NotFoundException {
        int[] iArrI = bVar.i();
        if (iArrI != null) {
            int i10 = iArrI[0];
            int i11 = iArrI[1];
            int i12 = iArrI[2];
            int i13 = iArrI[3];
            b bVar2 = new b(30, 33);
            for (int i14 = 0; i14 < 33; i14++) {
                int iMin = Math.min(((i14 * i13) + (i13 / 2)) / 33, i13 - 1) + i11;
                for (int i15 = 0; i15 < 30; i15++) {
                    if (bVar.f(Math.min((((i15 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30, i12 - 1) + i10, iMin)) {
                        bVar2.q(i15, i14);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.l
    public m a(com.google.zxing.c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        e eVarB = this.f21534a.b(c(cVar.a()), map);
        m mVar = new m(eVarB.k(), eVarB.g(), f21533b, com.google.zxing.a.MAXICODE);
        mVar.h(n.ERRORS_CORRECTED, eVarB.d());
        String strB = eVarB.b();
        if (strB != null) {
            mVar.h(n.ERROR_CORRECTION_LEVEL, strB);
        }
        return mVar;
    }
}
