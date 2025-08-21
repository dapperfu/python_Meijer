package E;

import C.AbstractC3025j;
import C.C3036v;
import E.C3179t;
import E.Y;
import O.C4351y;
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
public class C3183x {

    /* renamed from: f, reason: collision with root package name */
    private static int f6952f;

    /* renamed from: g, reason: collision with root package name */
    static final M.b f6953g = new M.b();

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.o f6954a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.i f6955b;

    /* renamed from: c, reason: collision with root package name */
    private final C3179t f6956c;

    /* renamed from: d, reason: collision with root package name */
    private final N f6957d;

    /* renamed from: e, reason: collision with root package name */
    private final C3179t.c f6958e;

    private C3171k b(int i10, F.G g10, e0 e0Var, U u10) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(g10.hashCode());
        List<androidx.camera.core.impl.j> listA = g10.a();
        Objects.requireNonNull(listA);
        for (androidx.camera.core.impl.j jVar : listA) {
            i.a aVar = new i.a();
            aVar.u(this.f6955b.k());
            aVar.e(this.f6955b.g());
            aVar.a(e0Var.p());
            aVar.f(this.f6958e.k());
            aVar.s(l());
            if (ImageUtil.h(this.f6958e.d())) {
                if (f6953g.a()) {
                    aVar.d(androidx.camera.core.impl.i.f47624i, Integer.valueOf(e0Var.n()));
                }
                aVar.d(androidx.camera.core.impl.i.f47625j, Integer.valueOf(g(e0Var)));
            }
            aVar.e(jVar.a().g());
            aVar.g(strValueOf, Integer.valueOf(jVar.getId()));
            aVar.q(i10);
            aVar.c(this.f6958e.a());
            arrayList.add(aVar.h());
        }
        return new C3171k(arrayList, u10);
    }

    private F.G c() {
        F.G gY = this.f6954a.Y(C3036v.b());
        Objects.requireNonNull(gY);
        return gY;
    }

    private O d(int i10, F.G g10, e0 e0Var, U u10, com.google.common.util.concurrent.q<Void> qVar) {
        return new O(g10, e0Var.m(), e0Var.i(), e0Var.n(), e0Var.k(), e0Var.o(), u10, qVar, i10);
    }

    private int i() {
        Integer num = (Integer) this.f6954a.h(androidx.camera.core.impl.o.f47662M, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f6954a.h(androidx.camera.core.impl.p.f47673l, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    private boolean l() {
        return this.f6958e.h() != null;
    }

    public w.b f(Size size) {
        w.b bVarP = w.b.p(this.f6954a, size);
        bVarP.h(this.f6958e.k());
        if (this.f6958e.h() != null) {
            bVarP.u(this.f6958e.h());
        }
        return bVarP;
    }

    public C3183x(androidx.camera.core.impl.o oVar, Size size, AbstractC3025j abstractC3025j, boolean z10, Size size2, int i10) {
        C4351y c4351y;
        G.o.a();
        this.f6954a = oVar;
        this.f6955b = i.a.j(oVar).h();
        C3179t c3179t = new C3179t();
        this.f6956c = c3179t;
        Executor executorD0 = oVar.d0(H.a.c());
        Objects.requireNonNull(executorD0);
        Executor executor = executorD0;
        if (abstractC3025j != null) {
            c4351y = new C4351y(abstractC3025j);
        } else {
            c4351y = null;
        }
        N n10 = new N(executor, c4351y);
        this.f6957d = n10;
        C3179t.c cVarM = C3179t.c.m(size, oVar.n(), i(), z10, oVar.c0(), size2, i10);
        this.f6958e = cVarM;
        n10.p(c3179t.q(cVarM));
    }

    public void a() {
        G.o.a();
        this.f6956c.m();
        this.f6957d.n();
    }

    o2.d<C3171k, O> e(e0 e0Var, U u10, com.google.common.util.concurrent.q<Void> qVar) {
        G.o.a();
        F.G gC = c();
        int i10 = f6952f;
        f6952f = i10 + 1;
        return new o2.d<>(b(i10, gC, e0Var, u10), d(i10, gC, e0Var, u10, qVar));
    }

    int g(e0 e0Var) {
        boolean z10;
        if (e0Var.l() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zH = G.p.h(e0Var.i(), this.f6958e.j());
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
        return this.f6956c.h();
    }

    void j(Y.b bVar) {
        G.o.a();
        this.f6958e.b().accept(bVar);
    }

    public void k(e.a aVar) {
        G.o.a();
        this.f6956c.p(aVar);
    }

    void m(O o10) {
        G.o.a();
        this.f6958e.i().accept(o10);
    }
}
