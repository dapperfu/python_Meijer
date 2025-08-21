package Hb;

import Hb.f.b;
import Kb.j;
import ab.AbstractC5677b;
import bb.C6346c;
import kt.s;
import tb.C17216a;

/* loaded from: classes4.dex */
public final class g extends AbstractC5677b {

    /* renamed from: n, reason: collision with root package name */
    private final f f13514n;

    /* renamed from: o, reason: collision with root package name */
    private Db.e f13515o;

    /* renamed from: p, reason: collision with root package name */
    private b f13516p;

    public g(C6346c c6346c, bb.e eVar, f fVar, Db.e eVar2, b bVar) {
        super(c6346c, eVar, "PushTokenJob");
        this.f13514n = fVar;
        this.f13515o = eVar2;
        this.f13516p = bVar;
    }

    private boolean C(int i10) {
        return i10 != this.f13516p.a();
    }

    private boolean D() {
        Gb.d dVarL = this.f13515o.L();
        if (t() > 0) {
            return true;
        }
        if (dVarL != null) {
            if (dVarL.b() == null) {
                return this.f13515o.v() && this.f13515o.J() && dVarL.c() != null;
            }
            if (!this.f13515o.v() || !this.f13515o.J() || C(dVarL.a()) || dVarL.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        Gb.d dVarL = this.f13515o.L();
        String strB = dVarL.b();
        if (strB != null && !C(dVarL.a()) && !dVarL.d()) {
            if (!this.f13515o.v() || this.f13515o.J()) {
                return;
            }
            C17216a c17216a = new C17216a();
            f fVar = this.f13514n;
            String strB2 = fVar.f13504b.b(j.f16528a, "pushdetail");
            s sVar = new s();
            sVar.a("android");
            sVar.b(strB);
            fVar.f13506d.i(strB2, fVar.new b(c17216a));
            c17216a.b();
            return;
        }
        if (this.f13515o.v() && this.f13515o.J()) {
            if (dVarL.c() != null) {
                C17216a c17216a2 = new C17216a();
                this.f13514n.e(c17216a2);
                c17216a2.b();
            } else if (dVarL.b() != null) {
                C17216a c17216a3 = new C17216a();
                this.f13514n.d(strB, c17216a3);
                c17216a3.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.g, ab.AbstractC5678c
    public final long p() {
        if (D()) {
            return super.p();
        }
        return 4611686018427387903L;
    }

    @Override // ab.AbstractC5678c
    public final void u() {
        if (D()) {
            super.u();
        }
    }
}
