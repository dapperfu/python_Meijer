package t6;

import h6.C14478i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k6.C15101i;
import u6.AbstractC17353c;
import w6.C17845a;

/* loaded from: classes4.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC17353c.a f162332a = AbstractC17353c.a.a("k");

    static <T> List<C17845a<T>> a(AbstractC17353c abstractC17353c, C14478i c14478i, float f10, N<T> n10, boolean z10) throws IOException {
        AbstractC17353c abstractC17353c2;
        C14478i c14478i2;
        float f11;
        N<T> n11;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (abstractC17353c.i() == AbstractC17353c.b.STRING) {
            c14478i.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC17353c.c();
        while (abstractC17353c.hasNext()) {
            if (abstractC17353c.l(f162332a) != 0) {
                abstractC17353c.skipValue();
            } else if (abstractC17353c.i() == AbstractC17353c.b.BEGIN_ARRAY) {
                abstractC17353c.b();
                if (abstractC17353c.i() == AbstractC17353c.b.NUMBER) {
                    AbstractC17353c abstractC17353c3 = abstractC17353c;
                    C14478i c14478i3 = c14478i;
                    float f12 = f10;
                    N<T> n12 = n10;
                    boolean z12 = z10;
                    C17845a c17845aC = t.c(abstractC17353c3, c14478i3, f12, n12, false, z12);
                    abstractC17353c2 = abstractC17353c3;
                    c14478i2 = c14478i3;
                    f11 = f12;
                    n11 = n12;
                    z11 = z12;
                    arrayList.add(c17845aC);
                } else {
                    abstractC17353c2 = abstractC17353c;
                    c14478i2 = c14478i;
                    f11 = f10;
                    n11 = n10;
                    z11 = z10;
                    while (abstractC17353c2.hasNext()) {
                        arrayList.add(t.c(abstractC17353c2, c14478i2, f11, n11, true, z11));
                    }
                }
                abstractC17353c2.d();
                abstractC17353c = abstractC17353c2;
                c14478i = c14478i2;
                f10 = f11;
                n10 = n11;
                z10 = z11;
            } else {
                AbstractC17353c abstractC17353c4 = abstractC17353c;
                arrayList.add(t.c(abstractC17353c4, c14478i, f10, n10, false, z10));
                abstractC17353c = abstractC17353c4;
            }
        }
        abstractC17353c.g();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends C17845a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            C17845a<T> c17845a = list.get(i11);
            i11++;
            C17845a<T> c17845a2 = list.get(i11);
            c17845a.f166951h = Float.valueOf(c17845a2.f166950g);
            if (c17845a.f166946c == null && (t10 = c17845a2.f166945b) != null) {
                c17845a.f166946c = t10;
                if (c17845a instanceof C15101i) {
                    ((C15101i) c17845a).j();
                }
            }
        }
        C17845a<T> c17845a3 = list.get(i10);
        if ((c17845a3.f166945b == null || c17845a3.f166946c == null) && list.size() > 1) {
            list.remove(c17845a3);
        }
    }
}
