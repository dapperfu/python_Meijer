package t6;

import android.graphics.Path;
import h6.C14478i;
import java.io.IOException;
import java.util.Collections;
import p6.C16408c;
import p6.C16409d;
import u6.AbstractC17353c;
import w6.C17845a;

/* loaded from: classes4.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162320a = AbstractC17353c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162321b = AbstractC17353c.a.a("p", "k");

    static q6.e a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        C16409d c16409d = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        q6.g gVar = null;
        C16408c c16408cG = null;
        p6.f fVarI = null;
        p6.f fVarI2 = null;
        boolean zNextBoolean = false;
        while (abstractC17353c.hasNext()) {
            switch (abstractC17353c.l(f162320a)) {
                case 0:
                    strNextString = abstractC17353c.nextString();
                    break;
                case 1:
                    abstractC17353c.c();
                    int iNextInt = -1;
                    while (abstractC17353c.hasNext()) {
                        int iL = abstractC17353c.l(f162321b);
                        if (iL == 0) {
                            iNextInt = abstractC17353c.nextInt();
                        } else if (iL != 1) {
                            abstractC17353c.m();
                            abstractC17353c.skipValue();
                        } else {
                            c16408cG = C17191d.g(abstractC17353c, c14478i, iNextInt);
                        }
                    }
                    abstractC17353c.g();
                    break;
                case 2:
                    c16409d = C17191d.h(abstractC17353c, c14478i);
                    break;
                case 3:
                    gVar = abstractC17353c.nextInt() == 1 ? q6.g.LINEAR : q6.g.RADIAL;
                    break;
                case 4:
                    fVarI = C17191d.i(abstractC17353c, c14478i);
                    break;
                case 5:
                    fVarI2 = C17191d.i(abstractC17353c, c14478i);
                    break;
                case 6:
                    fillType = abstractC17353c.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = abstractC17353c.nextBoolean();
                    break;
                default:
                    abstractC17353c.m();
                    abstractC17353c.skipValue();
                    break;
            }
        }
        if (c16409d == null) {
            c16409d = new C16409d(Collections.singletonList(new C17845a(100)));
        }
        return new q6.e(strNextString, gVar, fillType, c16408cG, c16409d, fVarI, fVarI2, null, null, zNextBoolean);
    }
}
