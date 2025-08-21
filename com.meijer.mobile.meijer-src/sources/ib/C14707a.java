package ib;

import Db.k;
import Kc.a;
import ab.AbstractC5677b;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import xb.C18150d;

/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14707a extends AbstractC5677b implements k {

    /* renamed from: r, reason: collision with root package name */
    private static final C13784a f137472r = C13785b.a("AdIdMonitorJob");

    /* renamed from: n, reason: collision with root package name */
    private zb.c f137473n;

    /* renamed from: o, reason: collision with root package name */
    private Db.b f137474o;

    /* renamed from: p, reason: collision with root package name */
    private Db.e f137475p;

    /* renamed from: q, reason: collision with root package name */
    private d f137476q;

    public C14707a(C6346c c6346c, bb.e eVar, zb.c cVar, d dVar, Db.b bVar, Db.e eVar2) {
        super(c6346c, eVar, "AdIdMonitorJob", 7200000L);
        this.f137473n = cVar;
        this.f137474o = bVar;
        this.f137475p = eVar2;
        this.f137476q = dVar;
        eVar2.h(this, "Registration_Properties");
        bVar.g(this, "allowCollectIDFA");
        bVar.g(this, "overrideCollectIDFA");
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str) || "allowCollectIDFA".equals(str) || "overrideCollectIDFA".equals(str)) {
            u();
        }
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        a.C0277a c0277aA;
        if (this.f137475p.v()) {
            Gb.f fVarA = this.f137474o.A();
            if ((fVarA == Gb.f.ON || (fVarA == Gb.f.NOT_SET && this.f137474o.v())) && (c0277aA = this.f137476q.a()) != null) {
                Gb.a aVarE = this.f137475p.E();
                Gb.a aVar = new Gb.a();
                aVar.c(c0277aA.a());
                aVar.d(!c0277aA.b());
                if (aVarE == null || aVarE.a().equals(aVar.a())) {
                    if (f137472r.b()) {
                        C18150d.e(aVar, 4);
                    }
                    this.f137475p.r(aVar);
                } else {
                    this.f137473n.b();
                }
                this.f137475p.i(aVar);
            }
        }
    }

    @Override // ab.AbstractC5677b, ab.AbstractC5678c
    public final long o() {
        return 5400000L;
    }
}
