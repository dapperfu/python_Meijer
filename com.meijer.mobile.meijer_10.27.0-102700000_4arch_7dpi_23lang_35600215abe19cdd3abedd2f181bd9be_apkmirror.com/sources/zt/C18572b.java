package zt;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kt.C15319h;
import pt.InterfaceC16416b;
import pt.InterfaceC16417c;
import r5.C16723a;
import ut.C17315a;
import ut.C17324j;
import ut.InterfaceC17323i;
import ut.InterfaceC17325k;

/* renamed from: zt.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C18572b implements InterfaceC16416b, InterfaceC17325k {

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f173249j = C6381b.a(C18572b.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C6382c f173250k = C6383d.a(C18572b.class.getName());

    /* renamed from: l, reason: collision with root package name */
    static final C6382c f173251l = C6383d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    private final C18573c f173252a;

    /* renamed from: b, reason: collision with root package name */
    final Dt.c f173253b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC17323i f173254c;

    /* renamed from: d, reason: collision with root package name */
    private final Za.e f173255d;

    /* renamed from: e, reason: collision with root package name */
    private final xt.f f173256e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC16417c f173257f;

    /* renamed from: g, reason: collision with root package name */
    private final C16723a f173258g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f173259h;

    /* renamed from: i, reason: collision with root package name */
    final Bb.e f173260i;

    private List<kt.k> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<C15319h> it = this.f173257f.a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private synchronized void j(C17315a c17315a, List<C17324j> list) {
        try {
            for (kt.k kVar : a()) {
                if (h(kVar)) {
                    this.f173258g.h(kVar);
                    C18573c c18573c = this.f173252a;
                    if (c18573c.f173262a.c(kVar, c17315a) || c18573c.f173262a.a(kVar, c17315a) <= c18573c.a(c17315a)) {
                        C17324j c17324jE = e(kVar, kt.n.AT, c17315a);
                        if (this.f173259h && this.f173260i.e() && kVar.w() == null) {
                            f173251l.a("--->  {}", c17324jE);
                        }
                        list.add(c17324jE);
                        this.f173254c.a(kVar);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
    }

    private C17324j e(kt.k kVar, kt.n nVar, C17315a c17315a) {
        return new C17324j(kVar, nVar, Long.valueOf(this.f173255d.a()), c17315a);
    }

    private void g(C17315a c17315a, List<C17324j> list) {
        ArrayList arrayList = new ArrayList();
        for (kt.k kVar : this.f173254c.a()) {
            C18573c c18573c = this.f173252a;
            if (!c18573c.f173262a.c(kVar, c17315a) && c18573c.f173262a.a(kVar, c17315a) > c18573c.b(c17315a, c18573c.f173262a.b(kVar))) {
                C17324j c17324jE = e(kVar, kt.n.LEFT, c17315a);
                if (this.f173259h && this.f173260i.e() && kVar.w() == null) {
                    f173251l.a("--->  {}", c17324jE);
                }
                list.add(c17324jE);
                arrayList.add(kVar);
            }
        }
        this.f173254c.a(arrayList);
    }

    private boolean h(kt.k kVar) {
        return !this.f173254c.b(kVar);
    }

    private void i(C17315a c17315a) {
        if (f173249j.b()) {
            for (kt.k kVar : a()) {
                if (f173249j.a()) {
                    this.f173256e.c(kVar, c17315a);
                    this.f173256e.a(kVar, c17315a);
                    kVar.getName();
                    if (h(kVar)) {
                        kt.n.LEFT.name();
                    } else {
                        kt.n.AT.name();
                    }
                    this.f173252a.a(c17315a);
                    this.f173252a.b(c17315a, this.f173256e.b(kVar));
                }
            }
        }
    }

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        C17315a c17315aA = this.f173253b.a();
        if (this.f173259h && this.f173260i.e()) {
            f173251l.d("Using fix: " + c17315aA, new Object[0]);
        } else {
            Objects.toString(c17315aA);
        }
        if (c17315aA != null) {
            list.addAll(d(c17315aA));
        }
        return false;
    }

    final List<C17324j> d(C17315a c17315a) {
        ArrayList arrayList = new ArrayList();
        i(c17315a);
        g(c17315a, arrayList);
        j(c17315a, arrayList);
        arrayList.size();
        return arrayList;
    }

    public C18572b(C18573c c18573c, Dt.c cVar, InterfaceC17323i interfaceC17323i, Za.e eVar, xt.f fVar, InterfaceC16417c interfaceC16417c, C16723a c16723a, Lb.g gVar, Bb.e eVar2) {
        this.f173252a = c18573c;
        this.f173253b = cVar;
        this.f173254c = interfaceC17323i;
        this.f173255d = eVar;
        this.f173256e = fVar;
        this.f173257f = interfaceC16417c;
        this.f173258g = c16723a;
        this.f173259h = gVar.f17945b;
        this.f173260i = eVar2;
    }

    @Override // pt.InterfaceC16416b
    public final synchronized void a(List<C15319h> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (kt.k kVar : this.f173254c.a()) {
                if (!list.contains(kVar) && (kVar instanceof C15319h)) {
                    arrayList.add(kVar);
                }
            }
            this.f173254c.a(arrayList);
            for (C15319h c15319h : list) {
                if (this.f173254c.b(c15319h)) {
                    this.f173254c.a(c15319h);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
