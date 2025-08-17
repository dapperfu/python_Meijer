package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
final class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f57215a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f57216b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f57217c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f57218d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private final Display f57219e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f57220f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f57221g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f57216b);
        SensorManager.getOrientation(this.f57216b, this.f57218d);
        return this.f57218d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f57220f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f57221g) {
            androidx.media3.exoplayer.video.spherical.a.a(this.f57217c, fArr);
            this.f57221g = true;
        }
        float[] fArr2 = this.f57216b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f57216b, 0, this.f57217c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f57216b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f57216b, i11, i12, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f57215a, sensorEvent.values);
        d(this.f57215a, this.f57219e.getRotation());
        float fA = a(this.f57215a);
        e(this.f57215a);
        c(this.f57215a);
        b(this.f57215a, fA);
    }

    public b(Display display, a... aVarArr) {
        this.f57219e = display;
        this.f57220f = aVarArr;
    }
}
