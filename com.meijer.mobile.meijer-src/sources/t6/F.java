package t6;

import h6.C14478i;
import java.io.IOException;
import p6.C16407b;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162280a = AbstractC17353c.a.a("nm", "r", "hd");

    static q6.n a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        C16407b c16407bF = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162280a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                c16407bF = C17191d.f(abstractC17353c, c14478i, true);
            } else if (iL != 2) {
                abstractC17353c.skipValue();
            } else {
                zNextBoolean = abstractC17353c.nextBoolean();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new q6.n(strNextString, c16407bF);
    }
}
