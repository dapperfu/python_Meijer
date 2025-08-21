package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class StickyNestedScrollView extends NestedScrollView implements FSDispatchDraw {

    /* renamed from: H, reason: collision with root package name */
    private ArrayList<View> f103691H;

    /* renamed from: I, reason: collision with root package name */
    private View f103692I;

    /* renamed from: J, reason: collision with root package name */
    private float f103693J;

    /* renamed from: K, reason: collision with root package name */
    private int f103694K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f103695L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f103696M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f103697N;

    /* renamed from: O, reason: collision with root package name */
    private int f103698O;

    /* renamed from: P, reason: collision with root package name */
    private Drawable f103699P;

    /* renamed from: Q, reason: collision with root package name */
    private final Runnable f103700Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f103701R;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (StickyNestedScrollView.this.f103692I != null) {
                StickyNestedScrollView stickyNestedScrollView = StickyNestedScrollView.this;
                int iJ0 = stickyNestedScrollView.j0(stickyNestedScrollView.f103692I);
                StickyNestedScrollView stickyNestedScrollView2 = StickyNestedScrollView.this;
                int iI0 = stickyNestedScrollView2.i0(stickyNestedScrollView2.f103692I);
                StickyNestedScrollView stickyNestedScrollView3 = StickyNestedScrollView.this;
                StickyNestedScrollView.this.invalidate(iJ0, iI0, stickyNestedScrollView3.k0(stickyNestedScrollView3.f103692I), (int) (StickyNestedScrollView.this.getScrollY() + StickyNestedScrollView.this.f103692I.getHeight() + StickyNestedScrollView.this.f103693J));
            }
            StickyNestedScrollView.this.postDelayed(this, 16L);
        }
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.meijer.mobile.meijer.O.f99504c);
    }

    private void n0(View view) {
        view.setAlpha(0.0f);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        h0(view);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_988dce9452b427d8dd3f8f4725297be8(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_988dce9452b427d8dd3f8f4725297be8(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_988dce9452b427d8dd3f8f4725297be8(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f103700Q = new a();
        this.f103701R = true;
        p0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.meijer.mobile.meijer.a0.f101813y, i10, com.meijer.mobile.meijer.Z.f101332d);
        this.f103698O = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.meijer.mobile.meijer.a0.f101780A, (int) ((context.getResources().getDisplayMetrics().density * 6.0f) + 0.5f));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.meijer.mobile.meijer.a0.f101814z, -1);
        if (resourceId != -1) {
            this.f103699P = Z1.b.e(context, resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void g0() {
        float fMin;
        Iterator<View> it = this.f103691H.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            int iM0 = (m0(next) - getScrollY()) + (this.f103696M ? 0 : getPaddingTop());
            if (iM0 <= 0) {
                if (view != null) {
                    if (iM0 > (m0(view) - getScrollY()) + (this.f103696M ? 0 : getPaddingTop())) {
                    }
                }
                view = next;
            } else {
                if (view2 != null) {
                    if (iM0 < (m0(view2) - getScrollY()) + (this.f103696M ? 0 : getPaddingTop())) {
                    }
                }
                view2 = next;
            }
        }
        if (view == null) {
            if (this.f103692I != null) {
                s0();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m0(view2) - getScrollY()) + (this.f103696M ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f103693J = fMin;
        View view3 = this.f103692I;
        if (view != view3) {
            if (view3 != null) {
                s0();
            }
            this.f103694K = j0(view);
            r0(view);
        }
    }

    private void h0(View view) {
        if (!(view instanceof ViewGroup)) {
            String str = (String) view.getTag();
            if (str == null || !str.contains("sticky")) {
                return;
            }
            this.f103691H.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            String strL0 = l0(viewGroup.getChildAt(i10));
            if (strL0 != null && strL0.contains("sticky")) {
                this.f103691H.add(viewGroup.getChildAt(i10));
            } else if (viewGroup.getChildAt(i10) instanceof ViewGroup) {
                h0(viewGroup.getChildAt(i10));
            }
        }
    }

    private void o0() {
        if (this.f103692I != null) {
            s0();
        }
        this.f103691H.clear();
        h0(getChildAt(0));
        g0();
        invalidate();
    }

    private void q0(View view) {
        view.setAlpha(1.0f);
    }

    private void r0(View view) {
        this.f103692I = view;
        if (l0(view).contains("-hastransparancy")) {
            n0(this.f103692I);
        }
        if (((String) this.f103692I.getTag()).contains("-nonconstant")) {
            post(this.f103700Q);
        }
    }

    private void s0() {
        if (l0(this.f103692I).contains("-hastransparancy")) {
            q0(this.f103692I);
        }
        this.f103692I = null;
        removeCallbacks(this.f103700Q);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f103695L) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f103693J) - m0(this.f103692I));
        }
        if (motionEvent.getAction() == 0) {
            this.f103701R = false;
        }
        if (this.f103701R) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f103701R = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f103701R = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p0() {
        this.f103691H = new ArrayList<>();
    }

    public void setShadowHeight(int i10) {
        this.f103698O = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0(View view) {
        int bottom = view.getBottom();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            bottom += view.getBottom();
        }
        return bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j0(View view) {
        int left = view.getLeft();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k0(View view) {
        int right = view.getRight();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    private String l0(View view) {
        return String.valueOf(view.getTag());
    }

    private int m0(View view) {
        int top = view.getTop();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        super.addView(view, i10);
        h0(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int paddingTop;
        float f10;
        float f11;
        fsSuperDispatchDraw_988dce9452b427d8dd3f8f4725297be8(canvas);
        if (this.f103692I != null) {
            canvas.save();
            float paddingLeft = getPaddingLeft() + this.f103694K;
            float scrollY = getScrollY() + this.f103693J;
            if (this.f103696M) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = 0;
            }
            canvas.translate(paddingLeft, scrollY + paddingTop);
            if (this.f103696M) {
                f10 = -this.f103693J;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(0.0f, f10, getWidth() - this.f103694K, this.f103692I.getHeight() + 1);
            if (this.f103699P != null) {
                int width = this.f103692I.getWidth();
                int height = this.f103692I.getHeight();
                this.f103699P.setBounds(0, height, width, this.f103698O + height);
                this.f103699P.draw(canvas);
            }
            if (this.f103696M) {
                f11 = -this.f103693J;
            } else {
                f11 = 0.0f;
            }
            canvas.clipRect(0.0f, f11, getWidth(), this.f103692I.getHeight());
            if (l0(this.f103692I).contains("-hastransparancy")) {
                q0(this.f103692I);
                this.f103692I.draw(canvas);
                n0(this.f103692I);
            } else {
                this.f103692I.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = true;
        if (motionEvent.getAction() == 0) {
            this.f103695L = true;
        }
        if (this.f103695L) {
            if (this.f103692I != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f103695L = z10;
            if (z10) {
                if (motionEvent.getY() > this.f103692I.getHeight() + this.f103693J || motionEvent.getX() < j0(this.f103692I) || motionEvent.getX() > k0(this.f103692I)) {
                    z11 = false;
                }
                this.f103695L = z11;
            }
        } else if (this.f103692I == null) {
            this.f103695L = false;
        }
        if (this.f103695L) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f103693J) - m0(this.f103692I)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f103697N) {
            this.f103696M = true;
        }
        o0();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        g0();
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        super.setClipToPadding(z10);
        this.f103696M = z10;
        this.f103697N = true;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        h0(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
        h0(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        h0(view);
    }
}
