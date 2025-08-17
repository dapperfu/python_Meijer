package v6;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import g6.C14209i;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17512a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C14209i f164560a;

    /* renamed from: b, reason: collision with root package name */
    public final T f164561b;

    /* renamed from: c, reason: collision with root package name */
    public T f164562c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f164563d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f164564e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f164565f;

    /* renamed from: g, reason: collision with root package name */
    public final float f164566g;

    /* renamed from: h, reason: collision with root package name */
    public Float f164567h;

    /* renamed from: i, reason: collision with root package name */
    private float f164568i;

    /* renamed from: j, reason: collision with root package name */
    private float f164569j;

    /* renamed from: k, reason: collision with root package name */
    private int f164570k;

    /* renamed from: l, reason: collision with root package name */
    private int f164571l;

    /* renamed from: m, reason: collision with root package name */
    private float f164572m;

    /* renamed from: n, reason: collision with root package name */
    private float f164573n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f164574o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f164575p;

    public C17512a(C14209i c14209i, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f164568i = -3987645.8f;
        this.f164569j = -3987645.8f;
        this.f164570k = 784923401;
        this.f164571l = 784923401;
        this.f164572m = Float.MIN_VALUE;
        this.f164573n = Float.MIN_VALUE;
        this.f164574o = null;
        this.f164575p = null;
        this.f164560a = c14209i;
        this.f164561b = t10;
        this.f164562c = t11;
        this.f164563d = interpolator;
        this.f164564e = null;
        this.f164565f = null;
        this.f164566g = f10;
        this.f164567h = f11;
    }

    public C17512a<T> b(T t10, T t11) {
        return new C17512a<>(t10, t11);
    }

    public float c() {
        if (this.f164560a == null) {
            return 1.0f;
        }
        if (this.f164573n == Float.MIN_VALUE) {
            if (this.f164567h == null) {
                this.f164573n = 1.0f;
            } else {
                this.f164573n = (float) (f() + ((this.f164567h.floatValue() - this.f164566g) / this.f164560a.e()));
            }
        }
        return this.f164573n;
    }

    public float d() {
        if (this.f164569j == -3987645.8f) {
            this.f164569j = ((Float) this.f164562c).floatValue();
        }
        return this.f164569j;
    }

    public int e() {
        if (this.f164571l == 784923401) {
            this.f164571l = ((Integer) this.f164562c).intValue();
        }
        return this.f164571l;
    }

    public float f() {
        C14209i c14209i = this.f164560a;
        if (c14209i == null) {
            return 0.0f;
        }
        if (this.f164572m == Float.MIN_VALUE) {
            this.f164572m = (this.f164566g - c14209i.p()) / this.f164560a.e();
        }
        return this.f164572m;
    }

    public float g() {
        if (this.f164568i == -3987645.8f) {
            this.f164568i = ((Float) this.f164561b).floatValue();
        }
        return this.f164568i;
    }

    public int h() {
        if (this.f164570k == 784923401) {
            this.f164570k = ((Integer) this.f164561b).intValue();
        }
        return this.f164570k;
    }

    public boolean i() {
        return this.f164563d == null && this.f164564e == null && this.f164565f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f164561b + ", endValue=" + this.f164562c + ", startFrame=" + this.f164566g + ", endFrame=" + this.f164567h + ", interpolator=" + this.f164563d + '}';
    }

    public boolean a(float f10) {
        if (f10 >= f() && f10 < c()) {
            return true;
        }
        return false;
    }

    public C17512a(C14209i c14209i, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f164568i = -3987645.8f;
        this.f164569j = -3987645.8f;
        this.f164570k = 784923401;
        this.f164571l = 784923401;
        this.f164572m = Float.MIN_VALUE;
        this.f164573n = Float.MIN_VALUE;
        this.f164574o = null;
        this.f164575p = null;
        this.f164560a = c14209i;
        this.f164561b = t10;
        this.f164562c = t11;
        this.f164563d = null;
        this.f164564e = interpolator;
        this.f164565f = interpolator2;
        this.f164566g = f10;
        this.f164567h = f11;
    }

    protected C17512a(C14209i c14209i, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f164568i = -3987645.8f;
        this.f164569j = -3987645.8f;
        this.f164570k = 784923401;
        this.f164571l = 784923401;
        this.f164572m = Float.MIN_VALUE;
        this.f164573n = Float.MIN_VALUE;
        this.f164574o = null;
        this.f164575p = null;
        this.f164560a = c14209i;
        this.f164561b = t10;
        this.f164562c = t11;
        this.f164563d = interpolator;
        this.f164564e = interpolator2;
        this.f164565f = interpolator3;
        this.f164566g = f10;
        this.f164567h = f11;
    }

    public C17512a(T t10) {
        this.f164568i = -3987645.8f;
        this.f164569j = -3987645.8f;
        this.f164570k = 784923401;
        this.f164571l = 784923401;
        this.f164572m = Float.MIN_VALUE;
        this.f164573n = Float.MIN_VALUE;
        this.f164574o = null;
        this.f164575p = null;
        this.f164560a = null;
        this.f164561b = t10;
        this.f164562c = t10;
        this.f164563d = null;
        this.f164564e = null;
        this.f164565f = null;
        this.f164566g = Float.MIN_VALUE;
        this.f164567h = Float.valueOf(Float.MAX_VALUE);
    }

    private C17512a(T t10, T t11) {
        this.f164568i = -3987645.8f;
        this.f164569j = -3987645.8f;
        this.f164570k = 784923401;
        this.f164571l = 784923401;
        this.f164572m = Float.MIN_VALUE;
        this.f164573n = Float.MIN_VALUE;
        this.f164574o = null;
        this.f164575p = null;
        this.f164560a = null;
        this.f164561b = t10;
        this.f164562c = t11;
        this.f164563d = null;
        this.f164564e = null;
        this.f164565f = null;
        this.f164566g = Float.MIN_VALUE;
        this.f164567h = Float.valueOf(Float.MAX_VALUE);
    }
}
