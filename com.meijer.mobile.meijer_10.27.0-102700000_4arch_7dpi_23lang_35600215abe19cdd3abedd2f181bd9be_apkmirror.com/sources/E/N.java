package E;

import C.H;
import E.C3406h;
import E.C3419v;
import E.C3423z;
import E.N;
import F.l0;
import O.C4434u;
import O.C4438y;
import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.Objects;
import java.util.concurrent.Executor;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    final Executor f7426a;

    /* renamed from: b, reason: collision with root package name */
    final C4438y f7427b;

    /* renamed from: c, reason: collision with root package name */
    private a f7428c;

    /* renamed from: d, reason: collision with root package name */
    private O.A<b, O.B<androidx.camera.core.n>> f7429d;

    /* renamed from: e, reason: collision with root package name */
    private O.A<C3419v.a, O.B<byte[]>> f7430e;

    /* renamed from: f, reason: collision with root package name */
    private O.A<C3406h.b, O.B<byte[]>> f7431f;

    /* renamed from: g, reason: collision with root package name */
    private O.A<C3423z.a, H.h> f7432g;

    /* renamed from: h, reason: collision with root package name */
    private O.A<O.B<byte[]>, O.B<Bitmap>> f7433h;

    /* renamed from: i, reason: collision with root package name */
    private O.A<O.B<androidx.camera.core.n>, androidx.camera.core.n> f7434i;

    /* renamed from: j, reason: collision with root package name */
    private O.A<O.B<byte[]>, O.B<androidx.camera.core.n>> f7435j;

    /* renamed from: k, reason: collision with root package name */
    private O.A<O.B<androidx.camera.core.n>, Bitmap> f7436k;

    /* renamed from: l, reason: collision with root package name */
    private O.A<O.B<Bitmap>, O.B<Bitmap>> f7437l;

    /* renamed from: m, reason: collision with root package name */
    private final l0 f7438m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f7439n;

    static abstract class a {
        abstract C4434u<b> a();

        abstract int b();

        abstract int c();

        abstract C4434u<b> d();

        static a e(int i10, int i11) {
            return new C3403e(new C4434u(), new C4434u(), i10, i11);
        }

        a() {
        }
    }

    static abstract class b {
        abstract androidx.camera.core.n a();

        abstract O b();

        static b c(O o10, androidx.camera.core.n nVar) {
            return new C3404f(o10, nVar);
        }

        b() {
        }
    }

    N(Executor executor, C4438y c4438y) {
        this(executor, c4438y, androidx.camera.core.internal.compat.quirk.a.c());
    }

    public void n() {
    }

    N(Executor executor, C4438y c4438y, l0 l0Var) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f7426a = H.a.f(executor);
        } else {
            this.f7426a = executor;
        }
        this.f7427b = c4438y;
        this.f7438m = l0Var;
        this.f7439n = l0Var.a(IncorrectJpegMetadataQuirk.class);
    }

    H.h l(b bVar) throws ImageCaptureException {
        int iC = this.f7428c.c();
        o2.i.b(ImageUtil.h(iC), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(iC)));
        O oB = bVar.b();
        O.B<byte[]> bApply = this.f7430e.apply(C3419v.a.c(this.f7429d.apply(bVar), oB.c()));
        if (bApply.i() || this.f7437l != null) {
            bApply = i(bApply, oB.c());
        }
        O.A<C3423z.a, H.h> a10 = this.f7432g;
        H.g gVarD = oB.d();
        Objects.requireNonNull(gVarD);
        return a10.apply(C3423z.a.c(bApply, gVarD));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b bVar) {
        int iC = this.f7428c.c();
        o2.i.b(iC == 35 || iC == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(iC)));
        final O oB = bVar.b();
        try {
            final Bitmap bitmapApply = this.f7436k.apply(this.f7429d.apply(bVar));
            H.a.d().execute(new Runnable() { // from class: E.L
                @Override // java.lang.Runnable
                public final void run() {
                    oB.r(bitmapApply);
                }
            });
        } catch (Exception e10) {
            bVar.a().close();
            C.P.d("ProcessingNode", "process postview input packet failed.", e10);
        }
    }

    public Void p(a aVar) {
        this.f7428c = aVar;
        aVar.a().a(new InterfaceC15993a() { // from class: E.F
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                N.b(this.f7412a, (N.b) obj);
            }
        });
        aVar.d().a(new InterfaceC15993a() { // from class: E.G
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                N.d(this.f7413a, (N.b) obj);
            }
        });
        this.f7429d = new E();
        this.f7430e = new C3419v(this.f7438m);
        this.f7433h = new C3422y();
        this.f7431f = new C3406h();
        this.f7432g = new C3423z();
        this.f7434i = new B();
        this.f7436k = new C3418u();
        if (aVar.b() == 35 || this.f7427b != null || this.f7439n) {
            this.f7435j = new A();
        }
        C4438y c4438y = this.f7427b;
        if (c4438y == null) {
            return null;
        }
        this.f7437l = new C3407i(c4438y);
        return null;
    }

    public static /* synthetic */ void b(final N n10, final b bVar) {
        n10.getClass();
        if (bVar.b().j()) {
            bVar.a().close();
        } else {
            n10.f7426a.execute(new Runnable() { // from class: E.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7416a.k(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void d(final N n10, final b bVar) {
        n10.getClass();
        if (bVar.b().j()) {
            C.P.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        } else {
            n10.f7426a.execute(new Runnable() { // from class: E.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7414a.m(bVar);
                }
            });
        }
    }

    private O.B<byte[]> i(O.B<byte[]> b10, int i10) throws ImageCaptureException {
        o2.i.i(ImageUtil.h(b10.e()));
        O.B<Bitmap> bApply = this.f7433h.apply(b10);
        O.A<O.B<Bitmap>, O.B<Bitmap>> a10 = this.f7437l;
        if (a10 != null) {
            bApply = a10.apply(bApply);
        }
        return this.f7431f.apply(C3406h.b.c(bApply, i10));
    }

    private static void o(final O o10, final ImageCaptureException imageCaptureException) {
        H.a.d().execute(new Runnable() { // from class: E.M
            @Override // java.lang.Runnable
            public final void run() {
                o10.s(imageCaptureException);
            }
        });
    }

    androidx.camera.core.n j(b bVar) throws ImageCaptureException {
        O oB = bVar.b();
        O.B<androidx.camera.core.n> bApply = this.f7429d.apply(bVar);
        if ((bApply.e() == 35 || this.f7437l != null || this.f7439n) && this.f7428c.c() == 256) {
            O.B<byte[]> bApply2 = this.f7430e.apply(C3419v.a.c(bApply, oB.c()));
            if (this.f7437l != null) {
                bApply2 = i(bApply2, oB.c());
            }
            bApply = this.f7435j.apply(bApply2);
        }
        return this.f7434i.apply(bApply);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(b bVar) {
        final O oB = bVar.b();
        try {
            if (bVar.b().k()) {
                final androidx.camera.core.n nVarJ = j(bVar);
                H.a.d().execute(new Runnable() { // from class: E.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        oB.p(nVarJ);
                    }
                });
            } else {
                final H.h hVarL = l(bVar);
                H.a.d().execute(new Runnable() { // from class: E.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        oB.o(hVarL);
                    }
                });
            }
        } catch (ImageCaptureException e10) {
            o(oB, e10);
        } catch (OutOfMemoryError e11) {
            o(oB, new ImageCaptureException(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            o(oB, new ImageCaptureException(0, "Processing failed.", e12));
        }
    }
}
