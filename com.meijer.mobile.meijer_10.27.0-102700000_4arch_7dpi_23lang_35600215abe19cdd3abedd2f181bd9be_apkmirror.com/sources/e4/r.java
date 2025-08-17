package e4;

import a3.t;
import d3.C13466a;
import e4.L;
import x3.O;

/* loaded from: classes4.dex */
public final class r implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final String f128511a;

    /* renamed from: c, reason: collision with root package name */
    private O f128513c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f128514d;

    /* renamed from: f, reason: collision with root package name */
    private int f128516f;

    /* renamed from: g, reason: collision with root package name */
    private int f128517g;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128512b = new d3.D(10);

    /* renamed from: e, reason: collision with root package name */
    private long f128515e = -9223372036854775807L;

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128514d = false;
        this.f128515e = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        C13466a.i(this.f128513c);
        if (this.f128514d) {
            int iA = d10.a();
            int i10 = this.f128517g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(d10.e(), d10.f(), this.f128512b.e(), this.f128517g, iMin);
                if (this.f128517g + iMin == 10) {
                    this.f128512b.W(0);
                    if (73 != this.f128512b.H() || 68 != this.f128512b.H() || 51 != this.f128512b.H()) {
                        d3.r.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f128514d = false;
                        return;
                    } else {
                        this.f128512b.X(3);
                        this.f128516f = this.f128512b.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f128516f - this.f128517g);
            this.f128513c.d(d10, iMin2);
            this.f128517g += iMin2;
        }
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
        int i10;
        C13466a.i(this.f128513c);
        if (this.f128514d && (i10 = this.f128516f) != 0 && this.f128517g == i10) {
            C13466a.g(this.f128515e != -9223372036854775807L);
            this.f128513c.c(this.f128515e, 1, this.f128516f, 0, null);
            this.f128514d = false;
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f128514d = true;
        this.f128515e = j10;
        this.f128516f = 0;
        this.f128517g = 0;
    }

    public r(String str) {
        this.f128511a = str;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        O oT = rVar.t(dVar.c(), 5);
        this.f128513c = oT;
        oT.b(new t.b().f0(dVar.b()).U(this.f128511a).u0("application/id3").N());
    }
}
