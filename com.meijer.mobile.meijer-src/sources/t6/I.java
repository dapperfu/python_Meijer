package t6;

import android.graphics.Path;
import h6.C14478i;
import java.io.IOException;
import java.util.Collections;
import p6.C16406a;
import p6.C16409d;
import u6.AbstractC17353c;
import w6.C17845a;

/* loaded from: classes4.dex */
class I {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162284a = AbstractC17353c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static q6.p a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        C16409d c16409d = null;
        String strNextString = null;
        C16406a c16406aC = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162284a);
            if (iL == 0) {
                strNextString = abstractC17353c.nextString();
            } else if (iL == 1) {
                c16406aC = C17191d.c(abstractC17353c, c14478i);
            } else if (iL == 2) {
                c16409d = C17191d.h(abstractC17353c, c14478i);
            } else if (iL == 3) {
                zNextBoolean = abstractC17353c.nextBoolean();
            } else if (iL == 4) {
                iNextInt = abstractC17353c.nextInt();
            } else if (iL != 5) {
                abstractC17353c.m();
                abstractC17353c.skipValue();
            } else {
                zNextBoolean2 = abstractC17353c.nextBoolean();
            }
        }
        if (c16409d == null) {
            c16409d = new C16409d(Collections.singletonList(new C17845a(100)));
        }
        return new q6.p(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c16406aC, c16409d, zNextBoolean2);
    }
}
