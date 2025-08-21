package com.google.android.material.carousel;

import com.google.android.material.carousel.f;
import de.C13661a;
import h2.C14442a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f87479a;

    /* renamed from: b, reason: collision with root package name */
    private final List<f> f87480b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f> f87481c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f87482d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f87483e;

    /* renamed from: f, reason: collision with root package name */
    private final float f87484f;

    /* renamed from: g, reason: collision with root package name */
    private final float f87485g;

    private static int c(f fVar) {
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            if (!fVar.g().get(i10).f87475e) {
                return i10;
            }
        }
        return -1;
    }

    public f j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    static g f(b bVar, f fVar, float f10, float f11, float f12) {
        return new g(fVar, p(bVar, fVar, f10, f11), n(bVar, fVar, f10, f12));
    }

    private static List<f> n(b bVar, f fVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iE = e(fVar);
        float fC = bVar.b() ? bVar.c() : bVar.d();
        if (!r(bVar, fVar) && iE != -1) {
            int i10 = iE - fVar.i();
            float f12 = fVar.c().f87472b - (fVar.c().f87474d / 2.0f);
            if (i10 <= 0 && fVar.h().f87476f > 0.0f) {
                arrayList.add(v(fVar, f12 - fVar.h().f87476f, fC));
                return arrayList;
            }
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < i10) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i12 = iE - i11;
                float f14 = f13 + fVar.g().get(i12).f87476f;
                int i13 = i12 + 1;
                f fVarT = t(fVar2, iE, i13 < fVar.g().size() ? d(fVar2, fVar.g().get(i13).f87473c) + 1 : 0, f12 - f14, fVar.b() + i11 + 1, fVar.i() + i11 + 1, fC);
                if (i11 == i10 - 1 && f11 > 0.0f) {
                    fVarT = u(fVarT, f11, fC, false, f10);
                }
                arrayList.add(fVarT);
                i11++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(fVar, f11, fC, false, f10));
        }
        return arrayList;
    }

    private static List<f> p(b bVar, f fVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iC = c(fVar);
        float fC = bVar.b() ? bVar.c() : bVar.d();
        if (!q(fVar) && iC != -1) {
            int iB = fVar.b() - iC;
            float f12 = fVar.c().f87472b - (fVar.c().f87474d / 2.0f);
            if (iB <= 0 && fVar.a().f87476f > 0.0f) {
                arrayList.add(v(fVar, f12 + fVar.a().f87476f, fC));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iB) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = fVar.g().size() - 1;
                float f14 = f13 + fVar.g().get(i11).f87476f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(fVar2, fVar.g().get(i12).f87473c) - 1;
                }
                f fVarT = t(fVar2, iC, size, f12 + f14, (fVar.b() - i10) - 1, (fVar.i() - i10) - 1, fC);
                if (i10 == iB - 1 && f11 > 0.0f) {
                    fVarT = u(fVarT, f11, fC, true, f10);
                }
                arrayList.add(fVarT);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(fVar, f11, fC, true, f10));
        }
        return arrayList;
    }

    private static f t(f fVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i11, (f.c) arrayList.remove(i10));
        f.b bVar = new f.b(fVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i14);
            float f12 = cVar.f87474d;
            bVar.e(f10 + (f12 / 2.0f), cVar.f87473c, f12, i14 >= i12 && i14 <= i13, cVar.f87475e, cVar.f87476f);
            f10 += cVar.f87474d;
            i14++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f11);
        float fL = f10 / fVar.l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i10);
            if (cVar.f87475e) {
                bVar.e(cVar.f87472b, cVar.f87473c, cVar.f87474d, false, true, cVar.f87476f);
            } else {
                boolean z11 = i10 >= fVar.b() && i10 <= fVar.i();
                float f14 = cVar.f87474d - fL;
                float fB = d.b(f14, fVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f87472b;
                bVar.f(f15, fB, f14, z11, false, cVar.f87476f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return bVar.i();
    }

    f g() {
        return this.f87479a;
    }

    f h() {
        return this.f87481c.get(r0.size() - 1);
    }

    Map<Integer, f> i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f87479a.f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f87485g || i13 >= i10 - this.f87481c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List<f> list = this.f87481c;
                map.put(numValueOf, list.get(C14442a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f87484f || i17 < this.f87480b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List<f> list2 = this.f87480b;
                map.put(numValueOf2, list2.get(C14442a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    f k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List<f> list;
        float[] fArr;
        float f13 = this.f87484f + f11;
        float f14 = f12 - this.f87485g;
        float f15 = l().a().f87477g;
        float f16 = h().h().f87478h;
        if (this.f87484f == f15) {
            f13 += f15;
        }
        if (this.f87485g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = C13661a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f87480b;
            fArr = this.f87482d;
        } else {
            if (f10 <= f14) {
                return this.f87479a;
            }
            fB = C13661a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f87481c;
            fArr = this.f87483e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    f l() {
        return this.f87480b.get(r0.size() - 1);
    }

    private g(f fVar, List<f> list, List<f> list2) {
        this.f87479a = fVar;
        this.f87480b = Collections.unmodifiableList(list);
        this.f87481c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f87471a - fVar.c().f87471a;
        this.f87484f = f10;
        float f11 = fVar.j().f87471a - list2.get(list2.size() - 1).j().f87471a;
        this.f87485g = f11;
        this.f87482d = m(f10, list, true);
        this.f87483e = m(f11, list2, false);
    }

    private f a(List<f> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        if (fArrO[0] >= 0.5f) {
            return list.get((int) fArrO[2]);
        }
        return list.get((int) fArrO[1]);
    }

    private static int b(f fVar, float f10) {
        for (int i10 = fVar.i(); i10 < fVar.g().size(); i10++) {
            if (f10 == fVar.g().get(i10).f87473c) {
                return i10;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int d(f fVar, float f10) {
        for (int iB = fVar.b() - 1; iB >= 0; iB--) {
            if (f10 == fVar.g().get(iB).f87473c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!fVar.g().get(size).f87475e) {
                return size;
            }
        }
        return -1;
    }

    private static float[] m(float f10, List<f> list, boolean z10) {
        float f11;
        float f12;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i10 = 1; i10 < size; i10++) {
            int i11 = i10 - 1;
            f fVar = list.get(i11);
            f fVar2 = list.get(i10);
            if (z10) {
                f11 = fVar2.c().f87471a - fVar.c().f87471a;
            } else {
                f11 = fVar.j().f87471a - fVar2.j().f87471a;
            }
            float f13 = f11 / f10;
            if (i10 == size - 1) {
                f12 = 1.0f;
            } else {
                f12 = fArr[i11] + f13;
            }
            fArr[i10] = f12;
        }
        return fArr;
    }

    private static float[] o(List<f> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{C13661a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static boolean q(f fVar) {
        if (fVar.a().f87472b - (fVar.a().f87474d / 2.0f) >= 0.0f && fVar.a() == fVar.d()) {
            return true;
        }
        return false;
    }

    private static boolean r(b bVar, f fVar) {
        int iD = bVar.d();
        if (bVar.b()) {
            iD = bVar.c();
        }
        if (fVar.h().f87472b + (fVar.h().f87474d / 2.0f) <= iD && fVar.h() == fVar.k()) {
            return true;
        }
        return false;
    }

    private static f s(List<f> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return f.m(list.get((int) fArrO[1]), list.get((int) fArrO[2]), fArrO[0]);
    }

    private static f v(f fVar, float f10, float f11) {
        return t(fVar, 0, 0, f10, fVar.b(), fVar.i(), f11);
    }
}
