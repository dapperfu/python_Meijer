package Mb;

import Mb.r;
import cb.C6380a;
import cb.C6381b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rb.C16742a;

/* loaded from: classes4.dex */
public class q extends Ya.b {

    /* renamed from: s, reason: collision with root package name */
    private static final C6380a f19126s = C6381b.a(q.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private Bb.b f19127n;

    /* renamed from: o, reason: collision with root package name */
    private p f19128o;

    /* renamed from: p, reason: collision with root package name */
    private Bb.e f19129p;

    /* renamed from: q, reason: collision with root package name */
    private final Ib.f f19130q;

    /* renamed from: r, reason: collision with root package name */
    private final Ib.h f19131r;

    public q(Za.c cVar, Za.e eVar, Bb.b bVar, p pVar, Bb.e eVar2, Ib.f fVar, Ib.h hVar) {
        super(cVar, eVar, "EstablishedLocationsUploadJob");
        this.f19127n = bVar;
        this.f19128o = pVar;
        this.f19129p = eVar2;
        this.f19130q = fVar;
        this.f19131r = hVar;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        Pb.c cVar = new Pb.c();
        List<h> listF = this.f19128o.f();
        long jB = Bb.b.b(this.f19127n.e().A(), 600000);
        long jB2 = Bb.b.b(this.f19127n.e().z(), 50);
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
            String strF = this.f19130q.f(Ib.j.f13791j);
            Ib.m mVar = new Ib.m(this.f19131r);
            C16742a c16742a = new C16742a();
            mVar.i(strF, cVar, c16742a);
            c16742a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.g
    public final long z() {
        if (this.f19127n.q() && this.f19129p.I()) {
            return Bb.b.c(this.f19127n.e().B(), 604800000L);
        }
        return 4611686018427387903L;
    }
}
