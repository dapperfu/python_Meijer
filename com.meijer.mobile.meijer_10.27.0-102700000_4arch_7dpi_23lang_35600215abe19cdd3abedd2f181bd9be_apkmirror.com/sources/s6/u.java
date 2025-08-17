package s6;

import g6.C14209i;
import j6.C14869i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import t6.AbstractC17067c;
import v6.C17512a;

/* loaded from: classes4.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC17067c.a f160271a = AbstractC17067c.a.a("k");

    static <T> List<C17512a<T>> a(AbstractC17067c abstractC17067c, C14209i c14209i, float f10, InterfaceC16889N<T> interfaceC16889N, boolean z10) throws IOException {
        AbstractC17067c abstractC17067c2;
        C14209i c14209i2;
        float f11;
        InterfaceC16889N<T> interfaceC16889N2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (abstractC17067c.i() == AbstractC17067c.b.STRING) {
            c14209i.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC17067c.c();
        while (abstractC17067c.hasNext()) {
            if (abstractC17067c.l(f160271a) != 0) {
                abstractC17067c.skipValue();
            } else if (abstractC17067c.i() == AbstractC17067c.b.BEGIN_ARRAY) {
                abstractC17067c.b();
                if (abstractC17067c.i() == AbstractC17067c.b.NUMBER) {
                    AbstractC17067c abstractC17067c3 = abstractC17067c;
                    C14209i c14209i3 = c14209i;
                    float f12 = f10;
                    InterfaceC16889N<T> interfaceC16889N3 = interfaceC16889N;
                    boolean z12 = z10;
                    C17512a c17512aC = t.c(abstractC17067c3, c14209i3, f12, interfaceC16889N3, false, z12);
                    abstractC17067c2 = abstractC17067c3;
                    c14209i2 = c14209i3;
                    f11 = f12;
                    interfaceC16889N2 = interfaceC16889N3;
                    z11 = z12;
                    arrayList.add(c17512aC);
                } else {
                    abstractC17067c2 = abstractC17067c;
                    c14209i2 = c14209i;
                    f11 = f10;
                    interfaceC16889N2 = interfaceC16889N;
                    z11 = z10;
                    while (abstractC17067c2.hasNext()) {
                        arrayList.add(t.c(abstractC17067c2, c14209i2, f11, interfaceC16889N2, true, z11));
                    }
                }
                abstractC17067c2.d();
                abstractC17067c = abstractC17067c2;
                c14209i = c14209i2;
                f10 = f11;
                interfaceC16889N = interfaceC16889N2;
                z10 = z11;
            } else {
                AbstractC17067c abstractC17067c4 = abstractC17067c;
                arrayList.add(t.c(abstractC17067c4, c14209i, f10, interfaceC16889N, false, z10));
                abstractC17067c = abstractC17067c4;
            }
        }
        abstractC17067c.g();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends C17512a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            C17512a<T> c17512a = list.get(i11);
            i11++;
            C17512a<T> c17512a2 = list.get(i11);
            c17512a.f164567h = Float.valueOf(c17512a2.f164566g);
            if (c17512a.f164562c == null && (t10 = c17512a2.f164561b) != null) {
                c17512a.f164562c = t10;
                if (c17512a instanceof C14869i) {
                    ((C14869i) c17512a).j();
                }
            }
        }
        C17512a<T> c17512a3 = list.get(i10);
        if ((c17512a3.f164561b == null || c17512a3.f164562c == null) && list.size() > 1) {
            list.remove(c17512a3);
        }
    }
}
