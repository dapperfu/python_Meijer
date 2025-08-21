package ch;

import com.google.zxing.NotFoundException;
import com.google.zxing.p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ch.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6509b {

    /* renamed from: a, reason: collision with root package name */
    private final Ig.b f62485a;

    /* renamed from: c, reason: collision with root package name */
    private final int f62487c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62488d;

    /* renamed from: e, reason: collision with root package name */
    private final int f62489e;

    /* renamed from: f, reason: collision with root package name */
    private final int f62490f;

    /* renamed from: g, reason: collision with root package name */
    private final float f62491g;

    /* renamed from: i, reason: collision with root package name */
    private final p f62493i;

    /* renamed from: b, reason: collision with root package name */
    private final List<C6508a> f62486b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    private final int[] f62492h = new int[3];

    private static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private C6508a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i11);
        float fB = b(i10, (int) fA, iArr[1] * 2, i12);
        if (Float.isNaN(fB)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C6508a c6508a : this.f62486b) {
            if (c6508a.f(f10, fB, fA)) {
                return c6508a.g(fB, fA, f10);
            }
        }
        C6508a c6508a2 = new C6508a(fA, fB, f10);
        this.f62486b.add(c6508a2);
        p pVar = this.f62493i;
        if (pVar == null) {
            return null;
        }
        pVar.a(c6508a2);
        return null;
    }

    private float b(int i10, int i11, int i12, int i13) {
        Ig.b bVar = this.f62485a;
        int iJ = bVar.j();
        int[] iArr = this.f62492h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && bVar.f(i11, i14)) {
            int i15 = iArr[1];
            if (i15 > i12) {
                break;
            }
            iArr[1] = i15 + 1;
            i14--;
        }
        if (i14 >= 0 && iArr[1] <= i12) {
            while (i14 >= 0 && !bVar.f(i11, i14)) {
                int i16 = iArr[0];
                if (i16 > i12) {
                    break;
                }
                iArr[0] = i16 + 1;
                i14--;
            }
            if (iArr[0] > i12) {
                return Float.NaN;
            }
            int i17 = i10 + 1;
            while (i17 < iJ && bVar.f(i11, i17)) {
                int i18 = iArr[1];
                if (i18 > i12) {
                    break;
                }
                iArr[1] = i18 + 1;
                i17++;
            }
            if (i17 != iJ && iArr[1] <= i12) {
                while (i17 < iJ && !bVar.f(i11, i17)) {
                    int i19 = iArr[2];
                    if (i19 > i12) {
                        break;
                    }
                    iArr[2] = i19 + 1;
                    i17++;
                }
                int i20 = iArr[2];
                if (i20 <= i12 && Math.abs(((iArr[0] + iArr[1]) + i20) - i13) * 5 < i13 * 2 && d(iArr)) {
                    return a(iArr, i17);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f10 = this.f62491g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    C6508a c() throws NotFoundException {
        C6508a c6508aE;
        C6508a c6508aE2;
        int i10 = this.f62487c;
        int i11 = this.f62490f;
        int i12 = this.f62489e + i10;
        int i13 = this.f62488d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f62485a.f(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f62485a.f(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else {
                    if (d(iArr) && (c6508aE2 = e(iArr, i15, i16)) != null) {
                        return c6508aE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (c6508aE = e(iArr, i15, i12)) != null) {
                return c6508aE;
            }
        }
        if (this.f62486b.isEmpty()) {
            throw NotFoundException.a();
        }
        return this.f62486b.get(0);
    }

    C6509b(Ig.b bVar, int i10, int i11, int i12, int i13, float f10, p pVar) {
        this.f62485a = bVar;
        this.f62487c = i10;
        this.f62488d = i11;
        this.f62489e = i12;
        this.f62490f = i13;
        this.f62491g = f10;
        this.f62493i = pVar;
    }
}
