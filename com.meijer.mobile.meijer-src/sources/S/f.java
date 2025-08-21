package S;

import C.AbstractC3025j;
import C.C3040z;
import C.O;
import C.p0;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import O.C4346t;
import O.N;
import O.W;
import P.o;
import P.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import com.fullstory.FS;
import com.google.common.util.concurrent.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class f extends p0 {

    /* renamed from: A, reason: collision with root package name */
    private N f34245A;

    /* renamed from: B, reason: collision with root package name */
    w.b f34246B;

    /* renamed from: C, reason: collision with root package name */
    w.b f34247C;

    /* renamed from: D, reason: collision with root package name */
    private w.c f34248D;

    /* renamed from: q, reason: collision with root package name */
    private final h f34249q;

    /* renamed from: r, reason: collision with root package name */
    private final j f34250r;

    /* renamed from: s, reason: collision with root package name */
    private final O f34251s;

    /* renamed from: t, reason: collision with root package name */
    private final O f34252t;

    /* renamed from: u, reason: collision with root package name */
    private W f34253u;

    /* renamed from: v, reason: collision with root package name */
    private W f34254v;

    /* renamed from: w, reason: collision with root package name */
    private r f34255w;

    /* renamed from: x, reason: collision with root package name */
    private N f34256x;

    /* renamed from: y, reason: collision with root package name */
    private N f34257y;

    /* renamed from: z, reason: collision with root package name */
    private N f34258z;

    interface a {
        q<Void> a(int i10, int i11);
    }

    public static /* synthetic */ q Z(f fVar, int i10, int i11) {
        W w10 = fVar.f34254v;
        return w10 != null ? w10.e().b(i10, i11) : I.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void a0(w.b bVar, final String str, final String str2, final D<?> d10, final x xVar, final x xVar2) {
        w.c cVar = this.f34248D;
        if (cVar != null) {
            cVar.b();
        }
        w.c cVar2 = new w.c(new w.d() { // from class: S.e
            @Override // androidx.camera.core.impl.w.d
            public final void a(w wVar, w.g gVar) {
                f.Y(this.f34239a, str, str2, d10, xVar, xVar2, wVar, gVar);
            }
        });
        this.f34248D = cVar2;
        bVar.q(cVar2);
    }

    private void b0() {
        w.c cVar = this.f34248D;
        if (cVar != null) {
            cVar.b();
            this.f34248D = null;
        }
        N n10 = this.f34256x;
        if (n10 != null) {
            n10.i();
            this.f34256x = null;
        }
        N n11 = this.f34257y;
        if (n11 != null) {
            n11.i();
            this.f34257y = null;
        }
        N n12 = this.f34258z;
        if (n12 != null) {
            n12.i();
            this.f34258z = null;
        }
        N n13 = this.f34245A;
        if (n13 != null) {
            n13.i();
            this.f34245A = null;
        }
        W w10 = this.f34254v;
        if (w10 != null) {
            w10.f();
            this.f34254v = null;
        }
        r rVar = this.f34255w;
        if (rVar != null) {
            rVar.d();
            this.f34255w = null;
        }
        W w11 = this.f34253u;
        if (w11 != null) {
            w11.f();
            this.f34253u = null;
        }
    }

    private void d0(String str, String str2, D<?> d10, x xVar, x xVar2) {
        Matrix matrixV = v();
        InterfaceC3290z interfaceC3290zG = g();
        Objects.requireNonNull(interfaceC3290zG);
        boolean zO = interfaceC3290zG.o();
        Rect rectJ0 = j0(xVar.e());
        Objects.requireNonNull(rectJ0);
        InterfaceC3290z interfaceC3290zG2 = g();
        Objects.requireNonNull(interfaceC3290zG2);
        int iQ = q(interfaceC3290zG2);
        InterfaceC3290z interfaceC3290zG3 = g();
        Objects.requireNonNull(interfaceC3290zG3);
        N n10 = new N(3, 34, xVar, matrixV, zO, rectJ0, iQ, -1, C(interfaceC3290zG3));
        this.f34256x = n10;
        InterfaceC3290z interfaceC3290zG4 = g();
        Objects.requireNonNull(interfaceC3290zG4);
        this.f34258z = p0(n10, interfaceC3290zG4);
        w.b bVarF0 = f0(this.f34256x, d10, xVar);
        this.f34246B = bVarF0;
        a0(bVarF0, str, str2, d10, xVar, xVar2);
    }

    private void e0(String str, String str2, D<?> d10, x xVar, x xVar2) {
        Matrix matrixV = v();
        InterfaceC3290z interfaceC3290zS = s();
        Objects.requireNonNull(interfaceC3290zS);
        boolean zO = interfaceC3290zS.o();
        Rect rectJ0 = j0(xVar2.e());
        Objects.requireNonNull(rectJ0);
        InterfaceC3290z interfaceC3290zS2 = s();
        Objects.requireNonNull(interfaceC3290zS2);
        int iQ = q(interfaceC3290zS2);
        InterfaceC3290z interfaceC3290zS3 = s();
        Objects.requireNonNull(interfaceC3290zS3);
        N n10 = new N(3, 34, xVar2, matrixV, zO, rectJ0, iQ, -1, C(interfaceC3290zS3));
        this.f34257y = n10;
        InterfaceC3290z interfaceC3290zS4 = s();
        Objects.requireNonNull(interfaceC3290zS4);
        this.f34245A = p0(n10, interfaceC3290zS4);
        w.b bVarF0 = f0(this.f34257y, d10, xVar2);
        this.f34247C = bVarF0;
        a0(bVarF0, str, str2, d10, xVar, xVar2);
    }

    public static List<E.b> g0(p0 p0Var) {
        ArrayList arrayList = new ArrayList();
        if (!r0(p0Var)) {
            arrayList.add(p0Var.j().O());
            return arrayList;
        }
        Iterator<p0> it = ((f) p0Var).i0().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j().O());
        }
        return arrayList;
    }

    private static h l0(Set<p0> set) {
        androidx.camera.core.impl.r rVarA = new g().a();
        rVarA.r(androidx.camera.core.impl.p.f47673l, 34);
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : set) {
            if (p0Var.j().c(D.f47548F)) {
                arrayList.add(p0Var.j().O());
            } else {
                FS.log_e("StreamSharing", "A child does not have capture type.");
            }
        }
        rVarA.r(h.f34260J, arrayList);
        rVarA.r(androidx.camera.core.impl.q.f47678q, 2);
        return new h(t.a0(rVarA));
    }

    private r m0(InterfaceC3290z interfaceC3290z, InterfaceC3290z interfaceC3290z2, x xVar, O o10, O o11) {
        return new r(interfaceC3290z, interfaceC3290z2, o.a.a(xVar.b(), o10, o11));
    }

    public static boolean r0(p0 p0Var) {
        return p0Var instanceof f;
    }

    @Override // C.p0
    protected D<?> K(InterfaceC3289y interfaceC3289y, D.a<?, ?, ?> aVar) {
        this.f34250r.F(aVar.a());
        return aVar.b();
    }

    @Override // C.p0
    protected x N(androidx.camera.core.impl.k kVar) {
        this.f34246B.g(kVar);
        V(C3040z.a(new Object[]{this.f34246B.o()}));
        return e().g().d(kVar).a();
    }

    public Set<p0> i0() {
        return this.f34250r.y();
    }

    @Override // C.p0
    public D<?> k(boolean z10, E e10) {
        androidx.camera.core.impl.k kVarA = e10.a(this.f34249q.O(), 1);
        if (z10) {
            kVarA = androidx.camera.core.impl.k.P(kVarA, this.f34249q.b());
        }
        if (kVarA == null) {
            return null;
        }
        return z(kVarA).b();
    }

    @Override // C.p0
    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // C.p0
    public D.a<?, ?, ?> z(androidx.camera.core.impl.k kVar) {
        return new g(s.c0(kVar));
    }

    public f(InterfaceC3290z interfaceC3290z, InterfaceC3290z interfaceC3290z2, O o10, O o11, Set<p0> set, E e10) {
        super(l0(set));
        this.f34249q = l0(set);
        this.f34251s = o10;
        this.f34252t = o11;
        this.f34250r = new j(interfaceC3290z, interfaceC3290z2, set, e10, new a() { // from class: S.d
            @Override // S.f.a
            public final q a(int i10, int i11) {
                return f.Z(this.f34238a, i10, i11);
            }
        });
    }

    public static /* synthetic */ void Y(f fVar, String str, String str2, D d10, x xVar, x xVar2, w wVar, w.g gVar) {
        if (fVar.g() == null) {
            return;
        }
        fVar.b0();
        fVar.V(fVar.c0(str, str2, d10, xVar, xVar2));
        fVar.G();
        fVar.f34250r.I();
    }

    private List<w> c0(String str, String str2, D<?> d10, x xVar, x xVar2) {
        G.o.a();
        boolean z10 = false;
        if (xVar2 == null) {
            d0(str, str2, d10, xVar, null);
            InterfaceC3290z interfaceC3290zG = g();
            Objects.requireNonNull(interfaceC3290zG);
            this.f34254v = q0(interfaceC3290zG, xVar);
            if (A() != null) {
                z10 = true;
            }
            Map<p0, Q.f> mapZ = this.f34250r.z(this.f34258z, y(), z10);
            W.c cVarJ = this.f34254v.j(W.b.c(this.f34258z, new ArrayList(mapZ.values())));
            HashMap map = new HashMap();
            for (Map.Entry<p0, Q.f> entry : mapZ.entrySet()) {
                map.put(entry.getKey(), cVarJ.get(entry.getValue()));
            }
            this.f34250r.K(map);
            return C3040z.a(new Object[]{this.f34246B.o()});
        }
        d0(str, str2, d10, xVar, xVar2);
        e0(str, str2, d10, xVar, xVar2);
        this.f34255w = m0(g(), s(), xVar, this.f34251s, this.f34252t);
        if (A() != null) {
            z10 = true;
        }
        Map<p0, P.d> mapA = this.f34250r.A(this.f34258z, this.f34245A, y(), z10);
        r.c cVarG = this.f34255w.g(r.b.d(this.f34258z, this.f34245A, new ArrayList(mapA.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry<p0, P.d> entry2 : mapA.entrySet()) {
            map2.put(entry2.getKey(), cVarG.get(entry2.getValue()));
        }
        this.f34250r.K(map2);
        return C3040z.a(new Object[]{this.f34246B.o(), this.f34247C.o()});
    }

    private w.b f0(N n10, D<?> d10, x xVar) {
        w.b bVarP = w.b.p(d10, xVar.e());
        t0(bVarP);
        s0(xVar.e(), bVarP);
        bVarP.m(n10.o(), xVar.b(), null, -1);
        bVarP.j(this.f34250r.C());
        if (xVar.d() != null) {
            bVarP.g(xVar.d());
        }
        return bVarP;
    }

    private static int h0(p0 p0Var) {
        return p0Var.j().K().p();
    }

    private Rect j0(Size size) {
        if (A() != null) {
            return A();
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private Rect k0(N n10) {
        if (((AbstractC3025j) o2.i.g(l())).h() == 1) {
            return G.p.p(n10.s().e());
        }
        return n10.n();
    }

    private boolean n0() {
        if (((AbstractC3025j) o2.i.g(l())).h() == 1) {
            InterfaceC3290z interfaceC3290z = (InterfaceC3290z) o2.i.g(g());
            if (interfaceC3290z.k() && interfaceC3290z.o()) {
                return true;
            }
        }
        return false;
    }

    private int o0() {
        if (((AbstractC3025j) o2.i.g(l())).h() == 1) {
            return q((InterfaceC3290z) o2.i.g(g()));
        }
        return 0;
    }

    private N p0(N n10, InterfaceC3290z interfaceC3290z) {
        if (l() == null || l().h() == 2 || l().e() == 1) {
            return n10;
        }
        this.f34253u = new W(interfaceC3290z, l().a());
        int iO0 = o0();
        Rect rectK0 = k0(n10);
        Q.f fVarI = Q.f.i(n10.t(), n10.p(), rectK0, G.p.f(rectK0, iO0), iO0, n0(), true);
        N n11 = this.f34253u.j(W.b.c(n10, Collections.singletonList(fVarI))).get(fVarI);
        Objects.requireNonNull(n11);
        return n11;
    }

    private W q0(InterfaceC3290z interfaceC3290z, x xVar) {
        if (l() != null && l().e() == 1) {
            W w10 = new W(interfaceC3290z, l().a());
            this.f34253u = w10;
            return w10;
        }
        return new W(interfaceC3290z, C4346t.a.a(xVar.b()));
    }

    private void s0(Size size, w.b bVar) {
        Iterator<p0> it = i0().iterator();
        while (it.hasNext()) {
            w wVarO = w.b.p(it.next().j(), size).o();
            bVar.c(wVarO.j());
            bVar.a(wVarO.n());
            bVar.d(wVarO.l());
            bVar.b(wVarO.c());
            bVar.g(wVarO.f());
        }
    }

    private void t0(w.b bVar) {
        Iterator<p0> it = i0().iterator();
        int iE = -1;
        while (it.hasNext()) {
            iE = w.e(iE, h0(it.next()));
        }
        if (iE != -1) {
            bVar.w(iE);
        }
    }

    @Override // C.p0
    public void I() {
        super.I();
        this.f34250r.q();
    }

    @Override // C.p0
    public void L() {
        super.L();
        this.f34250r.G();
    }

    @Override // C.p0
    public void M() {
        super.M();
        this.f34250r.H();
    }

    @Override // C.p0
    protected x O(x xVar, x xVar2) {
        V(c0(i(), t(), j(), xVar, xVar2));
        E();
        return xVar;
    }

    @Override // C.p0
    public void P() {
        super.P();
        b0();
        this.f34250r.M();
    }
}
