package ab;

import Bb.e;
import Ib.f;
import Ib.h;
import Ib.j;
import Ib.l;
import ab.C5591a.C0946a;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import eb.C13639a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nt.InterfaceC15945c;
import rb.C16742a;
import vb.C17538d;

/* renamed from: ab.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5593c extends Ya.b {

    /* renamed from: t, reason: collision with root package name */
    private static final C6380a f44462t = C6381b.a(C5593c.class.getName());

    /* renamed from: u, reason: collision with root package name */
    private static final C6382c f44463u = C6383d.a(C5593c.class.getName());

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f44464v = {-111, 100, 52, 39, -119, -108, 120, 83};

    /* renamed from: n, reason: collision with root package name */
    private Bb.b f44465n;

    /* renamed from: o, reason: collision with root package name */
    private C5591a f44466o;

    /* renamed from: p, reason: collision with root package name */
    private f f44467p;

    /* renamed from: q, reason: collision with root package name */
    private h f44468q;

    /* renamed from: r, reason: collision with root package name */
    private e f44469r;

    /* renamed from: s, reason: collision with root package name */
    private C17538d f44470s;

    /* renamed from: ab.c$a */
    final class a implements InterfaceC15945c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f44471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C16742a f44472b;

        @Override // nt.InterfaceC15945c
        public final void a(Object obj) {
            C6380a unused = C5593c.f44462t;
            C5591a c5591a = C5593c.this.f44466o;
            List list = this.f44471a;
            if (c5591a.f44458h != null) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c5591a.f44458h.k(((Ob.c) it.next()).c());
                    }
                } catch (IOException e10) {
                    e10.getMessage();
                }
            }
            this.f44472b.a(null);
        }

        a(List list, C16742a c16742a) {
            this.f44471a = list;
            this.f44472b = c16742a;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C6380a unused = C5593c.f44462t;
            this.f44472b.a(i10, str);
        }
    }

    public C5593c(C5591a c5591a, Bb.b bVar, e eVar, Za.c cVar, Za.e eVar2, f fVar, h hVar) {
        super(cVar, eVar2, "BreadcrumbsUploadJob");
        this.f44470s = new C17538d();
        this.f44466o = c5591a;
        this.f44465n = bVar;
        this.f44469r = eVar;
        this.f44467p = fVar;
        this.f44468q = hVar;
    }

    private String D(Ob.c cVar, C13639a c13639a) {
        try {
            return c13639a.a(this.f44470s.h(cVar.b()));
        } catch (Exception unused) {
            return null;
        }
    }

    private List<String> E(List<Ob.c> list, C13639a c13639a) {
        ArrayList arrayList = new ArrayList();
        Iterator<Ob.c> it = list.iterator();
        while (it.hasNext()) {
            String strD = D(it.next(), c13639a);
            if (strD != null) {
                arrayList.add(strD);
            }
        }
        return arrayList;
    }

    private C13639a G() {
        try {
            return new C13639a(this.f44469r.x().c());
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Ya.c
    public final void x() throws Exception {
        C13639a c13639aG;
        C5591a c5591a = this.f44466o;
        List<Ob.c> arrayList = new ArrayList<>();
        C5592b c5592b = c5591a.f44458h;
        if (c5592b != null) {
            Iterator<Ob.c> itB = c5592b.b();
            while (itB.hasNext()) {
                arrayList.add(itB.next());
            }
            Collections.sort(arrayList, c5591a.new C0946a());
        }
        if (arrayList.size() == 0 || (c13639aG = G()) == null) {
            return;
        }
        List<String> listE = E(arrayList, c13639aG);
        String strC = this.f44467p.c(j.f13793l);
        l lVar = new l(this.f44468q);
        C16742a c16742a = new C16742a();
        lVar.i(strC, listE, Object.class, new a(arrayList, c16742a));
        c16742a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.g
    public final long z() {
        if (this.f44465n.w()) {
            return Bb.b.c(this.f44465n.e().s(), 28800000L);
        }
        return 4611686018427387903L;
    }
}
