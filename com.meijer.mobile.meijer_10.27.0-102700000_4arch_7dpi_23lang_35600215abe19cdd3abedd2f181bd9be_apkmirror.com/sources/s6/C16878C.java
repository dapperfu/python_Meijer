package s6;

import android.graphics.PointF;
import g6.C14209i;
import java.io.IOException;
import o6.C15998b;
import p6.k;
import t6.AbstractC17067c;

/* renamed from: s6.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16878C {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160216a = AbstractC17067c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static p6.k a(AbstractC17067c abstractC17067c, C14209i c14209i, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        k.a aVarB = null;
        C15998b c15998bF = null;
        o6.o<PointF, PointF> oVarB = null;
        C15998b c15998bF2 = null;
        C15998b c15998bE = null;
        C15998b c15998bE2 = null;
        C15998b c15998bF3 = null;
        C15998b c15998bF4 = null;
        while (abstractC17067c.hasNext()) {
            switch (abstractC17067c.l(f160216a)) {
                case 0:
                    strNextString = abstractC17067c.nextString();
                    break;
                case 1:
                    aVarB = k.a.b(abstractC17067c.nextInt());
                    break;
                case 2:
                    c15998bF = C16893d.f(abstractC17067c, c14209i, false);
                    break;
                case 3:
                    oVarB = C16890a.b(abstractC17067c, c14209i);
                    break;
                case 4:
                    c15998bF2 = C16893d.f(abstractC17067c, c14209i, false);
                    break;
                case 5:
                    c15998bE2 = C16893d.e(abstractC17067c, c14209i);
                    break;
                case 6:
                    c15998bF4 = C16893d.f(abstractC17067c, c14209i, false);
                    break;
                case 7:
                    c15998bE = C16893d.e(abstractC17067c, c14209i);
                    break;
                case 8:
                    c15998bF3 = C16893d.f(abstractC17067c, c14209i, false);
                    break;
                case 9:
                    zNextBoolean = abstractC17067c.nextBoolean();
                    break;
                case 10:
                    if (abstractC17067c.nextInt() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                default:
                    abstractC17067c.m();
                    abstractC17067c.skipValue();
                    break;
            }
        }
        return new p6.k(strNextString, aVarB, c15998bF, oVarB, c15998bF2, c15998bE, c15998bE2, c15998bF3, c15998bF4, zNextBoolean, z10);
    }
}
