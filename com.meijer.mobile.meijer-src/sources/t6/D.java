package t6;

import android.graphics.PointF;
import h6.C14478i;
import java.io.IOException;
import p6.C16407b;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162278a = AbstractC17353c.a.a("nm", "p", "s", "r", "hd");

    static q6.l a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        String strNextString = null;
        p6.o<PointF, PointF> oVarB = null;
        p6.f fVarI = null;
        C16407b c16407bE = null;
        boolean zNextBoolean = false;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162278a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                oVarB = C17188a.b(abstractC17353c, c14478i);
            } else if (iL == 2) {
                fVarI = C17191d.i(abstractC17353c, c14478i);
            } else if (iL == 3) {
                c16407bE = C17191d.e(abstractC17353c, c14478i);
            } else if (iL != 4) {
                abstractC17353c.skipValue();
            } else {
                zNextBoolean = abstractC17353c.nextBoolean();
            }
        }
        return new q6.l(strNextString, oVarB, fVarI, c16407bE, zNextBoolean);
    }
}
