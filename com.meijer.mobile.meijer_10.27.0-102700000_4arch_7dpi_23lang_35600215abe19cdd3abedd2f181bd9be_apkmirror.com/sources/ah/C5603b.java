package ah;

import com.google.zxing.NotFoundException;
import com.google.zxing.p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ah.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C5603b {

    /* renamed from: a, reason: collision with root package name */
    private final Gg.b f45470a;

    /* renamed from: c, reason: collision with root package name */
    private final int f45472c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45473d;

    /* renamed from: e, reason: collision with root package name */
    private final int f45474e;

    /* renamed from: f, reason: collision with root package name */
    private final int f45475f;

    /* renamed from: g, reason: collision with root package name */
    private final float f45476g;

    /* renamed from: i, reason: collision with root package name */
    private final p f45478i;

    /* renamed from: b, reason: collision with root package name */
    private final List<C5602a> f45471b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    private final int[] f45477h = new int[3];

    private static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private C5602a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i11);
        float fB = b(i10, (int) fA, iArr[1] * 2, i12);
        if (Float.isNaN(fB)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C5602a c5602a : this.f45471b) {
            if (c5602a.f(f10, fB, fA)) {
                return c5602a.g(fB, fA, f10);
            }
        }
        C5602a c5602a2 = new C5602a(fA, fB, f10);
        this.f45471b.add(c5602a2);
        p pVar = this.f45478i;
        if (pVar == null) {
            return null;
        }
        pVar.a(c5602a2);
        return null;
    }

    private float b(int i10, int i11, int i12, int i13) {
        Gg.b bVar = this.f45470a;
        int iJ = bVar.j();
        int[] iArr = this.f45477h;
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
        float f10 = this.f45476g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    C5602a c() throws NotFoundException {
        C5602a c5602aE;
        C5602a c5602aE2;
        int i10 = this.f45472c;
        int i11 = this.f45475f;
        int i12 = this.f45474e + i10;
        int i13 = this.f45473d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f45470a.f(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f45470a.f(i16, i15)) {
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
                    if (d(iArr) && (c5602aE2 = e(iArr, i15, i16)) != null) {
                        return c5602aE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (c5602aE = e(iArr, i15, i12)) != null) {
                return c5602aE;
            }
        }
        if (this.f45471b.isEmpty()) {
            throw NotFoundException.a();
        }
        return this.f45471b.get(0);
    }

    C5603b(Gg.b bVar, int i10, int i11, int i12, int i13, float f10, p pVar) {
        this.f45470a = bVar;
        this.f45472c = i10;
        this.f45473d = i11;
        this.f45474e = i12;
        this.f45475f = i13;
        this.f45476g = f10;
        this.f45478i = pVar;
    }
}
