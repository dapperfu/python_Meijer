package x3;

import a3.t;
import d3.C13466a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class L implements InterfaceC18011p {

    /* renamed from: a, reason: collision with root package name */
    private final int f169085a;

    /* renamed from: b, reason: collision with root package name */
    private final int f169086b;

    /* renamed from: c, reason: collision with root package name */
    private final String f169087c;

    /* renamed from: d, reason: collision with root package name */
    private int f169088d;

    /* renamed from: e, reason: collision with root package name */
    private int f169089e;

    /* renamed from: f, reason: collision with root package name */
    private r f169090f;

    /* renamed from: g, reason: collision with root package name */
    private O f169091g;

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    private void d(String str) {
        O oT = this.f169090f.t(1024, 4);
        this.f169091g = oT;
        oT.b(new t.b().U(str).u0(str).N());
        this.f169090f.p();
        this.f169090f.g(new M(-9223372036854775807L));
        this.f169089e = 1;
    }

    private void f(InterfaceC18012q interfaceC18012q) throws IOException {
        int iG = ((O) C13466a.e(this.f169091g)).g(interfaceC18012q, 1024, true);
        if (iG != -1) {
            this.f169088d += iG;
            return;
        }
        this.f169089e = 2;
        this.f169091g.c(0L, 1, this.f169088d, 0, null);
        this.f169088d = 0;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        if (j10 == 0 || this.f169089e == 1) {
            this.f169089e = 1;
            this.f169088d = 0;
        }
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        int i11 = this.f169089e;
        if (i11 == 1) {
            f(interfaceC18012q);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f169090f = rVar;
        d(this.f169087c);
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        C13466a.g((this.f169085a == -1 || this.f169086b == -1) ? false : true);
        d3.D d10 = new d3.D(this.f169086b);
        interfaceC18012q.m(d10.e(), 0, this.f169086b);
        return d10.P() == this.f169085a;
    }

    public L(int i10, int i11, String str) {
        this.f169085a = i10;
        this.f169086b = i11;
        this.f169087c = str;
    }
}
