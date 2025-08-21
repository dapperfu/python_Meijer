package zt;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kt.C15422h;
import pt.InterfaceC16542b;
import pt.InterfaceC16543c;
import s5.C17020a;
import ut.C17467a;
import ut.C17476j;
import ut.InterfaceC17475i;
import ut.InterfaceC17477k;

/* renamed from: zt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C18548b implements InterfaceC16542b, InterfaceC17477k {

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f173210j = C13785b.a(C18548b.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C13786c f173211k = C13787d.a(C18548b.class.getName());

    /* renamed from: l, reason: collision with root package name */
    static final C13786c f173212l = C13787d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    private final C18549c f173213a;

    /* renamed from: b, reason: collision with root package name */
    final Dt.c f173214b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC17475i f173215c;

    /* renamed from: d, reason: collision with root package name */
    private final bb.e f173216d;

    /* renamed from: e, reason: collision with root package name */
    private final xt.f f173217e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC16543c f173218f;

    /* renamed from: g, reason: collision with root package name */
    private final C17020a f173219g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f173220h;

    /* renamed from: i, reason: collision with root package name */
    final Db.e f173221i;

    private List<kt.k> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<C15422h> it = this.f173218f.a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private synchronized void j(C17467a c17467a, List<C17476j> list) {
        try {
            for (kt.k kVar : a()) {
                if (h(kVar)) {
                    this.f173219g.h(kVar);
                    C18549c c18549c = this.f173213a;
                    if (c18549c.f173223a.c(kVar, c17467a) || c18549c.f173223a.a(kVar, c17467a) <= c18549c.a(c17467a)) {
                        C17476j c17476jE = e(kVar, kt.n.AT, c17467a);
                        if (this.f173220h && this.f173221i.e() && kVar.w() == null) {
                            f173212l.a("--->  {}", c17476jE);
                        }
                        list.add(c17476jE);
                        this.f173215c.a(kVar);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
    }

    private C17476j e(kt.k kVar, kt.n nVar, C17467a c17467a) {
        return new C17476j(kVar, nVar, Long.valueOf(this.f173216d.a()), c17467a);
    }

    private void g(C17467a c17467a, List<C17476j> list) {
        ArrayList arrayList = new ArrayList();
        for (kt.k kVar : this.f173215c.a()) {
            C18549c c18549c = this.f173213a;
            if (!c18549c.f173223a.c(kVar, c17467a) && c18549c.f173223a.a(kVar, c17467a) > c18549c.b(c17467a, c18549c.f173223a.b(kVar))) {
                C17476j c17476jE = e(kVar, kt.n.LEFT, c17467a);
                if (this.f173220h && this.f173221i.e() && kVar.w() == null) {
                    f173212l.a("--->  {}", c17476jE);
                }
                list.add(c17476jE);
                arrayList.add(kVar);
            }
        }
        this.f173215c.a(arrayList);
    }

    private boolean h(kt.k kVar) {
        return !this.f173215c.b(kVar);
    }

    private void i(C17467a c17467a) {
        if (f173210j.b()) {
            for (kt.k kVar : a()) {
                if (f173210j.a()) {
                    this.f173217e.c(kVar, c17467a);
                    this.f173217e.a(kVar, c17467a);
                    kVar.getName();
                    if (h(kVar)) {
                        kt.n.LEFT.name();
                    } else {
                        kt.n.AT.name();
                    }
                    this.f173213a.a(c17467a);
                    this.f173213a.b(c17467a, this.f173217e.b(kVar));
                }
            }
        }
    }

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        C17467a c17467aA = this.f173214b.a();
        if (this.f173220h && this.f173221i.e()) {
            f173212l.d("Using fix: " + c17467aA, new Object[0]);
        } else {
            Objects.toString(c17467aA);
        }
        if (c17467aA != null) {
            list.addAll(d(c17467aA));
        }
        return false;
    }

    final List<C17476j> d(C17467a c17467a) {
        ArrayList arrayList = new ArrayList();
        i(c17467a);
        g(c17467a, arrayList);
        j(c17467a, arrayList);
        arrayList.size();
        return arrayList;
    }

    public C18548b(C18549c c18549c, Dt.c cVar, InterfaceC17475i interfaceC17475i, bb.e eVar, xt.f fVar, InterfaceC16543c interfaceC16543c, C17020a c17020a, Nb.g gVar, Db.e eVar2) {
        this.f173213a = c18549c;
        this.f173214b = cVar;
        this.f173215c = interfaceC17475i;
        this.f173216d = eVar;
        this.f173217e = fVar;
        this.f173218f = interfaceC16543c;
        this.f173219g = c17020a;
        this.f173220h = gVar.f20765b;
        this.f173221i = eVar2;
    }

    @Override // pt.InterfaceC16542b
    public final synchronized void a(List<C15422h> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (kt.k kVar : this.f173215c.a()) {
                if (!list.contains(kVar) && (kVar instanceof C15422h)) {
                    arrayList.add(kVar);
                }
            }
            this.f173215c.a(arrayList);
            for (C15422h c15422h : list) {
                if (this.f173215c.b(c15422h)) {
                    this.f173215c.a(c15422h);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
