package bh;

import Zg.j;
import com.google.zxing.WriterException;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* renamed from: bh.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6254e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f60277a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    private static final int[][] f60278b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    private static final int[][] f60279c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, BinsView.TOTE_WIDTH_DP}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f60280d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void c(C6251b c6251b) {
        c6251b.a((byte) -1);
    }

    private static void g(int i10, int i11, C6251b c6251b) throws WriterException {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!o(c6251b.b(i13, i11))) {
                throw new WriterException();
            }
            c6251b.f(i13, i11, 0);
        }
    }

    private static void h(int i10, int i11, C6251b c6251b) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f60278b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                c6251b.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void i(int i10, int i11, C6251b c6251b) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f60277a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                c6251b.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void m(int i10, int i11, C6251b c6251b) throws WriterException {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!o(c6251b.b(i10, i13))) {
                throw new WriterException();
            }
            c6251b.f(i10, i13, 0);
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

    private static void j(C6251b c6251b) throws WriterException {
        int length = f60277a[0].length;
        i(0, 0, c6251b);
        i(c6251b.e() - length, 0, c6251b);
        i(0, c6251b.e() - length, c6251b);
        g(0, 7, c6251b);
        g(c6251b.e() - 8, 7, c6251b);
        g(0, c6251b.e() - 8, c6251b);
        m(7, 0, c6251b);
        m(c6251b.d() - 8, 0, c6251b);
        m(7, c6251b.d() - 7, c6251b);
    }

    private static void k(C6251b c6251b) {
        int i10 = 8;
        while (i10 < c6251b.e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (o(c6251b.b(i10, 6))) {
                c6251b.f(i10, 6, i12);
            }
            if (o(c6251b.b(6, i10))) {
                c6251b.f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    static void l(Zg.f fVar, int i10, C6251b c6251b) throws WriterException {
        int iD;
        Gg.a aVar = new Gg.a();
        p(fVar, i10, aVar);
        for (int i11 = 0; i11 < aVar.l(); i11++) {
            boolean zG = aVar.g((aVar.l() - 1) - i11);
            int[] iArr = f60280d[i11];
            c6251b.g(iArr[0], iArr[1], zG);
            int iE = 8;
            if (i11 < 8) {
                iD = 8;
                iE = (c6251b.e() - i11) - 1;
            } else {
                iD = (c6251b.d() - 7) + (i11 - 8);
            }
            c6251b.g(iE, iD, zG);
        }
    }

    static void a(Gg.a aVar, Zg.f fVar, j jVar, int i10, C6251b c6251b) throws WriterException {
        c(c6251b);
        d(jVar, c6251b);
        l(fVar, i10, c6251b);
        s(jVar, c6251b);
        f(aVar, i10, c6251b);
    }

    static void d(j jVar, C6251b c6251b) throws WriterException {
        j(c6251b);
        e(c6251b);
        r(jVar, c6251b);
        k(c6251b);
    }

    private static void e(C6251b c6251b) throws WriterException {
        if (c6251b.b(8, c6251b.d() - 8) != 0) {
            c6251b.f(8, c6251b.d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    static void f(Gg.a aVar, int i10, C6251b c6251b) throws WriterException {
        boolean zG;
        int iE = c6251b.e() - 1;
        int iD = c6251b.d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < c6251b.d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = iE - i13;
                    if (o(c6251b.b(i14, iD))) {
                        if (i11 < aVar.l()) {
                            zG = aVar.g(i11);
                            i11++;
                        } else {
                            zG = false;
                        }
                        if (i10 != -1 && C6253d.f(i10, i14, iD)) {
                            zG = !zG;
                        }
                        c6251b.g(i14, iD, zG);
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

    static void p(Zg.f fVar, int i10, Gg.a aVar) throws WriterException {
        if (g.b(i10)) {
            int iB = (fVar.b() << 3) | i10;
            aVar.c(iB, 5);
            aVar.c(b(iB, 1335), 10);
            Gg.a aVar2 = new Gg.a();
            aVar2.c(21522, 15);
            aVar.t(aVar2);
            if (aVar.l() == 15) {
                return;
            }
            throw new WriterException("should not happen but we got: " + aVar.l());
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void q(j jVar, Gg.a aVar) throws WriterException {
        aVar.c(jVar.j(), 6);
        aVar.c(b(jVar.j(), 7973), 12);
        if (aVar.l() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar.l());
    }

    private static void r(j jVar, C6251b c6251b) {
        if (jVar.j() >= 2) {
            int[] iArr = f60279c[jVar.j() - 1];
            for (int i10 : iArr) {
                if (i10 >= 0) {
                    for (int i11 : iArr) {
                        if (i11 >= 0 && o(c6251b.b(i11, i10))) {
                            h(i11 - 2, i10 - 2, c6251b);
                        }
                    }
                }
            }
        }
    }

    static void s(j jVar, C6251b c6251b) throws WriterException {
        if (jVar.j() >= 7) {
            Gg.a aVar = new Gg.a();
            q(jVar, aVar);
            int i10 = 17;
            for (int i11 = 0; i11 < 6; i11++) {
                for (int i12 = 0; i12 < 3; i12++) {
                    boolean zG = aVar.g(i10);
                    i10--;
                    c6251b.g(i11, (c6251b.d() - 11) + i12, zG);
                    c6251b.g((c6251b.d() - 11) + i12, i11, zG);
                }
            }
        }
    }
}
