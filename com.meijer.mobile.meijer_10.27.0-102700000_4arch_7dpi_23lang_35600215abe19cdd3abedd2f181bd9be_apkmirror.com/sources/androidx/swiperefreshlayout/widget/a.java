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
    private static final Interpolator f58765g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    private static final Interpolator f58766h = new Q2.b();

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f58767i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    private final c f58768a;

    /* renamed from: b, reason: collision with root package name */
    private float f58769b;

    /* renamed from: c, reason: collision with root package name */
    private Resources f58770c;

    /* renamed from: d, reason: collision with root package name */
    private Animator f58771d;

    /* renamed from: e, reason: collision with root package name */
    float f58772e;

    /* renamed from: f, reason: collision with root package name */
    boolean f58773f;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    class C1152a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f58774a;

        C1152a(c cVar) {
            this.f58774a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.n(fFloatValue, this.f58774a);
            a.this.b(fFloatValue, this.f58774a, false);
            a.this.invalidateSelf();
        }
    }

    class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f58776a;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        b(c cVar) {
            this.f58776a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            a.this.b(1.0f, this.f58776a, true);
            this.f58776a.A();
            this.f58776a.l();
            a aVar = a.this;
            if (!aVar.f58773f) {
                aVar.f58772e += 1.0f;
                return;
            }
            aVar.f58773f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f58776a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f58772e = 0.0f;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final RectF f58778a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f58779b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f58780c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f58781d;

        /* renamed from: e, reason: collision with root package name */
        float f58782e;

        /* renamed from: f, reason: collision with root package name */
        float f58783f;

        /* renamed from: g, reason: collision with root package name */
        float f58784g;

        /* renamed from: h, reason: collision with root package name */
        float f58785h;

        /* renamed from: i, reason: collision with root package name */
        int[] f58786i;

        /* renamed from: j, reason: collision with root package name */
        int f58787j;

        /* renamed from: k, reason: collision with root package name */
        float f58788k;

        /* renamed from: l, reason: collision with root package name */
        float f58789l;

        /* renamed from: m, reason: collision with root package name */
        float f58790m;

        /* renamed from: n, reason: collision with root package name */
        boolean f58791n;

        /* renamed from: o, reason: collision with root package name */
        Path f58792o;

        /* renamed from: p, reason: collision with root package name */
        float f58793p;

        /* renamed from: q, reason: collision with root package name */
        float f58794q;

        /* renamed from: r, reason: collision with root package name */
        int f58795r;

        /* renamed from: s, reason: collision with root package name */
        int f58796s;

        /* renamed from: t, reason: collision with root package name */
        int f58797t;

        /* renamed from: u, reason: collision with root package name */
        int f58798u;

        void m() {
            this.f58788k = 0.0f;
            this.f58789l = 0.0f;
            this.f58790m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void o(float f10, float f11) {
            this.f58795r = (int) f10;
            this.f58796s = (int) f11;
        }

        void A() {
            this.f58788k = this.f58782e;
            this.f58789l = this.f58783f;
            this.f58790m = this.f58784g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f58778a;
            float f10 = this.f58794q;
            float fMin = (this.f58785h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f58795r * this.f58793p) / 2.0f, this.f58785h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f58782e;
            float f12 = this.f58784g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f58783f + f12) * 360.0f) - f13;
            this.f58779b.setColor(this.f58798u);
            this.f58779b.setAlpha(this.f58797t);
            float f15 = this.f58785h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f58781d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f58779b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f58791n) {
                Path path = this.f58792o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f58792o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f58795r * this.f58793p) / 2.0f;
                this.f58792o.moveTo(0.0f, 0.0f);
                this.f58792o.lineTo(this.f58795r * this.f58793p, 0.0f);
                Path path3 = this.f58792o;
                float f13 = this.f58795r;
                float f14 = this.f58793p;
                path3.lineTo((f13 * f14) / 2.0f, this.f58796s * f14);
                this.f58792o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f58785h / 2.0f));
                this.f58792o.close();
                this.f58780c.setColor(this.f58798u);
                this.f58780c.setAlpha(this.f58797t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f58792o, this.f58780c);
                canvas.restore();
            }
        }

        int c() {
            return this.f58797t;
        }

        float d() {
            return this.f58783f;
        }

        int e() {
            return this.f58786i[f()];
        }

        int f() {
            return (this.f58787j + 1) % this.f58786i.length;
        }

        float g() {
            return this.f58782e;
        }

        int h() {
            return this.f58786i[this.f58787j];
        }

        float i() {
            return this.f58789l;
        }

        float j() {
            return this.f58790m;
        }

        float k() {
            return this.f58788k;
        }

        void n(int i10) {
            this.f58797t = i10;
        }

        void p(float f10) {
            if (f10 != this.f58793p) {
                this.f58793p = f10;
            }
        }

        void q(float f10) {
            this.f58794q = f10;
        }

        void r(int i10) {
            this.f58798u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f58779b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f58787j = i10;
            this.f58798u = this.f58786i[i10];
        }

        void u(int[] iArr) {
            this.f58786i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f58783f = f10;
        }

        void w(float f10) {
            this.f58784g = f10;
        }

        void x(boolean z10) {
            if (this.f58791n != z10) {
                this.f58791n = z10;
            }
        }

        void y(float f10) {
            this.f58782e = f10;
        }

        void z(float f10) {
            this.f58785h = f10;
            this.f58779b.setStrokeWidth(f10);
        }

        c() {
            Paint paint = new Paint();
            this.f58779b = paint;
            Paint paint2 = new Paint();
            this.f58780c = paint2;
            Paint paint3 = new Paint();
            this.f58781d = paint3;
            this.f58782e = 0.0f;
            this.f58783f = 0.0f;
            this.f58784g = 0.0f;
            this.f58785h = 5.0f;
            this.f58793p = 1.0f;
            this.f58797t = l3.f92484c;
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
        return ((((i10 >> 24) & l3.f92484c) + ((int) ((((i11 >> 24) & l3.f92484c) - r0) * f10))) << 24) | ((((i10 >> 16) & l3.f92484c) + ((int) ((((i11 >> 16) & l3.f92484c) - r1) * f10))) << 16) | ((((i10 >> 8) & l3.f92484c) + ((int) ((((i11 >> 8) & l3.f92484c) - r2) * f10))) << 8) | ((i10 & l3.f92484c) + ((int) (f10 * ((i11 & l3.f92484c) - r8))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void h(float f10) {
        this.f58769b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f58768a;
        float f14 = this.f58770c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f58768a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C1152a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f58765g);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f58771d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f58773f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f58766h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f58766h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f58772e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f58768a.x(z10);
        invalidateSelf();
    }

    public void e(float f10) {
        this.f58768a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f58768a.u(iArr);
        this.f58768a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f58768a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f58768a.c();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f58771d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f58768a.y(f10);
        this.f58768a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f58768a.z(f10);
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
        this.f58768a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f58768a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f58771d.cancel();
        this.f58768a.A();
        if (this.f58768a.d() != this.f58768a.g()) {
            this.f58773f = true;
            this.f58771d.setDuration(666L);
            this.f58771d.start();
        } else {
            this.f58768a.t(0);
            this.f58768a.m();
            this.f58771d.setDuration(1332L);
            this.f58771d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f58771d.cancel();
        h(0.0f);
        this.f58768a.x(false);
        this.f58768a.t(0);
        this.f58768a.m();
        invalidateSelf();
    }

    public a(Context context) {
        this.f58770c = ((Context) i.g(context)).getResources();
        c cVar = new c();
        this.f58768a = cVar;
        cVar.u(f58767i);
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
        canvas.rotate(this.f58769b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f58768a.a(canvas, bounds);
        canvas.restore();
    }
}
