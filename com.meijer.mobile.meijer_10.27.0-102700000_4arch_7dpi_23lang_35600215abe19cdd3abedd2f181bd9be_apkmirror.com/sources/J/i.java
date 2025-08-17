package J;

import C.P;
import F.InterfaceC3627y;
import G.a;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3627y f14464a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14465b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14466c;

    /* renamed from: d, reason: collision with root package name */
    private final Rational f14467d;

    /* renamed from: e, reason: collision with root package name */
    private final j f14468e;

    private static LinkedHashMap<Rational, List<Size>> b(Map<Rational, List<Size>> map, R.a aVar, Rational rational) {
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        Rational rationalN = n(aVar.b(), z10);
        if (aVar.a() == 0) {
            Rational rationalN2 = n(aVar.b(), z10);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational2 = (Rational) it.next();
                if (!rational2.equals(rationalN2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a.C0157a(rationalN, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    private List<Size> l(List<Pair<Integer, Size[]>> list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    static Rational n(int i10, boolean z10) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return z10 ? G.a.f11137a : G.a.f11138b;
        }
        if (i10 == 1) {
            return z10 ? G.a.f11139c : G.a.f11140d;
        }
        P.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        return null;
    }

    public List<Size> m(D<?> d10) {
        q qVar = (q) d10;
        List<Size> listI = qVar.I(null);
        if (listI != null) {
            return listI;
        }
        R.c cVarD = qVar.D(null);
        List<Size> listJ = j(qVar.l(null), d10.n());
        if (cVarD == null) {
            return this.f14468e.f(listJ, d10);
        }
        Size sizeJ = ((q) d10).j(null);
        int iF = qVar.F(0);
        if (!d10.U(false)) {
            listJ = c(listJ, cVarD, d10.n());
        }
        return p(qVar.m(), listJ, sizeJ, iF, this.f14467d, this.f14465b, this.f14466c);
    }

    private static List<Size> e(List<Size> list, R.b bVar, int i10, int i11, int i12) {
        if (bVar == null) {
            return list;
        }
        List<Size> listA = bVar.a(new ArrayList(list), G.c.a(G.c.b(i10), i11, i12 == 1));
        if (list.containsAll(listA)) {
            return listA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(LinkedHashMap<Rational, List<Size>> linkedHashMap, R.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g(linkedHashMap.get(it.next()), dVar);
        }
    }

    private Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(InterfaceC3627y interfaceC3627y) {
        List<Size> listE = interfaceC3627y.e(256);
        if (listE.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listE, new G.d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    static List<Rational> k(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G.a.f11137a);
        arrayList.add(G.a.f11139c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (G.a.a(size, (Rational) it.next())) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    static Map<Rational, List<Size>> o(List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = k(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (G.a.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    static void q(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void r(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public i(InterfaceC3627y interfaceC3627y, Size size) {
        Rational rationalI;
        this.f14464a = interfaceC3627y;
        this.f14465b = interfaceC3627y.a();
        this.f14466c = interfaceC3627y.getLensFacing();
        if (size != null) {
            rationalI = h(size);
        } else {
            rationalI = i(interfaceC3627y);
        }
        this.f14467d = rationalI;
        this.f14468e = new j(interfaceC3627y, rationalI);
    }

    private static LinkedHashMap<Rational, List<Size>> a(List<Size> list, R.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    private List<Size> c(List<Size> list, R.c cVar, int i10) {
        if (cVar.a() == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(this.f14464a.c(i10));
            Collections.sort(arrayList, new G.d(true));
            return arrayList;
        }
        return list;
    }

    private static void d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int iB = N.c.b(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (N.c.b(size2) <= iB) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static void g(List<Size> list, R.d dVar) {
        if (!list.isEmpty()) {
            int iB = dVar.b();
            if (!dVar.equals(R.d.f31506c)) {
                Size sizeA = dVar.a();
                if (iB != 0) {
                    if (iB != 1) {
                        if (iB != 2) {
                            if (iB != 3) {
                                if (iB != 4) {
                                    return;
                                }
                                r(list, sizeA, false);
                                return;
                            }
                            r(list, sizeA, true);
                            return;
                        }
                        q(list, sizeA, false);
                        return;
                    }
                    q(list, sizeA, true);
                    return;
                }
                s(list, sizeA);
            }
        }
    }

    private List<Size> j(List<Pair<Integer, Size[]>> list, int i10) {
        List<Size> listL = l(list, i10);
        if (listL == null) {
            listL = this.f14464a.e(i10);
        }
        ArrayList arrayList = new ArrayList(listL);
        Collections.sort(arrayList, new G.d(true));
        if (arrayList.isEmpty()) {
            P.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    public static List<Size> p(R.c cVar, List<Size> list, Size size, int i10, Rational rational, int i11, int i12) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapA = a(list, cVar.b(), rational);
        if (size != null) {
            d(linkedHashMapA, size);
        }
        f(linkedHashMapA, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i10, i11, i12);
    }

    private static void s(List<Size> list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }
}
