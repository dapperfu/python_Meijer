package O;

import C.d0;
import F.InterfaceC3628z;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
final class Q implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private final Surface f22829b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22830c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22831d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f22832e;

    /* renamed from: f, reason: collision with root package name */
    private final d0.a f22833f;

    /* renamed from: g, reason: collision with root package name */
    private final d0.a f22834g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f22835h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f22836i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f22837j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f22838k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC15993a<d0.b> f22839l;

    /* renamed from: m, reason: collision with root package name */
    private Executor f22840m;

    /* renamed from: p, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f22843p;

    /* renamed from: q, reason: collision with root package name */
    private c.a<Void> f22844q;

    /* renamed from: r, reason: collision with root package name */
    private Matrix f22845r;

    /* renamed from: a, reason: collision with root package name */
    private final Object f22828a = new Object();

    /* renamed from: n, reason: collision with root package name */
    private boolean f22841n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22842o = false;

    private static void c(float[] fArr, float[] fArr2, d0.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        G.m.d(fArr, 0.5f);
        G.m.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix matrixE = G.p.e(G.p.r(aVar.c()), G.p.r(G.p.o(aVar.c(), aVar.e())), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixE.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float fWidth = rectF.width() / r1.getWidth();
        float fHeight = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        d(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void d(float[] fArr, InterfaceC3628z interfaceC3628z) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        G.m.d(fArr, 0.5f);
        if (interfaceC3628z != null) {
            o2.i.j(interfaceC3628z.o(), "Camera has no transform.");
            G.m.c(fArr, interfaceC3628z.a().a(), 0.5f, 0.5f);
            if (interfaceC3628z.k()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // C.d0
    public void U1(float[] fArr, float[] fArr2) {
        V(fArr, fArr2, true);
    }

    public static /* synthetic */ Object a(Q q10, c.a aVar) {
        q10.f22844q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    @Override // C.d0
    public void V(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f22835h : this.f22836i, 0);
    }

    @Override // C.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f22828a) {
            try {
                if (!this.f22842o) {
                    this.f22842o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22844q.c(null);
    }

    public com.google.common.util.concurrent.q<Void> g() {
        return this.f22843p;
    }

    @Override // C.d0
    public Surface g0(Executor executor, InterfaceC15993a<d0.b> interfaceC15993a) {
        boolean z10;
        synchronized (this.f22828a) {
            this.f22840m = executor;
            this.f22839l = interfaceC15993a;
            z10 = this.f22841n;
        }
        if (z10) {
            h();
        }
        return this.f22829b;
    }

    @Override // C.d0
    public int getFormat() {
        return this.f22831d;
    }

    @Override // C.d0
    public Size getSize() {
        return this.f22832e;
    }

    public void h() {
        Executor executor;
        InterfaceC15993a<d0.b> interfaceC15993a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f22828a) {
            try {
                if (this.f22840m == null || (interfaceC15993a = this.f22839l) == null) {
                    this.f22841n = true;
                } else if (!this.f22842o) {
                    atomicReference.set(interfaceC15993a);
                    executor = this.f22840m;
                    this.f22841n = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: O.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        Q.b(this.f22826a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                C.P.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    Q(Surface surface, int i10, int i11, Size size, d0.a aVar, d0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f22835h = fArr;
        float[] fArr2 = new float[16];
        this.f22836i = fArr2;
        float[] fArr3 = new float[16];
        this.f22837j = fArr3;
        float[] fArr4 = new float[16];
        this.f22838k = fArr4;
        this.f22829b = surface;
        this.f22830c = i10;
        this.f22831d = i11;
        this.f22832e = size;
        this.f22833f = aVar;
        this.f22834g = aVar2;
        this.f22845r = matrix;
        c(fArr, fArr3, aVar);
        c(fArr2, fArr4, aVar2);
        this.f22843p = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: O.O
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar3) {
                return Q.a(this.f22825a, aVar3);
            }
        });
    }

    public static /* synthetic */ void b(Q q10, AtomicReference atomicReference) {
        q10.getClass();
        ((InterfaceC15993a) atomicReference.get()).accept(d0.b.c(0, q10));
    }
}
