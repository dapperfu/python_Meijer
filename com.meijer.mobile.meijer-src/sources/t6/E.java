package t6;

import h6.C14478i;
import java.io.IOException;
import p6.C16407b;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
class E {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162279a = AbstractC17353c.a.a("nm", "c", "o", "tr", "hd");

    static q6.m a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        String strNextString = null;
        C16407b c16407bF = null;
        C16407b c16407bF2 = null;
        p6.n nVarG = null;
        boolean zNextBoolean = false;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162279a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                c16407bF = C17191d.f(abstractC17353c, c14478i, false);
            } else if (iL == 2) {
                c16407bF2 = C17191d.f(abstractC17353c, c14478i, false);
            } else if (iL == 3) {
                nVarG = C17190c.g(abstractC17353c, c14478i);
            } else if (iL != 4) {
                abstractC17353c.skipValue();
            } else {
                zNextBoolean = abstractC17353c.nextBoolean();
            }
        }
        return new q6.m(strNextString, c16407bF, c16407bF2, nVarG, zNextBoolean);
    }
}
