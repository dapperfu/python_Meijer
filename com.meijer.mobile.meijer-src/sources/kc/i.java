package kc;

import eb.C13784a;
import eb.C13785b;
import java.util.Date;
import java.util.TimeZone;
import lc.C15481c;
import lc.C15482d;

/* loaded from: classes4.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f141802a = C13785b.a(i.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    private static i f141803b;

    public static synchronized i c() {
        try {
            if (f141803b == null) {
                f141803b = new i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f141803b;
    }

    @Override // kc.h
    public final C15116a a(Xb.l lVar, int i10) {
        String strA = Xb.h.a(Ub.a.a(lVar.f41817a));
        return (strA.equalsIgnoreCase(Ub.c.a(Xb.e.f41786a)) ? new C15481c() : strA.equalsIgnoreCase(Ub.c.a(Xb.e.f41788c)) ? new C15482d() : strA.equalsIgnoreCase(Ub.c.a(Xb.e.f41791f)) ? new lc.g() : new lc.e()).a(lVar, i10);
    }

    @Override // kc.h
    public final vb.b b(vb.d dVar, int i10) {
        vb.b bVar = new vb.b();
        bVar.N(dVar.f165725b);
        bVar.P(dVar.f165726c);
        bVar.C(i10);
        bVar.M(dVar.f165724a.toString());
        bVar.S(dVar.f165724a.toString());
        bVar.O(dVar.f165727d);
        bVar.G(TimeZone.getDefault().getID());
        bVar.t(new Date());
        return bVar;
    }

    private i() {
    }
}
