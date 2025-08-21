package J8;

import m8.o;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final o f15659a;

    public boolean e(int i10) {
        return i10 >= this.f15659a.c();
    }

    public d(o oVar) {
        this.f15659a = oVar;
    }

    public boolean a(e eVar, e eVar2) {
        float fB = eVar2.a().b() - eVar.a().b();
        float fC = eVar2.a().c() - eVar.a().c();
        if ((fB * fB) + (fC * fC) > this.f15659a.b() * this.f15659a.b()) {
            return true;
        }
        return false;
    }

    public boolean b(e eVar) {
        if (eVar.b().a() - eVar.a().a() > this.f15659a.d()) {
            return true;
        }
        return false;
    }

    public boolean c(e eVar, long j10) {
        if (j10 - eVar.b().a() > this.f15659a.e()) {
            return true;
        }
        return false;
    }

    public boolean d(e eVar, e eVar2) {
        return c(eVar, eVar2.a().a());
    }
}
