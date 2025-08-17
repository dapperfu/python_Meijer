package kb;

import Ib.j;
import Ib.l;
import Za.e;
import com.medallia.digital.mobilesdk.l8;
import kb.C15129a.C2241a;
import rb.C16742a;

/* renamed from: kb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15131c extends Ya.b {

    /* renamed from: n, reason: collision with root package name */
    private C15129a f141802n;

    /* renamed from: o, reason: collision with root package name */
    private Bb.b f141803o;

    public C15131c(Za.c cVar, e eVar, C15129a c15129a, Bb.b bVar) {
        super(cVar, eVar, "ClientStateSendJob", l8.b.f92527d);
        this.f141802n = c15129a;
        this.f141803o = bVar;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        C15129a c15129a = this.f141802n;
        Eb.b bVarClone = c15129a.f141786a.clone();
        ac.c cVarA = c15129a.f141792g.a();
        if (cVarA != null) {
            bVarClone.g0(Double.valueOf(cVarA.f44474a.getLatitude()));
            bVarClone.k0(Double.valueOf(cVarA.f44474a.getLongitude()));
        }
        bVarClone.A0(Long.valueOf(c15129a.f141793h.a()));
        C16742a c16742a = new C16742a();
        new l(c15129a.f141795j).i(c15129a.f141794i.f(j.f13792k).replace("service/", ""), bVarClone, Object.class, c15129a.new C2241a(c16742a));
        c16742a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.g
    public final long z() {
        return Bb.b.c(this.f141803o.e().t(), l8.b.f92527d);
    }
}
