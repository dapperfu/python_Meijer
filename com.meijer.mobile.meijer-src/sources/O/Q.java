package O;

import C.d0;
import F.InterfaceC3290z;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
final class Q implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private final Surface f22822b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22823c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22824d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f22825e;

    /* renamed from: f, reason: collision with root package name */
    private final d0.a f22826f;

    /* renamed from: g, reason: collision with root package name */
    private final d0.a f22827g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f22828h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f22829i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f22830j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f22831k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC16068a<d0.b> f22832l;

    /* renamed from: m, reason: collision with root package name */
    private Executor f22833m;

    /* renamed from: p, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f22836p;

    /* renamed from: q, reason: collision with root package name */
    private c.a<Void> f22837q;

    /* renamed from: r, reason: collision with root package name */
    private Matrix f22838r;

    /* renamed from: a, reason: collision with root package name */
    private final Object f22821a = new Object();

    /* renamed from: n, reason: collision with root package name */
    private boolean f22834n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22835o = false;

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

    private static void d(float[] fArr, InterfaceC3290z interfaceC3290z) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        G.m.d(fArr, 0.5f);
        if (interfaceC3290z != null) {
            o2.i.j(interfaceC3290z.o(), "Camera has no transform.");
            G.m.c(fArr, interfaceC3290z.a().a(), 0.5f, 0.5f);
            if (interfaceC3290z.k()) {
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
        q10.f22837q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    @Override // C.d0
    public void V(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f22828h : this.f22829i, 0);
    }

    @Override // C.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f22821a) {
            try {
                if (!this.f22835o) {
                    this.f22835o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22837q.c(null);
    }

    public com.google.common.util.concurrent.q<Void> g() {
        return this.f22836p;
    }

    @Override // C.d0
    public Surface g0(Executor executor, InterfaceC16068a<d0.b> interfaceC16068a) {
        boolean z10;
        synchronized (this.f22821a) {
            this.f22833m = executor;
            this.f22832l = interfaceC16068a;
            z10 = this.f22834n;
        }
        if (z10) {
            h();
        }
        return this.f22822b;
    }

    @Override // C.d0
    public int getFormat() {
        return this.f22824d;
    }

    @Override // C.d0
    public Size getSize() {
        return this.f22825e;
    }

    public void h() {
        Executor executor;
        InterfaceC16068a<d0.b> interfaceC16068a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f22821a) {
            try {
                if (this.f22833m == null || (interfaceC16068a = this.f22832l) == null) {
                    this.f22834n = true;
                } else if (!this.f22835o) {
                    atomicReference.set(interfaceC16068a);
                    executor = this.f22833m;
                    this.f22834n = false;
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
                        Q.b(this.f22819a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                C.P.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    Q(Surface surface, int i10, int i11, Size size, d0.a aVar, d0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f22828h = fArr;
        float[] fArr2 = new float[16];
        this.f22829i = fArr2;
        float[] fArr3 = new float[16];
        this.f22830j = fArr3;
        float[] fArr4 = new float[16];
        this.f22831k = fArr4;
        this.f22822b = surface;
        this.f22823c = i10;
        this.f22824d = i11;
        this.f22825e = size;
        this.f22826f = aVar;
        this.f22827g = aVar2;
        this.f22838r = matrix;
        c(fArr, fArr3, aVar);
        c(fArr2, fArr4, aVar2);
        this.f22836p = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: O.O
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar3) {
                return Q.a(this.f22818a, aVar3);
            }
        });
    }

    public static /* synthetic */ void b(Q q10, AtomicReference atomicReference) {
        q10.getClass();
        ((InterfaceC16068a) atomicReference.get()).accept(d0.b.c(0, q10));
    }
}
