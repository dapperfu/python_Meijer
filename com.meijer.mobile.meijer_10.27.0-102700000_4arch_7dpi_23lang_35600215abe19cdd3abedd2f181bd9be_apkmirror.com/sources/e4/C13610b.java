package e4;

import e4.L;
import java.io.IOException;
import x3.C17997b;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13610b implements InterfaceC18011p {

    /* renamed from: d, reason: collision with root package name */
    public static final x3.u f128282d = new x3.u() { // from class: e4.a
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return C13610b.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C13611c f128283a = new C13611c("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128284b = new d3.D(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f128285c;

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f128285c = false;
        this.f128283a.c();
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new C13610b()};
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        int i11 = interfaceC18012q.read(this.f128284b.e(), 0, 2786);
        if (i11 == -1) {
            return -1;
        }
        this.f128284b.W(0);
        this.f128284b.V(i11);
        if (!this.f128285c) {
            this.f128283a.e(0L, 4);
            this.f128285c = true;
        }
        this.f128283a.a(this.f128284b);
        return 0;
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        this.f128283a.f(rVar, new L.d(0, 1));
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
            interfaceC18012q.m(d10.e(), 0, 6);
            d10.W(0);
            if (d10.P() != 2935) {
                interfaceC18012q.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC18012q.i(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = C17997b.g(d10.e());
                if (iG2 == -1) {
                    return false;
                }
                interfaceC18012q.i(iG2 - 6);
            }
        }
    }
}
