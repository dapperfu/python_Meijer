package S3;

import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.O;
import x3.r;
import x3.u;

/* loaded from: classes4.dex */
public class d implements InterfaceC18077p {

    /* renamed from: d, reason: collision with root package name */
    public static final u f34350d = new u() { // from class: S3.c
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return d.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private r f34351a;

    /* renamed from: b, reason: collision with root package name */
    private i f34352b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34353c;

    private static D f(D d10) {
        d10.W(0);
        return d10;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new d()};
    }

    private boolean g(InterfaceC18078q interfaceC18078q) throws IOException {
        f fVar = new f();
        if (fVar.a(interfaceC18078q, true) && (fVar.f34360b & 2) == 2) {
            int iMin = Math.min(fVar.f34367i, 8);
            D d10 = new D(iMin);
            interfaceC18078q.m(d10.e(), 0, iMin);
            if (b.p(f(d10))) {
                this.f34352b = new b();
            } else if (j.r(f(d10))) {
                this.f34352b = new j();
            } else if (h.o(f(d10))) {
                this.f34352b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        i iVar = this.f34352b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        C13599a.i(this.f34351a);
        if (this.f34352b == null) {
            if (!g(interfaceC18078q)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            interfaceC18078q.d();
        }
        if (!this.f34353c) {
            O oT = this.f34351a.t(0, 1);
            this.f34351a.p();
            this.f34352b.d(this.f34351a, oT);
            this.f34353c = true;
        }
        return this.f34352b.g(interfaceC18078q, i10);
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f34351a = rVar;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        try {
            return g(interfaceC18078q);
        } catch (ParserException unused) {
            return false;
        }
    }
}
