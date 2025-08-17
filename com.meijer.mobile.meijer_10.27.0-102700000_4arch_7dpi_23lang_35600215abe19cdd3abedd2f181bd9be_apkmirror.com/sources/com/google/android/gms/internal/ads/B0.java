package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65391c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65392d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65393e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65394f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65395g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65396h;

    /* renamed from: i, reason: collision with root package name */
    public final int f65397i;

    /* renamed from: j, reason: collision with root package name */
    public final long f65398j;

    /* renamed from: k, reason: collision with root package name */
    public final A0 f65399k;

    /* renamed from: l, reason: collision with root package name */
    private final C8651lb f65400l;

    private B0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, A0 a02, C8651lb c8651lb) {
        this.f65389a = i10;
        this.f65390b = i11;
        this.f65391c = i12;
        this.f65392d = i13;
        this.f65393e = i14;
        this.f65394f = i(i14);
        this.f65395g = i15;
        this.f65396h = i16;
        this.f65397i = h(i16);
        this.f65398j = j10;
        this.f65399k = a02;
        this.f65400l = c8651lb;
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

    public final C c(byte[] bArr, C8651lb c8651lb) {
        bArr[4] = Byte.MIN_VALUE;
        C8651lb c8651lbD = d(c8651lb);
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.B("audio/flac");
        int i10 = this.f65392d;
        if (i10 <= 0) {
            i10 = -1;
        }
        c9592uH0.r(i10);
        c9592uH0.r0(this.f65395g);
        c9592uH0.C(this.f65393e);
        c9592uH0.u(OV.F(this.f65396h));
        c9592uH0.n(Collections.singletonList(bArr));
        c9592uH0.t(c8651lbD);
        return c9592uH0.H();
    }

    public final B0 f(A0 a02) {
        return new B0(this.f65389a, this.f65390b, this.f65391c, this.f65392d, this.f65393e, this.f65395g, this.f65396h, this.f65398j, a02, this.f65400l);
    }

    public B0(byte[] bArr, int i10) {
        C7999fQ c7999fQ = new C7999fQ(bArr, bArr.length);
        c7999fQ.l(i10 * 8);
        this.f65389a = c7999fQ.d(16);
        this.f65390b = c7999fQ.d(16);
        this.f65391c = c7999fQ.d(24);
        this.f65392d = c7999fQ.d(24);
        int iD = c7999fQ.d(20);
        this.f65393e = iD;
        this.f65394f = i(iD);
        this.f65395g = c7999fQ.d(3) + 1;
        int iD2 = c7999fQ.d(5) + 1;
        this.f65396h = iD2;
        this.f65397i = h(iD2);
        this.f65398j = c7999fQ.e(36);
        this.f65399k = null;
        this.f65400l = null;
    }

    public final long a() {
        long j10 = this.f65398j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f65393e;
    }

    public final long b(long j10) {
        return Math.max(0L, Math.min((j10 * this.f65393e) / 1000000, this.f65398j - 1));
    }

    public final C8651lb d(C8651lb c8651lb) {
        C8651lb c8651lb2 = this.f65400l;
        return c8651lb2 == null ? c8651lb : c8651lb2.d(c8651lb);
    }

    public final B0 e(List list) {
        return new B0(this.f65389a, this.f65390b, this.f65391c, this.f65392d, this.f65393e, this.f65395g, this.f65396h, this.f65398j, this.f65399k, d(new C8651lb(list)));
    }

    public final B0 g(List list) {
        return new B0(this.f65389a, this.f65390b, this.f65391c, this.f65392d, this.f65393e, this.f65395g, this.f65396h, this.f65398j, this.f65399k, d(C7744d1.b(list)));
    }
}
