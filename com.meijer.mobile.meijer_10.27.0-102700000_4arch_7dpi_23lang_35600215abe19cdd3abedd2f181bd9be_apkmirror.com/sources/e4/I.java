package e4;

import d3.P;
import java.io.IOException;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private final int f128228a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f128231d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f128232e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f128233f;

    /* renamed from: b, reason: collision with root package name */
    private final d3.J f128229b = new d3.J(0);

    /* renamed from: g, reason: collision with root package name */
    private long f128234g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f128235h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f128236i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f128230c = new d3.D();

    private int a(InterfaceC18012q interfaceC18012q) {
        this.f128230c.T(P.f127091f);
        this.f128231d = true;
        interfaceC18012q.d();
        return 0;
    }

    private int f(InterfaceC18012q interfaceC18012q, x3.I i10, int i11) throws IOException {
        int iMin = (int) Math.min(this.f128228a, interfaceC18012q.getLength());
        long j10 = 0;
        if (interfaceC18012q.getPosition() != j10) {
            i10.f169077a = j10;
            return 1;
        }
        this.f128230c.S(iMin);
        interfaceC18012q.d();
        interfaceC18012q.m(this.f128230c.e(), 0, iMin);
        this.f128234g = g(this.f128230c, i11);
        this.f128232e = true;
        return 0;
    }

    public long b() {
        return this.f128236i;
    }

    public d3.J c() {
        return this.f128229b;
    }

    public boolean d() {
        return this.f128231d;
    }

    public int e(InterfaceC18012q interfaceC18012q, x3.I i10, int i11) throws IOException {
        if (i11 <= 0) {
            return a(interfaceC18012q);
        }
        if (!this.f128233f) {
            return h(interfaceC18012q, i10, i11);
        }
        if (this.f128235h == -9223372036854775807L) {
            return a(interfaceC18012q);
        }
        if (!this.f128232e) {
            return f(interfaceC18012q, i10, i11);
        }
        long j10 = this.f128234g;
        if (j10 == -9223372036854775807L) {
            return a(interfaceC18012q);
        }
        this.f128236i = this.f128229b.c(this.f128235h) - this.f128229b.b(j10);
        return a(interfaceC18012q);
    }

    I(int i10) {
        this.f128228a = i10;
    }

    private long g(d3.D d10, int i10) {
        int iG = d10.g();
        for (int iF = d10.f(); iF < iG; iF++) {
            if (d10.e()[iF] == 71) {
                long jC = M.c(d10, iF, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(InterfaceC18012q interfaceC18012q, x3.I i10, int i11) throws IOException {
        long length = interfaceC18012q.getLength();
        int iMin = (int) Math.min(this.f128228a, length);
        long j10 = length - iMin;
        if (interfaceC18012q.getPosition() != j10) {
            i10.f169077a = j10;
            return 1;
        }
        this.f128230c.S(iMin);
        interfaceC18012q.d();
        interfaceC18012q.m(this.f128230c.e(), 0, iMin);
        this.f128235h = i(this.f128230c, i11);
        this.f128233f = true;
        return 0;
    }

    private long i(d3.D d10, int i10) {
        int iF = d10.f();
        int iG = d10.g();
        for (int i11 = iG - 188; i11 >= iF; i11--) {
            if (M.b(d10.e(), iF, iG, i11)) {
                long jC = M.c(d10, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }
}
