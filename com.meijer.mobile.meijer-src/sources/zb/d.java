package zb;

import Gb.e;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.UUID;
import kt.p;
import kt.q;

/* loaded from: classes4.dex */
public class d implements c {

    /* renamed from: g, reason: collision with root package name */
    private static final C13784a f172664g = C13785b.a(d.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static final C13786c f172665h = C13787d.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Db.e f172666a;

    /* renamed from: b, reason: collision with root package name */
    private final b f172667b;

    /* renamed from: c, reason: collision with root package name */
    private final bb.e f172668c;

    /* renamed from: d, reason: collision with root package name */
    private final h f172669d;

    /* renamed from: e, reason: collision with root package name */
    private final g f172670e;

    /* renamed from: f, reason: collision with root package name */
    private final e f172671f;

    @Override // zb.c
    public final boolean a() {
        throw new RuntimeException("This method has to be thought through for v2");
    }

    @Override // zb.c
    public final synchronized void b() {
        Gb.e eVarX = this.f172666a.x();
        if (eVarX.f() == e.a.Registered) {
            eVarX.p(e.a.AwaitingReset);
            eVarX.q(c());
            eVarX.m(UUID.randomUUID().toString());
            eVarX.s(UUID.randomUUID().toString());
            eVarX.t(UUID.randomUUID().toString());
            this.f172666a.k(eVarX);
            this.f172666a.p(false);
            Gb.d dVarL = this.f172666a.L();
            dVarL.f(null);
            this.f172666a.j(dVarL);
            this.f172667b.u();
        }
    }

    private Long c() {
        return Long.valueOf(this.f172668c.a());
    }

    @Override // zb.c
    public final synchronized void a(String str) {
        boolean z10;
        if (this.f172666a.g() != null && !this.f172666a.g().equals(str)) {
            this.f172666a.s(str);
            f172665h.f("-- ApiKey Reset is now PENDING - will complete on next app restart --", new Object[0]);
            return;
        }
        Gb.e eVarX = this.f172666a.x();
        if (eVarX.f() != e.a.None) {
            if (eVarX.f() != e.a.AwaitingRegistration && eVarX.f() != e.a.AwaitingUpdate) {
                eVarX.c();
                return;
            }
            eVarX.c();
            return;
        }
        this.f172666a.n(str);
        eVarX.q(c());
        p pVar = (p) this.f172669d.f149575a.a("com.qsl.faar.User");
        q qVar = this.f172670e.b().size() > 0 ? this.f172670e.b().get(0) : null;
        boolean z11 = true;
        if (pVar == null || pVar.a() == null || pVar.b() == null || qVar == null || qVar.a() == null || qVar.b() == null || qVar.c() == null) {
            z10 = false;
        } else {
            eVarX.l(qVar.a());
            eVarX.n(qVar.a());
            eVarX.r(qVar.c());
            eVarX.s(pVar.a());
            eVarX.t(pVar.b());
            z10 = true;
        }
        String string = this.f172671f.f172672a.getSharedPreferences("proximity.shared.preferences", 0).getString("proximity.uuid.key", null);
        if (string != null) {
            eVarX.m(string);
            eVarX.o(string);
        } else {
            z11 = z10;
        }
        if (z11) {
            eVarX.p(e.a.AwaitingUpdate);
            eVarX.i();
            eVarX.h();
            eVarX.e();
            if (eVarX.c() == null) {
                eVarX.m(UUID.randomUUID().toString());
            }
            if (eVarX.i() == null || eVarX.j() == null) {
                eVarX.s(UUID.randomUUID().toString());
                eVarX.t(UUID.randomUUID().toString());
            }
        } else {
            eVarX.p(e.a.AwaitingRegistration);
            eVarX.m(UUID.randomUUID().toString());
            eVarX.s(UUID.randomUUID().toString());
            eVarX.t(UUID.randomUUID().toString());
        }
        this.f172666a.k(eVarX);
        this.f172667b.u();
    }

    public d(Db.e eVar, b bVar, bb.e eVar2, h hVar, g gVar, e eVar3) {
        this.f172666a = eVar;
        this.f172667b = bVar;
        this.f172668c = eVar2;
        this.f172669d = hVar;
        this.f172670e = gVar;
        this.f172671f = eVar3;
    }
}
