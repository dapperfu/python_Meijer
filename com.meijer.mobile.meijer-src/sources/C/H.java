package C;

import E.C3183x;
import E.InterfaceC3182w;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import F.S;
import R.c;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.w;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import com.fullstory.FS;
import java.io.File;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q.InterfaceC16578a;

/* loaded from: classes.dex */
public final class H extends p0 {

    /* renamed from: C, reason: collision with root package name */
    public static final c f3738C = new c();

    /* renamed from: D, reason: collision with root package name */
    static final M.b f3739D = new M.b();

    /* renamed from: A, reason: collision with root package name */
    private w.c f3740A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC3182w f3741B;

    /* renamed from: q, reason: collision with root package name */
    private final S.a f3742q;

    /* renamed from: r, reason: collision with root package name */
    private final int f3743r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference<Integer> f3744s;

    /* renamed from: t, reason: collision with root package name */
    private final int f3745t;

    /* renamed from: u, reason: collision with root package name */
    private int f3746u;

    /* renamed from: v, reason: collision with root package name */
    private Rational f3747v;

    /* renamed from: w, reason: collision with root package name */
    private J.h f3748w;

    /* renamed from: x, reason: collision with root package name */
    w.b f3749x;

    /* renamed from: y, reason: collision with root package name */
    private C3183x f3750y;

    /* renamed from: z, reason: collision with root package name */
    private E.Y f3751z;

    class a implements InterfaceC3182w {
        a() {
        }

        @Override // E.InterfaceC3182w
        public com.google.common.util.concurrent.q<Void> a(List<androidx.camera.core.impl.i> list) {
            return H.this.t0(list);
        }

        @Override // E.InterfaceC3182w
        public void b() {
            H.this.p0();
        }

        @Override // E.InterfaceC3182w
        public void c() {
            H.this.v0();
        }
    }

    public static final class b implements D.a<H, androidx.camera.core.impl.o, b> {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.s f3753a;

        public b() {
            this(androidx.camera.core.impl.s.b0());
        }

        @Deprecated
        public b l(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(androidx.camera.core.impl.q.f47675n, Integer.valueOf(i10));
            return this;
        }

        private b(androidx.camera.core.impl.s sVar) {
            this.f3753a = sVar;
            Class cls = (Class) sVar.h(J.k.f15321c, null);
            if (cls == null || cls.equals(H.class)) {
                g(E.b.IMAGE_CAPTURE);
                m(H.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        public static b d(androidx.camera.core.impl.k kVar) {
            return new b(androidx.camera.core.impl.s.c0(kVar));
        }

        @Override // C.InterfaceC3038x
        public androidx.camera.core.impl.r a() {
            return this.f3753a;
        }

        @Override // androidx.camera.core.impl.D.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.o b() {
            return new androidx.camera.core.impl.o(androidx.camera.core.impl.t.a0(this.f3753a));
        }

        public H c() {
            Integer num = (Integer) a().h(androidx.camera.core.impl.o.f47662M, null);
            if (num != null) {
                a().r(androidx.camera.core.impl.p.f47673l, num);
            } else if (H.n0(a())) {
                a().r(androidx.camera.core.impl.p.f47673l, 4101);
                a().r(androidx.camera.core.impl.p.f47674m, C3037w.f3990c);
            } else {
                a().r(androidx.camera.core.impl.p.f47673l, 256);
            }
            androidx.camera.core.impl.o oVarB = b();
            androidx.camera.core.impl.q.w(oVarB);
            H h10 = new H(oVarB);
            Size size = (Size) a().h(androidx.camera.core.impl.q.f47679r, null);
            if (size != null) {
                h10.q0(new Rational(size.getWidth(), size.getHeight()));
            }
            o2.i.h((Executor) a().h(J.f.f15304a, H.a.c()), "The IO executor can't be null");
            androidx.camera.core.impl.r rVarA = a();
            k.a<Integer> aVar = androidx.camera.core.impl.o.f47660K;
            if (rVarA.c(aVar)) {
                Integer num2 = (Integer) a().a(aVar);
                if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    if (num2.intValue() == 3 && a().h(androidx.camera.core.impl.o.f47669T, null) == null) {
                        throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                } else {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
            }
            return h10;
        }

        public b f(int i10) {
            a().r(androidx.camera.core.impl.o.f47659J, Integer.valueOf(i10));
            return this;
        }

        public b g(E.b bVar) {
            a().r(androidx.camera.core.impl.D.f47548F, bVar);
            return this;
        }

        public b h(C3037w c3037w) {
            a().r(androidx.camera.core.impl.p.f47674m, c3037w);
            return this;
        }

        public b i(int i10) {
            a().r(androidx.camera.core.impl.o.f47663N, Integer.valueOf(i10));
            return this;
        }

        public b j(R.c cVar) {
            a().r(androidx.camera.core.impl.q.f47683v, cVar);
            return this;
        }

        public b k(int i10) {
            a().r(androidx.camera.core.impl.D.f47544B, Integer.valueOf(i10));
            return this;
        }

        public b m(Class<H> cls) {
            a().r(J.k.f15321c, cls);
            if (a().h(J.k.f15320b, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b n(String str) {
            a().r(J.k.f15320b, str);
            return this;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final R.c f3754a;

        /* renamed from: b, reason: collision with root package name */
        private static final androidx.camera.core.impl.o f3755b;

        /* renamed from: c, reason: collision with root package name */
        private static final C3037w f3756c;

        static {
            R.c cVarA = new c.a().d(R.a.f31496c).f(R.d.f31508c).a();
            f3754a = cVarA;
            C3037w c3037w = C3037w.f3991d;
            f3756c = c3037w;
            f3755b = new b().k(4).l(0).j(cVarA).i(0).h(c3037w).b();
        }

        public androidx.camera.core.impl.o a() {
            return f3755b;
        }
    }

    public static final class d {
    }

    public static abstract class e {
        public abstract void a(int i10);

        public abstract void b();

        public abstract void c(androidx.camera.core.n nVar);

        public abstract void d(ImageCaptureException imageCaptureException);

        public abstract void e(Bitmap bitmap);
    }

    public interface f {
        default void a(int i10) {
        }

        default void b(Bitmap bitmap) {
        }

        default void c() {
        }

        void d(h hVar);

        void e(ImageCaptureException imageCaptureException);
    }

    public static final class g {
        public ContentResolver a() {
            throw null;
        }

        public ContentValues b() {
            throw null;
        }

        public File c() {
            throw null;
        }

        public d d() {
            throw null;
        }

        public OutputStream e() {
            throw null;
        }

        public Uri f() {
            throw null;
        }
    }

    public interface i {
        void a(long j10, j jVar);

        void clear();
    }

    public interface j {
        void a();
    }

    public static /* synthetic */ Void Y(List list) {
        return null;
    }

    private void d0() {
        e0(false);
    }

    private static boolean m0(List<Pair<Integer, Size[]>> list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f3757a;

        public h(Uri uri) {
            this.f3757a = uri;
        }
    }

    public static /* synthetic */ void Z(F.S s10) {
        try {
            androidx.camera.core.n nVarB = s10.b();
            try {
                FS.log_d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + nVarB);
                if (nVarB != null) {
                    nVarB.close();
                }
            } finally {
            }
        } catch (IllegalStateException e10) {
            FS.log_e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    private void b0() {
        this.f3748w.f();
        E.Y y10 = this.f3751z;
        if (y10 != null) {
            y10.e();
        }
    }

    private void e0(boolean z10) {
        E.Y y10;
        FS.log_d("ImageCapture", "clearPipeline");
        G.o.a();
        w.c cVar = this.f3740A;
        if (cVar != null) {
            cVar.b();
            this.f3740A = null;
        }
        C3183x c3183x = this.f3750y;
        if (c3183x != null) {
            c3183x.a();
            this.f3750y = null;
        }
        if (z10 || (y10 = this.f3751z) == null) {
            return;
        }
        y10.e();
        this.f3751z = null;
    }

    private w.b f0(String str, androidx.camera.core.impl.o oVar, androidx.camera.core.impl.x xVar) {
        F.r0 r0VarK0;
        G.o.a();
        FS.log_d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, xVar));
        Size sizeE = xVar.e();
        InterfaceC3290z interfaceC3290zG = g();
        Objects.requireNonNull(interfaceC3290zG);
        boolean z10 = !interfaceC3290zG.o();
        if (this.f3750y != null) {
            o2.i.i(z10);
            this.f3750y.a();
        }
        int i10 = 35;
        Size size = null;
        if (((Boolean) j().h(androidx.camera.core.impl.o.f47671V, Boolean.FALSE)).booleanValue() && (r0VarK0 = k0()) != null) {
            R.c cVar = (R.c) j().h(androidx.camera.core.impl.o.f47670U, null);
            Map<Integer, List<Size>> mapG = r0VarK0.g(sizeE);
            List<Size> list = mapG.get(35);
            if (list == null || list.isEmpty()) {
                i10 = 256;
                list = mapG.get(256);
            }
            List<Size> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                if (cVar != null) {
                    Collections.sort(list2, new G.d(true));
                    InterfaceC3290z interfaceC3290zG2 = g();
                    Rect rectC = interfaceC3290zG2.c().c();
                    InterfaceC3289y interfaceC3289yI = interfaceC3290zG2.i();
                    List<Size> listP = J.i.p(cVar, list2, null, l0(), new Rational(rectC.width(), rectC.height()), interfaceC3289yI.a(), interfaceC3289yI.getLensFacing());
                    if (listP.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size = listP.get(0);
                } else {
                    size = (Size) Collections.max(list2, new G.d());
                }
            }
        }
        this.f3750y = new C3183x(oVar, sizeE, l(), z10, size, i10);
        if (this.f3751z == null) {
            this.f3751z = new E.Y(this.f3741B);
        }
        this.f3751z.j(this.f3750y);
        w.b bVarF = this.f3750y.f(xVar.e());
        if (i0() == 2 && !xVar.f()) {
            h().a(bVarF);
        }
        if (xVar.d() != null) {
            bVarF.g(xVar.d());
        }
        w.c cVar2 = this.f3740A;
        if (cVar2 != null) {
            cVar2.b();
        }
        w.c cVar3 = new w.c(new w.d() { // from class: C.F
            @Override // androidx.camera.core.impl.w.d
            public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                H.a0(this.f3737a, wVar, gVar);
            }
        });
        this.f3740A = cVar3;
        bVarF.q(cVar3);
        return bVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n0(androidx.camera.core.impl.r rVar) {
        return Objects.equals(rVar.h(androidx.camera.core.impl.o.f47663N, null), 1);
    }

    private void r0() {
        s0(this.f3748w);
    }

    private void u0() {
        synchronized (this.f3744s) {
            try {
                if (this.f3744s.get() != null) {
                    return;
                }
                h().d(j0());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.p0
    public void J() {
        P.a("ImageCapture", "onCameraControlReady");
        u0();
        r0();
    }

    @Override // C.p0
    protected androidx.camera.core.impl.D<?> K(InterfaceC3289y interfaceC3289y, D.a<?, ?, ?> aVar) {
        if (interfaceC3289y.d().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.r rVarA = aVar.a();
            k.a<Boolean> aVar2 = androidx.camera.core.impl.o.f47666Q;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(rVarA.h(aVar2, bool2))) {
                P.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                P.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.a().r(aVar2, bool2);
            }
        }
        boolean zG0 = g0(aVar.a());
        Integer num = (Integer) aVar.a().h(androidx.camera.core.impl.o.f47662M, null);
        if (num != null) {
            o2.i.b(!o0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            aVar.a().r(androidx.camera.core.impl.p.f47673l, Integer.valueOf(zG0 ? 35 : num.intValue()));
        } else if (n0(aVar.a())) {
            aVar.a().r(androidx.camera.core.impl.p.f47673l, 4101);
            aVar.a().r(androidx.camera.core.impl.p.f47674m, C3037w.f3990c);
        } else if (zG0) {
            aVar.a().r(androidx.camera.core.impl.p.f47673l, 35);
        } else {
            List list = (List) aVar.a().h(androidx.camera.core.impl.q.f47682u, null);
            if (list == null || m0(list, 256)) {
                aVar.a().r(androidx.camera.core.impl.p.f47673l, 256);
            } else if (m0(list, 35)) {
                aVar.a().r(androidx.camera.core.impl.p.f47673l, 35);
            }
        }
        return aVar.b();
    }

    @Override // C.p0
    protected androidx.camera.core.impl.x N(androidx.camera.core.impl.k kVar) {
        this.f3749x.g(kVar);
        V(C3040z.a(new Object[]{this.f3749x.o()}));
        return e().g().d(kVar).a();
    }

    boolean g0(androidx.camera.core.impl.r rVar) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        k.a<Boolean> aVar = androidx.camera.core.impl.o.f47666Q;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(rVar.h(aVar, bool2))) {
            if (o0()) {
                P.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) rVar.h(androidx.camera.core.impl.o.f47662M, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                P.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                P.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                rVar.r(aVar, bool2);
            }
        }
        return z11;
    }

    public int i0() {
        return this.f3743r;
    }

    public int j0() {
        int iA0;
        synchronized (this.f3744s) {
            iA0 = this.f3746u;
            if (iA0 == -1) {
                iA0 = ((androidx.camera.core.impl.o) j()).a0(2);
            }
        }
        return iA0;
    }

    @Override // C.p0
    public androidx.camera.core.impl.D<?> k(boolean z10, androidx.camera.core.impl.E e10) {
        c cVar = f3738C;
        androidx.camera.core.impl.k kVarA = e10.a(cVar.a().O(), i0());
        if (z10) {
            kVarA = androidx.camera.core.impl.k.P(kVarA, cVar.a());
        }
        if (kVarA == null) {
            return null;
        }
        return z(kVarA).b();
    }

    void p0() {
        synchronized (this.f3744s) {
            try {
                if (this.f3744s.get() != null) {
                    return;
                }
                this.f3744s.set(Integer.valueOf(j0()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void q0(Rational rational) {
        this.f3747v = rational;
    }

    public String toString() {
        return "ImageCapture:" + o();
    }

    void v0() {
        synchronized (this.f3744s) {
            try {
                Integer andSet = this.f3744s.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != j0()) {
                    u0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.p0
    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    H(androidx.camera.core.impl.o oVar) {
        super(oVar);
        this.f3742q = new S.a() { // from class: C.E
            @Override // F.S.a
            public final void a(F.S s10) {
                H.Z(s10);
            }
        };
        this.f3744s = new AtomicReference<>(null);
        this.f3746u = -1;
        this.f3747v = null;
        this.f3741B = new a();
        androidx.camera.core.impl.o oVar2 = (androidx.camera.core.impl.o) j();
        if (oVar2.c(androidx.camera.core.impl.o.f47659J)) {
            this.f3743r = oVar2.Z();
        } else {
            this.f3743r = 1;
        }
        this.f3745t = oVar2.b0(0);
        this.f3748w = J.h.g(oVar2.e0());
    }

    public static /* synthetic */ void a0(H h10, androidx.camera.core.impl.w wVar, w.g gVar) {
        if (h10.g() == null) {
            return;
        }
        h10.f3751z.h();
        h10.e0(true);
        w.b bVarF0 = h10.f0(h10.i(), (androidx.camera.core.impl.o) h10.j(), (androidx.camera.core.impl.x) o2.i.g(h10.e()));
        h10.f3749x = bVarF0;
        h10.V(C3040z.a(new Object[]{bVarF0.o()}));
        h10.G();
        h10.f3751z.i();
    }

    private int h0() {
        InterfaceC3290z interfaceC3290zG = g();
        if (interfaceC3290zG != null) {
            return interfaceC3290zG.a().getLensFacing();
        }
        return -1;
    }

    private F.r0 k0() {
        return g().d().R(null);
    }

    private boolean o0() {
        if (g() == null || g().d().R(null) == null) {
            return false;
        }
        return true;
    }

    private void s0(i iVar) {
        h().f(iVar);
    }

    @Override // C.p0
    public void I() {
        o2.i.h(g(), "Attached camera cannot be null");
        if (j0() == 3 && h0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // C.p0
    public void M() {
        b0();
    }

    @Override // C.p0
    protected androidx.camera.core.impl.x O(androidx.camera.core.impl.x xVar, androidx.camera.core.impl.x xVar2) {
        w.b bVarF0 = f0(i(), (androidx.camera.core.impl.o) j(), xVar);
        this.f3749x = bVarF0;
        V(C3040z.a(new Object[]{bVarF0.o()}));
        E();
        return xVar;
    }

    @Override // C.p0
    public void P() {
        b0();
        d0();
        s0(null);
    }

    public int l0() {
        return y();
    }

    com.google.common.util.concurrent.q<Void> t0(List<androidx.camera.core.impl.i> list) {
        G.o.a();
        return I.n.x(h().b(list, this.f3743r, this.f3745t), new InterfaceC16578a() { // from class: C.G
            @Override // q.InterfaceC16578a
            public final Object apply(Object obj) {
                return H.Y((List) obj);
            }
        }, H.a.a());
    }

    @Override // C.p0
    public D.a<?, ?, ?> z(androidx.camera.core.impl.k kVar) {
        return b.d(kVar);
    }
}
