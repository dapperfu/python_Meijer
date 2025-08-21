package Ob;

import Ob.r;
import ab.AbstractC5677b;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.C17216a;

/* loaded from: classes4.dex */
public class q extends AbstractC5677b {

    /* renamed from: s, reason: collision with root package name */
    private static final C13784a f23313s = C13785b.a(q.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private Db.b f23314n;

    /* renamed from: o, reason: collision with root package name */
    private p f23315o;

    /* renamed from: p, reason: collision with root package name */
    private Db.e f23316p;

    /* renamed from: q, reason: collision with root package name */
    private final Kb.f f23317q;

    /* renamed from: r, reason: collision with root package name */
    private final Kb.h f23318r;

    public q(C6346c c6346c, bb.e eVar, Db.b bVar, p pVar, Db.e eVar2, Kb.f fVar, Kb.h hVar) {
        super(c6346c, eVar, "EstablishedLocationsUploadJob");
        this.f23314n = bVar;
        this.f23315o = pVar;
        this.f23316p = eVar2;
        this.f23317q = fVar;
        this.f23318r = hVar;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        Rb.c cVar = new Rb.c();
        List<h> listF = this.f23315o.f();
        long jB = Db.b.b(this.f23314n.e().A(), 600000);
        long jB2 = Db.b.b(this.f23314n.e().z(), 50);
        Collections.sort(listF, new r.a());
        ArrayList arrayList = new ArrayList();
        for (h hVar : listF) {
            if (hVar.d() >= jB) {
                arrayList.add(r.a(hVar));
            }
            if (arrayList.size() >= jB2) {
                break;
            }
        }
        r.c(arrayList);
        cVar.b(arrayList);
        cVar.a().size();
        if (cVar.a().size() > 0) {
            String strF = this.f23317q.f(Kb.j.f16537j);
            Kb.m mVar = new Kb.m(this.f23318r);
            C17216a c17216a = new C17216a();
            mVar.i(strF, cVar, c17216a);
            c17216a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.g
    public final long z() {
        if (this.f23314n.q() && this.f23316p.I()) {
            return Db.b.c(this.f23314n.e().B(), 604800000L);
        }
        return 4611686018427387903L;
    }
}
