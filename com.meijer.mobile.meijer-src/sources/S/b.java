package S;

import C.P;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    private static final double f34228h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a, reason: collision with root package name */
    private final Size f34229a;

    /* renamed from: b, reason: collision with root package name */
    private final Rational f34230b;

    /* renamed from: c, reason: collision with root package name */
    private final Rational f34231c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<D<?>> f34232d;

    /* renamed from: e, reason: collision with root package name */
    private final J.i f34233e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3289y f34234f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<D<?>, List<Size>> f34235g;

    private static class a implements Comparator<Rational> {

        /* renamed from: a, reason: collision with root package name */
        private final Rational f34236a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34237b;

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fC = b.c(rational, this.f34236a);
            float fC2 = b.c(rational2, this.f34236a);
            return this.f34237b ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }

        a(Rational rational, boolean z10) {
            this.f34236a = rational;
            this.f34237b = z10;
        }
    }

    b(InterfaceC3290z interfaceC3290z, Set<D<?>> set) {
        this(G.p.m(interfaceC3290z.c().c()), interfaceC3290z.i(), set);
    }

    private boolean B(Rational rational, Size size) {
        if (this.f34230b.equals(rational) || G.a.a(size, rational)) {
            return false;
        }
        return b(this.f34230b.floatValue(), rational.floatValue(), N(size).floatValue());
    }

    static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private List<Size> H(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f34230b, list, false));
        }
        arrayList.addAll(I(this.f34231c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            P.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        P.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private boolean J() {
        boolean z10;
        R.c cVarD;
        Iterator<D<?>> it = this.f34232d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            D<?> next = it.next();
            if (!next.U(false) && (next instanceof q) && (cVarD = ((q) next).D(null)) != null) {
                z10 = true;
                if (cVarD.a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    private void K(List<Rational> list) {
        Collections.sort(list, new a(M(this.f34229a), true));
    }

    static void L(List<Size> list) {
        Collections.sort(list, new G.d(true));
    }

    private static Rational M(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational N(Size size) {
        Rational rational = G.a.f11062a;
        if (G.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = G.a.f11064c;
        return G.a.a(size, rational2) ? rational2 : M(size);
    }

    private boolean b(float f10, float f11, float f12) {
        if (f10 != f11 && f11 != f12) {
            if (f10 > f11) {
                return f11 < f12;
            }
            if (f11 > f12) {
                return true;
            }
        }
        return false;
    }

    private List<Size> d(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List<Size> e(List<Size> list) {
        Rational rationalM;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalM = null;
                    break;
                }
                rationalM = (Rational) it.next();
                if (G.a.a(size, rationalM)) {
                    break;
                }
            }
            if (rationalM != null) {
                Size size2 = (Size) map.get(rationalM);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalM = M(size);
            }
            arrayList.add(size);
            map.put(rationalM, size);
        }
        return arrayList;
    }

    static List<Size> g(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (G.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private List<Size> i() {
        return this.f34234f.c(34);
    }

    private List<Size> j() {
        return this.f34234f.e(34);
    }

    private Set<Size> l() {
        HashSet hashSet = new HashSet();
        Iterator<D<?>> it = this.f34232d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v(it.next()));
        }
        return hashSet;
    }

    private static Rational n(Rational rational) {
        Rational rational2 = G.a.f11062a;
        if (rational.equals(rational2)) {
            return G.a.f11064c;
        }
        if (rational.equals(G.a.f11064c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    private Pair<Rect, Size> t(Rect rect, D<?> d10, boolean z10) {
        Size sizeQ;
        if (z10) {
            sizeQ = r(G.p.m(rect), d10);
        } else {
            Size sizeM = G.p.m(rect);
            sizeQ = q(sizeM, d10);
            rect = m(sizeM, sizeQ);
        }
        return new Pair<>(rect, sizeQ);
    }

    private List<Size> v(D<?> d10) {
        if (!this.f34232d.contains(d10)) {
            throw new IllegalArgumentException("Invalid child config: " + d10);
        }
        if (this.f34235g.containsKey(d10)) {
            List<Size> list = this.f34235g.get(d10);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listE = e(this.f34233e.m(d10));
        this.f34235g.put(d10, listE);
        return listE;
    }

    private Map<Rational, List<Size>> x(List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = G.a.f11062a;
        map.put(rational, new ArrayList());
        Rational rational2 = G.a.f11064c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it.next();
                    if (G.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM = M(size);
                    arrayList2.add(rationalM);
                    map.put(rationalM, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    private static boolean A(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!y(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean C(Size size, Size size2) {
        return B(N(size), size2);
    }

    private boolean D() {
        Iterator<Size> it = l().iterator();
        while (it.hasNext()) {
            if (!G.a.a(it.next(), this.f34231c)) {
                return true;
            }
        }
        return false;
    }

    private static List<Size> E(List<Size> list) {
        if (list.isEmpty()) {
            return list;
        }
        return new ArrayList(new LinkedHashSet(list));
    }

    private List<Size> G(List<Size> list, boolean z10) {
        Map<Rational, List<Size>> mapX = x(list);
        ArrayList arrayList = new ArrayList(mapX.keySet());
        K(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(G.a.f11064c) && !rational.equals(G.a.f11062a)) {
                List<Size> list2 = mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    private List<Size> I(Rational rational, List<Size> list, boolean z10) {
        List<Size> listG = g(rational, list);
        L(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator<D<?>> it = this.f34232d.iterator();
        while (it.hasNext()) {
            List<Size> listV = v(it.next());
            if (!z10) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 / fFloatValue;
        }
        return fFloatValue / fFloatValue2;
    }

    static List<Size> f(Collection<Size> collection, List<Size> list) {
        if (!collection.isEmpty() && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Size size : list) {
                if (A(collection, size)) {
                    arrayList.add(size);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private static Rational h(Size size) {
        if (size.getWidth() / size.getHeight() > f34228h) {
            return G.a.f11064c;
        }
        return G.a.f11062a;
    }

    private static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM = M(size);
        if (rational.floatValue() == rationalM.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalM.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rational.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rational.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    static Rect m(Size size, Size size2) {
        return k(M(size2), size);
    }

    static List<Size> p(Collection<Size> collection, List<Size> list) {
        if (!collection.isEmpty() && !list.isEmpty()) {
            List<Size> listE = E(list);
            ArrayList arrayList = new ArrayList();
            for (Size size : listE) {
                if (z(collection, size)) {
                    arrayList.add(size);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private static Rational u(Size size) {
        Rational rationalH = h(size);
        P.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    private static List<Size> w(List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    static boolean y(Size size, Size size2) {
        if (size.getHeight() <= size2.getHeight() && size.getWidth() <= size2.getWidth()) {
            return false;
        }
        return true;
    }

    private static boolean z(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (y(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    List<Size> o(r rVar) {
        List<Size> listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) rVar.h(q.f47682u, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    Size q(Size size, D<?> d10) {
        List<Size> listV = v(d10);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    Size r(Size size, D<?> d10) {
        Iterator<Size> it = v(d10).iterator();
        while (it.hasNext()) {
            Size sizeM = G.p.m(m(it.next(), size));
            if (!y(sizeM, size)) {
                return sizeM;
            }
        }
        return size;
    }

    Pair<Rect, Size> s(D<?> d10, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (G.p.i(i10)) {
            rect = F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        Pair<Rect, Size> pairT = t(rect, d10, z10);
        Rect rectF = (Rect) pairT.first;
        Size sizeN = (Size) pairT.second;
        if (z11) {
            sizeN = G.p.n(sizeN);
            rectF = F(rectF);
        }
        return new Pair<>(rectF, sizeN);
    }

    private b(Size size, InterfaceC3289y interfaceC3289y, Set<D<?>> set) {
        this(size, interfaceC3289y, set, new J.i(interfaceC3289y, size));
    }

    b(Size size, InterfaceC3289y interfaceC3289y, Set<D<?>> set, J.i iVar) {
        this.f34235g = new HashMap();
        this.f34229a = size;
        Rational rationalU = u(size);
        this.f34230b = rationalU;
        this.f34231c = n(rationalU);
        this.f34234f = interfaceC3289y;
        this.f34232d = set;
        this.f34233e = iVar;
    }
}
