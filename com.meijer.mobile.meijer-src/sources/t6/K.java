package t6;

import h6.C14478i;
import java.io.IOException;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
class K {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC17353c.a f162286a = AbstractC17353c.a.a("nm", "ind", "ks", "hd");

    static q6.r a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        String strNextString = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        p6.h hVarK = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162286a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                iNextInt = abstractC17353c.nextInt();
            } else if (iL == 2) {
                hVarK = C17191d.k(abstractC17353c, c14478i);
            } else if (iL != 3) {
                abstractC17353c.skipValue();
            } else {
                zNextBoolean = abstractC17353c.nextBoolean();
            }
        }
        return new q6.r(strNextString, iNextInt, hVarK, zNextBoolean);
    }
}
