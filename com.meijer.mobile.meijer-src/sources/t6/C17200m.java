package t6;

import h6.C14478i;
import java.io.IOException;
import java.util.ArrayList;
import u6.AbstractC17353c;

/* renamed from: t6.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C17200m {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162316a = AbstractC17353c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162317b = AbstractC17353c.a.a("shapes");

    static o6.d a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC17353c.c();
        double dNextDouble = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162316a);
            if (iL == 0) {
                cCharAt = abstractC17353c.nextString().charAt(0);
            } else if (iL == 1) {
                dNextDouble2 = abstractC17353c.nextDouble();
            } else if (iL == 2) {
                dNextDouble = abstractC17353c.nextDouble();
            } else if (iL == 3) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 4) {
                strNextString2 = abstractC17353c.nextString();
            } else if (iL != 5) {
                abstractC17353c.m();
                abstractC17353c.skipValue();
            } else {
                abstractC17353c.c();
                while (abstractC17353c.hasNext()) {
                    if (abstractC17353c.l(f162317b) != 0) {
                        abstractC17353c.m();
                        abstractC17353c.skipValue();
                    } else {
                        abstractC17353c.b();
                        while (abstractC17353c.hasNext()) {
                            arrayList.add((q6.q) C17195h.a(abstractC17353c, c14478i));
                        }
                        abstractC17353c.d();
                    }
                }
                abstractC17353c.g();
            }
        }
        abstractC17353c.g();
        return new o6.d(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}
