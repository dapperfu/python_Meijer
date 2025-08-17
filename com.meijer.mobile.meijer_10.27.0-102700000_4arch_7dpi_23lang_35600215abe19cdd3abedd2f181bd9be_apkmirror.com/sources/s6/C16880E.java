package s6;

import g6.C14209i;
import java.io.IOException;
import o6.C15998b;
import t6.AbstractC17067c;

/* renamed from: s6.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16880E {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160218a = AbstractC17067c.a.a("nm", "c", "o", "tr", "hd");

    static p6.m a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        String strNextString = null;
        C15998b c15998bF = null;
        C15998b c15998bF2 = null;
        o6.n nVarG = null;
        boolean zNextBoolean = false;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160218a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                c15998bF = C16893d.f(abstractC17067c, c14209i, false);
            } else if (iL == 2) {
                c15998bF2 = C16893d.f(abstractC17067c, c14209i, false);
            } else if (iL == 3) {
                nVarG = C16892c.g(abstractC17067c, c14209i);
            } else if (iL != 4) {
                abstractC17067c.skipValue();
            } else {
                zNextBoolean = abstractC17067c.nextBoolean();
            }
        }
        return new p6.m(strNextString, c15998bF, c15998bF2, nVarG, zNextBoolean);
    }
}
