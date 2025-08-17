package s6;

import g6.C14209i;
import java.io.IOException;
import java.util.ArrayList;
import t6.AbstractC17067c;

/* renamed from: s6.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16885J {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160224a = AbstractC17067c.a.a("nm", "hd", "it");

    static p6.q a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160224a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                zNextBoolean = abstractC17067c.nextBoolean();
            } else if (iL != 2) {
                abstractC17067c.skipValue();
            } else {
                abstractC17067c.b();
                while (abstractC17067c.hasNext()) {
                    p6.c cVarA = C16897h.a(abstractC17067c, c14209i);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                abstractC17067c.d();
            }
        }
        return new p6.q(strNextString, arrayList, zNextBoolean);
    }
}
