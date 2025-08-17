package rc;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import pc.C16279c;
import pc.InterfaceC16286j;
import pc.InterfaceC16287k;
import rc.i;

/* loaded from: classes4.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f157994e;

    /* renamed from: a, reason: collision with root package name */
    private final Bc.a f157995a;

    /* renamed from: b, reason: collision with root package name */
    private final Bc.a f157996b;

    /* renamed from: c, reason: collision with root package name */
    private final xc.e f157997c;

    /* renamed from: d, reason: collision with root package name */
    private final yc.r f157998d;

    public static u c() {
        v vVar = f157994e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<C16279c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C16279c.b("proto"));
    }

    public static void f(Context context) {
        if (f157994e == null) {
            synchronized (u.class) {
                try {
                    if (f157994e == null) {
                        f157994e = e.a().setApplicationContext(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // rc.t
    public void a(o oVar, InterfaceC16287k interfaceC16287k) {
        this.f157997c.a(oVar.f().f(oVar.c().d()), b(oVar), interfaceC16287k);
    }

    public yc.r e() {
        return this.f157998d;
    }

    @Deprecated
    public InterfaceC16286j g(String str) {
        return new q(d(null), p.a().b(str).a(), this);
    }

    public InterfaceC16286j h(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }

    u(Bc.a aVar, Bc.a aVar2, xc.e eVar, yc.r rVar, yc.v vVar) {
        this.f157995a = aVar;
        this.f157996b = aVar2;
        this.f157997c = eVar;
        this.f157998d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f157995a.a()).o(this.f157996b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            aVarG.l(oVar.c().e().a());
        }
        oVar.c().b();
        return aVarG.d();
    }
}
