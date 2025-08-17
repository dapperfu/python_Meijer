package s6;

import android.graphics.Path;
import g6.C14209i;
import java.io.IOException;
import java.util.Collections;
import o6.C15997a;
import o6.C16000d;
import t6.AbstractC17067c;
import v6.C17512a;

/* renamed from: s6.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16884I {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160223a = AbstractC17067c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static p6.p a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        C16000d c16000d = null;
        String strNextString = null;
        C15997a c15997aC = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160223a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                c15997aC = C16893d.c(abstractC17067c, c14209i);
            } else if (iL == 2) {
                c16000d = C16893d.h(abstractC17067c, c14209i);
            } else if (iL == 3) {
                zNextBoolean = abstractC17067c.nextBoolean();
            } else if (iL == 4) {
                iNextInt = abstractC17067c.nextInt();
            } else if (iL != 5) {
                abstractC17067c.m();
                abstractC17067c.skipValue();
            } else {
                zNextBoolean2 = abstractC17067c.nextBoolean();
            }
        }
        if (c16000d == null) {
            c16000d = new C16000d(Collections.singletonList(new C17512a(100)));
        }
        return new p6.p(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c15997aC, c16000d, zNextBoolean2);
    }
}
