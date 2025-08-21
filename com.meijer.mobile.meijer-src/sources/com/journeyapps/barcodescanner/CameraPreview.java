package com.journeyapps.barcodescanner;

import Gg.k;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.fullstory.FS;
import gh.o;
import gh.p;
import gh.q;
import gh.s;
import hh.g;
import hh.i;
import hh.j;
import hh.l;
import hh.m;
import hh.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class CameraPreview extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    private static final String f91755A = "CameraPreview";

    /* renamed from: a, reason: collision with root package name */
    private g f91756a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f91757b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f91758c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f91759d;

    /* renamed from: e, reason: collision with root package name */
    private SurfaceView f91760e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f91761f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f91762g;

    /* renamed from: h, reason: collision with root package name */
    private p f91763h;

    /* renamed from: i, reason: collision with root package name */
    private int f91764i;

    /* renamed from: j, reason: collision with root package name */
    private List<f> f91765j;

    /* renamed from: k, reason: collision with root package name */
    private m f91766k;

    /* renamed from: l, reason: collision with root package name */
    private i f91767l;

    /* renamed from: m, reason: collision with root package name */
    private q f91768m;

    /* renamed from: n, reason: collision with root package name */
    private q f91769n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f91770o;

    /* renamed from: p, reason: collision with root package name */
    private q f91771p;

    /* renamed from: q, reason: collision with root package name */
    private Rect f91772q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f91773r;

    /* renamed from: s, reason: collision with root package name */
    private q f91774s;

    /* renamed from: t, reason: collision with root package name */
    private double f91775t;

    /* renamed from: u, reason: collision with root package name */
    private hh.q f91776u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f91777v;

    /* renamed from: w, reason: collision with root package name */
    private final SurfaceHolder.Callback f91778w;

    /* renamed from: x, reason: collision with root package name */
    private final Handler.Callback f91779x;

    /* renamed from: y, reason: collision with root package name */
    private o f91780y;

    /* renamed from: z, reason: collision with root package name */
    private final f f91781z;

    class a implements TextureView.SurfaceTextureListener {
        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            CameraPreview.this.f91771p = new q(i10, i11);
            CameraPreview.this.C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }
    }

    class b implements SurfaceHolder.Callback {
        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                FS.log_e(CameraPreview.f91755A, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            CameraPreview.this.f91771p = new q(i11, i12);
            CameraPreview.this.C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraPreview.this.f91771p = null;
        }
    }

    class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.f12573j) {
                CameraPreview.this.w((q) message.obj);
                return true;
            }
            if (i10 != k.f12567d) {
                if (i10 != k.f12566c) {
                    return false;
                }
                CameraPreview.this.f91781z.b();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!CameraPreview.this.r()) {
                return false;
            }
            CameraPreview.this.u();
            CameraPreview.this.f91781z.c(exc);
            return false;
        }
    }

    class d implements o {
        d() {
        }

        @Override // gh.o
        public void a(int i10) {
            CameraPreview.this.f91758c.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.a
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreview.this.z();
                }
            }, 250L);
        }
    }

    class e implements f {
        e() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void a() {
            Iterator it = CameraPreview.this.f91765j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void b() {
            Iterator it = CameraPreview.this.f91765j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void c(Exception exc) {
            Iterator it = CameraPreview.this.f91765j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).c(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void d() {
            Iterator it = CameraPreview.this.f91765j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).d();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void e() {
            Iterator it = CameraPreview.this.f91765j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).e();
            }
        }
    }

    public interface f {
        void a();

        void b();

        void c(Exception exc);

        void d();

        void e();
    }

    protected void x() {
    }

    private void A() {
        if (this.f91759d) {
            TextureView textureView = new TextureView(getContext());
            this.f91761f = textureView;
            textureView.setSurfaceTextureListener(D());
            addView(this.f91761f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f91760e = surfaceView;
        surfaceView.getHolder().addCallback(this.f91778w);
        addView(this.f91760e);
    }

    private void B(j jVar) {
        if (this.f91762g || this.f91756a == null) {
            return;
        }
        FS.log_i(f91755A, "Starting preview");
        this.f91756a.w(jVar);
        this.f91756a.y();
        this.f91762g = true;
        x();
        this.f91781z.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        Rect rect;
        q qVar = this.f91771p;
        if (qVar == null || this.f91769n == null || (rect = this.f91770o) == null) {
            return;
        }
        if (this.f91760e != null && qVar.equals(new q(rect.width(), this.f91770o.height()))) {
            B(new j(this.f91760e.getHolder()));
            return;
        }
        TextureView textureView = this.f91761f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f91769n != null) {
            this.f91761f.setTransform(l(new q(this.f91761f.getWidth(), this.f91761f.getHeight()), this.f91769n));
        }
        B(new j(this.f91761f.getSurfaceTexture()));
    }

    @TargetApi(14)
    private TextureView.SurfaceTextureListener D() {
        return new a();
    }

    private int getDisplayRotation() {
        return this.f91757b.getDefaultDisplay().getRotation();
    }

    private void j() {
        q qVar;
        m mVar;
        q qVar2 = this.f91768m;
        if (qVar2 == null || (qVar = this.f91769n) == null || (mVar = this.f91766k) == null) {
            this.f91773r = null;
            this.f91772q = null;
            this.f91770o = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = qVar.f134232a;
        int i11 = qVar.f134233b;
        int i12 = qVar2.f134232a;
        int i13 = qVar2.f134233b;
        Rect rectD = mVar.d(qVar);
        if (rectD.width() <= 0 || rectD.height() <= 0) {
            return;
        }
        this.f91770o = rectD;
        this.f91772q = k(new Rect(0, 0, i12, i13), this.f91770o);
        Rect rect = new Rect(this.f91772q);
        Rect rect2 = this.f91770o;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i10) / this.f91770o.width(), (rect.top * i11) / this.f91770o.height(), (rect.right * i10) / this.f91770o.width(), (rect.bottom * i11) / this.f91770o.height());
        this.f91773r = rect3;
        if (rect3.width() > 0 && this.f91773r.height() > 0) {
            this.f91781z.a();
            return;
        }
        this.f91773r = null;
        this.f91772q = null;
        FS.log_w(f91755A, "Preview frame is too small");
    }

    private void m(q qVar) {
        this.f91768m = qVar;
        g gVar = this.f91756a;
        if (gVar == null || gVar.n() != null) {
            return;
        }
        m mVar = new m(getDisplayRotation(), qVar);
        this.f91766k = mVar;
        mVar.e(getPreviewScalingStrategy());
        this.f91756a.u(this.f91766k);
        this.f91756a.m();
        boolean z10 = this.f91777v;
        if (z10) {
            this.f91756a.x(z10);
        }
    }

    private void o() {
        if (this.f91756a != null) {
            FS.log_w(f91755A, "initCamera called twice");
            return;
        }
        g gVarN = n();
        this.f91756a = gVarN;
        gVarN.v(this.f91758c);
        this.f91756a.r();
        this.f91764i = getDisplayRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(q qVar) {
        this.f91769n = qVar;
        if (this.f91768m != null) {
            j();
            requestLayout();
            C();
        }
    }

    public g getCameraInstance() {
        return this.f91756a;
    }

    public i getCameraSettings() {
        return this.f91767l;
    }

    public Rect getFramingRect() {
        return this.f91772q;
    }

    public q getFramingRectSize() {
        return this.f91774s;
    }

    public double getMarginFraction() {
        return this.f91775t;
    }

    public Rect getPreviewFramingRect() {
        return this.f91773r;
    }

    public hh.q getPreviewScalingStrategy() {
        hh.q qVar = this.f91776u;
        return qVar != null ? qVar : this.f91761f != null ? new l() : new n();
    }

    public q getPreviewSize() {
        return this.f91769n;
    }

    public void i(f fVar) {
        this.f91765j.add(fVar);
    }

    protected Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f91774s != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f91774s.f134232a) / 2), Math.max(0, (rect3.height() - this.f91774s.f134233b) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(rect3.width() * this.f91775t, rect3.height() * this.f91775t);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    protected Matrix l(q qVar, q qVar2) {
        float f10;
        float f11 = qVar.f134232a / qVar.f134233b;
        float f12 = qVar2.f134232a / qVar2.f134233b;
        float f13 = 1.0f;
        if (f11 < f12) {
            float f14 = f12 / f11;
            f10 = 1.0f;
            f13 = f14;
        } else {
            f10 = f11 / f12;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f13, f10);
        int i10 = qVar.f134232a;
        int i11 = qVar.f134233b;
        matrix.postTranslate((i10 - (i10 * f13)) / 2.0f, (i11 - (i11 * f10)) / 2.0f);
        return matrix;
    }

    protected g n() {
        g gVar = new g(getContext());
        gVar.t(this.f91767l);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m(new q(i12 - i10, i13 - i11));
        SurfaceView surfaceView = this.f91760e;
        if (surfaceView == null) {
            TextureView textureView = this.f91761f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f91770o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    protected boolean r() {
        return this.f91756a != null;
    }

    public boolean s() {
        g gVar = this.f91756a;
        return gVar == null || gVar.p();
    }

    public void setCameraSettings(i iVar) {
        this.f91767l = iVar;
    }

    public void setFramingRectSize(q qVar) {
        this.f91774s = qVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f91775t = d10;
    }

    public void setPreviewScalingStrategy(hh.q qVar) {
        this.f91776u = qVar;
    }

    public void setTorch(boolean z10) {
        this.f91777v = z10;
        g gVar = this.f91756a;
        if (gVar != null) {
            gVar.x(z10);
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f91759d = z10;
    }

    public boolean t() {
        return this.f91762g;
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91759d = false;
        this.f91762g = false;
        this.f91764i = -1;
        this.f91765j = new ArrayList();
        this.f91767l = new i();
        this.f91772q = null;
        this.f91773r = null;
        this.f91774s = null;
        this.f91775t = 0.1d;
        this.f91776u = null;
        this.f91777v = false;
        this.f91778w = new b();
        this.f91779x = new c();
        this.f91780y = new d();
        this.f91781z = new e();
        p(context, attributeSet, 0, 0);
    }

    private void p(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        q(attributeSet);
        this.f91757b = (WindowManager) context.getSystemService("window");
        this.f91758c = new Handler(this.f91779x);
        this.f91763h = new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (r() && getDisplayRotation() != this.f91764i) {
            u();
            y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.f91777v);
        return bundle;
    }

    protected void q(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Gg.o.f12590i);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(Gg.o.f12592k, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(Gg.o.f12591j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f91774s = new q(dimension, dimension2);
        }
        this.f91759d = typedArrayObtainStyledAttributes.getBoolean(Gg.o.f12594m, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(Gg.o.f12593l, -1);
        if (integer == 1) {
            this.f91776u = new l();
        } else if (integer == 2) {
            this.f91776u = new n();
        } else if (integer == 3) {
            this.f91776u = new hh.o();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void u() {
        TextureView textureView;
        SurfaceView surfaceView;
        s.a();
        FS.log_d(f91755A, "pause()");
        this.f91764i = -1;
        g gVar = this.f91756a;
        if (gVar != null) {
            gVar.l();
            this.f91756a = null;
            this.f91762g = false;
        } else {
            this.f91758c.sendEmptyMessage(k.f12566c);
        }
        if (this.f91771p == null && (surfaceView = this.f91760e) != null) {
            surfaceView.getHolder().removeCallback(this.f91778w);
        }
        if (this.f91771p == null && (textureView = this.f91761f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f91768m = null;
        this.f91769n = null;
        this.f91773r = null;
        this.f91763h.f();
        this.f91781z.d();
    }

    public void v() throws InterruptedException {
        g cameraInstance = getCameraInstance();
        u();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.p() && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public void y() {
        s.a();
        FS.log_d(f91755A, "resume()");
        o();
        if (this.f91771p != null) {
            C();
        } else {
            SurfaceView surfaceView = this.f91760e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f91778w);
            } else {
                TextureView textureView = this.f91761f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        D().onSurfaceTextureAvailable(this.f91761f.getSurfaceTexture(), this.f91761f.getWidth(), this.f91761f.getHeight());
                    } else {
                        this.f91761f.setSurfaceTextureListener(D());
                    }
                }
            }
        }
        requestLayout();
        this.f91763h.e(getContext(), this.f91780y);
    }
}
