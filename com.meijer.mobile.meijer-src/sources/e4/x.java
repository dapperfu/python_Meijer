package e4;

import a3.t;
import d3.C13599a;
import d3.P;
import e4.L;
import x3.O;

/* loaded from: classes4.dex */
public final class x implements D {

    /* renamed from: a, reason: collision with root package name */
    private a3.t f129925a;

    /* renamed from: b, reason: collision with root package name */
    private d3.J f129926b;

    /* renamed from: c, reason: collision with root package name */
    private O f129927c;

    private void c() {
        C13599a.i(this.f129926b);
        P.h(this.f129927c);
    }

    @Override // e4.D
    public void b(d3.J j10, x3.r rVar, L.d dVar) {
        this.f129926b = j10;
        dVar.a();
        O oT = rVar.t(dVar.c(), 5);
        this.f129927c = oT;
        oT.b(this.f129925a);
    }

    public x(String str, String str2) {
        this.f129925a = new t.b().U(str2).u0(str).N();
    }

    @Override // e4.D
    public void a(d3.D d10) {
        c();
        long jE = this.f129926b.e();
        long jF = this.f129926b.f();
        if (jE != -9223372036854775807L && jF != -9223372036854775807L) {
            a3.t tVar = this.f129925a;
            if (jF != tVar.f44772t) {
                a3.t tVarN = tVar.b().y0(jF).N();
                this.f129925a = tVarN;
                this.f129927c.b(tVarN);
            }
            int iA = d10.a();
            this.f129927c.d(d10, iA);
            this.f129927c.c(jE, 1, iA, 0, null);
        }
    }
}
