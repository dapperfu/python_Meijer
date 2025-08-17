package com.google.android.material.timepicker;

import ae.C5597b;
import ae.f;
import ae.h;
import ae.k;
import ae.l;
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
import com.google.android.material.timepicker.ClockHandView;
import j.C14791a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import oe.C16026c;
import q2.y;

/* loaded from: classes4.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.b {

    /* renamed from: A, reason: collision with root package name */
    private final ClockHandView f87921A;

    /* renamed from: B, reason: collision with root package name */
    private final Rect f87922B;

    /* renamed from: C, reason: collision with root package name */
    private final RectF f87923C;

    /* renamed from: D, reason: collision with root package name */
    private final Rect f87924D;

    /* renamed from: E, reason: collision with root package name */
    private final SparseArray<TextView> f87925E;

    /* renamed from: F, reason: collision with root package name */
    private final androidx.core.view.a f87926F;

    /* renamed from: G, reason: collision with root package name */
    private final int[] f87927G;

    /* renamed from: H, reason: collision with root package name */
    private final float[] f87928H;

    /* renamed from: I, reason: collision with root package name */
    private final int f87929I;

    /* renamed from: J, reason: collision with root package name */
    private final int f87930J;

    /* renamed from: K, reason: collision with root package name */
    private final int f87931K;

    /* renamed from: L, reason: collision with root package name */
    private final int f87932L;

    /* renamed from: M, reason: collision with root package name */
    private String[] f87933M;

    /* renamed from: N, reason: collision with root package name */
    private float f87934N;

    /* renamed from: O, reason: collision with root package name */
    private final ColorStateList f87935O;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f87921A.i()) - ClockFaceView.this.f87929I);
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
            view.getHitRect(ClockFaceView.this.f87922B);
            float fCenterX = ClockFaceView.this.f87922B.centerX();
            float fCenterY = ClockFaceView.this.f87922B.centerY();
            ClockFaceView.this.f87921A.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f87921A.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            int iIntValue = ((Integer) view.getTag(f.f44701t)).intValue();
            if (iIntValue > 0) {
                yVar.Z0((View) ClockFaceView.this.f87925E.get(iIntValue - 1));
            }
            yVar.s0(y.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            yVar.q0(true);
            yVar.b(y.a.f156728i);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44485G);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87922B = new Rect();
        this.f87923C = new RectF();
        this.f87924D = new Rect();
        this.f87925E = new SparseArray<>();
        this.f87928H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f44969N1, i10, k.f44782J);
        Resources resources = getResources();
        ColorStateList colorStateListA = C16026c.a(context, typedArrayObtainStyledAttributes, l.f44992P1);
        this.f87935O = colorStateListA;
        LayoutInflater.from(context).inflate(h.f44729o, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f44695n);
        this.f87921A = clockHandView;
        this.f87929I = resources.getDimensionPixelSize(ae.d.f44569E);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f87927G = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C14791a.a(context, ae.c.f44556g).getDefaultColor();
        ColorStateList colorStateListA2 = C16026c.a(context, typedArrayObtainStyledAttributes, l.f44981O1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f87926F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        R(strArr, 0);
        this.f87930J = resources.getDimensionPixelSize(ae.d.f44582R);
        this.f87931K = resources.getDimensionPixelSize(ae.d.f44583S);
        this.f87932L = resources.getDimensionPixelSize(ae.d.f44571G);
    }

    private void N() {
        RectF rectFE = this.f87921A.e();
        TextView textViewP = P(rectFE);
        for (int i10 = 0; i10 < this.f87925E.size(); i10++) {
            TextView textView = this.f87925E.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewP);
                textView.getPaint().setShader(O(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.f87922B);
        this.f87923C.set(this.f87922B);
        textView.getLineBounds(0, this.f87924D);
        RectF rectF2 = this.f87923C;
        Rect rect = this.f87924D;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f87923C)) {
            return new RadialGradient(rectF.centerX() - this.f87923C.left, rectF.centerY() - this.f87923C.top, rectF.width() * 0.5f, this.f87927G, this.f87928H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void R(String[] strArr, int i10) {
        this.f87933M = strArr;
        S(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void d(float f10, boolean z10) {
        if (Math.abs(this.f87934N - f10) > 0.001f) {
            this.f87934N = f10;
            N();
        }
    }

    private TextView P(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f87925E.size(); i10++) {
            TextView textView2 = this.f87925E.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f87922B);
                this.f87923C.set(this.f87922B);
                this.f87923C.union(rectF);
                float fWidth = this.f87923C.width() * this.f87923C.height();
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
        int size = this.f87925E.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f87933M.length, size); i11++) {
            TextView textView = this.f87925E.get(i11);
            if (i11 >= this.f87933M.length) {
                removeView(textView);
                this.f87925E.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f44728n, (ViewGroup) this, false);
                    this.f87925E.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f87933M[i11]);
                textView.setTag(f.f44701t, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(f.f44696o, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                ViewCompat.m0(textView, this.f87926F);
                textView.setTextColor(this.f87935O);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f87933M[i11]));
                }
            }
        }
        this.f87921A.p(z10);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void F(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i10 != E()) {
            super.F(i10);
            this.f87921A.l(E());
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void H() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.H();
        for (int i10 = 0; i10 < this.f87925E.size(); i10++) {
            this.f87925E.get(i10).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y.g1(accessibilityNodeInfo).r0(y.e.b(1, this.f87933M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iQ = (int) (this.f87932L / Q(this.f87930J / displayMetrics.heightPixels, this.f87931K / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
        setMeasuredDimension(iQ, iQ);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
