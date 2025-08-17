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
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
final class t extends i {

    /* renamed from: e, reason: collision with root package name */
    TextureView f47680e;

    /* renamed from: f, reason: collision with root package name */
    SurfaceTexture f47681f;

    /* renamed from: g, reason: collision with root package name */
    com.google.common.util.concurrent.q<o0.g> f47682g;

    /* renamed from: h, reason: collision with root package name */
    o0 f47683h;

    /* renamed from: i, reason: collision with root package name */
    boolean f47684i;

    /* renamed from: j, reason: collision with root package name */
    SurfaceTexture f47685j;

    /* renamed from: k, reason: collision with root package name */
    AtomicReference<c.a<Void>> f47686k;

    /* renamed from: l, reason: collision with root package name */
    i.a f47687l;

    /* renamed from: m, reason: collision with root package name */
    Executor f47688m;

    class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.t$a$a, reason: collision with other inner class name */
        class C0967a implements I.c<o0.g> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f47690a;

            C0967a(SurfaceTexture surfaceTexture) {
                this.f47690a = surfaceTexture;
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
                this.f47690a.release();
                t tVar = t.this;
                if (tVar.f47685j != null) {
                    tVar.f47685j = null;
                }
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            P.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            t tVar = t.this;
            tVar.f47681f = surfaceTexture;
            if (tVar.f47682g == null) {
                tVar.q();
                return;
            }
            o2.i.g(tVar.f47683h);
            P.a("TextureViewImpl", "Surface invalidated " + t.this.f47683h);
            t.this.f47683h.m().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            t tVar = t.this;
            tVar.f47681f = null;
            com.google.common.util.concurrent.q<o0.g> qVar = tVar.f47682g;
            if (qVar == null) {
                P.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            I.n.j(qVar, new C0967a(surfaceTexture), Z1.b.h(t.this.f47680e.getContext()));
            t.this.f47685j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            P.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a<Void> andSet = t.this.f47686k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            t.this.getClass();
            Executor executor = t.this.f47688m;
        }
    }

    @Override // androidx.camera.view.i
    void e() {
        this.f47684i = true;
    }

    public static /* synthetic */ void l(t tVar, o0 o0Var) {
        o0 o0Var2 = tVar.f47683h;
        if (o0Var2 != null && o0Var2 == o0Var) {
            tVar.f47683h = null;
            tVar.f47682g = null;
        }
        tVar.o();
    }

    public static /* synthetic */ Object m(t tVar, c.a aVar) {
        tVar.f47686k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void o() {
        i.a aVar = this.f47687l;
        if (aVar != null) {
            aVar.a();
            this.f47687l = null;
        }
    }

    private void p() {
        if (!this.f47684i || this.f47685j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f47680e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f47685j;
        if (surfaceTexture != surfaceTexture2) {
            this.f47680e.setSurfaceTexture(surfaceTexture2);
            this.f47685j = null;
            this.f47684i = false;
        }
    }

    @Override // androidx.camera.view.i
    View b() {
        return this.f47680e;
    }

    @Override // androidx.camera.view.i
    Bitmap c() {
        TextureView textureView = this.f47680e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f47680e.getBitmap();
    }

    @Override // androidx.camera.view.i
    com.google.common.util.concurrent.q<Void> i() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: androidx.camera.view.q
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return t.m(this.f47673a, aVar);
            }
        });
    }

    public void n() {
        o2.i.g(this.f47647b);
        o2.i.g(this.f47646a);
        TextureView textureView = new TextureView(this.f47647b.getContext());
        this.f47680e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f47646a.getWidth(), this.f47646a.getHeight()));
        this.f47680e.setSurfaceTextureListener(new a());
        this.f47647b.removeAllViews();
        this.f47647b.addView(this.f47680e);
    }

    void q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f47646a;
        if (size == null || (surfaceTexture = this.f47681f) == null || this.f47683h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f47646a.getHeight());
        final Surface surface = new Surface(this.f47681f);
        final o0 o0Var = this.f47683h;
        final com.google.common.util.concurrent.q<o0.g> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: androidx.camera.view.r
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return t.j(this.f47674a, surface, aVar);
            }
        });
        this.f47682g = qVarA;
        qVarA.addListener(new Runnable() { // from class: androidx.camera.view.s
            @Override // java.lang.Runnable
            public final void run() {
                t.k(this.f47676a, surface, qVarA, o0Var);
            }
        }, Z1.b.h(this.f47680e.getContext()));
        f();
    }

    t(FrameLayout frameLayout, e eVar) {
        super(frameLayout, eVar);
        this.f47684i = false;
        this.f47686k = new AtomicReference<>();
    }

    public static /* synthetic */ Object j(t tVar, Surface surface, final c.a aVar) throws ExecutionException, InterruptedException {
        tVar.getClass();
        P.a("TextureViewImpl", "Surface set on Preview.");
        o0 o0Var = tVar.f47683h;
        Executor executorA = H.a.a();
        Objects.requireNonNull(aVar);
        o0Var.s(surface, executorA, new InterfaceC15993a() { // from class: U.h
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                aVar.c((o0.g) obj);
            }
        });
        return "provideSurface[request=" + tVar.f47683h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void k(t tVar, Surface surface, com.google.common.util.concurrent.q qVar, o0 o0Var) {
        tVar.getClass();
        P.a("TextureViewImpl", "Safe to release surface.");
        tVar.o();
        surface.release();
        if (tVar.f47682g == qVar) {
            tVar.f47682g = null;
        }
        if (tVar.f47683h == o0Var) {
            tVar.f47683h = null;
        }
    }

    @Override // androidx.camera.view.i
    void d() {
        p();
    }

    @Override // androidx.camera.view.i
    void g(final o0 o0Var, i.a aVar) {
        this.f47646a = o0Var.o();
        this.f47687l = aVar;
        n();
        o0 o0Var2 = this.f47683h;
        if (o0Var2 != null) {
            o0Var2.v();
        }
        this.f47683h = o0Var;
        o0Var.j(Z1.b.h(this.f47680e.getContext()), new Runnable() { // from class: androidx.camera.view.p
            @Override // java.lang.Runnable
            public final void run() {
                t.l(this.f47671a, o0Var);
            }
        });
        q();
    }
}
