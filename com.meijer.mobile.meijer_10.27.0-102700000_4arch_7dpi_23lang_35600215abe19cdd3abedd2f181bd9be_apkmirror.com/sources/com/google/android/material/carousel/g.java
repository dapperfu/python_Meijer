package com.google.android.material.carousel;

import be.C6230a;
import com.google.android.material.carousel.f;
import h2.C14329a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f86639a;

    /* renamed from: b, reason: collision with root package name */
    private final List<f> f86640b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f> f86641c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f86642d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f86643e;

    /* renamed from: f, reason: collision with root package name */
    private final float f86644f;

    /* renamed from: g, reason: collision with root package name */
    private final float f86645g;

    private static int c(f fVar) {
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            if (!fVar.g().get(i10).f86635e) {
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
            float f12 = fVar.c().f86632b - (fVar.c().f86634d / 2.0f);
            if (i10 <= 0 && fVar.h().f86636f > 0.0f) {
                arrayList.add(v(fVar, f12 - fVar.h().f86636f, fC));
                return arrayList;
            }
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < i10) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i12 = iE - i11;
                float f14 = f13 + fVar.g().get(i12).f86636f;
                int i13 = i12 + 1;
                f fVarT = t(fVar2, iE, i13 < fVar.g().size() ? d(fVar2, fVar.g().get(i13).f86633c) + 1 : 0, f12 - f14, fVar.b() + i11 + 1, fVar.i() + i11 + 1, fC);
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
            float f12 = fVar.c().f86632b - (fVar.c().f86634d / 2.0f);
            if (iB <= 0 && fVar.a().f86636f > 0.0f) {
                arrayList.add(v(fVar, f12 + fVar.a().f86636f, fC));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iB) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = fVar.g().size() - 1;
                float f14 = f13 + fVar.g().get(i11).f86636f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(fVar2, fVar.g().get(i12).f86633c) - 1;
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
            float f12 = cVar.f86634d;
            bVar.e(f10 + (f12 / 2.0f), cVar.f86633c, f12, i14 >= i12 && i14 <= i13, cVar.f86635e, cVar.f86636f);
            f10 += cVar.f86634d;
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
            if (cVar.f86635e) {
                bVar.e(cVar.f86632b, cVar.f86633c, cVar.f86634d, false, true, cVar.f86636f);
            } else {
                boolean z11 = i10 >= fVar.b() && i10 <= fVar.i();
                float f14 = cVar.f86634d - fL;
                float fB = d.b(f14, fVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f86632b;
                bVar.f(f15, fB, f14, z11, false, cVar.f86636f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return bVar.i();
    }

    f g() {
        return this.f86639a;
    }

    f h() {
        return this.f86641c.get(r0.size() - 1);
    }

    Map<Integer, f> i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f86639a.f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f86645g || i13 >= i10 - this.f86641c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List<f> list = this.f86641c;
                map.put(numValueOf, list.get(C14329a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f86644f || i17 < this.f86640b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List<f> list2 = this.f86640b;
                map.put(numValueOf2, list2.get(C14329a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    f k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List<f> list;
        float[] fArr;
        float f13 = this.f86644f + f11;
        float f14 = f12 - this.f86645g;
        float f15 = l().a().f86637g;
        float f16 = h().h().f86638h;
        if (this.f86644f == f15) {
            f13 += f15;
        }
        if (this.f86645g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = C6230a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f86640b;
            fArr = this.f86642d;
        } else {
            if (f10 <= f14) {
                return this.f86639a;
            }
            fB = C6230a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f86641c;
            fArr = this.f86643e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    f l() {
        return this.f86640b.get(r0.size() - 1);
    }

    private g(f fVar, List<f> list, List<f> list2) {
        this.f86639a = fVar;
        this.f86640b = Collections.unmodifiableList(list);
        this.f86641c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f86631a - fVar.c().f86631a;
        this.f86644f = f10;
        float f11 = fVar.j().f86631a - list2.get(list2.size() - 1).j().f86631a;
        this.f86645g = f11;
        this.f86642d = m(f10, list, true);
        this.f86643e = m(f11, list2, false);
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
            if (f10 == fVar.g().get(i10).f86633c) {
                return i10;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int d(f fVar, float f10) {
        for (int iB = fVar.b() - 1; iB >= 0; iB--) {
            if (f10 == fVar.g().get(iB).f86633c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!fVar.g().get(size).f86635e) {
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
                f11 = fVar2.c().f86631a - fVar.c().f86631a;
            } else {
                f11 = fVar.j().f86631a - fVar2.j().f86631a;
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
                return new float[]{C6230a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static boolean q(f fVar) {
        if (fVar.a().f86632b - (fVar.a().f86634d / 2.0f) >= 0.0f && fVar.a() == fVar.d()) {
            return true;
        }
        return false;
    }

    private static boolean r(b bVar, f fVar) {
        int iD = bVar.d();
        if (bVar.b()) {
            iD = bVar.c();
        }
        if (fVar.h().f86632b + (fVar.h().f86634d / 2.0f) <= iD && fVar.h() == fVar.k()) {
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
