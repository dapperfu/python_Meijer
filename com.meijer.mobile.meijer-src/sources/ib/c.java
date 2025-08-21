package ib;

import Db.k;
import Kb.j;
import Kb.l;
import ab.AbstractC5677b;
import bb.C6346c;
import ib.b.a;
import tb.C17216a;

/* loaded from: classes4.dex */
public final class c extends AbstractC5677b implements k {

    /* renamed from: n, reason: collision with root package name */
    private b f137483n;

    /* renamed from: o, reason: collision with root package name */
    private Db.b f137484o;

    /* renamed from: p, reason: collision with root package name */
    private d f137485p;

    public c(C6346c c6346c, bb.e eVar, b bVar, d dVar, Db.b bVar2, Db.e eVar2) {
        super(c6346c, eVar, "AdIdSendJob", 4611686018427387903L);
        this.f137483n = bVar;
        this.f137484o = bVar2;
        this.f137485p = dVar;
        bVar2.g(this, "allowCollectIDFA");
        this.f137484o.g(this, "overrideCollectIDFA");
        eVar2.h(this, "Advertising_Info_On_Server");
    }

    private boolean C() {
        Gb.f fVarA = this.f137484o.A();
        if (fVarA != Gb.f.ON) {
            return fVarA == Gb.f.NOT_SET && this.f137484o.v();
        }
        return true;
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (("Advertising_Info_On_Server".equals(str) || "allowCollectIDFA".equals(str)) && C()) {
            u();
        }
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        if (C()) {
            C17216a c17216a = new C17216a();
            b bVar = this.f137483n;
            d dVar = this.f137485p;
            String strA = bVar.f137479a.a(j.f16535h);
            Gb.a aVarB = dVar.b();
            if (aVarB == null) {
                c17216a.a(null);
            } else {
                l lVar = new l(bVar.f137480b);
                Qb.a aVar = new Qb.a();
                aVar.a(aVarB.a());
                if (aVarB.b()) {
                    aVar.b(Qb.a.f27918c);
                } else {
                    aVar.b(Qb.a.f27919d);
                }
                lVar.i(strA, aVar, Object.class, bVar.new a(c17216a));
            }
            c17216a.b();
        }
    }
}
