package q8;

import g8.w;
import g8.x;
import java.util.Map;
import q8.C16484d;
import t8.C17073a;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f156976a = x.f133195a + "DisplaySegmentFactory";

    public C16484d a(A8.a<G8.a> aVar, n8.b bVar, int i10) {
        C16484d c16484dL;
        synchronized (aVar) {
            try {
                if (x.f133196b) {
                    x8.f.u(f156976a, "captured lifecycle action: " + aVar);
                }
                Map<T, C17073a> mapD = aVar.d();
                long jI = bVar.i();
                long jB = aVar.b().b();
                C17073a c17073aB = b(jI, aVar.b());
                C16484d.b bVarS = new C16484d.b().r(new z8.d().a(aVar.getName())).v(bVar).u(i10).s(aVar.g() != null ? aVar.g().b() : 0L);
                G8.a aVar2 = G8.a.ON_CREATE;
                c16484dL = bVarS.p(mapD.containsKey(aVar2) ? w.f133179l : w.f133180m).m(c17073aB).n(b(jB, mapD.get(aVar2))).w(b(jB, mapD.get(G8.a.ON_START))).t(b(jB, mapD.get(G8.a.ON_RESUME))).o(b(jB, aVar.e())).q(true).l();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c16484dL;
    }

    private static C17073a b(long j10, C17073a c17073a) {
        if (c17073a == null) {
            return null;
        }
        return new C17073a(c17073a.b() - j10, c17073a.a());
    }
}
