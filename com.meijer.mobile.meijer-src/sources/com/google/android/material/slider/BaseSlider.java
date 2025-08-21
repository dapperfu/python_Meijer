package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import ce.C6503b;
import ce.j;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.google.android.material.internal.s;
import com.google.android.material.internal.v;
import com.google.android.material.internal.x;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import d2.C13595a;
import de.C13661a;
import h2.C14442a;
import j.C14879a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pe.i;
import q2.y;
import qe.C16634c;
import te.C17234h;
import te.C17239m;
import we.C17867a;
import x2.AbstractC18058a;
import xe.C18173a;

/* loaded from: classes4.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {

    /* renamed from: v0, reason: collision with root package name */
    private static final String f88238v0 = "BaseSlider";

    /* renamed from: A, reason: collision with root package name */
    private int f88243A;

    /* renamed from: B, reason: collision with root package name */
    private int f88244B;

    /* renamed from: C, reason: collision with root package name */
    private int f88245C;

    /* renamed from: D, reason: collision with root package name */
    private int f88246D;

    /* renamed from: E, reason: collision with root package name */
    private int f88247E;

    /* renamed from: F, reason: collision with root package name */
    private int f88248F;

    /* renamed from: G, reason: collision with root package name */
    private int f88249G;

    /* renamed from: H, reason: collision with root package name */
    private int f88250H;

    /* renamed from: I, reason: collision with root package name */
    private int f88251I;

    /* renamed from: J, reason: collision with root package name */
    private int f88252J;

    /* renamed from: K, reason: collision with root package name */
    private int f88253K;

    /* renamed from: L, reason: collision with root package name */
    private int f88254L;

    /* renamed from: M, reason: collision with root package name */
    private int f88255M;

    /* renamed from: N, reason: collision with root package name */
    private float f88256N;

    /* renamed from: O, reason: collision with root package name */
    private MotionEvent f88257O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f88258P;

    /* renamed from: Q, reason: collision with root package name */
    private float f88259Q;

    /* renamed from: R, reason: collision with root package name */
    private float f88260R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList<Float> f88261S;

    /* renamed from: T, reason: collision with root package name */
    private int f88262T;

    /* renamed from: U, reason: collision with root package name */
    private int f88263U;

    /* renamed from: V, reason: collision with root package name */
    private float f88264V;

    /* renamed from: W, reason: collision with root package name */
    private float[] f88265W;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f88266a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f88267a0;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f88268b;

    /* renamed from: b0, reason: collision with root package name */
    private int f88269b0;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f88270c;

    /* renamed from: c0, reason: collision with root package name */
    private int f88271c0;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f88272d;

    /* renamed from: d0, reason: collision with root package name */
    private int f88273d0;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f88274e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f88275e0;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f88276f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f88277f0;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f88278g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f88279g0;

    /* renamed from: h, reason: collision with root package name */
    private final e f88280h;

    /* renamed from: h0, reason: collision with root package name */
    private ColorStateList f88281h0;

    /* renamed from: i, reason: collision with root package name */
    private final AccessibilityManager f88282i;

    /* renamed from: i0, reason: collision with root package name */
    private ColorStateList f88283i0;

    /* renamed from: j, reason: collision with root package name */
    private BaseSlider<S, L, T>.d f88284j;

    /* renamed from: j0, reason: collision with root package name */
    private ColorStateList f88285j0;

    /* renamed from: k, reason: collision with root package name */
    private int f88286k;

    /* renamed from: k0, reason: collision with root package name */
    private ColorStateList f88287k0;

    /* renamed from: l, reason: collision with root package name */
    private final List<C18173a> f88288l;

    /* renamed from: l0, reason: collision with root package name */
    private ColorStateList f88289l0;

    /* renamed from: m, reason: collision with root package name */
    private final List<L> f88290m;

    /* renamed from: m0, reason: collision with root package name */
    private final Path f88291m0;

    /* renamed from: n, reason: collision with root package name */
    private final List<T> f88292n;

    /* renamed from: n0, reason: collision with root package name */
    private final RectF f88293n0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f88294o;

    /* renamed from: o0, reason: collision with root package name */
    private final RectF f88295o0;

    /* renamed from: p, reason: collision with root package name */
    private ValueAnimator f88296p;

    /* renamed from: p0, reason: collision with root package name */
    private final C17234h f88297p0;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f88298q;

    /* renamed from: q0, reason: collision with root package name */
    private Drawable f88299q0;

    /* renamed from: r, reason: collision with root package name */
    private final int f88300r;

    /* renamed from: r0, reason: collision with root package name */
    private List<Drawable> f88301r0;

    /* renamed from: s, reason: collision with root package name */
    private int f88302s;

    /* renamed from: s0, reason: collision with root package name */
    private float f88303s0;

    /* renamed from: t, reason: collision with root package name */
    private int f88304t;

    /* renamed from: t0, reason: collision with root package name */
    private int f88305t0;

    /* renamed from: u, reason: collision with root package name */
    private int f88306u;

    /* renamed from: u0, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f88307u0;

    /* renamed from: v, reason: collision with root package name */
    private int f88308v;

    /* renamed from: w, reason: collision with root package name */
    private int f88309w;

    /* renamed from: x, reason: collision with root package name */
    private int f88310x;

    /* renamed from: y, reason: collision with root package name */
    private int f88311y;

    /* renamed from: z, reason: collision with root package name */
    private int f88312z;

    /* renamed from: w0, reason: collision with root package name */
    static final int f88239w0 = k.f61796I;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f88240x0 = C6503b.f61505L;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f88241y0 = C6503b.f61508O;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f88242z0 = C6503b.f61512S;

    /* renamed from: A0, reason: collision with root package name */
    private static final int f88237A0 = C6503b.f61510Q;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f88288l.iterator();
            while (it.hasNext()) {
                ((C18173a) it.next()).A0(fFloatValue);
            }
            ViewCompat.d0(BaseSlider.this);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            v vVarG = x.g(BaseSlider.this);
            Iterator it = BaseSlider.this.f88288l.iterator();
            while (it.hasNext()) {
                vVarG.b((C18173a) it.next());
            }
        }
    }

    private class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        int f88316a;

        private d() {
            this.f88316a = -1;
        }

        void a(int i10) {
            this.f88316a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f88280h.W(this.f88316a, 4);
        }

        /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    private static class e extends AbstractC18058a {

        /* renamed from: q, reason: collision with root package name */
        private final BaseSlider<?, ?, ?> f88318q;

        /* renamed from: r, reason: collision with root package name */
        final Rect f88319r;

        @Override // x2.AbstractC18058a
        protected int B(float f10, float f11) {
            for (int i10 = 0; i10 < this.f88318q.getValues().size(); i10++) {
                this.f88318q.o0(i10, this.f88319r);
                if (this.f88319r.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // x2.AbstractC18058a
        protected void C(List<Integer> list) {
            for (int i10 = 0; i10 < this.f88318q.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }

        private String Z(int i10) {
            return i10 == this.f88318q.getValues().size() + (-1) ? this.f88318q.getContext().getString(j.f61771j) : i10 == 0 ? this.f88318q.getContext().getString(j.f61772k) : "";
        }

        @Override // x2.AbstractC18058a
        protected boolean L(int i10, int i11, Bundle bundle) {
            if (!this.f88318q.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f88318q.m0(i10, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f88318q.p0();
                        this.f88318q.postInvalidate();
                        E(i10);
                        return true;
                    }
                }
                return false;
            }
            float fM = this.f88318q.m(20);
            if (i11 == 8192) {
                fM = -fM;
            }
            if (this.f88318q.O()) {
                fM = -fM;
            }
            if (!this.f88318q.m0(i10, C14442a.a(this.f88318q.getValues().get(i10).floatValue() + fM, this.f88318q.getValueFrom(), this.f88318q.getValueTo()))) {
                return false;
            }
            this.f88318q.p0();
            this.f88318q.postInvalidate();
            E(i10);
            return true;
        }

        @Override // x2.AbstractC18058a
        protected void P(int i10, y yVar) {
            yVar.b(y.a.f157826L);
            List<Float> values = this.f88318q.getValues();
            float fFloatValue = values.get(i10).floatValue();
            float valueFrom = this.f88318q.getValueFrom();
            float valueTo = this.f88318q.getValueTo();
            if (this.f88318q.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    yVar.a(8192);
                }
                if (fFloatValue < valueTo) {
                    yVar.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
            }
            yVar.O0(y.g.a(1, valueFrom, valueTo, fFloatValue));
            yVar.p0(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f88318q.getContentDescription() != null) {
                sb2.append(this.f88318q.getContentDescription());
                sb2.append(",");
            }
            String strB = this.f88318q.B(fFloatValue);
            String string = this.f88318q.getContext().getString(j.f61773l);
            if (values.size() > 1) {
                string = Z(i10);
            }
            sb2.append(String.format(Locale.US, "%s, %s", string, strB));
            yVar.t0(sb2.toString());
            this.f88318q.o0(i10, this.f88319r);
            yVar.l0(this.f88319r);
        }

        e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f88319r = new Rect();
            this.f88318q = baseSlider;
        }
    }

    private enum f {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        float f88325a;

        /* renamed from: b, reason: collision with root package name */
        float f88326b;

        /* renamed from: c, reason: collision with root package name */
        ArrayList<Float> f88327c;

        /* renamed from: d, reason: collision with root package name */
        float f88328d;

        /* renamed from: e, reason: collision with root package name */
        boolean f88329e;

        class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }

            a() {
            }
        }

        /* synthetic */ g(Parcel parcel, a aVar) {
            this(parcel);
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        private g(Parcel parcel) {
            super(parcel);
            this.f88325a = parcel.readFloat();
            this.f88326b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f88327c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f88328d = parcel.readFloat();
            this.f88329e = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f88325a);
            parcel.writeFloat(this.f88326b);
            parcel.writeList(this.f88327c);
            parcel.writeFloat(this.f88328d);
            parcel.writeBooleanArray(new boolean[]{this.f88329e});
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61519Z);
    }

    private void A(int i10) {
        if (i10 == 1) {
            X(a.e.API_PRIORITY_OTHER);
            return;
        }
        if (i10 == 2) {
            X(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            Y(a.e.API_PRIORITY_OTHER);
        } else {
            if (i10 != 66) {
                return;
            }
            Y(Integer.MIN_VALUE);
        }
    }

    private static boolean L(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private float r(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - this.f88246D) / this.f88273d0;
        float f12 = this.f88259Q;
        return (f11 * (f12 - this.f88260R)) + f12;
    }

    private void v(Canvas canvas, int i10, int i11) {
        float[] activeRange = getActiveRange();
        float f10 = i10;
        float f11 = this.f88246D + (activeRange[1] * f10);
        if (f11 < r2 + i10) {
            if (G()) {
                float f12 = i11;
                int i12 = this.f88245C;
                this.f88293n0.set(f11 + this.f88250H, f12 - (i12 / 2.0f), this.f88246D + i10 + (i12 / 2.0f), f12 + (i12 / 2.0f));
                r0(canvas, this.f88266a, this.f88293n0, f.RIGHT);
            } else {
                this.f88266a.setStyle(Paint.Style.STROKE);
                this.f88266a.setStrokeCap(Paint.Cap.ROUND);
                float f13 = i11;
                canvas.drawLine(f11, f13, this.f88246D + i10, f13, this.f88266a);
            }
        }
        int i13 = this.f88246D;
        float f14 = (activeRange[0] * f10) + i13;
        if (f14 > i13) {
            if (!G()) {
                this.f88266a.setStyle(Paint.Style.STROKE);
                this.f88266a.setStrokeCap(Paint.Cap.ROUND);
                float f15 = i11;
                canvas.drawLine(this.f88246D, f15, f14, f15, this.f88266a);
                return;
            }
            RectF rectF = this.f88293n0;
            float f16 = this.f88246D;
            int i14 = this.f88245C;
            float f17 = i11;
            rectF.set(f16 - (i14 / 2.0f), f17 - (i14 / 2.0f), f14 - this.f88250H, f17 + (i14 / 2.0f));
            r0(canvas, this.f88266a, this.f88293n0, f.LEFT);
        }
    }

    private void x(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.f88261S.size()) {
            float fFloatValue = this.f88261S.get(i14).floatValue();
            Drawable drawable = this.f88299q0;
            if (drawable != null) {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                w(canvas2, i12, i13, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                if (i14 < this.f88301r0.size()) {
                    w(canvas2, i12, i13, fFloatValue, this.f88301r0.get(i14));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.f88246D + (Z(fFloatValue) * i12), i13, getThumbRadius(), this.f88270c);
                    }
                    w(canvas2, i12, i13, fFloatValue, this.f88297p0);
                }
            }
            i14++;
            canvas = canvas2;
            i10 = i12;
            i11 = i13;
        }
    }

    public boolean H() {
        return false;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.f88277f0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(FS.Resources_getDrawable(getResources(), i10));
    }

    void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = FS.Resources_getDrawable(getResources(), iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setLabelFormatter(com.google.android.material.slider.d dVar) {
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.f88259Q), Float.valueOf(this.f88260R)));
        }
        if (this.f88264V != f10) {
            this.f88264V = f10;
            this.f88279g0 = true;
            postInvalidate();
        }
    }

    void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88315a;

        static {
            int[] iArr = new int[f.values().length];
            f88315a = iArr;
            try {
                iArr[f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88315a[f.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88315a[f.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88315a[f.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(C17867a.c(context, attributeSet, i10, f88239w0), attributeSet, i10);
        this.f88288l = new ArrayList();
        this.f88290m = new ArrayList();
        this.f88292n = new ArrayList();
        this.f88294o = false;
        this.f88251I = -1;
        this.f88252J = -1;
        this.f88258P = false;
        this.f88261S = new ArrayList<>();
        this.f88262T = -1;
        this.f88263U = -1;
        this.f88264V = 0.0f;
        this.f88267a0 = true;
        this.f88277f0 = false;
        this.f88291m0 = new Path();
        this.f88293n0 = new RectF();
        this.f88295o0 = new RectF();
        C17234h c17234h = new C17234h();
        this.f88297p0 = c17234h;
        this.f88301r0 = Collections.EMPTY_LIST;
        this.f88305t0 = 0;
        this.f88307u0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f88330a.q0();
            }
        };
        Context context2 = getContext();
        this.f88266a = new Paint();
        this.f88268b = new Paint();
        Paint paint = new Paint(1);
        this.f88270c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f88272d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f88274e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f88276f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f88278g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Q(context2.getResources());
        f0(context2, attributeSet, i10);
        setFocusable(true);
        setClickable(true);
        c17234h.h0(2);
        this.f88300r = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f88280h = eVar;
        ViewCompat.m0(this, eVar);
        this.f88282i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private boolean A0(float f10) {
        return M(new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.f88259Q)), MathContext.DECIMAL64).doubleValue());
    }

    private static float C(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private void C0() {
        float f10 = this.f88264V;
        if (f10 == 0.0f) {
            return;
        }
        if (((int) f10) != f10) {
            FS.log_w(f88238v0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f10)));
        }
        float f11 = this.f88259Q;
        if (((int) f11) != f11) {
            FS.log_w(f88238v0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f11)));
        }
        float f12 = this.f88260R;
        if (((int) f12) != f12) {
            FS.log_w(f88238v0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f12)));
        }
    }

    private float[] F(float f10, float f11) {
        return new float[]{f10, f10, f11, f11, f11, f11, f10, f10};
    }

    private boolean G() {
        return this.f88250H > 0;
    }

    private void J() {
        this.f88266a.setStrokeWidth(this.f88245C);
        this.f88268b.setStrokeWidth(this.f88245C);
    }

    private boolean M(double d10) {
        double dDoubleValue = new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Float.toString(this.f88264V)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    private boolean P() {
        Rect rect = new Rect();
        x.f(this).getHitRect(rect);
        return getLocalVisibleRect(rect);
    }

    private void Q(Resources resources) throws Resources.NotFoundException {
        this.f88312z = resources.getDimensionPixelSize(ce.d.f61651w0);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ce.d.f61649v0);
        this.f88302s = dimensionPixelOffset;
        this.f88246D = dimensionPixelOffset;
        this.f88304t = resources.getDimensionPixelSize(ce.d.f61641r0);
        this.f88306u = resources.getDimensionPixelSize(ce.d.f61647u0);
        this.f88308v = resources.getDimensionPixelSize(ce.d.f61645t0);
        this.f88309w = resources.getDimensionPixelSize(ce.d.f61645t0);
        this.f88310x = resources.getDimensionPixelSize(ce.d.f61643s0);
        this.f88255M = resources.getDimensionPixelSize(ce.d.f61639q0);
    }

    private void R() {
        if (this.f88264V <= 0.0f) {
            return;
        }
        u0();
        int iMin = Math.min((int) (((this.f88260R - this.f88259Q) / this.f88264V) + 1.0f), (this.f88273d0 / this.f88310x) + 1);
        float[] fArr = this.f88265W;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f88265W = new float[iMin * 2];
        }
        float f10 = this.f88273d0 / (iMin - 1);
        for (int i10 = 0; i10 < iMin * 2; i10 += 2) {
            float[] fArr2 = this.f88265W;
            fArr2[i10] = this.f88246D + ((i10 / 2.0f) * f10);
            fArr2[i10 + 1] = n();
        }
    }

    private void T(Canvas canvas, int i10) {
        if (this.f88253K <= 0) {
            return;
        }
        if (this.f88261S.size() >= 1) {
            ArrayList<Float> arrayList = this.f88261S;
            float fFloatValue = arrayList.get(arrayList.size() - 1).floatValue();
            float f10 = this.f88260R;
            if (fFloatValue < f10) {
                canvas.drawPoint(B0(f10), i10, this.f88278g);
            }
        }
        if (this.f88261S.size() > 1) {
            float fFloatValue2 = this.f88261S.get(0).floatValue();
            float f11 = this.f88259Q;
            if (fFloatValue2 > f11) {
                canvas.drawPoint(B0(f11), i10, this.f88278g);
            }
        }
    }

    private void U(Canvas canvas) {
        if (!this.f88267a0 || this.f88264V <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iCeil = (int) Math.ceil(activeRange[0] * ((this.f88265W.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(activeRange[1] * ((this.f88265W.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            canvas.drawPoints(this.f88265W, 0, iCeil * 2, this.f88274e);
        }
        if (iCeil <= iFloor) {
            canvas.drawPoints(this.f88265W, iCeil * 2, ((iFloor - iCeil) + 1) * 2, this.f88276f);
        }
        int i10 = (iFloor + 1) * 2;
        float[] fArr = this.f88265W;
        if (i10 < fArr.length) {
            canvas.drawPoints(fArr, i10, fArr.length - i10, this.f88274e);
        }
    }

    private boolean V() {
        int iMax = this.f88302s + Math.max(Math.max(Math.max((this.f88247E / 2) - this.f88304t, 0), Math.max((this.f88245C - this.f88306u) / 2, 0)), Math.max(Math.max(this.f88269b0 - this.f88308v, 0), Math.max(this.f88271c0 - this.f88309w, 0)));
        if (this.f88246D == iMax) {
            return false;
        }
        this.f88246D = iMax;
        if (!ViewCompat.S(this)) {
            return true;
        }
        s0(getWidth());
        return true;
    }

    private boolean X(int i10) {
        int i11 = this.f88263U;
        int iC = (int) C14442a.c(i11 + i10, 0L, this.f88261S.size() - 1);
        this.f88263U = iC;
        if (iC == i11) {
            return false;
        }
        if (this.f88262T != -1) {
            this.f88262T = iC;
        }
        p0();
        postInvalidate();
        return true;
    }

    private float Z(float f10) {
        float f11 = this.f88259Q;
        float f12 = (f10 - f11) / (this.f88260R - f11);
        return O() ? 1.0f - f12 : f12;
    }

    private Boolean a0(int i10, KeyEvent keyEvent) {
        if (i10 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(X(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(X(-1)) : Boolean.FALSE;
        }
        if (i10 != 66) {
            if (i10 != 81) {
                if (i10 == 69) {
                    X(-1);
                    return Boolean.TRUE;
                }
                if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            Y(-1);
                            break;
                        case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                            Y(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            X(1);
            return Boolean.TRUE;
        }
        this.f88262T = this.f88263U;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void b0() {
        Iterator<T> it = this.f88292n.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void c0() {
        Iterator<T> it = this.f88292n.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    private void e0(C18173a c18173a, float f10) {
        int iZ = (this.f88246D + ((int) (Z(f10) * this.f88273d0))) - (c18173a.getIntrinsicWidth() / 2);
        int iN = n() - (this.f88255M + (this.f88248F / 2));
        c18173a.setBounds(iZ, iN - c18173a.getIntrinsicHeight(), c18173a.getIntrinsicWidth() + iZ, iN);
        Rect rect = new Rect(c18173a.getBounds());
        com.google.android.material.internal.d.c(x.f(this), this, rect);
        c18173a.setBounds(rect);
    }

    private void f0(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = s.i(context, attributeSet, l.f62170d7, i10, f88239w0, new int[0]);
        this.f88286k = typedArrayI.getResourceId(l.f62266l7, k.f61799L);
        this.f88259Q = typedArrayI.getFloat(l.f62206g7, 0.0f);
        this.f88260R = typedArrayI.getFloat(l.f62218h7, 1.0f);
        setValues(Float.valueOf(this.f88259Q));
        this.f88264V = typedArrayI.getFloat(l.f62194f7, 0.0f);
        this.f88311y = (int) Math.ceil(typedArrayI.getDimension(l.f62278m7, (float) Math.ceil(x.d(getContext(), 48))));
        boolean zHasValue = typedArrayI.hasValue(l.f61846B7);
        int i11 = zHasValue ? l.f61846B7 : l.f61870D7;
        int i12 = zHasValue ? l.f61846B7 : l.f61858C7;
        ColorStateList colorStateListA = C16634c.a(context, typedArrayI, i11);
        if (colorStateListA == null) {
            colorStateListA = C14879a.a(context, ce.c.f61570f);
        }
        setTrackInactiveTintList(colorStateListA);
        ColorStateList colorStateListA2 = C16634c.a(context, typedArrayI, i12);
        if (colorStateListA2 == null) {
            colorStateListA2 = C14879a.a(context, ce.c.f61567c);
        }
        setTrackActiveTintList(colorStateListA2);
        this.f88297p0.b0(C16634c.a(context, typedArrayI, l.f62290n7));
        if (typedArrayI.hasValue(l.f62338r7)) {
            setThumbStrokeColor(C16634c.a(context, typedArrayI, l.f62338r7));
        }
        setThumbStrokeWidth(typedArrayI.getDimension(l.f62350s7, 0.0f));
        ColorStateList colorStateListA3 = C16634c.a(context, typedArrayI, l.f62230i7);
        if (colorStateListA3 == null) {
            colorStateListA3 = C14879a.a(context, ce.c.f61568d);
        }
        setHaloTintList(colorStateListA3);
        this.f88267a0 = typedArrayI.getBoolean(l.f61834A7, true);
        boolean zHasValue2 = typedArrayI.hasValue(l.f62386v7);
        int i13 = zHasValue2 ? l.f62386v7 : l.f62410x7;
        int i14 = zHasValue2 ? l.f62386v7 : l.f62398w7;
        ColorStateList colorStateListA4 = C16634c.a(context, typedArrayI, i13);
        if (colorStateListA4 == null) {
            colorStateListA4 = C14879a.a(context, ce.c.f61569e);
        }
        setTickInactiveTintList(colorStateListA4);
        ColorStateList colorStateListA5 = C16634c.a(context, typedArrayI, i14);
        if (colorStateListA5 == null) {
            colorStateListA5 = C14879a.a(context, ce.c.f61566b);
        }
        setTickActiveTintList(colorStateListA5);
        setThumbTrackGapSize(typedArrayI.getDimensionPixelSize(l.f62362t7, 0));
        setTrackStopIndicatorSize(typedArrayI.getDimensionPixelSize(l.f61906G7, 0));
        setTrackInsideCornerSize(typedArrayI.getDimensionPixelSize(l.f61894F7, 0));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f62326q7, 0) * 2;
        int dimensionPixelSize2 = typedArrayI.getDimensionPixelSize(l.f62374u7, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayI.getDimensionPixelSize(l.f62314p7, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayI.getDimensionPixelSize(l.f62242j7, 0));
        setThumbElevation(typedArrayI.getDimension(l.f62302o7, 0.0f));
        setTrackHeight(typedArrayI.getDimensionPixelSize(l.f61882E7, 0));
        setTickActiveRadius(typedArrayI.getDimensionPixelSize(l.f62422y7, this.f88253K / 2));
        setTickInactiveRadius(typedArrayI.getDimensionPixelSize(l.f62434z7, this.f88253K / 2));
        setLabelBehavior(typedArrayI.getInt(l.f62254k7, 0));
        if (!typedArrayI.getBoolean(l.f62182e7, true)) {
            setEnabled(false);
        }
        typedArrayI.recycle();
    }

    private void g0(int i10) {
        BaseSlider<S, L, T>.d dVar = this.f88284j;
        if (dVar == null) {
            this.f88284j = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.f88284j.a(i10);
        postDelayed(this.f88284j, 200L);
    }

    private float[] getActiveRange() {
        float fFloatValue = this.f88261S.get(0).floatValue();
        ArrayList<Float> arrayList = this.f88261S;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.f88261S.size() == 1) {
            fFloatValue = this.f88259Q;
        }
        float fZ = Z(fFloatValue);
        float fZ2 = Z(fFloatValue2);
        return O() ? new float[]{fZ2, fZ} : new float[]{fZ, fZ2};
    }

    private float getValueOfTouchPosition() {
        double dL0 = l0(this.f88303s0);
        if (O()) {
            dL0 = 1.0d - dL0;
        }
        float f10 = this.f88260R;
        return (float) ((dL0 * (f10 - r3)) + this.f88259Q);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.f88303s0;
        if (O()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.f88260R;
        float f12 = this.f88259Q;
        return (f10 * (f11 - f12)) + f12;
    }

    private boolean i0() {
        return this.f88244B == 3;
    }

    private boolean j0() {
        return this.f88275e0 || !(getBackground() instanceof RippleDrawable);
    }

    private Float k(int i10) {
        float fM = this.f88277f0 ? m(20) : l();
        if (i10 == 21) {
            if (!O()) {
                fM = -fM;
            }
            return Float.valueOf(fM);
        }
        if (i10 == 22) {
            if (O()) {
                fM = -fM;
            }
            return Float.valueOf(fM);
        }
        if (i10 == 69) {
            return Float.valueOf(-fM);
        }
        if (i10 == 70 || i10 == 81) {
            return Float.valueOf(fM);
        }
        return null;
    }

    private boolean k0(float f10) {
        return m0(this.f88262T, f10);
    }

    private float l() {
        float f10 = this.f88264V;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    private double l0(float f10) {
        float f11 = this.f88264V;
        if (f11 <= 0.0f) {
            return f10;
        }
        return Math.round(f10 * r0) / ((int) ((this.f88260R - this.f88259Q) / f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m0(int i10, float f10) {
        this.f88263U = i10;
        if (Math.abs(f10 - this.f88261S.get(i10).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f88261S.set(i10, Float.valueOf(D(i10, f10)));
        s(i10);
        return true;
    }

    private int n() {
        return (this.f88243A / 2) + ((this.f88244B == 1 || i0()) ? this.f88288l.get(0).getIntrinsicHeight() : 0);
    }

    private ValueAnimator o(boolean z10) {
        int iF;
        TimeInterpolator timeInterpolatorG;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(C(z10 ? this.f88298q : this.f88296p, z10 ? 0.0f : 1.0f), z10 ? 1.0f : 0.0f);
        if (z10) {
            iF = i.f(getContext(), f88240x0, 83);
            timeInterpolatorG = i.g(getContext(), f88242z0, C13661a.f128354e);
        } else {
            iF = i.f(getContext(), f88241y0, 117);
            timeInterpolatorG = i.g(getContext(), f88237A0, C13661a.f128352c);
        }
        valueAnimatorOfFloat.setDuration(iF);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorG);
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }

    private void p() {
        if (this.f88288l.size() > this.f88261S.size()) {
            List<C18173a> listSubList = this.f88288l.subList(this.f88261S.size(), this.f88288l.size());
            for (C18173a c18173a : listSubList) {
                if (ViewCompat.R(this)) {
                    q(c18173a);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f88288l.size() >= this.f88261S.size()) {
                break;
            }
            C18173a c18173aT0 = C18173a.t0(getContext(), null, 0, this.f88286k);
            this.f88288l.add(c18173aT0);
            if (ViewCompat.R(this)) {
                j(c18173aT0);
            }
        }
        int i10 = this.f88288l.size() != 1 ? 1 : 0;
        Iterator<C18173a> it = this.f88288l.iterator();
        while (it.hasNext()) {
            it.next().l0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        int i10 = this.f88244B;
        if (i10 == 0 || i10 == 1) {
            if (this.f88262T == -1 || !isEnabled()) {
                z();
                return;
            } else {
                y();
                return;
            }
        }
        if (i10 == 2) {
            z();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f88244B);
        }
        if (isEnabled() && P()) {
            y();
        } else {
            z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r0(android.graphics.Canvas r9, android.graphics.Paint r10, android.graphics.RectF r11, com.google.android.material.slider.BaseSlider.f r12) {
        /*
            r8 = this;
            int r0 = r8.f88245C
            float r1 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = (float) r0
            float r0 = r0 / r2
            int[] r3 = com.google.android.material.slider.BaseSlider.c.f88315a
            int r4 = r12.ordinal()
            r4 = r3[r4]
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == r7) goto L22
            if (r4 == r6) goto L1e
            if (r4 == r5) goto L1a
            goto L26
        L1a:
            int r1 = r8.f88254L
            float r1 = (float) r1
            goto L26
        L1e:
            int r0 = r8.f88254L
        L20:
            float r0 = (float) r0
            goto L26
        L22:
            int r0 = r8.f88254L
            float r1 = (float) r0
            goto L20
        L26:
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
            r10.setStrokeCap(r4)
            r10.setAntiAlias(r7)
            android.graphics.Path r4 = r8.f88291m0
            r4.reset()
            float r4 = r11.width()
            float r7 = r1 + r0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L53
            android.graphics.Path r12 = r8.f88291m0
            float[] r0 = r8.F(r1, r0)
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r12.addRoundRect(r11, r0, r1)
            android.graphics.Path r11 = r8.f88291m0
            r9.drawPath(r11, r10)
            return
        L53:
            float r4 = java.lang.Math.min(r1, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r9.save()
            android.graphics.Path r1 = r8.f88291m0
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r11, r4, r4, r7)
            android.graphics.Path r1 = r8.f88291m0
            r9.clipPath(r1)
            int r12 = r12.ordinal()
            r12 = r3[r12]
            if (r12 == r6) goto L97
            if (r12 == r5) goto L88
            android.graphics.RectF r12 = r8.f88295o0
            float r1 = r11.centerX()
            float r1 = r1 - r0
            float r2 = r11.top
            float r3 = r11.centerX()
            float r3 = r3 + r0
            float r11 = r11.bottom
            r12.set(r1, r2, r3, r11)
            goto La4
        L88:
            android.graphics.RectF r12 = r8.f88295o0
            float r1 = r11.right
            float r2 = r2 * r0
            float r2 = r1 - r2
            float r3 = r11.top
            float r11 = r11.bottom
            r12.set(r2, r3, r1, r11)
            goto La4
        L97:
            android.graphics.RectF r12 = r8.f88295o0
            float r1 = r11.left
            float r3 = r11.top
            float r2 = r2 * r0
            float r2 = r2 + r1
            float r11 = r11.bottom
            r12.set(r1, r3, r2, r11)
        La4:
            android.graphics.RectF r11 = r8.f88295o0
            r9.drawRoundRect(r11, r0, r0, r10)
            r9.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.r0(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, com.google.android.material.slider.BaseSlider$f):void");
    }

    private void s(int i10) {
        Iterator<L> it = this.f88290m.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f88261S.get(i10).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f88282i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        g0(i10);
    }

    private void s0(int i10) {
        this.f88273d0 = Math.max(i10 - (this.f88246D * 2), 0);
        R();
    }

    private void t() {
        for (L l10 : this.f88290m) {
            Iterator<Float> it = this.f88261S.iterator();
            while (it.hasNext()) {
                l10.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void u0() {
        if (this.f88279g0) {
            x0();
            y0();
            w0();
            z0();
            v0();
            C0();
            this.f88279g0 = false;
        }
    }

    private void w0() {
        if (this.f88264V > 0.0f && !A0(this.f88260R)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f88264V), Float.valueOf(this.f88259Q), Float.valueOf(this.f88260R)));
        }
    }

    private void x0() {
        if (this.f88259Q >= this.f88260R) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f88259Q), Float.valueOf(this.f88260R)));
        }
    }

    private void y() {
        if (!this.f88294o) {
            this.f88294o = true;
            ValueAnimator valueAnimatorO = o(true);
            this.f88296p = valueAnimatorO;
            this.f88298q = null;
            valueAnimatorO.start();
        }
        Iterator<C18173a> it = this.f88288l.iterator();
        for (int i10 = 0; i10 < this.f88261S.size() && it.hasNext(); i10++) {
            if (i10 != this.f88263U) {
                h0(it.next(), this.f88261S.get(i10).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f88288l.size()), Integer.valueOf(this.f88261S.size())));
        }
        h0(it.next(), this.f88261S.get(this.f88263U).floatValue());
    }

    private void y0() {
        if (this.f88260R <= this.f88259Q) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f88260R), Float.valueOf(this.f88259Q)));
        }
    }

    private void z() {
        if (this.f88294o) {
            this.f88294o = false;
            ValueAnimator valueAnimatorO = o(false);
            this.f88298q = valueAnimatorO;
            this.f88296p = null;
            valueAnimatorO.addListener(new b());
            this.f88298q.start();
        }
    }

    private void z0() {
        Iterator<Float> it = this.f88261S.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f88259Q || next.floatValue() > this.f88260R) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.f88259Q), Float.valueOf(this.f88260R)));
            }
            if (this.f88264V > 0.0f && !A0(next.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.f88259Q), Float.valueOf(this.f88264V), Float.valueOf(this.f88264V)));
            }
        }
    }

    protected boolean d0() {
        if (this.f88262T != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fB0 = B0(valueOfTouchPositionAbsolute);
        this.f88262T = 0;
        float fAbs = Math.abs(this.f88261S.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.f88261S.size(); i10++) {
            float fAbs2 = Math.abs(this.f88261S.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float fB02 = B0(this.f88261S.get(i10).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z10 = !O() ? fB02 - fB0 >= 0.0f : fB02 - fB0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f88262T = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fB02 - fB0) < this.f88300r) {
                        this.f88262T = -1;
                        return false;
                    }
                    if (z10) {
                        this.f88262T = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f88262T != -1;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f88280h.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    final int getAccessibilityFocusedVirtualViewId() {
        return this.f88280h.x();
    }

    public int getActiveThumbIndex() {
        return this.f88262T;
    }

    public int getFocusedThumbIndex() {
        return this.f88263U;
    }

    public int getHaloRadius() {
        return this.f88249G;
    }

    public ColorStateList getHaloTintList() {
        return this.f88281h0;
    }

    public int getLabelBehavior() {
        return this.f88244B;
    }

    public float getStepSize() {
        return this.f88264V;
    }

    public float getThumbElevation() {
        return this.f88297p0.w();
    }

    public int getThumbHeight() {
        return this.f88248F;
    }

    public int getThumbRadius() {
        return this.f88247E / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f88297p0.F();
    }

    public float getThumbStrokeWidth() {
        return this.f88297p0.H();
    }

    public ColorStateList getThumbTintList() {
        return this.f88297p0.x();
    }

    public int getThumbTrackGapSize() {
        return this.f88250H;
    }

    public int getThumbWidth() {
        return this.f88247E;
    }

    public int getTickActiveRadius() {
        return this.f88269b0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f88283i0;
    }

    public int getTickInactiveRadius() {
        return this.f88271c0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f88285j0;
    }

    public ColorStateList getTickTintList() {
        if (this.f88285j0.equals(this.f88283i0)) {
            return this.f88283i0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f88287k0;
    }

    public int getTrackHeight() {
        return this.f88245C;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f88289l0;
    }

    public int getTrackInsideCornerSize() {
        return this.f88254L;
    }

    public int getTrackSidePadding() {
        return this.f88246D;
    }

    public int getTrackStopIndicatorSize() {
        return this.f88253K;
    }

    public ColorStateList getTrackTintList() {
        if (this.f88289l0.equals(this.f88287k0)) {
            return this.f88287k0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f88273d0;
    }

    public float getValueFrom() {
        return this.f88259Q;
    }

    public float getValueTo() {
        return this.f88260R;
    }

    List<Float> getValues() {
        return new ArrayList(this.f88261S);
    }

    public void h(L l10) {
        this.f88290m.add(l10);
    }

    void o0(int i10, Rect rect) {
        int iZ = this.f88246D + ((int) (Z(getValues().get(i10).floatValue()) * this.f88273d0));
        int iN = n();
        int iMax = Math.max(this.f88247E / 2, this.f88311y / 2);
        int iMax2 = Math.max(this.f88248F / 2, this.f88311y / 2);
        rect.set(iZ - iMax, iN - iMax2, iZ + iMax, iN + iMax2);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f88284j;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f88294o = false;
        Iterator<C18173a> it = this.f88288l.iterator();
        while (it.hasNext()) {
            q(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f88307u0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f88279g0) {
            u0();
            R();
        }
        super.onDraw(canvas);
        int iN = n();
        float fFloatValue = this.f88261S.get(0).floatValue();
        ArrayList<Float> arrayList = this.f88261S;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (fFloatValue2 < this.f88260R || (this.f88261S.size() > 1 && fFloatValue > this.f88259Q)) {
            v(canvas, this.f88273d0, iN);
        }
        if (fFloatValue2 > this.f88259Q) {
            u(canvas, this.f88273d0, iN);
        }
        U(canvas);
        T(canvas, iN);
        if ((this.f88258P || isFocused()) && isEnabled()) {
            S(canvas, this.f88273d0, iN);
        }
        q0();
        x(canvas, this.f88273d0, iN);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f88243A + ((this.f88244B == 1 || i0()) ? this.f88288l.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f88259Q = gVar.f88325a;
        this.f88260R = gVar.f88326b;
        setValuesInternal(gVar.f88327c);
        this.f88264V = gVar.f88328d;
        if (gVar.f88329e) {
            requestFocus();
        }
    }

    protected void setActiveThumbIndex(int i10) {
        this.f88262T = i10;
    }

    void setCustomThumbDrawable(Drawable drawable) {
        this.f88299q0 = I(drawable);
        this.f88301r0.clear();
        postInvalidate();
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f88261S.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f88263U = i10;
        this.f88280h.V(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.f88249G) {
            return;
        }
        this.f88249G = i10;
        Drawable background = getBackground();
        if (j0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            com.google.android.material.drawable.d.k((RippleDrawable) background, this.f88249G);
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f88281h0)) {
            return;
        }
        this.f88281h0 = colorStateList;
        Drawable background = getBackground();
        if (!j0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f88272d.setColor(E(colorStateList));
        this.f88272d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.f88244B != i10) {
            this.f88244B = i10;
            requestLayout();
        }
    }

    protected void setSeparationUnit(int i10) {
        this.f88305t0 = i10;
        this.f88279g0 = true;
        postInvalidate();
    }

    public void setThumbElevation(float f10) {
        this.f88297p0.a0(f10);
    }

    public void setThumbHeight(int i10) {
        if (i10 == this.f88248F) {
            return;
        }
        this.f88248F = i10;
        this.f88297p0.setBounds(0, 0, this.f88247E, i10);
        Drawable drawable = this.f88299q0;
        if (drawable != null) {
            i(drawable);
        }
        Iterator<Drawable> it = this.f88301r0.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        t0();
    }

    public void setThumbRadius(int i10) {
        int i11 = i10 * 2;
        setThumbWidth(i11);
        setThumbHeight(i11);
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f88297p0.k0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(C14879a.a(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.f88297p0.l0(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f88297p0.x())) {
            return;
        }
        this.f88297p0.b0(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(int i10) {
        if (this.f88250H == i10) {
            return;
        }
        this.f88250H = i10;
        invalidate();
    }

    public void setThumbWidth(int i10) {
        if (i10 == this.f88247E) {
            return;
        }
        this.f88247E = i10;
        this.f88297p0.setShapeAppearanceModel(C17239m.a().q(0, this.f88247E / 2.0f).m());
        this.f88297p0.setBounds(0, 0, this.f88247E, this.f88248F);
        Drawable drawable = this.f88299q0;
        if (drawable != null) {
            i(drawable);
        }
        Iterator<Drawable> it = this.f88301r0.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        t0();
    }

    public void setTickActiveRadius(int i10) {
        if (this.f88269b0 != i10) {
            this.f88269b0 = i10;
            this.f88276f.setStrokeWidth(i10 * 2);
            t0();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f88283i0)) {
            return;
        }
        this.f88283i0 = colorStateList;
        this.f88276f.setColor(E(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i10) {
        if (this.f88271c0 != i10) {
            this.f88271c0 = i10;
            this.f88274e.setStrokeWidth(i10 * 2);
            t0();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f88285j0)) {
            return;
        }
        this.f88285j0 = colorStateList;
        this.f88274e.setColor(E(colorStateList));
        invalidate();
    }

    public void setTickVisible(boolean z10) {
        if (this.f88267a0 != z10) {
            this.f88267a0 = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f88287k0)) {
            return;
        }
        this.f88287k0 = colorStateList;
        this.f88268b.setColor(E(colorStateList));
        this.f88278g.setColor(E(this.f88287k0));
        invalidate();
    }

    public void setTrackHeight(int i10) {
        if (this.f88245C != i10) {
            this.f88245C = i10;
            J();
            t0();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f88289l0)) {
            return;
        }
        this.f88289l0 = colorStateList;
        this.f88266a.setColor(E(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i10) {
        if (this.f88254L == i10) {
            return;
        }
        this.f88254L = i10;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        if (this.f88253K == i10) {
            return;
        }
        this.f88253K = i10;
        this.f88278g.setStrokeWidth(i10);
        invalidate();
    }

    public void setValueFrom(float f10) {
        this.f88259Q = f10;
        this.f88279g0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.f88260R = f10;
        this.f88279g0 = true;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String B(float f10) {
        String str;
        if (!H()) {
            if (((int) f10) == f10) {
                str = "%.0f";
            } else {
                str = "%.2f";
            }
            return String.format(str, Float.valueOf(f10));
        }
        throw null;
    }

    private float B0(float f10) {
        return (Z(f10) * this.f88273d0) + this.f88246D;
    }

    private float D(int i10, float f10) {
        float fFloatValue;
        float fFloatValue2;
        float minSeparation = getMinSeparation();
        if (this.f88305t0 == 0) {
            minSeparation = r(minSeparation);
        }
        if (O()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        if (i11 >= this.f88261S.size()) {
            fFloatValue = this.f88260R;
        } else {
            fFloatValue = this.f88261S.get(i11).floatValue() - minSeparation;
        }
        int i12 = i10 - 1;
        if (i12 < 0) {
            fFloatValue2 = this.f88259Q;
        } else {
            fFloatValue2 = this.f88261S.get(i12).floatValue() + minSeparation;
        }
        return C14442a.a(f10, fFloatValue2, fFloatValue);
    }

    private int E(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private Drawable I(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        i(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private boolean K() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean N(MotionEvent motionEvent) {
        if (!L(motionEvent) && K()) {
            return true;
        }
        return false;
    }

    private void S(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        if (j0()) {
            int iZ = (int) (this.f88246D + (Z(this.f88261S.get(this.f88263U).floatValue()) * i10));
            if (Build.VERSION.SDK_INT < 28) {
                int i12 = this.f88249G;
                canvas2 = canvas;
                canvas2.clipRect(iZ - i12, i11 - i12, iZ + i12, i12 + i11, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(iZ, i11, this.f88249G, this.f88272d);
        }
    }

    private boolean W() {
        int iMax = Math.max(this.f88312z, Math.max(this.f88245C + getPaddingTop() + getPaddingBottom(), this.f88248F + getPaddingTop() + getPaddingBottom()));
        if (iMax == this.f88243A) {
            return false;
        }
        this.f88243A = iMax;
        return true;
    }

    private boolean Y(int i10) {
        if (O()) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = a.e.API_PRIORITY_OTHER;
            } else {
                i10 = -i10;
            }
        }
        return X(i10);
    }

    private void h0(C18173a c18173a, float f10) {
        c18173a.B0(B(f10));
        e0(c18173a, f10);
        x.g(this).a(c18173a);
    }

    private void i(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f88247E, this.f88248F);
        } else {
            float fMax = Math.max(this.f88247E, this.f88248F) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private void j(C18173a c18173a) {
        c18173a.z0(x.f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float m(int i10) {
        float fL = l();
        if ((this.f88260R - this.f88259Q) / fL <= i10) {
            return fL;
        }
        return Math.round(r1 / r4) * fL;
    }

    private boolean n0() {
        return k0(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        if (!j0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int iZ = (int) ((Z(this.f88261S.get(this.f88263U).floatValue()) * this.f88273d0) + this.f88246D);
                int iN = n();
                int i10 = this.f88249G;
                C13595a.l(background, iZ - i10, iN - i10, iZ + i10, iN + i10);
            }
        }
    }

    private void q(C18173a c18173a) {
        v vVarG = x.g(this);
        if (vVarG != null) {
            vVarG.b(c18173a);
            c18173a.v0(x.f(this));
        }
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f88261S.size() == arrayList.size() && this.f88261S.equals(arrayList)) {
                return;
            }
            this.f88261S = arrayList;
            this.f88279g0 = true;
            this.f88263U = 0;
            p0();
            p();
            t();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private void t0() {
        boolean zW = W();
        boolean zV = V();
        if (zW) {
            requestLayout();
        } else if (zV) {
            postInvalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u(android.graphics.Canvas r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.u(android.graphics.Canvas, int, int):void");
    }

    private void v0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f10 = this.f88264V;
            if (f10 > 0.0f && minSeparation > 0.0f) {
                if (this.f88305t0 == 1) {
                    if (minSeparation < f10 || !M(minSeparation)) {
                        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f88264V), Float.valueOf(this.f88264V)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f88264V)));
            }
            return;
        }
        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
    }

    private void w(Canvas canvas, int i10, int i11, float f10, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f88246D + ((int) (Z(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    final boolean O() {
        if (ViewCompat.z(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f88266a.setColor(E(this.f88289l0));
        this.f88268b.setColor(E(this.f88287k0));
        this.f88274e.setColor(E(this.f88285j0));
        this.f88276f.setColor(E(this.f88283i0));
        this.f88278g.setColor(E(this.f88287k0));
        for (C18173a c18173a : this.f88288l) {
            if (c18173a.isStateful()) {
                c18173a.setState(getDrawableState());
            }
        }
        if (this.f88297p0.isStateful()) {
            this.f88297p0.setState(getDrawableState());
        }
        this.f88272d.setColor(E(this.f88281h0));
        this.f88272d.setAlpha(63);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f88307u0);
        Iterator<C18173a> it = this.f88288l.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10) {
            this.f88262T = -1;
            this.f88280h.o(this.f88263U);
        } else {
            A(i10);
            this.f88280h.V(this.f88263U);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f88261S.size() == 1) {
            this.f88262T = 0;
        }
        if (this.f88262T == -1) {
            Boolean boolA0 = a0(i10, keyEvent);
            if (boolA0 != null) {
                return boolA0.booleanValue();
            }
            return super.onKeyDown(i10, keyEvent);
        }
        this.f88277f0 |= keyEvent.isLongPress();
        Float fK = k(i10);
        if (fK != null) {
            if (k0(this.f88261S.get(this.f88262T).floatValue() + fK.floatValue())) {
                p0();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 != 61) {
                if (i10 != 66) {
                    return super.onKeyDown(i10, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return X(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return X(-1);
            }
        }
        this.f88262T = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f88325a = this.f88259Q;
        gVar.f88326b = this.f88260R;
        gVar.f88327c = new ArrayList<>(this.f88261S);
        gVar.f88328d = this.f88264V;
        gVar.f88329e = hasFocus();
        return gVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        s0(i10);
        p0();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        v vVarG;
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 && (vVarG = x.g(this)) != null) {
            Iterator<C18173a> it = this.f88288l.iterator();
            while (it.hasNext()) {
                vVarG.b(it.next());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        int i10;
        super.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        setLayerType(i10, null);
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbHeightResource(int i10) {
        setThumbHeight(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbWidthResource(int i10) {
        setThumbWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f88299q0 = null;
        this.f88301r0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f88301r0.add(I(drawable));
        }
        postInvalidate();
    }
}
