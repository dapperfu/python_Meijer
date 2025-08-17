package zb;

import Ab.d;
import Bb.e;
import Ib.f;
import Ib.h;
import Ib.j;
import Ib.l;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.Iterator;
import java.util.List;
import nt.InterfaceC15945c;
import yb.C18199a;

/* renamed from: zb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18413a implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f171701f = C6381b.a(C18413a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final C6382c f171702g = C6383d.a(C18413a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final f f171703a;

    /* renamed from: b, reason: collision with root package name */
    private final e f171704b;

    /* renamed from: c, reason: collision with root package name */
    private final h f171705c;

    /* renamed from: d, reason: collision with root package name */
    public Ya.c f171706d;

    /* renamed from: e, reason: collision with root package name */
    private C18414b f171707e;

    /* renamed from: zb.a$a, reason: collision with other inner class name */
    final class C2767a implements InterfaceC15945c<Object> {
        @Override // nt.InterfaceC15945c
        public final void a(Object obj) {
            C6380a unused = C18413a.f171701f;
        }

        C2767a() {
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C18413a.f171702g.g("Error during uploading to the server statusCode [{}], errorMessage", Integer.valueOf(i10), str);
            if (C18413a.this.f171706d != null) {
                C18413a.this.f171706d.r();
            }
        }
    }

    @Override // Ab.d
    public final void g(Ab.c cVar) {
    }

    private Long i() {
        return this.f171704b.x().d();
    }

    private void j(Ab.a aVar) {
        if (!this.f171704b.c()) {
            aVar.i();
            C18414b c18414b = this.f171707e;
            c18414b.f171710a.J();
            c18414b.f171710a.M();
            c18414b.f171711b.s();
            c18414b.f171711b.u();
            return;
        }
        String strB = this.f171703a.b(j.f13782a, "application", Long.toString(this.f171704b.x().a().longValue()), "placeEvents");
        aVar.c();
        aVar.i();
        aVar.j();
        kt.j jVar = new kt.j();
        jVar.b().add(C18199a.c(aVar, i()));
        new l(this.f171705c).i(strB, jVar, Object.class, new C2767a());
    }

    public final void f(List<Ab.a> list, InterfaceC15945c<Void> interfaceC15945c) {
        if (!this.f171704b.c()) {
            interfaceC15945c.a(null);
            return;
        }
        kt.j jVar = new kt.j();
        Iterator<Ab.a> it = list.iterator();
        while (it.hasNext()) {
            jVar.a(C18199a.c(it.next(), i()));
        }
        new l(this.f171705c).i(this.f171703a.b(j.f13782a, "application", Long.toString(this.f171704b.x().a().longValue()), "currentplacestate"), jVar, Void.class, interfaceC15945c);
    }

    public C18413a(f fVar, e eVar, h hVar, C18414b c18414b) {
        this.f171703a = fVar;
        this.f171704b = eVar;
        this.f171705c = hVar;
        this.f171707e = c18414b;
    }

    @Override // Ab.d
    public final void b(Ab.a aVar) {
        j(aVar);
    }

    @Override // Ab.d
    public final void c(Ab.a aVar) {
        j(aVar);
    }

    @Override // Ab.d
    public final void d(Ab.a aVar) {
        j(aVar);
    }
}
