package s6;

import android.graphics.PointF;
import g6.C14209i;
import java.io.IOException;
import t6.AbstractC17067c;

/* renamed from: s6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16895f {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160237a = AbstractC17067c.a.a("nm", "p", "s", "hd", "d");

    static p6.b a(AbstractC17067c abstractC17067c, C14209i c14209i, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        o6.o<PointF, PointF> oVarB = null;
        o6.f fVarI = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160237a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                oVarB = C16890a.b(abstractC17067c, c14209i);
            } else if (iL == 2) {
                fVarI = C16893d.i(abstractC17067c, c14209i);
            } else if (iL == 3) {
                zNextBoolean = abstractC17067c.nextBoolean();
            } else if (iL != 4) {
                abstractC17067c.m();
                abstractC17067c.skipValue();
            } else {
                z10 = abstractC17067c.nextInt() == 3;
            }
        }
        return new p6.b(strNextString, oVarB, fVarI, z10, zNextBoolean);
    }
}
