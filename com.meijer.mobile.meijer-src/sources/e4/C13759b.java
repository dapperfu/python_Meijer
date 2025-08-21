package e4;

import e4.L;
import java.io.IOException;
import x3.C18063b;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13759b implements InterfaceC18077p {

    /* renamed from: d, reason: collision with root package name */
    public static final x3.u f129618d = new x3.u() { // from class: e4.a
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return C13759b.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C13760c f129619a = new C13760c("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129620b = new d3.D(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f129621c;

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f129621c = false;
        this.f129619a.c();
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new C13759b()};
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        int i11 = interfaceC18078q.read(this.f129620b.e(), 0, 2786);
        if (i11 == -1) {
            return -1;
        }
        this.f129620b.W(0);
        this.f129620b.V(i11);
        if (!this.f129621c) {
            this.f129619a.e(0L, 4);
            this.f129621c = true;
        }
        this.f129619a.a(this.f129620b);
        return 0;
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        this.f129619a.f(rVar, new L.d(0, 1));
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
            interfaceC18078q.m(d10.e(), 0, 6);
            d10.W(0);
            if (d10.P() != 2935) {
                interfaceC18078q.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC18078q.i(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = C18063b.g(d10.e());
                if (iG2 == -1) {
                    return false;
                }
                interfaceC18078q.i(iG2 - 6);
            }
        }
    }
}
