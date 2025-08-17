package S3;

import androidx.media3.common.ParserException;
import d3.C13466a;
import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.O;
import x3.r;
import x3.u;

/* loaded from: classes4.dex */
public class d implements InterfaceC18011p {

    /* renamed from: d, reason: collision with root package name */
    public static final u f33171d = new u() { // from class: S3.c
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return d.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private r f33172a;

    /* renamed from: b, reason: collision with root package name */
    private i f33173b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33174c;

    private static D f(D d10) {
        d10.W(0);
        return d10;
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new d()};
    }

    private boolean g(InterfaceC18012q interfaceC18012q) throws IOException {
        f fVar = new f();
        if (fVar.a(interfaceC18012q, true) && (fVar.f33181b & 2) == 2) {
            int iMin = Math.min(fVar.f33188i, 8);
            D d10 = new D(iMin);
            interfaceC18012q.m(d10.e(), 0, iMin);
            if (b.p(f(d10))) {
                this.f33173b = new b();
            } else if (j.r(f(d10))) {
                this.f33173b = new j();
            } else if (h.o(f(d10))) {
                this.f33173b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        i iVar = this.f33173b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        C13466a.i(this.f33172a);
        if (this.f33173b == null) {
            if (!g(interfaceC18012q)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            interfaceC18012q.d();
        }
        if (!this.f33174c) {
            O oT = this.f33172a.t(0, 1);
            this.f33172a.p();
            this.f33173b.d(this.f33172a, oT);
            this.f33174c = true;
        }
        return this.f33173b.g(interfaceC18012q, i10);
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f33172a = rVar;
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        try {
            return g(interfaceC18012q);
        } catch (ParserException unused) {
            return false;
        }
    }
}
