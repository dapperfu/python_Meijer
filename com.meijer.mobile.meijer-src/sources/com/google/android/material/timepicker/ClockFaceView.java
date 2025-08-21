package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import ce.C6503b;
import ce.f;
import ce.h;
import ce.k;
import ce.l;
import com.google.android.material.timepicker.ClockHandView;
import j.C14879a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import q2.y;
import qe.C16634c;

/* loaded from: classes4.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.b {

    /* renamed from: A, reason: collision with root package name */
    private final ClockHandView f88761A;

    /* renamed from: B, reason: collision with root package name */
    private final Rect f88762B;

    /* renamed from: C, reason: collision with root package name */
    private final RectF f88763C;

    /* renamed from: D, reason: collision with root package name */
    private final Rect f88764D;

    /* renamed from: E, reason: collision with root package name */
    private final SparseArray<TextView> f88765E;

    /* renamed from: F, reason: collision with root package name */
    private final androidx.core.view.a f88766F;

    /* renamed from: G, reason: collision with root package name */
    private final int[] f88767G;

    /* renamed from: H, reason: collision with root package name */
    private final float[] f88768H;

    /* renamed from: I, reason: collision with root package name */
    private final int f88769I;

    /* renamed from: J, reason: collision with root package name */
    private final int f88770J;

    /* renamed from: K, reason: collision with root package name */
    private final int f88771K;

    /* renamed from: L, reason: collision with root package name */
    private final int f88772L;

    /* renamed from: M, reason: collision with root package name */
    private String[] f88773M;

    /* renamed from: N, reason: collision with root package name */
    private float f88774N;

    /* renamed from: O, reason: collision with root package name */
    private final ColorStateList f88775O;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f88761A.i()) - ClockFaceView.this.f88769I);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f88762B);
            float fCenterX = ClockFaceView.this.f88762B.centerX();
            float fCenterY = ClockFaceView.this.f88762B.centerY();
            ClockFaceView.this.f88761A.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f88761A.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            int iIntValue = ((Integer) view.getTag(f.f61716t)).intValue();
            if (iIntValue > 0) {
                yVar.Z0((View) ClockFaceView.this.f88765E.get(iIntValue - 1));
            }
            yVar.s0(y.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            yVar.q0(true);
            yVar.b(y.a.f157841i);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61500G);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f88762B = new Rect();
        this.f88763C = new RectF();
        this.f88764D = new Rect();
        this.f88765E = new SparseArray<>();
        this.f88768H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f61984N1, i10, k.f61797J);
        Resources resources = getResources();
        ColorStateList colorStateListA = C16634c.a(context, typedArrayObtainStyledAttributes, l.f62007P1);
        this.f88775O = colorStateListA;
        LayoutInflater.from(context).inflate(h.f61744o, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f61710n);
        this.f88761A = clockHandView;
        this.f88769I = resources.getDimensionPixelSize(ce.d.f61584E);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f88767G = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C14879a.a(context, ce.c.f61571g).getDefaultColor();
        ColorStateList colorStateListA2 = C16634c.a(context, typedArrayObtainStyledAttributes, l.f61996O1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f88766F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        R(strArr, 0);
        this.f88770J = resources.getDimensionPixelSize(ce.d.f61597R);
        this.f88771K = resources.getDimensionPixelSize(ce.d.f61598S);
        this.f88772L = resources.getDimensionPixelSize(ce.d.f61586G);
    }

    private void N() {
        RectF rectFE = this.f88761A.e();
        TextView textViewP = P(rectFE);
        for (int i10 = 0; i10 < this.f88765E.size(); i10++) {
            TextView textView = this.f88765E.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewP);
                textView.getPaint().setShader(O(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.f88762B);
        this.f88763C.set(this.f88762B);
        textView.getLineBounds(0, this.f88764D);
        RectF rectF2 = this.f88763C;
        Rect rect = this.f88764D;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f88763C)) {
            return new RadialGradient(rectF.centerX() - this.f88763C.left, rectF.centerY() - this.f88763C.top, rectF.width() * 0.5f, this.f88767G, this.f88768H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void R(String[] strArr, int i10) {
        this.f88773M = strArr;
        S(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void d(float f10, boolean z10) {
        if (Math.abs(this.f88774N - f10) > 0.001f) {
            this.f88774N = f10;
            N();
        }
    }

    private TextView P(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f88765E.size(); i10++) {
            TextView textView2 = this.f88765E.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f88762B);
                this.f88763C.set(this.f88762B);
                this.f88763C.union(rectF);
                float fWidth = this.f88763C.width() * this.f88763C.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float Q(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void S(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f88765E.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f88773M.length, size); i11++) {
            TextView textView = this.f88765E.get(i11);
            if (i11 >= this.f88773M.length) {
                removeView(textView);
                this.f88765E.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f61743n, (ViewGroup) this, false);
                    this.f88765E.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f88773M[i11]);
                textView.setTag(f.f61716t, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(f.f61711o, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                ViewCompat.m0(textView, this.f88766F);
                textView.setTextColor(this.f88775O);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f88773M[i11]));
                }
            }
        }
        this.f88761A.p(z10);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void F(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i10 != E()) {
            super.F(i10);
            this.f88761A.l(E());
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void H() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.H();
        for (int i10 = 0; i10 < this.f88765E.size(); i10++) {
            this.f88765E.get(i10).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y.g1(accessibilityNodeInfo).r0(y.e.b(1, this.f88773M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iQ = (int) (this.f88772L / Q(this.f88770J / displayMetrics.heightPixels, this.f88771K / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
        setMeasuredDimension(iQ, iQ);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
