package e4;

import a3.t;
import d3.C13599a;
import e4.L;
import x3.O;

/* loaded from: classes4.dex */
public final class r implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final String f129847a;

    /* renamed from: c, reason: collision with root package name */
    private O f129849c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f129850d;

    /* renamed from: f, reason: collision with root package name */
    private int f129852f;

    /* renamed from: g, reason: collision with root package name */
    private int f129853g;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129848b = new d3.D(10);

    /* renamed from: e, reason: collision with root package name */
    private long f129851e = -9223372036854775807L;

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129850d = false;
        this.f129851e = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) {
        C13599a.i(this.f129849c);
        if (this.f129850d) {
            int iA = d10.a();
            int i10 = this.f129853g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(d10.e(), d10.f(), this.f129848b.e(), this.f129853g, iMin);
                if (this.f129853g + iMin == 10) {
                    this.f129848b.W(0);
                    if (73 != this.f129848b.H() || 68 != this.f129848b.H() || 51 != this.f129848b.H()) {
                        d3.r.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f129850d = false;
                        return;
                    } else {
                        this.f129848b.X(3);
                        this.f129852f = this.f129848b.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f129852f - this.f129853g);
            this.f129849c.d(d10, iMin2);
            this.f129853g += iMin2;
        }
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
        int i10;
        C13599a.i(this.f129849c);
        if (this.f129850d && (i10 = this.f129852f) != 0 && this.f129853g == i10) {
            C13599a.g(this.f129851e != -9223372036854775807L);
            this.f129849c.c(this.f129851e, 1, this.f129852f, 0, null);
            this.f129850d = false;
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f129850d = true;
        this.f129851e = j10;
        this.f129852f = 0;
        this.f129853g = 0;
    }

    public r(String str) {
        this.f129847a = str;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        O oT = rVar.t(dVar.c(), 5);
        this.f129849c = oT;
        oT.b(new t.b().f0(dVar.b()).U(this.f129847a).u0("application/id3").N());
    }
}
