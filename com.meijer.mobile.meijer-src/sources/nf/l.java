package nf;

import Kf.a;
import hg.InterfaceC14521a;
import sf.p;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Kf.a<InterfaceC14521a> f152438a;

    public void b(p pVar) {
        if (pVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(pVar);
            this.f152438a.a(new a.InterfaceC0279a() { // from class: nf.k
                @Override // Kf.a.InterfaceC0279a
                public final void a(Kf.b bVar) {
                    l.a(eVar, bVar);
                }
            });
        }
    }

    public l(Kf.a<InterfaceC14521a> aVar) {
        this.f152438a = aVar;
    }

    public static /* synthetic */ void a(e eVar, Kf.b bVar) {
        ((InterfaceC14521a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }
}
