package xb;

import Eb.e;
import Ib.l;
import Ib.n;
import Ob.j;
import Ob.k;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.gimbal.internal.json.JsonWriteException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lt.C15500d;
import nt.InterfaceC15945c;
import rb.C16742a;

/* loaded from: classes4.dex */
public class b extends Ya.f {

    /* renamed from: t, reason: collision with root package name */
    private static final C6382c f169503t = C6383d.a(b.class.getName());

    /* renamed from: u, reason: collision with root package name */
    private static final C6380a f169504u = C6381b.a(b.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private final Bb.e f169505m;

    /* renamed from: n, reason: collision with root package name */
    private final Bb.b f169506n;

    /* renamed from: o, reason: collision with root package name */
    private final String f169507o;

    /* renamed from: p, reason: collision with root package name */
    private final Ib.f f169508p;

    /* renamed from: q, reason: collision with root package name */
    private final n f169509q;

    /* renamed from: r, reason: collision with root package name */
    private final Fb.g f169510r;

    /* renamed from: s, reason: collision with root package name */
    private f f169511s;

    final class a implements InterfaceC15945c<j> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f169512a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C16742a f169513b;

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(j jVar) {
            b.C(b.this, jVar);
            if (this.f169512a) {
                f fVar = b.this.f169511s;
                ub.c cVar = fVar.f169528d;
                File fileC = cVar.c(cVar.f162851a);
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
                Iterator<C15500d> it2 = fVar.a(fVar.f169525a.x(), "ARRIVE_EVENT").iterator();
                while (it2.hasNext()) {
                    try {
                        fVar.f169528d.b(fVar.f169529e.b(it2.next()));
                    } catch (JsonWriteException e11) {
                        e11.getMessage();
                    }
                }
            }
            this.f169513b.a(null);
        }

        a(boolean z10, C16742a c16742a) {
            this.f169512a = z10;
            this.f169513b = c16742a;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C6380a unused = b.f169504u;
            b.f169503t.g("setApiKey failed - {}", str);
            this.f169513b.a(i10, str);
        }
    }

    public b(Bb.e eVar, Bb.b bVar, Za.c cVar, Za.e eVar2, String str, Ib.f fVar, n nVar, Fb.g gVar, f fVar2) {
        super(cVar, eVar2, "RegistrationJob");
        this.f169505m = eVar;
        this.f169506n = bVar;
        this.f169507o = str;
        this.f169508p = fVar;
        this.f169509q = nVar;
        this.f169510r = gVar;
        this.f169511s = fVar2;
    }

    private void B(C16742a<Void> c16742a, j jVar, String str, boolean z10) {
        new l(this.f169509q.f13798a).i(str, jVar, j.class, new a(z10, c16742a));
    }

    static /* synthetic */ void C(b bVar, j jVar) {
        Eb.e eVarX = bVar.f169505m.x();
        bVar.f169506n.h(jVar.a());
        Bb.b bVar2 = bVar.f169506n;
        System.currentTimeMillis();
        bVar2.B();
        bVar.f169505m.z();
        eVarX.u(jVar);
        eVarX.p(e.a.Registered);
        bVar.f169505m.k(eVarX);
        Ib.a aVar = new Ib.a();
        aVar.c(eVarX.i());
        aVar.d(eVarX.j());
        bVar.f169505m.l(aVar);
        bVar.f169510r.u();
    }

    @Override // Ya.c
    public final void x() throws Exception {
        String strH;
        f169503t.e("Registering Gimbal", new Object[0]);
        C16742a<Void> c16742a = new C16742a<>();
        Eb.e eVarX = this.f169505m.x();
        e.a aVarF = eVarX.f();
        e.a aVar = e.a.AwaitingUpdate;
        if (aVarF == aVar || eVarX.f() == e.a.AwaitingRegistration || eVarX.f() == e.a.AwaitingReset) {
            j jVar = new j();
            jVar.i(this.f169505m.g());
            jVar.m("Android");
            jVar.j(this.f169507o);
            jVar.o(eVarX.g());
            jVar.k(eVarX.c());
            jVar.n(eVarX.e());
            jVar.p(eVarX.i());
            jVar.l(eVarX.j());
            if (eVarX.f() == aVar) {
                strH = this.f169508p.h(Ib.j.f13785d);
            } else if (eVarX.f() == e.a.AwaitingRegistration) {
                strH = this.f169508p.h(Ib.j.f13783b);
            } else if (eVarX.f() == e.a.AwaitingReset) {
                strH = this.f169508p.h(Ib.j.f13784c);
            } else {
                eVarX.f();
            }
            if (eVarX.f() == e.a.AwaitingReset) {
                f fVar = this.f169511s;
                k kVar = new k();
                kVar.i(fVar.f169525a.g());
                kVar.m("Android");
                kVar.j(fVar.f169526b);
                kVar.o(eVarX.g());
                kVar.k(eVarX.c());
                kVar.n(eVarX.e());
                kVar.p(eVarX.i());
                kVar.l(eVarX.j());
                List<C15500d> listA = fVar.a(eVarX, "DEPART_EVENT");
                ArrayList arrayList = new ArrayList();
                List<String> listA2 = fVar.f169528d.a();
                if (!listA2.isEmpty()) {
                    Iterator<String> it = listA2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(fVar.f169529e.a(it.next(), C15500d.class));
                    }
                }
                arrayList.addAll(listA);
                kVar.q(arrayList);
                B(c16742a, kVar, strH, true);
            } else {
                B(c16742a, jVar, strH, false);
            }
        }
        c16742a.b();
    }
}
