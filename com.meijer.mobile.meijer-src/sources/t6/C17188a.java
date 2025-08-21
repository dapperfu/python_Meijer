package t6;

import android.graphics.PointF;
import h6.C14478i;
import java.io.IOException;
import java.util.ArrayList;
import p6.C16407b;
import u6.AbstractC17353c;
import w6.C17845a;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17188a {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162290a = AbstractC17353c.a.a("k", "x", "y");

    public static p6.e a(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (abstractC17353c.i() == AbstractC17353c.b.BEGIN_ARRAY) {
            abstractC17353c.b();
            while (abstractC17353c.hasNext()) {
                arrayList.add(z.a(abstractC17353c, c14478i));
            }
            abstractC17353c.d();
            u.b(arrayList);
        } else {
            arrayList.add(new C17845a(s.e(abstractC17353c, v6.q.e())));
        }
        return new p6.e(arrayList);
    }

    static p6.o<PointF, PointF> b(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        abstractC17353c.c();
        p6.e eVarA = null;
        C16407b c16407bE = null;
        boolean z10 = false;
        C16407b c16407bE2 = null;
        while (abstractC17353c.i() != AbstractC17353c.b.END_OBJECT) {
            int iL = abstractC17353c.l(f162290a);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        abstractC17353c.m();
                        abstractC17353c.skipValue();
                    } else if (abstractC17353c.i() == AbstractC17353c.b.STRING) {
                        abstractC17353c.skipValue();
                        z10 = true;
                    } else {
                        c16407bE = C17191d.e(abstractC17353c, c14478i);
                    }
                } else if (abstractC17353c.i() == AbstractC17353c.b.STRING) {
                    abstractC17353c.skipValue();
                    z10 = true;
                } else {
                    c16407bE2 = C17191d.e(abstractC17353c, c14478i);
                }
            } else {
                eVarA = a(abstractC17353c, c14478i);
            }
        }
        abstractC17353c.g();
        if (z10) {
            c14478i.a("Lottie doesn't support expressions.");
        }
        if (eVarA != null) {
            return eVarA;
        }
        return new p6.i(c16407bE2, c16407bE);
    }
}
