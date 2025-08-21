package com.cyberfend.cyfsecurity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import t7.C17202a;

/* loaded from: classes4.dex */
public class CircleProgressBar extends View {

    /* renamed from: a, reason: collision with root package name */
    private float f64991a;

    /* renamed from: b, reason: collision with root package name */
    private float f64992b;

    /* renamed from: c, reason: collision with root package name */
    private float f64993c;

    /* renamed from: d, reason: collision with root package name */
    private int f64994d;

    /* renamed from: e, reason: collision with root package name */
    private int f64995e;

    /* renamed from: f, reason: collision with root package name */
    private int f64996f;

    /* renamed from: g, reason: collision with root package name */
    private RectF f64997g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f64998h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f64999i;

    /* renamed from: j, reason: collision with root package name */
    private int f65000j;

    /* renamed from: k, reason: collision with root package name */
    Handler f65001k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f65002l;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CircleProgressBar.this.f65000j < 9) {
                CircleProgressBar.b(CircleProgressBar.this);
                CircleProgressBar.c(CircleProgressBar.this);
                CircleProgressBar.this.postInvalidate();
                CircleProgressBar.this.f65001k.postDelayed(CircleProgressBar.this.f65002l, 100L);
            }
        }
    }

    public synchronized void setProgress(float f10) {
        this.f64993c = f10 * this.f64994d;
        this.f65000j = 0;
        this.f65001k.postDelayed(this.f65002l, 100L);
        postInvalidate();
    }

    static /* synthetic */ int b(CircleProgressBar circleProgressBar) {
        int i10 = circleProgressBar.f65000j;
        circleProgressBar.f65000j = i10 + 1;
        return i10;
    }

    static /* synthetic */ float c(CircleProgressBar circleProgressBar) {
        float f10 = circleProgressBar.f64993c;
        circleProgressBar.f64993c = 1.0f + f10;
        return f10;
    }

    public void setProgressBarColor(int i10) {
        this.f64999i.setColor(i10);
        this.f64998h.setColor(Color.argb(Math.round(Color.alpha(i10) * 0.25f), Color.red(i10), Color.green(i10), Color.blue(i10)));
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64991a = 20.0f;
        this.f64992b = 20.0f;
        this.f64993c = 0.0f;
        this.f64994d = 100;
        this.f64995e = 0;
        this.f64996f = 270;
        this.f65000j = 0;
        this.f65001k = new Handler();
        this.f65002l = new a();
        this.f64997g = new RectF();
        Paint paint = new Paint(1);
        this.f64998h = paint;
        paint.setColor(context.getResources().getColor(C17202a.f162343b));
        Paint paint2 = this.f64998h;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f64999i = paint3;
        paint3.setColor(context.getResources().getColor(C17202a.f162344c));
        this.f64999i.setStyle(style);
        this.f65001k.postDelayed(this.f65002l, 100L);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f64997g, this.f64998h);
        canvas.drawArc(this.f64997g, this.f64996f, (this.f64993c * 360.0f) / this.f64994d, true, this.f64999i);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.f64997g;
        float f10 = this.f64992b;
        float f11 = iMin;
        rectF.set((f10 / 2.0f) + 0.0f, (f10 / 2.0f) + 0.0f, f11 - (f10 / 2.0f), f11 - (f10 / 2.0f));
    }
}
