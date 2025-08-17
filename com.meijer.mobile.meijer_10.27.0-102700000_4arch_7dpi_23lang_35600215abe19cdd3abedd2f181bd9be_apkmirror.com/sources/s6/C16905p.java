package s6;

import android.graphics.Path;
import g6.C14209i;
import java.io.IOException;
import java.util.Collections;
import o6.C15999c;
import o6.C16000d;
import t6.AbstractC17067c;
import v6.C17512a;

/* renamed from: s6.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16905p {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160259a = AbstractC17067c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160260b = AbstractC17067c.a.a("p", "k");

    static p6.e a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        C16000d c16000d = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        p6.g gVar = null;
        C15999c c15999cG = null;
        o6.f fVarI = null;
        o6.f fVarI2 = null;
        boolean zNextBoolean = false;
        while (abstractC17067c.hasNext()) {
            switch (abstractC17067c.l(f160259a)) {
                case 0:
                    strNextString = abstractC17067c.nextString();
                    break;
                case 1:
                    abstractC17067c.c();
                    int iNextInt = -1;
                    while (abstractC17067c.hasNext()) {
                        int iL = abstractC17067c.l(f160260b);
                        if (iL == 0) {
                            iNextInt = abstractC17067c.nextInt();
                        } else if (iL != 1) {
                            abstractC17067c.m();
                            abstractC17067c.skipValue();
                        } else {
                            c15999cG = C16893d.g(abstractC17067c, c14209i, iNextInt);
                        }
                    }
                    abstractC17067c.g();
                    break;
                case 2:
                    c16000d = C16893d.h(abstractC17067c, c14209i);
                    break;
                case 3:
                    gVar = abstractC17067c.nextInt() == 1 ? p6.g.LINEAR : p6.g.RADIAL;
                    break;
                case 4:
                    fVarI = C16893d.i(abstractC17067c, c14209i);
                    break;
                case 5:
                    fVarI2 = C16893d.i(abstractC17067c, c14209i);
                    break;
                case 6:
                    fillType = abstractC17067c.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = abstractC17067c.nextBoolean();
                    break;
                default:
                    abstractC17067c.m();
                    abstractC17067c.skipValue();
                    break;
            }
        }
        if (c16000d == null) {
            c16000d = new C16000d(Collections.singletonList(new C17512a(100)));
        }
        return new p6.e(strNextString, gVar, fillType, c15999cG, c16000d, fVarI, fVarI2, null, null, zNextBoolean);
    }
}
