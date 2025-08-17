package tb;

import Vb.a;
import ec.InterfaceC13640a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import lc.C15396b;
import lc.C15397c;
import tb.k.a;

/* loaded from: classes4.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private m f161594a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC13640a f161595b;

    /* renamed from: c, reason: collision with root package name */
    Set<String> f161596c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private f f161597d;

    /* renamed from: e, reason: collision with root package name */
    g f161598e;

    /* renamed from: f, reason: collision with root package name */
    private q f161599f;

    /* renamed from: g, reason: collision with root package name */
    private k f161600g;

    final class a implements Rb.a<List<Qb.b>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f161601a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f161602b;

        @Override // Rb.a
        public final /* synthetic */ void a(List<Qb.b> list) {
            List<Qb.b> list2 = list;
            p.this.f161596c.remove(this.f161601a);
            g gVar = p.this.f161598e;
            b bVar = this.f161602b;
            if (bVar != null && list2 != null) {
                gVar.f161551a.d(g.a(bVar), (Qb.b[]) list2.toArray());
            }
            p.this.c(this.f161602b, list2);
        }

        a(String str, b bVar) {
            this.f161601a = str;
            this.f161602b = bVar;
        }

        @Override // Rb.a
        public final void a(int i10, String str) {
            p.this.f161596c.add(this.f161601a);
        }
    }

    private synchronized void b(b bVar, String str) {
        Qb.b[] bVarArrB;
        Qb.b[] bVarArrB2;
        if (this.f161596c.contains(str)) {
            return;
        }
        g gVar = this.f161598e;
        if (bVar != null && (bVarArrB = gVar.f161551a.b(g.a(bVar), Qb.b[].class)) != null && bVarArrB.length != 0) {
            g gVar2 = this.f161598e;
            List<Qb.b> listAsList = null;
            if (bVar != null && (bVarArrB2 = gVar2.f161551a.b(g.a(bVar), Qb.b[].class)) != null) {
                listAsList = Arrays.asList(bVarArrB2);
            }
            c(bVar, listAsList);
            return;
        }
        this.f161596c.add(str);
        this.f161595b.a(str, Integer.valueOf(bVar.I()), Integer.valueOf(bVar.K()), new a(str, bVar));
    }

    @Override // tb.o
    public final void a(b bVar) {
        ac.c cVarA;
        if (bVar == null || bVar.L() == null) {
            return;
        }
        String strL = bVar.L();
        if (this.f161599f.f161608d.get()) {
            k kVar = this.f161600g;
            if (kVar.f161565b != null && kVar.f161564a.t() && (cVarA = kVar.f161565b.a()) != null) {
                bVar.x(Double.toString(cVarA.f44474a.getLatitude()));
                bVar.y(Double.toString(cVarA.f44474a.getLongitude()));
                bVar.r(Float.toString(cVarA.f44474a.getAccuracy()));
                bVar.u(Long.toString(cVarA.f44474a.getTime()));
            }
            ExecutorService executorService = kVar.f161566c;
            if (executorService != null && !executorService.isShutdown()) {
                kVar.f161566c.execute(kVar.new a(bVar));
            }
        }
        if (this.f161599f.f161607c.get()) {
            b(bVar, strL);
        }
    }

    final void c(b bVar, List<Qb.b> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Qb.b bVar2 : list) {
            m mVar = this.f161594a;
            C15397c c15397c = new C15397c();
            c15397c.k(bVar.L() + "-" + bVar.I() + "-" + bVar.K());
            c15397c.v(bVar.L());
            c15397c.n(Integer.valueOf(bVar.I()));
            c15397c.o(Integer.valueOf(bVar.K()));
            c15397c.j(a.EnumC0807a.IBEACON);
            ArrayList arrayList = new ArrayList();
            List<Qb.d> listA = bVar2.a();
            if (listA != null && !listA.isEmpty()) {
                for (Qb.d dVar : listA) {
                    C15396b c15396b = new C15396b();
                    c15396b.k(dVar.getId());
                    c15396b.o(dVar.c());
                    c15396b.n(dVar.getName());
                    dVar.b();
                    arrayList.add(c15396b);
                }
            }
            c15397c.s(arrayList);
            mVar.c(bVar, c15397c);
        }
    }

    public p(m mVar, InterfaceC13640a interfaceC13640a, f fVar, g gVar, q qVar, k kVar) {
        this.f161594a = mVar;
        this.f161595b = interfaceC13640a;
        this.f161597d = fVar;
        this.f161598e = gVar;
        this.f161599f = qVar;
        this.f161600g = kVar;
    }
}
