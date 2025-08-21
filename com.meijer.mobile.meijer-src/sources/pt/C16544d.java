package pt;

import Db.g;
import Kb.j;
import Kb.k;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import kt.C15418d;
import kt.C15422h;
import kt.m;
import nt.InterfaceC16021c;
import ut.C17467a;
import ut.C17473g;
import ut.InterfaceC17468b;
import ut.InterfaceC17469c;
import xb.C18150d;
import xt.InterfaceC18221a;

/* renamed from: pt.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C16544d extends g<InterfaceC16542b> implements InterfaceC16543c, InterfaceC17468b {

    /* renamed from: m, reason: collision with root package name */
    private static final C13784a f157399m = C13785b.a(C16544d.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private static final C13786c f157400n = C13787d.a(C16544d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Kb.f f157401b;

    /* renamed from: c, reason: collision with root package name */
    private final C16541a f157402c;

    /* renamed from: d, reason: collision with root package name */
    private C17473g f157403d;

    /* renamed from: e, reason: collision with root package name */
    private final C16545e f157404e;

    /* renamed from: f, reason: collision with root package name */
    private final Fb.d f157405f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC18221a f157406g;

    /* renamed from: h, reason: collision with root package name */
    private final k<m> f157407h;

    /* renamed from: i, reason: collision with root package name */
    private final Semaphore f157408i = new Semaphore(1);

    /* renamed from: j, reason: collision with root package name */
    private final st.b f157409j;

    /* renamed from: k, reason: collision with root package name */
    private final bb.e f157410k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC17469c f157411l;

    /* renamed from: pt.d$a */
    final class a implements InterfaceC16021c<List<C15422h>> {
        @Override // nt.InterfaceC16021c
        public final /* bridge */ /* synthetic */ void a(List<C15422h> list) {
        }

        a() {
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C16544d.f157400n.g(str, new Object[0]);
        }
    }

    /* renamed from: pt.d$b */
    private class b implements InterfaceC16021c<m> {

        /* renamed from: a, reason: collision with root package name */
        InterfaceC16021c<List<C15422h>> f157413a;

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(m mVar) {
            m mVar2 = mVar;
            try {
                C16545e c16545e = C16544d.this.f157404e;
                c16545e.f149575a.c("PlaceBubbleBoundary", mVar2.a());
                C16544d.this.f157409j.c("last.place.bubble.request.time", Long.valueOf(C16544d.this.f157410k.a()));
                C16544d.s(C16544d.this, mVar2.b());
                this.f157413a.a(mVar2.b());
                C13784a unused = C16544d.f157399m;
            } finally {
                C16544d.this.f157408i.release();
            }
        }

        public b(InterfaceC16021c<List<C15422h>> interfaceC16021c) {
            this.f157413a = interfaceC16021c;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            try {
                this.f157413a.a(i10, str);
            } finally {
                C16544d.this.f157408i.release();
            }
        }
    }

    @Override // pt.InterfaceC16543c
    public final List<C15422h> a() {
        return this.f157402c.b();
    }

    static /* synthetic */ void s(C16544d c16544d, List list) {
        if (c16544d.f157403d.f164568i) {
            lb.b<T> bVar = c16544d.f157402c.f149575a;
            bVar.f149562b = true;
            bVar.f149561a.b();
            c16544d.f157402c.c(list);
            HashMap map = new HashMap();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C15422h c15422h = (C15422h) it.next();
                    Qb.g gVarA = C16546f.a(c15422h);
                    if (f157399m.a()) {
                        C18150d.e(gVarA, 4);
                    }
                    map.put(c15422h.getId(), gVarA);
                }
                c16544d.f157405f.y(map);
            } catch (Exception e10) {
                f157400n.g("Unable to update places", e10);
            }
            c16544d.r(list);
        }
    }

    private void t(C17467a c17467a, InterfaceC16021c<List<C15422h>> interfaceC16021c) {
        Long lA;
        C15418d c15418d = (C15418d) this.f157404e.f149575a.a("PlaceBubbleBoundary");
        if (c15418d == null || c15418d.a() == null || c15418d.a().a() == null || c15418d.a().b() == null) {
            v(c17467a, interfaceC16021c);
            return;
        }
        float fA = this.f157406g.a(c17467a, new C17467a(c15418d.a().a().doubleValue(), c15418d.a().b().doubleValue(), 0.0f, "None", 0L));
        float fIntValue = c15418d.b().intValue() * 0.75f;
        c15418d.b();
        if (fA <= fIntValue && (lA = this.f157409j.a("last.place.bubble.request.time")) != null && this.f157410k.a() - lA.longValue() <= 79200000) {
            interfaceC16021c.a(this.f157402c.b());
        } else {
            v(c17467a, interfaceC16021c);
        }
    }

    private void v(C17467a c17467a, InterfaceC16021c<List<C15422h>> interfaceC16021c) {
        if (!this.f157408i.tryAcquire()) {
            interfaceC16021c.a(-1, "Place Bubble refresh is already in Progress");
            return;
        }
        try {
            this.f157407h.i(this.f157401b.g(j.f16536i + "?latitude=" + c17467a.f164529a + "&longitude=" + c17467a.f164530b), m.class, new b(interfaceC16021c));
        } catch (Error e10) {
            q(e10, interfaceC16021c);
            throw e10;
        } catch (Exception e11) {
            q(e11, interfaceC16021c);
        }
    }

    @Override // ut.InterfaceC17468b
    public final void a(C17467a c17467a) {
        t(c17467a, new a());
    }

    @Override // pt.InterfaceC16543c
    public final void h(C17473g c17473g) {
        this.f157403d = c17473g;
    }

    @Override // pt.InterfaceC16543c
    public final void k(InterfaceC16021c<List<C15422h>> interfaceC16021c) {
        if (!this.f157403d.f164568i) {
            interfaceC16021c.a(new ArrayList());
            return;
        }
        C17467a c17467aA = this.f157411l.a();
        if (c17467aA != null) {
            t(c17467aA, interfaceC16021c);
        } else {
            interfaceC16021c.a(20001, "Unable to refresh place bubble, no fix available");
        }
    }

    public C16544d(Kb.f fVar, C16541a c16541a, C16545e c16545e, Fb.d dVar, InterfaceC18221a interfaceC18221a, k<m> kVar, st.b bVar, bb.e eVar) {
        this.f157401b = fVar;
        this.f157402c = c16541a;
        this.f157404e = c16545e;
        this.f157405f = dVar;
        this.f157406g = interfaceC18221a;
        this.f157407h = kVar;
        this.f157409j = bVar;
        this.f157410k = eVar;
    }

    private void q(Throwable th2, InterfaceC16021c<List<C15422h>> interfaceC16021c) {
        th2.getMessage();
        interfaceC16021c.a(-1, th2.getMessage());
        this.f157408i.release();
    }

    private void r(List<C15422h> list) {
        Iterator<InterfaceC16542b> it = iterator();
        while (it.hasNext()) {
            it.next().a(list);
        }
    }
}
