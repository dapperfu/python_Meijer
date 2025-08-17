package s6;

import java.io.IOException;
import t6.AbstractC17067c;

/* renamed from: s6.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16903n {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160257a = AbstractC17067c.a.a("fFamily", "fName", "fStyle", "ascent");

    static n6.c a(AbstractC17067c abstractC17067c) throws IOException {
        abstractC17067c.c();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160257a);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            abstractC17067c.m();
                            abstractC17067c.skipValue();
                        } else {
                            fNextDouble = (float) abstractC17067c.nextDouble();
                        }
                    } else {
                        strNextString2 = abstractC17067c.nextString();
                    }
                } else {
                    strNextString3 = abstractC17067c.nextString();
                }
            } else {
                strNextString = abstractC17067c.nextString();
            }
        }
        abstractC17067c.g();
        return new n6.c(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
