package s6;

import g6.C14209i;
import java.io.IOException;
import t6.AbstractC17067c;

/* renamed from: s6.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16886K {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC17067c.a f160225a = AbstractC17067c.a.a("nm", "ind", "ks", "hd");

    static p6.r a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        String strNextString = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        o6.h hVarK = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160225a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                iNextInt = abstractC17067c.nextInt();
            } else if (iL == 2) {
                hVarK = C16893d.k(abstractC17067c, c14209i);
            } else if (iL != 3) {
                abstractC17067c.skipValue();
            } else {
                zNextBoolean = abstractC17067c.nextBoolean();
            }
        }
        return new p6.r(strNextString, iNextInt, hVarK, zNextBoolean);
    }
}
