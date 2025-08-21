package com.google.android.gms.internal.ads;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.tv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9671tv {

    /* renamed from: a, reason: collision with root package name */
    private final int f79497a;

    /* renamed from: b, reason: collision with root package name */
    private final int f79498b;

    /* renamed from: c, reason: collision with root package name */
    private final float f79499c;

    /* renamed from: d, reason: collision with root package name */
    private final float f79500d;

    /* renamed from: e, reason: collision with root package name */
    private final float f79501e;

    /* renamed from: f, reason: collision with root package name */
    private final int f79502f;

    /* renamed from: g, reason: collision with root package name */
    private final int f79503g;

    /* renamed from: h, reason: collision with root package name */
    private final int f79504h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f79505i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f79506j;

    /* renamed from: k, reason: collision with root package name */
    private int f79507k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f79508l;

    /* renamed from: m, reason: collision with root package name */
    private int f79509m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f79510n;

    /* renamed from: o, reason: collision with root package name */
    private int f79511o;

    /* renamed from: p, reason: collision with root package name */
    private int f79512p;

    /* renamed from: q, reason: collision with root package name */
    private int f79513q;

    /* renamed from: r, reason: collision with root package name */
    private int f79514r;

    /* renamed from: s, reason: collision with root package name */
    private int f79515s;

    /* renamed from: t, reason: collision with root package name */
    private int f79516t;

    /* renamed from: u, reason: collision with root package name */
    private int f79517u;

    /* renamed from: v, reason: collision with root package name */
    private int f79518v;

    /* renamed from: w, reason: collision with root package name */
    private double f79519w;

    private final int g(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = com.medallia.digital.mobilesdk.l3.f93323c;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                int i18 = this.f79498b * i10;
                iAbs += Math.abs(sArr[i18 + i17] - sArr[(i18 + i11) + i17]);
            }
            int i19 = iAbs * i15;
            int i20 = i13 * i11;
            if (i19 < i20) {
                i13 = iAbs;
            }
            if (i19 < i20) {
                i15 = i11;
            }
            int i21 = iAbs * i14;
            int i22 = i16 * i11;
            if (i21 > i22) {
                i16 = iAbs;
            }
            if (i21 > i22) {
                i14 = i11;
            }
            i11++;
        }
        this.f79517u = i13 / i15;
        this.f79518v = i16 / i14;
        return i15;
    }

    private final void i(short[] sArr, int i10, int i11) {
        int i12;
        for (int i13 = 0; i13 < this.f79504h / i11; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.f79498b;
                i12 = i16 * i11;
                if (i14 < i12) {
                    i15 += sArr[(i16 * i10) + (i12 * i13) + i14];
                    i14++;
                }
            }
            this.f79505i[i13] = (short) (i15 / i12);
        }
    }

    private static void j(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i16] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    private final short[] l(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f79498b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int a() {
        int i10 = this.f79509m * this.f79498b;
        return i10 + i10;
    }

    public final int b() {
        int i10 = this.f79507k * this.f79498b;
        return i10 + i10;
    }

    public final void c() {
        this.f79507k = 0;
        this.f79509m = 0;
        this.f79511o = 0;
        this.f79512p = 0;
        this.f79513q = 0;
        this.f79514r = 0;
        this.f79515s = 0;
        this.f79516t = 0;
        this.f79517u = 0;
        this.f79518v = 0;
        this.f79519w = 0.0d;
    }

    private final void h(short[] sArr, int i10, int i11) {
        short[] sArrL = l(this.f79508l, this.f79509m, i11);
        this.f79508l = sArrL;
        int i12 = this.f79509m;
        int i13 = this.f79498b;
        System.arraycopy(sArr, i10 * i13, sArrL, i12 * i13, i11 * i13);
        this.f79509m += i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k() {
        int iG;
        int i10;
        double d10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        long j10;
        long j11;
        double d11 = this.f79499c / this.f79500d;
        int i17 = this.f79509m;
        int i18 = 0;
        int i19 = 1;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            int i20 = this.f79507k;
            if (i20 >= this.f79504h) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f79514r;
                    if (i22 > 0) {
                        int iMin = Math.min(this.f79504h, i22);
                        h(this.f79506j, i21, iMin);
                        this.f79514r -= iMin;
                        i21 += iMin;
                        d10 = d11;
                        i10 = i19;
                    } else {
                        short[] sArr = this.f79506j;
                        int i23 = this.f79497a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i19;
                        if (this.f79498b == i19 && i24 == i19) {
                            iG = g(sArr, i21, this.f79502f, this.f79503g);
                        } else {
                            i(sArr, i21, i24);
                            int iG2 = g(this.f79505i, i18, this.f79502f / i24, this.f79503g / i24);
                            if (i24 != i19) {
                                int i25 = iG2 * i24;
                                int i26 = i24 * 4;
                                int i27 = this.f79502f;
                                int i28 = i25 - i26;
                                if (i28 >= i27) {
                                    i27 = i28;
                                }
                                int i29 = i25 + i26;
                                int i30 = this.f79503g;
                                if (i29 > i30) {
                                    i29 = i30;
                                }
                                if (this.f79498b == i19) {
                                    iG = g(sArr, i21, i27, i29);
                                } else {
                                    i(sArr, i21, i19);
                                    iG = g(this.f79505i, i18, i27, i29);
                                }
                            } else {
                                iG = iG2;
                            }
                        }
                        int i31 = this.f79517u;
                        int i32 = (i31 == 0 || (i13 = this.f79515s) == 0 || this.f79518v > i31 * 3 || i31 + i31 <= this.f79516t * 3) ? iG : i13;
                        int i33 = i21 + i32;
                        this.f79516t = i31;
                        this.f79515s = iG;
                        double d12 = i32;
                        if (d11 > 1.0d) {
                            short[] sArr2 = this.f79506j;
                            double d13 = d11 - 1.0d;
                            if (d11 >= 2.0d) {
                                double d14 = (d12 / d13) + this.f79519w;
                                int iRound = (int) Math.round(d14);
                                i10 = i19;
                                this.f79519w = d14 - iRound;
                                i12 = iRound;
                            } else {
                                i10 = i19;
                                double d15 = (((2.0d - d11) * d12) / d13) + this.f79519w;
                                int iRound2 = (int) Math.round(d15);
                                this.f79514r = iRound2;
                                this.f79519w = d15 - iRound2;
                                i12 = i32;
                            }
                            short[] sArrL = l(this.f79508l, this.f79509m, i12);
                            this.f79508l = sArrL;
                            int i34 = i21;
                            j(i12, this.f79498b, sArrL, this.f79509m, sArr2, i34, sArr2, i33);
                            this.f79509m += i12;
                            i21 = i34 + i32 + i12;
                            d10 = d11;
                        } else {
                            i10 = i19;
                            int i35 = i32;
                            short[] sArr3 = this.f79506j;
                            double d16 = 1.0d - d11;
                            if (d11 < 0.5d) {
                                d10 = d11;
                                double d17 = ((d12 * d11) / d16) + this.f79519w;
                                int iRound3 = (int) Math.round(d17);
                                this.f79519w = d17 - iRound3;
                                i11 = iRound3;
                            } else {
                                d10 = d11;
                                double d18 = ((d12 * ((d10 + d10) - 1.0d)) / d16) + this.f79519w;
                                int iRound4 = (int) Math.round(d18);
                                this.f79514r = iRound4;
                                this.f79519w = d18 - iRound4;
                                i11 = i35;
                            }
                            int i36 = i35 + i11;
                            short[] sArrL2 = l(this.f79508l, this.f79509m, i36);
                            this.f79508l = sArrL2;
                            int i37 = this.f79498b;
                            System.arraycopy(sArr3, i21 * i37, sArrL2, this.f79509m * i37, i37 * i35);
                            j(i11, this.f79498b, this.f79508l, this.f79509m + i35, sArr3, i33, sArr3, i21);
                            this.f79509m += i36;
                            i21 += i11;
                        }
                    }
                    if (this.f79504h + i21 > i20) {
                        break;
                    }
                    i19 = i10;
                    d11 = d10;
                    i18 = 0;
                }
                int i38 = this.f79507k - i21;
                short[] sArr4 = this.f79506j;
                int i39 = this.f79498b;
                System.arraycopy(sArr4, i21 * i39, sArr4, 0, i39 * i38);
                this.f79507k = i38;
            }
            f10 = this.f79501e * this.f79500d;
            if (f10 != 1.0f || this.f79509m == i17) {
            }
            int i40 = this.f79497a;
            float f11 = i40 / f10;
            long j12 = i40;
            long j13 = (long) f11;
            while (j13 != 0 && j12 != 0 && j13 % 2 == 0 && j12 % 2 == 0) {
                j13 /= 2;
                j12 /= 2;
            }
            int i41 = this.f79509m - i17;
            short[] sArrL3 = l(this.f79510n, this.f79511o, i41);
            this.f79510n = sArrL3;
            short[] sArr5 = this.f79508l;
            int i42 = this.f79498b;
            System.arraycopy(sArr5, i17 * i42, sArrL3, this.f79511o * i42, i42 * i41);
            this.f79509m = i17;
            this.f79511o += i41;
            int i43 = 0;
            while (true) {
                i14 = this.f79511o;
                i15 = i14 - 1;
                if (i43 >= i15) {
                    break;
                }
                while (true) {
                    i16 = this.f79512p + 1;
                    j10 = i16;
                    long j14 = j10 * j13;
                    j11 = this.f79513q;
                    if (j14 <= j11 * j12) {
                        break;
                    }
                    this.f79508l = l(this.f79508l, this.f79509m, i10);
                    int i44 = 0;
                    while (true) {
                        int i45 = this.f79498b;
                        if (i44 < i45) {
                            short[] sArr6 = this.f79508l;
                            int i46 = this.f79509m * i45;
                            short[] sArr7 = this.f79510n;
                            int i47 = (i43 * i45) + i44;
                            short s10 = sArr7[i47];
                            short s11 = sArr7[i47 + i45];
                            long j15 = this.f79513q * j12;
                            long j16 = j12;
                            long j17 = (r13 + 1) * j13;
                            long j18 = j17 - (this.f79512p * j13);
                            long j19 = j17 - j15;
                            sArr6[i46 + i44] = (short) (((j19 * s10) + ((j18 - j19) * s11)) / j18);
                            i44++;
                            j12 = j16;
                        }
                    }
                    i10 = 1;
                    this.f79513q++;
                    this.f79509m++;
                    j12 = j12;
                }
                long j20 = j12;
                this.f79512p = i16;
                if (j10 == j20) {
                    this.f79512p = 0;
                    C8211gC.f(j11 == j13 ? i10 : 0);
                    this.f79513q = 0;
                }
                i43++;
                j12 = j20;
            }
            if (i15 != 0) {
                short[] sArr8 = this.f79510n;
                int i48 = this.f79498b;
                System.arraycopy(sArr8, i15 * i48, sArr8, 0, (i14 - i15) * i48);
                this.f79511o -= i15;
                return;
            }
            return;
        }
        h(this.f79506j, 0, this.f79507k);
        this.f79507k = 0;
        i10 = 1;
        f10 = this.f79501e * this.f79500d;
        if (f10 != 1.0f) {
        }
    }

    public final void e() {
        int i10;
        int i11 = this.f79507k;
        int i12 = this.f79514r;
        int i13 = this.f79509m;
        float f10 = this.f79499c;
        float f11 = this.f79500d;
        int i14 = i13 + ((int) (((((((i11 - i12) / (f10 / f11)) + i12) + this.f79519w) + this.f79511o) / (this.f79501e * f11)) + 0.5d));
        this.f79519w = 0.0d;
        int i15 = this.f79504h;
        this.f79506j = l(this.f79506j, i11, i15 + i15 + i11);
        int i16 = 0;
        while (true) {
            int i17 = this.f79504h;
            int i18 = this.f79498b;
            i10 = i17 + i17;
            if (i16 >= i10 * i18) {
                break;
            }
            this.f79506j[(i18 * i11) + i16] = 0;
            i16++;
        }
        this.f79507k += i10;
        k();
        if (this.f79509m > i14) {
            this.f79509m = i14;
        }
        this.f79507k = 0;
        this.f79514r = 0;
        this.f79511o = 0;
    }

    public C9671tv(int i10, int i11, float f10, float f11, int i12) {
        this.f79497a = i10;
        this.f79498b = i11;
        this.f79499c = f10;
        this.f79500d = f11;
        this.f79501e = i10 / i12;
        this.f79502f = i10 / HttpResponseStatus.ERROR_BAD_REQUEST;
        int i13 = i10 / 65;
        this.f79503g = i13;
        int i14 = i13 + i13;
        this.f79504h = i14;
        this.f79505i = new short[i14];
        int i15 = i14 * i11;
        this.f79506j = new short[i15];
        this.f79508l = new short[i15];
        this.f79510n = new short[i15];
    }

    public final void d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f79498b, this.f79509m);
        shortBuffer.put(this.f79508l, 0, this.f79498b * iMin);
        int i10 = this.f79509m - iMin;
        this.f79509m = i10;
        int i11 = this.f79498b;
        short[] sArr = this.f79508l;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public final void f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f79498b;
        int i11 = iRemaining / i10;
        int i12 = i10 * i11;
        short[] sArrL = l(this.f79506j, this.f79507k, i11);
        this.f79506j = sArrL;
        shortBuffer.get(sArrL, this.f79507k * this.f79498b, (i12 + i12) / 2);
        this.f79507k += i11;
        k();
    }
}
