package Fb;

import Fb.f.b;
import Ib.j;
import kt.s;
import rb.C16742a;

/* loaded from: classes4.dex */
public final class g extends Ya.b {

    /* renamed from: n, reason: collision with root package name */
    private final f f10387n;

    /* renamed from: o, reason: collision with root package name */
    private Bb.e f10388o;

    /* renamed from: p, reason: collision with root package name */
    private b f10389p;

    public g(Za.c cVar, Za.e eVar, f fVar, Bb.e eVar2, b bVar) {
        super(cVar, eVar, "PushTokenJob");
        this.f10387n = fVar;
        this.f10388o = eVar2;
        this.f10389p = bVar;
    }

    private boolean C(int i10) {
        return i10 != this.f10389p.a();
    }

    private boolean D() {
        Eb.d dVarL = this.f10388o.L();
        if (t() > 0) {
            return true;
        }
        if (dVarL != null) {
            if (dVarL.b() == null) {
                return this.f10388o.v() && this.f10388o.J() && dVarL.c() != null;
            }
            if (!this.f10388o.v() || !this.f10388o.J() || C(dVarL.a()) || dVarL.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        Eb.d dVarL = this.f10388o.L();
        String strB = dVarL.b();
        if (strB != null && !C(dVarL.a()) && !dVarL.d()) {
            if (!this.f10388o.v() || this.f10388o.J()) {
                return;
            }
            C16742a c16742a = new C16742a();
            f fVar = this.f10387n;
            String strB2 = fVar.f10377b.b(j.f13782a, "pushdetail");
            s sVar = new s();
            sVar.a("android");
            sVar.b(strB);
            fVar.f10379d.i(strB2, fVar.new b(c16742a));
            c16742a.b();
            return;
        }
        if (this.f10388o.v() && this.f10388o.J()) {
            if (dVarL.c() != null) {
                C16742a c16742a2 = new C16742a();
                this.f10387n.e(c16742a2);
                c16742a2.b();
            } else if (dVarL.b() != null) {
                C16742a c16742a3 = new C16742a();
                this.f10387n.d(strB, c16742a3);
                c16742a3.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.g, Ya.c
    public final long p() {
        if (D()) {
            return super.p();
        }
        return 4611686018427387903L;
    }

    @Override // Ya.c
    public final void u() {
        if (D()) {
            super.u();
        }
    }
}
