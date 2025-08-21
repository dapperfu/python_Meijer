package zb;

import Gb.e;
import Kb.l;
import Kb.n;
import Qb.j;
import Qb.k;
import bb.C6346c;
import com.gimbal.internal.json.JsonWriteException;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lt.C15611d;
import nt.InterfaceC16021c;
import tb.C17216a;

/* loaded from: classes4.dex */
public class b extends ab.f {

    /* renamed from: t, reason: collision with root package name */
    private static final C13786c f172652t = C13787d.a(b.class.getName());

    /* renamed from: u, reason: collision with root package name */
    private static final C13784a f172653u = C13785b.a(b.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private final Db.e f172654m;

    /* renamed from: n, reason: collision with root package name */
    private final Db.b f172655n;

    /* renamed from: o, reason: collision with root package name */
    private final String f172656o;

    /* renamed from: p, reason: collision with root package name */
    private final Kb.f f172657p;

    /* renamed from: q, reason: collision with root package name */
    private final n f172658q;

    /* renamed from: r, reason: collision with root package name */
    private final Hb.g f172659r;

    /* renamed from: s, reason: collision with root package name */
    private f f172660s;

    final class a implements InterfaceC16021c<j> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f172661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17216a f172662b;

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(j jVar) {
            b.C(b.this, jVar);
            if (this.f172661a) {
                f fVar = b.this.f172660s;
                wb.c cVar = fVar.f172677d;
                File fileC = cVar.c(cVar.f167060a);
                synchronized (cVar) {
                    if (fileC.exists()) {
                        try {
                            Iterator<String> it = cVar.d().iterator();
                            while (it.hasNext()) {
                                cVar.c(it.next()).deleteOnExit();
                            }
                        } catch (Exception e10) {
                            e10.getMessage();
                        }
                    }
                }
                Iterator<C15611d> it2 = fVar.a(fVar.f172674a.x(), "ARRIVE_EVENT").iterator();
                while (it2.hasNext()) {
                    try {
                        fVar.f172677d.b(fVar.f172678e.b(it2.next()));
                    } catch (JsonWriteException e11) {
                        e11.getMessage();
                    }
                }
            }
            this.f172662b.a(null);
        }

        a(boolean z10, C17216a c17216a) {
            this.f172661a = z10;
            this.f172662b = c17216a;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C13784a unused = b.f172653u;
            b.f172652t.g("setApiKey failed - {}", str);
            this.f172662b.a(i10, str);
        }
    }

    public b(Db.e eVar, Db.b bVar, C6346c c6346c, bb.e eVar2, String str, Kb.f fVar, n nVar, Hb.g gVar, f fVar2) {
        super(c6346c, eVar2, "RegistrationJob");
        this.f172654m = eVar;
        this.f172655n = bVar;
        this.f172656o = str;
        this.f172657p = fVar;
        this.f172658q = nVar;
        this.f172659r = gVar;
        this.f172660s = fVar2;
    }

    private void B(C17216a<Void> c17216a, j jVar, String str, boolean z10) {
        new l(this.f172658q.f16544a).i(str, jVar, j.class, new a(z10, c17216a));
    }

    static /* synthetic */ void C(b bVar, j jVar) {
        Gb.e eVarX = bVar.f172654m.x();
        bVar.f172655n.h(jVar.a());
        Db.b bVar2 = bVar.f172655n;
        System.currentTimeMillis();
        bVar2.B();
        bVar.f172654m.z();
        eVarX.u(jVar);
        eVarX.p(e.a.Registered);
        bVar.f172654m.k(eVarX);
        Kb.a aVar = new Kb.a();
        aVar.c(eVarX.i());
        aVar.d(eVarX.j());
        bVar.f172654m.l(aVar);
        bVar.f172659r.u();
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        String strH;
        f172652t.e("Registering Gimbal", new Object[0]);
        C17216a<Void> c17216a = new C17216a<>();
        Gb.e eVarX = this.f172654m.x();
        e.a aVarF = eVarX.f();
        e.a aVar = e.a.AwaitingUpdate;
        if (aVarF == aVar || eVarX.f() == e.a.AwaitingRegistration || eVarX.f() == e.a.AwaitingReset) {
            j jVar = new j();
            jVar.i(this.f172654m.g());
            jVar.m("Android");
            jVar.j(this.f172656o);
            jVar.o(eVarX.g());
            jVar.k(eVarX.c());
            jVar.n(eVarX.e());
            jVar.p(eVarX.i());
            jVar.l(eVarX.j());
            if (eVarX.f() == aVar) {
                strH = this.f172657p.h(Kb.j.f16531d);
            } else if (eVarX.f() == e.a.AwaitingRegistration) {
                strH = this.f172657p.h(Kb.j.f16529b);
            } else if (eVarX.f() == e.a.AwaitingReset) {
                strH = this.f172657p.h(Kb.j.f16530c);
            } else {
                eVarX.f();
            }
            if (eVarX.f() == e.a.AwaitingReset) {
                f fVar = this.f172660s;
                k kVar = new k();
                kVar.i(fVar.f172674a.g());
                kVar.m("Android");
                kVar.j(fVar.f172675b);
                kVar.o(eVarX.g());
                kVar.k(eVarX.c());
                kVar.n(eVarX.e());
                kVar.p(eVarX.i());
                kVar.l(eVarX.j());
                List<C15611d> listA = fVar.a(eVarX, "DEPART_EVENT");
                ArrayList arrayList = new ArrayList();
                List<String> listA2 = fVar.f172677d.a();
                if (!listA2.isEmpty()) {
                    Iterator<String> it = listA2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(fVar.f172678e.a(it.next(), C15611d.class));
                    }
                }
                arrayList.addAll(listA);
                kVar.q(arrayList);
                B(c17216a, kVar, strH, true);
            } else {
                B(c17216a, jVar, strH, false);
            }
        }
        c17216a.b();
    }
}
