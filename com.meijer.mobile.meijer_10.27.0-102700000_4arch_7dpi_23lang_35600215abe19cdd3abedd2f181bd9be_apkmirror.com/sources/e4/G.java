package e4;

import a3.t;
import d3.C13466a;
import e3.i;
import e4.L;
import java.util.List;
import x3.C18001f;
import x3.O;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final List<a3.t> f128220a;

    /* renamed from: b, reason: collision with root package name */
    private final String f128221b;

    /* renamed from: c, reason: collision with root package name */
    private final O[] f128222c;

    /* renamed from: d, reason: collision with root package name */
    private final e3.i f128223d = new e3.i(new i.b() { // from class: e4.F
        @Override // e3.i.b
        public final void a(long j10, d3.D d10) {
            C18001f.a(j10, d10, this.f128219a.f128222c);
        }
    });

    public void d(x3.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f128222c.length; i10++) {
            dVar.a();
            O oT = rVar.t(dVar.c(), 3);
            a3.t tVar = this.f128220a.get(i10);
            String str = tVar.f43949o;
            C13466a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = tVar.f43935a;
            if (strB == null) {
                strB = dVar.b();
            }
            oT.b(new t.b().f0(strB).U(this.f128221b).u0(str).w0(tVar.f43939e).j0(tVar.f43938d).O(tVar.f43929J).g0(tVar.f43952r).N());
            this.f128222c[i10] = oT;
        }
    }

    public void b() {
        this.f128223d.d();
    }

    public void c(long j10, d3.D d10) {
        this.f128223d.a(j10, d10);
    }

    public void e() {
        this.f128223d.d();
    }

    public void f(int i10) {
        this.f128223d.g(i10);
    }

    public G(List<a3.t> list, String str) {
        this.f128220a = list;
        this.f128221b = str;
        this.f128222c = new O[list.size()];
    }
}
