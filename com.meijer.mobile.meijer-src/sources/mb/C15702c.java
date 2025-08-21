package mb;

import Kb.j;
import Kb.l;
import ab.AbstractC5677b;
import bb.C6346c;
import bb.e;
import com.medallia.digital.mobilesdk.l8;
import mb.C15700a.C2323a;
import tb.C17216a;

/* renamed from: mb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15702c extends AbstractC5677b {

    /* renamed from: n, reason: collision with root package name */
    private C15700a f150948n;

    /* renamed from: o, reason: collision with root package name */
    private Db.b f150949o;

    public C15702c(C6346c c6346c, e eVar, C15700a c15700a, Db.b bVar) {
        super(c6346c, eVar, "ClientStateSendJob", l8.b.f93366d);
        this.f150948n = c15700a;
        this.f150949o = bVar;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C15700a c15700a = this.f150948n;
        Gb.b bVarClone = c15700a.f150932a.clone();
        cc.c cVarA = c15700a.f150938g.a();
        if (cVarA != null) {
            bVarClone.g0(Double.valueOf(cVarA.f61489a.getLatitude()));
            bVarClone.k0(Double.valueOf(cVarA.f61489a.getLongitude()));
        }
        bVarClone.A0(Long.valueOf(c15700a.f150939h.a()));
        C17216a c17216a = new C17216a();
        new l(c15700a.f150941j).i(c15700a.f150940i.f(j.f16538k).replace("service/", ""), bVarClone, Object.class, c15700a.new C2323a(c17216a));
        c17216a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.g
    public final long z() {
        return Db.b.c(this.f150949o.e().t(), l8.b.f93366d);
    }
}
