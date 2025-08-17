package Ab;

import Ab.a;
import Bb.g;
import Lb.p;
import Vb.a;
import ac.InterfaceC5594a;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import hb.C14394a;
import ic.C14713a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.C15395a;
import lc.C15397c;
import qt.InterfaceC16605a;
import wb.C17805a;
import yb.C18199a;

/* loaded from: classes4.dex */
public class b implements Rb.c, InterfaceC16605a {

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f165j = C6381b.a(b.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C6382c f166k = C6383d.a(b.class.getName());

    /* renamed from: l, reason: collision with root package name */
    private static final C6382c f167l = C6383d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    public final Db.d f168a;

    /* renamed from: b, reason: collision with root package name */
    public final a f169b = new a();

    /* renamed from: c, reason: collision with root package name */
    private C14394a f170c;

    /* renamed from: d, reason: collision with root package name */
    private p f171d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5594a f172e;

    /* renamed from: f, reason: collision with root package name */
    private Bb.b f173f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f174g;

    /* renamed from: h, reason: collision with root package name */
    private Bb.e f175h;

    /* renamed from: i, reason: collision with root package name */
    public Cb.e f176i;

    protected class a extends g<d> {
        protected a() {
        }

        protected final void p(Ab.a aVar, Db.b bVar) {
            b.this.f170c.d(aVar);
            if (bVar.f() == null) {
                Iterator<d> it = iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    try {
                        C6380a unused = b.f165j;
                        next.getClass();
                        next.d(aVar);
                    } catch (Exception unused2) {
                        C6380a unused3 = b.f165j;
                    }
                }
            }
        }

        protected final void q(Ab.a aVar, Db.b bVar) {
            if (bVar.f() == null) {
                Iterator<d> it = iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    try {
                        C6380a unused = b.f165j;
                        next.getClass();
                        bVar.g();
                        next.b(aVar);
                    } catch (Exception unused2) {
                        C6380a unused3 = b.f165j;
                    }
                }
            }
        }

        protected final void r(Ab.a aVar, Db.b bVar) {
            if (bVar.f() == null) {
                Iterator<d> it = iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    try {
                        C6380a unused = b.f165j;
                        next.getClass();
                        next.c(aVar);
                    } catch (Exception unused2) {
                        C6380a unused3 = b.f165j;
                    }
                }
            }
        }
    }

    private static a.EnumC0008a h(C15395a c15395a) {
        return (c15395a.d() == null || !c15395a.d().name().equals(a.EnumC0807a.IBEACON.name())) ? a.EnumC0008a.BEACON : a.EnumC0008a.IBEACON;
    }

    @Override // Rb.c
    public final void b(C14713a c14713a, C15397c c15397c) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f166k.c("Received Sighting for {}", c15397c.c());
        Va.c cVarA = C17805a.a(c14713a, c15397c);
        a aVar = this.f169b;
        Iterator<d> it = aVar.iterator();
        while (it.hasNext()) {
            d next = it.next();
            try {
                next.getClass();
                c cVar = new c();
                cVar.f179b = cVarA;
                Db.d dVar = b.this.f168a;
                String strA = cVarA.a().a();
                ArrayList arrayList = new ArrayList();
                for (Db.b bVar : dVar.u()) {
                    Iterator<String> it2 = bVar.A().iterator();
                    while (it2.hasNext()) {
                        if (strA.equals(it2.next())) {
                            arrayList.add(bVar);
                        }
                    }
                }
                cVar.f178a = arrayList.iterator();
                next.g(cVar);
            } catch (Exception unused) {
            }
        }
    }

    public final void f(d dVar) {
        this.f169b.a(dVar);
    }

    public b(Db.d dVar, C14394a c14394a, p pVar, InterfaceC5594a interfaceC5594a, Bb.b bVar, Lb.g gVar, Bb.e eVar) {
        this.f168a = dVar;
        this.f170c = c14394a;
        this.f171d = pVar;
        this.f172e = interfaceC5594a;
        this.f173f = bVar;
        this.f174g = gVar.f17945b;
        this.f175h = eVar;
    }

    @Override // Rb.c
    public final void c(C15395a c15395a) {
        c15395a.c();
        try {
            Bb.p<Long, Db.b>.b bVarE = this.f168a.e();
            try {
                Db.b bVarH = this.f168a.h(c15395a.k());
                if (bVarH != null) {
                    if (!bVarH.o(c15395a.n())) {
                        bVarH.k();
                        c15395a.n();
                    } else {
                        this.f170c.e(c15395a, bVarH);
                        bVarH.p(c15395a.n());
                        if (bVarH.n()) {
                            bVarH.k();
                            bVarH.z();
                            this.f168a.g(bVarE, bVarH);
                        } else {
                            if (this.f174g && this.f175h.e() && bVarH.f() == null) {
                                f167l.b("Left place: {} (beacon {})", bVarH.k(), c15395a.n());
                            } else {
                                bVarH.k();
                                c15395a.n();
                            }
                            bVarH.u(c15395a.f().longValue());
                            double dI = c15395a.i();
                            double dJ = c15395a.j();
                            ac.c cVarA = this.f172e.a();
                            if (cVarA != null && this.f173f.t()) {
                                dI = cVarA.f44474a.getLatitude();
                                dJ = cVarA.f44474a.getLongitude();
                            }
                            double d10 = dJ;
                            Ab.a aVarD = C18199a.d(bVarH, h(c15395a), c15395a.n(), dI, d10);
                            this.f170c.d(aVarD);
                            this.f169b.r(aVarD, bVarH);
                            bVarH.t(0L);
                            this.f168a.g(bVarE, bVarH);
                            if (bVarH.g() > 0) {
                                Cb.e eVar = this.f176i;
                                Cb.a aVarH = eVar.f3761a.h(aVarD.j());
                                if (aVarH != null) {
                                    aVarH.f(0L);
                                    eVar.f3763c.d();
                                }
                            }
                        }
                    }
                }
                bVarE.a();
            } catch (Throwable th2) {
                bVarE.a();
                throw th2;
            }
        } catch (IOException unused) {
            f166k.g("Unable to persist changed caused by beacon event for: {}", c15395a.c());
        }
    }

    @Override // Rb.c
    public final void d(C15395a c15395a) {
        c15395a.c();
        c15395a.d().name();
        try {
            Bb.p<Long, Db.b>.b bVarE = this.f168a.e();
            try {
                Db.b bVarH = this.f168a.h(c15395a.k());
                if (bVarH != null) {
                    bVarH.k();
                    c15395a.k();
                    if (bVarH.o(c15395a.n())) {
                        bVarH.k();
                        c15395a.n();
                        c15395a.d().name();
                    } else {
                        c15395a.n();
                        c15395a.d().name();
                        bVarH.k();
                        c15395a.a();
                        bVarH.b(c15395a.n());
                        if (bVarH.h() != 0 && bVarH.h() >= bVarH.i()) {
                            bVarH.k();
                            this.f168a.g(bVarE, bVarH);
                        } else {
                            if (this.f174g && this.f175h.e() && bVarH.f() == null) {
                                f167l.b("Arrived at place: {} (beacon {})", bVarH.k(), c15395a.n());
                            } else {
                                bVarH.k();
                                c15395a.n();
                            }
                            bVarH.t(c15395a.a().longValue());
                            bVarH.u(0L);
                            bVarH.y(this.f171d.a());
                            this.f168a.g(bVarE, bVarH);
                            Ab.a aVarB = C18199a.b(bVarH, h(c15395a), c15395a.n(), c15395a.i(), c15395a.j());
                            this.f169b.p(aVarB, bVarH);
                            if (bVarH.g() > 0) {
                                this.f176i.b(aVarB, c15395a.n());
                            } else {
                                this.f169b.q(aVarB, bVarH);
                            }
                        }
                        this.f170c.e(c15395a, bVarH);
                    }
                } else {
                    c15395a.k();
                }
                bVarE.a();
            } catch (Throwable th2) {
                bVarE.a();
                throw th2;
            }
        } catch (IOException unused) {
            f166k.g("Unable to persist changed caused by beacon event for: {}", c15395a.n());
        }
    }

    public final void g(List<Cb.a> list) {
        for (Cb.a aVar : list) {
            Ab.a aVarB = aVar.b();
            if (aVarB.g().o(aVar.d())) {
                this.f169b.q(aVarB, aVarB.g());
            }
        }
    }
}
