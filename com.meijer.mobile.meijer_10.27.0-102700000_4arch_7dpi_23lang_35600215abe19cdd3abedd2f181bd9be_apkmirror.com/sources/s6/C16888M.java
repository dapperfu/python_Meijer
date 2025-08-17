package s6;

import g6.C14209i;
import java.io.IOException;
import o6.C15998b;
import p6.t;
import t6.AbstractC17067c;

/* renamed from: s6.M, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16888M {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160228a = AbstractC17067c.a.a("s", "e", "o", "nm", "m", "hd");

    static p6.t a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        String strNextString = null;
        t.a aVarB = null;
        C15998b c15998bF = null;
        C15998b c15998bF2 = null;
        C15998b c15998bF3 = null;
        boolean zNextBoolean = false;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160228a);
            if (iL == 0) {
                c15998bF = C16893d.f(abstractC17067c, c14209i, false);
            } else if (iL == 1) {
                c15998bF2 = C16893d.f(abstractC17067c, c14209i, false);
            } else if (iL == 2) {
                c15998bF3 = C16893d.f(abstractC17067c, c14209i, false);
            } else if (iL == 3) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 4) {
                aVarB = t.a.b(abstractC17067c.nextInt());
            } else if (iL != 5) {
                abstractC17067c.skipValue();
            } else {
                zNextBoolean = abstractC17067c.nextBoolean();
            }
        }
        return new p6.t(strNextString, aVarB, c15998bF, c15998bF2, c15998bF3, zNextBoolean);
    }
}
