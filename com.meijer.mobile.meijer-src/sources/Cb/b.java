package Cb;

import Cb.a;
import Db.g;
import Nb.p;
import Xb.a;
import cc.InterfaceC6500a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.C14972a;
import kc.C15116a;
import nc.C15929a;
import nc.C15931c;
import qt.InterfaceC16764a;
import yb.C18298a;

/* loaded from: classes4.dex */
public class b implements Tb.c, InterfaceC16764a {

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f4161j = C13785b.a(b.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C13786c f4162k = C13787d.a(b.class.getName());

    /* renamed from: l, reason: collision with root package name */
    private static final C13786c f4163l = C13787d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    public final Fb.d f4164a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4165b = new a();

    /* renamed from: c, reason: collision with root package name */
    private C14972a f4166c;

    /* renamed from: d, reason: collision with root package name */
    private p f4167d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6500a f4168e;

    /* renamed from: f, reason: collision with root package name */
    private Db.b f4169f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4170g;

    /* renamed from: h, reason: collision with root package name */
    private Db.e f4171h;

    /* renamed from: i, reason: collision with root package name */
    public Eb.e f4172i;

    protected class a extends g<d> {
        protected a() {
        }

        protected final void p(Cb.a aVar, Fb.b bVar) {
            b.this.f4166c.d(aVar);
            if (bVar.f() == null) {
                Iterator<d> it = iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    try {
                        C13784a unused = b.f4161j;
                        next.getClass();
                        next.c(aVar);
                    } catch (Exception unused2) {
                        C13784a unused3 = b.f4161j;
                    }
                }
            }
        }

        protected final void q(Cb.a aVar, Fb.b bVar) {
            if (bVar.f() == null) {
                Iterator<d> it = iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    try {
                        C13784a unused = b.f4161j;
                        next.getClass();
                        bVar.g();
                        next.b(aVar);
                    } catch (Exception unused2) {
                        C13784a unused3 = b.f4161j;
                    }
                }
            }
        }

        protected final void r(Cb.a aVar, Fb.b bVar) {
            if (bVar.f() == null) {
                Iterator<d> it = iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    try {
                        C13784a unused = b.f4161j;
                        next.getClass();
                        next.d(aVar);
                    } catch (Exception unused2) {
                        C13784a unused3 = b.f4161j;
                    }
                }
            }
        }
    }

    private static a.EnumC0085a h(C15929a c15929a) {
        return (c15929a.d() == null || !c15929a.d().name().equals(a.EnumC0897a.IBEACON.name())) ? a.EnumC0085a.BEACON : a.EnumC0085a.IBEACON;
    }

    @Override // Tb.c
    public final void b(C15116a c15116a, C15931c c15931c) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f4162k.c("Received Sighting for {}", c15931c.c());
        Xa.c cVarA = C18298a.a(c15116a, c15931c);
        a aVar = this.f4165b;
        Iterator<d> it = aVar.iterator();
        while (it.hasNext()) {
            d next = it.next();
            try {
                next.getClass();
                c cVar = new c();
                cVar.f4175b = cVarA;
                Fb.d dVar = b.this.f4164a;
                String strA = cVarA.a().a();
                ArrayList arrayList = new ArrayList();
                for (Fb.b bVar : dVar.u()) {
                    Iterator<String> it2 = bVar.A().iterator();
                    while (it2.hasNext()) {
                        if (strA.equals(it2.next())) {
                            arrayList.add(bVar);
                        }
                    }
                }
                cVar.f4174a = arrayList.iterator();
                next.g(cVar);
            } catch (Exception unused) {
            }
        }
    }

    public final void f(d dVar) {
        this.f4165b.a(dVar);
    }

    public b(Fb.d dVar, C14972a c14972a, p pVar, InterfaceC6500a interfaceC6500a, Db.b bVar, Nb.g gVar, Db.e eVar) {
        this.f4164a = dVar;
        this.f4166c = c14972a;
        this.f4167d = pVar;
        this.f4168e = interfaceC6500a;
        this.f4169f = bVar;
        this.f4170g = gVar.f20765b;
        this.f4171h = eVar;
    }

    @Override // Tb.c
    public final void c(C15929a c15929a) {
        c15929a.c();
        c15929a.d().name();
        try {
            Db.p<Long, Fb.b>.b bVarE = this.f4164a.e();
            try {
                Fb.b bVarH = this.f4164a.h(c15929a.k());
                if (bVarH != null) {
                    bVarH.k();
                    c15929a.k();
                    if (bVarH.o(c15929a.n())) {
                        bVarH.k();
                        c15929a.n();
                        c15929a.d().name();
                    } else {
                        c15929a.n();
                        c15929a.d().name();
                        bVarH.k();
                        c15929a.a();
                        bVarH.b(c15929a.n());
                        if (bVarH.h() != 0 && bVarH.h() >= bVarH.i()) {
                            bVarH.k();
                            this.f4164a.g(bVarE, bVarH);
                        } else {
                            if (this.f4170g && this.f4171h.e() && bVarH.f() == null) {
                                f4163l.b("Arrived at place: {} (beacon {})", bVarH.k(), c15929a.n());
                            } else {
                                bVarH.k();
                                c15929a.n();
                            }
                            bVarH.t(c15929a.a().longValue());
                            bVarH.u(0L);
                            bVarH.y(this.f4167d.a());
                            this.f4164a.g(bVarE, bVarH);
                            Cb.a aVarB = Ab.a.b(bVarH, h(c15929a), c15929a.n(), c15929a.i(), c15929a.j());
                            this.f4165b.p(aVarB, bVarH);
                            if (bVarH.g() > 0) {
                                this.f4172i.b(aVarB, c15929a.n());
                            } else {
                                this.f4165b.q(aVarB, bVarH);
                            }
                        }
                        this.f4166c.e(c15929a, bVarH);
                    }
                } else {
                    c15929a.k();
                }
                bVarE.a();
            } catch (Throwable th2) {
                bVarE.a();
                throw th2;
            }
        } catch (IOException unused) {
            f4162k.g("Unable to persist changed caused by beacon event for: {}", c15929a.n());
        }
    }

    @Override // Tb.c
    public final void d(C15929a c15929a) {
        c15929a.c();
        try {
            Db.p<Long, Fb.b>.b bVarE = this.f4164a.e();
            try {
                Fb.b bVarH = this.f4164a.h(c15929a.k());
                if (bVarH != null) {
                    if (!bVarH.o(c15929a.n())) {
                        bVarH.k();
                        c15929a.n();
                    } else {
                        this.f4166c.e(c15929a, bVarH);
                        bVarH.p(c15929a.n());
                        if (bVarH.n()) {
                            bVarH.k();
                            bVarH.z();
                            this.f4164a.g(bVarE, bVarH);
                        } else {
                            if (this.f4170g && this.f4171h.e() && bVarH.f() == null) {
                                f4163l.b("Left place: {} (beacon {})", bVarH.k(), c15929a.n());
                            } else {
                                bVarH.k();
                                c15929a.n();
                            }
                            bVarH.u(c15929a.f().longValue());
                            double dI = c15929a.i();
                            double dJ = c15929a.j();
                            cc.c cVarA = this.f4168e.a();
                            if (cVarA != null && this.f4169f.t()) {
                                dI = cVarA.f61489a.getLatitude();
                                dJ = cVarA.f61489a.getLongitude();
                            }
                            double d10 = dJ;
                            Cb.a aVarD = Ab.a.d(bVarH, h(c15929a), c15929a.n(), dI, d10);
                            this.f4166c.d(aVarD);
                            this.f4165b.r(aVarD, bVarH);
                            bVarH.t(0L);
                            this.f4164a.g(bVarE, bVarH);
                            if (bVarH.g() > 0) {
                                Eb.e eVar = this.f4172i;
                                Eb.a aVarH = eVar.f7073a.h(aVarD.j());
                                if (aVarH != null) {
                                    aVarH.f(0L);
                                    eVar.f7075c.d();
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
            f4162k.g("Unable to persist changed caused by beacon event for: {}", c15929a.c());
        }
    }

    public final void g(List<Eb.a> list) {
        for (Eb.a aVar : list) {
            Cb.a aVarB = aVar.b();
            if (aVarB.g().o(aVar.d())) {
                this.f4165b.q(aVarB, aVarB.g());
            }
        }
    }
}
