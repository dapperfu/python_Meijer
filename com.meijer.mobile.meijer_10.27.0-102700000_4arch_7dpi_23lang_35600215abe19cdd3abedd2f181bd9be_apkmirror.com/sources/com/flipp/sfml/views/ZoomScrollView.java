package com.flipp.sfml.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.L;

/* loaded from: classes4.dex */
public class ZoomScrollView extends FrameLayout implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, FSDraw {

    /* renamed from: E, reason: collision with root package name */
    private static final String f64254E = "ZoomScrollView";

    /* renamed from: F, reason: collision with root package name */
    public static int f64255F = 800;

    /* renamed from: A, reason: collision with root package name */
    private Runnable f64256A;

    /* renamed from: B, reason: collision with root package name */
    float f64257B;

    /* renamed from: C, reason: collision with root package name */
    float f64258C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f64259D;

    /* renamed from: a, reason: collision with root package name */
    private int f64260a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f64261b;

    /* renamed from: c, reason: collision with root package name */
    private float f64262c;

    /* renamed from: d, reason: collision with root package name */
    private List<f> f64263d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f64264e;

    /* renamed from: f, reason: collision with root package name */
    private float f64265f;

    /* renamed from: g, reason: collision with root package name */
    private float f64266g;

    /* renamed from: h, reason: collision with root package name */
    private ScaleGestureDetector f64267h;

    /* renamed from: i, reason: collision with root package name */
    private GestureDetector f64268i;

    /* renamed from: j, reason: collision with root package name */
    private GestureDetector f64269j;

    /* renamed from: k, reason: collision with root package name */
    private OverScroller f64270k;

    /* renamed from: l, reason: collision with root package name */
    private EdgeEffect f64271l;

    /* renamed from: m, reason: collision with root package name */
    private EdgeEffect f64272m;

    /* renamed from: n, reason: collision with root package name */
    private EdgeEffect f64273n;

    /* renamed from: o, reason: collision with root package name */
    private EdgeEffect f64274o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f64275p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f64276q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f64277r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f64278s;

    /* renamed from: t, reason: collision with root package name */
    private int f64279t;

    /* renamed from: u, reason: collision with root package name */
    private int f64280u;

    /* renamed from: v, reason: collision with root package name */
    boolean f64281v;

    /* renamed from: w, reason: collision with root package name */
    private ValueAnimator f64282w;

    /* renamed from: x, reason: collision with root package name */
    private long f64283x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f64284y;

    /* renamed from: z, reason: collision with root package name */
    private Handler f64285z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ZoomScrollView.this.h(true);
            ZoomScrollView.this.f64281v = false;
        }
    }

    class b implements GestureDetector.OnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return ZoomScrollView.this.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return ZoomScrollView.this.onFling(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            ZoomScrollView.this.onLongPress(motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return ZoomScrollView.this.onScroll(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            ZoomScrollView.this.onShowPress(motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ZoomScrollView.this.onSingleTapUp(motionEvent);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return ZoomScrollView.this.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return ZoomScrollView.this.onDoubleTapEvent(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return ZoomScrollView.this.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return ZoomScrollView.this.onSingleTapConfirmed(motionEvent);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Rect rect = new Rect();
            rect.left = ((Integer) valueAnimator.getAnimatedValue("LEFT")).intValue();
            rect.top = ((Integer) valueAnimator.getAnimatedValue("TOP")).intValue();
            rect.right = ((Integer) valueAnimator.getAnimatedValue("RIGHT")).intValue();
            rect.bottom = ((Integer) valueAnimator.getAnimatedValue("BOTTOM")).intValue();
            float fA = ZoomScrollView.this.a((float) Math.max(Math.min(ZoomScrollView.this.getWidth() / rect.width(), ZoomScrollView.this.getHeight() / rect.height()), 1.0d));
            float f10 = ZoomScrollView.this.f64262c;
            ZoomScrollView.this.setZoomScale(fA);
            if (f10 != ZoomScrollView.this.f64262c) {
                ZoomScrollView.this.setZooming(true);
            }
            float zoomScale = ZoomScrollView.this.getZoomScale();
            ZoomScrollView.this.scrollTo((int) (rect.left * zoomScale), (int) (zoomScale * rect.top));
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ZoomScrollView.this.setZooming(false);
            ZoomScrollView.this.f64284y = false;
            ZoomScrollView.this.f64282w.removeAllUpdateListeners();
            ZoomScrollView.this.f64282w.removeAllListeners();
            ZoomScrollView.this.k();
        }
    }

    public interface f {
        void c();

        void e(boolean z10, boolean z11, float f10, float f11, float f12, float f13);

        void g(float f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f10) {
        if (f10 < 1.0d) {
            f10 = 1.0f;
        }
        if (f10 > 5.0f) {
            return 5.0f;
        }
        return f10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException(f64254E + " can host only one direct child");
    }

    public void fsSuperDraw_6fecf1c01b6d3b8ae96728a19547b636(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public float getScaleX() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.getScaleX();
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getScaleY() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.getScaleY();
        }
        return 1.0f;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        setZooming(false);
        k();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void z(Rect rect, boolean z10) {
        this.f64284y = true;
        Rect rect2 = new Rect(computeHorizontalScrollOffset(), computeVerticalScrollOffset(), computeHorizontalScrollOffset() + computeHorizontalScrollExtent(), computeVerticalScrollOffset() + computeVerticalScrollExtent());
        if (z10) {
            Rect rect3 = new Rect(rect);
            double dA = a((float) Math.min(getWidth() / rect3.width(), getHeight() / rect3.height()));
            rect3.inset(-((int) (((getWidth() - (rect3.width() * r10)) / 2.0d) / dA)), -((int) (((getHeight() - (rect3.height() * r10)) / 2.0d) / dA)));
            rect = rect3;
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("LEFT", rect2.left, rect.left);
        PropertyValuesHolder propertyValuesHolderOfInt2 = PropertyValuesHolder.ofInt("TOP", rect2.top, rect.top);
        PropertyValuesHolder propertyValuesHolderOfInt3 = PropertyValuesHolder.ofInt("RIGHT", rect2.right, rect.right);
        PropertyValuesHolder propertyValuesHolderOfInt4 = PropertyValuesHolder.ofInt("BOTTOM", rect2.bottom, rect.bottom);
        ValueAnimator valueAnimator = this.f64282w;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f64282w.removeAllListeners();
        }
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfInt, propertyValuesHolderOfInt2, propertyValuesHolderOfInt3, propertyValuesHolderOfInt4);
        this.f64282w = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new d());
        this.f64282w.addListener(new e());
        this.f64282w.setDuration(f64255F);
        this.f64282w.start();
    }

    private void d() {
        this.f64285z = new Handler();
        this.f64260a = 1;
        setVerticalScrollBarEnabled(true);
        setHorizontalScrollBarEnabled(true);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        this.f64264e = new int[2];
        this.f64263d = new ArrayList();
        Context context = getContext();
        this.f64271l = FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
        Context context2 = getContext();
        this.f64272m = FS.maybeWrapEdgeEffect(new EdgeEffect(context2), context2);
        Context context3 = getContext();
        this.f64273n = FS.maybeWrapEdgeEffect(new EdgeEffect(context3), context3);
        Context context4 = getContext();
        this.f64274o = FS.maybeWrapEdgeEffect(new EdgeEffect(context4), context4);
        this.f64275p = false;
        this.f64277r = false;
        this.f64276q = false;
        this.f64278s = false;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.f64267h = scaleGestureDetector;
        L.a(scaleGestureDetector, false);
        this.f64268i = new GestureDetector(getContext(), new b());
        this.f64269j = new GestureDetector(getContext(), new c());
        OverScroller overScroller = new OverScroller(getContext());
        this.f64270k = overScroller;
        overScroller.setFriction(0.03f);
        setWillNotDraw(false);
    }

    private void e(int i10, int i11) {
        this.f64270k.forceFinished(true);
        this.f64270k.fling(getScrollX(), getScrollY(), i10, i11, 0, (int) getMaxScrollX(), 0, (int) getMaxScrollY(), getWidth() / 4, getHeight() / 2);
        ViewCompat.d0(this);
    }

    private void f(Canvas canvas) {
        if (!this.f64271l.isFinished()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, getHeight());
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            this.f64271l.setSize(getHeight(), getWidth());
            if (this.f64271l.draw(canvas)) {
                ViewCompat.d0(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (!this.f64272m.isFinished()) {
            int iSave2 = canvas.save();
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, 0.0f, 0.0f);
            this.f64272m.setSize(getHeight(), getWidth());
            if (this.f64272m.draw(canvas)) {
                ViewCompat.d0(this);
            }
            canvas.restoreToCount(iSave2);
        }
        if (!this.f64273n.isFinished()) {
            int iSave3 = canvas.save();
            canvas.translate(0.0f, 0.0f);
            this.f64273n.setSize(getWidth(), getHeight());
            if (this.f64273n.draw(canvas)) {
                ViewCompat.d0(this);
            }
            canvas.restoreToCount(iSave3);
        }
        if (this.f64274o.isFinished()) {
            return;
        }
        int iSave4 = canvas.save();
        canvas.translate(getWidth(), getHeight());
        canvas.rotate(180.0f, 0.0f, 0.0f);
        this.f64274o.setSize(getWidth(), getHeight());
        if (this.f64274o.draw(canvas)) {
            ViewCompat.d0(this);
        }
        canvas.restoreToCount(iSave4);
    }

    private float getMaxScrollX() {
        return (this.f64265f * this.f64262c) - getWidth();
    }

    private float getMaxScrollY() {
        return (this.f64266g * this.f64262c) - getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Iterator<f> it = this.f64263d.iterator();
        while (it.hasNext()) {
            it.next().g(this.f64262c);
        }
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        return (int) this.f64265f;
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return (int) this.f64266g;
    }

    public float getZoomScale() {
        return this.f64262c;
    }

    public void i(f fVar) {
        if (this.f64263d.contains(fVar)) {
            return;
        }
        this.f64263d.add(fVar);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        if (this.f64260a == 1) {
            A(view, i10, i11);
        } else {
            o(view, i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f64260a == 1) {
            B(view, i10, i11, i12, i13);
        } else {
            p(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f64284y) {
            return true;
        }
        this.f64281v = true;
        y();
        e((int) (-f10), (int) (-f11));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f64267h.onTouchEvent(motionEvent);
        this.f64268i.onTouchEvent(motionEvent);
        this.f64269j.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent) || this.f64259D || this.f64261b;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f10 = this.f64262c;
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        setZoomScale(scaleGestureDetector.getScaleFactor() * this.f64262c);
        if (f10 != this.f64262c) {
            setZooming(true);
        }
        float f11 = this.f64257B;
        float f12 = this.f64262c;
        scrollTo((int) ((f11 * f12) - focusX), (int) ((this.f64258C * f12) - focusY));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f64284y || this.f64261b) {
            return true;
        }
        this.f64259D = true;
        this.f64281v = true;
        int scrollX = (int) (getScrollX() + f10);
        int scrollY = (int) (getScrollY() + f11);
        if (scrollX < 0) {
            v(f10 / getWidth());
        } else if (scrollX > getMaxScrollX()) {
            w(f10 / getWidth());
        }
        if (scrollY < 0) {
            x(f11 / getHeight());
        } else if (scrollY > getMaxScrollY()) {
            u(f11 / getHeight());
        }
        scrollTo(scrollX, scrollY);
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f64269j.onTouchEvent(motionEvent) || (this.f64268i.onTouchEvent(motionEvent) || this.f64267h.onTouchEvent(motionEvent));
        awakenScrollBars();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.f64259D = false;
        } else if (actionMasked == 3) {
            this.f64281v = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public void q(int i10) {
        if (!this.f64274o.isFinished() || this.f64278s) {
            return;
        }
        this.f64274o.onAbsorb(i10);
        this.f64278s = true;
        invalidate();
    }

    public void r(int i10) {
        if (!this.f64271l.isFinished() || this.f64275p) {
            return;
        }
        this.f64271l.onAbsorb(i10);
        this.f64275p = true;
        invalidate();
    }

    public void s(int i10) {
        if (!this.f64272m.isFinished() || this.f64276q) {
            return;
        }
        this.f64272m.onAbsorb(i10);
        this.f64276q = true;
        invalidate();
    }

    public void setZooming(boolean z10) {
        if (this.f64261b == z10) {
            return;
        }
        this.f64261b = z10;
        invalidate();
    }

    public void t(int i10) {
        if (!this.f64273n.isFinished() || this.f64277r) {
            return;
        }
        this.f64273n.onAbsorb(i10);
        this.f64277r = true;
        invalidate();
    }

    public void u(float f10) {
        this.f64274o.onPull(f10);
        this.f64278s = true;
        invalidate();
    }

    public void v(float f10) {
        this.f64271l.onPull(f10);
        this.f64275p = true;
        invalidate();
    }

    public void w(float f10) {
        this.f64272m.onPull(f10);
        this.f64276q = true;
        invalidate();
    }

    public void x(float f10) {
        this.f64273n.onPull(f10);
        this.f64277r = true;
        invalidate();
    }

    public void y() {
        this.f64271l.onRelease();
        this.f64272m.onRelease();
        this.f64273n.onRelease();
        this.f64274o.onRelease();
        this.f64275p = false;
        this.f64277r = false;
        this.f64276q = false;
        this.f64278s = false;
    }

    public ZoomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64262c = 1.0f;
        this.f64281v = false;
        this.f64283x = 0L;
        this.f64284y = false;
        this.f64256A = new a();
        this.f64259D = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z10) {
        float scrollX = (getScrollX() / this.f64262c) + this.f64264e[0];
        float scrollY = (getScrollY() / this.f64262c) + this.f64264e[1];
        float width = scrollX + (getWidth() / this.f64262c);
        float height = scrollY + (getHeight() / this.f64262c);
        Iterator<f> it = this.f64263d.iterator();
        while (it.hasNext()) {
            it.next().e(z10, this.f64281v, scrollX, scrollY, width, height);
        }
    }

    private boolean n() {
        if (System.currentTimeMillis() > this.f64283x + 100) {
            return true;
        }
        return false;
    }

    protected void A(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i11) - (getPaddingTop() + getPaddingBottom())), 0));
    }

    protected void B(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i12) - ((((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i13)), 0));
    }

    @Override // android.view.View
    protected int computeHorizontalScrollExtent() {
        return (int) (getWidth() / this.f64262c);
    }

    @Override // android.view.View
    protected int computeHorizontalScrollOffset() {
        return (int) (getScrollX() / this.f64262c);
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f64270k.computeScrollOffset()) {
            float f10 = this.f64262c;
            int currX = this.f64270k.getCurrX();
            int currY = this.f64270k.getCurrY();
            if (currX < 0 && this.f64262c > 1.0f) {
                r((int) this.f64270k.getCurrVelocity());
            }
            if (currX > getMaxScrollX() && this.f64262c > 1.0f) {
                s((int) this.f64270k.getCurrVelocity());
            }
            if (currY < 0 && f10 > 1.0d) {
                t((int) this.f64270k.getCurrVelocity());
            }
            if (currY > getMaxScrollY() && f10 > 1.0d) {
                q((int) this.f64270k.getCurrVelocity());
            }
            scrollTo(currX, currY);
            if (!awakenScrollBars()) {
                ViewCompat.d0(this);
            }
        }
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        return (int) (getHeight() / this.f64262c);
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        return (int) (getScrollY() / this.f64262c);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        fsSuperDraw_6fecf1c01b6d3b8ae96728a19547b636(canvas);
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        f(canvas);
        canvas.restoreToCount(iSave);
    }

    protected void o(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i10) - (getPaddingLeft() + getPaddingRight())), 0), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), layoutParams.height));
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        int i10;
        int i11;
        if (!n()) {
            return false;
        }
        int iComputeHorizontalScrollOffset = computeHorizontalScrollOffset() + ((int) (motionEvent.getX() / this.f64262c));
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset() + ((int) (motionEvent.getY() / this.f64262c));
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        if (this.f64262c <= 1.15f) {
            width /= 3;
            height /= 3;
        }
        Rect rect = new Rect(iComputeHorizontalScrollOffset - width, iComputeVerticalScrollOffset - height, iComputeHorizontalScrollOffset + width, iComputeVerticalScrollOffset + height);
        int i12 = rect.left;
        if (i12 < 0) {
            i10 = -i12;
        } else {
            i10 = 0;
        }
        int i13 = rect.top;
        if (i13 < 0) {
            i11 = -i13;
        } else {
            i11 = 0;
        }
        rect.offset(i10, i11);
        if (rect.isEmpty()) {
            return false;
        }
        this.f64281v = true;
        z(rect, false);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        y();
        this.f64270k.forceFinished(true);
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (getMaxScrollY() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        accessibilityEvent.setScrollX(getScrollX());
        accessibilityEvent.setScrollY(getScrollY());
        accessibilityEvent.setMaxScrollX((int) getMaxScrollX());
        accessibilityEvent.setMaxScrollY((int) getMaxScrollY());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ScrollView.class.getName());
        if (isEnabled()) {
            float maxScrollY = getMaxScrollY();
            if (maxScrollY > 0.0f) {
                accessibilityNodeInfo.setScrollable(true);
                if (getScrollY() > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (getScrollY() < maxScrollY) {
                    accessibilityNodeInfo.addAction(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        int iComputeHorizontalScrollRange = computeHorizontalScrollRange();
        int iComputeVerticalScrollRange = computeVerticalScrollRange();
        if (this.f64280u == iComputeVerticalScrollRange && this.f64279t == iComputeHorizontalScrollRange) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f64280u = iComputeVerticalScrollRange;
        this.f64279t = iComputeHorizontalScrollRange;
        if (z10) {
            ((Sa.e) Qa.c.c(Sa.e.class)).v(this, this.f64264e);
        }
        if (z11) {
            Iterator<f> it = this.f64263d.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            scrollTo(Math.min(getScrollX(), this.f64279t), Math.min(getScrollY(), this.f64280u));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            this.f64265f = childAt.getMeasuredWidth();
            this.f64266g = childAt.getMeasuredHeight();
        } else {
            this.f64265f = 0.0f;
            this.f64266g = 0.0f;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f64257B = (scaleGestureDetector.getFocusX() + getScrollX()) / this.f64262c;
        this.f64258C = (scaleGestureDetector.getFocusY() + getScrollY()) / this.f64262c;
        this.f64281v = true;
        return true;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        invalidate();
    }

    protected void p(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i10) - ((((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i11)), 0), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        float fMax;
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        if (i10 != 4096 && i10 != 8192) {
            return false;
        }
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (i10 == 4096) {
            fMax = Math.min(getScrollY() + height, getMaxScrollY());
        } else {
            fMax = Math.max(getScrollY() - height, 0);
        }
        if (fMax == getScrollY()) {
            return false;
        }
        scrollTo(getScrollX(), (int) fMax);
        return true;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        this.f64283x = System.currentTimeMillis();
        this.f64285z.removeCallbacks(this.f64256A);
        int iMax = (int) Math.max(0.0f, Math.min(i10, getMaxScrollX()));
        int iMax2 = (int) Math.max(0.0f, Math.min(i11, getMaxScrollY()));
        h(false);
        this.f64285z.postDelayed(this.f64256A, 40L);
        super.scrollTo(iMax, iMax2);
    }

    protected void setZoomScale(float f10) {
        this.f64262c = a(f10);
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setScaleX(this.f64262c);
            childAt.setScaleY(this.f64262c);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException(f64254E + " can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException(f64254E + " can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            this.f64260a = 1;
            if (layoutParams.height == -1) {
                this.f64260a = 0;
            }
            super.addView(view, i10, layoutParams);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            return;
        }
        throw new IllegalStateException(f64254E + " can host only one direct child");
    }
}
