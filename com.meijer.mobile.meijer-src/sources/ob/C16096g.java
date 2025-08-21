package ob;

import Cb.a;
import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import mt.C15767b;
import nb.C15926a;
import nt.InterfaceC16021c;

/* renamed from: ob.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16096g {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f153807e = C13785b.a(C16096g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Kb.h f153808a;

    /* renamed from: b, reason: collision with root package name */
    Kb.f f153809b;

    /* renamed from: c, reason: collision with root package name */
    public Db.e f153810c;

    /* renamed from: d, reason: collision with root package name */
    C16097h f153811d;

    /* renamed from: ob.g$a */
    final class a implements InterfaceC16021c<C15767b[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15926a.EnumC2352a f153812a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Cb.a f153813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16021c f153814c;

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(C15767b[] c15767bArr) {
            List<C15926a> listB = C16095f.b(c15767bArr, this.f153812a, this.f153813b);
            C16097h c16097h = C16096g.this.f153811d;
            String strJ = this.f153813b.j();
            a.b bVarC = this.f153813b.c();
            if (bVarC != null) {
                try {
                    Iterator<C16091b> itB = c16097h.f153819b.b();
                    while (itB.hasNext()) {
                        C16091b next = itB.next();
                        if (next.b().startsWith(strJ) && next.c().c() == C16097h.a(bVarC)) {
                            try {
                                next.a();
                                c16097h.f153819b.k(next.b());
                            } catch (IOException unused) {
                                C16097h.f153817i.g("Unable to limit communication {}", next.a());
                            }
                        }
                    }
                } catch (IOException unused2) {
                    C16097h.f153817i.g("Unable to cancel potential scheduled communications {}", new Object[0]);
                }
            }
            C16096g.this.f153811d.b(listB);
            this.f153814c.a(listB);
        }

        a(C15926a.EnumC2352a enumC2352a, Cb.a aVar, InterfaceC16021c interfaceC16021c) {
            this.f153812a = enumC2352a;
            this.f153813b = aVar;
            this.f153814c = interfaceC16021c;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            this.f153814c.a(i10, str);
            C13784a unused = C16096g.f153807e;
        }
    }

    public final synchronized void c() {
        this.f153810c.y(true);
    }

    public final synchronized void d() {
        this.f153810c.y(false);
    }

    static String a(Boolean bool) {
        return "?filter=" + bool;
    }

    public C16096g(Kb.f fVar, Kb.h hVar, Db.e eVar, C16097h c16097h) {
        this.f153808a = hVar;
        this.f153809b = fVar;
        this.f153810c = eVar;
        this.f153811d = c16097h;
    }
}
