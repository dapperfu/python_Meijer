package t6;

import h6.C14478i;
import java.io.IOException;
import p6.C16407b;
import q6.t;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
class M {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162289a = AbstractC17353c.a.a("s", "e", "o", "nm", "m", "hd");

    static q6.t a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        String strNextString = null;
        t.a aVarB = null;
        C16407b c16407bF = null;
        C16407b c16407bF2 = null;
        C16407b c16407bF3 = null;
        boolean zNextBoolean = false;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162289a);
            if (iL == 0) {
                c16407bF = C17191d.f(abstractC17353c, c14478i, false);
            } else if (iL == 1) {
                c16407bF2 = C17191d.f(abstractC17353c, c14478i, false);
            } else if (iL == 2) {
                c16407bF3 = C17191d.f(abstractC17353c, c14478i, false);
            } else if (iL == 3) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 4) {
                aVarB = t.a.b(abstractC17353c.nextInt());
            } else if (iL != 5) {
                abstractC17353c.skipValue();
            } else {
                zNextBoolean = abstractC17353c.nextBoolean();
            }
        }
        return new q6.t(strNextString, aVarB, c16407bF, c16407bF2, c16407bF3, zNextBoolean);
    }
}
