package t6;

import h6.C14478i;
import java.io.IOException;
import java.util.ArrayList;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
class J {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162285a = AbstractC17353c.a.a("nm", "hd", "it");

    static q6.q a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162285a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                zNextBoolean = abstractC17353c.nextBoolean();
            } else if (iL != 2) {
                abstractC17353c.skipValue();
            } else {
                abstractC17353c.b();
                while (abstractC17353c.hasNext()) {
                    q6.c cVarA = C17195h.a(abstractC17353c, c14478i);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                abstractC17353c.d();
            }
        }
        return new q6.q(strNextString, arrayList, zNextBoolean);
    }
}
