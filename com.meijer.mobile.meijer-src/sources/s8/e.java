package s8;

import i8.w;
import i8.x;
import java.util.Map;
import s8.C17032d;
import v8.C17648a;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f160091a = x.f137411a + "DisplaySegmentFactory";

    public C17032d a(C8.a<I8.a> aVar, p8.b bVar, int i10) {
        C17032d c17032dL;
        synchronized (aVar) {
            try {
                if (x.f137412b) {
                    z8.f.u(f160091a, "captured lifecycle action: " + aVar);
                }
                Map<T, C17648a> mapF = aVar.f();
                long jI = bVar.i();
                long jB = aVar.c().b();
                C17648a c17648aB = b(jI, aVar.c());
                C17032d.b bVarS = new C17032d.b().r(new B8.d().a(aVar.getName())).v(bVar).u(i10).s(aVar.h() != null ? aVar.h().b() : 0L);
                I8.a aVar2 = I8.a.ON_CREATE;
                c17032dL = bVarS.p(mapF.containsKey(aVar2) ? w.f137395l : w.f137396m).m(c17648aB).n(b(jB, mapF.get(aVar2))).w(b(jB, mapF.get(I8.a.ON_START))).t(b(jB, mapF.get(I8.a.ON_RESUME))).o(b(jB, aVar.g())).q(true).l();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17032dL;
    }

    private static C17648a b(long j10, C17648a c17648a) {
        if (c17648a == null) {
            return null;
        }
        return new C17648a(c17648a.b() - j10, c17648a.a());
    }
}
