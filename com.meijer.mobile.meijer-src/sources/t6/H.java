package t6;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o6.C16075a;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
public class H implements N<q6.o> {

    /* renamed from: a, reason: collision with root package name */
    public static final H f162282a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162283b = AbstractC17353c.a.a("c", "v", "i", "o");

    private H() {
    }

    @Override // t6.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q6.o a(AbstractC17353c abstractC17353c, float f10) throws IOException {
        if (abstractC17353c.i() == AbstractC17353c.b.BEGIN_ARRAY) {
            abstractC17353c.b();
        }
        abstractC17353c.c();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zNextBoolean = false;
        while (abstractC17353c.hasNext()) {
            int iL = abstractC17353c.l(f162283b);
            if (iL != 0) {
                if (iL != 1) {
                    if (iL != 2) {
                        if (iL != 3) {
                            abstractC17353c.m();
                            abstractC17353c.skipValue();
                        } else {
                            listF3 = s.f(abstractC17353c, f10);
                        }
                    } else {
                        listF2 = s.f(abstractC17353c, f10);
                    }
                } else {
                    listF = s.f(abstractC17353c, f10);
                }
            } else {
                zNextBoolean = abstractC17353c.nextBoolean();
            }
        }
        abstractC17353c.g();
        if (abstractC17353c.i() == AbstractC17353c.b.END_ARRAY) {
            abstractC17353c.d();
        }
        if (listF != null && listF2 != null && listF3 != null) {
            if (listF.isEmpty()) {
                return new q6.o(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = listF.size();
            PointF pointF = listF.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = listF.get(i10);
                int i11 = i10 - 1;
                arrayList.add(new C16075a(v6.l.a(listF.get(i11), listF3.get(i11)), v6.l.a(pointF2, listF2.get(i10)), pointF2));
            }
            if (zNextBoolean) {
                PointF pointF3 = listF.get(0);
                int i12 = size - 1;
                arrayList.add(new C16075a(v6.l.a(listF.get(i12), listF3.get(i12)), v6.l.a(pointF3, listF2.get(0)), pointF3));
            }
            return new q6.o(pointF, zNextBoolean, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
