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
import d3.C13466a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import w3.InterfaceC17752a;

/* loaded from: classes.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f57187m = 0;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f57188a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f57189b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f57190c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.video.spherical.b f57191d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f57192e;

    /* renamed from: f, reason: collision with root package name */
    private final h f57193f;

    /* renamed from: g, reason: collision with root package name */
    private final g f57194g;

    /* renamed from: h, reason: collision with root package name */
    private SurfaceTexture f57195h;

    /* renamed from: i, reason: collision with root package name */
    private Surface f57196i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57197j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f57198k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57199l;

    final class a implements GLSurfaceView.Renderer, h.a, b.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f57200a;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f57203d;

        /* renamed from: e, reason: collision with root package name */
        private final float[] f57204e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f57205f;

        /* renamed from: g, reason: collision with root package name */
        private float f57206g;

        /* renamed from: h, reason: collision with root package name */
        private float f57207h;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f57201b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        private final float[] f57202c = new float[16];

        /* renamed from: i, reason: collision with root package name */
        private final float[] f57208i = new float[16];

        /* renamed from: j, reason: collision with root package name */
        private final float[] f57209j = new float[16];

        @Override // androidx.media3.exoplayer.video.spherical.b.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f57203d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f57207h = -f10;
            d();
        }

        @Override // androidx.media3.exoplayer.video.spherical.h.a
        public synchronized void b(PointF pointF) {
            this.f57206g = pointF.y;
            d();
            Matrix.setRotateM(this.f57205f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f57209j, 0, this.f57203d, 0, this.f57205f, 0);
                Matrix.multiplyMM(this.f57208i, 0, this.f57204e, 0, this.f57209j, 0);
            }
            Matrix.multiplyMM(this.f57202c, 0, this.f57201b, 0, this.f57208i, 0);
            this.f57200a.c(this.f57202c, false);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f57201b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.e(this.f57200a.e());
        }

        public a(g gVar) {
            float[] fArr = new float[16];
            this.f57203d = fArr;
            float[] fArr2 = new float[16];
            this.f57204e = fArr2;
            float[] fArr3 = new float[16];
            this.f57205f = fArr3;
            this.f57200a = gVar;
            GlUtil.k(fArr);
            GlUtil.k(fArr2);
            GlUtil.k(fArr3);
            this.f57207h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f57204e, 0, -this.f57206g, (float) Math.cos(this.f57207h), (float) Math.sin(this.f57207h), 0.0f);
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
        this.f57198k = false;
        h();
        super.onPause();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57188a = new CopyOnWriteArrayList<>();
        this.f57192e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C13466a.e(context.getSystemService("sensor"));
        this.f57189b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f57190c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        g gVar = new g();
        this.f57194g = gVar;
        a aVar = new a(gVar);
        h hVar = new h(context, aVar, 25.0f);
        this.f57193f = hVar;
        this.f57191d = new androidx.media3.exoplayer.video.spherical.b(((WindowManager) C13466a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), hVar, aVar);
        this.f57197j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(hVar);
    }

    public static /* synthetic */ void a(SphericalGLSurfaceView sphericalGLSurfaceView) {
        Surface surface = sphericalGLSurfaceView.f57196i;
        if (surface != null) {
            Iterator<b> it = sphericalGLSurfaceView.f57188a.iterator();
            while (it.hasNext()) {
                it.next().B(surface);
            }
        }
        f(sphericalGLSurfaceView.f57195h, surface);
        sphericalGLSurfaceView.f57195h = null;
        sphericalGLSurfaceView.f57196i = null;
    }

    public static /* synthetic */ void b(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f57195h;
        Surface surface = sphericalGLSurfaceView.f57196i;
        Surface surface2 = new Surface(surfaceTexture);
        sphericalGLSurfaceView.f57195h = surfaceTexture;
        sphericalGLSurfaceView.f57196i = surface2;
        Iterator<b> it = sphericalGLSurfaceView.f57188a.iterator();
        while (it.hasNext()) {
            it.next().D(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f57192e.post(new Runnable() { // from class: w3.d
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.b(this.f165658a, surfaceTexture);
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
        boolean z10 = this.f57197j && this.f57198k;
        Sensor sensor = this.f57190c;
        if (sensor == null || z10 == this.f57199l) {
            return;
        }
        if (z10) {
            this.f57189b.registerListener(this.f57191d, sensor, 0);
        } else {
            this.f57189b.unregisterListener(this.f57191d);
        }
        this.f57199l = z10;
    }

    public void d(b bVar) {
        this.f57188a.add(bVar);
    }

    public void g(b bVar) {
        this.f57188a.remove(bVar);
    }

    public InterfaceC17752a getCameraMotionListener() {
        return this.f57194g;
    }

    public v3.h getVideoFrameMetadataListener() {
        return this.f57194g;
    }

    public Surface getVideoSurface() {
        return this.f57196i;
    }

    public void setDefaultStereoMode(int i10) {
        this.f57194g.g(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f57197j = z10;
        h();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57192e.post(new Runnable() { // from class: w3.c
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.a(this.f165657a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f57198k = true;
        h();
    }
}
