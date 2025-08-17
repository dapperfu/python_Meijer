package E;

import C.AbstractC2967j;
import C.C2978v;
import E.C3417t;
import E.Y;
import O.C4438y;
import android.util.Size;
import androidx.camera.core.e;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.w;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: E.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3421x {

    /* renamed from: f, reason: collision with root package name */
    private static int f7545f;

    /* renamed from: g, reason: collision with root package name */
    static final M.b f7546g = new M.b();

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.o f7547a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.i f7548b;

    /* renamed from: c, reason: collision with root package name */
    private final C3417t f7549c;

    /* renamed from: d, reason: collision with root package name */
    private final N f7550d;

    /* renamed from: e, reason: collision with root package name */
    private final C3417t.c f7551e;

    private C3409k b(int i10, F.G g10, e0 e0Var, U u10) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(g10.hashCode());
        List<androidx.camera.core.impl.j> listA = g10.a();
        Objects.requireNonNull(listA);
        for (androidx.camera.core.impl.j jVar : listA) {
            i.a aVar = new i.a();
            aVar.u(this.f7548b.k());
            aVar.e(this.f7548b.g());
            aVar.a(e0Var.p());
            aVar.f(this.f7551e.k());
            aVar.s(l());
            if (ImageUtil.h(this.f7551e.d())) {
                if (f7546g.a()) {
                    aVar.d(androidx.camera.core.impl.i.f47400i, Integer.valueOf(e0Var.n()));
                }
                aVar.d(androidx.camera.core.impl.i.f47401j, Integer.valueOf(g(e0Var)));
            }
            aVar.e(jVar.a().g());
            aVar.g(strValueOf, Integer.valueOf(jVar.getId()));
            aVar.q(i10);
            aVar.c(this.f7551e.a());
            arrayList.add(aVar.h());
        }
        return new C3409k(arrayList, u10);
    }

    private F.G c() {
        F.G gY = this.f7547a.Y(C2978v.b());
        Objects.requireNonNull(gY);
        return gY;
    }

    private O d(int i10, F.G g10, e0 e0Var, U u10, com.google.common.util.concurrent.q<Void> qVar) {
        return new O(g10, e0Var.m(), e0Var.i(), e0Var.n(), e0Var.k(), e0Var.o(), u10, qVar, i10);
    }

    private int i() {
        Integer num = (Integer) this.f7547a.h(androidx.camera.core.impl.o.f47438M, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f7547a.h(androidx.camera.core.impl.p.f47449l, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    private boolean l() {
        return this.f7551e.h() != null;
    }

    public w.b f(Size size) {
        w.b bVarP = w.b.p(this.f7547a, size);
        bVarP.h(this.f7551e.k());
        if (this.f7551e.h() != null) {
            bVarP.u(this.f7551e.h());
        }
        return bVarP;
    }

    public C3421x(androidx.camera.core.impl.o oVar, Size size, AbstractC2967j abstractC2967j, boolean z10, Size size2, int i10) {
        C4438y c4438y;
        G.o.a();
        this.f7547a = oVar;
        this.f7548b = i.a.j(oVar).h();
        C3417t c3417t = new C3417t();
        this.f7549c = c3417t;
        Executor executorD0 = oVar.d0(H.a.c());
        Objects.requireNonNull(executorD0);
        Executor executor = executorD0;
        if (abstractC2967j != null) {
            c4438y = new C4438y(abstractC2967j);
        } else {
            c4438y = null;
        }
        N n10 = new N(executor, c4438y);
        this.f7550d = n10;
        C3417t.c cVarM = C3417t.c.m(size, oVar.n(), i(), z10, oVar.c0(), size2, i10);
        this.f7551e = cVarM;
        n10.p(c3417t.q(cVarM));
    }

    public void a() {
        G.o.a();
        this.f7549c.m();
        this.f7550d.n();
    }

    o2.d<C3409k, O> e(e0 e0Var, U u10, com.google.common.util.concurrent.q<Void> qVar) {
        G.o.a();
        F.G gC = c();
        int i10 = f7545f;
        f7545f = i10 + 1;
        return new o2.d<>(b(i10, gC, e0Var, u10), d(i10, gC, e0Var, u10, qVar));
    }

    int g(e0 e0Var) {
        boolean z10;
        if (e0Var.l() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zH = G.p.h(e0Var.i(), this.f7551e.j());
        if (z10 && zH) {
            if (e0Var.h() == 0) {
                return 100;
            }
            return 95;
        }
        return e0Var.k();
    }

    public int h() {
        G.o.a();
        return this.f7549c.h();
    }

    void j(Y.b bVar) {
        G.o.a();
        this.f7551e.b().accept(bVar);
    }

    public void k(e.a aVar) {
        G.o.a();
        this.f7549c.p(aVar);
    }

    void m(O o10) {
        G.o.a();
        this.f7551e.i().accept(o10);
    }
}
