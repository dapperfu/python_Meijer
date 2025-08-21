package w6;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import h6.C14478i;

/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17845a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C14478i f166944a;

    /* renamed from: b, reason: collision with root package name */
    public final T f166945b;

    /* renamed from: c, reason: collision with root package name */
    public T f166946c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f166947d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f166948e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f166949f;

    /* renamed from: g, reason: collision with root package name */
    public final float f166950g;

    /* renamed from: h, reason: collision with root package name */
    public Float f166951h;

    /* renamed from: i, reason: collision with root package name */
    private float f166952i;

    /* renamed from: j, reason: collision with root package name */
    private float f166953j;

    /* renamed from: k, reason: collision with root package name */
    private int f166954k;

    /* renamed from: l, reason: collision with root package name */
    private int f166955l;

    /* renamed from: m, reason: collision with root package name */
    private float f166956m;

    /* renamed from: n, reason: collision with root package name */
    private float f166957n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f166958o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f166959p;

    public C17845a(C14478i c14478i, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f166952i = -3987645.8f;
        this.f166953j = -3987645.8f;
        this.f166954k = 784923401;
        this.f166955l = 784923401;
        this.f166956m = Float.MIN_VALUE;
        this.f166957n = Float.MIN_VALUE;
        this.f166958o = null;
        this.f166959p = null;
        this.f166944a = c14478i;
        this.f166945b = t10;
        this.f166946c = t11;
        this.f166947d = interpolator;
        this.f166948e = null;
        this.f166949f = null;
        this.f166950g = f10;
        this.f166951h = f11;
    }

    public C17845a<T> b(T t10, T t11) {
        return new C17845a<>(t10, t11);
    }

    public float c() {
        if (this.f166944a == null) {
            return 1.0f;
        }
        if (this.f166957n == Float.MIN_VALUE) {
            if (this.f166951h == null) {
                this.f166957n = 1.0f;
            } else {
                this.f166957n = (float) (f() + ((this.f166951h.floatValue() - this.f166950g) / this.f166944a.e()));
            }
        }
        return this.f166957n;
    }

    public float d() {
        if (this.f166953j == -3987645.8f) {
            this.f166953j = ((Float) this.f166946c).floatValue();
        }
        return this.f166953j;
    }

    public int e() {
        if (this.f166955l == 784923401) {
            this.f166955l = ((Integer) this.f166946c).intValue();
        }
        return this.f166955l;
    }

    public float f() {
        C14478i c14478i = this.f166944a;
        if (c14478i == null) {
            return 0.0f;
        }
        if (this.f166956m == Float.MIN_VALUE) {
            this.f166956m = (this.f166950g - c14478i.p()) / this.f166944a.e();
        }
        return this.f166956m;
    }

    public float g() {
        if (this.f166952i == -3987645.8f) {
            this.f166952i = ((Float) this.f166945b).floatValue();
        }
        return this.f166952i;
    }

    public int h() {
        if (this.f166954k == 784923401) {
            this.f166954k = ((Integer) this.f166945b).intValue();
        }
        return this.f166954k;
    }

    public boolean i() {
        return this.f166947d == null && this.f166948e == null && this.f166949f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f166945b + ", endValue=" + this.f166946c + ", startFrame=" + this.f166950g + ", endFrame=" + this.f166951h + ", interpolator=" + this.f166947d + '}';
    }

    public boolean a(float f10) {
        if (f10 >= f() && f10 < c()) {
            return true;
        }
        return false;
    }

    public C17845a(C14478i c14478i, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f166952i = -3987645.8f;
        this.f166953j = -3987645.8f;
        this.f166954k = 784923401;
        this.f166955l = 784923401;
        this.f166956m = Float.MIN_VALUE;
        this.f166957n = Float.MIN_VALUE;
        this.f166958o = null;
        this.f166959p = null;
        this.f166944a = c14478i;
        this.f166945b = t10;
        this.f166946c = t11;
        this.f166947d = null;
        this.f166948e = interpolator;
        this.f166949f = interpolator2;
        this.f166950g = f10;
        this.f166951h = f11;
    }

    protected C17845a(C14478i c14478i, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f166952i = -3987645.8f;
        this.f166953j = -3987645.8f;
        this.f166954k = 784923401;
        this.f166955l = 784923401;
        this.f166956m = Float.MIN_VALUE;
        this.f166957n = Float.MIN_VALUE;
        this.f166958o = null;
        this.f166959p = null;
        this.f166944a = c14478i;
        this.f166945b = t10;
        this.f166946c = t11;
        this.f166947d = interpolator;
        this.f166948e = interpolator2;
        this.f166949f = interpolator3;
        this.f166950g = f10;
        this.f166951h = f11;
    }

    public C17845a(T t10) {
        this.f166952i = -3987645.8f;
        this.f166953j = -3987645.8f;
        this.f166954k = 784923401;
        this.f166955l = 784923401;
        this.f166956m = Float.MIN_VALUE;
        this.f166957n = Float.MIN_VALUE;
        this.f166958o = null;
        this.f166959p = null;
        this.f166944a = null;
        this.f166945b = t10;
        this.f166946c = t10;
        this.f166947d = null;
        this.f166948e = null;
        this.f166949f = null;
        this.f166950g = Float.MIN_VALUE;
        this.f166951h = Float.valueOf(Float.MAX_VALUE);
    }

    private C17845a(T t10, T t11) {
        this.f166952i = -3987645.8f;
        this.f166953j = -3987645.8f;
        this.f166954k = 784923401;
        this.f166955l = 784923401;
        this.f166956m = Float.MIN_VALUE;
        this.f166957n = Float.MIN_VALUE;
        this.f166958o = null;
        this.f166959p = null;
        this.f166944a = null;
        this.f166945b = t10;
        this.f166946c = t11;
        this.f166947d = null;
        this.f166948e = null;
        this.f166949f = null;
        this.f166950g = Float.MIN_VALUE;
        this.f166951h = Float.valueOf(Float.MAX_VALUE);
    }
}
