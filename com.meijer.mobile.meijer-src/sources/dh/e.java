package dh;

import bh.j;
import com.google.zxing.WriterException;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* loaded from: classes8.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f128512a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    private static final int[][] f128513b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    private static final int[][] f128514c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, BinsView.TOTE_WIDTH_DP}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f128515d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void c(C13682b c13682b) {
        c13682b.a((byte) -1);
    }

    private static void g(int i10, int i11, C13682b c13682b) throws WriterException {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!o(c13682b.b(i13, i11))) {
                throw new WriterException();
            }
            c13682b.f(i13, i11, 0);
        }
    }

    private static void h(int i10, int i11, C13682b c13682b) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f128513b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                c13682b.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void i(int i10, int i11, C13682b c13682b) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f128512a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                c13682b.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void m(int i10, int i11, C13682b c13682b) throws WriterException {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!o(c13682b.b(i10, i13))) {
                throw new WriterException();
            }
            c13682b.f(i10, i13, 0);
        }
    }

    private static boolean o(int i10) {
        return i10 == -1;
    }

    static int b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i11);
        int iN2 = i10 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i11 << (n(iN2) - iN);
        }
        return iN2;
    }

    private static void j(C13682b c13682b) throws WriterException {
        int length = f128512a[0].length;
        i(0, 0, c13682b);
        i(c13682b.e() - length, 0, c13682b);
        i(0, c13682b.e() - length, c13682b);
        g(0, 7, c13682b);
        g(c13682b.e() - 8, 7, c13682b);
        g(0, c13682b.e() - 8, c13682b);
        m(7, 0, c13682b);
        m(c13682b.d() - 8, 0, c13682b);
        m(7, c13682b.d() - 7, c13682b);
    }

    private static void k(C13682b c13682b) {
        int i10 = 8;
        while (i10 < c13682b.e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (o(c13682b.b(i10, 6))) {
                c13682b.f(i10, 6, i12);
            }
            if (o(c13682b.b(6, i10))) {
                c13682b.f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    static void l(bh.f fVar, int i10, C13682b c13682b) throws WriterException {
        int iD;
        Ig.a aVar = new Ig.a();
        p(fVar, i10, aVar);
        for (int i11 = 0; i11 < aVar.l(); i11++) {
            boolean zG = aVar.g((aVar.l() - 1) - i11);
            int[] iArr = f128515d[i11];
            c13682b.g(iArr[0], iArr[1], zG);
            int iE = 8;
            if (i11 < 8) {
                iD = 8;
                iE = (c13682b.e() - i11) - 1;
            } else {
                iD = (c13682b.d() - 7) + (i11 - 8);
            }
            c13682b.g(iE, iD, zG);
        }
    }

    static void a(Ig.a aVar, bh.f fVar, j jVar, int i10, C13682b c13682b) throws WriterException {
        c(c13682b);
        d(jVar, c13682b);
        l(fVar, i10, c13682b);
        s(jVar, c13682b);
        f(aVar, i10, c13682b);
    }

    static void d(j jVar, C13682b c13682b) throws WriterException {
        j(c13682b);
        e(c13682b);
        r(jVar, c13682b);
        k(c13682b);
    }

    private static void e(C13682b c13682b) throws WriterException {
        if (c13682b.b(8, c13682b.d() - 8) != 0) {
            c13682b.f(8, c13682b.d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    static void f(Ig.a aVar, int i10, C13682b c13682b) throws WriterException {
        boolean zG;
        int iE = c13682b.e() - 1;
        int iD = c13682b.d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < c13682b.d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = iE - i13;
                    if (o(c13682b.b(i14, iD))) {
                        if (i11 < aVar.l()) {
                            zG = aVar.g(i11);
                            i11++;
                        } else {
                            zG = false;
                        }
                        if (i10 != -1 && d.f(i10, i14, iD)) {
                            zG = !zG;
                        }
                        c13682b.g(i14, iD, zG);
                    }
                }
                iD += i12;
            }
            i12 = -i12;
            iD += i12;
            iE -= 2;
        }
        if (i11 == aVar.l()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i11 + '/' + aVar.l());
    }

    static int n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    static void p(bh.f fVar, int i10, Ig.a aVar) throws WriterException {
        if (g.b(i10)) {
            int iB = (fVar.b() << 3) | i10;
            aVar.c(iB, 5);
            aVar.c(b(iB, 1335), 10);
            Ig.a aVar2 = new Ig.a();
            aVar2.c(21522, 15);
            aVar.t(aVar2);
            if (aVar.l() == 15) {
                return;
            }
            throw new WriterException("should not happen but we got: " + aVar.l());
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void q(j jVar, Ig.a aVar) throws WriterException {
        aVar.c(jVar.j(), 6);
        aVar.c(b(jVar.j(), 7973), 12);
        if (aVar.l() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar.l());
    }

    private static void r(j jVar, C13682b c13682b) {
        if (jVar.j() >= 2) {
            int[] iArr = f128514c[jVar.j() - 1];
            for (int i10 : iArr) {
                if (i10 >= 0) {
                    for (int i11 : iArr) {
                        if (i11 >= 0 && o(c13682b.b(i11, i10))) {
                            h(i11 - 2, i10 - 2, c13682b);
                        }
                    }
                }
            }
        }
    }

    static void s(j jVar, C13682b c13682b) throws WriterException {
        if (jVar.j() >= 7) {
            Ig.a aVar = new Ig.a();
            q(jVar, aVar);
            int i10 = 17;
            for (int i11 = 0; i11 < 6; i11++) {
                for (int i12 = 0; i12 < 3; i12++) {
                    boolean zG = aVar.g(i10);
                    i10--;
                    c13682b.g(i11, (c13682b.d() - 11) + i12, zG);
                    c13682b.g((c13682b.d() - 11) + i12, i11, zG);
                }
            }
        }
    }
}
