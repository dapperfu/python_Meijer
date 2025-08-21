package t6;

import h6.C14478i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p6.C16406a;
import p6.C16407b;
import p6.C16409d;
import q6.s;
import u6.AbstractC17353c;
import w6.C17845a;

/* loaded from: classes4.dex */
class L {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162287a = AbstractC17353c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162288b = AbstractC17353c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [p6.b] */
    /* JADX WARN: Type inference failed for: r15v4 */
    static q6.s a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        ?? E10;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        s.a aVar = null;
        s.b bVar = null;
        C16407b c16407b = null;
        C16406a c16406aC = null;
        C16407b c16407bE = null;
        String str = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        C16409d c16409d = null;
        while (abstractC17353c.hasNext()) {
            switch (abstractC17353c.l(f162287a)) {
                case 0:
                    strNextString = abstractC17353c.nextString();
                    break;
                case 1:
                    c16406aC = C17191d.c(abstractC17353c, c14478i);
                    break;
                case 2:
                    c16407bE = C17191d.e(abstractC17353c, c14478i);
                    break;
                case 3:
                    c16409d = C17191d.h(abstractC17353c, c14478i);
                    break;
                case 4:
                    aVar = s.a.values()[abstractC17353c.nextInt() - 1];
                    break;
                case 5:
                    bVar = s.b.values()[abstractC17353c.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) abstractC17353c.nextDouble();
                    break;
                case 7:
                    zNextBoolean = abstractC17353c.nextBoolean();
                    break;
                case 8:
                    abstractC17353c.b();
                    while (abstractC17353c.hasNext()) {
                        abstractC17353c.c();
                        String strNextString2 = str;
                        E10 = strNextString2;
                        while (abstractC17353c.hasNext()) {
                            int iL = abstractC17353c.l(f162288b);
                            if (iL == 0) {
                                strNextString2 = abstractC17353c.nextString();
                            } else if (iL != 1) {
                                abstractC17353c.m();
                                abstractC17353c.skipValue();
                            } else {
                                E10 = C17191d.e(abstractC17353c, c14478i);
                            }
                            E10 = E10;
                        }
                        abstractC17353c.g();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                c14478i.v(true);
                                arrayList.add(E10);
                                break;
                            case "o":
                                c16407b = E10;
                                break;
                        }
                        str = null;
                    }
                    abstractC17353c.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((C16407b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    abstractC17353c.skipValue();
                    continue;
            }
            str = null;
        }
        if (c16409d == null) {
            c16409d = new C16409d(Collections.singletonList(new C17845a(100)));
        }
        if (aVar == null) {
            aVar = s.a.BUTT;
        }
        if (bVar == null) {
            bVar = s.b.MITER;
        }
        return new q6.s(strNextString, c16407b, arrayList, c16406aC, c16409d, c16407bE, aVar, bVar, fNextDouble, zNextBoolean);
    }
}
