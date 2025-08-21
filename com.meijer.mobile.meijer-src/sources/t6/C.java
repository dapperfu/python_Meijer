package t6;

import android.graphics.PointF;
import h6.C14478i;
import java.io.IOException;
import p6.C16407b;
import q6.k;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162277a = AbstractC17353c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static q6.k a(AbstractC17353c abstractC17353c, C14478i c14478i, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        k.a aVarB = null;
        C16407b c16407bF = null;
        p6.o<PointF, PointF> oVarB = null;
        C16407b c16407bF2 = null;
        C16407b c16407bE = null;
        C16407b c16407bE2 = null;
        C16407b c16407bF3 = null;
        C16407b c16407bF4 = null;
        while (abstractC17353c.hasNext()) {
            switch (abstractC17353c.l(f162277a)) {
                case 0:
                    strNextString = abstractC17353c.nextString();
                    break;
                case 1:
                    aVarB = k.a.b(abstractC17353c.nextInt());
                    break;
                case 2:
                    c16407bF = C17191d.f(abstractC17353c, c14478i, false);
                    break;
                case 3:
                    oVarB = C17188a.b(abstractC17353c, c14478i);
                    break;
                case 4:
                    c16407bF2 = C17191d.f(abstractC17353c, c14478i, false);
                    break;
                case 5:
                    c16407bE2 = C17191d.e(abstractC17353c, c14478i);
                    break;
                case 6:
                    c16407bF4 = C17191d.f(abstractC17353c, c14478i, false);
                    break;
                case 7:
                    c16407bE = C17191d.e(abstractC17353c, c14478i);
                    break;
                case 8:
                    c16407bF3 = C17191d.f(abstractC17353c, c14478i, false);
                    break;
                case 9:
                    zNextBoolean = abstractC17353c.nextBoolean();
                    break;
                case 10:
                    if (abstractC17353c.nextInt() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                default:
                    abstractC17353c.m();
                    abstractC17353c.skipValue();
                    break;
            }
        }
        return new q6.k(strNextString, aVarB, c16407bF, oVarB, c16407bF2, c16407bE, c16407bE2, c16407bF3, c16407bF4, zNextBoolean, z10);
    }
}
