package androidx.camera.core.internal;

import C.AbstractC3025j;
import C.C3037w;
import C.H;
import C.InterfaceC3024i;
import C.InterfaceC3029n;
import C.O;
import C.P;
import C.Y;
import C.o0;
import C.p0;
import C.r0;
import F.InterfaceC3287w;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import F.Q;
import F.n0;
import F.o0;
import G.p;
import J.m;
import O.a0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC5792a;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o2.InterfaceC16068a;
import o2.i;

/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements InterfaceC3024i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3290z f47722a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3290z f47723b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3287w f47724c;

    /* renamed from: d, reason: collision with root package name */
    private final E f47725d;

    /* renamed from: e, reason: collision with root package name */
    private final a f47726e;

    /* renamed from: h, reason: collision with root package name */
    private final D.a f47729h;

    /* renamed from: i, reason: collision with root package name */
    private r0 f47730i;

    /* renamed from: k, reason: collision with root package name */
    private final f f47732k;

    /* renamed from: o, reason: collision with root package name */
    private p0 f47736o;

    /* renamed from: p, reason: collision with root package name */
    private S.f f47737p;

    /* renamed from: q, reason: collision with root package name */
    private final n0 f47738q;

    /* renamed from: r, reason: collision with root package name */
    private final o0 f47739r;

    /* renamed from: s, reason: collision with root package name */
    private final o0 f47740s;

    /* renamed from: t, reason: collision with root package name */
    private final O f47741t;

    /* renamed from: u, reason: collision with root package name */
    private final O f47742u;

    /* renamed from: f, reason: collision with root package name */
    private final List<p0> f47727f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List<p0> f47728g = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List<AbstractC3025j> f47731j = Collections.EMPTY_LIST;

    /* renamed from: l, reason: collision with root package name */
    private final Object f47733l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private boolean f47734m = true;

    /* renamed from: n, reason: collision with root package name */
    private k f47735n = null;

    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(Throwable th2) {
            super(th2);
        }
    }

    public static abstract class a {
        public abstract Q b();

        public abstract String c();

        public static a a(String str, Q q10) {
            return new androidx.camera.core.internal.a(str, q10);
        }
    }

    static boolean U(Collection<p0> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (p0 p0Var : collection) {
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (p0Var.B(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    private static boolean V(p0 p0Var) {
        if (p0Var != null) {
            if (p0Var.j().c(D.f47548F)) {
                return p0Var.j().O() == E.b.VIDEO_CAPTURE;
            }
            FS.log_e("CameraUseCaseAdapter", p0Var + " UseCase does not have capture type.");
        }
        return false;
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        D<?> f47743a;

        /* renamed from: b, reason: collision with root package name */
        D<?> f47744b;

        b(D<?> d10, D<?> d11) {
            this.f47743a = d10;
            this.f47744b = d11;
        }
    }

    public static a A(o0 o0Var, o0 o0Var2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o0Var.b());
        sb2.append(o0Var2 == null ? "" : o0Var2.b());
        return a.a(sb2.toString(), o0Var.j().S());
    }

    private static D<?> B(E e10, S.f fVar) {
        D<?> dK = new Y.a().c().k(false, e10);
        if (dK == null) {
            return null;
        }
        s sVarC0 = s.c0(dK);
        sVarC0.d0(J.k.f15321c);
        return fVar.z(sVarC0).b();
    }

    private int D() {
        synchronized (this.f47733l) {
            try {
                return this.f47729h.c() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Map<p0, b> E(Collection<p0> collection, E e10, E e11) {
        HashMap map = new HashMap();
        for (p0 p0Var : collection) {
            map.put(p0Var, new b(S.f.r0(p0Var) ? B(e10, (S.f) p0Var) : p0Var.k(false, e10), p0Var.k(true, e11)));
        }
        return map;
    }

    private int G(boolean z10) {
        int iG;
        synchronized (this.f47733l) {
            try {
                Iterator<AbstractC3025j> it = this.f47731j.iterator();
                AbstractC3025j abstractC3025j = null;
                while (true) {
                    iG = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC3025j next = it.next();
                    if (a0.d(next.g()) > 1) {
                        i.j(abstractC3025j == null, "Can only have one sharing effect.");
                        abstractC3025j = next;
                    }
                }
                if (abstractC3025j != null) {
                    iG = abstractC3025j.g();
                }
                if (z10) {
                    iG |= 3;
                }
            } finally {
            }
        }
        return iG;
    }

    private Set<p0> H(Collection<p0> collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int iG = G(z10);
        for (p0 p0Var : collection) {
            i.b(!S.f.r0(p0Var), "Only support one level of sharing for now.");
            if (p0Var.B(iG)) {
                hashSet.add(p0Var);
            }
        }
        return hashSet;
    }

    private boolean J() {
        boolean z10;
        synchronized (this.f47733l) {
            z10 = this.f47732k.R(null) != null;
        }
        return z10;
    }

    private boolean O() {
        boolean z10;
        synchronized (this.f47733l) {
            z10 = true;
            if (this.f47732k.v() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    private static boolean R(p0 p0Var) {
        return p0Var instanceof H;
    }

    private static boolean T(p0 p0Var) {
        return p0Var instanceof Y;
    }

    private void X() {
        synchronized (this.f47733l) {
            try {
                if (this.f47735n != null) {
                    this.f47722a.c().g(this.f47735n);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static List<AbstractC3025j> Z(List<AbstractC3025j> list, Collection<p0> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (p0 p0Var : collection) {
            p0Var.R(null);
            for (AbstractC3025j abstractC3025j : list) {
                if (p0Var.B(abstractC3025j.g())) {
                    i.j(p0Var.l() == null, p0Var + " already has effect" + p0Var.l());
                    p0Var.R(abstractC3025j);
                    arrayList.remove(abstractC3025j);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void b(C.o0 o0Var) throws ExecutionException, InterruptedException {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(o0Var.o().getWidth(), o0Var.o().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        o0Var.s(surface, H.a.a(), new InterfaceC16068a() { // from class: J.d
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                CameraUseCaseAdapter.e(surface, surfaceTexture, (o0.g) obj);
            }
        });
    }

    private void d0(Map<p0, x> map, Collection<p0> collection) {
        Map<p0, x> map2;
        synchronized (this.f47733l) {
            try {
                if (this.f47730i == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<p0, Rect> mapA = m.a(this.f47722a.c().c(), this.f47722a.i().getLensFacing() == 0, this.f47730i.a(), this.f47722a.i().h(this.f47730i.c()), this.f47730i.d(), this.f47730i.b(), map2);
                    for (p0 p0Var : collection) {
                        p0Var.T((Rect) i.g(mapA.get(p0Var)));
                    }
                }
                for (p0 p0Var2 : collection) {
                    p0Var2.S(t(this.f47722a.c().c(), ((x) i.g(map2.get(p0Var2))).e()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void q() {
        synchronized (this.f47733l) {
            CameraControlInternal cameraControlInternalC = this.f47722a.c();
            this.f47735n = cameraControlInternalC.e();
            cameraControlInternalC.i();
        }
    }

    static Collection<p0> r(Collection<p0> collection, p0 p0Var, S.f fVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (p0Var != null) {
            arrayList.add(p0Var);
        }
        if (fVar != null) {
            arrayList.add(fVar);
            arrayList.removeAll(fVar.i0());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C.p0 s(java.util.Collection<C.p0> r3, S.f r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f47733l
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L17
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
            java.util.Set r3 = r4.i0()     // Catch: java.lang.Throwable -> L15
            r1.removeAll(r3)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L4c
        L17:
            boolean r3 = r2.O()     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L49
            boolean r3 = Q(r1)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L33
            C.p0 r3 = r2.f47736o     // Catch: java.lang.Throwable -> L15
            boolean r3 = T(r3)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L2e
            C.p0 r3 = r2.f47736o     // Catch: java.lang.Throwable -> L15
            goto L4a
        L2e:
            C.Y r3 = r2.x()     // Catch: java.lang.Throwable -> L15
            goto L4a
        L33:
            boolean r3 = P(r1)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L49
            C.p0 r3 = r2.f47736o     // Catch: java.lang.Throwable -> L15
            boolean r3 = R(r3)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L44
            C.p0 r3 = r2.f47736o     // Catch: java.lang.Throwable -> L15
            goto L4a
        L44:
            C.H r3 = r2.w()     // Catch: java.lang.Throwable -> L15
            goto L4a
        L49:
            r3 = 0
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r3
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.s(java.util.Collection, S.f):C.p0");
    }

    private Map<p0, x> u(int i10, InterfaceC3289y interfaceC3289y, Collection<p0> collection, Collection<p0> collection2, Map<p0, b> map) {
        Rect rectC;
        ArrayList arrayList = new ArrayList();
        String strB = interfaceC3289y.b();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator<p0> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p0 next = it.next();
            AbstractC5792a abstractC5792aA = AbstractC5792a.a(this.f47724c.b(i10, strB, next.m(), next.f()), next.m(), next.f(), ((x) i.g(next.e())).b(), S.f.g0(next), next.e().d(), next.j().y(null));
            arrayList.add(abstractC5792aA);
            map3.put(abstractC5792aA, next);
            map2.put(next, next.e());
        }
        if (!collection.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectC = this.f47722a.c().c();
            } catch (NullPointerException unused) {
                rectC = null;
            }
            J.i iVar = new J.i(interfaceC3289y, rectC != null ? p.m(rectC) : null);
            boolean z10 = false;
            for (p0 p0Var : collection) {
                b bVar = map.get(p0Var);
                D<?> D10 = p0Var.D(interfaceC3289y, bVar.f47743a, bVar.f47744b);
                map4.put(D10, p0Var);
                map5.put(D10, iVar.m(D10));
                if (p0Var.j() instanceof u) {
                    z10 = ((u) p0Var.j()).E() == 2;
                }
            }
            Pair<Map<D<?>, x>, Map<AbstractC5792a, x>> pairA = this.f47724c.a(i10, strB, arrayList, map5, z10, N(collection));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((p0) entry.getValue(), (x) ((Map) pairA.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairA.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((p0) map3.get(entry2.getKey()), (x) entry2.getValue());
                }
            }
        }
        return map2;
    }

    private H w() {
        return new H.b().n("ImageCapture-Extra").c();
    }

    private Y x() {
        Y yC = new Y.a().l("Preview-Extra").c();
        yC.i0(new Y.c() { // from class: J.c
            @Override // C.Y.c
            public final void a(C.o0 o0Var) throws ExecutionException, InterruptedException {
                CameraUseCaseAdapter.b(o0Var);
            }
        });
        return yC;
    }

    private S.f y(Collection<p0> collection, boolean z10) {
        synchronized (this.f47733l) {
            try {
                Set<p0> setH = H(collection, z10);
                if (setH.size() >= 2 || (J() && N(setH))) {
                    S.f fVar = this.f47737p;
                    if (fVar != null && fVar.i0().equals(setH)) {
                        S.f fVar2 = this.f47737p;
                        Objects.requireNonNull(fVar2);
                        return fVar2;
                    }
                    if (!U(setH)) {
                        return null;
                    }
                    return new S.f(this.f47722a, this.f47723b, this.f47741t, this.f47742u, setH, this.f47725d);
                }
                return null;
            } finally {
            }
        }
    }

    public a C() {
        return this.f47726e;
    }

    public InterfaceC3029n F() {
        return this.f47740s;
    }

    public List<p0> I() {
        ArrayList arrayList;
        synchronized (this.f47733l) {
            arrayList = new ArrayList(this.f47727f);
        }
        return arrayList;
    }

    public void W(Collection<p0> collection) {
        synchronized (this.f47733l) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f47727f);
            linkedHashSet.removeAll(collection);
            InterfaceC3290z interfaceC3290z = this.f47723b;
            c0(linkedHashSet, interfaceC3290z != null, interfaceC3290z != null);
        }
    }

    public void Y(List<AbstractC3025j> list) {
        synchronized (this.f47733l) {
            this.f47731j = list;
        }
    }

    @Override // C.InterfaceC3024i
    public InterfaceC3029n a() {
        return this.f47739r;
    }

    public void a0(r0 r0Var) {
        synchronized (this.f47733l) {
            this.f47730i = r0Var;
        }
    }

    void c0(Collection<p0> collection, boolean z10, boolean z11) {
        x xVar;
        k kVarD;
        synchronized (this.f47733l) {
            try {
                v(collection);
                if (!z10 && J() && N(collection)) {
                    c0(collection, true, z11);
                    return;
                }
                S.f fVarY = y(collection, z10);
                p0 p0VarS = s(collection, fVarY);
                Collection<p0> collectionR = r(collection, p0VarS, fVarY);
                ArrayList<p0> arrayList = new ArrayList(collectionR);
                arrayList.removeAll(this.f47728g);
                ArrayList<p0> arrayList2 = new ArrayList(collectionR);
                arrayList2.retainAll(this.f47728g);
                ArrayList<p0> arrayList3 = new ArrayList(this.f47728g);
                arrayList3.removeAll(collectionR);
                Map<p0, b> mapE = E(arrayList, this.f47732k.k(), this.f47725d);
                Map<p0, x> mapU = Collections.EMPTY_MAP;
                try {
                    Map<p0, x> mapU2 = u(D(), this.f47722a.i(), arrayList, arrayList2, mapE);
                    if (this.f47723b != null) {
                        int iD = D();
                        InterfaceC3290z interfaceC3290z = this.f47723b;
                        Objects.requireNonNull(interfaceC3290z);
                        mapU = u(iD, interfaceC3290z.i(), arrayList, arrayList2, mapE);
                    }
                    d0(mapU2, collectionR);
                    b0(this.f47731j, collectionR, collection);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((p0) it.next()).U(this.f47722a);
                    }
                    this.f47722a.h(arrayList3);
                    if (this.f47723b != null) {
                        for (p0 p0Var : arrayList3) {
                            InterfaceC3290z interfaceC3290z2 = this.f47723b;
                            Objects.requireNonNull(interfaceC3290z2);
                            p0Var.U(interfaceC3290z2);
                        }
                        InterfaceC3290z interfaceC3290z3 = this.f47723b;
                        Objects.requireNonNull(interfaceC3290z3);
                        interfaceC3290z3.h(arrayList3);
                    }
                    if (arrayList3.isEmpty()) {
                        for (p0 p0Var2 : arrayList2) {
                            if (mapU2.containsKey(p0Var2) && (kVarD = (xVar = mapU2.get(p0Var2)).d()) != null && K(xVar, p0Var2.w())) {
                                p0Var2.X(kVarD);
                                if (this.f47734m) {
                                    this.f47722a.l(p0Var2);
                                    InterfaceC3290z interfaceC3290z4 = this.f47723b;
                                    if (interfaceC3290z4 != null) {
                                        Objects.requireNonNull(interfaceC3290z4);
                                        interfaceC3290z4.l(p0Var2);
                                    }
                                }
                            }
                        }
                    }
                    for (p0 p0Var3 : arrayList) {
                        b bVar = mapE.get(p0Var3);
                        Objects.requireNonNull(bVar);
                        InterfaceC3290z interfaceC3290z5 = this.f47723b;
                        if (interfaceC3290z5 != null) {
                            InterfaceC3290z interfaceC3290z6 = this.f47722a;
                            Objects.requireNonNull(interfaceC3290z5);
                            p0Var3.b(interfaceC3290z6, interfaceC3290z5, bVar.f47743a, bVar.f47744b);
                            p0Var3.W((x) i.g(mapU2.get(p0Var3)), mapU.get(p0Var3));
                        } else {
                            p0Var3.b(this.f47722a, null, bVar.f47743a, bVar.f47744b);
                            p0Var3.W((x) i.g(mapU2.get(p0Var3)), null);
                        }
                    }
                    if (this.f47734m) {
                        this.f47722a.g(arrayList);
                        InterfaceC3290z interfaceC3290z7 = this.f47723b;
                        if (interfaceC3290z7 != null) {
                            Objects.requireNonNull(interfaceC3290z7);
                            interfaceC3290z7.g(arrayList);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((p0) it2.next()).H();
                    }
                    this.f47727f.clear();
                    this.f47727f.addAll(collection);
                    this.f47728g.clear();
                    this.f47728g.addAll(collectionR);
                    this.f47736o = p0VarS;
                    this.f47737p = fVarY;
                } catch (IllegalArgumentException e10) {
                    if (z10 || J() || this.f47729h.c() == 2) {
                        throw e10;
                    }
                    c0(collection, true, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(boolean z10) {
        this.f47722a.f(z10);
    }

    public void j(Collection<p0> collection) throws CameraException {
        synchronized (this.f47733l) {
            try {
                this.f47722a.m(this.f47732k);
                InterfaceC3290z interfaceC3290z = this.f47723b;
                if (interfaceC3290z != null) {
                    interfaceC3290z.m(this.f47732k);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f47727f);
                linkedHashSet.addAll(collection);
                try {
                    InterfaceC3290z interfaceC3290z2 = this.f47723b;
                    c0(linkedHashSet, interfaceC3290z2 != null, interfaceC3290z2 != null);
                } catch (IllegalArgumentException e10) {
                    throw new CameraException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l() {
        synchronized (this.f47733l) {
            try {
                if (!this.f47734m) {
                    if (!this.f47728g.isEmpty()) {
                        this.f47722a.m(this.f47732k);
                        InterfaceC3290z interfaceC3290z = this.f47723b;
                        if (interfaceC3290z != null) {
                            interfaceC3290z.m(this.f47732k);
                        }
                    }
                    this.f47722a.g(this.f47728g);
                    InterfaceC3290z interfaceC3290z2 = this.f47723b;
                    if (interfaceC3290z2 != null) {
                        interfaceC3290z2.g(this.f47728g);
                    }
                    X();
                    Iterator<p0> it = this.f47728g.iterator();
                    while (it.hasNext()) {
                        it.next().H();
                    }
                    this.f47734m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this.f47733l) {
            try {
                if (this.f47734m) {
                    this.f47722a.h(new ArrayList(this.f47728g));
                    InterfaceC3290z interfaceC3290z = this.f47723b;
                    if (interfaceC3290z != null) {
                        interfaceC3290z.h(new ArrayList(this.f47728g));
                    }
                    q();
                    this.f47734m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CameraUseCaseAdapter(InterfaceC3290z interfaceC3290z, InterfaceC3290z interfaceC3290z2, F.o0 o0Var, F.o0 o0Var2, O o10, O o11, D.a aVar, InterfaceC3287w interfaceC3287w, E e10) {
        this.f47722a = interfaceC3290z;
        this.f47723b = interfaceC3290z2;
        this.f47741t = o10;
        this.f47742u = o11;
        this.f47729h = aVar;
        this.f47724c = interfaceC3287w;
        this.f47725d = e10;
        f fVarJ = o0Var.j();
        this.f47732k = fVarJ;
        this.f47738q = new n0(interfaceC3290z.c(), fVarJ.R(null));
        this.f47739r = o0Var;
        this.f47740s = o0Var2;
        this.f47726e = A(o0Var, o0Var2);
    }

    private static boolean K(x xVar, w wVar) {
        k kVarD = xVar.d();
        k kVarF = wVar.f();
        if (kVarD.f().size() != wVar.f().f().size()) {
            return true;
        }
        for (k.a<?> aVar : kVarD.f()) {
            if (!kVarF.c(aVar) || !Objects.equals(kVarF.a(aVar), kVarD.a(aVar))) {
                return true;
            }
        }
        return false;
    }

    private static boolean L(Collection<p0> collection) {
        Iterator<p0> it = collection.iterator();
        while (it.hasNext()) {
            if (S(it.next().j().H())) {
                return true;
            }
        }
        return false;
    }

    private static boolean M(Collection<p0> collection) {
        for (p0 p0Var : collection) {
            if (R(p0Var)) {
                D<?> dJ = p0Var.j();
                k.a<?> aVar = o.f47663N;
                if (dJ.c(aVar) && ((Integer) i.g((Integer) dJ.a(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean N(Collection<p0> collection) {
        Iterator<p0> it = collection.iterator();
        while (it.hasNext()) {
            if (V(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean P(Collection<p0> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (p0 p0Var : collection) {
            if (!T(p0Var) && !S.f.r0(p0Var)) {
                if (R(p0Var)) {
                    z11 = true;
                }
            } else {
                z10 = true;
            }
        }
        if (!z10 || z11) {
            return false;
        }
        return true;
    }

    private static boolean Q(Collection<p0> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (p0 p0Var : collection) {
            if (!T(p0Var) && !S.f.r0(p0Var)) {
                if (R(p0Var)) {
                    z10 = true;
                }
            } else {
                z11 = true;
            }
        }
        if (!z10 || z11) {
            return false;
        }
        return true;
    }

    private static boolean S(C3037w c3037w) {
        boolean z10;
        boolean z11;
        if (c3037w.a() == 10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c3037w.b() != 1 && c3037w.b() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    static void b0(List<AbstractC3025j> list, Collection<p0> collection, Collection<p0> collection2) {
        List<AbstractC3025j> listZ = Z(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<AbstractC3025j> listZ2 = Z(listZ, arrayList);
        if (listZ2.size() > 0) {
            P.l("CameraUseCaseAdapter", "Unused effects: " + listZ2);
        }
    }

    public static /* synthetic */ void e(Surface surface, SurfaceTexture surfaceTexture, o0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    private static Matrix t(Rect rect, Size size) {
        boolean z10;
        if (rect.width() > 0 && rect.height() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i.b(z10, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private void v(Collection<p0> collection) throws IllegalArgumentException {
        if (J()) {
            if (!L(collection)) {
                if (M(collection)) {
                    throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
                }
            } else {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
        }
        synchronized (this.f47733l) {
            try {
                if (!this.f47731j.isEmpty() && M(collection)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }
}
