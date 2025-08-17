package gb;

import Bb.k;
import Ic.a;
import cb.C6380a;
import cb.C6381b;
import vb.C17538d;

/* renamed from: gb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14231a extends Ya.b implements k {

    /* renamed from: r, reason: collision with root package name */
    private static final C6380a f133256r = C6381b.a("AdIdMonitorJob");

    /* renamed from: n, reason: collision with root package name */
    private xb.c f133257n;

    /* renamed from: o, reason: collision with root package name */
    private Bb.b f133258o;

    /* renamed from: p, reason: collision with root package name */
    private Bb.e f133259p;

    /* renamed from: q, reason: collision with root package name */
    private d f133260q;

    public C14231a(Za.c cVar, Za.e eVar, xb.c cVar2, d dVar, Bb.b bVar, Bb.e eVar2) {
        super(cVar, eVar, "AdIdMonitorJob", 7200000L);
        this.f133257n = cVar2;
        this.f133258o = bVar;
        this.f133259p = eVar2;
        this.f133260q = dVar;
        eVar2.h(this, "Registration_Properties");
        bVar.g(this, "allowCollectIDFA");
        bVar.g(this, "overrideCollectIDFA");
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str) || "allowCollectIDFA".equals(str) || "overrideCollectIDFA".equals(str)) {
            u();
        }
    }

    @Override // Ya.c
    public final void x() throws Exception {
        a.C0217a c0217aA;
        if (this.f133259p.v()) {
            Eb.f fVarA = this.f133258o.A();
            if ((fVarA == Eb.f.ON || (fVarA == Eb.f.NOT_SET && this.f133258o.v())) && (c0217aA = this.f133260q.a()) != null) {
                Eb.a aVarE = this.f133259p.E();
                Eb.a aVar = new Eb.a();
                aVar.c(c0217aA.a());
                aVar.d(!c0217aA.b());
                if (aVarE == null || aVarE.a().equals(aVar.a())) {
                    if (f133256r.b()) {
                        C17538d.e(aVar, 4);
                    }
                    this.f133259p.r(aVar);
                } else {
                    this.f133257n.b();
                }
                this.f133259p.i(aVar);
            }
        }
    }

    @Override // Ya.b, Ya.c
    public final long o() {
        return 5400000L;
    }
}
