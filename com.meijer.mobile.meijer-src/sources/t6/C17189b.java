package t6;

import h6.C14478i;
import java.io.IOException;
import java.util.Collections;
import p6.C16406a;
import p6.C16407b;
import p6.C16409d;
import u6.AbstractC17353c;
import w6.C17845a;

/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17189b {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162291a = AbstractC17353c.a.a("s", "a");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162292b = AbstractC17353c.a.a("s", "e", "o", "r");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17353c.a f162293c = AbstractC17353c.a.a("fc", "sc", "sw", "t", "o");

    public static p6.k a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        abstractC17353c.c();
        p6.m mVarC = null;
        p6.l lVarB = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162291a);
            if (iL != 0) {
                if (iL != 1) {
                    abstractC17353c.m();
                    abstractC17353c.skipValue();
                } else {
                    mVarC = c(abstractC17353c, c14478i);
                }
            } else {
                lVarB = b(abstractC17353c, c14478i);
            }
        }
        abstractC17353c.g();
        return new p6.k(mVarC, lVarB);
    }

    private static p6.l b(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        abstractC17353c.c();
        C16409d c16409d = null;
        C16409d c16409dH = null;
        C16409d c16409dH2 = null;
        q6.u uVar = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162292b);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            abstractC17353c.m();
                            abstractC17353c.skipValue();
                        } else {
                            int iNextInt = abstractC17353c.nextInt();
                            if (iNextInt != 1 && iNextInt != 2) {
                                c14478i.a("Unsupported text range units: " + iNextInt);
                                uVar = q6.u.INDEX;
                            } else if (iNextInt == 1) {
                                uVar = q6.u.PERCENT;
                            } else {
                                uVar = q6.u.INDEX;
                            }
                        }
                    } else {
                        c16409dH2 = C17191d.h(abstractC17353c, c14478i);
                    }
                } else {
                    c16409dH = C17191d.h(abstractC17353c, c14478i);
                }
            } else {
                c16409d = C17191d.h(abstractC17353c, c14478i);
            }
        }
        abstractC17353c.g();
        if (c16409d == null && c16409dH != null) {
            c16409d = new C16409d(Collections.singletonList(new C17845a(0)));
        }
        return new p6.l(c16409d, c16409dH, c16409dH2, uVar);
    }

    private static p6.m c(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        abstractC17353c.c();
        C16406a c16406aC = null;
        C16406a c16406aC2 = null;
        C16407b c16407bE = null;
        C16407b c16407bE2 = null;
        C16409d c16409dH = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162293c);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            if (iL != 4) {
                                abstractC17353c.m();
                                abstractC17353c.skipValue();
                            } else {
                                c16409dH = C17191d.h(abstractC17353c, c14478i);
                            }
                        } else {
                            c16407bE2 = C17191d.e(abstractC17353c, c14478i);
                        }
                    } else {
                        c16407bE = C17191d.e(abstractC17353c, c14478i);
                    }
                } else {
                    c16406aC2 = C17191d.c(abstractC17353c, c14478i);
                }
            } else {
                c16406aC = C17191d.c(abstractC17353c, c14478i);
            }
        }
        abstractC17353c.g();
        return new p6.m(c16406aC, c16406aC2, c16407bE, c16407bE2, c16409dH);
    }
}
