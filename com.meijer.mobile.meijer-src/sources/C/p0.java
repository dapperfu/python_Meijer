package C;

import F.InterfaceC3289y;
import F.InterfaceC3290z;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: d, reason: collision with root package name */
    private androidx.camera.core.impl.D<?> f3910d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.camera.core.impl.D<?> f3911e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.camera.core.impl.D<?> f3912f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.x f3913g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.camera.core.impl.D<?> f3914h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f3915i;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3290z f3917k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC3290z f3918l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC3025j f3919m;

    /* renamed from: n, reason: collision with root package name */
    private String f3920n;

    /* renamed from: a, reason: collision with root package name */
    private final Set<b> f3907a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Object f3908b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private a f3909c = a.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f3916j = new Matrix();

    /* renamed from: o, reason: collision with root package name */
    private androidx.camera.core.impl.w f3921o = androidx.camera.core.impl.w.b();

    /* renamed from: p, reason: collision with root package name */
    private androidx.camera.core.impl.w f3922p = androidx.camera.core.impl.w.b();

    enum a {
        ACTIVE,
        INACTIVE
    }

    public interface b {
        void b(p0 p0Var);

        void e(p0 p0Var);

        void j(p0 p0Var);

        void l(p0 p0Var);
    }

    public void I() {
    }

    public void J() {
    }

    public void L() {
    }

    public void M() {
    }

    protected androidx.camera.core.impl.x O(androidx.camera.core.impl.x xVar, androidx.camera.core.impl.x xVar2) {
        return xVar;
    }

    public void P() {
    }

    public abstract androidx.camera.core.impl.D<?> k(boolean z10, androidx.camera.core.impl.E e10);

    protected int q(InterfaceC3290z interfaceC3290z) {
        return r(interfaceC3290z, false);
    }

    public abstract D.a<?, ?, ?> z(androidx.camera.core.impl.k kVar);

    private void Q(b bVar) {
        this.f3907a.remove(bVar);
    }

    private void a(b bVar) {
        this.f3907a.add(bVar);
    }

    public Rect A() {
        return this.f3915i;
    }

    public androidx.camera.core.impl.D<?> D(InterfaceC3289y interfaceC3289y, androidx.camera.core.impl.D<?> d10, androidx.camera.core.impl.D<?> d11) {
        androidx.camera.core.impl.s sVarB0;
        if (d11 != null) {
            sVarB0 = androidx.camera.core.impl.s.c0(d11);
            sVarB0.d0(J.k.f15320b);
        } else {
            sVarB0 = androidx.camera.core.impl.s.b0();
        }
        if (this.f3911e.c(androidx.camera.core.impl.q.f47675n) || this.f3911e.c(androidx.camera.core.impl.q.f47679r)) {
            k.a<R.c> aVar = androidx.camera.core.impl.q.f47683v;
            if (sVarB0.c(aVar)) {
                sVarB0.d0(aVar);
            }
        }
        androidx.camera.core.impl.D<?> d12 = this.f3911e;
        k.a<R.c> aVar2 = androidx.camera.core.impl.q.f47683v;
        if (d12.c(aVar2)) {
            k.a<Size> aVar3 = androidx.camera.core.impl.q.f47681t;
            if (sVarB0.c(aVar3) && ((R.c) this.f3911e.a(aVar2)).d() != null) {
                sVarB0.d0(aVar3);
            }
        }
        Iterator<k.a<?>> it = this.f3911e.f().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.k.G(sVarB0, sVarB0, this.f3911e, it.next());
        }
        if (d10 != null) {
            for (k.a<?> aVar4 : d10.f()) {
                if (!aVar4.c().equals(J.k.f15320b.c())) {
                    androidx.camera.core.impl.k.G(sVarB0, sVarB0, d10, aVar4);
                }
            }
        }
        if (sVarB0.c(androidx.camera.core.impl.q.f47679r)) {
            k.a<Integer> aVar5 = androidx.camera.core.impl.q.f47675n;
            if (sVarB0.c(aVar5)) {
                sVarB0.d0(aVar5);
            }
        }
        k.a<R.c> aVar6 = androidx.camera.core.impl.q.f47683v;
        if (sVarB0.c(aVar6) && ((R.c) sVarB0.a(aVar6)).a() != 0) {
            sVarB0.r(androidx.camera.core.impl.D.f47546D, Boolean.TRUE);
        }
        return K(interfaceC3289y, z(sVarB0));
    }

    protected final void E() {
        this.f3909c = a.ACTIVE;
        H();
    }

    protected final void F() {
        this.f3909c = a.INACTIVE;
        H();
    }

    protected final void G() {
        Iterator<b> it = this.f3907a.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void H() {
        int iOrdinal = this.f3909c.ordinal();
        if (iOrdinal == 0) {
            Iterator<b> it = this.f3907a.iterator();
            while (it.hasNext()) {
                it.next().j(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator<b> it2 = this.f3907a.iterator();
            while (it2.hasNext()) {
                it2.next().e(this);
            }
        }
    }

    protected androidx.camera.core.impl.x N(androidx.camera.core.impl.k kVar) {
        androidx.camera.core.impl.x xVar = this.f3913g;
        if (xVar != null) {
            return xVar.g().d(kVar).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public void R(AbstractC3025j abstractC3025j) {
        o2.i.a(abstractC3025j == null || B(abstractC3025j.g()));
        this.f3919m = abstractC3025j;
    }

    public void S(Matrix matrix) {
        this.f3916j = new Matrix(matrix);
    }

    public void T(Rect rect) {
        this.f3915i = rect;
    }

    @SuppressLint({"WrongConstant"})
    public final void b(InterfaceC3290z interfaceC3290z, InterfaceC3290z interfaceC3290z2, androidx.camera.core.impl.D<?> d10, androidx.camera.core.impl.D<?> d11) {
        synchronized (this.f3908b) {
            try {
                this.f3917k = interfaceC3290z;
                this.f3918l = interfaceC3290z2;
                a(interfaceC3290z);
                if (interfaceC3290z2 != null) {
                    a(interfaceC3290z2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3910d = d10;
        this.f3914h = d11;
        this.f3912f = D(interfaceC3290z.i(), this.f3910d, this.f3914h);
        I();
    }

    protected androidx.camera.core.impl.D<?> c() {
        return this.f3911e;
    }

    protected int d() {
        return ((androidx.camera.core.impl.q) this.f3912f).t(-1);
    }

    public androidx.camera.core.impl.x e() {
        return this.f3913g;
    }

    public Size f() {
        androidx.camera.core.impl.x xVar = this.f3913g;
        if (xVar != null) {
            return xVar.e();
        }
        return null;
    }

    public InterfaceC3290z g() {
        InterfaceC3290z interfaceC3290z;
        synchronized (this.f3908b) {
            interfaceC3290z = this.f3917k;
        }
        return interfaceC3290z;
    }

    protected CameraControlInternal h() {
        synchronized (this.f3908b) {
            try {
                InterfaceC3290z interfaceC3290z = this.f3917k;
                if (interfaceC3290z == null) {
                    return CameraControlInternal.f47538a;
                }
                return interfaceC3290z.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public androidx.camera.core.impl.D<?> j() {
        return this.f3912f;
    }

    public AbstractC3025j l() {
        return this.f3919m;
    }

    public int m() {
        return this.f3912f.n();
    }

    protected int n() {
        return ((androidx.camera.core.impl.q) this.f3912f).X(-1);
    }

    public String o() {
        String strU = this.f3912f.u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strU);
        return strU;
    }

    public String p() {
        return this.f3920n;
    }

    public InterfaceC3290z s() {
        InterfaceC3290z interfaceC3290z;
        synchronized (this.f3908b) {
            interfaceC3290z = this.f3918l;
        }
        return interfaceC3290z;
    }

    public androidx.camera.core.impl.w u() {
        return this.f3922p;
    }

    public Matrix v() {
        return this.f3916j;
    }

    public androidx.camera.core.impl.w w() {
        return this.f3921o;
    }

    protected Set<Integer> x() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    protected int y() {
        return ((androidx.camera.core.impl.q) this.f3912f).F(0);
    }

    protected p0(androidx.camera.core.impl.D<?> d10) {
        this.f3911e = d10;
        this.f3912f = d10;
    }

    public boolean B(int i10) {
        Iterator<Integer> it = x().iterator();
        while (it.hasNext()) {
            if (O.a0.e(i10, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean C(InterfaceC3290z interfaceC3290z) {
        int iN = n();
        if (iN != -1 && iN != 0) {
            if (iN == 1) {
                return true;
            }
            if (iN == 2) {
                return interfaceC3290z.k();
            }
            throw new AssertionError("Unknown mirrorMode: " + iN);
        }
        return false;
    }

    protected androidx.camera.core.impl.D<?> K(InterfaceC3289y interfaceC3289y, D.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    public final void U(InterfaceC3290z interfaceC3290z) {
        P();
        synchronized (this.f3908b) {
            try {
                InterfaceC3290z interfaceC3290z2 = this.f3917k;
                if (interfaceC3290z == interfaceC3290z2) {
                    Q(interfaceC3290z2);
                    this.f3917k = null;
                }
                InterfaceC3290z interfaceC3290z3 = this.f3918l;
                if (interfaceC3290z == interfaceC3290z3) {
                    Q(interfaceC3290z3);
                    this.f3918l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3913g = null;
        this.f3915i = null;
        this.f3912f = this.f3911e;
        this.f3910d = null;
        this.f3914h = null;
    }

    protected void V(List<androidx.camera.core.impl.w> list) {
        if (!list.isEmpty()) {
            this.f3921o = list.get(0);
            if (list.size() > 1) {
                this.f3922p = list.get(1);
            }
            Iterator<androidx.camera.core.impl.w> it = list.iterator();
            while (it.hasNext()) {
                for (DeferrableSurface deferrableSurface : it.next().o()) {
                    if (deferrableSurface.g() == null) {
                        deferrableSurface.p(getClass());
                    }
                }
            }
        }
    }

    public void W(androidx.camera.core.impl.x xVar, androidx.camera.core.impl.x xVar2) {
        this.f3913g = O(xVar, xVar2);
    }

    public void X(androidx.camera.core.impl.k kVar) {
        this.f3913g = N(kVar);
    }

    protected String i() {
        return ((InterfaceC3290z) o2.i.h(g(), "No camera attached to use case: " + this)).i().b();
    }

    protected int r(InterfaceC3290z interfaceC3290z, boolean z10) {
        int iH = interfaceC3290z.i().h(y());
        if (!interfaceC3290z.o() && z10) {
            return G.p.u(-iH);
        }
        return iH;
    }

    protected String t() {
        if (s() == null) {
            return null;
        }
        return s().i().b();
    }
}
