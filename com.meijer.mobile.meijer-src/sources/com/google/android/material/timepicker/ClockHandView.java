package com.google.android.material.timepicker;

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
import ce.C6503b;
import ce.k;
import ce.l;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import de.C13661a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oe.C16118a;
import pe.i;

/* loaded from: classes4.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final int f88778a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f88779b;

    /* renamed from: c, reason: collision with root package name */
    private final ValueAnimator f88780c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f88781d;

    /* renamed from: e, reason: collision with root package name */
    private float f88782e;

    /* renamed from: f, reason: collision with root package name */
    private float f88783f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f88784g;

    /* renamed from: h, reason: collision with root package name */
    private final int f88785h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f88786i;

    /* renamed from: j, reason: collision with root package name */
    private final List<b> f88787j;

    /* renamed from: k, reason: collision with root package name */
    private final int f88788k;

    /* renamed from: l, reason: collision with root package name */
    private final float f88789l;

    /* renamed from: m, reason: collision with root package name */
    private final Paint f88790m;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f88791n;

    /* renamed from: o, reason: collision with root package name */
    private final int f88792o;

    /* renamed from: p, reason: collision with root package name */
    private float f88793p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f88794q;

    /* renamed from: r, reason: collision with root package name */
    private double f88795r;

    /* renamed from: s, reason: collision with root package name */
    private int f88796s;

    /* renamed from: t, reason: collision with root package name */
    private int f88797t;

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
        this(context, attributeSet, C6503b.f61500G);
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f88796s * 0.66f) : this.f88796s;
    }

    public void m(float f10) {
        n(f10, false);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f88780c = new ValueAnimator();
        this.f88787j = new ArrayList();
        Paint paint = new Paint();
        this.f88790m = paint;
        this.f88791n = new RectF();
        this.f88797t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f62018Q1, i10, k.f61797J);
        this.f88778a = i.f(context, C6503b.f61502I, HttpResponseStatus.SUCCESS_OK);
        this.f88779b = i.g(context, C6503b.f61512S, C13661a.f128351b);
        this.f88796s = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62040S1, 0);
        this.f88788k = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62051T1, 0);
        this.f88792o = getResources().getDimensionPixelSize(ce.d.f61585F);
        this.f88789l = r7.getDimensionPixelSize(ce.d.f61582D);
        int color = typedArrayObtainStyledAttributes.getColor(l.f62029R1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f88785h = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.w0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void o(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f88793p = f11;
        this.f88795r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f88797t);
        float fCos = width + (((float) Math.cos(this.f88795r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f88795r)));
        RectF rectF = this.f88791n;
        int i10 = this.f88788k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<b> it = this.f88787j.iterator();
        while (it.hasNext()) {
            it.next().d(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f88787j.add(bVar);
    }

    public RectF e() {
        return this.f88791n;
    }

    public float g() {
        return this.f88793p;
    }

    public int i() {
        return this.f88788k;
    }

    public void l(int i10) {
        this.f88796s = i10;
        invalidate();
    }

    public void n(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f88780c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            o(f10, false);
            return;
        }
        Pair<Float, Float> pairJ = j(f10);
        this.f88780c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f88780c.setDuration(this.f88778a);
        this.f88780c.setInterpolator(this.f88779b);
        this.f88780c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f88812a, valueAnimator2);
            }
        });
        this.f88780c.addListener(new a());
        this.f88780c.start();
    }

    void p(boolean z10) {
        if (this.f88786i && !z10) {
            this.f88797t = 1;
        }
        this.f88786i = z10;
        invalidate();
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        int i10 = 2;
        if (C16118a.a(getWidth() / 2, getHeight() / 2, f10, f11) > h(2) + x.d(getContext(), 12)) {
            i10 = 1;
        }
        this.f88797t = i10;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.f88797t);
        float fCos = (((float) Math.cos(this.f88795r)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.f88795r))) + f11;
        this.f88790m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f88788k, this.f88790m);
        double dSin = Math.sin(this.f88795r);
        double dCos = Math.cos(this.f88795r);
        this.f88790m.setStrokeWidth(this.f88792o);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f88790m);
        canvas.drawCircle(f10, f11, this.f88789l, this.f88790m);
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
        if (z12 && this.f88781d) {
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
        if (!this.f88780c.isRunning()) {
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
                int i10 = (int) (x10 - this.f88782e);
                int i11 = (int) (y10 - this.f88783f);
                if ((i10 * i10) + (i11 * i11) > this.f88785h) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f88784g = z13;
                z11 = this.f88794q;
                if (actionMasked == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.f88786i) {
                    c(x10, y10);
                }
                z12 = z14;
                z10 = false;
            }
        } else {
            this.f88782e = x10;
            this.f88783f = y10;
            this.f88784g = true;
            this.f88794q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        }
        this.f88794q |= k(x10, y10, z11, z10, z12);
        return true;
    }
}
