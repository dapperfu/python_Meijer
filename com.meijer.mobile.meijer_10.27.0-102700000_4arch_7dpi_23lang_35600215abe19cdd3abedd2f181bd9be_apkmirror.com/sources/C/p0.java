package C;

import F.InterfaceC3627y;
import F.InterfaceC3628z;
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
    private androidx.camera.core.impl.D<?> f3452d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.camera.core.impl.D<?> f3453e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.camera.core.impl.D<?> f3454f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.x f3455g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.camera.core.impl.D<?> f3456h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f3457i;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3628z f3459k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC3628z f3460l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC2967j f3461m;

    /* renamed from: n, reason: collision with root package name */
    private String f3462n;

    /* renamed from: a, reason: collision with root package name */
    private final Set<b> f3449a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Object f3450b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private a f3451c = a.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f3458j = new Matrix();

    /* renamed from: o, reason: collision with root package name */
    private androidx.camera.core.impl.w f3463o = androidx.camera.core.impl.w.b();

    /* renamed from: p, reason: collision with root package name */
    private androidx.camera.core.impl.w f3464p = androidx.camera.core.impl.w.b();

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

    protected int q(InterfaceC3628z interfaceC3628z) {
        return r(interfaceC3628z, false);
    }

    public abstract D.a<?, ?, ?> z(androidx.camera.core.impl.k kVar);

    private void Q(b bVar) {
        this.f3449a.remove(bVar);
    }

    private void a(b bVar) {
        this.f3449a.add(bVar);
    }

    public Rect A() {
        return this.f3457i;
    }

    public androidx.camera.core.impl.D<?> D(InterfaceC3627y interfaceC3627y, androidx.camera.core.impl.D<?> d10, androidx.camera.core.impl.D<?> d11) {
        androidx.camera.core.impl.s sVarB0;
        if (d11 != null) {
            sVarB0 = androidx.camera.core.impl.s.c0(d11);
            sVarB0.d0(J.k.f14473b);
        } else {
            sVarB0 = androidx.camera.core.impl.s.b0();
        }
        if (this.f3453e.c(androidx.camera.core.impl.q.f47451n) || this.f3453e.c(androidx.camera.core.impl.q.f47455r)) {
            k.a<R.c> aVar = androidx.camera.core.impl.q.f47459v;
            if (sVarB0.c(aVar)) {
                sVarB0.d0(aVar);
            }
        }
        androidx.camera.core.impl.D<?> d12 = this.f3453e;
        k.a<R.c> aVar2 = androidx.camera.core.impl.q.f47459v;
        if (d12.c(aVar2)) {
            k.a<Size> aVar3 = androidx.camera.core.impl.q.f47457t;
            if (sVarB0.c(aVar3) && ((R.c) this.f3453e.a(aVar2)).d() != null) {
                sVarB0.d0(aVar3);
            }
        }
        Iterator<k.a<?>> it = this.f3453e.f().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.k.G(sVarB0, sVarB0, this.f3453e, it.next());
        }
        if (d10 != null) {
            for (k.a<?> aVar4 : d10.f()) {
                if (!aVar4.c().equals(J.k.f14473b.c())) {
                    androidx.camera.core.impl.k.G(sVarB0, sVarB0, d10, aVar4);
                }
            }
        }
        if (sVarB0.c(androidx.camera.core.impl.q.f47455r)) {
            k.a<Integer> aVar5 = androidx.camera.core.impl.q.f47451n;
            if (sVarB0.c(aVar5)) {
                sVarB0.d0(aVar5);
            }
        }
        k.a<R.c> aVar6 = androidx.camera.core.impl.q.f47459v;
        if (sVarB0.c(aVar6) && ((R.c) sVarB0.a(aVar6)).a() != 0) {
            sVarB0.r(androidx.camera.core.impl.D.f47322D, Boolean.TRUE);
        }
        return K(interfaceC3627y, z(sVarB0));
    }

    protected final void E() {
        this.f3451c = a.ACTIVE;
        H();
    }

    protected final void F() {
        this.f3451c = a.INACTIVE;
        H();
    }

    protected final void G() {
        Iterator<b> it = this.f3449a.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void H() {
        int iOrdinal = this.f3451c.ordinal();
        if (iOrdinal == 0) {
            Iterator<b> it = this.f3449a.iterator();
            while (it.hasNext()) {
                it.next().j(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator<b> it2 = this.f3449a.iterator();
            while (it2.hasNext()) {
                it2.next().e(this);
            }
        }
    }

    protected androidx.camera.core.impl.x N(androidx.camera.core.impl.k kVar) {
        androidx.camera.core.impl.x xVar = this.f3455g;
        if (xVar != null) {
            return xVar.g().d(kVar).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public void R(AbstractC2967j abstractC2967j) {
        o2.i.a(abstractC2967j == null || B(abstractC2967j.g()));
        this.f3461m = abstractC2967j;
    }

    public void S(Matrix matrix) {
        this.f3458j = new Matrix(matrix);
    }

    public void T(Rect rect) {
        this.f3457i = rect;
    }

    @SuppressLint({"WrongConstant"})
    public final void b(InterfaceC3628z interfaceC3628z, InterfaceC3628z interfaceC3628z2, androidx.camera.core.impl.D<?> d10, androidx.camera.core.impl.D<?> d11) {
        synchronized (this.f3450b) {
            try {
                this.f3459k = interfaceC3628z;
                this.f3460l = interfaceC3628z2;
                a(interfaceC3628z);
                if (interfaceC3628z2 != null) {
                    a(interfaceC3628z2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3452d = d10;
        this.f3456h = d11;
        this.f3454f = D(interfaceC3628z.i(), this.f3452d, this.f3456h);
        I();
    }

    protected androidx.camera.core.impl.D<?> c() {
        return this.f3453e;
    }

    protected int d() {
        return ((androidx.camera.core.impl.q) this.f3454f).t(-1);
    }

    public androidx.camera.core.impl.x e() {
        return this.f3455g;
    }

    public Size f() {
        androidx.camera.core.impl.x xVar = this.f3455g;
        if (xVar != null) {
            return xVar.e();
        }
        return null;
    }

    public InterfaceC3628z g() {
        InterfaceC3628z interfaceC3628z;
        synchronized (this.f3450b) {
            interfaceC3628z = this.f3459k;
        }
        return interfaceC3628z;
    }

    protected CameraControlInternal h() {
        synchronized (this.f3450b) {
            try {
                InterfaceC3628z interfaceC3628z = this.f3459k;
                if (interfaceC3628z == null) {
                    return CameraControlInternal.f47314a;
                }
                return interfaceC3628z.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public androidx.camera.core.impl.D<?> j() {
        return this.f3454f;
    }

    public AbstractC2967j l() {
        return this.f3461m;
    }

    public int m() {
        return this.f3454f.n();
    }

    protected int n() {
        return ((androidx.camera.core.impl.q) this.f3454f).X(-1);
    }

    public String o() {
        String strU = this.f3454f.u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strU);
        return strU;
    }

    public String p() {
        return this.f3462n;
    }

    public InterfaceC3628z s() {
        InterfaceC3628z interfaceC3628z;
        synchronized (this.f3450b) {
            interfaceC3628z = this.f3460l;
        }
        return interfaceC3628z;
    }

    public androidx.camera.core.impl.w u() {
        return this.f3464p;
    }

    public Matrix v() {
        return this.f3458j;
    }

    public androidx.camera.core.impl.w w() {
        return this.f3463o;
    }

    protected Set<Integer> x() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    protected int y() {
        return ((androidx.camera.core.impl.q) this.f3454f).F(0);
    }

    protected p0(androidx.camera.core.impl.D<?> d10) {
        this.f3453e = d10;
        this.f3454f = d10;
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

    public boolean C(InterfaceC3628z interfaceC3628z) {
        int iN = n();
        if (iN != -1 && iN != 0) {
            if (iN == 1) {
                return true;
            }
            if (iN == 2) {
                return interfaceC3628z.k();
            }
            throw new AssertionError("Unknown mirrorMode: " + iN);
        }
        return false;
    }

    protected androidx.camera.core.impl.D<?> K(InterfaceC3627y interfaceC3627y, D.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    public final void U(InterfaceC3628z interfaceC3628z) {
        P();
        synchronized (this.f3450b) {
            try {
                InterfaceC3628z interfaceC3628z2 = this.f3459k;
                if (interfaceC3628z == interfaceC3628z2) {
                    Q(interfaceC3628z2);
                    this.f3459k = null;
                }
                InterfaceC3628z interfaceC3628z3 = this.f3460l;
                if (interfaceC3628z == interfaceC3628z3) {
                    Q(interfaceC3628z3);
                    this.f3460l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3455g = null;
        this.f3457i = null;
        this.f3454f = this.f3453e;
        this.f3452d = null;
        this.f3456h = null;
    }

    protected void V(List<androidx.camera.core.impl.w> list) {
        if (!list.isEmpty()) {
            this.f3463o = list.get(0);
            if (list.size() > 1) {
                this.f3464p = list.get(1);
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
        this.f3455g = O(xVar, xVar2);
    }

    public void X(androidx.camera.core.impl.k kVar) {
        this.f3455g = N(kVar);
    }

    protected String i() {
        return ((InterfaceC3628z) o2.i.h(g(), "No camera attached to use case: " + this)).i().b();
    }

    protected int r(InterfaceC3628z interfaceC3628z, boolean z10) {
        int iH = interfaceC3628z.i().h(y());
        if (!interfaceC3628z.o() && z10) {
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
