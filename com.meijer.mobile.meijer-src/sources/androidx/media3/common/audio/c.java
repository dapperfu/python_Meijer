package androidx.media3.common.audio;

import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13599a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f55585a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55586b;

    /* renamed from: c, reason: collision with root package name */
    private final float f55587c;

    /* renamed from: d, reason: collision with root package name */
    private final float f55588d;

    /* renamed from: e, reason: collision with root package name */
    private final float f55589e;

    /* renamed from: f, reason: collision with root package name */
    private final int f55590f;

    /* renamed from: g, reason: collision with root package name */
    private final int f55591g;

    /* renamed from: h, reason: collision with root package name */
    private final int f55592h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f55593i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f55594j;

    /* renamed from: k, reason: collision with root package name */
    private int f55595k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f55596l;

    /* renamed from: m, reason: collision with root package name */
    private int f55597m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f55598n;

    /* renamed from: o, reason: collision with root package name */
    private int f55599o;

    /* renamed from: p, reason: collision with root package name */
    private int f55600p;

    /* renamed from: q, reason: collision with root package name */
    private int f55601q;

    /* renamed from: r, reason: collision with root package name */
    private int f55602r;

    /* renamed from: s, reason: collision with root package name */
    private int f55603s;

    /* renamed from: t, reason: collision with root package name */
    private int f55604t;

    /* renamed from: u, reason: collision with root package name */
    private int f55605u;

    /* renamed from: v, reason: collision with root package name */
    private int f55606v;

    /* renamed from: w, reason: collision with root package name */
    private double f55607w;

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f55586b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f55603s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f55604t * 3;
    }

    public void i() {
        this.f55595k = 0;
        this.f55597m = 0;
        this.f55599o = 0;
        this.f55600p = 0;
        this.f55601q = 0;
        this.f55602r = 0;
        this.f55603s = 0;
        this.f55604t = 0;
        this.f55605u = 0;
        this.f55606v = 0;
        this.f55607w = 0.0d;
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f55597m == i10) {
            return;
        }
        int i13 = this.f55585a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f55599o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f55600p;
                long j12 = (i11 + 1) * j10;
                i12 = this.f55601q;
                if (j12 <= i12 * j11) {
                    break;
                }
                this.f55596l = f(this.f55596l, this.f55597m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f55586b;
                    if (i16 < i17) {
                        this.f55596l[(this.f55597m * i17) + i16] = n(this.f55598n, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f55601q++;
                this.f55597m++;
            }
            int i18 = i11 + 1;
            this.f55600p = i18;
            if (i18 == j11) {
                this.f55600p = 0;
                C13599a.g(((long) i12) == j10);
                this.f55601q = 0;
            }
            i14++;
        }
    }

    private void b(double d10) {
        c cVar;
        double d11;
        int i10 = this.f55595k;
        if (i10 < this.f55592h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f55602r > 0) {
                iM += c(iM);
                cVar = this;
                d11 = d10;
            } else {
                int iG = g(this.f55594j, iM);
                if (d10 > 1.0d) {
                    cVar = this;
                    d11 = d10;
                    iM += iG + cVar.w(this.f55594j, iM, d11, iG);
                } else {
                    cVar = this;
                    d11 = d10;
                    iM += cVar.m(cVar.f55594j, iM, d11, iG);
                }
            }
            if (cVar.f55592h + iM > i10) {
                v(iM);
                return;
            }
            d10 = d11;
        }
    }

    private int c(int i10) {
        int iMin = Math.min(this.f55592h, this.f55602r);
        d(this.f55594j, i10, iMin);
        this.f55602r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f55596l, this.f55597m, i11);
        this.f55596l = sArrF;
        int i12 = this.f55586b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f55597m * i12, i12 * i11);
        this.f55597m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f55592h / i11;
        int i13 = this.f55586b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f55593i[i16] = (short) (i17 / i14);
        }
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f55585a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f55586b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f55590f, this.f55591g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f55593i, 0, this.f55590f / i12, this.f55591g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f55590f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f55591g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f55586b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f55593i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f55605u, this.f55606v) ? this.f55603s : iH;
        this.f55604t = this.f55605u;
        this.f55603s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f55586b;
        int i14 = l3.f93323c;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f55605u = i15 / i16;
        this.f55606v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((i11 * d10) / (1.0d - d10)) + this.f55607w;
            int iRound = (int) Math.round(d11);
            this.f55607w = d11 - iRound;
            i12 = iRound;
        } else {
            double d12 = ((i11 * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f55607w;
            int iRound2 = (int) Math.round(d12);
            this.f55602r = iRound2;
            this.f55607w = d12 - iRound2;
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f55596l, this.f55597m, i13);
        this.f55596l = sArrF;
        int i14 = this.f55586b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f55597m * i14, i14 * i11);
        p(i12, this.f55586b, this.f55596l, this.f55597m + i11, sArr, i10 + i11, sArr, i10);
        this.f55597m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f55586b];
        long j12 = this.f55601q * j10;
        long j13 = this.f55600p * j11;
        long j14 = (r7 + 1) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((s10 * j15) + ((j16 - j15) * s11)) / j16);
    }

    private void o(int i10) {
        int i11 = this.f55597m - i10;
        short[] sArrF = f(this.f55598n, this.f55599o, i11);
        this.f55598n = sArrF;
        short[] sArr = this.f55596l;
        int i12 = this.f55586b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f55599o * i12, i12 * i11);
        this.f55597m = i10;
        this.f55599o += i11;
    }

    private void r() {
        int i10 = this.f55597m;
        float f10 = this.f55587c;
        float f11 = this.f55588d;
        double d10 = f10 / f11;
        float f12 = this.f55589e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            b(d10);
        } else {
            d(this.f55594j, 0, this.f55595k);
            this.f55595k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f55598n;
        int i11 = this.f55586b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f55599o - i10) * i11);
        this.f55599o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f55595k - i10;
        short[] sArr = this.f55594j;
        int i12 = this.f55586b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f55595k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (i11 / (d10 - 1.0d)) + this.f55607w;
            int iRound = (int) Math.round(d11);
            this.f55607w = d11 - iRound;
            i12 = iRound;
        } else {
            double d12 = ((i11 * (2.0d - d10)) / (d10 - 1.0d)) + this.f55607w;
            int iRound2 = (int) Math.round(d12);
            this.f55602r = iRound2;
            this.f55607w = d12 - iRound2;
            i12 = i11;
        }
        short[] sArrF = f(this.f55596l, this.f55597m, i12);
        this.f55596l = sArrF;
        p(i12, this.f55586b, sArrF, this.f55597m, sArr, i10, sArr, i10 + i11);
        this.f55597m += i12;
        return i12;
    }

    public void j(ShortBuffer shortBuffer) {
        C13599a.g(this.f55597m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f55586b, this.f55597m);
        shortBuffer.put(this.f55596l, 0, this.f55586b * iMin);
        int i10 = this.f55597m - iMin;
        this.f55597m = i10;
        short[] sArr = this.f55596l;
        int i11 = this.f55586b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        C13599a.g(this.f55597m >= 0);
        return this.f55597m * this.f55586b * 2;
    }

    public int l() {
        return this.f55595k * this.f55586b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f55595k;
        float f10 = this.f55587c;
        float f11 = this.f55588d;
        double d10 = f10 / f11;
        int i12 = this.f55597m + ((int) (((((((i11 - r5) / d10) + this.f55602r) + this.f55607w) + this.f55599o) / (this.f55589e * f11)) + 0.5d));
        this.f55607w = 0.0d;
        this.f55594j = f(this.f55594j, i11, (this.f55592h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f55592h;
            int i14 = this.f55586b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f55594j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f55595k += i10 * 2;
        r();
        if (this.f55597m > i12) {
            this.f55597m = Math.max(i12, 0);
        }
        this.f55595k = 0;
        this.f55602r = 0;
        this.f55599o = 0;
    }

    public c(int i10, int i11, float f10, float f11, int i12) {
        this.f55585a = i10;
        this.f55586b = i11;
        this.f55587c = f10;
        this.f55588d = f11;
        this.f55589e = i10 / i12;
        this.f55590f = i10 / HttpResponseStatus.ERROR_BAD_REQUEST;
        int i13 = i10 / 65;
        this.f55591g = i13;
        int i14 = i13 * 2;
        this.f55592h = i14;
        this.f55593i = new short[i14];
        this.f55594j = new short[i14 * i11];
        this.f55596l = new short[i14 * i11];
        this.f55598n = new short[i14 * i11];
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f55586b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f55594j, this.f55595k, i11);
        this.f55594j = sArrF;
        shortBuffer.get(sArrF, this.f55595k * this.f55586b, ((i10 * i11) * 2) / 2);
        this.f55595k += i11;
        r();
    }
}
