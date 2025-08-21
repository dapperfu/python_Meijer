package e4;

import e4.L;
import java.io.IOException;
import x3.C18064c;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;

/* renamed from: e4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13762e implements InterfaceC18077p {

    /* renamed from: d, reason: collision with root package name */
    public static final x3.u f129636d = new x3.u() { // from class: e4.d
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return C13762e.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C13763f f129637a = new C13763f("audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129638b = new d3.D(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f129639c;

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f129639c = false;
        this.f129637a.c();
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new C13762e()};
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        int i11 = interfaceC18078q.read(this.f129638b.e(), 0, 16384);
        if (i11 == -1) {
            return -1;
        }
        this.f129638b.W(0);
        this.f129638b.V(i11);
        if (!this.f129639c) {
            this.f129637a.e(0L, 4);
            this.f129639c = true;
        }
        this.f129637a.a(this.f129638b);
        return 0;
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        this.f129637a.f(rVar, new L.d(0, 1));
        rVar.p();
        rVar.g(new J.b(-9223372036854775807L));
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        d3.D d10 = new d3.D(10);
        int i10 = 0;
        while (true) {
            interfaceC18078q.m(d10.e(), 0, 10);
            d10.W(0);
            if (d10.K() != 4801587) {
                break;
            }
            d10.X(3);
            int iG = d10.G();
            i10 += iG + 10;
            interfaceC18078q.i(iG);
        }
        interfaceC18078q.d();
        interfaceC18078q.i(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC18078q.m(d10.e(), 0, 7);
            d10.W(0);
            int iP = d10.P();
            if (iP == 44096 || iP == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = C18064c.g(d10.e(), iP);
                if (iG2 == -1) {
                    return false;
                }
                interfaceC18078q.i(iG2 - 7);
            } else {
                interfaceC18078q.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC18078q.i(i12);
                i11 = 0;
            }
        }
    }
}
