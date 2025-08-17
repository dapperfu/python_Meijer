package ah;

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

/* loaded from: classes7.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private static final b f45483f = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Gg.b f45484a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45486c;

    /* renamed from: e, reason: collision with root package name */
    private final p f45488e;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f45485b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final int[] f45487d = new int[5];

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
        int iJ = this.f45484a.j();
        int iM = this.f45484a.m();
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
                if (this.f45484a.f(i12, i11)) {
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
                    if (this.f45486c) {
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
                if (this.f45486c) {
                    zM = m();
                }
            }
            i11 += i10;
        }
        d[] dVarArrN = n();
        o.e(dVarArrN);
        return new f(dVarArrN);
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
                    if (i12 < this.f45485b.size()) {
                        d dVar = this.f45485b.get(i12);
                        if (dVar.f(f10, fD, fC)) {
                            this.f45485b.set(i12, dVar.g(fD, fC, f10));
                            break;
                        }
                        i12++;
                    } else {
                        d dVar2 = new d(fC, fD, f10);
                        this.f45485b.add(dVar2);
                        p pVar = this.f45488e;
                        if (pVar != null) {
                            pVar.a(dVar2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static final class b implements Comparator<d>, Serializable {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return Float.compare(dVar.i(), dVar2.i());
        }
    }

    private float c(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        Gg.b bVar = this.f45484a;
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
        Gg.b bVar = this.f45484a;
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
        if (this.f45485b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f45485b) {
            if (dVar2.h() >= 2) {
                if (dVar != null) {
                    this.f45486c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    private int[] k() {
        e(this.f45487d);
        return this.f45487d;
    }

    private boolean m() {
        int size = this.f45485b.size();
        float fAbs = 0.0f;
        int i10 = 0;
        float fI = 0.0f;
        for (d dVar : this.f45485b) {
            if (dVar.h() >= 2) {
                i10++;
                fI += dVar.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f10 = fI / size;
        Iterator<d> it = this.f45485b.iterator();
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
    private ah.d[] n() throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e.n():ah.d[]");
    }

    public e(Gg.b bVar, p pVar) {
        this.f45484a = bVar;
        this.f45488e = pVar;
    }

    private boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] iArrK = k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f45484a.f(i11 - i15, i10 - i15)) {
            iArrK[2] = iArrK[2] + 1;
            i15++;
        }
        if (iArrK[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f45484a.f(i11 - i15, i10 - i15)) {
            iArrK[1] = iArrK[1] + 1;
            i15++;
        }
        if (iArrK[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f45484a.f(i11 - i15, i10 - i15)) {
            iArrK[0] = iArrK[0] + 1;
            i15++;
        }
        if (iArrK[0] == 0) {
            return false;
        }
        int iJ = this.f45484a.j();
        int iM = this.f45484a.m();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= iJ || (i14 = i11 + i16) >= iM || !this.f45484a.f(i14, i17)) {
                break;
            }
            iArrK[2] = iArrK[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= iJ || (i13 = i11 + i16) >= iM || this.f45484a.f(i13, i18)) {
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
            if (i19 >= iJ || (i12 = i11 + i16) >= iM || !this.f45484a.f(i12, i19)) {
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

    private static double o(d dVar, d dVar2) {
        double dC = dVar.c() - dVar2.c();
        double d10 = dVar.d() - dVar2.d();
        return (dC * dC) + (d10 * d10);
    }
}
