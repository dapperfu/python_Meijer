package Tg;

import Rg.r;
import Sg.f;
import Ug.j;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d extends Sg.a {

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f36229k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f36230l = {4, 20, 52, 104, HttpResponseStatus.SUCCESS_NO_CONTENT};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f36231m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    private static final int[][] f36232n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    private static final int[][] f36233o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, HttpResponseStatus.SUCCESS_RESET_CONTENT}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{BinsView.TOTE_WIDTH_DP, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, 187, 139, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, ModuleDescriptor.MODULE_VERSION}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, HttpResponseStatus.SUCCESS_OK, 178, 112, 125, 164}, new int[]{70, 210, 208, HttpResponseStatus.SUCCESS_ACCEPTED, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, HttpResponseStatus.SUCCESS_NO_CONTENT, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{BinsView.TOTE_HEIGHT_DP, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, l3.f93324d, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    private static final int[][] f36234p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f36235g = new ArrayList(11);

    /* renamed from: h, reason: collision with root package name */
    private final List<c> f36236h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final int[] f36237i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private boolean f36238j;

    private Sg.c E(Ig.a aVar, int i10, boolean z10, List<b> list) {
        int iK;
        int i11;
        int i12;
        if (z10) {
            int i13 = this.f36237i[0] - 1;
            while (i13 >= 0 && !aVar.g(i13)) {
                i13--;
            }
            int i14 = i13 + 1;
            int[] iArr = this.f36237i;
            i12 = iArr[0] - i14;
            iK = iArr[1];
            i11 = i14;
        } else {
            int[] iArr2 = this.f36237i;
            int i15 = iArr2[0];
            iK = aVar.k(iArr2[1] + 1);
            i11 = i15;
            i12 = iK - this.f36237i[1];
        }
        int i16 = iK;
        int[] iArrJ = j();
        System.arraycopy(iArrJ, 0, iArrJ, 1, iArrJ.length - 1);
        iArrJ[0] = i12;
        try {
            int iQ = Sg.a.q(iArrJ, f36232n);
            if (!D(list, iQ)) {
                return null;
            }
            if (!list.isEmpty()) {
                b bVar = list.get(list.size() - 1);
                int i17 = bVar.a().b()[0];
                float f10 = ((r10 - i17) / 15.0f) * 17.0f;
                float f11 = bVar.a().b()[1];
                float f12 = f10 * 2.0f;
                float f13 = (0.9f * f12) + f11;
                float f14 = f11 + (f12 * 1.1f);
                float f15 = i11;
                if (f15 < f13 || f15 > f14) {
                    return null;
                }
            }
            return new Sg.c(iQ, new int[]{i11, i16}, i11, i16, i10);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void H(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    private void I(int i10) {
        boolean zC = false;
        int i11 = 0;
        boolean zC2 = false;
        while (true) {
            if (i11 >= this.f36236h.size()) {
                break;
            }
            c cVar = this.f36236h.get(i11);
            if (cVar.b() > i10) {
                zC = cVar.c(this.f36235g);
                break;
            } else {
                zC2 = cVar.c(this.f36235g);
                i11++;
            }
        }
        if (zC || zC2 || B(this.f36235g, this.f36236h)) {
            return;
        }
        this.f36236h.add(i11, new c(this.f36235g, i10));
        F(this.f36235g, this.f36236h);
    }

    @Override // Rg.r
    public m c(int i10, Ig.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        this.f36238j = false;
        try {
            return v(x(i10, aVar));
        } catch (NotFoundException unused) {
            this.f36238j = true;
            return v(x(i10, aVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean C(java.util.List<Tg.b> r8, boolean r9) {
        /*
            int[][] r0 = Tg.d.f36234p
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L37
            r4 = r0[r3]
            int r5 = r8.size()
            int r6 = r4.length
            if (r9 == 0) goto L13
            if (r5 != r6) goto L34
            goto L15
        L13:
            if (r5 > r6) goto L34
        L15:
            r5 = r2
        L16:
            int r6 = r8.size()
            if (r5 >= r6) goto L32
            java.lang.Object r6 = r8.get(r5)
            Tg.b r6 = (Tg.b) r6
            Sg.c r6 = r6.a()
            int r6 = r6.c()
            r7 = r4[r5]
            if (r6 == r7) goto L2f
            goto L34
        L2f:
            int r5 = r5 + 1
            goto L16
        L32:
            r8 = 1
            return r8
        L34:
            int r3 = r3 + 1
            goto L5
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.d.C(java.util.List, boolean):boolean");
    }

    private boolean s() {
        b bVar = this.f36235g.get(0);
        Sg.b bVarB = bVar.b();
        Sg.b bVarC = bVar.c();
        if (bVarC == null) {
            return false;
        }
        int iA = bVarC.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f36235g.size(); i11++) {
            b bVar2 = this.f36235g.get(i11);
            iA += bVar2.b().a();
            int i12 = i10 + 1;
            Sg.b bVarC2 = bVar2.c();
            if (bVarC2 != null) {
                iA += bVarC2.a();
                i10 += 2;
            } else {
                i10 = i12;
            }
        }
        return ((i10 + (-4)) * 211) + (iA % 211) == bVarB.b();
    }

    private List<b> t(List<c> list, int i10) throws NotFoundException {
        while (i10 < this.f36236h.size()) {
            c cVar = this.f36236h.get(i10);
            this.f36235g.clear();
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                this.f36235g.addAll(it.next().a());
            }
            this.f36235g.addAll(cVar.a());
            if (C(this.f36235g, false)) {
                if (s()) {
                    return this.f36235g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return t(arrayList, i10 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i10++;
        }
        throw NotFoundException.a();
    }

    private List<b> u(boolean z10) {
        List<b> listT = null;
        if (this.f36236h.size() > 25) {
            this.f36236h.clear();
            return null;
        }
        this.f36235g.clear();
        if (z10) {
            Collections.reverse(this.f36236h);
        }
        try {
            listT = t(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z10) {
            Collections.reverse(this.f36236h);
        }
        return listT;
    }

    @Override // Rg.r, com.google.zxing.l
    public void reset() {
        this.f36235g.clear();
        this.f36236h.clear();
    }

    Sg.b w(Ig.a aVar, Sg.c cVar, boolean z10, boolean z11) throws NotFoundException {
        int[] iArrI = i();
        Arrays.fill(iArrI, 0);
        if (z11) {
            r.g(aVar, cVar.b()[0], iArrI);
        } else {
            r.f(aVar, cVar.b()[1], iArrI);
            int i10 = 0;
            for (int length = iArrI.length - 1; i10 < length; length--) {
                int i11 = iArrI[i10];
                iArrI[i10] = iArrI[length];
                iArrI[length] = i11;
                i10++;
            }
        }
        float fD = Jg.a.d(iArrI) / 17;
        float f10 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(fD - f10) / f10 > 0.3f) {
            throw NotFoundException.a();
        }
        int[] iArrM = m();
        int[] iArrK = k();
        float[] fArrN = n();
        float[] fArrL = l();
        for (int i12 = 0; i12 < iArrI.length; i12++) {
            float f11 = (iArrI[i12] * 1.0f) / fD;
            int i13 = (int) (0.5f + f11);
            if (i13 < 1) {
                if (f11 < 0.3f) {
                    throw NotFoundException.a();
                }
                i13 = 1;
            } else if (i13 > 8) {
                if (f11 > 8.7f) {
                    throw NotFoundException.a();
                }
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                iArrM[i14] = i13;
                fArrN[i14] = f11 - i13;
            } else {
                iArrK[i14] = i13;
                fArrL[i14] = f11 - i13;
            }
        }
        r(17);
        int iC = (((cVar.c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int i15 = 0;
        int i16 = 0;
        for (int length2 = iArrM.length - 1; length2 >= 0; length2--) {
            if (A(cVar, z10, z11)) {
                i15 += iArrM[length2] * f36233o[iC][length2 * 2];
            }
            i16 += iArrM[length2];
        }
        int i17 = 0;
        for (int length3 = iArrK.length - 1; length3 >= 0; length3--) {
            if (A(cVar, z10, z11)) {
                i17 += iArrK[length3] * f36233o[iC][(length3 * 2) + 1];
            }
        }
        int i18 = i15 + i17;
        if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
            throw NotFoundException.a();
        }
        int i19 = (13 - i16) / 2;
        int i20 = f36229k[i19];
        return new Sg.b((f.b(iArrM, i20, true) * f36230l[i19]) + f.b(iArrK, 9 - i20, false) + f36231m[i19], i18);
    }

    List<b> x(int i10, Ig.a aVar) throws NotFoundException {
        this.f36235g.clear();
        boolean z10 = false;
        while (!z10) {
            try {
                List<b> list = this.f36235g;
                list.add(G(aVar, list, i10));
            } catch (NotFoundException e10) {
                if (this.f36235g.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (s() && C(this.f36235g, true)) {
            return this.f36235g;
        }
        boolean zIsEmpty = this.f36236h.isEmpty();
        I(i10);
        if (!zIsEmpty) {
            List<b> listU = u(false);
            if (listU != null) {
                return listU;
            }
            List<b> listU2 = u(true);
            if (listU2 != null) {
                return listU2;
            }
        }
        throw NotFoundException.a();
    }

    private static boolean A(Sg.c cVar, boolean z10, boolean z11) {
        if (cVar.c() == 0 && z10 && z11) {
            return false;
        }
        return true;
    }

    private static boolean B(Iterable<b> iterable, Iterable<c> iterable2) {
        for (c cVar : iterable2) {
            for (b bVar : iterable) {
                Iterator<b> it = cVar.a().iterator();
                while (it.hasNext()) {
                    if (bVar.equals(it.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean D(List<b> list, int i10) {
        if (list.isEmpty()) {
            return true;
        }
        for (int[] iArr : f36234p) {
            if (list.size() + 1 <= iArr.length) {
                for (int size = list.size(); size < iArr.length; size++) {
                    if (iArr[size] == i10) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (iArr[(size - i11) - 1] != list.get((list.size() - i11) - 1).a().c()) {
                                break;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void F(Collection<b> collection, Collection<c> collection2) {
        Iterator<c> it = collection2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != collection.size()) {
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            break;
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    private void r(int i10) throws NotFoundException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int iD = Jg.a.d(m());
        int iD2 = Jg.a.d(k());
        boolean z15 = true;
        boolean z16 = false;
        if (iD > 13) {
            z11 = true;
            z10 = false;
        } else if (iD < 4) {
            z10 = true;
            z11 = false;
        } else {
            z10 = false;
            z11 = false;
        }
        if (iD2 > 13) {
            z13 = true;
            z12 = false;
        } else if (iD2 < 4) {
            z12 = true;
            z13 = false;
        } else {
            z12 = false;
            z13 = false;
        }
        int i11 = (iD + iD2) - i10;
        if ((iD & 1) == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((iD2 & 1) == 0) {
            z16 = true;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    if (z14) {
                        if (!z16) {
                            z11 = true;
                        } else {
                            throw NotFoundException.a();
                        }
                    } else if (z16) {
                        z13 = true;
                    } else {
                        throw NotFoundException.a();
                    }
                } else {
                    throw NotFoundException.a();
                }
            } else if (z14) {
                if (z16) {
                    if (iD < iD2) {
                        z13 = true;
                    } else {
                        z12 = true;
                        z11 = true;
                    }
                } else {
                    throw NotFoundException.a();
                }
            } else if (z16) {
                throw NotFoundException.a();
            }
            z15 = z10;
        } else if (z14) {
            if (z16) {
                throw NotFoundException.a();
            }
        } else if (z16) {
            z12 = true;
            z15 = z10;
        } else {
            throw NotFoundException.a();
        }
        if (z15) {
            if (!z11) {
                Sg.a.o(m(), n());
            } else {
                throw NotFoundException.a();
            }
        }
        if (z11) {
            Sg.a.h(m(), n());
        }
        if (z12) {
            if (!z13) {
                Sg.a.o(k(), n());
            } else {
                throw NotFoundException.a();
            }
        }
        if (z13) {
            Sg.a.h(k(), l());
        }
    }

    static m v(List<b> list) throws NotFoundException, FormatException {
        String strD = j.a(a.a(list)).d();
        o[] oVarArrA = list.get(0).a().a();
        o[] oVarArrA2 = list.get(list.size() - 1).a().a();
        m mVar = new m(strD, null, new o[]{oVarArrA[0], oVarArrA[1], oVarArrA2[0], oVarArrA2[1]}, com.google.zxing.a.RSS_EXPANDED);
        mVar.h(n.SYMBOLOGY_IDENTIFIER, "]e0");
        return mVar;
    }

    private void y(Ig.a aVar, List<b> list, int i10) throws NotFoundException {
        boolean z10;
        int[] iArrJ = j();
        iArrJ[0] = 0;
        iArrJ[1] = 0;
        iArrJ[2] = 0;
        iArrJ[3] = 0;
        int iL = aVar.l();
        if (i10 < 0) {
            if (list.isEmpty()) {
                i10 = 0;
            } else {
                i10 = list.get(list.size() - 1).a().b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36238j) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (true) {
            if (i10 >= iL) {
                break;
            }
            boolean zG = aVar.g(i10);
            boolean z12 = !zG;
            if (zG) {
                z11 = z12;
                break;
            } else {
                i10++;
                z11 = z12;
            }
        }
        int i11 = 0;
        boolean z13 = z11;
        int i12 = i10;
        while (i10 < iL) {
            if (aVar.g(i10) != z13) {
                iArrJ[i11] = iArrJ[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        H(iArrJ);
                    }
                    if (Sg.a.p(iArrJ)) {
                        int[] iArr = this.f36237i;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        H(iArrJ);
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
                z13 = !z13;
            }
            i10++;
        }
        throw NotFoundException.a();
    }

    private static int z(Ig.a aVar, int i10) {
        if (aVar.g(i10)) {
            return aVar.j(aVar.k(i10));
        }
        return aVar.k(aVar.j(i10));
    }

    b G(Ig.a aVar, List<b> list, int i10) throws NotFoundException {
        boolean z10;
        Sg.c cVarE;
        if (list.size() % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36238j) {
            z10 = !z10;
        }
        Sg.b bVarW = null;
        int iZ = -1;
        boolean z11 = true;
        Sg.b bVarW2 = null;
        do {
            y(aVar, list, iZ);
            cVarE = E(aVar, i10, z10, list);
            if (cVarE == null) {
                iZ = z(aVar, this.f36237i[0]);
            } else {
                try {
                    bVarW2 = w(aVar, cVarE, z10, true);
                    z11 = false;
                } catch (NotFoundException unused) {
                    iZ = z(aVar, this.f36237i[0]);
                }
            }
        } while (z11);
        if (!list.isEmpty() && list.get(list.size() - 1).d()) {
            throw NotFoundException.a();
        }
        try {
            bVarW = w(aVar, cVarE, z10, false);
        } catch (NotFoundException unused2) {
        }
        return new b(bVarW2, bVarW, cVarE);
    }
}
