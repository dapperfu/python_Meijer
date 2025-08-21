package t6;

import h6.C14478i;
import java.io.IOException;
import q6.C16608a;
import u6.AbstractC17353c;

/* renamed from: t6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C17192e {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162296a = AbstractC17353c.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162297b = AbstractC17353c.a.a("ty", "v");

    static C16608a b(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        C16608a c16608a = null;
        while (abstractC17353c.hasNext()) {
            if (abstractC17353c.l(f162296a) != 0) {
                abstractC17353c.m();
                abstractC17353c.skipValue();
            } else {
                abstractC17353c.b();
                while (abstractC17353c.hasNext()) {
                    C16608a c16608aA = a(abstractC17353c, c14478i);
                    if (c16608aA != null) {
                        c16608a = c16608aA;
                    }
                }
                abstractC17353c.d();
            }
        }
        return c16608a;
    }

    private static C16608a a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        abstractC17353c.c();
        C16608a c16608a = null;
        while (true) {
            boolean z10 = false;
            while (abstractC17353c.hasNext()) {
                int iL = abstractC17353c.l(f162297b);
                if (iL != 0) {
                    if (iL != 1) {
                        abstractC17353c.m();
                        abstractC17353c.skipValue();
                    } else if (z10) {
                        c16608a = new C16608a(C17191d.e(abstractC17353c, c14478i));
                    } else {
                        abstractC17353c.skipValue();
                    }
                } else if (abstractC17353c.nextInt() == 0) {
                    z10 = true;
                }
            }
            abstractC17353c.g();
            return c16608a;
        }
    }
}
