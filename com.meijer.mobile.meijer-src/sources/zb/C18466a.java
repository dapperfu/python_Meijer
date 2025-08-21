package zb;

import Db.k;
import Kb.j;
import Kb.l;
import Kb.n;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import nt.InterfaceC16021c;
import tb.C17216a;

/* renamed from: zb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18466a extends ab.f implements k {

    /* renamed from: p, reason: collision with root package name */
    private static final C13784a f172646p = C13785b.a(C18466a.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private final Db.e f172647m;

    /* renamed from: n, reason: collision with root package name */
    private final Kb.f f172648n;

    /* renamed from: o, reason: collision with root package name */
    private final n f172649o;

    /* renamed from: zb.a$a, reason: collision with other inner class name */
    final class C2787a implements InterfaceC16021c<Qb.e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17216a f172650a;

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(Qb.e eVar) {
            this.f172650a.a(eVar);
            C18466a.this.f172647m.p(true);
            C18466a.this.f172647m.z();
        }

        C2787a(C17216a c17216a) {
            this.f172650a = c17216a;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C13784a unused = C18466a.f172646p;
            this.f172650a.a(i10, str);
        }
    }

    public C18466a(C6346c c6346c, bb.e eVar, Db.e eVar2, Kb.f fVar, n nVar) {
        super(c6346c, eVar, "InstanceStatusJob");
        this.f172647m = eVar2;
        this.f172648n = fVar;
        this.f172649o = nVar;
        eVar2.h(this, "Instance_Status");
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (!"Instance_Status".equals(str) || obj == null || this.f172647m.C().booleanValue()) {
            return;
        }
        u();
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C17216a c17216a = new C17216a();
        Gb.c cVarD = this.f172647m.D();
        if (cVarD == null) {
            e();
            c17216a.a(null);
        } else {
            Qb.e eVar = new Qb.e();
            eVar.a(Long.valueOf(cVarD.a()));
            eVar.b(Long.valueOf(cVarD.b()));
            new l(this.f172649o.f16544a).i(this.f172648n.f(j.f16533f), eVar, Qb.e.class, new C2787a(c17216a));
        }
        c17216a.b();
    }
}
