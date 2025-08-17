package s6;

import g6.C14209i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o6.C15997a;
import o6.C15998b;
import o6.C16000d;
import p6.s;
import t6.AbstractC17067c;
import v6.C17512a;

/* renamed from: s6.L, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16887L {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160226a = AbstractC17067c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160227b = AbstractC17067c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [o6.b] */
    /* JADX WARN: Type inference failed for: r15v4 */
    static p6.s a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        ?? E10;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        s.a aVar = null;
        s.b bVar = null;
        C15998b c15998b = null;
        C15997a c15997aC = null;
        C15998b c15998bE = null;
        String str = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        C16000d c16000d = null;
        while (abstractC17067c.hasNext()) {
            switch (abstractC17067c.l(f160226a)) {
                case 0:
                    strNextString = abstractC17067c.nextString();
                    break;
                case 1:
                    c15997aC = C16893d.c(abstractC17067c, c14209i);
                    break;
                case 2:
                    c15998bE = C16893d.e(abstractC17067c, c14209i);
                    break;
                case 3:
                    c16000d = C16893d.h(abstractC17067c, c14209i);
                    break;
                case 4:
                    aVar = s.a.values()[abstractC17067c.nextInt() - 1];
                    break;
                case 5:
                    bVar = s.b.values()[abstractC17067c.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) abstractC17067c.nextDouble();
                    break;
                case 7:
                    zNextBoolean = abstractC17067c.nextBoolean();
                    break;
                case 8:
                    abstractC17067c.b();
                    while (abstractC17067c.hasNext()) {
                        abstractC17067c.c();
                        String strNextString2 = str;
                        E10 = strNextString2;
                        while (abstractC17067c.hasNext()) {
                            int iL = abstractC17067c.l(f160227b);
                            if (iL == 0) {
                                strNextString2 = abstractC17067c.nextString();
                            } else if (iL != 1) {
                                abstractC17067c.m();
                                abstractC17067c.skipValue();
                            } else {
                                E10 = C16893d.e(abstractC17067c, c14209i);
                            }
                            E10 = E10;
                        }
                        abstractC17067c.g();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                c14209i.v(true);
                                arrayList.add(E10);
                                break;
                            case "o":
                                c15998b = E10;
                                break;
                        }
                        str = null;
                    }
                    abstractC17067c.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((C15998b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    abstractC17067c.skipValue();
                    continue;
            }
            str = null;
        }
        if (c16000d == null) {
            c16000d = new C16000d(Collections.singletonList(new C17512a(100)));
        }
        if (aVar == null) {
            aVar = s.a.BUTT;
        }
        if (bVar == null) {
            bVar = s.b.MITER;
        }
        return new p6.s(strNextString, c15998b, arrayList, c15997aC, c16000d, c15998bE, aVar, bVar, fNextDouble, zNextBoolean);
    }
}
