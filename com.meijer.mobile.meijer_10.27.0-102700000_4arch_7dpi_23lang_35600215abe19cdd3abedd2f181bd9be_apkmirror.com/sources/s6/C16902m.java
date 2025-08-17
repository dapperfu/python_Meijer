package s6;

import g6.C14209i;
import java.io.IOException;
import java.util.ArrayList;
import t6.AbstractC17067c;

/* renamed from: s6.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16902m {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160255a = AbstractC17067c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160256b = AbstractC17067c.a.a("shapes");

    static n6.d a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC17067c.c();
        double dNextDouble = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160255a);
            if (iL == 0) {
                cCharAt = abstractC17067c.nextString().charAt(0);
            } else if (iL == 1) {
                dNextDouble2 = abstractC17067c.nextDouble();
            } else if (iL == 2) {
                dNextDouble = abstractC17067c.nextDouble();
            } else if (iL == 3) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 4) {
                strNextString2 = abstractC17067c.nextString();
            } else if (iL != 5) {
                abstractC17067c.m();
                abstractC17067c.skipValue();
            } else {
                abstractC17067c.c();
                while (abstractC17067c.hasNext()) {
                    if (abstractC17067c.l(f160256b) != 0) {
                        abstractC17067c.m();
                        abstractC17067c.skipValue();
                    } else {
                        abstractC17067c.b();
                        while (abstractC17067c.hasNext()) {
                            arrayList.add((p6.q) C16897h.a(abstractC17067c, c14209i));
                        }
                        abstractC17067c.d();
                    }
                }
                abstractC17067c.g();
            }
        }
        abstractC17067c.g();
        return new n6.d(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}
