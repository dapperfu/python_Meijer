package e4;

import d3.P;
import java.io.IOException;
import x3.InterfaceC18012q;

/* renamed from: e4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C13608A {

    /* renamed from: c, reason: collision with root package name */
    private boolean f128187c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f128188d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f128189e;

    /* renamed from: a, reason: collision with root package name */
    private final d3.J f128185a = new d3.J(0);

    /* renamed from: f, reason: collision with root package name */
    private long f128190f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f128191g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f128192h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128186b = new d3.D();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((b10 & 56) >> 3) << 30) | ((b10 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    private int b(InterfaceC18012q interfaceC18012q) {
        this.f128186b.T(P.f127091f);
        this.f128187c = true;
        interfaceC18012q.d();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        int iMin = (int) Math.min(20000L, interfaceC18012q.getLength());
        long j10 = 0;
        if (interfaceC18012q.getPosition() != j10) {
            i10.f169077a = j10;
            return 1;
        }
        this.f128186b.S(iMin);
        interfaceC18012q.d();
        interfaceC18012q.m(this.f128186b.e(), 0, iMin);
        this.f128190f = i(this.f128186b);
        this.f128188d = true;
        return 0;
    }

    public long c() {
        return this.f128192h;
    }

    public d3.J d() {
        return this.f128185a;
    }

    public boolean e() {
        return this.f128187c;
    }

    public int g(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        if (!this.f128189e) {
            return j(interfaceC18012q, i10);
        }
        if (this.f128191g == -9223372036854775807L) {
            return b(interfaceC18012q);
        }
        if (!this.f128188d) {
            return h(interfaceC18012q, i10);
        }
        long j10 = this.f128190f;
        if (j10 == -9223372036854775807L) {
            return b(interfaceC18012q);
        }
        this.f128192h = this.f128185a.c(this.f128191g) - this.f128185a.b(j10);
        return b(interfaceC18012q);
    }

    C13608A() {
    }

    private long i(d3.D d10) {
        int iG = d10.g();
        for (int iF = d10.f(); iF < iG - 3; iF++) {
            if (f(d10.e(), iF) == 442) {
                d10.W(iF + 4);
                long jL = l(d10);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        long length = interfaceC18012q.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - iMin;
        if (interfaceC18012q.getPosition() != j10) {
            i10.f169077a = j10;
            return 1;
        }
        this.f128186b.S(iMin);
        interfaceC18012q.d();
        interfaceC18012q.m(this.f128186b.e(), 0, iMin);
        this.f128191g = k(this.f128186b);
        this.f128189e = true;
        return 0;
    }

    private long k(d3.D d10) {
        int iF = d10.f();
        for (int iG = d10.g() - 4; iG >= iF; iG--) {
            if (f(d10.e(), iG) == 442) {
                d10.W(iG + 4);
                long jL = l(d10);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(d3.D d10) {
        int iF = d10.f();
        if (d10.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        d10.l(bArr, 0, 9);
        d10.W(iF);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }
}
