package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import o2.i;

/* loaded from: classes4.dex */
public class a extends Drawable implements Animatable, FSDraw {

    /* renamed from: g, reason: collision with root package name */
    private static final Interpolator f58951g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    private static final Interpolator f58952h = new Q2.b();

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f58953i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    private final c f58954a;

    /* renamed from: b, reason: collision with root package name */
    private float f58955b;

    /* renamed from: c, reason: collision with root package name */
    private Resources f58956c;

    /* renamed from: d, reason: collision with root package name */
    private Animator f58957d;

    /* renamed from: e, reason: collision with root package name */
    float f58958e;

    /* renamed from: f, reason: collision with root package name */
    boolean f58959f;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    class C1162a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f58960a;

        C1162a(c cVar) {
            this.f58960a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.n(fFloatValue, this.f58960a);
            a.this.b(fFloatValue, this.f58960a, false);
            a.this.invalidateSelf();
        }
    }

    class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f58962a;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        b(c cVar) {
            this.f58962a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            a.this.b(1.0f, this.f58962a, true);
            this.f58962a.A();
            this.f58962a.l();
            a aVar = a.this;
            if (!aVar.f58959f) {
                aVar.f58958e += 1.0f;
                return;
            }
            aVar.f58959f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f58962a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f58958e = 0.0f;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final RectF f58964a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f58965b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f58966c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f58967d;

        /* renamed from: e, reason: collision with root package name */
        float f58968e;

        /* renamed from: f, reason: collision with root package name */
        float f58969f;

        /* renamed from: g, reason: collision with root package name */
        float f58970g;

        /* renamed from: h, reason: collision with root package name */
        float f58971h;

        /* renamed from: i, reason: collision with root package name */
        int[] f58972i;

        /* renamed from: j, reason: collision with root package name */
        int f58973j;

        /* renamed from: k, reason: collision with root package name */
        float f58974k;

        /* renamed from: l, reason: collision with root package name */
        float f58975l;

        /* renamed from: m, reason: collision with root package name */
        float f58976m;

        /* renamed from: n, reason: collision with root package name */
        boolean f58977n;

        /* renamed from: o, reason: collision with root package name */
        Path f58978o;

        /* renamed from: p, reason: collision with root package name */
        float f58979p;

        /* renamed from: q, reason: collision with root package name */
        float f58980q;

        /* renamed from: r, reason: collision with root package name */
        int f58981r;

        /* renamed from: s, reason: collision with root package name */
        int f58982s;

        /* renamed from: t, reason: collision with root package name */
        int f58983t;

        /* renamed from: u, reason: collision with root package name */
        int f58984u;

        void m() {
            this.f58974k = 0.0f;
            this.f58975l = 0.0f;
            this.f58976m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void o(float f10, float f11) {
            this.f58981r = (int) f10;
            this.f58982s = (int) f11;
        }

        void A() {
            this.f58974k = this.f58968e;
            this.f58975l = this.f58969f;
            this.f58976m = this.f58970g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f58964a;
            float f10 = this.f58980q;
            float fMin = (this.f58971h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f58981r * this.f58979p) / 2.0f, this.f58971h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f58968e;
            float f12 = this.f58970g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f58969f + f12) * 360.0f) - f13;
            this.f58965b.setColor(this.f58984u);
            this.f58965b.setAlpha(this.f58983t);
            float f15 = this.f58971h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f58967d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f58965b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f58977n) {
                Path path = this.f58978o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f58978o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f58981r * this.f58979p) / 2.0f;
                this.f58978o.moveTo(0.0f, 0.0f);
                this.f58978o.lineTo(this.f58981r * this.f58979p, 0.0f);
                Path path3 = this.f58978o;
                float f13 = this.f58981r;
                float f14 = this.f58979p;
                path3.lineTo((f13 * f14) / 2.0f, this.f58982s * f14);
                this.f58978o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f58971h / 2.0f));
                this.f58978o.close();
                this.f58966c.setColor(this.f58984u);
                this.f58966c.setAlpha(this.f58983t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f58978o, this.f58966c);
                canvas.restore();
            }
        }

        int c() {
            return this.f58983t;
        }

        float d() {
            return this.f58969f;
        }

        int e() {
            return this.f58972i[f()];
        }

        int f() {
            return (this.f58973j + 1) % this.f58972i.length;
        }

        float g() {
            return this.f58968e;
        }

        int h() {
            return this.f58972i[this.f58973j];
        }

        float i() {
            return this.f58975l;
        }

        float j() {
            return this.f58976m;
        }

        float k() {
            return this.f58974k;
        }

        void n(int i10) {
            this.f58983t = i10;
        }

        void p(float f10) {
            if (f10 != this.f58979p) {
                this.f58979p = f10;
            }
        }

        void q(float f10) {
            this.f58980q = f10;
        }

        void r(int i10) {
            this.f58984u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f58965b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f58973j = i10;
            this.f58984u = this.f58972i[i10];
        }

        void u(int[] iArr) {
            this.f58972i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f58969f = f10;
        }

        void w(float f10) {
            this.f58970g = f10;
        }

        void x(boolean z10) {
            if (this.f58977n != z10) {
                this.f58977n = z10;
            }
        }

        void y(float f10) {
            this.f58968e = f10;
        }

        void z(float f10) {
            this.f58971h = f10;
            this.f58965b.setStrokeWidth(f10);
        }

        c() {
            Paint paint = new Paint();
            this.f58965b = paint;
            Paint paint2 = new Paint();
            this.f58966c = paint2;
            Paint paint3 = new Paint();
            this.f58967d = paint3;
            this.f58968e = 0.0f;
            this.f58969f = 0.0f;
            this.f58970g = 0.0f;
            this.f58971h = 5.0f;
            this.f58979p = 1.0f;
            this.f58983t = l3.f93323c;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void l() {
            t(f());
        }
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & l3.f93323c) + ((int) ((((i11 >> 24) & l3.f93323c) - r0) * f10))) << 24) | ((((i10 >> 16) & l3.f93323c) + ((int) ((((i11 >> 16) & l3.f93323c) - r1) * f10))) << 16) | ((((i10 >> 8) & l3.f93323c) + ((int) ((((i11 >> 8) & l3.f93323c) - r2) * f10))) << 8) | ((i10 & l3.f93323c) + ((int) (f10 * ((i11 & l3.f93323c) - r8))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void h(float f10) {
        this.f58955b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f58954a;
        float f14 = this.f58956c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f58954a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C1162a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f58951g);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f58957d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f58959f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f58952h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f58952h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f58958e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f58954a.x(z10);
        invalidateSelf();
    }

    public void e(float f10) {
        this.f58954a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f58954a.u(iArr);
        this.f58954a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f58954a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f58954a.c();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f58957d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f58954a.y(f10);
        this.f58954a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f58954a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f58954a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f58954a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f58957d.cancel();
        this.f58954a.A();
        if (this.f58954a.d() != this.f58954a.g()) {
            this.f58959f = true;
            this.f58957d.setDuration(666L);
            this.f58957d.start();
        } else {
            this.f58954a.t(0);
            this.f58954a.m();
            this.f58957d.setDuration(1332L);
            this.f58957d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f58957d.cancel();
        h(0.0f);
        this.f58954a.x(false);
        this.f58954a.t(0);
        this.f58954a.m();
        invalidateSelf();
    }

    public a(Context context) {
        this.f58956c = ((Context) i.g(context)).getResources();
        c cVar = new c();
        this.f58954a = cVar;
        cVar.u(f58953i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f58955b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f58954a.a(canvas, bounds);
        canvas.restore();
    }
}
