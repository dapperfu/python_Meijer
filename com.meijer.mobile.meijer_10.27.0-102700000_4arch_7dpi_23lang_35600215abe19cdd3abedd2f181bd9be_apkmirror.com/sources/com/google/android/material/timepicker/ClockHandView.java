package com.google.android.material.timepicker;

import ae.C5597b;
import ae.k;
import ae.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import be.C6230a;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C15608a;
import ne.i;

/* loaded from: classes4.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final int f87938a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f87939b;

    /* renamed from: c, reason: collision with root package name */
    private final ValueAnimator f87940c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f87941d;

    /* renamed from: e, reason: collision with root package name */
    private float f87942e;

    /* renamed from: f, reason: collision with root package name */
    private float f87943f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f87944g;

    /* renamed from: h, reason: collision with root package name */
    private final int f87945h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f87946i;

    /* renamed from: j, reason: collision with root package name */
    private final List<b> f87947j;

    /* renamed from: k, reason: collision with root package name */
    private final int f87948k;

    /* renamed from: l, reason: collision with root package name */
    private final float f87949l;

    /* renamed from: m, reason: collision with root package name */
    private final Paint f87950m;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f87951n;

    /* renamed from: o, reason: collision with root package name */
    private final int f87952o;

    /* renamed from: p, reason: collision with root package name */
    private float f87953p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f87954q;

    /* renamed from: r, reason: collision with root package name */
    private double f87955r;

    /* renamed from: s, reason: collision with root package name */
    private int f87956s;

    /* renamed from: t, reason: collision with root package name */
    private int f87957t;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void d(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44485G);
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f87956s * 0.66f) : this.f87956s;
    }

    public void m(float f10) {
        n(f10, false);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87940c = new ValueAnimator();
        this.f87947j = new ArrayList();
        Paint paint = new Paint();
        this.f87950m = paint;
        this.f87951n = new RectF();
        this.f87957t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f45003Q1, i10, k.f44782J);
        this.f87938a = i.f(context, C5597b.f44487I, HttpResponseStatus.SUCCESS_OK);
        this.f87939b = i.g(context, C5597b.f44497S, C6230a.f60116b);
        this.f87956s = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45025S1, 0);
        this.f87948k = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45036T1, 0);
        this.f87952o = getResources().getDimensionPixelSize(ae.d.f44570F);
        this.f87949l = r7.getDimensionPixelSize(ae.d.f44567D);
        int color = typedArrayObtainStyledAttributes.getColor(l.f45014R1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f87945h = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.w0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void o(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f87953p = f11;
        this.f87955r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f87957t);
        float fCos = width + (((float) Math.cos(this.f87955r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f87955r)));
        RectF rectF = this.f87951n;
        int i10 = this.f87948k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<b> it = this.f87947j.iterator();
        while (it.hasNext()) {
            it.next().d(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f87947j.add(bVar);
    }

    public RectF e() {
        return this.f87951n;
    }

    public float g() {
        return this.f87953p;
    }

    public int i() {
        return this.f87948k;
    }

    public void l(int i10) {
        this.f87956s = i10;
        invalidate();
    }

    public void n(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f87940c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            o(f10, false);
            return;
        }
        Pair<Float, Float> pairJ = j(f10);
        this.f87940c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f87940c.setDuration(this.f87938a);
        this.f87940c.setInterpolator(this.f87939b);
        this.f87940c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f87972a, valueAnimator2);
            }
        });
        this.f87940c.addListener(new a());
        this.f87940c.start();
    }

    void p(boolean z10) {
        if (this.f87946i && !z10) {
            this.f87957t = 1;
        }
        this.f87946i = z10;
        invalidate();
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        int i10 = 2;
        if (C15608a.a(getWidth() / 2, getHeight() / 2, f10, f11) > h(2) + x.d(getContext(), 12)) {
            i10 = 1;
        }
        this.f87957t = i10;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.f87957t);
        float fCos = (((float) Math.cos(this.f87955r)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.f87955r))) + f11;
        this.f87950m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f87948k, this.f87950m);
        double dSin = Math.sin(this.f87955r);
        double dCos = Math.cos(this.f87955r);
        this.f87950m.setStrokeWidth(this.f87952o);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f87950m);
        canvas.drawCircle(f10, f11, this.f87949l, this.f87950m);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            return degrees + 450;
        }
        return i10;
    }

    private Pair<Float, Float> j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f12 = f(f10, f11);
        boolean z14 = false;
        if (g() != f12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 && z13) {
            return true;
        }
        if (!z13 && !z10) {
            return false;
        }
        if (z12 && this.f87941d) {
            z14 = true;
        }
        n(f12, z14);
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f87940c.isRunning()) {
            m(g());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
                z12 = false;
            } else {
                int i10 = (int) (x10 - this.f87942e);
                int i11 = (int) (y10 - this.f87943f);
                if ((i10 * i10) + (i11 * i11) > this.f87945h) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f87944g = z13;
                z11 = this.f87954q;
                if (actionMasked == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.f87946i) {
                    c(x10, y10);
                }
                z12 = z14;
                z10 = false;
            }
        } else {
            this.f87942e = x10;
            this.f87943f = y10;
            this.f87944g = true;
            this.f87954q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        }
        this.f87954q |= k(x10, y10, z11, z10, z12);
        return true;
    }
}
