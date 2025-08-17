package C;

import E.C3421x;
import E.InterfaceC3420w;
import F.InterfaceC3627y;
import F.InterfaceC3628z;
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
import q.InterfaceC16423a;

/* loaded from: classes.dex */
public final class H extends p0 {

    /* renamed from: C, reason: collision with root package name */
    public static final c f3280C = new c();

    /* renamed from: D, reason: collision with root package name */
    static final M.b f3281D = new M.b();

    /* renamed from: A, reason: collision with root package name */
    private w.c f3282A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC3420w f3283B;

    /* renamed from: q, reason: collision with root package name */
    private final S.a f3284q;

    /* renamed from: r, reason: collision with root package name */
    private final int f3285r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference<Integer> f3286s;

    /* renamed from: t, reason: collision with root package name */
    private final int f3287t;

    /* renamed from: u, reason: collision with root package name */
    private int f3288u;

    /* renamed from: v, reason: collision with root package name */
    private Rational f3289v;

    /* renamed from: w, reason: collision with root package name */
    private J.h f3290w;

    /* renamed from: x, reason: collision with root package name */
    w.b f3291x;

    /* renamed from: y, reason: collision with root package name */
    private C3421x f3292y;

    /* renamed from: z, reason: collision with root package name */
    private E.Y f3293z;

    class a implements InterfaceC3420w {
        a() {
        }

        @Override // E.InterfaceC3420w
        public com.google.common.util.concurrent.q<Void> a(List<androidx.camera.core.impl.i> list) {
            return H.this.t0(list);
        }

        @Override // E.InterfaceC3420w
        public void b() {
            H.this.p0();
        }

        @Override // E.InterfaceC3420w
        public void c() {
            H.this.v0();
        }
    }

    public static final class b implements D.a<H, androidx.camera.core.impl.o, b> {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.s f3295a;

        public b() {
            this(androidx.camera.core.impl.s.b0());
        }

        @Deprecated
        public b l(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(androidx.camera.core.impl.q.f47451n, Integer.valueOf(i10));
            return this;
        }

        private b(androidx.camera.core.impl.s sVar) {
            this.f3295a = sVar;
            Class cls = (Class) sVar.h(J.k.f14474c, null);
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

        @Override // C.InterfaceC2980x
        public androidx.camera.core.impl.r a() {
            return this.f3295a;
        }

        @Override // androidx.camera.core.impl.D.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.o b() {
            return new androidx.camera.core.impl.o(androidx.camera.core.impl.t.a0(this.f3295a));
        }

        public H c() {
            Integer num = (Integer) a().h(androidx.camera.core.impl.o.f47438M, null);
            if (num != null) {
                a().r(androidx.camera.core.impl.p.f47449l, num);
            } else if (H.n0(a())) {
                a().r(androidx.camera.core.impl.p.f47449l, 4101);
                a().r(androidx.camera.core.impl.p.f47450m, C2979w.f3532c);
            } else {
                a().r(androidx.camera.core.impl.p.f47449l, 256);
            }
            androidx.camera.core.impl.o oVarB = b();
            androidx.camera.core.impl.q.w(oVarB);
            H h10 = new H(oVarB);
            Size size = (Size) a().h(androidx.camera.core.impl.q.f47455r, null);
            if (size != null) {
                h10.q0(new Rational(size.getWidth(), size.getHeight()));
            }
            o2.i.h((Executor) a().h(J.f.f14457a, H.a.c()), "The IO executor can't be null");
            androidx.camera.core.impl.r rVarA = a();
            k.a<Integer> aVar = androidx.camera.core.impl.o.f47436K;
            if (rVarA.c(aVar)) {
                Integer num2 = (Integer) a().a(aVar);
                if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    if (num2.intValue() == 3 && a().h(androidx.camera.core.impl.o.f47445T, null) == null) {
                        throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                } else {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
            }
            return h10;
        }

        public b f(int i10) {
            a().r(androidx.camera.core.impl.o.f47435J, Integer.valueOf(i10));
            return this;
        }

        public b g(E.b bVar) {
            a().r(androidx.camera.core.impl.D.f47324F, bVar);
            return this;
        }

        public b h(C2979w c2979w) {
            a().r(androidx.camera.core.impl.p.f47450m, c2979w);
            return this;
        }

        public b i(int i10) {
            a().r(androidx.camera.core.impl.o.f47439N, Integer.valueOf(i10));
            return this;
        }

        public b j(R.c cVar) {
            a().r(androidx.camera.core.impl.q.f47459v, cVar);
            return this;
        }

        public b k(int i10) {
            a().r(androidx.camera.core.impl.D.f47320B, Integer.valueOf(i10));
            return this;
        }

        public b m(Class<H> cls) {
            a().r(J.k.f14474c, cls);
            if (a().h(J.k.f14473b, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b n(String str) {
            a().r(J.k.f14473b, str);
            return this;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final R.c f3296a;

        /* renamed from: b, reason: collision with root package name */
        private static final androidx.camera.core.impl.o f3297b;

        /* renamed from: c, reason: collision with root package name */
        private static final C2979w f3298c;

        static {
            R.c cVarA = new c.a().d(R.a.f31494c).f(R.d.f31506c).a();
            f3296a = cVarA;
            C2979w c2979w = C2979w.f3533d;
            f3298c = c2979w;
            f3297b = new b().k(4).l(0).j(cVarA).i(0).h(c2979w).b();
        }

        public androidx.camera.core.impl.o a() {
            return f3297b;
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
        private final Uri f3299a;

        public h(Uri uri) {
            this.f3299a = uri;
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
        this.f3290w.f();
        E.Y y10 = this.f3293z;
        if (y10 != null) {
            y10.e();
        }
    }

    private void e0(boolean z10) {
        E.Y y10;
        FS.log_d("ImageCapture", "clearPipeline");
        G.o.a();
        w.c cVar = this.f3282A;
        if (cVar != null) {
            cVar.b();
            this.f3282A = null;
        }
        C3421x c3421x = this.f3292y;
        if (c3421x != null) {
            c3421x.a();
            this.f3292y = null;
        }
        if (z10 || (y10 = this.f3293z) == null) {
            return;
        }
        y10.e();
        this.f3293z = null;
    }

    private w.b f0(String str, androidx.camera.core.impl.o oVar, androidx.camera.core.impl.x xVar) {
        F.r0 r0VarK0;
        G.o.a();
        FS.log_d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, xVar));
        Size sizeE = xVar.e();
        InterfaceC3628z interfaceC3628zG = g();
        Objects.requireNonNull(interfaceC3628zG);
        boolean z10 = !interfaceC3628zG.o();
        if (this.f3292y != null) {
            o2.i.i(z10);
            this.f3292y.a();
        }
        int i10 = 35;
        Size size = null;
        if (((Boolean) j().h(androidx.camera.core.impl.o.f47447V, Boolean.FALSE)).booleanValue() && (r0VarK0 = k0()) != null) {
            R.c cVar = (R.c) j().h(androidx.camera.core.impl.o.f47446U, null);
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
                    InterfaceC3628z interfaceC3628zG2 = g();
                    Rect rectC = interfaceC3628zG2.c().c();
                    InterfaceC3627y interfaceC3627yI = interfaceC3628zG2.i();
                    List<Size> listP = J.i.p(cVar, list2, null, l0(), new Rational(rectC.width(), rectC.height()), interfaceC3627yI.a(), interfaceC3627yI.getLensFacing());
                    if (listP.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size = listP.get(0);
                } else {
                    size = (Size) Collections.max(list2, new G.d());
                }
            }
        }
        this.f3292y = new C3421x(oVar, sizeE, l(), z10, size, i10);
        if (this.f3293z == null) {
            this.f3293z = new E.Y(this.f3283B);
        }
        this.f3293z.j(this.f3292y);
        w.b bVarF = this.f3292y.f(xVar.e());
        if (i0() == 2 && !xVar.f()) {
            h().a(bVarF);
        }
        if (xVar.d() != null) {
            bVarF.g(xVar.d());
        }
        w.c cVar2 = this.f3282A;
        if (cVar2 != null) {
            cVar2.b();
        }
        w.c cVar3 = new w.c(new w.d() { // from class: C.F
            @Override // androidx.camera.core.impl.w.d
            public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                H.a0(this.f3279a, wVar, gVar);
            }
        });
        this.f3282A = cVar3;
        bVarF.q(cVar3);
        return bVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n0(androidx.camera.core.impl.r rVar) {
        return Objects.equals(rVar.h(androidx.camera.core.impl.o.f47439N, null), 1);
    }

    private void r0() {
        s0(this.f3290w);
    }

    private void u0() {
        synchronized (this.f3286s) {
            try {
                if (this.f3286s.get() != null) {
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
    protected androidx.camera.core.impl.D<?> K(InterfaceC3627y interfaceC3627y, D.a<?, ?, ?> aVar) {
        if (interfaceC3627y.d().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.r rVarA = aVar.a();
            k.a<Boolean> aVar2 = androidx.camera.core.impl.o.f47442Q;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(rVarA.h(aVar2, bool2))) {
                P.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                P.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.a().r(aVar2, bool2);
            }
        }
        boolean zG0 = g0(aVar.a());
        Integer num = (Integer) aVar.a().h(androidx.camera.core.impl.o.f47438M, null);
        if (num != null) {
            o2.i.b(!o0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            aVar.a().r(androidx.camera.core.impl.p.f47449l, Integer.valueOf(zG0 ? 35 : num.intValue()));
        } else if (n0(aVar.a())) {
            aVar.a().r(androidx.camera.core.impl.p.f47449l, 4101);
            aVar.a().r(androidx.camera.core.impl.p.f47450m, C2979w.f3532c);
        } else if (zG0) {
            aVar.a().r(androidx.camera.core.impl.p.f47449l, 35);
        } else {
            List list = (List) aVar.a().h(androidx.camera.core.impl.q.f47458u, null);
            if (list == null || m0(list, 256)) {
                aVar.a().r(androidx.camera.core.impl.p.f47449l, 256);
            } else if (m0(list, 35)) {
                aVar.a().r(androidx.camera.core.impl.p.f47449l, 35);
            }
        }
        return aVar.b();
    }

    @Override // C.p0
    protected androidx.camera.core.impl.x N(androidx.camera.core.impl.k kVar) {
        this.f3291x.g(kVar);
        V(C2982z.a(new Object[]{this.f3291x.o()}));
        return e().g().d(kVar).a();
    }

    boolean g0(androidx.camera.core.impl.r rVar) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        k.a<Boolean> aVar = androidx.camera.core.impl.o.f47442Q;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(rVar.h(aVar, bool2))) {
            if (o0()) {
                P.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) rVar.h(androidx.camera.core.impl.o.f47438M, null);
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
        return this.f3285r;
    }

    public int j0() {
        int iA0;
        synchronized (this.f3286s) {
            iA0 = this.f3288u;
            if (iA0 == -1) {
                iA0 = ((androidx.camera.core.impl.o) j()).a0(2);
            }
        }
        return iA0;
    }

    @Override // C.p0
    public androidx.camera.core.impl.D<?> k(boolean z10, androidx.camera.core.impl.E e10) {
        c cVar = f3280C;
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
        synchronized (this.f3286s) {
            try {
                if (this.f3286s.get() != null) {
                    return;
                }
                this.f3286s.set(Integer.valueOf(j0()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void q0(Rational rational) {
        this.f3289v = rational;
    }

    public String toString() {
        return "ImageCapture:" + o();
    }

    void v0() {
        synchronized (this.f3286s) {
            try {
                Integer andSet = this.f3286s.getAndSet(null);
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
        this.f3284q = new S.a() { // from class: C.E
            @Override // F.S.a
            public final void a(F.S s10) {
                H.Z(s10);
            }
        };
        this.f3286s = new AtomicReference<>(null);
        this.f3288u = -1;
        this.f3289v = null;
        this.f3283B = new a();
        androidx.camera.core.impl.o oVar2 = (androidx.camera.core.impl.o) j();
        if (oVar2.c(androidx.camera.core.impl.o.f47435J)) {
            this.f3285r = oVar2.Z();
        } else {
            this.f3285r = 1;
        }
        this.f3287t = oVar2.b0(0);
        this.f3290w = J.h.g(oVar2.e0());
    }

    public static /* synthetic */ void a0(H h10, androidx.camera.core.impl.w wVar, w.g gVar) {
        if (h10.g() == null) {
            return;
        }
        h10.f3293z.h();
        h10.e0(true);
        w.b bVarF0 = h10.f0(h10.i(), (androidx.camera.core.impl.o) h10.j(), (androidx.camera.core.impl.x) o2.i.g(h10.e()));
        h10.f3291x = bVarF0;
        h10.V(C2982z.a(new Object[]{bVarF0.o()}));
        h10.G();
        h10.f3293z.i();
    }

    private int h0() {
        InterfaceC3628z interfaceC3628zG = g();
        if (interfaceC3628zG != null) {
            return interfaceC3628zG.a().getLensFacing();
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
        this.f3291x = bVarF0;
        V(C2982z.a(new Object[]{bVarF0.o()}));
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
        return I.n.x(h().b(list, this.f3285r, this.f3287t), new InterfaceC16423a() { // from class: C.G
            @Override // q.InterfaceC16423a
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
