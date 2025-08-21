package o6;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16075a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f153617a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f153618b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f153619c;

    public C16075a() {
        this.f153617a = new PointF();
        this.f153618b = new PointF();
        this.f153619c = new PointF();
    }

    public PointF a() {
        return this.f153617a;
    }

    public PointF b() {
        return this.f153618b;
    }

    public PointF c() {
        return this.f153619c;
    }

    public void d(float f10, float f11) {
        this.f153617a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f153618b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f153619c.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f153619c.x), Float.valueOf(this.f153619c.y), Float.valueOf(this.f153617a.x), Float.valueOf(this.f153617a.y), Float.valueOf(this.f153618b.x), Float.valueOf(this.f153618b.y));
    }

    public C16075a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f153617a = pointF;
        this.f153618b = pointF2;
        this.f153619c = pointF3;
    }
}
