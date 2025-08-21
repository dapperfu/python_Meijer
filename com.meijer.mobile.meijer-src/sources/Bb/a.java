package Bb;

import Cb.d;
import Db.e;
import Kb.f;
import Kb.h;
import Kb.j;
import Kb.l;
import ab.AbstractC5678c;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.Iterator;
import java.util.List;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f2615f = C13785b.a(a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final C13786c f2616g = C13787d.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final f f2617a;

    /* renamed from: b, reason: collision with root package name */
    private final e f2618b;

    /* renamed from: c, reason: collision with root package name */
    private final h f2619c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC5678c f2620d;

    /* renamed from: e, reason: collision with root package name */
    private b f2621e;

    /* renamed from: Bb.a$a, reason: collision with other inner class name */
    final class C0059a implements InterfaceC16021c<Object> {
        @Override // nt.InterfaceC16021c
        public final void a(Object obj) {
            C13784a unused = a.f2615f;
        }

        C0059a() {
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            a.f2616g.g("Error during uploading to the server statusCode [{}], errorMessage", Integer.valueOf(i10), str);
            if (a.this.f2620d != null) {
                a.this.f2620d.r();
            }
        }
    }

    @Override // Cb.d
    public final void g(Cb.c cVar) {
    }

    private Long i() {
        return this.f2618b.x().d();
    }

    private void j(Cb.a aVar) {
        if (!this.f2618b.c()) {
            aVar.i();
            b bVar = this.f2621e;
            bVar.f2624a.J();
            bVar.f2624a.M();
            bVar.f2625b.s();
            bVar.f2625b.u();
            return;
        }
        String strB = this.f2617a.b(j.f16528a, "application", Long.toString(this.f2618b.x().a().longValue()), "placeEvents");
        aVar.c();
        aVar.i();
        aVar.j();
        kt.j jVar = new kt.j();
        jVar.b().add(Ab.a.c(aVar, i()));
        new l(this.f2619c).i(strB, jVar, Object.class, new C0059a());
    }

    public final void f(List<Cb.a> list, InterfaceC16021c<Void> interfaceC16021c) {
        if (!this.f2618b.c()) {
            interfaceC16021c.a(null);
            return;
        }
        kt.j jVar = new kt.j();
        Iterator<Cb.a> it = list.iterator();
        while (it.hasNext()) {
            jVar.a(Ab.a.c(it.next(), i()));
        }
        new l(this.f2619c).i(this.f2617a.b(j.f16528a, "application", Long.toString(this.f2618b.x().a().longValue()), "currentplacestate"), jVar, Void.class, interfaceC16021c);
    }

    public a(f fVar, e eVar, h hVar, b bVar) {
        this.f2617a = fVar;
        this.f2618b = eVar;
        this.f2619c = hVar;
        this.f2621e = bVar;
    }

    @Override // Cb.d
    public final void b(Cb.a aVar) {
        j(aVar);
    }

    @Override // Cb.d
    public final void c(Cb.a aVar) {
        j(aVar);
    }

    @Override // Cb.d
    public final void d(Cb.a aVar) {
        j(aVar);
    }
}
