package u6;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.medallia.digital.mobilesdk.l3;
import u6.p;

/* renamed from: u6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17230d {

    /* renamed from: a, reason: collision with root package name */
    private float f162691a;

    /* renamed from: b, reason: collision with root package name */
    private float f162692b;

    /* renamed from: c, reason: collision with root package name */
    private float f162693c;

    /* renamed from: d, reason: collision with root package name */
    private int f162694d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f162695e = null;

    public C17230d(float f10, float f11, float f12, int i10) {
        this.f162691a = f10;
        this.f162692b = f11;
        this.f162693c = f12;
        this.f162694d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f162694d) > 0) {
            paint.setShadowLayer(Math.max(this.f162691a, Float.MIN_VALUE), this.f162692b, this.f162693c, this.f162694d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(p.a aVar) {
        if (Color.alpha(this.f162694d) > 0) {
            aVar.f162751d = this;
        } else {
            aVar.f162751d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = q.l(Color.alpha(this.f162694d), l.c(i10, 0, l3.f92484c));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f162691a, Float.MIN_VALUE), this.f162692b, this.f162693c, Color.argb(iL, Color.red(this.f162694d), Color.green(this.f162694d), Color.blue(this.f162694d)));
        }
    }

    public void d(int i10, p.a aVar) {
        C17230d c17230d = new C17230d(this);
        aVar.f162751d = c17230d;
        c17230d.i(i10);
    }

    public int e() {
        return this.f162694d;
    }

    public float f() {
        return this.f162692b;
    }

    public float g() {
        return this.f162693c;
    }

    public float h() {
        return this.f162691a;
    }

    public void i(int i10) {
        this.f162694d = Color.argb(Math.round((Color.alpha(this.f162694d) * l.c(i10, 0, l3.f92484c)) / 255.0f), Color.red(this.f162694d), Color.green(this.f162694d), Color.blue(this.f162694d));
    }

    public boolean j(C17230d c17230d) {
        return this.f162691a == c17230d.f162691a && this.f162692b == c17230d.f162692b && this.f162693c == c17230d.f162693c && this.f162694d == c17230d.f162694d;
    }

    public void k(Matrix matrix) {
        if (this.f162695e == null) {
            this.f162695e = new float[2];
        }
        float[] fArr = this.f162695e;
        fArr[0] = this.f162692b;
        fArr[1] = this.f162693c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f162695e;
        this.f162692b = fArr2[0];
        this.f162693c = fArr2[1];
        this.f162691a = matrix.mapRadius(this.f162691a);
    }

    public C17230d(C17230d c17230d) {
        this.f162691a = 0.0f;
        this.f162692b = 0.0f;
        this.f162693c = 0.0f;
        this.f162694d = 0;
        this.f162691a = c17230d.f162691a;
        this.f162692b = c17230d.f162692b;
        this.f162693c = c17230d.f162693c;
        this.f162694d = c17230d.f162694d;
    }
}
