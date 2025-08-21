package t6;

import java.io.IOException;
import u6.AbstractC17353c;

/* renamed from: t6.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C17201n {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162318a = AbstractC17353c.a.a("fFamily", "fName", "fStyle", "ascent");

    static o6.c a(AbstractC17353c abstractC17353c) throws IOException {
        abstractC17353c.c();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162318a);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            abstractC17353c.m();
                            abstractC17353c.skipValue();
                        } else {
                            fNextDouble = (float) abstractC17353c.nextDouble();
                        }
                    } else {
                        strNextString2 = abstractC17353c.nextString();
                    }
                } else {
                    strNextString3 = abstractC17353c.nextString();
                }
            } else {
                strNextString = abstractC17353c.nextString();
            }
        }
        abstractC17353c.g();
        return new o6.c(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
