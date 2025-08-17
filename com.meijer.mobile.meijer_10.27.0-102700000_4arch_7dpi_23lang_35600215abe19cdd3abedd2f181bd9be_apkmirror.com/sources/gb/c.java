package gb;

import Bb.k;
import Ib.j;
import Ib.l;
import gb.b.a;
import rb.C16742a;

/* loaded from: classes4.dex */
public final class c extends Ya.b implements k {

    /* renamed from: n, reason: collision with root package name */
    private b f133267n;

    /* renamed from: o, reason: collision with root package name */
    private Bb.b f133268o;

    /* renamed from: p, reason: collision with root package name */
    private d f133269p;

    public c(Za.c cVar, Za.e eVar, b bVar, d dVar, Bb.b bVar2, Bb.e eVar2) {
        super(cVar, eVar, "AdIdSendJob", 4611686018427387903L);
        this.f133267n = bVar;
        this.f133268o = bVar2;
        this.f133269p = dVar;
        bVar2.g(this, "allowCollectIDFA");
        this.f133268o.g(this, "overrideCollectIDFA");
        eVar2.h(this, "Advertising_Info_On_Server");
    }

    private boolean C() {
        Eb.f fVarA = this.f133268o.A();
        if (fVarA != Eb.f.ON) {
            return fVarA == Eb.f.NOT_SET && this.f133268o.v();
        }
        return true;
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (("Advertising_Info_On_Server".equals(str) || "allowCollectIDFA".equals(str)) && C()) {
            u();
        }
    }

    @Override // Ya.c
    public final void x() throws Exception {
        if (C()) {
            C16742a c16742a = new C16742a();
            b bVar = this.f133267n;
            d dVar = this.f133269p;
            String strA = bVar.f133263a.a(j.f13789h);
            Eb.a aVarB = dVar.b();
            if (aVarB == null) {
                c16742a.a(null);
            } else {
                l lVar = new l(bVar.f133264b);
                Ob.a aVar = new Ob.a();
                aVar.a(aVarB.a());
                if (aVarB.b()) {
                    aVar.b(Ob.a.f23430c);
                } else {
                    aVar.b(Ob.a.f23431d);
                }
                lVar.i(strA, aVar, Object.class, bVar.new a(c16742a));
            }
            c16742a.b();
        }
    }
}
