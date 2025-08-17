package e4;

import a3.t;
import d3.C13466a;
import d3.P;
import e4.L;
import x3.O;

/* loaded from: classes4.dex */
public final class x implements D {

    /* renamed from: a, reason: collision with root package name */
    private a3.t f128589a;

    /* renamed from: b, reason: collision with root package name */
    private d3.J f128590b;

    /* renamed from: c, reason: collision with root package name */
    private O f128591c;

    private void c() {
        C13466a.i(this.f128590b);
        P.h(this.f128591c);
    }

    @Override // e4.D
    public void b(d3.J j10, x3.r rVar, L.d dVar) {
        this.f128590b = j10;
        dVar.a();
        O oT = rVar.t(dVar.c(), 5);
        this.f128591c = oT;
        oT.b(this.f128589a);
    }

    public x(String str, String str2) {
        this.f128589a = new t.b().U(str2).u0(str).N();
    }

    @Override // e4.D
    public void a(d3.D d10) {
        c();
        long jE = this.f128590b.e();
        long jF = this.f128590b.f();
        if (jE != -9223372036854775807L && jF != -9223372036854775807L) {
            a3.t tVar = this.f128589a;
            if (jF != tVar.f43954t) {
                a3.t tVarN = tVar.b().y0(jF).N();
                this.f128589a = tVarN;
                this.f128591c.b(tVarN);
            }
            int iA = d10.a();
            this.f128591c.d(d10, iA);
            this.f128591c.c(jE, 1, iA, 0, null);
        }
    }
}
