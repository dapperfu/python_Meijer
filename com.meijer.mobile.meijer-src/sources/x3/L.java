package x3;

import a3.t;
import d3.C13599a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class L implements InterfaceC18077p {

    /* renamed from: a, reason: collision with root package name */
    private final int f170173a;

    /* renamed from: b, reason: collision with root package name */
    private final int f170174b;

    /* renamed from: c, reason: collision with root package name */
    private final String f170175c;

    /* renamed from: d, reason: collision with root package name */
    private int f170176d;

    /* renamed from: e, reason: collision with root package name */
    private int f170177e;

    /* renamed from: f, reason: collision with root package name */
    private r f170178f;

    /* renamed from: g, reason: collision with root package name */
    private O f170179g;

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    private void d(String str) {
        O oT = this.f170178f.t(1024, 4);
        this.f170179g = oT;
        oT.b(new t.b().U(str).u0(str).N());
        this.f170178f.p();
        this.f170178f.g(new M(-9223372036854775807L));
        this.f170177e = 1;
    }

    private void f(InterfaceC18078q interfaceC18078q) throws IOException {
        int iG = ((O) C13599a.e(this.f170179g)).g(interfaceC18078q, 1024, true);
        if (iG != -1) {
            this.f170176d += iG;
            return;
        }
        this.f170177e = 2;
        this.f170179g.c(0L, 1, this.f170176d, 0, null);
        this.f170176d = 0;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        if (j10 == 0 || this.f170177e == 1) {
            this.f170177e = 1;
            this.f170176d = 0;
        }
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        int i11 = this.f170177e;
        if (i11 == 1) {
            f(interfaceC18078q);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f170178f = rVar;
        d(this.f170175c);
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        C13599a.g((this.f170173a == -1 || this.f170174b == -1) ? false : true);
        d3.D d10 = new d3.D(this.f170174b);
        interfaceC18078q.m(d10.e(), 0, this.f170174b);
        return d10.P() == this.f170173a;
    }

    public L(int i10, int i11, String str) {
        this.f170173a = i10;
        this.f170174b = i11;
        this.f170175c = str;
    }
}
