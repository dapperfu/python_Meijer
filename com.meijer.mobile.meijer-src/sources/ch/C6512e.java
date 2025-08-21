package ch;

import com.google.zxing.NotFoundException;
import com.google.zxing.o;
import com.google.zxing.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ch.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C6512e {

    /* renamed from: f, reason: collision with root package name */
    private static final b f62498f = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Ig.b f62499a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f62501c;

    /* renamed from: e, reason: collision with root package name */
    private final p f62503e;

    /* renamed from: b, reason: collision with root package name */
    private final List<C6511d> f62500b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final int[] f62502d = new int[5];

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    protected static void e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    protected static void f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    protected static boolean i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    protected static boolean j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    final f g(Map<com.google.zxing.d, ?> map) throws NotFoundException {
        boolean z10 = map != null && map.containsKey(com.google.zxing.d.TRY_HARDER);
        int iJ = this.f62499a.j();
        int iM = this.f62499a.m();
        int i10 = (iJ * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean zM = false;
        while (i11 < iJ && !zM) {
            e(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < iM) {
                if (this.f62499a.f(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (i(iArr) && l(iArr, i11, i12)) {
                    if (this.f62501c) {
                        zM = m();
                    } else {
                        int iH = h();
                        int i14 = iArr[2];
                        if (iH > i14) {
                            i11 += (iH - i14) - 2;
                            i12 = iM - 1;
                        }
                    }
                    e(iArr);
                    i10 = 2;
                    i13 = 0;
                } else {
                    f(iArr);
                    i13 = 3;
                }
                i12++;
            }
            if (i(iArr) && l(iArr, i11, iM)) {
                i10 = iArr[0];
                if (this.f62501c) {
                    zM = m();
                }
            }
            i11 += i10;
        }
        C6511d[] c6511dArrN = n();
        o.e(c6511dArrN);
        return new f(c6511dArrN);
    }

    protected final boolean l(int[] iArr, int i10, int i11) {
        int i12 = 0;
        int i13 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i11);
        float fD = d(i10, iA, iArr[2], i13);
        if (!Float.isNaN(fD)) {
            int i14 = (int) fD;
            float fC = c(iA, i14, iArr[2], i13);
            if (!Float.isNaN(fC) && b(i14, (int) fC)) {
                float f10 = i13 / 7.0f;
                while (true) {
                    if (i12 < this.f62500b.size()) {
                        C6511d c6511d = this.f62500b.get(i12);
                        if (c6511d.f(f10, fD, fC)) {
                            this.f62500b.set(i12, c6511d.g(fD, fC, f10));
                            break;
                        }
                        i12++;
                    } else {
                        C6511d c6511d2 = new C6511d(fC, fD, f10);
                        this.f62500b.add(c6511d2);
                        p pVar = this.f62503e;
                        if (pVar != null) {
                            pVar.a(c6511d2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: ch.e$b */
    private static final class b implements Comparator<C6511d>, Serializable {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C6511d c6511d, C6511d c6511d2) {
            return Float.compare(c6511d.i(), c6511d2.i());
        }
    }

    private float c(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        Ig.b bVar = this.f62499a;
        int iM = bVar.m();
        int[] iArrK = k();
        int i17 = i10;
        while (i17 >= 0 && bVar.f(i17, i11)) {
            iArrK[2] = iArrK[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bVar.f(i17, i11)) {
            int i18 = iArrK[1];
            if (i18 > i12) {
                break;
            }
            iArrK[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && iArrK[1] <= i12) {
            while (i17 >= 0 && bVar.f(i17, i11) && (i16 = iArrK[0]) <= i12) {
                iArrK[0] = i16 + 1;
                i17--;
            }
            if (iArrK[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < iM && bVar.f(i19, i11)) {
                iArrK[2] = iArrK[2] + 1;
                i19++;
            }
            if (i19 == iM) {
                return Float.NaN;
            }
            while (i19 < iM && !bVar.f(i19, i11) && (i15 = iArrK[3]) < i12) {
                iArrK[3] = i15 + 1;
                i19++;
            }
            if (i19 != iM && iArrK[3] < i12) {
                while (i19 < iM && bVar.f(i19, i11) && (i14 = iArrK[4]) < i12) {
                    iArrK[4] = i14 + 1;
                    i19++;
                }
                int i20 = iArrK[4];
                if (i20 < i12 && Math.abs(((((iArrK[0] + iArrK[1]) + iArrK[2]) + iArrK[3]) + i20) - i13) * 5 < i13 && i(iArrK)) {
                    return a(iArrK, i19);
                }
            }
        }
        return Float.NaN;
    }

    private float d(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        Ig.b bVar = this.f62499a;
        int iJ = bVar.j();
        int[] iArrK = k();
        int i17 = i10;
        while (i17 >= 0 && bVar.f(i11, i17)) {
            iArrK[2] = iArrK[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bVar.f(i11, i17)) {
            int i18 = iArrK[1];
            if (i18 > i12) {
                break;
            }
            iArrK[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && iArrK[1] <= i12) {
            while (i17 >= 0 && bVar.f(i11, i17) && (i16 = iArrK[0]) <= i12) {
                iArrK[0] = i16 + 1;
                i17--;
            }
            if (iArrK[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < iJ && bVar.f(i11, i19)) {
                iArrK[2] = iArrK[2] + 1;
                i19++;
            }
            if (i19 == iJ) {
                return Float.NaN;
            }
            while (i19 < iJ && !bVar.f(i11, i19) && (i15 = iArrK[3]) < i12) {
                iArrK[3] = i15 + 1;
                i19++;
            }
            if (i19 != iJ && iArrK[3] < i12) {
                while (i19 < iJ && bVar.f(i11, i19) && (i14 = iArrK[4]) < i12) {
                    iArrK[4] = i14 + 1;
                    i19++;
                }
                int i20 = iArrK[4];
                if (i20 < i12 && Math.abs(((((iArrK[0] + iArrK[1]) + iArrK[2]) + iArrK[3]) + i20) - i13) * 5 < i13 * 2 && i(iArrK)) {
                    return a(iArrK, i19);
                }
            }
        }
        return Float.NaN;
    }

    private int h() {
        if (this.f62500b.size() <= 1) {
            return 0;
        }
        C6511d c6511d = null;
        for (C6511d c6511d2 : this.f62500b) {
            if (c6511d2.h() >= 2) {
                if (c6511d != null) {
                    this.f62501c = true;
                    return ((int) (Math.abs(c6511d.c() - c6511d2.c()) - Math.abs(c6511d.d() - c6511d2.d()))) / 2;
                }
                c6511d = c6511d2;
            }
        }
        return 0;
    }

    private int[] k() {
        e(this.f62502d);
        return this.f62502d;
    }

    private boolean m() {
        int size = this.f62500b.size();
        float fAbs = 0.0f;
        int i10 = 0;
        float fI = 0.0f;
        for (C6511d c6511d : this.f62500b) {
            if (c6511d.h() >= 2) {
                i10++;
                fI += c6511d.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f10 = fI / size;
        Iterator<C6511d> it = this.f62500b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().i() - f10);
        }
        return fAbs <= fI * 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ch.C6511d[] n() throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.C6512e.n():ch.d[]");
    }

    public C6512e(Ig.b bVar, p pVar) {
        this.f62499a = bVar;
        this.f62503e = pVar;
    }

    private boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] iArrK = k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f62499a.f(i11 - i15, i10 - i15)) {
            iArrK[2] = iArrK[2] + 1;
            i15++;
        }
        if (iArrK[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f62499a.f(i11 - i15, i10 - i15)) {
            iArrK[1] = iArrK[1] + 1;
            i15++;
        }
        if (iArrK[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f62499a.f(i11 - i15, i10 - i15)) {
            iArrK[0] = iArrK[0] + 1;
            i15++;
        }
        if (iArrK[0] == 0) {
            return false;
        }
        int iJ = this.f62499a.j();
        int iM = this.f62499a.m();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= iJ || (i14 = i11 + i16) >= iM || !this.f62499a.f(i14, i17)) {
                break;
            }
            iArrK[2] = iArrK[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= iJ || (i13 = i11 + i16) >= iM || this.f62499a.f(i13, i18)) {
                break;
            }
            iArrK[3] = iArrK[3] + 1;
            i16++;
        }
        if (iArrK[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= iJ || (i12 = i11 + i16) >= iM || !this.f62499a.f(i12, i19)) {
                break;
            }
            iArrK[4] = iArrK[4] + 1;
            i16++;
        }
        if (iArrK[4] == 0) {
            return false;
        }
        return j(iArrK);
    }

    private static double o(C6511d c6511d, C6511d c6511d2) {
        double dC = c6511d.c() - c6511d2.c();
        double d10 = c6511d.d() - c6511d2.d();
        return (dC * dC) + (d10 * d10);
    }
}
