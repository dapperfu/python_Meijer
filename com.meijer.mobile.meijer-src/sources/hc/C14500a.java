package hc;

import eb.C13784a;
import eb.C13785b;
import ic.e;
import ub.C17366b;
import ub.C17367c;
import xb.C18150d;

/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14500a extends AbstractC14503d<ic.d, e> {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f135286d = C13785b.a(C14500a.class.getName());

    @Override // hc.AbstractC14503d
    public final /* synthetic */ void b(ic.d dVar, Tb.a<e> aVar, C17367c c17367c, C18150d c18150d) {
        ic.d dVar2 = dVar;
        dVar2.b().j().equals(Xb.e.f41791f);
        Jb.a aVar2 = this.f135291a;
        C17366b c17366bF = c17367c.f(aVar2.b(String.format("%s%s%s%s", "beacon?payload=", dVar2.a(), "&receiverUUID=", aVar2.f15684c)), null);
        try {
            if (c17366bF.f163861c) {
                e eVar = (e) c18150d.d(e.class, c17366bF.f163862d);
                eVar.i(dVar2.b());
                aVar.a(eVar);
                if (f135286d.b()) {
                    C18150d.e(eVar, 4);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            aVar.a(100, e10.getLocalizedMessage());
        }
    }

    public C14500a(Jb.a aVar) {
        super(aVar);
    }
}
