package e4;

import d3.P;
import java.io.IOException;
import x3.InterfaceC18078q;

/* renamed from: e4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C13756A {

    /* renamed from: c, reason: collision with root package name */
    private boolean f129523c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f129524d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f129525e;

    /* renamed from: a, reason: collision with root package name */
    private final d3.J f129521a = new d3.J(0);

    /* renamed from: f, reason: collision with root package name */
    private long f129526f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f129527g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f129528h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129522b = new d3.D();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((b10 & 56) >> 3) << 30) | ((b10 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    private int b(InterfaceC18078q interfaceC18078q) {
        this.f129522b.T(P.f127893f);
        this.f129523c = true;
        interfaceC18078q.d();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        int iMin = (int) Math.min(20000L, interfaceC18078q.getLength());
        long j10 = 0;
        if (interfaceC18078q.getPosition() != j10) {
            i10.f170165a = j10;
            return 1;
        }
        this.f129522b.S(iMin);
        interfaceC18078q.d();
        interfaceC18078q.m(this.f129522b.e(), 0, iMin);
        this.f129526f = i(this.f129522b);
        this.f129524d = true;
        return 0;
    }

    public long c() {
        return this.f129528h;
    }

    public d3.J d() {
        return this.f129521a;
    }

    public boolean e() {
        return this.f129523c;
    }

    public int g(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        if (!this.f129525e) {
            return j(interfaceC18078q, i10);
        }
        if (this.f129527g == -9223372036854775807L) {
            return b(interfaceC18078q);
        }
        if (!this.f129524d) {
            return h(interfaceC18078q, i10);
        }
        long j10 = this.f129526f;
        if (j10 == -9223372036854775807L) {
            return b(interfaceC18078q);
        }
        this.f129528h = this.f129521a.c(this.f129527g) - this.f129521a.b(j10);
        return b(interfaceC18078q);
    }

    C13756A() {
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

    private int j(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        long length = interfaceC18078q.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - iMin;
        if (interfaceC18078q.getPosition() != j10) {
            i10.f170165a = j10;
            return 1;
        }
        this.f129522b.S(iMin);
        interfaceC18078q.d();
        interfaceC18078q.m(this.f129522b.e(), 0, iMin);
        this.f129527g = k(this.f129522b);
        this.f129525e = true;
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
