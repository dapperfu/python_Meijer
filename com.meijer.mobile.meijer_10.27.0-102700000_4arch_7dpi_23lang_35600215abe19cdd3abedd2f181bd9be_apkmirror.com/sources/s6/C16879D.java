package s6;

import android.graphics.PointF;
import g6.C14209i;
import java.io.IOException;
import o6.C15998b;
import t6.AbstractC17067c;

/* renamed from: s6.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16879D {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160217a = AbstractC17067c.a.a("nm", "p", "s", "r", "hd");

    static p6.l a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        String strNextString = null;
        o6.o<PointF, PointF> oVarB = null;
        o6.f fVarI = null;
        C15998b c15998bE = null;
        boolean zNextBoolean = false;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160217a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                oVarB = C16890a.b(abstractC17067c, c14209i);
            } else if (iL == 2) {
                fVarI = C16893d.i(abstractC17067c, c14209i);
            } else if (iL == 3) {
                c15998bE = C16893d.e(abstractC17067c, c14209i);
            } else if (iL != 4) {
                abstractC17067c.skipValue();
            } else {
                zNextBoolean = abstractC17067c.nextBoolean();
            }
        }
        return new p6.l(strNextString, oVarB, fVarI, c15998bE, zNextBoolean);
    }
}
