package androidx.camera.view;

import C.P;
import C.o0;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.i;
import androidx.camera.view.n;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
final class n extends i {

    /* renamed from: e, reason: collision with root package name */
    SurfaceView f47660e;

    /* renamed from: f, reason: collision with root package name */
    final b f47661f;

    class b implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        private Size f47662a;

        /* renamed from: b, reason: collision with root package name */
        private o0 f47663b;

        /* renamed from: c, reason: collision with root package name */
        private o0 f47664c;

        /* renamed from: d, reason: collision with root package name */
        private i.a f47665d;

        /* renamed from: e, reason: collision with root package name */
        private Size f47666e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f47667f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f47668g = false;

        b() {
        }

        public static /* synthetic */ void a(i.a aVar, o0.g gVar) {
            P.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        private boolean b() {
            return (this.f47667f || this.f47663b == null || !Objects.equals(this.f47662a, this.f47666e)) ? false : true;
        }

        private void c() {
            if (this.f47663b != null) {
                P.a("SurfaceViewImpl", "Request canceled: " + this.f47663b);
                this.f47663b.v();
            }
        }

        private void d() {
            if (this.f47663b != null) {
                P.a("SurfaceViewImpl", "Surface closed " + this.f47663b);
                this.f47663b.m().d();
            }
        }

        private boolean f() throws ExecutionException, InterruptedException {
            Surface surface = n.this.f47660e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            P.a("SurfaceViewImpl", "Surface set on Preview.");
            final i.a aVar = this.f47665d;
            o0 o0Var = this.f47663b;
            Objects.requireNonNull(o0Var);
            o0Var.s(surface, Z1.b.h(n.this.f47660e.getContext()), new InterfaceC15993a() { // from class: androidx.camera.view.o
                @Override // o2.InterfaceC15993a
                public final void accept(Object obj) {
                    n.b.a(aVar, (o0.g) obj);
                }
            });
            this.f47667f = true;
            n.this.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) throws ExecutionException, InterruptedException {
            P.a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f47666e = new Size(i11, i12);
            f();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            o0 o0Var;
            P.a("SurfaceViewImpl", "Surface created.");
            if (!this.f47668g || (o0Var = this.f47664c) == null) {
                return;
            }
            o0Var.q();
            this.f47664c = null;
            this.f47668g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            P.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f47667f) {
                d();
            } else {
                c();
            }
            this.f47668g = true;
            o0 o0Var = this.f47663b;
            if (o0Var != null) {
                this.f47664c = o0Var;
            }
            this.f47667f = false;
            this.f47663b = null;
            this.f47665d = null;
            this.f47666e = null;
            this.f47662a = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(o0 o0Var, i.a aVar) {
            c();
            if (this.f47668g) {
                this.f47668g = false;
                o0Var.q();
                return;
            }
            this.f47663b = o0Var;
            this.f47665d = aVar;
            Size sizeO = o0Var.o();
            this.f47662a = sizeO;
            this.f47667f = false;
            if (!f()) {
                P.a("SurfaceViewImpl", "Wait for new Surface creation.");
                n.this.f47660e.getHolder().setFixedSize(sizeO.getWidth(), sizeO.getHeight());
            }
        }
    }

    @Override // androidx.camera.view.i
    void d() {
    }

    @Override // androidx.camera.view.i
    void e() {
    }

    @Override // androidx.camera.view.i
    com.google.common.util.concurrent.q<Void> i() {
        return I.n.p(null);
    }

    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    public static /* synthetic */ void k(Semaphore semaphore, int i10) {
        if (i10 == 0) {
            P.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            P.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
        }
        semaphore.release();
    }

    @Override // androidx.camera.view.i
    View b() {
        return this.f47660e;
    }

    @Override // androidx.camera.view.i
    Bitmap c() {
        SurfaceView surfaceView = this.f47660e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f47660e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f47660e.getWidth(), this.f47660e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f47660e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.m
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                n.k(semaphore, i10);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                P.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e10) {
            P.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.i
    void g(final o0 o0Var, final i.a aVar) {
        if (!m(this.f47660e, this.f47646a, o0Var)) {
            this.f47646a = o0Var.o();
            l();
        }
        if (aVar != null) {
            o0Var.j(Z1.b.h(this.f47660e.getContext()), new Runnable() { // from class: androidx.camera.view.k
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a();
                }
            });
        }
        this.f47660e.post(new Runnable() { // from class: androidx.camera.view.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f47656a.f47661f.e(o0Var, aVar);
            }
        });
    }

    void l() {
        o2.i.g(this.f47647b);
        o2.i.g(this.f47646a);
        SurfaceView surfaceView = new SurfaceView(this.f47647b.getContext());
        this.f47660e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f47646a.getWidth(), this.f47646a.getHeight()));
        this.f47647b.removeAllViews();
        this.f47647b.addView(this.f47660e);
        this.f47660e.getHolder().addCallback(this.f47661f);
    }

    n(FrameLayout frameLayout, e eVar) {
        super(frameLayout, eVar);
        this.f47661f = new b();
    }

    private static boolean m(SurfaceView surfaceView, Size size, o0 o0Var) {
        boolean zEquals = Objects.equals(size, o0Var.o());
        if (surfaceView != null && zEquals) {
            return true;
        }
        return false;
    }
}
