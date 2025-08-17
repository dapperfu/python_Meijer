package J;

import F.InterfaceC3627y;
import G.a;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f14469a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14470b;

    /* renamed from: c, reason: collision with root package name */
    private final Rational f14471c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14472d;

    private Size d(q qVar) {
        return a(qVar.N(null), qVar.F(0), this.f14470b, this.f14469a);
    }

    private static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : i.k(list)) {
            if (G.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    j(InterfaceC3627y interfaceC3627y, Rational rational) {
        this.f14469a = interfaceC3627y.a();
        this.f14470b = interfaceC3627y.getLensFacing();
        this.f14471c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f14472d = z10;
    }

    private Rational c(q qVar, List<Size> list) {
        if (qVar.z()) {
            return i.n(qVar.C(), this.f14472d);
        }
        Size sizeD = d(qVar);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    private static boolean e(int i10, int i11, int i12) {
        boolean z10;
        int iB = G.c.b(i10);
        if (1 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        int iA = G.c.a(iB, i12, z10);
        if (iA != 90 && iA != 270) {
            return false;
        }
        return true;
    }

    List<Size> f(List<Size> list, D<?> d10) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new G.d(true));
        ArrayList arrayList2 = new ArrayList();
        q qVar = (q) d10;
        Size sizeJ = qVar.j(null);
        Size size = (Size) arrayList.get(0);
        if (sizeJ == null || N.c.b(size) < N.c.b(sizeJ)) {
            sizeJ = size;
        }
        Size sizeD = d(qVar);
        Size size2 = N.c.f21258c;
        int iB = N.c.b(size2);
        if (N.c.b(sizeJ) < iB) {
            size2 = N.c.f21256a;
        } else if (sizeD != null && N.c.b(sizeD) < iB) {
            size2 = sizeD;
        }
        for (Size size3 : arrayList) {
            if (N.c.b(size3) <= N.c.b(sizeJ) && N.c.b(size3) >= N.c.b(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (!arrayList2.isEmpty()) {
            Rational rationalC = c(qVar, arrayList2);
            if (sizeD == null) {
                sizeD = qVar.J(null);
            }
            ArrayList arrayList3 = new ArrayList();
            new HashMap();
            if (rationalC == null) {
                arrayList3.addAll(arrayList2);
                if (sizeD != null) {
                    i.q(arrayList3, sizeD, true);
                    return arrayList3;
                }
            } else {
                Map<Rational, List<Size>> mapO = i.o(arrayList2);
                if (sizeD != null) {
                    Iterator<Rational> it = mapO.keySet().iterator();
                    while (it.hasNext()) {
                        i.q(mapO.get(it.next()), sizeD, true);
                    }
                }
                ArrayList arrayList4 = new ArrayList(mapO.keySet());
                Collections.sort(arrayList4, new a.C0157a(rationalC, this.f14471c));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    for (Size size4 : mapO.get((Rational) it2.next())) {
                        if (!arrayList3.contains(size4)) {
                            arrayList3.add(size4);
                        }
                    }
                }
            }
            return arrayList3;
        }
        throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeJ + "\ninitial size list: " + arrayList);
    }
}
