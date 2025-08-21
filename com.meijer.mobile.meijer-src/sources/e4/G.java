package e4;

import a3.t;
import d3.C13599a;
import e3.i;
import e4.L;
import java.util.List;
import x3.C18067f;
import x3.O;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final List<a3.t> f129556a;

    /* renamed from: b, reason: collision with root package name */
    private final String f129557b;

    /* renamed from: c, reason: collision with root package name */
    private final O[] f129558c;

    /* renamed from: d, reason: collision with root package name */
    private final e3.i f129559d = new e3.i(new i.b() { // from class: e4.F
        @Override // e3.i.b
        public final void a(long j10, d3.D d10) {
            C18067f.a(j10, d10, this.f129555a.f129558c);
        }
    });

    public void d(x3.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f129558c.length; i10++) {
            dVar.a();
            O oT = rVar.t(dVar.c(), 3);
            a3.t tVar = this.f129556a.get(i10);
            String str = tVar.f44767o;
            C13599a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = tVar.f44753a;
            if (strB == null) {
                strB = dVar.b();
            }
            oT.b(new t.b().f0(strB).U(this.f129557b).u0(str).w0(tVar.f44757e).j0(tVar.f44756d).O(tVar.f44747J).g0(tVar.f44770r).N());
            this.f129558c[i10] = oT;
        }
    }

    public void b() {
        this.f129559d.d();
    }

    public void c(long j10, d3.D d10) {
        this.f129559d.a(j10, d10);
    }

    public void e() {
        this.f129559d.d();
    }

    public void f(int i10) {
        this.f129559d.g(i10);
    }

    public G(List<a3.t> list, String str) {
        this.f129556a = list;
        this.f129557b = str;
        this.f129558c = new O[list.size()];
    }
}
