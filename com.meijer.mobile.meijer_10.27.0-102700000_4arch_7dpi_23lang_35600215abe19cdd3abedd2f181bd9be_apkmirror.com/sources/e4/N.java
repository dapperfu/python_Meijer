package e4;

import a3.t;
import d3.C13466a;
import e4.L;
import java.util.List;
import x3.C18001f;
import x3.O;

/* loaded from: classes4.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    private final List<a3.t> f128279a;

    /* renamed from: b, reason: collision with root package name */
    private final String f128280b;

    /* renamed from: c, reason: collision with root package name */
    private final O[] f128281c;

    public void b(x3.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f128281c.length; i10++) {
            dVar.a();
            O oT = rVar.t(dVar.c(), 3);
            a3.t tVar = this.f128279a.get(i10);
            String str = tVar.f43949o;
            C13466a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            oT.b(new t.b().f0(dVar.b()).U(this.f128280b).u0(str).w0(tVar.f43939e).j0(tVar.f43938d).O(tVar.f43929J).g0(tVar.f43952r).N());
            this.f128281c[i10] = oT;
        }
    }

    public N(List<a3.t> list, String str) {
        this.f128279a = list;
        this.f128280b = str;
        this.f128281c = new O[list.size()];
    }

    public void a(long j10, d3.D d10) {
        if (d10.a() >= 9) {
            int iQ = d10.q();
            int iQ2 = d10.q();
            int iH = d10.H();
            if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
                C18001f.b(j10, d10, this.f128281c);
            }
        }
    }
}
