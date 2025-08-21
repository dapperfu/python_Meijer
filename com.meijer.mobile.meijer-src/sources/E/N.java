package E;

import C.H;
import E.C3168h;
import E.C3181v;
import E.C3185z;
import E.N;
import F.l0;
import O.C4347u;
import O.C4351y;
import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.Objects;
import java.util.concurrent.Executor;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    final Executor f6833a;

    /* renamed from: b, reason: collision with root package name */
    final C4351y f6834b;

    /* renamed from: c, reason: collision with root package name */
    private a f6835c;

    /* renamed from: d, reason: collision with root package name */
    private O.A<b, O.B<androidx.camera.core.n>> f6836d;

    /* renamed from: e, reason: collision with root package name */
    private O.A<C3181v.a, O.B<byte[]>> f6837e;

    /* renamed from: f, reason: collision with root package name */
    private O.A<C3168h.b, O.B<byte[]>> f6838f;

    /* renamed from: g, reason: collision with root package name */
    private O.A<C3185z.a, H.h> f6839g;

    /* renamed from: h, reason: collision with root package name */
    private O.A<O.B<byte[]>, O.B<Bitmap>> f6840h;

    /* renamed from: i, reason: collision with root package name */
    private O.A<O.B<androidx.camera.core.n>, androidx.camera.core.n> f6841i;

    /* renamed from: j, reason: collision with root package name */
    private O.A<O.B<byte[]>, O.B<androidx.camera.core.n>> f6842j;

    /* renamed from: k, reason: collision with root package name */
    private O.A<O.B<androidx.camera.core.n>, Bitmap> f6843k;

    /* renamed from: l, reason: collision with root package name */
    private O.A<O.B<Bitmap>, O.B<Bitmap>> f6844l;

    /* renamed from: m, reason: collision with root package name */
    private final l0 f6845m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f6846n;

    static abstract class a {
        abstract C4347u<b> a();

        abstract int b();

        abstract int c();

        abstract C4347u<b> d();

        static a e(int i10, int i11) {
            return new C3165e(new C4347u(), new C4347u(), i10, i11);
        }

        a() {
        }
    }

    static abstract class b {
        abstract androidx.camera.core.n a();

        abstract O b();

        static b c(O o10, androidx.camera.core.n nVar) {
            return new C3166f(o10, nVar);
        }

        b() {
        }
    }

    N(Executor executor, C4351y c4351y) {
        this(executor, c4351y, androidx.camera.core.internal.compat.quirk.a.c());
    }

    public void n() {
    }

    N(Executor executor, C4351y c4351y, l0 l0Var) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f6833a = H.a.f(executor);
        } else {
            this.f6833a = executor;
        }
        this.f6834b = c4351y;
        this.f6845m = l0Var;
        this.f6846n = l0Var.a(IncorrectJpegMetadataQuirk.class);
    }

    H.h l(b bVar) throws ImageCaptureException {
        int iC = this.f6835c.c();
        o2.i.b(ImageUtil.h(iC), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(iC)));
        O oB = bVar.b();
        O.B<byte[]> bApply = this.f6837e.apply(C3181v.a.c(this.f6836d.apply(bVar), oB.c()));
        if (bApply.i() || this.f6844l != null) {
            bApply = i(bApply, oB.c());
        }
        O.A<C3185z.a, H.h> a10 = this.f6839g;
        H.g gVarD = oB.d();
        Objects.requireNonNull(gVarD);
        return a10.apply(C3185z.a.c(bApply, gVarD));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b bVar) {
        int iC = this.f6835c.c();
        o2.i.b(iC == 35 || iC == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(iC)));
        final O oB = bVar.b();
        try {
            final Bitmap bitmapApply = this.f6843k.apply(this.f6836d.apply(bVar));
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
        this.f6835c = aVar;
        aVar.a().a(new InterfaceC16068a() { // from class: E.F
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                N.b(this.f6819a, (N.b) obj);
            }
        });
        aVar.d().a(new InterfaceC16068a() { // from class: E.G
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                N.d(this.f6820a, (N.b) obj);
            }
        });
        this.f6836d = new E();
        this.f6837e = new C3181v(this.f6845m);
        this.f6840h = new C3184y();
        this.f6838f = new C3168h();
        this.f6839g = new C3185z();
        this.f6841i = new B();
        this.f6843k = new C3180u();
        if (aVar.b() == 35 || this.f6834b != null || this.f6846n) {
            this.f6842j = new A();
        }
        C4351y c4351y = this.f6834b;
        if (c4351y == null) {
            return null;
        }
        this.f6844l = new C3169i(c4351y);
        return null;
    }

    public static /* synthetic */ void b(final N n10, final b bVar) {
        n10.getClass();
        if (bVar.b().j()) {
            bVar.a().close();
        } else {
            n10.f6833a.execute(new Runnable() { // from class: E.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6823a.k(bVar);
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
            n10.f6833a.execute(new Runnable() { // from class: E.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6821a.m(bVar);
                }
            });
        }
    }

    private O.B<byte[]> i(O.B<byte[]> b10, int i10) throws ImageCaptureException {
        o2.i.i(ImageUtil.h(b10.e()));
        O.B<Bitmap> bApply = this.f6840h.apply(b10);
        O.A<O.B<Bitmap>, O.B<Bitmap>> a10 = this.f6844l;
        if (a10 != null) {
            bApply = a10.apply(bApply);
        }
        return this.f6838f.apply(C3168h.b.c(bApply, i10));
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
        O.B<androidx.camera.core.n> bApply = this.f6836d.apply(bVar);
        if ((bApply.e() == 35 || this.f6844l != null || this.f6846n) && this.f6835c.c() == 256) {
            O.B<byte[]> bApply2 = this.f6837e.apply(C3181v.a.c(bApply, oB.c()));
            if (this.f6844l != null) {
                bApply2 = i(bApply2, oB.c());
            }
            bApply = this.f6842j.apply(bApply2);
        }
        return this.f6841i.apply(bApply);
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
