package s6;

import java.io.IOException;
import p6.j;
import t6.AbstractC17067c;

/* loaded from: classes4.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160280a = AbstractC17067c.a.a("nm", "mm", "hd");

    static p6.j a(AbstractC17067c abstractC17067c) throws IOException {
        String strNextString = null;
        boolean zNextBoolean = false;
        j.a aVarB = null;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160280a);
            if (iL == 0) {
                strNextString = abstractC17067c.nextString();
            } else if (iL == 1) {
                aVarB = j.a.b(abstractC17067c.nextInt());
            } else if (iL != 2) {
                abstractC17067c.m();
                abstractC17067c.skipValue();
            } else {
                zNextBoolean = abstractC17067c.nextBoolean();
            }
        }
        return new p6.j(strNextString, aVarB, zNextBoolean);
    }
}
