package s6;

import g6.C14209i;
import java.io.IOException;
import o6.C15998b;
import t6.AbstractC17067c;

/* renamed from: s6.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16881F {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160219a = AbstractC17067c.a.a("nm", "r", "hd");

    static p6.n a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        C15998b c15998bF = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160219a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                c15998bF = C16893d.f(abstractC17067c, c14209i, true);
            } else if (iL != 2) {
                abstractC17067c.skipValue();
            } else {
                zNextBoolean = abstractC17067c.nextBoolean();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new p6.n(strNextString, c15998bF);
    }
}
