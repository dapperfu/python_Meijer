package androidx.camera.view;

import C.P;
import C.o0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.i;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
final class t extends i {

    /* renamed from: e, reason: collision with root package name */
    TextureView f47904e;

    /* renamed from: f, reason: collision with root package name */
    SurfaceTexture f47905f;

    /* renamed from: g, reason: collision with root package name */
    com.google.common.util.concurrent.q<o0.g> f47906g;

    /* renamed from: h, reason: collision with root package name */
    o0 f47907h;

    /* renamed from: i, reason: collision with root package name */
    boolean f47908i;

    /* renamed from: j, reason: collision with root package name */
    SurfaceTexture f47909j;

    /* renamed from: k, reason: collision with root package name */
    AtomicReference<c.a<Void>> f47910k;

    /* renamed from: l, reason: collision with root package name */
    i.a f47911l;

    /* renamed from: m, reason: collision with root package name */
    Executor f47912m;

    class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.t$a$a, reason: collision with other inner class name */
        class C0980a implements I.c<o0.g> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f47914a;

            C0980a(SurfaceTexture surfaceTexture) {
                this.f47914a = surfaceTexture;
            }

            @Override // I.c
            public void onFailure(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }

            @Override // I.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(o0.g gVar) {
                boolean z10;
                if (gVar.a() != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o2.i.j(z10, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                P.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f47914a.release();
                t tVar = t.this;
                if (tVar.f47909j != null) {
                    tVar.f47909j = null;
                }
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            P.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            t tVar = t.this;
            tVar.f47905f = surfaceTexture;
            if (tVar.f47906g == null) {
                tVar.q();
                return;
            }
            o2.i.g(tVar.f47907h);
            P.a("TextureViewImpl", "Surface invalidated " + t.this.f47907h);
            t.this.f47907h.m().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            t tVar = t.this;
            tVar.f47905f = null;
            com.google.common.util.concurrent.q<o0.g> qVar = tVar.f47906g;
            if (qVar == null) {
                P.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            I.n.j(qVar, new C0980a(surfaceTexture), Z1.b.h(t.this.f47904e.getContext()));
            t.this.f47909j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            P.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a<Void> andSet = t.this.f47910k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            t.this.getClass();
            Executor executor = t.this.f47912m;
        }
    }

    @Override // androidx.camera.view.i
    void e() {
        this.f47908i = true;
    }

    public static /* synthetic */ void l(t tVar, o0 o0Var) {
        o0 o0Var2 = tVar.f47907h;
        if (o0Var2 != null && o0Var2 == o0Var) {
            tVar.f47907h = null;
            tVar.f47906g = null;
        }
        tVar.o();
    }

    public static /* synthetic */ Object m(t tVar, c.a aVar) {
        tVar.f47910k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void o() {
        i.a aVar = this.f47911l;
        if (aVar != null) {
            aVar.a();
            this.f47911l = null;
        }
    }

    private void p() {
        if (!this.f47908i || this.f47909j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f47904e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f47909j;
        if (surfaceTexture != surfaceTexture2) {
            this.f47904e.setSurfaceTexture(surfaceTexture2);
            this.f47909j = null;
            this.f47908i = false;
        }
    }

    @Override // androidx.camera.view.i
    View b() {
        return this.f47904e;
    }

    @Override // androidx.camera.view.i
    Bitmap c() {
        TextureView textureView = this.f47904e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f47904e.getBitmap();
    }

    @Override // androidx.camera.view.i
    com.google.common.util.concurrent.q<Void> i() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: androidx.camera.view.q
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return t.m(this.f47897a, aVar);
            }
        });
    }

    public void n() {
        o2.i.g(this.f47871b);
        o2.i.g(this.f47870a);
        TextureView textureView = new TextureView(this.f47871b.getContext());
        this.f47904e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f47870a.getWidth(), this.f47870a.getHeight()));
        this.f47904e.setSurfaceTextureListener(new a());
        this.f47871b.removeAllViews();
        this.f47871b.addView(this.f47904e);
    }

    void q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f47870a;
        if (size == null || (surfaceTexture = this.f47905f) == null || this.f47907h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f47870a.getHeight());
        final Surface surface = new Surface(this.f47905f);
        final o0 o0Var = this.f47907h;
        final com.google.common.util.concurrent.q<o0.g> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: androidx.camera.view.r
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return t.j(this.f47898a, surface, aVar);
            }
        });
        this.f47906g = qVarA;
        qVarA.addListener(new Runnable() { // from class: androidx.camera.view.s
            @Override // java.lang.Runnable
            public final void run() {
                t.k(this.f47900a, surface, qVarA, o0Var);
            }
        }, Z1.b.h(this.f47904e.getContext()));
        f();
    }

    t(FrameLayout frameLayout, e eVar) {
        super(frameLayout, eVar);
        this.f47908i = false;
        this.f47910k = new AtomicReference<>();
    }

    public static /* synthetic */ Object j(t tVar, Surface surface, final c.a aVar) throws ExecutionException, InterruptedException {
        tVar.getClass();
        P.a("TextureViewImpl", "Surface set on Preview.");
        o0 o0Var = tVar.f47907h;
        Executor executorA = H.a.a();
        Objects.requireNonNull(aVar);
        o0Var.s(surface, executorA, new InterfaceC16068a() { // from class: U.h
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                aVar.c((o0.g) obj);
            }
        });
        return "provideSurface[request=" + tVar.f47907h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void k(t tVar, Surface surface, com.google.common.util.concurrent.q qVar, o0 o0Var) {
        tVar.getClass();
        P.a("TextureViewImpl", "Safe to release surface.");
        tVar.o();
        surface.release();
        if (tVar.f47906g == qVar) {
            tVar.f47906g = null;
        }
        if (tVar.f47907h == o0Var) {
            tVar.f47907h = null;
        }
    }

    @Override // androidx.camera.view.i
    void d() {
        p();
    }

    @Override // androidx.camera.view.i
    void g(final o0 o0Var, i.a aVar) {
        this.f47870a = o0Var.o();
        this.f47911l = aVar;
        n();
        o0 o0Var2 = this.f47907h;
        if (o0Var2 != null) {
            o0Var2.v();
        }
        this.f47907h = o0Var;
        o0Var.j(Z1.b.h(this.f47904e.getContext()), new Runnable() { // from class: androidx.camera.view.p
            @Override // java.lang.Runnable
            public final void run() {
                t.l(this.f47895a, o0Var);
            }
        });
        q();
    }
}
