package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.b;
import androidx.media3.exoplayer.video.spherical.h;
import d3.C13599a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import w3.InterfaceC17822a;

/* loaded from: classes.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f57411m = 0;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f57412a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f57413b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f57414c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.video.spherical.b f57415d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f57416e;

    /* renamed from: f, reason: collision with root package name */
    private final h f57417f;

    /* renamed from: g, reason: collision with root package name */
    private final g f57418g;

    /* renamed from: h, reason: collision with root package name */
    private SurfaceTexture f57419h;

    /* renamed from: i, reason: collision with root package name */
    private Surface f57420i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57421j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f57422k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57423l;

    final class a implements GLSurfaceView.Renderer, h.a, b.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f57424a;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f57427d;

        /* renamed from: e, reason: collision with root package name */
        private final float[] f57428e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f57429f;

        /* renamed from: g, reason: collision with root package name */
        private float f57430g;

        /* renamed from: h, reason: collision with root package name */
        private float f57431h;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f57425b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        private final float[] f57426c = new float[16];

        /* renamed from: i, reason: collision with root package name */
        private final float[] f57432i = new float[16];

        /* renamed from: j, reason: collision with root package name */
        private final float[] f57433j = new float[16];

        @Override // androidx.media3.exoplayer.video.spherical.b.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f57427d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f57431h = -f10;
            d();
        }

        @Override // androidx.media3.exoplayer.video.spherical.h.a
        public synchronized void b(PointF pointF) {
            this.f57430g = pointF.y;
            d();
            Matrix.setRotateM(this.f57429f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f57433j, 0, this.f57427d, 0, this.f57429f, 0);
                Matrix.multiplyMM(this.f57432i, 0, this.f57428e, 0, this.f57433j, 0);
            }
            Matrix.multiplyMM(this.f57426c, 0, this.f57425b, 0, this.f57432i, 0);
            this.f57424a.c(this.f57426c, false);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f57425b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.e(this.f57424a.e());
        }

        public a(g gVar) {
            float[] fArr = new float[16];
            this.f57427d = fArr;
            float[] fArr2 = new float[16];
            this.f57428e = fArr2;
            float[] fArr3 = new float[16];
            this.f57429f = fArr3;
            this.f57424a = gVar;
            GlUtil.k(fArr);
            GlUtil.k(fArr2);
            GlUtil.k(fArr3);
            this.f57431h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f57428e, 0, -this.f57430g, (float) Math.cos(this.f57431h), (float) Math.sin(this.f57431h), 0.0f);
        }

        @Override // androidx.media3.exoplayer.video.spherical.h.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }
    }

    public interface b {
        void B(Surface surface);

        void D(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f57422k = false;
        h();
        super.onPause();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57412a = new CopyOnWriteArrayList<>();
        this.f57416e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C13599a.e(context.getSystemService("sensor"));
        this.f57413b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f57414c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        g gVar = new g();
        this.f57418g = gVar;
        a aVar = new a(gVar);
        h hVar = new h(context, aVar, 25.0f);
        this.f57417f = hVar;
        this.f57415d = new androidx.media3.exoplayer.video.spherical.b(((WindowManager) C13599a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), hVar, aVar);
        this.f57421j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(hVar);
    }

    public static /* synthetic */ void a(SphericalGLSurfaceView sphericalGLSurfaceView) {
        Surface surface = sphericalGLSurfaceView.f57420i;
        if (surface != null) {
            Iterator<b> it = sphericalGLSurfaceView.f57412a.iterator();
            while (it.hasNext()) {
                it.next().B(surface);
            }
        }
        f(sphericalGLSurfaceView.f57419h, surface);
        sphericalGLSurfaceView.f57419h = null;
        sphericalGLSurfaceView.f57420i = null;
    }

    public static /* synthetic */ void b(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f57419h;
        Surface surface = sphericalGLSurfaceView.f57420i;
        Surface surface2 = new Surface(surfaceTexture);
        sphericalGLSurfaceView.f57419h = surfaceTexture;
        sphericalGLSurfaceView.f57420i = surface2;
        Iterator<b> it = sphericalGLSurfaceView.f57412a.iterator();
        while (it.hasNext()) {
            it.next().D(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f57416e.post(new Runnable() { // from class: w3.d
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.b(this.f166869a, surfaceTexture);
            }
        });
    }

    private static void f(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void h() {
        boolean z10 = this.f57421j && this.f57422k;
        Sensor sensor = this.f57414c;
        if (sensor == null || z10 == this.f57423l) {
            return;
        }
        if (z10) {
            this.f57413b.registerListener(this.f57415d, sensor, 0);
        } else {
            this.f57413b.unregisterListener(this.f57415d);
        }
        this.f57423l = z10;
    }

    public void d(b bVar) {
        this.f57412a.add(bVar);
    }

    public void g(b bVar) {
        this.f57412a.remove(bVar);
    }

    public InterfaceC17822a getCameraMotionListener() {
        return this.f57418g;
    }

    public v3.h getVideoFrameMetadataListener() {
        return this.f57418g;
    }

    public Surface getVideoSurface() {
        return this.f57420i;
    }

    public void setDefaultStereoMode(int i10) {
        this.f57418g.g(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f57421j = z10;
        h();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57416e.post(new Runnable() { // from class: w3.c
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.a(this.f166868a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f57422k = true;
        h();
    }
}
