package androidx.media3.common.audio;

import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13466a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f55361a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55362b;

    /* renamed from: c, reason: collision with root package name */
    private final float f55363c;

    /* renamed from: d, reason: collision with root package name */
    private final float f55364d;

    /* renamed from: e, reason: collision with root package name */
    private final float f55365e;

    /* renamed from: f, reason: collision with root package name */
    private final int f55366f;

    /* renamed from: g, reason: collision with root package name */
    private final int f55367g;

    /* renamed from: h, reason: collision with root package name */
    private final int f55368h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f55369i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f55370j;

    /* renamed from: k, reason: collision with root package name */
    private int f55371k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f55372l;

    /* renamed from: m, reason: collision with root package name */
    private int f55373m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f55374n;

    /* renamed from: o, reason: collision with root package name */
    private int f55375o;

    /* renamed from: p, reason: collision with root package name */
    private int f55376p;

    /* renamed from: q, reason: collision with root package name */
    private int f55377q;

    /* renamed from: r, reason: collision with root package name */
    private int f55378r;

    /* renamed from: s, reason: collision with root package name */
    private int f55379s;

    /* renamed from: t, reason: collision with root package name */
    private int f55380t;

    /* renamed from: u, reason: collision with root package name */
    private int f55381u;

    /* renamed from: v, reason: collision with root package name */
    private int f55382v;

    /* renamed from: w, reason: collision with root package name */
    private double f55383w;

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f55362b;
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
        return i10 != 0 && this.f55379s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f55380t * 3;
    }

    public void i() {
        this.f55371k = 0;
        this.f55373m = 0;
        this.f55375o = 0;
        this.f55376p = 0;
        this.f55377q = 0;
        this.f55378r = 0;
        this.f55379s = 0;
        this.f55380t = 0;
        this.f55381u = 0;
        this.f55382v = 0;
        this.f55383w = 0.0d;
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f55373m == i10) {
            return;
        }
        int i13 = this.f55361a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f55375o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f55376p;
                long j12 = (i11 + 1) * j10;
                i12 = this.f55377q;
                if (j12 <= i12 * j11) {
                    break;
                }
                this.f55372l = f(this.f55372l, this.f55373m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f55362b;
                    if (i16 < i17) {
                        this.f55372l[(this.f55373m * i17) + i16] = n(this.f55374n, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f55377q++;
                this.f55373m++;
            }
            int i18 = i11 + 1;
            this.f55376p = i18;
            if (i18 == j11) {
                this.f55376p = 0;
                C13466a.g(((long) i12) == j10);
                this.f55377q = 0;
            }
            i14++;
        }
    }

    private void b(double d10) {
        c cVar;
        double d11;
        int i10 = this.f55371k;
        if (i10 < this.f55368h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f55378r > 0) {
                iM += c(iM);
                cVar = this;
                d11 = d10;
            } else {
                int iG = g(this.f55370j, iM);
                if (d10 > 1.0d) {
                    cVar = this;
                    d11 = d10;
                    iM += iG + cVar.w(this.f55370j, iM, d11, iG);
                } else {
                    cVar = this;
                    d11 = d10;
                    iM += cVar.m(cVar.f55370j, iM, d11, iG);
                }
            }
            if (cVar.f55368h + iM > i10) {
                v(iM);
                return;
            }
            d10 = d11;
        }
    }

    private int c(int i10) {
        int iMin = Math.min(this.f55368h, this.f55378r);
        d(this.f55370j, i10, iMin);
        this.f55378r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f55372l, this.f55373m, i11);
        this.f55372l = sArrF;
        int i12 = this.f55362b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f55373m * i12, i12 * i11);
        this.f55373m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f55368h / i11;
        int i13 = this.f55362b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f55369i[i16] = (short) (i17 / i14);
        }
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f55361a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f55362b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f55366f, this.f55367g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f55369i, 0, this.f55366f / i12, this.f55367g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f55366f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f55367g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f55362b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f55369i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f55381u, this.f55382v) ? this.f55379s : iH;
        this.f55380t = this.f55381u;
        this.f55379s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f55362b;
        int i14 = l3.f92484c;
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
        this.f55381u = i15 / i16;
        this.f55382v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((i11 * d10) / (1.0d - d10)) + this.f55383w;
            int iRound = (int) Math.round(d11);
            this.f55383w = d11 - iRound;
            i12 = iRound;
        } else {
            double d12 = ((i11 * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f55383w;
            int iRound2 = (int) Math.round(d12);
            this.f55378r = iRound2;
            this.f55383w = d12 - iRound2;
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f55372l, this.f55373m, i13);
        this.f55372l = sArrF;
        int i14 = this.f55362b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f55373m * i14, i14 * i11);
        p(i12, this.f55362b, this.f55372l, this.f55373m + i11, sArr, i10 + i11, sArr, i10);
        this.f55373m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f55362b];
        long j12 = this.f55377q * j10;
        long j13 = this.f55376p * j11;
        long j14 = (r7 + 1) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((s10 * j15) + ((j16 - j15) * s11)) / j16);
    }

    private void o(int i10) {
        int i11 = this.f55373m - i10;
        short[] sArrF = f(this.f55374n, this.f55375o, i11);
        this.f55374n = sArrF;
        short[] sArr = this.f55372l;
        int i12 = this.f55362b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f55375o * i12, i12 * i11);
        this.f55373m = i10;
        this.f55375o += i11;
    }

    private void r() {
        int i10 = this.f55373m;
        float f10 = this.f55363c;
        float f11 = this.f55364d;
        double d10 = f10 / f11;
        float f12 = this.f55365e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            b(d10);
        } else {
            d(this.f55370j, 0, this.f55371k);
            this.f55371k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f55374n;
        int i11 = this.f55362b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f55375o - i10) * i11);
        this.f55375o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f55371k - i10;
        short[] sArr = this.f55370j;
        int i12 = this.f55362b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f55371k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (i11 / (d10 - 1.0d)) + this.f55383w;
            int iRound = (int) Math.round(d11);
            this.f55383w = d11 - iRound;
            i12 = iRound;
        } else {
            double d12 = ((i11 * (2.0d - d10)) / (d10 - 1.0d)) + this.f55383w;
            int iRound2 = (int) Math.round(d12);
            this.f55378r = iRound2;
            this.f55383w = d12 - iRound2;
            i12 = i11;
        }
        short[] sArrF = f(this.f55372l, this.f55373m, i12);
        this.f55372l = sArrF;
        p(i12, this.f55362b, sArrF, this.f55373m, sArr, i10, sArr, i10 + i11);
        this.f55373m += i12;
        return i12;
    }

    public void j(ShortBuffer shortBuffer) {
        C13466a.g(this.f55373m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f55362b, this.f55373m);
        shortBuffer.put(this.f55372l, 0, this.f55362b * iMin);
        int i10 = this.f55373m - iMin;
        this.f55373m = i10;
        short[] sArr = this.f55372l;
        int i11 = this.f55362b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        C13466a.g(this.f55373m >= 0);
        return this.f55373m * this.f55362b * 2;
    }

    public int l() {
        return this.f55371k * this.f55362b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f55371k;
        float f10 = this.f55363c;
        float f11 = this.f55364d;
        double d10 = f10 / f11;
        int i12 = this.f55373m + ((int) (((((((i11 - r5) / d10) + this.f55378r) + this.f55383w) + this.f55375o) / (this.f55365e * f11)) + 0.5d));
        this.f55383w = 0.0d;
        this.f55370j = f(this.f55370j, i11, (this.f55368h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f55368h;
            int i14 = this.f55362b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f55370j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f55371k += i10 * 2;
        r();
        if (this.f55373m > i12) {
            this.f55373m = Math.max(i12, 0);
        }
        this.f55371k = 0;
        this.f55378r = 0;
        this.f55375o = 0;
    }

    public c(int i10, int i11, float f10, float f11, int i12) {
        this.f55361a = i10;
        this.f55362b = i11;
        this.f55363c = f10;
        this.f55364d = f11;
        this.f55365e = i10 / i12;
        this.f55366f = i10 / HttpResponseStatus.ERROR_BAD_REQUEST;
        int i13 = i10 / 65;
        this.f55367g = i13;
        int i14 = i13 * 2;
        this.f55368h = i14;
        this.f55369i = new short[i14];
        this.f55370j = new short[i14 * i11];
        this.f55372l = new short[i14 * i11];
        this.f55374n = new short[i14 * i11];
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f55362b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f55370j, this.f55371k, i11);
        this.f55370j = sArrF;
        shortBuffer.get(sArrF, this.f55371k * this.f55362b, ((i10 * i11) * 2) / 2);
        this.f55371k += i11;
        r();
    }
}
