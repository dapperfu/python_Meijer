package pt;

import Bb.g;
import Ib.j;
import Ib.k;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import kt.C15315d;
import kt.C15319h;
import kt.m;
import nt.InterfaceC15945c;
import ut.C17315a;
import ut.C17321g;
import ut.InterfaceC17316b;
import ut.InterfaceC17317c;
import vb.C17538d;
import xt.InterfaceC18093a;

/* renamed from: pt.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C16418d extends g<InterfaceC16416b> implements InterfaceC16417c, InterfaceC17316b {

    /* renamed from: m, reason: collision with root package name */
    private static final C6380a f156626m = C6381b.a(C16418d.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private static final C6382c f156627n = C6383d.a(C16418d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Ib.f f156628b;

    /* renamed from: c, reason: collision with root package name */
    private final C16415a f156629c;

    /* renamed from: d, reason: collision with root package name */
    private C17321g f156630d;

    /* renamed from: e, reason: collision with root package name */
    private final C16419e f156631e;

    /* renamed from: f, reason: collision with root package name */
    private final Db.d f156632f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC18093a f156633g;

    /* renamed from: h, reason: collision with root package name */
    private final k<m> f156634h;

    /* renamed from: i, reason: collision with root package name */
    private final Semaphore f156635i = new Semaphore(1);

    /* renamed from: j, reason: collision with root package name */
    private final st.b f156636j;

    /* renamed from: k, reason: collision with root package name */
    private final Za.e f156637k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC17317c f156638l;

    /* renamed from: pt.d$a */
    final class a implements InterfaceC15945c<List<C15319h>> {
        @Override // nt.InterfaceC15945c
        public final /* bridge */ /* synthetic */ void a(List<C15319h> list) {
        }

        a() {
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C16418d.f156627n.g(str, new Object[0]);
        }
    }

    /* renamed from: pt.d$b */
    private class b implements InterfaceC15945c<m> {

        /* renamed from: a, reason: collision with root package name */
        InterfaceC15945c<List<C15319h>> f156640a;

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(m mVar) {
            m mVar2 = mVar;
            try {
                C16419e c16419e = C16418d.this.f156631e;
                c16419e.f139561a.c("PlaceBubbleBoundary", mVar2.a());
                C16418d.this.f156636j.c("last.place.bubble.request.time", Long.valueOf(C16418d.this.f156637k.a()));
                C16418d.s(C16418d.this, mVar2.b());
                this.f156640a.a(mVar2.b());
                C6380a unused = C16418d.f156626m;
            } finally {
                C16418d.this.f156635i.release();
            }
        }

        public b(InterfaceC15945c<List<C15319h>> interfaceC15945c) {
            this.f156640a = interfaceC15945c;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            try {
                this.f156640a.a(i10, str);
            } finally {
                C16418d.this.f156635i.release();
            }
        }
    }

    @Override // pt.InterfaceC16417c
    public final List<C15319h> a() {
        return this.f156629c.b();
    }

    static /* synthetic */ void s(C16418d c16418d, List list) {
        if (c16418d.f156630d.f163490i) {
            jb.b<T> bVar = c16418d.f156629c.f139561a;
            bVar.f139548b = true;
            bVar.f139547a.b();
            c16418d.f156629c.c(list);
            HashMap map = new HashMap();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C15319h c15319h = (C15319h) it.next();
                    Ob.g gVarA = C16420f.a(c15319h);
                    if (f156626m.a()) {
                        C17538d.e(gVarA, 4);
                    }
                    map.put(c15319h.getId(), gVarA);
                }
                c16418d.f156632f.y(map);
            } catch (Exception e10) {
                f156627n.g("Unable to update places", e10);
            }
            c16418d.r(list);
        }
    }

    private void t(C17315a c17315a, InterfaceC15945c<List<C15319h>> interfaceC15945c) {
        Long lA;
        C15315d c15315d = (C15315d) this.f156631e.f139561a.a("PlaceBubbleBoundary");
        if (c15315d == null || c15315d.a() == null || c15315d.a().a() == null || c15315d.a().b() == null) {
            v(c17315a, interfaceC15945c);
            return;
        }
        float fA = this.f156633g.a(c17315a, new C17315a(c15315d.a().a().doubleValue(), c15315d.a().b().doubleValue(), 0.0f, "None", 0L));
        float fIntValue = c15315d.b().intValue() * 0.75f;
        c15315d.b();
        if (fA <= fIntValue && (lA = this.f156636j.a("last.place.bubble.request.time")) != null && this.f156637k.a() - lA.longValue() <= 79200000) {
            interfaceC15945c.a(this.f156629c.b());
        } else {
            v(c17315a, interfaceC15945c);
        }
    }

    private void v(C17315a c17315a, InterfaceC15945c<List<C15319h>> interfaceC15945c) {
        if (!this.f156635i.tryAcquire()) {
            interfaceC15945c.a(-1, "Place Bubble refresh is already in Progress");
            return;
        }
        try {
            this.f156634h.i(this.f156628b.g(j.f13790i + "?latitude=" + c17315a.f163451a + "&longitude=" + c17315a.f163452b), m.class, new b(interfaceC15945c));
        } catch (Error e10) {
            q(e10, interfaceC15945c);
            throw e10;
        } catch (Exception e11) {
            q(e11, interfaceC15945c);
        }
    }

    @Override // ut.InterfaceC17316b
    public final void a(C17315a c17315a) {
        t(c17315a, new a());
    }

    @Override // pt.InterfaceC16417c
    public final void h(C17321g c17321g) {
        this.f156630d = c17321g;
    }

    @Override // pt.InterfaceC16417c
    public final void k(InterfaceC15945c<List<C15319h>> interfaceC15945c) {
        if (!this.f156630d.f163490i) {
            interfaceC15945c.a(new ArrayList());
            return;
        }
        C17315a c17315aA = this.f156638l.a();
        if (c17315aA != null) {
            t(c17315aA, interfaceC15945c);
        } else {
            interfaceC15945c.a(20001, "Unable to refresh place bubble, no fix available");
        }
    }

    public C16418d(Ib.f fVar, C16415a c16415a, C16419e c16419e, Db.d dVar, InterfaceC18093a interfaceC18093a, k<m> kVar, st.b bVar, Za.e eVar) {
        this.f156628b = fVar;
        this.f156629c = c16415a;
        this.f156631e = c16419e;
        this.f156632f = dVar;
        this.f156633g = interfaceC18093a;
        this.f156634h = kVar;
        this.f156636j = bVar;
        this.f156637k = eVar;
    }

    private void q(Throwable th2, InterfaceC15945c<List<C15319h>> interfaceC15945c) {
        th2.getMessage();
        interfaceC15945c.a(-1, th2.getMessage());
        this.f156635i.release();
    }

    private void r(List<C15319h> list) {
        Iterator<InterfaceC16416b> it = iterator();
        while (it.hasNext()) {
            it.next().a(list);
        }
    }
}
