package n6;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15781a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f151015a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f151016b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f151017c;

    public C15781a() {
        this.f151015a = new PointF();
        this.f151016b = new PointF();
        this.f151017c = new PointF();
    }

    public PointF a() {
        return this.f151015a;
    }

    public PointF b() {
        return this.f151016b;
    }

    public PointF c() {
        return this.f151017c;
    }

    public void d(float f10, float f11) {
        this.f151015a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f151016b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f151017c.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f151017c.x), Float.valueOf(this.f151017c.y), Float.valueOf(this.f151015a.x), Float.valueOf(this.f151015a.y), Float.valueOf(this.f151016b.x), Float.valueOf(this.f151016b.y));
    }

    public C15781a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f151015a = pointF;
        this.f151016b = pointF2;
        this.f151017c = pointF3;
    }
}
