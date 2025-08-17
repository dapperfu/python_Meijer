package lf;

import If.a;
import fg.InterfaceC13891a;
import qf.p;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final If.a<InterfaceC13891a> f148867a;

    public void b(p pVar) {
        if (pVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(pVar);
            this.f148867a.a(new a.InterfaceC0219a() { // from class: lf.k
                @Override // If.a.InterfaceC0219a
                public final void a(If.b bVar) {
                    l.a(eVar, bVar);
                }
            });
        }
    }

    public l(If.a<InterfaceC13891a> aVar) {
        this.f148867a = aVar;
    }

    public static /* synthetic */ void a(e eVar, If.b bVar) {
        ((InterfaceC13891a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }
}
