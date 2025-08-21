package androidx.camera.core;

import C.N;
import C.P;
import F.S;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.f;
import androidx.concurrent.futures.c;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i implements S.a {

    /* renamed from: a, reason: collision with root package name */
    private f.a f47511a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f47512b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f47513c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f47515e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f47516f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f47517g;

    /* renamed from: h, reason: collision with root package name */
    private q f47518h;

    /* renamed from: i, reason: collision with root package name */
    private ImageWriter f47519i;

    /* renamed from: n, reason: collision with root package name */
    ByteBuffer f47524n;

    /* renamed from: o, reason: collision with root package name */
    ByteBuffer f47525o;

    /* renamed from: p, reason: collision with root package name */
    ByteBuffer f47526p;

    /* renamed from: q, reason: collision with root package name */
    ByteBuffer f47527q;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f47514d = 1;

    /* renamed from: j, reason: collision with root package name */
    private Rect f47520j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private Rect f47521k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    private Matrix f47522l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private Matrix f47523m = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    private final Object f47528r = new Object();

    /* renamed from: s, reason: collision with root package name */
    protected boolean f47529s = true;

    abstract n d(S s10);

    void f() {
        this.f47529s = true;
    }

    abstract void g();

    void j() {
        this.f47529s = false;
        g();
    }

    abstract void m(n nVar);

    public static /* synthetic */ void b(i iVar, n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar, c.a aVar2) {
        if (!iVar.f47529s) {
            aVar2.f(new OperationCanceledException("ImageAnalysis is detached"));
            return;
        }
        r rVar = new r(nVar2, N.d(nVar.S2().a(), nVar.S2().getTimestamp(), iVar.f47515e ? 0 : iVar.f47512b, matrix));
        if (!rect.isEmpty()) {
            rVar.R0(rect);
        }
        aVar.b(rVar);
        aVar2.c(null);
    }

    private void h(n nVar) {
        if (this.f47514d != 1) {
            if (this.f47514d == 2 && this.f47524n == null) {
                this.f47524n = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f47525o == null) {
            this.f47525o = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight());
        }
        this.f47525o.position(0);
        if (this.f47526p == null) {
            this.f47526p = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f47526p.position(0);
        if (this.f47527q == null) {
            this.f47527q = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f47527q.position(0);
    }

    private static q i(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new q(o.a(i15, i10, i13, i14));
    }

    static Matrix k(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), G.p.f11129a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(G.p.c(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private void n(int i10, int i11, int i12, int i13) {
        Matrix matrixK = k(i10, i11, i12, i13, this.f47512b);
        this.f47521k = l(this.f47520j, matrixK);
        this.f47523m.setConcat(this.f47522l, matrixK);
    }

    private void o(n nVar, int i10) {
        q qVar = this.f47518h;
        if (qVar == null) {
            return;
        }
        qVar.j();
        this.f47518h = i(nVar.getWidth(), nVar.getHeight(), i10, this.f47518h.c(), this.f47518h.e());
        if (this.f47514d == 1) {
            ImageWriter imageWriter = this.f47519i;
            if (imageWriter != null) {
                K.a.a(imageWriter);
            }
            this.f47519i = K.a.c(this.f47518h.getSurface(), this.f47518h.e());
        }
    }

    com.google.common.util.concurrent.q<Void> e(final n nVar) throws Throwable {
        Object obj;
        final Executor executor;
        final f.a aVar;
        boolean z10;
        q qVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        n nVar2;
        n nVarM;
        int i10 = this.f47515e ? this.f47512b : 0;
        Object obj2 = this.f47528r;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f47517g;
                    aVar = this.f47511a;
                    z10 = this.f47515e && i10 != this.f47513c;
                    if (z10) {
                        o(nVar, i10);
                    }
                    if (this.f47515e) {
                        h(nVar);
                    }
                    try {
                        qVar = this.f47518h;
                        try {
                            imageWriter = this.f47519i;
                            byteBuffer = this.f47524n;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            try {
                byteBuffer2 = this.f47525o;
                byteBuffer3 = this.f47526p;
                byteBuffer4 = this.f47527q;
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
                throw th;
            }
        }
        if (aVar == null || executor == null || !this.f47529s) {
            return I.n.n(new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (qVar == null) {
            nVar2 = null;
        } else {
            if (this.f47514d == 2) {
                nVarM = ImageProcessingUtil.g(nVar, qVar, byteBuffer, i10, this.f47516f);
            } else {
                if (this.f47514d == 1) {
                    if (this.f47516f) {
                        ImageProcessingUtil.c(nVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        nVarM = ImageProcessingUtil.m(nVar, qVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                nVar2 = null;
            }
            nVar2 = nVarM;
        }
        boolean z11 = nVar2 == null;
        final n nVar3 = z11 ? nVar : nVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f47528r) {
            if (z10 && !z11) {
                try {
                    n(nVar.getWidth(), nVar.getHeight(), nVar3.getWidth(), nVar3.getHeight());
                } finally {
                }
            }
            this.f47513c = i10;
            rect.set(this.f47521k);
            matrix.set(this.f47523m);
        }
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: androidx.camera.core.g
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar2) {
                return i.c(this.f47497a, executor, nVar, matrix, nVar3, rect, aVar, aVar2);
            }
        });
    }

    void p(Executor executor, f.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.f47528r) {
            this.f47511a = aVar;
            this.f47517g = executor;
        }
    }

    void q(boolean z10) {
        this.f47516f = z10;
    }

    void r(int i10) {
        this.f47514d = i10;
    }

    void s(boolean z10) {
        this.f47515e = z10;
    }

    void t(q qVar) {
        synchronized (this.f47528r) {
            this.f47518h = qVar;
        }
    }

    void u(int i10) {
        this.f47512b = i10;
    }

    void v(Matrix matrix) {
        synchronized (this.f47528r) {
            this.f47522l = matrix;
            this.f47523m = new Matrix(this.f47522l);
        }
    }

    void w(Rect rect) {
        synchronized (this.f47528r) {
            this.f47520j = rect;
            this.f47521k = new Rect(this.f47520j);
        }
    }

    i() {
    }

    public static /* synthetic */ Object c(final i iVar, Executor executor, final n nVar, final Matrix matrix, final n nVar2, final Rect rect, final f.a aVar, final c.a aVar2) {
        iVar.getClass();
        executor.execute(new Runnable() { // from class: androidx.camera.core.h
            @Override // java.lang.Runnable
            public final void run() {
                i.b(this.f47504a, nVar, matrix, nVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    @Override // F.S.a
    public void a(S s10) {
        try {
            n nVarD = d(s10);
            if (nVarD != null) {
                m(nVarD);
            }
        } catch (IllegalStateException e10) {
            P.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }
}
