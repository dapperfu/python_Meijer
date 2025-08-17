package androidx.camera.view;

import C.H;
import C.P;
import C.T;
import C.Y;
import C.o0;
import C.r0;
import F.InterfaceC3627y;
import F.InterfaceC3628z;
import V.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.i;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.core.view.ViewCompat;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private static final c f47572o = c.PERFORMANCE;

    /* renamed from: a, reason: collision with root package name */
    c f47573a;

    /* renamed from: b, reason: collision with root package name */
    i f47574b;

    /* renamed from: c, reason: collision with root package name */
    final ScreenFlashView f47575c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.camera.view.e f47576d;

    /* renamed from: e, reason: collision with root package name */
    boolean f47577e;

    /* renamed from: f, reason: collision with root package name */
    final C5988D<e> f47578f;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference<androidx.camera.view.d> f47579g;

    /* renamed from: h, reason: collision with root package name */
    j f47580h;

    /* renamed from: i, reason: collision with root package name */
    private final V.a f47581i;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC3627y f47582j;

    /* renamed from: k, reason: collision with root package name */
    private MotionEvent f47583k;

    /* renamed from: l, reason: collision with root package name */
    private final b f47584l;

    /* renamed from: m, reason: collision with root package name */
    private final View.OnLayoutChangeListener f47585m;

    /* renamed from: n, reason: collision with root package name */
    final Y.c f47586n;

    class a implements Y.c {
        a() {
        }

        public static /* synthetic */ void c(a aVar, androidx.camera.view.d dVar, InterfaceC3628z interfaceC3628z) {
            if (U.d.a(PreviewView.this.f47579g, dVar, null)) {
                dVar.i(e.IDLE);
            }
            dVar.f();
            interfaceC3628z.n().b(dVar);
        }

        public static /* synthetic */ void d(a aVar, InterfaceC3628z interfaceC3628z, o0 o0Var, o0.h hVar) {
            boolean z10;
            PreviewView previewView;
            i iVar;
            aVar.getClass();
            P.a("PreviewView", "Preview transformation info updated. " + hVar);
            if (interfaceC3628z.i().getLensFacing() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            PreviewView.this.f47576d.r(hVar, o0Var.o(), z10);
            if (hVar.d() != -1 && ((iVar = (previewView = PreviewView.this).f47574b) == null || !(iVar instanceof n))) {
                previewView.f47577e = false;
            } else {
                PreviewView.this.f47577e = true;
            }
            PreviewView.this.d();
        }

        @Override // C.Y.c
        public void a(final o0 o0Var) {
            i nVar;
            if (!G.o.c()) {
                Z1.b.h(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.f47586n.a(o0Var);
                    }
                });
                return;
            }
            P.a("PreviewView", "Surface requested by Preview.");
            final InterfaceC3628z interfaceC3628zL = o0Var.l();
            PreviewView.this.f47582j = interfaceC3628zL.i();
            PreviewView.this.f47580h.c(interfaceC3628zL.c().c());
            o0Var.t(Z1.b.h(PreviewView.this.getContext()), new o0.i() { // from class: androidx.camera.view.g
                @Override // C.o0.i
                public final void a(o0.h hVar) {
                    PreviewView.a.d(this.f47640a, interfaceC3628zL, o0Var, hVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.e(previewView.f47574b, o0Var, previewView.f47573a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.f(o0Var, previewView2.f47573a)) {
                    PreviewView previewView3 = PreviewView.this;
                    nVar = new t(previewView3, previewView3.f47576d);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    nVar = new n(previewView4, previewView4.f47576d);
                }
                previewView2.f47574b = nVar;
            }
            InterfaceC3627y interfaceC3627yI = interfaceC3628zL.i();
            PreviewView previewView5 = PreviewView.this;
            final androidx.camera.view.d dVar = new androidx.camera.view.d(interfaceC3627yI, previewView5.f47578f, previewView5.f47574b);
            PreviewView.this.f47579g.set(dVar);
            interfaceC3628zL.n().a(Z1.b.h(PreviewView.this.getContext()), dVar);
            PreviewView.this.f47574b.g(o0Var, new i.a() { // from class: androidx.camera.view.h
                @Override // androidx.camera.view.i.a
                public final void a() {
                    PreviewView.a.c(this.f47643a, dVar, interfaceC3628zL);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f47575c) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f47575c);
            }
            PreviewView.this.getClass();
        }
    }

    class b implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }

        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i10) {
                return;
            }
            PreviewView.this.d();
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f47592a;

        int e() {
            return this.f47592a;
        }

        c(int i10) {
            this.f47592a = i10;
        }

        static c b(int i10) {
            for (c cVar : values()) {
                if (cVar.f47592a == i10) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f47600a;

        int e() {
            return this.f47600a;
        }

        d(int i10) {
            this.f47600a = i10;
        }

        static d b(int i10) {
            for (d dVar : values()) {
                if (dVar.f47600a == i10) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f47583k = null;
        return super.performClick();
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static boolean e(i iVar, o0 o0Var, c cVar) {
        return (iVar instanceof n) && !f(o0Var, cVar);
    }

    private H.i getScreenFlashInternal() {
        return this.f47575c.getScreenFlash();
    }

    private void setScreenFlashUiInfo(H.i iVar) {
        P.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public AbstractC5985A<e> getPreviewStreamState() {
        return this.f47578f;
    }

    void i() {
        Display display;
        InterfaceC3627y interfaceC3627y;
        if (!this.f47577e || (display = getDisplay()) == null || (interfaceC3627y = this.f47582j) == null) {
            return;
        }
        this.f47576d.o(interfaceC3627y.h(display.getRotation()), display.getRotation());
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f47575c.setBackgroundColor(i10);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public static /* synthetic */ void a(PreviewView previewView, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        previewView.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        previewView.d();
        previewView.b(true);
    }

    private void b(boolean z10) {
        G.o.a();
        getViewPort();
    }

    static boolean f(o0 o0Var, c cVar) {
        boolean z10;
        boolean zEquals = o0Var.l().i().g().equals("androidx.camera.camera2.legacy");
        if (androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z10) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private void g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f47584l, new Handler(Looper.getMainLooper()));
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal != 0) {
            int i10 = 1;
            if (iOrdinal != 1) {
                i10 = 2;
                if (iOrdinal != 2) {
                    i10 = 3;
                    if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                        throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    private void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f47584l);
    }

    @SuppressLint({"WrongConstant"})
    public r0 c(int i10) {
        G.o.a();
        if (getWidth() != 0 && getHeight() != 0) {
            return new r0.a(new Rational(getWidth(), getHeight()), i10).c(getViewPortScaleType()).b(getLayoutDirection()).a();
        }
        return null;
    }

    void d() {
        G.o.a();
        if (this.f47574b != null) {
            i();
            this.f47574b.h();
        }
        this.f47580h.b(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        G.o.a();
        i iVar = this.f47574b;
        if (iVar == null) {
            return null;
        }
        return iVar.a();
    }

    public U.a getController() {
        G.o.a();
        return null;
    }

    public c getImplementationMode() {
        G.o.a();
        return this.f47573a;
    }

    public T getMeteringPointFactory() {
        G.o.a();
        return this.f47580h;
    }

    public X.a getOutputTransform() {
        Matrix matrixJ;
        G.o.a();
        try {
            matrixJ = this.f47576d.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixJ = null;
        }
        Rect rectI = this.f47576d.i();
        if (matrixJ != null && rectI != null) {
            matrixJ.preConcat(G.p.b(rectI));
            if (this.f47574b instanceof t) {
                matrixJ.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                P.l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new X.a(matrixJ, new Size(rectI.width(), rectI.height()));
        }
        P.a("PreviewView", "Transform info is not ready");
        return null;
    }

    public d getScaleType() {
        G.o.a();
        return this.f47576d.g();
    }

    public H.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        G.o.a();
        if (getWidth() != 0 && getHeight() != 0) {
            return this.f47576d.h(new Size(getWidth(), getHeight()), getLayoutDirection());
        }
        return null;
    }

    public Y.c getSurfaceProvider() {
        G.o.a();
        return this.f47586n;
    }

    public r0 getViewPort() {
        G.o.a();
        if (getDisplay() == null) {
            return null;
        }
        return c(getDisplay().getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
        addOnLayoutChangeListener(this.f47585m);
        i iVar = this.f47574b;
        if (iVar != null) {
            iVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f47585m);
        i iVar = this.f47574b;
        if (iVar != null) {
            iVar.e();
        }
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setController(U.a aVar) {
        G.o.a();
        b(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        G.o.a();
        this.f47573a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        G.o.a();
        this.f47576d.q(dVar);
        d();
        b(false);
    }

    public void setScreenFlashWindow(Window window) {
        G.o.a();
        this.f47575c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c cVar = f47572o;
        this.f47573a = cVar;
        androidx.camera.view.e eVar = new androidx.camera.view.e();
        this.f47576d = eVar;
        this.f47577e = true;
        this.f47578f = new C5988D<>(e.IDLE);
        this.f47579g = new AtomicReference<>();
        this.f47580h = new j(eVar);
        this.f47584l = new b();
        this.f47585m = new View.OnLayoutChangeListener() { // from class: U.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                PreviewView.a(this.f35577a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f47586n = new a();
        G.o.a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, U.e.f35579a, i10, i11);
        ViewCompat.k0(this, context, U.e.f35579a, attributeSet, typedArrayObtainStyledAttributes, i10, i11);
        try {
            setScaleType(d.b(typedArrayObtainStyledAttributes.getInteger(U.e.f35581c, eVar.g().e())));
            setImplementationMode(c.b(typedArrayObtainStyledAttributes.getInteger(U.e.f35580b, cVar.e())));
            typedArrayObtainStyledAttributes.recycle();
            this.f47581i = new V.a(context, new a.b() { // from class: U.c
            });
            if (getBackground() == null) {
                setBackgroundColor(Z1.b.c(getContext(), R.color.black));
            }
            ScreenFlashView screenFlashView = new ScreenFlashView(context);
            this.f47575c = screenFlashView;
            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
