package androidx.camera.core;

import F.S;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class q implements S {

    /* renamed from: d, reason: collision with root package name */
    private final S f47562d;

    /* renamed from: e, reason: collision with root package name */
    private final Surface f47563e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f47564f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f47559a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private int f47560b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47561c = false;

    /* renamed from: g, reason: collision with root package name */
    private final e.a f47565g = new e.a() { // from class: C.c0
        @Override // androidx.camera.core.e.a
        public final void a(androidx.camera.core.n nVar) {
            androidx.camera.core.q.h(this.f3358a, nVar);
        }
    };

    public static /* synthetic */ void h(q qVar, n nVar) {
        e.a aVar;
        synchronized (qVar.f47559a) {
            try {
                int i10 = qVar.f47560b - 1;
                qVar.f47560b = i10;
                if (qVar.f47561c && i10 == 0) {
                    qVar.close();
                }
                aVar = qVar.f47564f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.a(nVar);
        }
    }

    private n l(n nVar) {
        if (nVar == null) {
            return null;
        }
        this.f47560b++;
        s sVar = new s(nVar);
        sVar.a(this.f47565g);
        return sVar;
    }

    @Override // F.S
    public n b() {
        n nVarL;
        synchronized (this.f47559a) {
            nVarL = l(this.f47562d.b());
        }
        return nVarL;
    }

    @Override // F.S
    public int c() {
        int iC;
        synchronized (this.f47559a) {
            iC = this.f47562d.c();
        }
        return iC;
    }

    @Override // F.S
    public void close() {
        synchronized (this.f47559a) {
            try {
                Surface surface = this.f47563e;
                if (surface != null) {
                    surface.release();
                }
                this.f47562d.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // F.S
    public void d() {
        synchronized (this.f47559a) {
            this.f47562d.d();
        }
    }

    @Override // F.S
    public int e() {
        int iE;
        synchronized (this.f47559a) {
            iE = this.f47562d.e();
        }
        return iE;
    }

    @Override // F.S
    public void f(final S.a aVar, Executor executor) {
        synchronized (this.f47559a) {
            this.f47562d.f(new S.a() { // from class: C.b0
                @Override // F.S.a
                public final void a(F.S s10) {
                    androidx.camera.core.q.a(this.f3354a, aVar, s10);
                }
            }, executor);
        }
    }

    @Override // F.S
    public n g() {
        n nVarL;
        synchronized (this.f47559a) {
            nVarL = l(this.f47562d.g());
        }
        return nVarL;
    }

    @Override // F.S
    public int getHeight() {
        int height;
        synchronized (this.f47559a) {
            height = this.f47562d.getHeight();
        }
        return height;
    }

    @Override // F.S
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f47559a) {
            surface = this.f47562d.getSurface();
        }
        return surface;
    }

    @Override // F.S
    public int getWidth() {
        int width;
        synchronized (this.f47559a) {
            width = this.f47562d.getWidth();
        }
        return width;
    }

    public int i() {
        int iE;
        synchronized (this.f47559a) {
            iE = this.f47562d.e() - this.f47560b;
        }
        return iE;
    }

    public void j() {
        synchronized (this.f47559a) {
            try {
                this.f47561c = true;
                this.f47562d.d();
                if (this.f47560b == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(e.a aVar) {
        synchronized (this.f47559a) {
            this.f47564f = aVar;
        }
    }

    public q(S s10) {
        this.f47562d = s10;
        this.f47563e = s10.getSurface();
    }

    public static /* synthetic */ void a(q qVar, S.a aVar, S s10) {
        qVar.getClass();
        aVar.a(qVar);
    }
}
