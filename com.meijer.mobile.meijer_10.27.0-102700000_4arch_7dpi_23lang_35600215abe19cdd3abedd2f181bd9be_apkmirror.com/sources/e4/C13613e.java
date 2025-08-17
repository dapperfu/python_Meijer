package e4;

import e4.L;
import java.io.IOException;
import x3.C17998c;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;

/* renamed from: e4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13613e implements InterfaceC18011p {

    /* renamed from: d, reason: collision with root package name */
    public static final x3.u f128300d = new x3.u() { // from class: e4.d
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return C13613e.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C13614f f128301a = new C13614f("audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128302b = new d3.D(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f128303c;

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f128303c = false;
        this.f128301a.c();
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new C13613e()};
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        int i11 = interfaceC18012q.read(this.f128302b.e(), 0, 16384);
        if (i11 == -1) {
            return -1;
        }
        this.f128302b.W(0);
        this.f128302b.V(i11);
        if (!this.f128303c) {
            this.f128301a.e(0L, 4);
            this.f128303c = true;
        }
        this.f128301a.a(this.f128302b);
        return 0;
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        this.f128301a.f(rVar, new L.d(0, 1));
        rVar.p();
        rVar.g(new J.b(-9223372036854775807L));
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        d3.D d10 = new d3.D(10);
        int i10 = 0;
        while (true) {
            interfaceC18012q.m(d10.e(), 0, 10);
            d10.W(0);
            if (d10.K() != 4801587) {
                break;
            }
            d10.X(3);
            int iG = d10.G();
            i10 += iG + 10;
            interfaceC18012q.i(iG);
        }
        interfaceC18012q.d();
        interfaceC18012q.i(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC18012q.m(d10.e(), 0, 7);
            d10.W(0);
            int iP = d10.P();
            if (iP == 44096 || iP == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = C17998c.g(d10.e(), iP);
                if (iG2 == -1) {
                    return false;
                }
                interfaceC18012q.i(iG2 - 7);
            } else {
                interfaceC18012q.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC18012q.i(i12);
                i11 = 0;
            }
        }
    }
}
