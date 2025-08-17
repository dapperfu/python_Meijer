package S;

import C.C2979w;
import C.H;
import C.Y;
import C.p0;
import F.AbstractC3611h;
import F.InterfaceC3628z;
import F.r;
import O.N;
import S.f;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
class j implements p0.b {

    /* renamed from: a, reason: collision with root package name */
    final Set<p0> f33087a;

    /* renamed from: e, reason: collision with root package name */
    private final E f33091e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3628z f33092f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3628z f33093g;

    /* renamed from: i, reason: collision with root package name */
    private final Set<D<?>> f33095i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<p0, D<?>> f33096j;

    /* renamed from: k, reason: collision with root package name */
    private final b f33097k;

    /* renamed from: l, reason: collision with root package name */
    private b f33098l;

    /* renamed from: b, reason: collision with root package name */
    final Map<p0, N> f33088b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<p0, i> f33089c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map<p0, Boolean> f33090d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3611h f33094h = s();

    class a extends AbstractC3611h {
        a() {
        }

        @Override // F.AbstractC3611h
        public void b(int i10, r rVar) {
            super.b(i10, rVar);
            Iterator<p0> it = j.this.f33087a.iterator();
            while (it.hasNext()) {
                j.J(rVar, it.next().w(), i10);
            }
        }
    }

    private N D(p0 p0Var) {
        N n10 = this.f33088b.get(p0Var);
        Objects.requireNonNull(n10);
        return n10;
    }

    private boolean E(p0 p0Var) {
        Boolean bool = this.f33090d.get(p0Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    private static Map<p0, D<?>> L(InterfaceC3628z interfaceC3628z, Set<p0> set, E e10) {
        HashMap map = new HashMap();
        for (p0 p0Var : set) {
            map.put(p0Var, p0Var.D(interfaceC3628z.i(), null, p0Var.k(true, e10)));
        }
        return map;
    }

    private static int u(p0 p0Var) {
        return p0Var instanceof H ? 256 : 34;
    }

    static DeferrableSurface w(p0 p0Var) {
        List<DeferrableSurface> listO = p0Var instanceof H ? p0Var.w().o() : p0Var.w().k().i();
        o2.i.i(listO.size() <= 1);
        if (listO.size() == 1) {
            return listO.get(0);
        }
        return null;
    }

    private static int x(p0 p0Var) {
        if (p0Var instanceof Y) {
            return 1;
        }
        return p0Var instanceof H ? 4 : 2;
    }

    Map<p0, P.d> A(N n10, N n11, int i10, boolean z10) {
        HashMap map = new HashMap();
        for (p0 p0Var : this.f33087a) {
            N n12 = n10;
            int i11 = i10;
            boolean z11 = z10;
            Q.f fVarR = r(p0Var, this.f33097k, this.f33092f, n12, i11, z11);
            b bVar = this.f33098l;
            InterfaceC3628z interfaceC3628z = this.f33093g;
            Objects.requireNonNull(interfaceC3628z);
            N n13 = n11;
            map.put(p0Var, P.d.c(fVarR, r(p0Var, bVar, interfaceC3628z, n13, i11, z11)));
            n10 = n12;
            n11 = n13;
            i10 = i11;
            z10 = z11;
        }
        return map;
    }

    AbstractC3611h C() {
        return this.f33094h;
    }

    void F(androidx.camera.core.impl.r rVar) {
        rVar.r(q.f47460w, this.f33097k.o(rVar));
        rVar.r(D.f47320B, Integer.valueOf(B(this.f33095i)));
        C2979w c2979wD = S.a.d(this.f33095i);
        if (c2979wD == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        rVar.r(androidx.camera.core.impl.p.f47450m, c2979wD);
        for (p0 p0Var : this.f33087a) {
            if (p0Var.j().x() != 0) {
                rVar.r(D.f47326H, Integer.valueOf(p0Var.j().x()));
            }
            if (p0Var.j().E() != 0) {
                rVar.r(D.f47325G, Integer.valueOf(p0Var.j().E()));
            }
        }
    }

    void G() {
        for (p0 p0Var : this.f33087a) {
            p0Var.L();
            p0Var.J();
        }
    }

    void H() {
        Iterator<p0> it = this.f33087a.iterator();
        while (it.hasNext()) {
            it.next().M();
        }
    }

    void K(Map<p0, N> map) {
        this.f33088b.clear();
        this.f33088b.putAll(map);
        for (Map.Entry<p0, N> entry : this.f33088b.entrySet()) {
            p0 key = entry.getKey();
            N value = entry.getValue();
            key.T(value.n());
            key.S(value.r());
            key.W(value.s(), null);
            key.H();
        }
    }

    void M() {
        for (p0 p0Var : this.f33087a) {
            i iVar = this.f33089c.get(p0Var);
            Objects.requireNonNull(iVar);
            p0Var.U(iVar);
        }
    }

    void q() {
        for (p0 p0Var : this.f33087a) {
            i iVar = this.f33089c.get(p0Var);
            Objects.requireNonNull(iVar);
            p0Var.b(iVar, null, null, p0Var.k(true, this.f33091e));
        }
    }

    AbstractC3611h s() {
        return new a();
    }

    Set<p0> y() {
        return this.f33087a;
    }

    Map<p0, Q.f> z(N n10, int i10, boolean z10) {
        HashMap map = new HashMap();
        for (p0 p0Var : this.f33087a) {
            N n11 = n10;
            map.put(p0Var, r(p0Var, this.f33097k, this.f33092f, n11, i10, z10));
            n10 = n11;
        }
        return map;
    }

    j(InterfaceC3628z interfaceC3628z, InterfaceC3628z interfaceC3628z2, Set<p0> set, E e10, f.a aVar) {
        this.f33092f = interfaceC3628z;
        this.f33093g = interfaceC3628z2;
        this.f33091e = e10;
        this.f33087a = set;
        Map<p0, D<?>> mapL = L(interfaceC3628z, set, e10);
        this.f33096j = mapL;
        HashSet hashSet = new HashSet(mapL.values());
        this.f33095i = hashSet;
        this.f33097k = new b(interfaceC3628z, hashSet);
        if (interfaceC3628z2 != null) {
            this.f33098l = new b(interfaceC3628z2, hashSet);
        }
        for (p0 p0Var : set) {
            this.f33090d.put(p0Var, Boolean.FALSE);
            this.f33089c.put(p0Var, new i(interfaceC3628z, this, aVar));
        }
    }

    private static int B(Set<D<?>> set) {
        Iterator<D<?>> it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().B(0));
        }
        return iMax;
    }

    static void J(r rVar, w wVar, int i10) {
        Iterator<AbstractC3611h> it = wVar.j().iterator();
        while (it.hasNext()) {
            it.next().b(i10, new k(wVar.k().j(), rVar));
        }
    }

    private Q.f r(p0 p0Var, b bVar, InterfaceC3628z interfaceC3628z, N n10, int i10, boolean z10) {
        int iH = interfaceC3628z.a().h(i10);
        boolean zL = G.p.l(n10.r());
        D<?> d10 = this.f33096j.get(p0Var);
        Objects.requireNonNull(d10);
        Pair<Rect, Size> pairS = bVar.s(d10, n10.n(), G.p.g(n10.r()), z10);
        Rect rect = (Rect) pairS.first;
        Size size = (Size) pairS.second;
        int iV = v(p0Var, this.f33092f);
        i iVar = this.f33089c.get(p0Var);
        Objects.requireNonNull(iVar);
        iVar.q(iV);
        int iU = G.p.u((n10.q() + iV) - iH);
        return Q.f.h(x(p0Var), u(p0Var), rect, G.p.o(size, iU), iU, p0Var.C(interfaceC3628z) ^ zL);
    }

    private static void t(N n10, DeferrableSurface deferrableSurface, w wVar) {
        n10.v();
        try {
            n10.y(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            if (wVar.d() != null) {
                wVar.d().a(wVar, w.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private int v(p0 p0Var, InterfaceC3628z interfaceC3628z) {
        return interfaceC3628z.a().h(((q) p0Var.j()).F(0));
    }

    void I() {
        G.o.a();
        Iterator<p0> it = this.f33087a.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    @Override // C.p0.b
    public void b(p0 p0Var) {
        DeferrableSurface deferrableSurfaceW;
        G.o.a();
        N nD = D(p0Var);
        if (E(p0Var) && (deferrableSurfaceW = w(p0Var)) != null) {
            t(nD, deferrableSurfaceW, p0Var.w());
        }
    }

    @Override // C.p0.b
    public void e(p0 p0Var) {
        G.o.a();
        if (!E(p0Var)) {
            return;
        }
        this.f33090d.put(p0Var, Boolean.FALSE);
        D(p0Var).m();
    }

    @Override // C.p0.b
    public void j(p0 p0Var) {
        G.o.a();
        if (!E(p0Var)) {
            this.f33090d.put(p0Var, Boolean.TRUE);
            DeferrableSurface deferrableSurfaceW = w(p0Var);
            if (deferrableSurfaceW != null) {
                t(D(p0Var), deferrableSurfaceW, p0Var.w());
            }
        }
    }

    @Override // C.p0.b
    public void l(p0 p0Var) {
        G.o.a();
        if (!E(p0Var)) {
            return;
        }
        N nD = D(p0Var);
        DeferrableSurface deferrableSurfaceW = w(p0Var);
        if (deferrableSurfaceW != null) {
            t(nD, deferrableSurfaceW, p0Var.w());
        } else {
            nD.m();
        }
    }
}
