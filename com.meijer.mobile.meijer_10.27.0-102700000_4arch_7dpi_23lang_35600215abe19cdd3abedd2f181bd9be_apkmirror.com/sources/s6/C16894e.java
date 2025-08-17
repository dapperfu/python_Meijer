package s6;

import g6.C14209i;
import java.io.IOException;
import p6.C16263a;
import t6.AbstractC17067c;

/* renamed from: s6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16894e {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160235a = AbstractC17067c.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160236b = AbstractC17067c.a.a("ty", "v");

    static C16263a b(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        C16263a c16263a = null;
        while (abstractC17067c.hasNext()) {
            if (abstractC17067c.l(f160235a) != 0) {
                abstractC17067c.m();
                abstractC17067c.skipValue();
            } else {
                abstractC17067c.b();
                while (abstractC17067c.hasNext()) {
                    C16263a c16263aA = a(abstractC17067c, c14209i);
                    if (c16263aA != null) {
                        c16263a = c16263aA;
                    }
                }
                abstractC17067c.d();
            }
        }
        return c16263a;
    }

    private static C16263a a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        abstractC17067c.c();
        C16263a c16263a = null;
        while (true) {
            boolean z10 = false;
            while (abstractC17067c.hasNext()) {
                int iL = abstractC17067c.l(f160236b);
                if (iL != 0) {
                    if (iL != 1) {
                        abstractC17067c.m();
                        abstractC17067c.skipValue();
                    } else if (z10) {
                        c16263a = new C16263a(C16893d.e(abstractC17067c, c14209i));
                    } else {
                        abstractC17067c.skipValue();
                    }
                } else if (abstractC17067c.nextInt() == 0) {
                    z10 = true;
                }
            }
            abstractC17067c.g();
            return c16263a;
        }
    }
}
