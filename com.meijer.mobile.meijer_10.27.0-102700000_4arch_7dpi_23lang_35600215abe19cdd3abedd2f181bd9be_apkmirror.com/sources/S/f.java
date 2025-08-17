package S;

import C.AbstractC2967j;
import C.C2982z;
import C.O;
import C.p0;
import F.InterfaceC3627y;
import F.InterfaceC3628z;
import O.C4433t;
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
    private N f33066A;

    /* renamed from: B, reason: collision with root package name */
    w.b f33067B;

    /* renamed from: C, reason: collision with root package name */
    w.b f33068C;

    /* renamed from: D, reason: collision with root package name */
    private w.c f33069D;

    /* renamed from: q, reason: collision with root package name */
    private final h f33070q;

    /* renamed from: r, reason: collision with root package name */
    private final j f33071r;

    /* renamed from: s, reason: collision with root package name */
    private final O f33072s;

    /* renamed from: t, reason: collision with root package name */
    private final O f33073t;

    /* renamed from: u, reason: collision with root package name */
    private W f33074u;

    /* renamed from: v, reason: collision with root package name */
    private W f33075v;

    /* renamed from: w, reason: collision with root package name */
    private r f33076w;

    /* renamed from: x, reason: collision with root package name */
    private N f33077x;

    /* renamed from: y, reason: collision with root package name */
    private N f33078y;

    /* renamed from: z, reason: collision with root package name */
    private N f33079z;

    interface a {
        q<Void> a(int i10, int i11);
    }

    public static /* synthetic */ q Z(f fVar, int i10, int i11) {
        W w10 = fVar.f33075v;
        return w10 != null ? w10.e().b(i10, i11) : I.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void a0(w.b bVar, final String str, final String str2, final D<?> d10, final x xVar, final x xVar2) {
        w.c cVar = this.f33069D;
        if (cVar != null) {
            cVar.b();
        }
        w.c cVar2 = new w.c(new w.d() { // from class: S.e
            @Override // androidx.camera.core.impl.w.d
            public final void a(w wVar, w.g gVar) {
                f.Y(this.f33060a, str, str2, d10, xVar, xVar2, wVar, gVar);
            }
        });
        this.f33069D = cVar2;
        bVar.q(cVar2);
    }

    private void b0() {
        w.c cVar = this.f33069D;
        if (cVar != null) {
            cVar.b();
            this.f33069D = null;
        }
        N n10 = this.f33077x;
        if (n10 != null) {
            n10.i();
            this.f33077x = null;
        }
        N n11 = this.f33078y;
        if (n11 != null) {
            n11.i();
            this.f33078y = null;
        }
        N n12 = this.f33079z;
        if (n12 != null) {
            n12.i();
            this.f33079z = null;
        }
        N n13 = this.f33066A;
        if (n13 != null) {
            n13.i();
            this.f33066A = null;
        }
        W w10 = this.f33075v;
        if (w10 != null) {
            w10.f();
            this.f33075v = null;
        }
        r rVar = this.f33076w;
        if (rVar != null) {
            rVar.d();
            this.f33076w = null;
        }
        W w11 = this.f33074u;
        if (w11 != null) {
            w11.f();
            this.f33074u = null;
        }
    }

    private void d0(String str, String str2, D<?> d10, x xVar, x xVar2) {
        Matrix matrixV = v();
        InterfaceC3628z interfaceC3628zG = g();
        Objects.requireNonNull(interfaceC3628zG);
        boolean zO = interfaceC3628zG.o();
        Rect rectJ0 = j0(xVar.e());
        Objects.requireNonNull(rectJ0);
        InterfaceC3628z interfaceC3628zG2 = g();
        Objects.requireNonNull(interfaceC3628zG2);
        int iQ = q(interfaceC3628zG2);
        InterfaceC3628z interfaceC3628zG3 = g();
        Objects.requireNonNull(interfaceC3628zG3);
        N n10 = new N(3, 34, xVar, matrixV, zO, rectJ0, iQ, -1, C(interfaceC3628zG3));
        this.f33077x = n10;
        InterfaceC3628z interfaceC3628zG4 = g();
        Objects.requireNonNull(interfaceC3628zG4);
        this.f33079z = p0(n10, interfaceC3628zG4);
        w.b bVarF0 = f0(this.f33077x, d10, xVar);
        this.f33067B = bVarF0;
        a0(bVarF0, str, str2, d10, xVar, xVar2);
    }

    private void e0(String str, String str2, D<?> d10, x xVar, x xVar2) {
        Matrix matrixV = v();
        InterfaceC3628z interfaceC3628zS = s();
        Objects.requireNonNull(interfaceC3628zS);
        boolean zO = interfaceC3628zS.o();
        Rect rectJ0 = j0(xVar2.e());
        Objects.requireNonNull(rectJ0);
        InterfaceC3628z interfaceC3628zS2 = s();
        Objects.requireNonNull(interfaceC3628zS2);
        int iQ = q(interfaceC3628zS2);
        InterfaceC3628z interfaceC3628zS3 = s();
        Objects.requireNonNull(interfaceC3628zS3);
        N n10 = new N(3, 34, xVar2, matrixV, zO, rectJ0, iQ, -1, C(interfaceC3628zS3));
        this.f33078y = n10;
        InterfaceC3628z interfaceC3628zS4 = s();
        Objects.requireNonNull(interfaceC3628zS4);
        this.f33066A = p0(n10, interfaceC3628zS4);
        w.b bVarF0 = f0(this.f33078y, d10, xVar2);
        this.f33068C = bVarF0;
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
        rVarA.r(androidx.camera.core.impl.p.f47449l, 34);
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : set) {
            if (p0Var.j().c(D.f47324F)) {
                arrayList.add(p0Var.j().O());
            } else {
                FS.log_e("StreamSharing", "A child does not have capture type.");
            }
        }
        rVarA.r(h.f33081J, arrayList);
        rVarA.r(androidx.camera.core.impl.q.f47454q, 2);
        return new h(t.a0(rVarA));
    }

    private r m0(InterfaceC3628z interfaceC3628z, InterfaceC3628z interfaceC3628z2, x xVar, O o10, O o11) {
        return new r(interfaceC3628z, interfaceC3628z2, o.a.a(xVar.b(), o10, o11));
    }

    public static boolean r0(p0 p0Var) {
        return p0Var instanceof f;
    }

    @Override // C.p0
    protected D<?> K(InterfaceC3627y interfaceC3627y, D.a<?, ?, ?> aVar) {
        this.f33071r.F(aVar.a());
        return aVar.b();
    }

    @Override // C.p0
    protected x N(androidx.camera.core.impl.k kVar) {
        this.f33067B.g(kVar);
        V(C2982z.a(new Object[]{this.f33067B.o()}));
        return e().g().d(kVar).a();
    }

    public Set<p0> i0() {
        return this.f33071r.y();
    }

    @Override // C.p0
    public D<?> k(boolean z10, E e10) {
        androidx.camera.core.impl.k kVarA = e10.a(this.f33070q.O(), 1);
        if (z10) {
            kVarA = androidx.camera.core.impl.k.P(kVarA, this.f33070q.b());
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

    public f(InterfaceC3628z interfaceC3628z, InterfaceC3628z interfaceC3628z2, O o10, O o11, Set<p0> set, E e10) {
        super(l0(set));
        this.f33070q = l0(set);
        this.f33072s = o10;
        this.f33073t = o11;
        this.f33071r = new j(interfaceC3628z, interfaceC3628z2, set, e10, new a() { // from class: S.d
            @Override // S.f.a
            public final q a(int i10, int i11) {
                return f.Z(this.f33059a, i10, i11);
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
        fVar.f33071r.I();
    }

    private List<w> c0(String str, String str2, D<?> d10, x xVar, x xVar2) {
        G.o.a();
        boolean z10 = false;
        if (xVar2 == null) {
            d0(str, str2, d10, xVar, null);
            InterfaceC3628z interfaceC3628zG = g();
            Objects.requireNonNull(interfaceC3628zG);
            this.f33075v = q0(interfaceC3628zG, xVar);
            if (A() != null) {
                z10 = true;
            }
            Map<p0, Q.f> mapZ = this.f33071r.z(this.f33079z, y(), z10);
            W.c cVarJ = this.f33075v.j(W.b.c(this.f33079z, new ArrayList(mapZ.values())));
            HashMap map = new HashMap();
            for (Map.Entry<p0, Q.f> entry : mapZ.entrySet()) {
                map.put(entry.getKey(), cVarJ.get(entry.getValue()));
            }
            this.f33071r.K(map);
            return C2982z.a(new Object[]{this.f33067B.o()});
        }
        d0(str, str2, d10, xVar, xVar2);
        e0(str, str2, d10, xVar, xVar2);
        this.f33076w = m0(g(), s(), xVar, this.f33072s, this.f33073t);
        if (A() != null) {
            z10 = true;
        }
        Map<p0, P.d> mapA = this.f33071r.A(this.f33079z, this.f33066A, y(), z10);
        r.c cVarG = this.f33076w.g(r.b.d(this.f33079z, this.f33066A, new ArrayList(mapA.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry<p0, P.d> entry2 : mapA.entrySet()) {
            map2.put(entry2.getKey(), cVarG.get(entry2.getValue()));
        }
        this.f33071r.K(map2);
        return C2982z.a(new Object[]{this.f33067B.o(), this.f33068C.o()});
    }

    private w.b f0(N n10, D<?> d10, x xVar) {
        w.b bVarP = w.b.p(d10, xVar.e());
        t0(bVarP);
        s0(xVar.e(), bVarP);
        bVarP.m(n10.o(), xVar.b(), null, -1);
        bVarP.j(this.f33071r.C());
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
        if (((AbstractC2967j) o2.i.g(l())).h() == 1) {
            return G.p.p(n10.s().e());
        }
        return n10.n();
    }

    private boolean n0() {
        if (((AbstractC2967j) o2.i.g(l())).h() == 1) {
            InterfaceC3628z interfaceC3628z = (InterfaceC3628z) o2.i.g(g());
            if (interfaceC3628z.k() && interfaceC3628z.o()) {
                return true;
            }
        }
        return false;
    }

    private int o0() {
        if (((AbstractC2967j) o2.i.g(l())).h() == 1) {
            return q((InterfaceC3628z) o2.i.g(g()));
        }
        return 0;
    }

    private N p0(N n10, InterfaceC3628z interfaceC3628z) {
        if (l() == null || l().h() == 2 || l().e() == 1) {
            return n10;
        }
        this.f33074u = new W(interfaceC3628z, l().a());
        int iO0 = o0();
        Rect rectK0 = k0(n10);
        Q.f fVarI = Q.f.i(n10.t(), n10.p(), rectK0, G.p.f(rectK0, iO0), iO0, n0(), true);
        N n11 = this.f33074u.j(W.b.c(n10, Collections.singletonList(fVarI))).get(fVarI);
        Objects.requireNonNull(n11);
        return n11;
    }

    private W q0(InterfaceC3628z interfaceC3628z, x xVar) {
        if (l() != null && l().e() == 1) {
            W w10 = new W(interfaceC3628z, l().a());
            this.f33074u = w10;
            return w10;
        }
        return new W(interfaceC3628z, C4433t.a.a(xVar.b()));
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
        this.f33071r.q();
    }

    @Override // C.p0
    public void L() {
        super.L();
        this.f33071r.G();
    }

    @Override // C.p0
    public void M() {
        super.M();
        this.f33071r.H();
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
        this.f33071r.M();
    }
}
