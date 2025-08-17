package s6;

import g6.C14209i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o6.C15998b;
import o6.C15999c;
import o6.C16000d;
import p6.s;
import t6.AbstractC17067c;
import v6.C17512a;

/* renamed from: s6.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16906q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160261a = AbstractC17067c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160262b = AbstractC17067c.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17067c.a f160263c = AbstractC17067c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    static p6.f a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        C16000d c16000d;
        ArrayList arrayList = new ArrayList();
        p6.g gVar = null;
        String strNextString = null;
        C15999c c15999cG = null;
        o6.f fVarI = null;
        o6.f fVarI2 = null;
        C15998b c15998bE = null;
        s.a aVar = null;
        s.b bVar = null;
        C15998b c15998b = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        C16000d c16000dH = null;
        while (abstractC17067c.hasNext()) {
            p6.g gVar2 = gVar;
            switch (abstractC17067c.l(f160261a)) {
                case 0:
                    strNextString = abstractC17067c.nextString();
                    gVar = gVar2;
                    break;
                case 1:
                    c16000d = c16000dH;
                    abstractC17067c.c();
                    int iNextInt = -1;
                    while (abstractC17067c.hasNext()) {
                        int iL = abstractC17067c.l(f160262b);
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
                    gVar = gVar2;
                    c16000dH = c16000d;
                    break;
                case 2:
                    c16000dH = C16893d.h(abstractC17067c, c14209i);
                    gVar = gVar2;
                    break;
                case 3:
                    c16000d = c16000dH;
                    gVar = abstractC17067c.nextInt() == 1 ? p6.g.LINEAR : p6.g.RADIAL;
                    c16000dH = c16000d;
                    break;
                case 4:
                    fVarI = C16893d.i(abstractC17067c, c14209i);
                    gVar = gVar2;
                    break;
                case 5:
                    fVarI2 = C16893d.i(abstractC17067c, c14209i);
                    gVar = gVar2;
                    break;
                case 6:
                    c15998bE = C16893d.e(abstractC17067c, c14209i);
                    gVar = gVar2;
                    break;
                case 7:
                    c16000d = c16000dH;
                    aVar = s.a.values()[abstractC17067c.nextInt() - 1];
                    gVar = gVar2;
                    c16000dH = c16000d;
                    break;
                case 8:
                    c16000d = c16000dH;
                    bVar = s.b.values()[abstractC17067c.nextInt() - 1];
                    gVar = gVar2;
                    c16000dH = c16000d;
                    break;
                case 9:
                    c16000d = c16000dH;
                    fNextDouble = (float) abstractC17067c.nextDouble();
                    gVar = gVar2;
                    c16000dH = c16000d;
                    break;
                case 10:
                    zNextBoolean = abstractC17067c.nextBoolean();
                    gVar = gVar2;
                    break;
                case 11:
                    abstractC17067c.b();
                    while (abstractC17067c.hasNext()) {
                        abstractC17067c.c();
                        String strNextString2 = null;
                        C15998b c15998bE2 = null;
                        while (abstractC17067c.hasNext()) {
                            int iL2 = abstractC17067c.l(f160263c);
                            if (iL2 != 0) {
                                C16000d c16000d2 = c16000dH;
                                if (iL2 != 1) {
                                    abstractC17067c.m();
                                    abstractC17067c.skipValue();
                                } else {
                                    c15998bE2 = C16893d.e(abstractC17067c, c14209i);
                                }
                                c16000dH = c16000d2;
                            } else {
                                strNextString2 = abstractC17067c.nextString();
                            }
                        }
                        C16000d c16000d3 = c16000dH;
                        abstractC17067c.g();
                        if (strNextString2.equals("o")) {
                            c15998b = c15998bE2;
                        } else {
                            if (strNextString2.equals("d") || strNextString2.equals("g")) {
                                c14209i.v(true);
                                arrayList.add(c15998bE2);
                            }
                            c16000dH = c16000d3;
                        }
                        c16000dH = c16000d3;
                    }
                    c16000d = c16000dH;
                    abstractC17067c.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((C15998b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    c16000dH = c16000d;
                    break;
                default:
                    abstractC17067c.m();
                    abstractC17067c.skipValue();
                    gVar = gVar2;
                    break;
            }
        }
        C16000d c16000d4 = c16000dH;
        return new p6.f(strNextString, gVar, c15999cG, c16000d4 == null ? new C16000d(Collections.singletonList(new C17512a(100))) : c16000d4, fVarI, fVarI2, c15998bE, aVar, bVar, fNextDouble, arrayList, c15998b, zNextBoolean);
    }
}
