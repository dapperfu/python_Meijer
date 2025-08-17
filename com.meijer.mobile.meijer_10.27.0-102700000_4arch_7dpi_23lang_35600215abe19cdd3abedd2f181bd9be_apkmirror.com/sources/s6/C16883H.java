package s6;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n6.C15781a;
import t6.AbstractC17067c;

/* renamed from: s6.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16883H implements InterfaceC16889N<p6.o> {

    /* renamed from: a, reason: collision with root package name */
    public static final C16883H f160221a = new C16883H();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160222b = AbstractC17067c.a.a("c", "v", "i", "o");

    private C16883H() {
    }

    @Override // s6.InterfaceC16889N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p6.o a(AbstractC17067c abstractC17067c, float f10) throws IOException {
        if (abstractC17067c.i() == AbstractC17067c.b.BEGIN_ARRAY) {
            abstractC17067c.b();
        }
        abstractC17067c.c();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zNextBoolean = false;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160222b);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            abstractC17067c.m();
                            abstractC17067c.skipValue();
                        } else {
                            listF3 = C16908s.f(abstractC17067c, f10);
                        }
                    } else {
                        listF2 = C16908s.f(abstractC17067c, f10);
                    }
                } else {
                    listF = C16908s.f(abstractC17067c, f10);
                }
            } else {
                zNextBoolean = abstractC17067c.nextBoolean();
            }
        }
        abstractC17067c.g();
        if (abstractC17067c.i() == AbstractC17067c.b.END_ARRAY) {
            abstractC17067c.d();
        }
        if (listF != null && listF2 != null && listF3 != null) {
            if (listF.isEmpty()) {
                return new p6.o(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = listF.size();
            PointF pointF = listF.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = listF.get(i10);
                int i11 = i10 - 1;
                arrayList.add(new C15781a(u6.l.a(listF.get(i11), listF3.get(i11)), u6.l.a(pointF2, listF2.get(i10)), pointF2));
            }
            if (zNextBoolean) {
                PointF pointF3 = listF.get(0);
                int i12 = size - 1;
                arrayList.add(new C15781a(u6.l.a(listF.get(i12), listF3.get(i12)), u6.l.a(pointF3, listF2.get(0)), pointF3));
            }
            return new p6.o(pointF, zNextBoolean, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
