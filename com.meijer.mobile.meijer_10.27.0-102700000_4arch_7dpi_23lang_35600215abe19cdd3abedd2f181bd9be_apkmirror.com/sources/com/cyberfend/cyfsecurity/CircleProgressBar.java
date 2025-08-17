package com.cyberfend.cyfsecurity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import r7.C16728a;

/* loaded from: classes4.dex */
public class CircleProgressBar extends View {

    /* renamed from: a, reason: collision with root package name */
    private float f64151a;

    /* renamed from: b, reason: collision with root package name */
    private float f64152b;

    /* renamed from: c, reason: collision with root package name */
    private float f64153c;

    /* renamed from: d, reason: collision with root package name */
    private int f64154d;

    /* renamed from: e, reason: collision with root package name */
    private int f64155e;

    /* renamed from: f, reason: collision with root package name */
    private int f64156f;

    /* renamed from: g, reason: collision with root package name */
    private RectF f64157g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f64158h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f64159i;

    /* renamed from: j, reason: collision with root package name */
    private int f64160j;

    /* renamed from: k, reason: collision with root package name */
    Handler f64161k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f64162l;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CircleProgressBar.this.f64160j < 9) {
                CircleProgressBar.b(CircleProgressBar.this);
                CircleProgressBar.c(CircleProgressBar.this);
                CircleProgressBar.this.postInvalidate();
                CircleProgressBar.this.f64161k.postDelayed(CircleProgressBar.this.f64162l, 100L);
            }
        }
    }

    public synchronized void setProgress(float f10) {
        this.f64153c = f10 * this.f64154d;
        this.f64160j = 0;
        this.f64161k.postDelayed(this.f64162l, 100L);
        postInvalidate();
    }

    static /* synthetic */ int b(CircleProgressBar circleProgressBar) {
        int i10 = circleProgressBar.f64160j;
        circleProgressBar.f64160j = i10 + 1;
        return i10;
    }

    static /* synthetic */ float c(CircleProgressBar circleProgressBar) {
        float f10 = circleProgressBar.f64153c;
        circleProgressBar.f64153c = 1.0f + f10;
        return f10;
    }

    public void setProgressBarColor(int i10) {
        this.f64159i.setColor(i10);
        this.f64158h.setColor(Color.argb(Math.round(Color.alpha(i10) * 0.25f), Color.red(i10), Color.green(i10), Color.blue(i10)));
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64151a = 20.0f;
        this.f64152b = 20.0f;
        this.f64153c = 0.0f;
        this.f64154d = 100;
        this.f64155e = 0;
        this.f64156f = 270;
        this.f64160j = 0;
        this.f64161k = new Handler();
        this.f64162l = new a();
        this.f64157g = new RectF();
        Paint paint = new Paint(1);
        this.f64158h = paint;
        paint.setColor(context.getResources().getColor(C16728a.f157853b));
        Paint paint2 = this.f64158h;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f64159i = paint3;
        paint3.setColor(context.getResources().getColor(C16728a.f157854c));
        this.f64159i.setStyle(style);
        this.f64161k.postDelayed(this.f64162l, 100L);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f64157g, this.f64158h);
        canvas.drawArc(this.f64157g, this.f64156f, (this.f64153c * 360.0f) / this.f64154d, true, this.f64159i);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.f64157g;
        float f10 = this.f64152b;
        float f11 = iMin;
        rectF.set((f10 / 2.0f) + 0.0f, (f10 / 2.0f) + 0.0f, f11 - (f10 / 2.0f), f11 - (f10 / 2.0f));
    }
}
