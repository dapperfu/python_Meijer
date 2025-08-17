package xb;

import Bb.k;
import Ib.j;
import Ib.l;
import Ib.n;
import cb.C6380a;
import cb.C6381b;
import nt.InterfaceC15945c;
import rb.C16742a;

/* renamed from: xb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18029a extends Ya.f implements k {

    /* renamed from: p, reason: collision with root package name */
    private static final C6380a f169497p = C6381b.a(C18029a.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private final Bb.e f169498m;

    /* renamed from: n, reason: collision with root package name */
    private final Ib.f f169499n;

    /* renamed from: o, reason: collision with root package name */
    private final n f169500o;

    /* renamed from: xb.a$a, reason: collision with other inner class name */
    final class C2718a implements InterfaceC15945c<Ob.e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C16742a f169501a;

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(Ob.e eVar) {
            this.f169501a.a(eVar);
            C18029a.this.f169498m.p(true);
            C18029a.this.f169498m.z();
        }

        C2718a(C16742a c16742a) {
            this.f169501a = c16742a;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C6380a unused = C18029a.f169497p;
            this.f169501a.a(i10, str);
        }
    }

    public C18029a(Za.c cVar, Za.e eVar, Bb.e eVar2, Ib.f fVar, n nVar) {
        super(cVar, eVar, "InstanceStatusJob");
        this.f169498m = eVar2;
        this.f169499n = fVar;
        this.f169500o = nVar;
        eVar2.h(this, "Instance_Status");
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (!"Instance_Status".equals(str) || obj == null || this.f169498m.C().booleanValue()) {
            return;
        }
        u();
    }

    @Override // Ya.c
    public final void x() throws Exception {
        C16742a c16742a = new C16742a();
        Eb.c cVarD = this.f169498m.D();
        if (cVarD == null) {
            e();
            c16742a.a(null);
        } else {
            Ob.e eVar = new Ob.e();
            eVar.a(Long.valueOf(cVarD.a()));
            eVar.b(Long.valueOf(cVarD.b()));
            new l(this.f169500o.f13798a).i(this.f169499n.f(j.f13787f), eVar, Ob.e.class, new C2718a(c16742a));
        }
        c16742a.b();
    }
}
