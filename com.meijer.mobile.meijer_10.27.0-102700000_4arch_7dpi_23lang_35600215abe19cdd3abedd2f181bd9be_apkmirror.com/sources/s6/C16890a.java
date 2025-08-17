package s6;

import android.graphics.PointF;
import g6.C14209i;
import java.io.IOException;
import java.util.ArrayList;
import o6.C15998b;
import t6.AbstractC17067c;
import v6.C17512a;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16890a {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160229a = AbstractC17067c.a.a("k", "x", "y");

    public static o6.e a(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (abstractC17067c.i() == AbstractC17067c.b.BEGIN_ARRAY) {
            abstractC17067c.b();
            while (abstractC17067c.hasNext()) {
                arrayList.add(z.a(abstractC17067c, c14209i));
            }
            abstractC17067c.d();
            u.b(arrayList);
        } else {
            arrayList.add(new C17512a(C16908s.e(abstractC17067c, u6.q.e())));
        }
        return new o6.e(arrayList);
    }

    static o6.o<PointF, PointF> b(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        abstractC17067c.c();
        o6.e eVarA = null;
        C15998b c15998bE = null;
        boolean z10 = false;
        C15998b c15998bE2 = null;
        while (abstractC17067c.i() != AbstractC17067c.b.END_OBJECT) {
            int iL = abstractC17067c.l(f160229a);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        abstractC17067c.m();
                        abstractC17067c.skipValue();
                    } else if (abstractC17067c.i() == AbstractC17067c.b.STRING) {
                        abstractC17067c.skipValue();
                        z10 = true;
                    } else {
                        c15998bE = C16893d.e(abstractC17067c, c14209i);
                    }
                } else if (abstractC17067c.i() == AbstractC17067c.b.STRING) {
                    abstractC17067c.skipValue();
                    z10 = true;
                } else {
                    c15998bE2 = C16893d.e(abstractC17067c, c14209i);
                }
            } else {
                eVarA = a(abstractC17067c, c14209i);
            }
        }
        abstractC17067c.g();
        if (z10) {
            c14209i.a("Lottie doesn't support expressions.");
        }
        if (eVarA != null) {
            return eVarA;
        }
        return new o6.i(c15998bE2, c15998bE);
    }
}
