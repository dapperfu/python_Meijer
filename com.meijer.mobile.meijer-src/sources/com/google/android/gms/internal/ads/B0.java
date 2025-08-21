package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f66229a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66231c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66232d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66233e;

    /* renamed from: f, reason: collision with root package name */
    public final int f66234f;

    /* renamed from: g, reason: collision with root package name */
    public final int f66235g;

    /* renamed from: h, reason: collision with root package name */
    public final int f66236h;

    /* renamed from: i, reason: collision with root package name */
    public final int f66237i;

    /* renamed from: j, reason: collision with root package name */
    public final long f66238j;

    /* renamed from: k, reason: collision with root package name */
    public final A0 f66239k;

    /* renamed from: l, reason: collision with root package name */
    private final C8776lb f66240l;

    private B0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, A0 a02, C8776lb c8776lb) {
        this.f66229a = i10;
        this.f66230b = i11;
        this.f66231c = i12;
        this.f66232d = i13;
        this.f66233e = i14;
        this.f66234f = i(i14);
        this.f66235g = i15;
        this.f66236h = i16;
        this.f66237i = h(i16);
        this.f66238j = j10;
        this.f66239k = a02;
        this.f66240l = c8776lb;
    }

    private static int h(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final C c(byte[] bArr, C8776lb c8776lb) {
        bArr[4] = Byte.MIN_VALUE;
        C8776lb c8776lbD = d(c8776lb);
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.B("audio/flac");
        int i10 = this.f66232d;
        if (i10 <= 0) {
            i10 = -1;
        }
        c9717uH0.r(i10);
        c9717uH0.r0(this.f66235g);
        c9717uH0.C(this.f66233e);
        c9717uH0.u(OV.F(this.f66236h));
        c9717uH0.n(Collections.singletonList(bArr));
        c9717uH0.t(c8776lbD);
        return c9717uH0.H();
    }

    public final B0 f(A0 a02) {
        return new B0(this.f66229a, this.f66230b, this.f66231c, this.f66232d, this.f66233e, this.f66235g, this.f66236h, this.f66238j, a02, this.f66240l);
    }

    public B0(byte[] bArr, int i10) {
        C8124fQ c8124fQ = new C8124fQ(bArr, bArr.length);
        c8124fQ.l(i10 * 8);
        this.f66229a = c8124fQ.d(16);
        this.f66230b = c8124fQ.d(16);
        this.f66231c = c8124fQ.d(24);
        this.f66232d = c8124fQ.d(24);
        int iD = c8124fQ.d(20);
        this.f66233e = iD;
        this.f66234f = i(iD);
        this.f66235g = c8124fQ.d(3) + 1;
        int iD2 = c8124fQ.d(5) + 1;
        this.f66236h = iD2;
        this.f66237i = h(iD2);
        this.f66238j = c8124fQ.e(36);
        this.f66239k = null;
        this.f66240l = null;
    }

    public final long a() {
        long j10 = this.f66238j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f66233e;
    }

    public final long b(long j10) {
        return Math.max(0L, Math.min((j10 * this.f66233e) / 1000000, this.f66238j - 1));
    }

    public final C8776lb d(C8776lb c8776lb) {
        C8776lb c8776lb2 = this.f66240l;
        return c8776lb2 == null ? c8776lb : c8776lb2.d(c8776lb);
    }

    public final B0 e(List list) {
        return new B0(this.f66229a, this.f66230b, this.f66231c, this.f66232d, this.f66233e, this.f66235g, this.f66236h, this.f66238j, this.f66239k, d(new C8776lb(list)));
    }

    public final B0 g(List list) {
        return new B0(this.f66229a, this.f66230b, this.f66231c, this.f66232d, this.f66233e, this.f66235g, this.f66236h, this.f66238j, this.f66239k, d(C7869d1.b(list)));
    }
}
