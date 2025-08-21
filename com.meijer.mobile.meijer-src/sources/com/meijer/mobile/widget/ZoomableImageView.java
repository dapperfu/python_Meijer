package com.meijer.mobile.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes12.dex */
public class ZoomableImageView extends AppCompatImageView implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final ScaleGestureDetector f120530a;

    /* renamed from: b, reason: collision with root package name */
    private final GestureDetector f120531b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f120532c;

    /* renamed from: d, reason: collision with root package name */
    private float f120533d;

    /* renamed from: e, reason: collision with root package name */
    private float f120534e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f120535f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f120536g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f120537h;

    /* renamed from: i, reason: collision with root package name */
    private int f120538i;

    /* renamed from: j, reason: collision with root package name */
    private int f120539j;

    /* renamed from: k, reason: collision with root package name */
    private RectF f120540k;

    /* renamed from: l, reason: collision with root package name */
    private float f120541l;

    /* renamed from: m, reason: collision with root package name */
    private float f120542m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f120543n;

    private class a extends GestureDetector.SimpleOnGestureListener {
        private a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            ZoomableImageView.this.f120532c.set(ZoomableImageView.this.getImageMatrix());
            ZoomableImageView.this.f120532c.getValues(ZoomableImageView.this.f120537h);
            float f10 = ZoomableImageView.this.f120537h[0];
            if (f10 == 0.0f || !ZoomableImageView.this.q(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            if (f10 == ZoomableImageView.this.f120542m) {
                ZoomableImageView zoomableImageView = ZoomableImageView.this;
                zoomableImageView.m(zoomableImageView.getDrawable());
                return true;
            }
            if (f10 >= ZoomableImageView.this.f120542m / 2.0f) {
                float f11 = ZoomableImageView.this.f120542m / f10;
                ZoomableImageView.this.f120532c.postScale(f11, f11, motionEvent.getX(), motionEvent.getY());
                ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
                zoomableImageView2.setImageMatrix(zoomableImageView2.f120532c);
                return true;
            }
            float f12 = (ZoomableImageView.this.f120542m / 2.0f) / f10;
            ZoomableImageView.this.f120532c.postScale(f12, f12, motionEvent.getX(), motionEvent.getY());
            ZoomableImageView zoomableImageView3 = ZoomableImageView.this;
            zoomableImageView3.setImageMatrix(zoomableImageView3.f120532c);
            return true;
        }
    }

    private class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private b() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            ZoomableImageView.this.f120543n = true;
            ZoomableImageView.this.f120532c.set(ZoomableImageView.this.getImageMatrix());
            ZoomableImageView.this.f120532c.getValues(ZoomableImageView.this.f120537h);
            float f10 = ZoomableImageView.this.f120537h[0];
            if (f10 == 0.0f) {
                return false;
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float f11 = f10 * scaleFactor;
            if (f11 < ZoomableImageView.this.f120541l) {
                ZoomableImageView zoomableImageView = ZoomableImageView.this;
                zoomableImageView.m(zoomableImageView.getDrawable());
            } else {
                if (f11 > ZoomableImageView.this.f120542m) {
                    scaleFactor = ZoomableImageView.this.f120542m / f10;
                }
                ZoomableImageView.this.f120532c.set(ZoomableImageView.this.getImageMatrix());
                ZoomableImageView.this.f120532c.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
                zoomableImageView2.setImageMatrix(zoomableImageView2.f120532c);
            }
            return true;
        }
    }

    public ZoomableImageView(Context context) {
        this(context, null);
    }

    private boolean p(float f10, float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = (this.f120539j * f11) + f12;
        float measuredWidth = getMeasuredWidth() / 2;
        return f12 + f10 <= measuredWidth && f13 + f10 >= measuredWidth;
    }

    private boolean t(float f10, float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[5];
        float f13 = (this.f120538i * f11) + f12;
        float measuredHeight = getMeasuredHeight() / 2;
        return f12 + f10 <= measuredHeight && f13 + f10 >= measuredHeight;
    }

    public void n() {
        setOnTouchListener(null);
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f120532c = new Matrix();
        this.f120530a = new ScaleGestureDetector(context, new b());
        this.f120531b = new GestureDetector(context, new a());
        this.f120543n = false;
        this.f120536g = false;
        this.f120535f = false;
        this.f120537h = new float[9];
        this.f120540k = new RectF();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Drawable drawable) {
        if (drawable != null) {
            float width = getWidth();
            float height = getHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f120532c.reset();
            float f10 = intrinsicWidth;
            float f11 = intrinsicHeight;
            float fMin = Math.min(width / f10, height / f11);
            this.f120541l = fMin;
            this.f120542m = 5.0f * fMin;
            this.f120532c.preScale(fMin, fMin);
            Matrix matrix = this.f120532c;
            float f12 = this.f120541l;
            matrix.postTranslate((width - (f10 * f12)) / 2.0f, (height - (f11 * f12)) / 2.0f);
            setImageMatrix(this.f120532c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(float f10, float f11) {
        this.f120532c.set(getImageMatrix());
        this.f120532c.getValues(this.f120537h);
        float[] fArr = this.f120537h;
        float f12 = fArr[0];
        float f13 = fArr[2];
        float f14 = fArr[5];
        this.f120540k.set(f13, f14, (this.f120539j * f12) + f13, (this.f120538i * f12) + f14);
        return this.f120540k.contains(f10, f11);
    }

    private boolean r() {
        this.f120532c.set(getImageMatrix());
        this.f120532c.getValues(this.f120537h);
        return this.f120537h[0] > this.f120541l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 != 3) goto L26;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            android.view.ScaleGestureDetector r6 = r5.f120530a
            r6.onTouchEvent(r7)
            android.view.GestureDetector r6 = r5.f120531b
            r6.onTouchEvent(r7)
            int r6 = r7.getAction()
            r0 = 0
            if (r6 == 0) goto L90
            r1 = 1
            if (r6 == r1) goto L7f
            r2 = 2
            if (r6 == r2) goto L1b
            r7 = 3
            if (r6 == r7) goto L7f
            goto L7e
        L1b:
            float r6 = r7.getX()
            float r7 = r7.getY()
            float r2 = r5.f120533d
            float r2 = r6 - r2
            float r3 = r5.f120534e
            float r3 = r7 - r3
            boolean r4 = r5.f120543n
            if (r4 == 0) goto L30
            return r1
        L30:
            boolean r4 = r5.f120535f
            if (r4 == 0) goto L7e
            boolean r4 = r5.r()
            if (r4 == 0) goto L7e
            r5.f120536g = r1
            android.graphics.Matrix r0 = r5.f120532c
            android.graphics.Matrix r4 = r5.getImageMatrix()
            r0.set(r4)
            android.graphics.Matrix r0 = r5.f120532c
            float[] r4 = r5.f120537h
            r0.getValues(r4)
            float[] r0 = r5.f120537h
            boolean r0 = r5.t(r3, r0)
            r4 = 0
            if (r0 != 0) goto L56
            r3 = r4
        L56:
            float[] r0 = r5.f120537h
            boolean r0 = r5.p(r2, r0)
            if (r0 != 0) goto L5f
            r2 = r4
        L5f:
            r5.f120533d = r6
            r5.f120534e = r7
            android.graphics.Matrix r6 = r5.f120532c
            android.graphics.Matrix r7 = r5.getImageMatrix()
            r6.set(r7)
            android.graphics.Matrix r6 = r5.f120532c
            r6.postTranslate(r2, r3)
            android.graphics.Matrix r6 = r5.f120532c
            r5.setImageMatrix(r6)
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r1)
            return r1
        L7e:
            return r0
        L7f:
            boolean r6 = r5.f120543n
            if (r6 != 0) goto L89
            boolean r6 = r5.f120536g
            if (r6 == 0) goto L88
            goto L89
        L88:
            r1 = r0
        L89:
            r5.f120543n = r0
            r5.f120536g = r0
            r5.f120535f = r0
            return r1
        L90:
            float r6 = r7.getX()
            r5.f120533d = r6
            float r6 = r7.getY()
            r5.f120534e = r6
            float r7 = r5.f120533d
            boolean r6 = r5.q(r7, r6)
            r5.f120535f = r6
            android.view.ViewParent r6 = r5.getParent()
            boolean r7 = r5.r()
            r6.requestDisallowInterceptTouchEvent(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.widget.ZoomableImageView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void o() {
        setOnTouchListener(this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m(getDrawable());
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            this.f120539j = drawable.getIntrinsicWidth();
            this.f120538i = drawable.getIntrinsicHeight();
            m(drawable);
        }
    }
}
