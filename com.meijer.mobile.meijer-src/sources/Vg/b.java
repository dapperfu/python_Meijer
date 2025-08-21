package Vg;

import Ig.e;
import Wg.j;
import com.google.android.gms.common.api.a;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private static final m[] f39908a = new m[0];

    private static int d(o[] oVarArr) {
        return Math.max(Math.max(e(oVarArr[0], oVarArr[4]), (e(oVarArr[6], oVarArr[2]) * 17) / 18), Math.max(e(oVarArr[1], oVarArr[5]), (e(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    private static int f(o[] oVarArr) {
        return Math.min(Math.min(g(oVarArr[0], oVarArr[4]), (g(oVarArr[6], oVarArr[2]) * 17) / 18), Math.min(g(oVarArr[1], oVarArr[5]), (g(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    @Override // com.google.zxing.l
    public m a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        m mVar;
        m[] mVarArrC = c(cVar, map, false);
        if (mVarArrC.length == 0 || (mVar = mVarArrC[0]) == null) {
            throw NotFoundException.a();
        }
        return mVar;
    }

    @Override // com.google.zxing.l
    public m b(com.google.zxing.c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.l
    public void reset() {
    }

    private static m[] c(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map, boolean z10) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList = new ArrayList();
        Yg.b bVarC = Yg.a.c(cVar, map, z10);
        for (o[] oVarArr : bVarC.b()) {
            e eVarI = j.i(bVarC.a(), oVarArr[4], oVarArr[5], oVarArr[6], oVarArr[7], f(oVarArr), d(oVarArr));
            m mVar = new m(eVarI.k(), eVarI.g(), oVarArr, com.google.zxing.a.PDF_417);
            mVar.h(n.ERROR_CORRECTION_LEVEL, eVarI.b());
            mVar.h(n.ERRORS_CORRECTED, eVarI.d());
            mVar.h(n.ERASURES_CORRECTED, eVarI.c());
            c cVar2 = (c) eVarI.f();
            if (cVar2 != null) {
                mVar.h(n.PDF417_EXTRA_METADATA, cVar2);
            }
            mVar.h(n.ORIENTATION, Integer.valueOf(bVarC.c()));
            mVar.h(n.SYMBOLOGY_IDENTIFIER, "]L" + eVarI.j());
            arrayList.add(mVar);
        }
        return (m[]) arrayList.toArray(f39908a);
    }

    private static int e(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return 0;
        }
        return (int) Math.abs(oVar.c() - oVar2.c());
    }

    private static int g(o oVar, o oVar2) {
        return (oVar == null || oVar2 == null) ? a.e.API_PRIORITY_OTHER : (int) Math.abs(oVar.c() - oVar2.c());
    }
}
