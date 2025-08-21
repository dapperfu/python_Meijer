package Ab;

import Cb.a;
import kt.C15423i;

/* loaded from: classes4.dex */
public final class a {
    public static Cb.a a(Fb.b bVar) {
        Cb.a aVar = new Cb.a();
        aVar.l(Long.valueOf(bVar.h()));
        aVar.n(a.b.ARRIVE_EVENT);
        aVar.t(bVar.l());
        aVar.s(bVar.j());
        aVar.q(bVar);
        return aVar;
    }

    public static C15423i c(Cb.a aVar, Long l10) {
        C15423i c15423i = new C15423i();
        c15423i.i(l10);
        c15423i.d(aVar.i());
        c15423i.j(aVar.k());
        c15423i.h(aVar.h());
        if (aVar.c().equals(a.b.ARRIVE_EVENT)) {
            c15423i.f("AT");
            c15423i.e(aVar.a());
            return c15423i;
        }
        c15423i.f("LEFT");
        c15423i.e(aVar.b());
        return c15423i;
    }

    public static Cb.a d(Fb.b bVar, a.EnumC0085a enumC0085a, String str, double d10, double d11) {
        Cb.a aVar = new Cb.a();
        aVar.l(Long.valueOf(bVar.h()));
        aVar.m(Long.valueOf(bVar.i()));
        aVar.n(a.b.DEPART_EVENT);
        aVar.t(bVar.l());
        aVar.s(bVar.j());
        aVar.p(enumC0085a);
        aVar.o(str);
        aVar.u(d10);
        aVar.r(d11);
        aVar.q(bVar);
        return aVar;
    }

    public static Cb.a b(Fb.b bVar, a.EnumC0085a enumC0085a, String str, double d10, double d11) {
        Cb.a aVarA = a(bVar);
        aVarA.p(enumC0085a);
        aVarA.o(str);
        aVarA.u(d10);
        aVarA.r(d11);
        return aVarA;
    }
}
