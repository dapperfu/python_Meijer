package v;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import z.C18407x;

/* renamed from: v.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17571y1 {

    /* renamed from: a, reason: collision with root package name */
    private DeferrableSurface f165245a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.camera.core.impl.w f165246b;

    /* renamed from: d, reason: collision with root package name */
    private final Size f165248d;

    /* renamed from: f, reason: collision with root package name */
    private final c f165250f;

    /* renamed from: e, reason: collision with root package name */
    private final C18407x f165249e = new C18407x();

    /* renamed from: g, reason: collision with root package name */
    private w.c f165251g = null;

    /* renamed from: c, reason: collision with root package name */
    private final b f165247c = new b();

    /* renamed from: v.y1$a */
    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f165252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f165253b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f165252a = surface;
            this.f165253b = surfaceTexture;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f165252a.release();
            this.f165253b.release();
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    /* renamed from: v.y1$b */
    private static class b implements androidx.camera.core.impl.D<C.p0> {

        /* renamed from: I, reason: collision with root package name */
        private final androidx.camera.core.impl.k f165255I;

        private void Y(androidx.camera.core.impl.s sVar) {
            sVar.r(J.k.f15321c, C17571y1.class);
            sVar.r(J.k.f15320b, C17571y1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.D
        public E.b O() {
            return E.b.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.v
        public androidx.camera.core.impl.k b() {
            return this.f165255I;
        }

        b() {
            androidx.camera.core.impl.s sVarB0 = androidx.camera.core.impl.s.b0();
            sVarB0.r(androidx.camera.core.impl.D.f47553z, new J0());
            sVarB0.r(androidx.camera.core.impl.p.f47673l, 34);
            Y(sVarB0);
            this.f165255I = sVarB0;
        }
    }

    /* renamed from: v.y1$c */
    interface c {
        void a();
    }

    void c() {
        C.P.a("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f165245a;
        if (deferrableSurface != null) {
            deferrableSurface.d();
        }
        this.f165245a = null;
    }

    androidx.camera.core.impl.w d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f165248d.getWidth(), this.f165248d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        w.b bVarP = w.b.p(this.f165247c, this.f165248d);
        bVarP.w(1);
        F.T t10 = new F.T(surface);
        this.f165245a = t10;
        I.n.j(t10.k(), new a(surface, surfaceTexture), H.a.a());
        bVarP.l(this.f165245a);
        w.c cVar = this.f165251g;
        if (cVar != null) {
            cVar.b();
        }
        w.c cVar2 = new w.c(new w.d() { // from class: v.w1
            @Override // androidx.camera.core.impl.w.d
            public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                C17571y1.a(this.f165240a, wVar, gVar);
            }
        });
        this.f165251g = cVar2;
        bVarP.q(cVar2);
        return bVarP.o();
    }

    Size e() {
        return this.f165248d;
    }

    String f() {
        return "MeteringRepeating";
    }

    androidx.camera.core.impl.w h() {
        return this.f165246b;
    }

    androidx.camera.core.impl.D<?> i() {
        return this.f165247c;
    }

    C17571y1(w.B b10, C17524i1 c17524i1, c cVar) {
        this.f165250f = cVar;
        Size sizeG = g(b10, c17524i1);
        this.f165248d = sizeG;
        C.P.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeG);
        this.f165246b = d();
    }

    public static /* synthetic */ void a(C17571y1 c17571y1, androidx.camera.core.impl.w wVar, w.g gVar) {
        c17571y1.f165246b = c17571y1.d();
        c cVar = c17571y1.f165250f;
        if (cVar != null) {
            cVar.a();
        }
    }

    private Size g(w.B b10, C17524i1 c17524i1) {
        Size[] sizeArrC = b10.b().c(34);
        if (sizeArrC == null) {
            C.P.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.f165249e.a(sizeArrC);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() { // from class: v.x1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            }
        });
        Size sizeF = c17524i1.f();
        long jMin = Math.min(sizeF.getWidth() * sizeF.getHeight(), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = sizeArrA[i10];
            long width = size2.getWidth() * size2.getHeight();
            if (width == jMin) {
                return size2;
            }
            if (width > jMin) {
                if (size != null) {
                    return size;
                }
            } else {
                i10++;
                size = size2;
            }
        }
        return (Size) listAsList.get(0);
    }
}
