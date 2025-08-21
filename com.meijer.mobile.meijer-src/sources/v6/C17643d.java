package v6;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.medallia.digital.mobilesdk.l3;
import v6.p;

/* renamed from: v6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17643d {

    /* renamed from: a, reason: collision with root package name */
    private float f165620a;

    /* renamed from: b, reason: collision with root package name */
    private float f165621b;

    /* renamed from: c, reason: collision with root package name */
    private float f165622c;

    /* renamed from: d, reason: collision with root package name */
    private int f165623d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f165624e = null;

    public C17643d(float f10, float f11, float f12, int i10) {
        this.f165620a = f10;
        this.f165621b = f11;
        this.f165622c = f12;
        this.f165623d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f165623d) > 0) {
            paint.setShadowLayer(Math.max(this.f165620a, Float.MIN_VALUE), this.f165621b, this.f165622c, this.f165623d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(p.a aVar) {
        if (Color.alpha(this.f165623d) > 0) {
            aVar.f165680d = this;
        } else {
            aVar.f165680d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = q.l(Color.alpha(this.f165623d), l.c(i10, 0, l3.f93323c));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f165620a, Float.MIN_VALUE), this.f165621b, this.f165622c, Color.argb(iL, Color.red(this.f165623d), Color.green(this.f165623d), Color.blue(this.f165623d)));
        }
    }

    public void d(int i10, p.a aVar) {
        C17643d c17643d = new C17643d(this);
        aVar.f165680d = c17643d;
        c17643d.i(i10);
    }

    public int e() {
        return this.f165623d;
    }

    public float f() {
        return this.f165621b;
    }

    public float g() {
        return this.f165622c;
    }

    public float h() {
        return this.f165620a;
    }

    public void i(int i10) {
        this.f165623d = Color.argb(Math.round((Color.alpha(this.f165623d) * l.c(i10, 0, l3.f93323c)) / 255.0f), Color.red(this.f165623d), Color.green(this.f165623d), Color.blue(this.f165623d));
    }

    public boolean j(C17643d c17643d) {
        return this.f165620a == c17643d.f165620a && this.f165621b == c17643d.f165621b && this.f165622c == c17643d.f165622c && this.f165623d == c17643d.f165623d;
    }

    public void k(Matrix matrix) {
        if (this.f165624e == null) {
            this.f165624e = new float[2];
        }
        float[] fArr = this.f165624e;
        fArr[0] = this.f165621b;
        fArr[1] = this.f165622c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f165624e;
        this.f165621b = fArr2[0];
        this.f165622c = fArr2[1];
        this.f165620a = matrix.mapRadius(this.f165620a);
    }

    public C17643d(C17643d c17643d) {
        this.f165620a = 0.0f;
        this.f165621b = 0.0f;
        this.f165622c = 0.0f;
        this.f165623d = 0;
        this.f165620a = c17643d.f165620a;
        this.f165621b = c17643d.f165621b;
        this.f165622c = c17643d.f165622c;
        this.f165623d = c17643d.f165623d;
    }
}
