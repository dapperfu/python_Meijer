package com.journeyapps.barcodescanner;

import Eg.k;
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
import fh.o;
import fh.p;
import fh.q;
import fh.s;
import gh.g;
import gh.i;
import gh.j;
import gh.l;
import gh.m;
import gh.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class CameraPreview extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    private static final String f90916A = "CameraPreview";

    /* renamed from: a, reason: collision with root package name */
    private g f90917a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f90918b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f90919c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f90920d;

    /* renamed from: e, reason: collision with root package name */
    private SurfaceView f90921e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f90922f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f90923g;

    /* renamed from: h, reason: collision with root package name */
    private p f90924h;

    /* renamed from: i, reason: collision with root package name */
    private int f90925i;

    /* renamed from: j, reason: collision with root package name */
    private List<f> f90926j;

    /* renamed from: k, reason: collision with root package name */
    private m f90927k;

    /* renamed from: l, reason: collision with root package name */
    private i f90928l;

    /* renamed from: m, reason: collision with root package name */
    private q f90929m;

    /* renamed from: n, reason: collision with root package name */
    private q f90930n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f90931o;

    /* renamed from: p, reason: collision with root package name */
    private q f90932p;

    /* renamed from: q, reason: collision with root package name */
    private Rect f90933q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f90934r;

    /* renamed from: s, reason: collision with root package name */
    private q f90935s;

    /* renamed from: t, reason: collision with root package name */
    private double f90936t;

    /* renamed from: u, reason: collision with root package name */
    private gh.q f90937u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f90938v;

    /* renamed from: w, reason: collision with root package name */
    private final SurfaceHolder.Callback f90939w;

    /* renamed from: x, reason: collision with root package name */
    private final Handler.Callback f90940x;

    /* renamed from: y, reason: collision with root package name */
    private o f90941y;

    /* renamed from: z, reason: collision with root package name */
    private final f f90942z;

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
            CameraPreview.this.f90932p = new q(i10, i11);
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
                FS.log_e(CameraPreview.f90916A, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            CameraPreview.this.f90932p = new q(i11, i12);
            CameraPreview.this.C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraPreview.this.f90932p = null;
        }
    }

    class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.f9021j) {
                CameraPreview.this.w((q) message.obj);
                return true;
            }
            if (i10 != k.f9015d) {
                if (i10 != k.f9014c) {
                    return false;
                }
                CameraPreview.this.f90942z.b();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!CameraPreview.this.r()) {
                return false;
            }
            CameraPreview.this.u();
            CameraPreview.this.f90942z.c(exc);
            return false;
        }
    }

    class d implements o {
        d() {
        }

        @Override // fh.o
        public void a(int i10) {
            CameraPreview.this.f90919c.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.a
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
            Iterator it = CameraPreview.this.f90926j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void b() {
            Iterator it = CameraPreview.this.f90926j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void c(Exception exc) {
            Iterator it = CameraPreview.this.f90926j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).c(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void d() {
            Iterator it = CameraPreview.this.f90926j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).d();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void e() {
            Iterator it = CameraPreview.this.f90926j.iterator();
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
        if (this.f90920d) {
            TextureView textureView = new TextureView(getContext());
            this.f90922f = textureView;
            textureView.setSurfaceTextureListener(D());
            addView(this.f90922f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f90921e = surfaceView;
        surfaceView.getHolder().addCallback(this.f90939w);
        addView(this.f90921e);
    }

    private void B(j jVar) {
        if (this.f90923g || this.f90917a == null) {
            return;
        }
        FS.log_i(f90916A, "Starting preview");
        this.f90917a.w(jVar);
        this.f90917a.y();
        this.f90923g = true;
        x();
        this.f90942z.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        Rect rect;
        q qVar = this.f90932p;
        if (qVar == null || this.f90930n == null || (rect = this.f90931o) == null) {
            return;
        }
        if (this.f90921e != null && qVar.equals(new q(rect.width(), this.f90931o.height()))) {
            B(new j(this.f90921e.getHolder()));
            return;
        }
        TextureView textureView = this.f90922f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f90930n != null) {
            this.f90922f.setTransform(l(new q(this.f90922f.getWidth(), this.f90922f.getHeight()), this.f90930n));
        }
        B(new j(this.f90922f.getSurfaceTexture()));
    }

    @TargetApi(14)
    private TextureView.SurfaceTextureListener D() {
        return new a();
    }

    private int getDisplayRotation() {
        return this.f90918b.getDefaultDisplay().getRotation();
    }

    private void j() {
        q qVar;
        m mVar;
        q qVar2 = this.f90929m;
        if (qVar2 == null || (qVar = this.f90930n) == null || (mVar = this.f90927k) == null) {
            this.f90934r = null;
            this.f90933q = null;
            this.f90931o = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = qVar.f131133a;
        int i11 = qVar.f131134b;
        int i12 = qVar2.f131133a;
        int i13 = qVar2.f131134b;
        Rect rectD = mVar.d(qVar);
        if (rectD.width() <= 0 || rectD.height() <= 0) {
            return;
        }
        this.f90931o = rectD;
        this.f90933q = k(new Rect(0, 0, i12, i13), this.f90931o);
        Rect rect = new Rect(this.f90933q);
        Rect rect2 = this.f90931o;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i10) / this.f90931o.width(), (rect.top * i11) / this.f90931o.height(), (rect.right * i10) / this.f90931o.width(), (rect.bottom * i11) / this.f90931o.height());
        this.f90934r = rect3;
        if (rect3.width() > 0 && this.f90934r.height() > 0) {
            this.f90942z.a();
            return;
        }
        this.f90934r = null;
        this.f90933q = null;
        FS.log_w(f90916A, "Preview frame is too small");
    }

    private void m(q qVar) {
        this.f90929m = qVar;
        g gVar = this.f90917a;
        if (gVar == null || gVar.n() != null) {
            return;
        }
        m mVar = new m(getDisplayRotation(), qVar);
        this.f90927k = mVar;
        mVar.e(getPreviewScalingStrategy());
        this.f90917a.u(this.f90927k);
        this.f90917a.m();
        boolean z10 = this.f90938v;
        if (z10) {
            this.f90917a.x(z10);
        }
    }

    private void o() {
        if (this.f90917a != null) {
            FS.log_w(f90916A, "initCamera called twice");
            return;
        }
        g gVarN = n();
        this.f90917a = gVarN;
        gVarN.v(this.f90919c);
        this.f90917a.r();
        this.f90925i = getDisplayRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(q qVar) {
        this.f90930n = qVar;
        if (this.f90929m != null) {
            j();
            requestLayout();
            C();
        }
    }

    public g getCameraInstance() {
        return this.f90917a;
    }

    public i getCameraSettings() {
        return this.f90928l;
    }

    public Rect getFramingRect() {
        return this.f90933q;
    }

    public q getFramingRectSize() {
        return this.f90935s;
    }

    public double getMarginFraction() {
        return this.f90936t;
    }

    public Rect getPreviewFramingRect() {
        return this.f90934r;
    }

    public gh.q getPreviewScalingStrategy() {
        gh.q qVar = this.f90937u;
        return qVar != null ? qVar : this.f90922f != null ? new l() : new n();
    }

    public q getPreviewSize() {
        return this.f90930n;
    }

    public void i(f fVar) {
        this.f90926j.add(fVar);
    }

    protected Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f90935s != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f90935s.f131133a) / 2), Math.max(0, (rect3.height() - this.f90935s.f131134b) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(rect3.width() * this.f90936t, rect3.height() * this.f90936t);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    protected Matrix l(q qVar, q qVar2) {
        float f10;
        float f11 = qVar.f131133a / qVar.f131134b;
        float f12 = qVar2.f131133a / qVar2.f131134b;
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
        int i10 = qVar.f131133a;
        int i11 = qVar.f131134b;
        matrix.postTranslate((i10 - (i10 * f13)) / 2.0f, (i11 - (i11 * f10)) / 2.0f);
        return matrix;
    }

    protected g n() {
        g gVar = new g(getContext());
        gVar.t(this.f90928l);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m(new q(i12 - i10, i13 - i11));
        SurfaceView surfaceView = this.f90921e;
        if (surfaceView == null) {
            TextureView textureView = this.f90922f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f90931o;
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
        return this.f90917a != null;
    }

    public boolean s() {
        g gVar = this.f90917a;
        return gVar == null || gVar.p();
    }

    public void setCameraSettings(i iVar) {
        this.f90928l = iVar;
    }

    public void setFramingRectSize(q qVar) {
        this.f90935s = qVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f90936t = d10;
    }

    public void setPreviewScalingStrategy(gh.q qVar) {
        this.f90937u = qVar;
    }

    public void setTorch(boolean z10) {
        this.f90938v = z10;
        g gVar = this.f90917a;
        if (gVar != null) {
            gVar.x(z10);
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f90920d = z10;
    }

    public boolean t() {
        return this.f90923g;
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90920d = false;
        this.f90923g = false;
        this.f90925i = -1;
        this.f90926j = new ArrayList();
        this.f90928l = new i();
        this.f90933q = null;
        this.f90934r = null;
        this.f90935s = null;
        this.f90936t = 0.1d;
        this.f90937u = null;
        this.f90938v = false;
        this.f90939w = new b();
        this.f90940x = new c();
        this.f90941y = new d();
        this.f90942z = new e();
        p(context, attributeSet, 0, 0);
    }

    private void p(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        q(attributeSet);
        this.f90918b = (WindowManager) context.getSystemService("window");
        this.f90919c = new Handler(this.f90940x);
        this.f90924h = new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (r() && getDisplayRotation() != this.f90925i) {
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
        bundle.putBoolean("torch", this.f90938v);
        return bundle;
    }

    protected void q(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Eg.o.f9038i);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(Eg.o.f9040k, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(Eg.o.f9039j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f90935s = new q(dimension, dimension2);
        }
        this.f90920d = typedArrayObtainStyledAttributes.getBoolean(Eg.o.f9042m, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(Eg.o.f9041l, -1);
        if (integer == 1) {
            this.f90937u = new l();
        } else if (integer == 2) {
            this.f90937u = new n();
        } else if (integer == 3) {
            this.f90937u = new gh.o();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void u() {
        TextureView textureView;
        SurfaceView surfaceView;
        s.a();
        FS.log_d(f90916A, "pause()");
        this.f90925i = -1;
        g gVar = this.f90917a;
        if (gVar != null) {
            gVar.l();
            this.f90917a = null;
            this.f90923g = false;
        } else {
            this.f90919c.sendEmptyMessage(k.f9014c);
        }
        if (this.f90932p == null && (surfaceView = this.f90921e) != null) {
            surfaceView.getHolder().removeCallback(this.f90939w);
        }
        if (this.f90932p == null && (textureView = this.f90922f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f90929m = null;
        this.f90930n = null;
        this.f90934r = null;
        this.f90924h.f();
        this.f90942z.d();
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
        FS.log_d(f90916A, "resume()");
        o();
        if (this.f90932p != null) {
            C();
        } else {
            SurfaceView surfaceView = this.f90921e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f90939w);
            } else {
                TextureView textureView = this.f90922f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        D().onSurfaceTextureAvailable(this.f90922f.getSurfaceTexture(), this.f90922f.getWidth(), this.f90922f.getHeight());
                    } else {
                        this.f90922f.setSurfaceTextureListener(D());
                    }
                }
            }
        }
        requestLayout();
        this.f90924h.e(getContext(), this.f90941y);
    }
}
