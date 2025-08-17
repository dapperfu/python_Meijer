package s6;

import g6.C14209i;
import java.io.IOException;
import java.util.Collections;
import o6.C15997a;
import o6.C15998b;
import o6.C16000d;
import t6.AbstractC17067c;
import v6.C17512a;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16891b {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160230a = AbstractC17067c.a.a("s", "a");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160231b = AbstractC17067c.a.a("s", "e", "o", "r");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17067c.a f160232c = AbstractC17067c.a.a("fc", "sc", "sw", "t", "o");

    public static o6.k a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        abstractC17067c.c();
        o6.m mVarC = null;
        o6.l lVarB = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160230a);
            if (iL != 0) {
                if (iL != 1) {
                    abstractC17067c.m();
                    abstractC17067c.skipValue();
                } else {
                    mVarC = c(abstractC17067c, c14209i);
                }
            } else {
                lVarB = b(abstractC17067c, c14209i);
            }
        }
        abstractC17067c.g();
        return new o6.k(mVarC, lVarB);
    }

    private static o6.l b(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        abstractC17067c.c();
        C16000d c16000d = null;
        C16000d c16000dH = null;
        C16000d c16000dH2 = null;
        p6.u uVar = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160231b);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            abstractC17067c.m();
                            abstractC17067c.skipValue();
                        } else {
                            int iNextInt = abstractC17067c.nextInt();
                            if (iNextInt != 1 && iNextInt != 2) {
                                c14209i.a("Unsupported text range units: " + iNextInt);
                                uVar = p6.u.INDEX;
                            } else if (iNextInt == 1) {
                                uVar = p6.u.PERCENT;
                            } else {
                                uVar = p6.u.INDEX;
                            }
                        }
                    } else {
                        c16000dH2 = C16893d.h(abstractC17067c, c14209i);
                    }
                } else {
                    c16000dH = C16893d.h(abstractC17067c, c14209i);
                }
            } else {
                c16000d = C16893d.h(abstractC17067c, c14209i);
            }
        }
        abstractC17067c.g();
        if (c16000d == null && c16000dH != null) {
            c16000d = new C16000d(Collections.singletonList(new C17512a(0)));
        }
        return new o6.l(c16000d, c16000dH, c16000dH2, uVar);
    }

    private static o6.m c(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        abstractC17067c.c();
        C15997a c15997aC = null;
        C15997a c15997aC2 = null;
        C15998b c15998bE = null;
        C15998b c15998bE2 = null;
        C16000d c16000dH = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160232c);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            if (iL != 4) {
                                abstractC17067c.m();
                                abstractC17067c.skipValue();
                            } else {
                                c16000dH = C16893d.h(abstractC17067c, c14209i);
                            }
                        } else {
                            c15998bE2 = C16893d.e(abstractC17067c, c14209i);
                        }
                    } else {
                        c15998bE = C16893d.e(abstractC17067c, c14209i);
                    }
                } else {
                    c15997aC2 = C16893d.c(abstractC17067c, c14209i);
                }
            } else {
                c15997aC = C16893d.c(abstractC17067c, c14209i);
            }
        }
        abstractC17067c.g();
        return new o6.m(c15997aC, c15997aC2, c15998bE, c15998bE2, c16000dH);
    }
}
