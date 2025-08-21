package cb;

import Db.e;
import Kb.f;
import Kb.h;
import Kb.j;
import Kb.l;
import ab.AbstractC5677b;
import bb.C6346c;
import cb.C6497a.C1229a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import gb.C14343a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nt.InterfaceC16021c;
import tb.C17216a;
import xb.C18150d;

/* renamed from: cb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6499c extends AbstractC5677b {

    /* renamed from: t, reason: collision with root package name */
    private static final C13784a f61477t = C13785b.a(C6499c.class.getName());

    /* renamed from: u, reason: collision with root package name */
    private static final C13786c f61478u = C13787d.a(C6499c.class.getName());

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f61479v = {-111, 100, 52, 39, -119, -108, 120, 83};

    /* renamed from: n, reason: collision with root package name */
    private Db.b f61480n;

    /* renamed from: o, reason: collision with root package name */
    private C6497a f61481o;

    /* renamed from: p, reason: collision with root package name */
    private f f61482p;

    /* renamed from: q, reason: collision with root package name */
    private h f61483q;

    /* renamed from: r, reason: collision with root package name */
    private e f61484r;

    /* renamed from: s, reason: collision with root package name */
    private C18150d f61485s;

    /* renamed from: cb.c$a */
    final class a implements InterfaceC16021c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f61486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17216a f61487b;

        @Override // nt.InterfaceC16021c
        public final void a(Object obj) {
            C13784a unused = C6499c.f61477t;
            C6497a c6497a = C6499c.this.f61481o;
            List list = this.f61486a;
            if (c6497a.f61473h != null) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c6497a.f61473h.k(((Qb.c) it.next()).c());
                    }
                } catch (IOException e10) {
                    e10.getMessage();
                }
            }
            this.f61487b.a(null);
        }

        a(List list, C17216a c17216a) {
            this.f61486a = list;
            this.f61487b = c17216a;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C13784a unused = C6499c.f61477t;
            this.f61487b.a(i10, str);
        }
    }

    public C6499c(C6497a c6497a, Db.b bVar, e eVar, C6346c c6346c, bb.e eVar2, f fVar, h hVar) {
        super(c6346c, eVar2, "BreadcrumbsUploadJob");
        this.f61485s = new C18150d();
        this.f61481o = c6497a;
        this.f61480n = bVar;
        this.f61484r = eVar;
        this.f61482p = fVar;
        this.f61483q = hVar;
    }

    private String D(Qb.c cVar, C14343a c14343a) {
        try {
            return c14343a.a(this.f61485s.h(cVar.b()));
        } catch (Exception unused) {
            return null;
        }
    }

    private List<String> E(List<Qb.c> list, C14343a c14343a) {
        ArrayList arrayList = new ArrayList();
        Iterator<Qb.c> it = list.iterator();
        while (it.hasNext()) {
            String strD = D(it.next(), c14343a);
            if (strD != null) {
                arrayList.add(strD);
            }
        }
        return arrayList;
    }

    private C14343a G() {
        try {
            return new C14343a(this.f61484r.x().c());
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C14343a c14343aG;
        C6497a c6497a = this.f61481o;
        List<Qb.c> arrayList = new ArrayList<>();
        C6498b c6498b = c6497a.f61473h;
        if (c6498b != null) {
            Iterator<Qb.c> itB = c6498b.b();
            while (itB.hasNext()) {
                arrayList.add(itB.next());
            }
            Collections.sort(arrayList, c6497a.new C1229a());
        }
        if (arrayList.size() == 0 || (c14343aG = G()) == null) {
            return;
        }
        List<String> listE = E(arrayList, c14343aG);
        String strC = this.f61482p.c(j.f16539l);
        l lVar = new l(this.f61483q);
        C17216a c17216a = new C17216a();
        lVar.i(strC, listE, Object.class, new a(arrayList, c17216a));
        c17216a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.g
    public final long z() {
        if (this.f61480n.w()) {
            return Db.b.c(this.f61480n.e().s(), 28800000L);
        }
        return 4611686018427387903L;
    }
}
