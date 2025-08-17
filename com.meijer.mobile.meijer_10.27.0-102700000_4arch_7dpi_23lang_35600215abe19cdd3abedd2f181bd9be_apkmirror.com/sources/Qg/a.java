package Qg;

import Pg.r;
import com.google.android.gms.common.api.a;
import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
public abstract class a extends r {

    /* renamed from: b, reason: collision with root package name */
    private final int[] f30024b;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f30027e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f30028f;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f30023a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f30025c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f30026d = new float[4];

    protected static void h(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    protected static void o(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 > f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    protected static boolean p(int[] iArr) {
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i10 = a.e.API_PRIORITY_OTHER;
            int i11 = Integer.MIN_VALUE;
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
                if (i12 < i10) {
                    i10 = i12;
                }
            }
            if (i11 < i10 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int q(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (r.e(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw NotFoundException.a();
    }

    protected final int[] i() {
        return this.f30024b;
    }

    protected final int[] j() {
        return this.f30023a;
    }

    protected final int[] k() {
        return this.f30028f;
    }

    protected final float[] l() {
        return this.f30026d;
    }

    protected final int[] m() {
        return this.f30027e;
    }

    protected final float[] n() {
        return this.f30025c;
    }

    protected a() {
        int[] iArr = new int[8];
        this.f30024b = iArr;
        this.f30027e = new int[iArr.length / 2];
        this.f30028f = new int[iArr.length / 2];
    }
}
