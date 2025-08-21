package t6;

import h6.C14478i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p6.C16407b;
import p6.C16408c;
import p6.C16409d;
import q6.s;
import u6.AbstractC17353c;
import w6.C17845a;

/* loaded from: classes4.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162322a = AbstractC17353c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162323b = AbstractC17353c.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17353c.a f162324c = AbstractC17353c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    static q6.f a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        C16409d c16409d;
        ArrayList arrayList = new ArrayList();
        q6.g gVar = null;
        String strNextString = null;
        C16408c c16408cG = null;
        p6.f fVarI = null;
        p6.f fVarI2 = null;
        C16407b c16407bE = null;
        s.a aVar = null;
        s.b bVar = null;
        C16407b c16407b = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        C16409d c16409dH = null;
        while (abstractC17353c.hasNext()) {
            q6.g gVar2 = gVar;
            switch (abstractC17353c.l(f162322a)) {
                case 0:
                    strNextString = abstractC17353c.nextString();
                    gVar = gVar2;
                    break;
                case 1:
                    c16409d = c16409dH;
                    abstractC17353c.c();
                    int iNextInt = -1;
                    while (abstractC17353c.hasNext()) {
                        int iL = abstractC17353c.l(f162323b);
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
                    gVar = gVar2;
                    c16409dH = c16409d;
                    break;
                case 2:
                    c16409dH = C17191d.h(abstractC17353c, c14478i);
                    gVar = gVar2;
                    break;
                case 3:
                    c16409d = c16409dH;
                    gVar = abstractC17353c.nextInt() == 1 ? q6.g.LINEAR : q6.g.RADIAL;
                    c16409dH = c16409d;
                    break;
                case 4:
                    fVarI = C17191d.i(abstractC17353c, c14478i);
                    gVar = gVar2;
                    break;
                case 5:
                    fVarI2 = C17191d.i(abstractC17353c, c14478i);
                    gVar = gVar2;
                    break;
                case 6:
                    c16407bE = C17191d.e(abstractC17353c, c14478i);
                    gVar = gVar2;
                    break;
                case 7:
                    c16409d = c16409dH;
                    aVar = s.a.values()[abstractC17353c.nextInt() - 1];
                    gVar = gVar2;
                    c16409dH = c16409d;
                    break;
                case 8:
                    c16409d = c16409dH;
                    bVar = s.b.values()[abstractC17353c.nextInt() - 1];
                    gVar = gVar2;
                    c16409dH = c16409d;
                    break;
                case 9:
                    c16409d = c16409dH;
                    fNextDouble = (float) abstractC17353c.nextDouble();
                    gVar = gVar2;
                    c16409dH = c16409d;
                    break;
                case 10:
                    zNextBoolean = abstractC17353c.nextBoolean();
                    gVar = gVar2;
                    break;
                case 11:
                    abstractC17353c.b();
                    while (abstractC17353c.hasNext()) {
                        abstractC17353c.c();
                        String strNextString2 = null;
                        C16407b c16407bE2 = null;
                        while (abstractC17353c.hasNext()) {
                            int iL2 = abstractC17353c.l(f162324c);
                            if (iL2 != 0) {
                                C16409d c16409d2 = c16409dH;
                                if (iL2 != 1) {
                                    abstractC17353c.m();
                                    abstractC17353c.skipValue();
                                } else {
                                    c16407bE2 = C17191d.e(abstractC17353c, c14478i);
                                }
                                c16409dH = c16409d2;
                            } else {
                                strNextString2 = abstractC17353c.nextString();
                            }
                        }
                        C16409d c16409d3 = c16409dH;
                        abstractC17353c.g();
                        if (strNextString2.equals("o")) {
                            c16407b = c16407bE2;
                        } else {
                            if (strNextString2.equals("d") || strNextString2.equals("g")) {
                                c14478i.v(true);
                                arrayList.add(c16407bE2);
                            }
                            c16409dH = c16409d3;
                        }
                        c16409dH = c16409d3;
                    }
                    c16409d = c16409dH;
                    abstractC17353c.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((C16407b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    c16409dH = c16409d;
                    break;
                default:
                    abstractC17353c.m();
                    abstractC17353c.skipValue();
                    gVar = gVar2;
                    break;
            }
        }
        C16409d c16409d4 = c16409dH;
        return new q6.f(strNextString, gVar, c16408cG, c16409d4 == null ? new C16409d(Collections.singletonList(new C17845a(100))) : c16409d4, fVarI, fVarI2, c16407bE, aVar, bVar, fNextDouble, arrayList, c16407b, zNextBoolean);
    }
}
