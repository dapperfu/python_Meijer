package e4;

import d3.P;
import java.io.IOException;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private final int f129564a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f129567d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f129568e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f129569f;

    /* renamed from: b, reason: collision with root package name */
    private final d3.J f129565b = new d3.J(0);

    /* renamed from: g, reason: collision with root package name */
    private long f129570g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f129571h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f129572i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f129566c = new d3.D();

    private int a(InterfaceC18078q interfaceC18078q) {
        this.f129566c.T(P.f127893f);
        this.f129567d = true;
        interfaceC18078q.d();
        return 0;
    }

    private int f(InterfaceC18078q interfaceC18078q, x3.I i10, int i11) throws IOException {
        int iMin = (int) Math.min(this.f129564a, interfaceC18078q.getLength());
        long j10 = 0;
        if (interfaceC18078q.getPosition() != j10) {
            i10.f170165a = j10;
            return 1;
        }
        this.f129566c.S(iMin);
        interfaceC18078q.d();
        interfaceC18078q.m(this.f129566c.e(), 0, iMin);
        this.f129570g = g(this.f129566c, i11);
        this.f129568e = true;
        return 0;
    }

    public long b() {
        return this.f129572i;
    }

    public d3.J c() {
        return this.f129565b;
    }

    public boolean d() {
        return this.f129567d;
    }

    public int e(InterfaceC18078q interfaceC18078q, x3.I i10, int i11) throws IOException {
        if (i11 <= 0) {
            return a(interfaceC18078q);
        }
        if (!this.f129569f) {
            return h(interfaceC18078q, i10, i11);
        }
        if (this.f129571h == -9223372036854775807L) {
            return a(interfaceC18078q);
        }
        if (!this.f129568e) {
            return f(interfaceC18078q, i10, i11);
        }
        long j10 = this.f129570g;
        if (j10 == -9223372036854775807L) {
            return a(interfaceC18078q);
        }
        this.f129572i = this.f129565b.c(this.f129571h) - this.f129565b.b(j10);
        return a(interfaceC18078q);
    }

    I(int i10) {
        this.f129564a = i10;
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

    private int h(InterfaceC18078q interfaceC18078q, x3.I i10, int i11) throws IOException {
        long length = interfaceC18078q.getLength();
        int iMin = (int) Math.min(this.f129564a, length);
        long j10 = length - iMin;
        if (interfaceC18078q.getPosition() != j10) {
            i10.f170165a = j10;
            return 1;
        }
        this.f129566c.S(iMin);
        interfaceC18078q.d();
        interfaceC18078q.m(this.f129566c.e(), 0, iMin);
        this.f129571h = i(this.f129566c, i11);
        this.f129569f = true;
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
