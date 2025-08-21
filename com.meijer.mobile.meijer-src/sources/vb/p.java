package vb;

import Xb.a;
import gc.InterfaceC14344a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import nc.C15930b;
import nc.C15931c;
import vb.k.a;

/* loaded from: classes4.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private m f165772a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC14344a f165773b;

    /* renamed from: c, reason: collision with root package name */
    Set<String> f165774c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private f f165775d;

    /* renamed from: e, reason: collision with root package name */
    g f165776e;

    /* renamed from: f, reason: collision with root package name */
    private q f165777f;

    /* renamed from: g, reason: collision with root package name */
    private k f165778g;

    final class a implements Tb.a<List<Sb.b>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f165779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f165780b;

        @Override // Tb.a
        public final /* synthetic */ void a(List<Sb.b> list) {
            List<Sb.b> list2 = list;
            p.this.f165774c.remove(this.f165779a);
            g gVar = p.this.f165776e;
            b bVar = this.f165780b;
            if (bVar != null && list2 != null) {
                gVar.f165729a.d(g.a(bVar), (Sb.b[]) list2.toArray());
            }
            p.this.c(this.f165780b, list2);
        }

        a(String str, b bVar) {
            this.f165779a = str;
            this.f165780b = bVar;
        }

        @Override // Tb.a
        public final void a(int i10, String str) {
            p.this.f165774c.add(this.f165779a);
        }
    }

    private synchronized void a(b bVar, String str) {
        Sb.b[] bVarArrB;
        Sb.b[] bVarArrB2;
        if (this.f165774c.contains(str)) {
            return;
        }
        g gVar = this.f165776e;
        if (bVar != null && (bVarArrB = gVar.f165729a.b(g.a(bVar), Sb.b[].class)) != null && bVarArrB.length != 0) {
            g gVar2 = this.f165776e;
            List<Sb.b> listAsList = null;
            if (bVar != null && (bVarArrB2 = gVar2.f165729a.b(g.a(bVar), Sb.b[].class)) != null) {
                listAsList = Arrays.asList(bVarArrB2);
            }
            c(bVar, listAsList);
            return;
        }
        this.f165774c.add(str);
        this.f165773b.c(str, Integer.valueOf(bVar.I()), Integer.valueOf(bVar.K()), new a(str, bVar));
    }

    @Override // vb.o
    public final void b(b bVar) {
        cc.c cVarA;
        if (bVar == null || bVar.L() == null) {
            return;
        }
        String strL = bVar.L();
        if (this.f165777f.f165786d.get()) {
            k kVar = this.f165778g;
            if (kVar.f165743b != null && kVar.f165742a.t() && (cVarA = kVar.f165743b.a()) != null) {
                bVar.x(Double.toString(cVarA.f61489a.getLatitude()));
                bVar.y(Double.toString(cVarA.f61489a.getLongitude()));
                bVar.r(Float.toString(cVarA.f61489a.getAccuracy()));
                bVar.u(Long.toString(cVarA.f61489a.getTime()));
            }
            ExecutorService executorService = kVar.f165744c;
            if (executorService != null && !executorService.isShutdown()) {
                kVar.f165744c.execute(kVar.new a(bVar));
            }
        }
        if (this.f165777f.f165785c.get()) {
            a(bVar, strL);
        }
    }

    final void c(b bVar, List<Sb.b> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Sb.b bVar2 : list) {
            m mVar = this.f165772a;
            C15931c c15931c = new C15931c();
            c15931c.k(bVar.L() + "-" + bVar.I() + "-" + bVar.K());
            c15931c.v(bVar.L());
            c15931c.n(Integer.valueOf(bVar.I()));
            c15931c.o(Integer.valueOf(bVar.K()));
            c15931c.j(a.EnumC0897a.IBEACON);
            ArrayList arrayList = new ArrayList();
            List<Sb.d> listA = bVar2.a();
            if (listA != null && !listA.isEmpty()) {
                for (Sb.d dVar : listA) {
                    C15930b c15930b = new C15930b();
                    c15930b.k(dVar.getId());
                    c15930b.o(dVar.c());
                    c15930b.n(dVar.getName());
                    dVar.b();
                    arrayList.add(c15930b);
                }
            }
            c15931c.s(arrayList);
            mVar.c(bVar, c15931c);
        }
    }

    public p(m mVar, InterfaceC14344a interfaceC14344a, f fVar, g gVar, q qVar, k kVar) {
        this.f165772a = mVar;
        this.f165773b = interfaceC14344a;
        this.f165775d = fVar;
        this.f165776e = gVar;
        this.f165777f = qVar;
        this.f165778g = kVar;
    }
}
