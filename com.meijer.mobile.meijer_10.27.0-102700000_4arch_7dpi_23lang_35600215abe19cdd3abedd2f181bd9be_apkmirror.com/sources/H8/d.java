package H8;

import k8.o;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final o f12349a;

    public boolean e(int i10) {
        return i10 >= this.f12349a.c();
    }

    public d(o oVar) {
        this.f12349a = oVar;
    }

    public boolean a(e eVar, e eVar2) {
        float fB = eVar2.a().b() - eVar.a().b();
        float fC = eVar2.a().c() - eVar.a().c();
        if ((fB * fB) + (fC * fC) > this.f12349a.b() * this.f12349a.b()) {
            return true;
        }
        return false;
    }

    public boolean b(e eVar) {
        if (eVar.b().a() - eVar.a().a() > this.f12349a.d()) {
            return true;
        }
        return false;
    }

    public boolean c(e eVar, long j10) {
        if (j10 - eVar.b().a() > this.f12349a.e()) {
            return true;
        }
        return false;
    }

    public boolean d(e eVar, e eVar2) {
        return c(eVar, eVar2.a().a());
    }
}
