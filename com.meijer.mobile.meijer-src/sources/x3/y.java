package x3;

import a3.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f170347a;

    /* renamed from: b, reason: collision with root package name */
    public final int f170348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f170349c;

    /* renamed from: d, reason: collision with root package name */
    public final int f170350d;

    /* renamed from: e, reason: collision with root package name */
    public final int f170351e;

    /* renamed from: f, reason: collision with root package name */
    public final int f170352f;

    /* renamed from: g, reason: collision with root package name */
    public final int f170353g;

    /* renamed from: h, reason: collision with root package name */
    public final int f170354h;

    /* renamed from: i, reason: collision with root package name */
    public final int f170355i;

    /* renamed from: j, reason: collision with root package name */
    public final long f170356j;

    /* renamed from: k, reason: collision with root package name */
    public final a f170357k;

    /* renamed from: l, reason: collision with root package name */
    private final a3.y f170358l;

    public y(byte[] bArr, int i10) {
        d3.C c10 = new d3.C(bArr);
        c10.p(i10 * 8);
        this.f170347a = c10.h(16);
        this.f170348b = c10.h(16);
        this.f170349c = c10.h(24);
        this.f170350d = c10.h(24);
        int iH = c10.h(20);
        this.f170351e = iH;
        this.f170352f = j(iH);
        this.f170353g = c10.h(3) + 1;
        int iH2 = c10.h(5) + 1;
        this.f170354h = iH2;
        this.f170355i = e(iH2);
        this.f170356j = c10.j(36);
        this.f170357k = null;
        this.f170358l = null;
    }

    public a3.t g(byte[] bArr, a3.y yVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f170350d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new t.b().u0("audio/flac").k0(i10).R(this.f170353g).v0(this.f170351e).o0(d3.P.e0(this.f170354h)).g0(Collections.singletonList(bArr)).n0(h(yVar)).N();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f170359a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f170360b;

        public a(long[] jArr, long[] jArr2) {
            this.f170359a = jArr;
            this.f170360b = jArr2;
        }
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public y a(List<J3.a> list) {
        return new y(this.f170347a, this.f170348b, this.f170349c, this.f170350d, this.f170351e, this.f170353g, this.f170354h, this.f170356j, this.f170357k, h(new a3.y(list)));
    }

    public y b(a aVar) {
        return new y(this.f170347a, this.f170348b, this.f170349c, this.f170350d, this.f170351e, this.f170353g, this.f170354h, this.f170356j, aVar, this.f170358l);
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f170350d;
        if (i10 > 0) {
            j10 = (i10 + this.f170349c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f170347a;
            j10 = ((((i11 != this.f170348b || i11 <= 0) ? 4096L : i11) * this.f170353g) * this.f170354h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f170356j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f170351e;
    }

    public a3.y h(a3.y yVar) {
        a3.y yVar2 = this.f170358l;
        return yVar2 == null ? yVar : yVar2.b(yVar);
    }

    public long i(long j10) {
        return d3.P.p((j10 * this.f170351e) / 1000000, 0L, this.f170356j - 1);
    }

    private static int j(int i10) {
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

    public y c(List<String> list) {
        return new y(this.f170347a, this.f170348b, this.f170349c, this.f170350d, this.f170351e, this.f170353g, this.f170354h, this.f170356j, this.f170357k, h(S.d(list)));
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, a3.y yVar) {
        this.f170347a = i10;
        this.f170348b = i11;
        this.f170349c = i12;
        this.f170350d = i13;
        this.f170351e = i14;
        this.f170352f = j(i14);
        this.f170353g = i15;
        this.f170354h = i16;
        this.f170355i = e(i16);
        this.f170356j = j10;
        this.f170357k = aVar;
        this.f170358l = yVar;
    }
}
