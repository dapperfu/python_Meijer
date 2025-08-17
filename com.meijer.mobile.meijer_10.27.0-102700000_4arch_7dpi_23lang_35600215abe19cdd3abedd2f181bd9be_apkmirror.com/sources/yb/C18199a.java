package yb;

import Ab.a;
import kt.C15320i;

/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18199a {
    public static Ab.a a(Db.b bVar) {
        Ab.a aVar = new Ab.a();
        aVar.l(Long.valueOf(bVar.h()));
        aVar.n(a.b.ARRIVE_EVENT);
        aVar.t(bVar.l());
        aVar.s(bVar.j());
        aVar.q(bVar);
        return aVar;
    }

    public static C15320i c(Ab.a aVar, Long l10) {
        C15320i c15320i = new C15320i();
        c15320i.i(l10);
        c15320i.d(aVar.i());
        c15320i.j(aVar.k());
        c15320i.h(aVar.h());
        if (aVar.c().equals(a.b.ARRIVE_EVENT)) {
            c15320i.f("AT");
            c15320i.e(aVar.a());
            return c15320i;
        }
        c15320i.f("LEFT");
        c15320i.e(aVar.b());
        return c15320i;
    }

    public static Ab.a d(Db.b bVar, a.EnumC0008a enumC0008a, String str, double d10, double d11) {
        Ab.a aVar = new Ab.a();
        aVar.l(Long.valueOf(bVar.h()));
        aVar.m(Long.valueOf(bVar.i()));
        aVar.n(a.b.DEPART_EVENT);
        aVar.t(bVar.l());
        aVar.s(bVar.j());
        aVar.p(enumC0008a);
        aVar.o(str);
        aVar.u(d10);
        aVar.r(d11);
        aVar.q(bVar);
        return aVar;
    }

    public static Ab.a b(Db.b bVar, a.EnumC0008a enumC0008a, String str, double d10, double d11) {
        Ab.a aVarA = a(bVar);
        aVarA.p(enumC0008a);
        aVarA.o(str);
        aVarA.u(d10);
        aVarA.r(d11);
        return aVarA;
    }
}
