package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
class j extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f58172D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f58173E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f58174A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f58175B;

    /* renamed from: C, reason: collision with root package name */
    private final RecyclerView.u f58176C;

    /* renamed from: a, reason: collision with root package name */
    private final int f58177a;

    /* renamed from: b, reason: collision with root package name */
    private final int f58178b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f58179c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f58180d;

    /* renamed from: e, reason: collision with root package name */
    private final int f58181e;

    /* renamed from: f, reason: collision with root package name */
    private final int f58182f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f58183g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f58184h;

    /* renamed from: i, reason: collision with root package name */
    private final int f58185i;

    /* renamed from: j, reason: collision with root package name */
    private final int f58186j;

    /* renamed from: k, reason: collision with root package name */
    int f58187k;

    /* renamed from: l, reason: collision with root package name */
    int f58188l;

    /* renamed from: m, reason: collision with root package name */
    float f58189m;

    /* renamed from: n, reason: collision with root package name */
    int f58190n;

    /* renamed from: o, reason: collision with root package name */
    int f58191o;

    /* renamed from: p, reason: collision with root package name */
    float f58192p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f58195s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f58202z;

    /* renamed from: q, reason: collision with root package name */
    private int f58193q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f58194r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f58196t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f58197u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f58198v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f58199w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f58200x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f58201y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.m(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            j.this.x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f58205a = false;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f58205a = true;
        }

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f58205a) {
                this.f58205a = false;
                return;
            }
            if (((Float) j.this.f58202z.getAnimatedValue()).floatValue() == 0.0f) {
                j jVar = j.this;
                jVar.f58174A = 0;
                jVar.u(0);
            } else {
                j jVar2 = j.this;
                jVar2.f58174A = 2;
                jVar2.r();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.f58179c.setAlpha(iFloatValue);
            j.this.f58180d.setAlpha(iFloatValue);
            j.this.r();
        }
    }

    private int t(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z10) {
    }

    void u(int i10) {
        if (i10 == 2 && this.f58198v != 2) {
            this.f58179c.setState(f58172D);
            g();
        }
        if (i10 == 0) {
            r();
        } else {
            w();
        }
        if (this.f58198v == 2 && i10 != 2) {
            this.f58179c.setState(f58173E);
            s(1200);
        } else if (i10 == 1) {
            s(1500);
        }
        this.f58198v = i10;
    }

    private void g() {
        this.f58195s.removeCallbacks(this.f58175B);
    }

    private void h() {
        this.f58195s.removeItemDecoration(this);
        this.f58195s.removeOnItemTouchListener(this);
        this.f58195s.removeOnScrollListener(this.f58176C);
        g();
    }

    private void i(Canvas canvas) {
        int i10 = this.f58194r;
        int i11 = this.f58185i;
        int i12 = this.f58191o;
        int i13 = this.f58190n;
        this.f58183g.setBounds(0, 0, i13, i11);
        this.f58184h.setBounds(0, 0, this.f58193q, this.f58186j);
        canvas.translate(0.0f, i10 - i11);
        this.f58184h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f58183g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void j(Canvas canvas) {
        int i10 = this.f58193q;
        int i11 = this.f58181e;
        int i12 = i10 - i11;
        int i13 = this.f58188l;
        int i14 = this.f58187k;
        int i15 = i13 - (i14 / 2);
        this.f58179c.setBounds(0, 0, i11, i14);
        this.f58180d.setBounds(0, 0, this.f58182f, this.f58194r);
        if (!o()) {
            canvas.translate(i12, 0.0f);
            this.f58180d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f58179c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f58180d.draw(canvas);
        canvas.translate(this.f58181e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f58179c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f58181e, -i15);
    }

    private int[] k() {
        int[] iArr = this.f58201y;
        int i10 = this.f58178b;
        iArr[0] = i10;
        iArr[1] = this.f58193q - i10;
        return iArr;
    }

    private int[] l() {
        int[] iArr = this.f58200x;
        int i10 = this.f58178b;
        iArr[0] = i10;
        iArr[1] = this.f58194r - i10;
        return iArr;
    }

    private boolean o() {
        return ViewCompat.z(this.f58195s) == 1;
    }

    private void v() {
        this.f58195s.addItemDecoration(this);
        this.f58195s.addOnItemTouchListener(this);
        this.f58195s.addOnScrollListener(this.f58176C);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f58198v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zQ = q(motionEvent.getX(), motionEvent.getY());
            boolean zP = p(motionEvent.getX(), motionEvent.getY());
            if (zQ || zP) {
                if (zP) {
                    this.f58199w = 1;
                    this.f58192p = (int) motionEvent.getX();
                } else if (zQ) {
                    this.f58199w = 2;
                    this.f58189m = (int) motionEvent.getY();
                }
                u(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f58198v == 2) {
            this.f58189m = 0.0f;
            this.f58192p = 0.0f;
            u(1);
            this.f58199w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f58198v == 2) {
            w();
            if (this.f58199w == 1) {
                n(motionEvent.getX());
            }
            if (this.f58199w == 2) {
                y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f58198v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zQ = q(motionEvent.getX(), motionEvent.getY());
        boolean zP = p(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zQ && !zP)) {
            return false;
        }
        if (zP) {
            this.f58199w = 1;
            this.f58192p = (int) motionEvent.getX();
        } else if (zQ) {
            this.f58199w = 2;
            this.f58189m = (int) motionEvent.getY();
        }
        u(2);
        return true;
    }

    public void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f58195s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f58195s = recyclerView;
        if (recyclerView != null) {
            v();
        }
    }

    void m(int i10) {
        int i11 = this.f58174A;
        if (i11 == 1) {
            this.f58202z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f58174A = 3;
        ValueAnimator valueAnimator = this.f58202z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f58202z.setDuration(i10);
        this.f58202z.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (this.f58193q != this.f58195s.getWidth() || this.f58194r != this.f58195s.getHeight()) {
            this.f58193q = this.f58195s.getWidth();
            this.f58194r = this.f58195s.getHeight();
            u(0);
        } else if (this.f58174A != 0) {
            if (this.f58196t) {
                j(canvas);
            }
            if (this.f58197u) {
                i(canvas);
            }
        }
    }

    boolean p(float f10, float f11) {
        if (f11 < this.f58194r - this.f58185i) {
            return false;
        }
        int i10 = this.f58191o;
        int i11 = this.f58190n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    void r() {
        this.f58195s.invalidate();
    }

    public void w() {
        int i10 = this.f58174A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f58202z.cancel();
            }
        }
        this.f58174A = 1;
        ValueAnimator valueAnimator = this.f58202z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f58202z.setDuration(500L);
        this.f58202z.setStartDelay(0L);
        this.f58202z.start();
    }

    void x(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f58195s.computeVerticalScrollRange();
        int i12 = this.f58194r;
        this.f58196t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f58177a;
        int iComputeHorizontalScrollRange = this.f58195s.computeHorizontalScrollRange();
        int i13 = this.f58193q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f58177a;
        this.f58197u = z10;
        boolean z11 = this.f58196t;
        if (!z11 && !z10) {
            if (this.f58198v != 0) {
                u(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f58188l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f58187k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f58197u) {
            float f11 = i13;
            this.f58191o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f58190n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f58198v;
        if (i14 == 0 || i14 == 1) {
            u(1);
        }
    }

    j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f58202z = valueAnimatorOfFloat;
        this.f58174A = 0;
        this.f58175B = new a();
        this.f58176C = new b();
        this.f58179c = stateListDrawable;
        this.f58180d = drawable;
        this.f58183g = stateListDrawable2;
        this.f58184h = drawable2;
        this.f58181e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f58182f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f58185i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f58186j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f58177a = i11;
        this.f58178b = i12;
        stateListDrawable.setAlpha(l3.f92484c);
        drawable.setAlpha(l3.f92484c);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        f(recyclerView);
    }

    private void n(float f10) {
        int[] iArrK = k();
        float fMax = Math.max(iArrK[0], Math.min(iArrK[1], f10));
        if (Math.abs(this.f58191o - fMax) < 2.0f) {
            return;
        }
        int iT = t(this.f58192p, fMax, iArrK, this.f58195s.computeHorizontalScrollRange(), this.f58195s.computeHorizontalScrollOffset(), this.f58193q);
        if (iT != 0) {
            this.f58195s.scrollBy(iT, 0);
        }
        this.f58192p = fMax;
    }

    private void s(int i10) {
        g();
        this.f58195s.postDelayed(this.f58175B, i10);
    }

    private void y(float f10) {
        int[] iArrL = l();
        float fMax = Math.max(iArrL[0], Math.min(iArrL[1], f10));
        if (Math.abs(this.f58188l - fMax) < 2.0f) {
            return;
        }
        int iT = t(this.f58189m, fMax, iArrL, this.f58195s.computeVerticalScrollRange(), this.f58195s.computeVerticalScrollOffset(), this.f58194r);
        if (iT != 0) {
            this.f58195s.scrollBy(0, iT);
        }
        this.f58189m = fMax;
    }

    boolean q(float f10, float f11) {
        if (o()) {
            if (f10 > this.f58181e) {
                return false;
            }
        } else if (f10 < this.f58193q - this.f58181e) {
            return false;
        }
        int i10 = this.f58188l;
        int i11 = this.f58187k;
        if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
            return true;
        }
        return false;
    }
}
