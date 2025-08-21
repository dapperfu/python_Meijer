package tc;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import rc.C16883c;
import rc.InterfaceC16890j;
import rc.InterfaceC16891k;
import tc.i;

/* loaded from: classes4.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f162484e;

    /* renamed from: a, reason: collision with root package name */
    private final Dc.a f162485a;

    /* renamed from: b, reason: collision with root package name */
    private final Dc.a f162486b;

    /* renamed from: c, reason: collision with root package name */
    private final zc.e f162487c;

    /* renamed from: d, reason: collision with root package name */
    private final Ac.r f162488d;

    public static u c() {
        v vVar = f162484e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<C16883c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C16883c.b("proto"));
    }

    public static void f(Context context) {
        if (f162484e == null) {
            synchronized (u.class) {
                try {
                    if (f162484e == null) {
                        f162484e = e.a().setApplicationContext(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // tc.t
    public void a(o oVar, InterfaceC16891k interfaceC16891k) {
        this.f162487c.a(oVar.f().f(oVar.c().d()), b(oVar), interfaceC16891k);
    }

    public Ac.r e() {
        return this.f162488d;
    }

    @Deprecated
    public InterfaceC16890j g(String str) {
        return new q(d(null), p.a().b(str).a(), this);
    }

    public InterfaceC16890j h(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }

    u(Dc.a aVar, Dc.a aVar2, zc.e eVar, Ac.r rVar, Ac.v vVar) {
        this.f162485a = aVar;
        this.f162486b = aVar2;
        this.f162487c = eVar;
        this.f162488d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f162485a.a()).o(this.f162486b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            aVarG.l(oVar.c().e().a());
        }
        oVar.c().b();
        return aVarG.d();
    }
}
