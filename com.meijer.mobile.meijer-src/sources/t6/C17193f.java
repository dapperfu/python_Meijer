package t6;

import android.graphics.PointF;
import h6.C14478i;
import java.io.IOException;
import u6.AbstractC17353c;

/* renamed from: t6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C17193f {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162298a = AbstractC17353c.a.a("nm", "p", "s", "hd", "d");

    static q6.b a(AbstractC17353c abstractC17353c, C14478i c14478i, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        p6.o<PointF, PointF> oVarB = null;
        p6.f fVarI = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162298a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                oVarB = C17188a.b(abstractC17353c, c14478i);
            } else if (iL == 2) {
                fVarI = C17191d.i(abstractC17353c, c14478i);
            } else if (iL == 3) {
                zNextBoolean = abstractC17353c.nextBoolean();
            } else if (iL != 4) {
                abstractC17353c.m();
                abstractC17353c.skipValue();
            } else {
                z10 = abstractC17353c.nextInt() == 3;
            }
        }
        return new q6.b(strNextString, oVarB, fVarI, z10, zNextBoolean);
    }
}
