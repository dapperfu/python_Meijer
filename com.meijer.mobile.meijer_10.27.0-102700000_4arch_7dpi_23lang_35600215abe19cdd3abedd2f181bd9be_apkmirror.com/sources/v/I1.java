package v;

import C.C2979w;
import F.v0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AbstractC5650a;
import androidx.camera.core.impl.x;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.C18326f;
import z.C18341u;
import z.C18345y;

/* loaded from: classes.dex */
final class I1 {

    /* renamed from: i, reason: collision with root package name */
    private final String f163703i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC17374f f163704j;

    /* renamed from: k, reason: collision with root package name */
    private final w.B f163705k;

    /* renamed from: l, reason: collision with root package name */
    private final C18326f f163706l;

    /* renamed from: m, reason: collision with root package name */
    private final int f163707m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f163708n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f163709o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f163710p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f163711q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f163712r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f163713s;

    /* renamed from: t, reason: collision with root package name */
    F.w0 f163714t;

    /* renamed from: v, reason: collision with root package name */
    private final C17385i1 f163716v;

    /* renamed from: y, reason: collision with root package name */
    private final C17388j1 f163719y;

    /* renamed from: a, reason: collision with root package name */
    private final List<F.u0> f163695a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<F.u0> f163696b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<F.u0> f163697c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<F.u0> f163698d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Map<b, List<F.u0>> f163699e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final List<F.u0> f163700f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List<F.u0> f163701g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<F.u0> f163702h = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    List<Integer> f163715u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private final C18345y f163717w = new C18345y();

    /* renamed from: x, reason: collision with root package name */
    private final C18341u f163718x = new C18341u();

    static abstract class b {
        abstract int a();

        abstract int b();

        abstract boolean c();

        abstract boolean d();

        static b e(int i10, int i11, boolean z10, boolean z11) {
            return new C17371e(i10, i11, z10, z11);
        }

        b() {
        }
    }

    private void b() {
    }

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    private List<F.u0> B(b bVar) {
        if (this.f163699e.containsKey(bVar)) {
            return this.f163699e.get(bVar);
        }
        List<F.u0> arrayList = new ArrayList<>();
        if (bVar.d()) {
            if (bVar.a() == 0) {
                arrayList.addAll(this.f163701g);
            }
        } else if (bVar.b() == 8) {
            int iA = bVar.a();
            if (iA == 1) {
                arrayList = this.f163697c;
            } else if (iA != 2) {
                arrayList.addAll(bVar.c() ? this.f163698d : this.f163695a);
            } else {
                arrayList.addAll(this.f163696b);
                arrayList.addAll(this.f163695a);
            }
        } else if (bVar.b() == 10 && bVar.a() == 0) {
            arrayList.addAll(this.f163700f);
        }
        this.f163699e.put(bVar, arrayList);
        return arrayList;
    }

    private Pair<List<F.v0>, Integer> C(int i10, List<AbstractC5650a> list, List<Size> list2, List<androidx.camera.core.impl.D<?>> list3, List<Integer> list4, int i11, Map<Integer, AbstractC5650a> map, Map<Integer, androidx.camera.core.impl.D<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5650a abstractC5650a : list) {
            arrayList.add(abstractC5650a.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC5650a);
            }
        }
        for (int i12 = 0; i12 < list2.size(); i12++) {
            Size size = list2.get(i12);
            androidx.camera.core.impl.D<?> d10 = list3.get(list4.get(i12).intValue());
            int iN = d10.n();
            arrayList.add(F.v0.h(i10, iN, size, F(iN)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), d10);
            }
            i11 = E(i11, d10.n(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i11));
    }

    private int E(int i10, int i11, Size size) {
        return Math.min(i10, q(this.f163705k, i11, size));
    }

    private Range<Integer> G(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List<Integer> H(List<androidx.camera.core.impl.D<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<androidx.camera.core.impl.D<?>> it = list.iterator();
        while (it.hasNext()) {
            int iB = it.next().B(0);
            if (!arrayList2.contains(Integer.valueOf(iB))) {
                arrayList2.add(Integer.valueOf(iB));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            for (androidx.camera.core.impl.D<?> d10 : list) {
                if (iIntValue == d10.B(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(d10)));
                }
            }
        }
        return arrayList;
    }

    private boolean J() {
        int[] iArrB = this.f163705k.b().b();
        if (iArrB == null) {
            return false;
        }
        for (int i10 : iArrB) {
            if (i10 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean K(b bVar, List<AbstractC5650a> list, Map<androidx.camera.core.impl.D<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC5650a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        G.d dVar = new G.d();
        for (androidx.camera.core.impl.D<?> d10 : map.keySet()) {
            List<Size> list2 = map.get(d10);
            o2.i.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + d10 + ".");
            Size size = (Size) Collections.min(list2, dVar);
            int iN = d10.n();
            arrayList.add(F.v0.h(bVar.a(), iN, size, F(iN)));
        }
        return c(bVar, arrayList);
    }

    private void L() throws NumberFormatException {
        this.f163716v.g();
        if (this.f163714t == null) {
            l();
        } else {
            this.f163714t = F.w0.a(this.f163714t.b(), this.f163714t.j(), this.f163716v.f(), this.f163714t.h(), this.f163714t.f(), this.f163714t.d(), this.f163714t.l());
        }
    }

    private void N(Map<Integer, Size> map, int i10) {
        Size sizeR = r(this.f163705k.b().d(), i10, true);
        if (sizeR != null) {
            map.put(Integer.valueOf(i10), sizeR);
        }
    }

    private void O(Map<Integer, Size> map, Size size, int i10) {
        if (this.f163710p) {
            Size sizeR = r(this.f163705k.b().d(), i10, false);
            Integer numValueOf = Integer.valueOf(i10);
            if (sizeR != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeR), new G.d());
            }
            map.put(numValueOf, size);
        }
    }

    private void P(Map<Integer, Size> map, int i10) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f163712r || (streamConfigurationMap = (StreamConfigurationMap) this.f163705k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i10), r(streamConfigurationMap, i10, true));
    }

    private Map<androidx.camera.core.impl.D<?>, List<Size>> f(Map<androidx.camera.core.impl.D<?>, List<Size>> map, b bVar, Range<Integer> range) {
        HashMap map2 = new HashMap();
        for (androidx.camera.core.impl.D<?> d10 : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            for (Size size : map.get(d10)) {
                int iN = d10.n();
                v0.a aVarC = F.v0.h(bVar.a(), iN, size, F(iN)).c();
                int iQ = range != null ? q(this.f163705k, iN, size) : a.e.API_PRIORITY_OTHER;
                Set hashSet = (Set) map3.get(aVarC);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map3.put(aVarC, hashSet);
                }
                if (!hashSet.contains(Integer.valueOf(iQ))) {
                    arrayList.add(size);
                    hashSet.add(Integer.valueOf(iQ));
                }
            }
            map2.put(d10, arrayList);
        }
        return map2;
    }

    private void g() {
        this.f163700f.addAll(C17417t1.b());
    }

    private void h() {
        this.f163697c.addAll(C17417t1.d());
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f163698d.addAll(C17417t1.i());
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f163702h.addAll(C17417t1.k());
        }
    }

    private void k() {
        this.f163695a.addAll(C17417t1.a(this.f163707m, this.f163708n, this.f163709o));
        this.f163695a.addAll(this.f163706l.a(this.f163703i));
    }

    private void l() throws NumberFormatException {
        this.f163714t = F.w0.a(N.c.f21258c, new HashMap(), this.f163716v.f(), new HashMap(), w(), new HashMap(), new HashMap());
    }

    private void m() {
        this.f163701g.addAll(C17417t1.l());
    }

    private void n() {
        this.f163696b.addAll(C17417t1.m());
    }

    private Range<Integer> p(Range<Integer> range, int i10) {
        if (range != null) {
            Range<Integer> rangeD = androidx.camera.core.impl.x.f47497a;
            if (!range.equals(rangeD)) {
                Range<Integer>[] rangeArr = (Range[]) this.f163705k.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return rangeD;
                }
                Range<T> range2 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i10)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i10)));
                int iV = 0;
                for (Range<Integer> range3 : rangeArr) {
                    if (i10 >= ((Integer) range3.getLower()).intValue()) {
                        if (rangeD.equals(androidx.camera.core.impl.x.f47497a)) {
                            rangeD = range3;
                        }
                        if (range3.equals(range2)) {
                            return range3;
                        }
                        try {
                            int iV2 = v(range3.intersect(range2));
                            if (iV == 0) {
                                iV = iV2;
                            } else {
                                if (iV2 >= iV) {
                                    rangeD = d(range2, rangeD, range3);
                                    iV = v(range2.intersect(rangeD));
                                }
                                range3 = rangeD;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (iV != 0 || (u(range3, range2) >= u(rangeD, range2) && (u(range3, range2) != u(rangeD, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeD.getUpper()).intValue() && v(range3) >= v(rangeD))))) {
                            }
                        }
                        rangeD = range3;
                    }
                }
                return rangeD;
            }
        }
        return androidx.camera.core.impl.x.f47497a;
    }

    static int q(w.B b10, int i10, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) b10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i10, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private Size r(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10) {
        Size[] sizeArrA;
        Size[] outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        G.d dVar = new G.d();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), dVar);
        Size size2 = N.c.f21256a;
        if (z10 && (sizeArrA = a.a(streamConfigurationMap, i10)) != null && sizeArrA.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrA), dVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), dVar);
    }

    private Size w() throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(this.f163703i);
            CamcorderProfile camcorderProfileA = this.f163704j.b(i10, 1) ? this.f163704j.a(i10, 1) : null;
            return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : x(i10);
        } catch (NumberFormatException unused) {
            return y();
        }
    }

    private Size x(int i10) {
        Size size = N.c.f21259d;
        CamcorderProfile camcorderProfileA = this.f163704j.b(i10, 10) ? this.f163704j.a(i10, 10) : this.f163704j.b(i10, 8) ? this.f163704j.a(i10, 8) : this.f163704j.b(i10, 12) ? this.f163704j.a(i10, 12) : this.f163704j.b(i10, 6) ? this.f163704j.a(i10, 6) : this.f163704j.b(i10, 5) ? this.f163704j.a(i10, 5) : this.f163704j.b(i10, 4) ? this.f163704j.a(i10, 4) : null;
        return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : size;
    }

    private Size y() {
        Size[] outputSizes = this.f163705k.b().d().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return N.c.f21259d;
        }
        Arrays.sort(outputSizes, new G.d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = N.c.f21261f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return N.c.f21259d;
    }

    Pair<Map<androidx.camera.core.impl.D<?>, androidx.camera.core.impl.x>, Map<AbstractC5650a, androidx.camera.core.impl.x>> A(int i10, List<AbstractC5650a> list, Map<androidx.camera.core.impl.D<?>, List<Size>> map, boolean z10, boolean z11) throws NumberFormatException {
        int i11;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        List<F.v0> list2;
        HashMap map5;
        List<F.v0> list3;
        String str;
        String str2;
        int i12;
        HashMap map6;
        List<Size> list4;
        List<Size> list5;
        HashMap map7;
        boolean z12;
        L();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> listH = H(arrayList);
        Map<androidx.camera.core.impl.D<?>, C2979w> mapG = this.f163719y.g(list, arrayList, listH);
        b bVarE = e(i10, mapG, z10, I(list, map));
        boolean zK = K(bVarE, list, map);
        String str3 = " New configs: ";
        String str4 = "No supported surface combination is found for camera device - Id : ";
        if (!zK) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f163703i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> rangeD = D(list, arrayList, listH);
        Map<androidx.camera.core.impl.D<?>, List<Size>> mapF = f(map, bVarE, rangeD);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = listH.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.D<?> d10 = arrayList.get(it.next().intValue());
            arrayList2.add(a(mapF.get(d10), d10.n()));
            mapF = mapF;
        }
        List<List<Size>> listO = o(arrayList2);
        HashMap map8 = new HashMap();
        HashMap map9 = new HashMap();
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        boolean zD = G1.d(list, arrayList);
        int iS = s(list);
        if (!this.f163711q || zD) {
            i11 = iS;
            map2 = map10;
            map3 = map11;
            map4 = map9;
            list2 = null;
        } else {
            Iterator<List<Size>> it2 = listO.iterator();
            List<F.v0> listT = null;
            while (true) {
                if (!it2.hasNext()) {
                    HashMap map12 = map11;
                    i11 = iS;
                    map2 = map10;
                    map3 = map12;
                    z12 = zK;
                    map4 = map9;
                    break;
                }
                z12 = zK;
                map4 = map9;
                Pair<List<F.v0>, Integer> pairC = C(i10, list, it2.next(), arrayList, listH, iS, map10, map11);
                HashMap map13 = map11;
                i11 = iS;
                map2 = map10;
                map3 = map13;
                listT = t(bVarE, (List) pairC.first);
                if (listT != null && !G1.a(map2, map3, listT)) {
                    listT = null;
                }
                if (listT != null) {
                    if (G1.c(this.f163705k, listT)) {
                        break;
                    }
                    listT = null;
                }
                map2.clear();
                map3.clear();
                map10 = map2;
                iS = i11;
                map11 = map3;
                map9 = map4;
                zK = z12;
            }
            if (listT == null && !z12) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f163703i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
            }
            list2 = listT;
        }
        Iterator<List<Size>> it3 = listO.iterator();
        int i13 = a.e.API_PRIORITY_OTHER;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        boolean z13 = false;
        boolean z14 = false;
        List<Size> list6 = null;
        List<Size> list7 = null;
        while (true) {
            if (!it3.hasNext()) {
                map5 = map3;
                list3 = list2;
                str = str3;
                str2 = str4;
                i12 = i15;
                map6 = map2;
                list4 = list6;
                break;
            }
            List<Size> next = it3.next();
            HashMap map14 = map2;
            int i16 = i11;
            str = str3;
            map5 = map3;
            int i17 = i14;
            list3 = list2;
            int i18 = i13;
            str2 = str4;
            map6 = map14;
            Pair<List<F.v0>, Integer> pairC2 = C(i10, list, next, arrayList, listH, i16, null, null);
            List<F.v0> list8 = (List) pairC2.first;
            int iIntValue = ((Integer) pairC2.second).intValue();
            boolean z15 = rangeD == null || i16 <= iIntValue || iIntValue >= ((Integer) rangeD.getLower()).intValue();
            if (!z13 && c(bVarE, list8)) {
                if (i17 == i18 || i17 < iIntValue) {
                    list6 = next;
                    i17 = iIntValue;
                }
                if (z15) {
                    if (z14) {
                        list4 = next;
                        i14 = iIntValue;
                        i12 = i15;
                        break;
                    }
                    list6 = next;
                    i17 = iIntValue;
                    z13 = true;
                }
            }
            if (list3 == null || z14 || t(bVarE, list8) == null) {
                i15 = i15;
            } else {
                int i19 = i15;
                if (i19 != i18 && i19 >= iIntValue) {
                    i15 = i19;
                } else {
                    list7 = next;
                    i15 = iIntValue;
                }
                if (!z15) {
                    continue;
                } else {
                    if (z13) {
                        i12 = iIntValue;
                        list4 = list6;
                        list5 = next;
                        i14 = i17;
                        break;
                    }
                    list7 = next;
                    i15 = iIntValue;
                    z14 = true;
                }
            }
            i11 = i16;
            i13 = i18;
            i14 = i17;
            map2 = map6;
            str4 = str2;
            list2 = list3;
            map3 = map5;
            str3 = str;
        }
        list5 = list7;
        if (list4 == null) {
            throw new IllegalArgumentException(str2 + this.f163703i + " and Hardware level: " + this.f163707m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str + arrayList);
        }
        Range<Integer> rangeP = rangeD != null ? p(rangeD, i14) : null;
        for (androidx.camera.core.impl.D<?> d11 : arrayList) {
            x.a aVarF = androidx.camera.core.impl.x.a(list4.get(listH.indexOf(Integer.valueOf(arrayList.indexOf(d11))))).b((C2979w) o2.i.g(mapG.get(d11))).d(G1.e(d11)).f(z11);
            if (rangeP != null) {
                aVarF.c(rangeP);
            }
            map4.put(d11, aVarF.a());
        }
        if (list3 == null || i14 != i12 || list4.size() != list5.size()) {
            map7 = map8;
            break;
        }
        for (int i20 = 0; i20 < list4.size(); i20++) {
            if (!list4.get(i20).equals(list5.get(i20))) {
                map7 = map8;
                break;
            }
        }
        map7 = map8;
        if (!G1.k(this.f163705k, list, map4, map7)) {
            G1.l(map4, map7, map6, map5, list3);
        }
        return new Pair<>(map4, map7);
    }

    F.w0 F(int i10) {
        if (!this.f163715u.contains(Integer.valueOf(i10))) {
            O(this.f163714t.j(), N.c.f21260e, i10);
            O(this.f163714t.h(), N.c.f21262g, i10);
            N(this.f163714t.d(), i10);
            P(this.f163714t.l(), i10);
            this.f163715u.add(Integer.valueOf(i10));
        }
        return this.f163714t;
    }

    List<Size> a(List<Size> list, int i10) {
        Rational rational;
        int iA = this.f163717w.a(this.f163703i, this.f163705k);
        if (iA == 0) {
            rational = G.a.f11137a;
        } else if (iA == 1) {
            rational = G.a.f11139c;
        } else if (iA != 2) {
            rational = null;
        } else {
            Size sizeC = F(256).c(256);
            rational = new Rational(sizeC.getWidth(), sizeC.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (G.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f163718x.a(F.v0.e(i10), list);
    }

    I1(Context context, String str, w.O o10, InterfaceC17374f interfaceC17374f) throws CameraUnavailableException, NumberFormatException {
        int iIntValue;
        this.f163708n = false;
        this.f163709o = false;
        this.f163710p = false;
        this.f163711q = false;
        this.f163712r = false;
        this.f163713s = false;
        String str2 = (String) o2.i.g(str);
        this.f163703i = str2;
        this.f163704j = (InterfaceC17374f) o2.i.g(interfaceC17374f);
        this.f163706l = new C18326f();
        this.f163716v = C17385i1.c(context);
        try {
            w.B bC = o10.c(str2);
            this.f163705k = bC;
            Integer num = (Integer) bC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 2;
            }
            this.f163707m = iIntValue;
            int[] iArr = (int[]) bC.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f163708n = true;
                    } else if (i10 == 6) {
                        this.f163709o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f163712r = true;
                    }
                }
            }
            C17388j1 c17388j1 = new C17388j1(this.f163705k);
            this.f163719y = c17388j1;
            k();
            if (this.f163712r) {
                n();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f163710p = zHasSystemFeature;
            if (zHasSystemFeature) {
                h();
            }
            if (c17388j1.d()) {
                g();
            }
            if (J()) {
                m();
            }
            boolean zH = G1.h(this.f163705k);
            this.f163711q = zH;
            if (zH) {
                j();
            }
            boolean zA = Y1.a(this.f163705k);
            this.f163713s = zA;
            if (zA) {
                i();
            }
            l();
            b();
        } catch (CameraAccessExceptionCompat e10) {
            throw R0.a(e10);
        }
    }

    private Range<Integer> D(List<AbstractC5650a> list, List<androidx.camera.core.impl.D<?>> list2, List<Integer> list3) {
        Iterator<AbstractC5650a> it = list.iterator();
        Range<Integer> rangeG = null;
        while (it.hasNext()) {
            rangeG = G(it.next().h(), rangeG);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            rangeG = G(list2.get(it2.next().intValue()).y(null), rangeG);
        }
        return rangeG;
    }

    private static boolean I(List<AbstractC5650a> list, Map<androidx.camera.core.impl.D<?>, List<Size>> map) {
        Iterator<AbstractC5650a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().d() == 4101) {
                return true;
            }
        }
        Iterator<androidx.camera.core.impl.D<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().n() == 4101) {
                return true;
            }
        }
        return false;
    }

    private static Range<Integer> d(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double dV = v(range2.intersect(range));
        double dV2 = v(range3.intersect(range));
        double dV3 = dV2 / v(range3);
        double dV4 = dV / v(range2);
        if (dV2 <= dV ? !(dV2 != dV ? dV4 >= 0.5d || dV3 <= dV4 : dV3 <= dV4 && (dV3 != dV4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue())) : !(dV3 < 0.5d && dV3 < dV4)) {
            return range3;
        }
        return range2;
    }

    private b e(int i10, Map<androidx.camera.core.impl.D<?>, C2979w> map, boolean z10, boolean z11) {
        int iZ = z(map);
        if (i10 != 0 && z11) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f163703i, F.A.a(i10)));
        }
        if (i10 != 0 && iZ == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f163703i, F.A.a(i10)));
        }
        return b.e(i10, iZ, z10, z11);
    }

    private List<List<Size>> o(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new ArrayList());
            }
            int size2 = size / list.get(0).size();
            int i11 = size;
            for (int i12 = 0; i12 < list.size(); i12++) {
                List<Size> list2 = list.get(i12);
                for (int i13 = 0; i13 < size; i13++) {
                    ((List) arrayList.get(i13)).add(list2.get((i13 % i11) / size2));
                }
                if (i12 < list.size() - 1) {
                    i11 = size2;
                    size2 /= list.get(i12 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    private int s(List<AbstractC5650a> list) {
        int iE = a.e.API_PRIORITY_OTHER;
        for (AbstractC5650a abstractC5650a : list) {
            iE = E(iE, abstractC5650a.d(), abstractC5650a.f());
        }
        return iE;
    }

    private static int u(Range<Integer> range, Range<Integer> range2) {
        boolean z10;
        if (!range.contains((Range<Integer>) range2.getUpper()) && !range.contains((Range<Integer>) range2.getLower())) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "Ranges must not intersect");
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int v(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private static int z(Map<androidx.camera.core.impl.D<?>, C2979w> map) {
        Iterator<C2979w> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    F.v0 M(int i10, int i11, Size size) {
        return F.v0.h(i10, i11, size, F(i11));
    }

    boolean c(b bVar, List<F.v0> list) {
        Iterator<F.u0> it = B(bVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (it.next().d(list) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                break;
            }
        }
        return z10;
    }

    List<F.v0> t(b bVar, List<F.v0> list) {
        if (!G1.n(bVar)) {
            return null;
        }
        Iterator<F.u0> it = this.f163702h.iterator();
        while (it.hasNext()) {
            List<F.v0> listD = it.next().d(list);
            if (listD != null) {
                return listD;
            }
        }
        return null;
    }
}
