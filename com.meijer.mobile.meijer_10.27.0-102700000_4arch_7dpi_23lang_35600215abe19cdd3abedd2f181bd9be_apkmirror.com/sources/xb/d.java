package xb;

import Eb.e;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.UUID;
import kt.p;
import kt.q;

/* loaded from: classes4.dex */
public class d implements c {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f169515g = C6381b.a(d.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static final C6382c f169516h = C6383d.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Bb.e f169517a;

    /* renamed from: b, reason: collision with root package name */
    private final b f169518b;

    /* renamed from: c, reason: collision with root package name */
    private final Za.e f169519c;

    /* renamed from: d, reason: collision with root package name */
    private final h f169520d;

    /* renamed from: e, reason: collision with root package name */
    private final g f169521e;

    /* renamed from: f, reason: collision with root package name */
    private final e f169522f;

    @Override // xb.c
    public final boolean a() {
        throw new RuntimeException("This method has to be thought through for v2");
    }

    @Override // xb.c
    public final synchronized void b() {
        Eb.e eVarX = this.f169517a.x();
        if (eVarX.f() == e.a.Registered) {
            eVarX.p(e.a.AwaitingReset);
            eVarX.q(c());
            eVarX.m(UUID.randomUUID().toString());
            eVarX.s(UUID.randomUUID().toString());
            eVarX.t(UUID.randomUUID().toString());
            this.f169517a.k(eVarX);
            this.f169517a.p(false);
            Eb.d dVarL = this.f169517a.L();
            dVarL.f(null);
            this.f169517a.j(dVarL);
            this.f169518b.u();
        }
    }

    private Long c() {
        return Long.valueOf(this.f169519c.a());
    }

    @Override // xb.c
    public final synchronized void a(String str) {
        boolean z10;
        if (this.f169517a.g() != null && !this.f169517a.g().equals(str)) {
            this.f169517a.s(str);
            f169516h.f("-- ApiKey Reset is now PENDING - will complete on next app restart --", new Object[0]);
            return;
        }
        Eb.e eVarX = this.f169517a.x();
        if (eVarX.f() != e.a.None) {
            if (eVarX.f() != e.a.AwaitingRegistration && eVarX.f() != e.a.AwaitingUpdate) {
                eVarX.c();
                return;
            }
            eVarX.c();
            return;
        }
        this.f169517a.n(str);
        eVarX.q(c());
        p pVar = (p) this.f169520d.f139561a.a("com.qsl.faar.User");
        q qVar = this.f169521e.b().size() > 0 ? this.f169521e.b().get(0) : null;
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
        String string = this.f169522f.f169523a.getSharedPreferences("proximity.shared.preferences", 0).getString("proximity.uuid.key", null);
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
        this.f169517a.k(eVarX);
        this.f169518b.u();
    }

    public d(Bb.e eVar, b bVar, Za.e eVar2, h hVar, g gVar, e eVar3) {
        this.f169517a = eVar;
        this.f169518b = bVar;
        this.f169519c = eVar2;
        this.f169520d = hVar;
        this.f169521e = gVar;
        this.f169522f = eVar3;
    }
}
