package t6;

import java.io.IOException;
import q6.j;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162341a = AbstractC17353c.a.a("nm", "mm", "hd");

    static q6.j a(AbstractC17353c abstractC17353c) throws IOException {
        String strNextString = null;
        boolean zNextBoolean = false;
        j.a aVarB = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162341a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                aVarB = j.a.b(abstractC17353c.nextInt());
            } else if (iL != 2) {
                abstractC17353c.m();
                abstractC17353c.skipValue();
            } else {
                zNextBoolean = abstractC17353c.nextBoolean();
            }
        }
        return new q6.j(strNextString, aVarB, zNextBoolean);
    }
}
