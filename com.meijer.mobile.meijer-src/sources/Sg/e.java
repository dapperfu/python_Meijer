package Sg;

import Rg.r;
import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class e extends a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f34586i = {1, 10, 34, 70, 126};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f34587j = {4, 20, 48, 81};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f34588k = {0, 161, 961, 2015, 2715};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f34589l = {0, 336, 1036, 1516};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f34590m = {8, 6, 4, 3, 1};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f34591n = {2, 4, 6, 8};

    /* renamed from: o, reason: collision with root package name */
    private static final int[][] f34592o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g, reason: collision with root package name */
    private final List<d> f34593g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<d> f34594h = new ArrayList();

    private d w(Ig.a aVar, boolean z10, int i10, Map<com.google.zxing.d, ?> map) {
        try {
            c cVarY = y(aVar, i10, z10, x(aVar, z10));
            p pVar = map == null ? null : (p) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
            if (pVar != null) {
                int[] iArrB = cVarY.b();
                float fL = ((iArrB[0] + iArrB[1]) - 1) / 2.0f;
                if (z10) {
                    fL = (aVar.l() - 1) - fL;
                }
                pVar.a(new o(fL, i10));
            }
            b bVarV = v(aVar, cVarY, true);
            b bVarV2 = v(aVar, cVarY, false);
            return new d((bVarV.b() * 1597) + bVarV2.b(), bVarV.a() + (bVarV2.a() * 4), cVarY);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private c y(Ig.a aVar, int i10, boolean z10, int[] iArr) throws NotFoundException {
        int i11;
        boolean zG = aVar.g(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && zG != aVar.g(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArrJ = j();
        System.arraycopy(iArrJ, 0, iArrJ, 1, iArrJ.length - 1);
        iArrJ[0] = i14;
        int iQ = a.q(iArrJ, f34592o);
        int iL = iArr[1];
        if (z10) {
            int iL2 = (aVar.l() - 1) - i13;
            iL = (aVar.l() - 1) - iL;
            i11 = iL2;
        } else {
            i11 = i13;
        }
        return new c(iQ, new int[]{i13, iArr[1]}, i11, iL, i10);
    }

    @Override // Rg.r
    public m c(int i10, Ig.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        r(this.f34593g, w(aVar, false, i10, map));
        aVar.p();
        r(this.f34594h, w(aVar, true, i10, map));
        aVar.p();
        for (d dVar : this.f34593g) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f34594h) {
                    if (dVar2.c() > 1 && t(dVar, dVar2)) {
                        return u(dVar, dVar2);
                    }
                }
            }
        }
        throw NotFoundException.a();
    }

    private static void r(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        for (d dVar2 : collection) {
            if (dVar2.b() == dVar.b()) {
                dVar2.e();
                return;
            }
        }
        collection.add(dVar);
    }

    @Override // Rg.r, com.google.zxing.l
    public void reset() {
        this.f34593g.clear();
        this.f34594h.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[PHI: r6 r7
      0x002a: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r6 r7
      0x002d: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r7v4 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sg.e.s(boolean, int):void");
    }

    private static boolean t(d dVar, d dVar2) {
        int iA = (dVar.a() + (dVar2.a() * 16)) % 79;
        int iC = (dVar.d().c() * 9) + dVar2.d().c();
        if (iC > 72) {
            iC--;
        }
        if (iC > 8) {
            iC--;
        }
        if (iA == iC) {
            return true;
        }
        return false;
    }

    private static m u(d dVar, d dVar2) {
        String strValueOf = String.valueOf((dVar.b() * 4537077) + dVar2.b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(strValueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int iCharAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                iCharAt *= 3;
            }
            i10 += iCharAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        o[] oVarArrA = dVar.d().a();
        o[] oVarArrA2 = dVar2.d().a();
        m mVar = new m(sb2.toString(), null, new o[]{oVarArrA[0], oVarArrA[1], oVarArrA2[0], oVarArrA2[1]}, com.google.zxing.a.RSS_14);
        mVar.h(n.SYMBOLOGY_IDENTIFIER, "]e0");
        return mVar;
    }

    private b v(Ig.a aVar, c cVar, boolean z10) throws NotFoundException {
        int i10;
        int[] iArrI = i();
        Arrays.fill(iArrI, 0);
        if (z10) {
            r.g(aVar, cVar.b()[0], iArrI);
        } else {
            r.f(aVar, cVar.b()[1], iArrI);
            int i11 = 0;
            for (int length = iArrI.length - 1; i11 < length; length--) {
                int i12 = iArrI[i11];
                iArrI[i11] = iArrI[length];
                iArrI[length] = i12;
                i11++;
            }
        }
        if (z10) {
            i10 = 16;
        } else {
            i10 = 15;
        }
        float fD = Jg.a.d(iArrI) / i10;
        int[] iArrM = m();
        int[] iArrK = k();
        float[] fArrN = n();
        float[] fArrL = l();
        for (int i13 = 0; i13 < iArrI.length; i13++) {
            float f10 = iArrI[i13] / fD;
            int i14 = (int) (0.5f + f10);
            if (i14 < 1) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                iArrM[i15] = i14;
                fArrN[i15] = f10 - i14;
            } else {
                iArrK[i15] = i14;
                fArrL[i15] = f10 - i14;
            }
        }
        s(z10, i10);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = iArrM.length - 1; length2 >= 0; length2--) {
            int i18 = iArrM[length2];
            i16 = (i16 * 9) + i18;
            i17 += i18;
        }
        int i19 = 0;
        int i20 = 0;
        for (int length3 = iArrK.length - 1; length3 >= 0; length3--) {
            int i21 = iArrK[length3];
            i19 = (i19 * 9) + i21;
            i20 += i21;
        }
        int i22 = i16 + (i19 * 3);
        if (z10) {
            if ((i17 & 1) == 0 && i17 <= 12 && i17 >= 4) {
                int i23 = (12 - i17) / 2;
                int i24 = f34590m[i23];
                int i25 = 9 - i24;
                return new b((f.b(iArrM, i24, false) * f34586i[i23]) + f.b(iArrK, i25, true) + f34588k[i23], i22);
            }
            throw NotFoundException.a();
        }
        if ((i20 & 1) == 0 && i20 <= 10 && i20 >= 4) {
            int i26 = (10 - i20) / 2;
            int i27 = f34591n[i26];
            return new b((f.b(iArrK, 9 - i27, false) * f34587j[i26]) + f.b(iArrM, i27, true) + f34589l[i26], i22);
        }
        throw NotFoundException.a();
    }

    private int[] x(Ig.a aVar, boolean z10) throws NotFoundException {
        int[] iArrJ = j();
        iArrJ[0] = 0;
        iArrJ[1] = 0;
        iArrJ[2] = 0;
        iArrJ[3] = 0;
        int iL = aVar.l();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < iL) {
            z11 = !aVar.g(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < iL) {
            if (aVar.g(i10) != z11) {
                iArrJ[i11] = iArrJ[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (a.p(iArrJ)) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArrJ[0] + iArrJ[1];
                    iArrJ[0] = iArrJ[2];
                    iArrJ[1] = iArrJ[3];
                    iArrJ[2] = 0;
                    iArrJ[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArrJ[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw NotFoundException.a();
    }
}
