package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import ce.C6503b;
import com.fullstory.FS;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.x;
import com.google.android.material.internal.y;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.d;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d2.C13595a;
import de.C13661a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import ke.C15121a;
import p2.G;
import qe.C16634c;
import te.C17234h;
import te.C17239m;
import we.C17867a;

/* loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f88338a;

    /* renamed from: b, reason: collision with root package name */
    private final int f88339b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88340c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f88341d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f88342e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f88343f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f88344g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f88345h;

    /* renamed from: i, reason: collision with root package name */
    protected final SnackbarBaseLayout f88346i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f88347j;

    /* renamed from: k, reason: collision with root package name */
    private int f88348k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f88349l;

    /* renamed from: m, reason: collision with root package name */
    private q f88350m;

    /* renamed from: p, reason: collision with root package name */
    private int f88353p;

    /* renamed from: q, reason: collision with root package name */
    private int f88354q;

    /* renamed from: r, reason: collision with root package name */
    private int f88355r;

    /* renamed from: s, reason: collision with root package name */
    private int f88356s;

    /* renamed from: t, reason: collision with root package name */
    private int f88357t;

    /* renamed from: u, reason: collision with root package name */
    private int f88358u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f88359v;

    /* renamed from: w, reason: collision with root package name */
    private List<r<B>> f88360w;

    /* renamed from: x, reason: collision with root package name */
    private Behavior f88361x;

    /* renamed from: y, reason: collision with root package name */
    private final AccessibilityManager f88362y;

    /* renamed from: A, reason: collision with root package name */
    private static final TimeInterpolator f88331A = C13661a.f128351b;

    /* renamed from: B, reason: collision with root package name */
    private static final TimeInterpolator f88332B = C13661a.f128350a;

    /* renamed from: C, reason: collision with root package name */
    private static final TimeInterpolator f88333C = C13661a.f128353d;

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f88335E = false;

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f88336F = {C6503b.f61523b0};

    /* renamed from: G, reason: collision with root package name */
    private static final String f88337G = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: D, reason: collision with root package name */
    static final Handler f88334D = new Handler(Looper.getMainLooper(), new h());

    /* renamed from: n, reason: collision with root package name */
    private boolean f88351n = false;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f88352o = new i();

    /* renamed from: z, reason: collision with root package name */
    d.b f88363z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l, reason: collision with root package name */
        private final s f88364l = new s(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void U(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f88364l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f88364l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f88364l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    protected static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: l, reason: collision with root package name */
        private static final View.OnTouchListener f88365l = new a();

        /* renamed from: a, reason: collision with root package name */
        private BaseTransientBottomBar<?> f88366a;

        /* renamed from: b, reason: collision with root package name */
        C17239m f88367b;

        /* renamed from: c, reason: collision with root package name */
        private int f88368c;

        /* renamed from: d, reason: collision with root package name */
        private final float f88369d;

        /* renamed from: e, reason: collision with root package name */
        private final float f88370e;

        /* renamed from: f, reason: collision with root package name */
        private final int f88371f;

        /* renamed from: g, reason: collision with root package name */
        private final int f88372g;

        /* renamed from: h, reason: collision with root package name */
        private ColorStateList f88373h;

        /* renamed from: i, reason: collision with root package name */
        private PorterDuff.Mode f88374i;

        /* renamed from: j, reason: collision with root package name */
        private Rect f88375j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f88376k;

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(C17867a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ce.l.f61930I7);
            if (typedArrayObtainStyledAttributes.hasValue(ce.l.f62013P7)) {
                ViewCompat.u0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(ce.l.f62013P7, 0));
            }
            this.f88368c = typedArrayObtainStyledAttributes.getInt(ce.l.f61966L7, 0);
            if (typedArrayObtainStyledAttributes.hasValue(ce.l.f62035R7) || typedArrayObtainStyledAttributes.hasValue(ce.l.f62046S7)) {
                this.f88367b = C17239m.e(context2, attributeSet, 0, 0).m();
            }
            this.f88369d = typedArrayObtainStyledAttributes.getFloat(ce.l.f61978M7, 1.0f);
            setBackgroundTintList(C16634c.a(context2, typedArrayObtainStyledAttributes, ce.l.f61990N7));
            setBackgroundTintMode(x.l(typedArrayObtainStyledAttributes.getInt(ce.l.f62002O7, -1), PorterDuff.Mode.SRC_IN));
            this.f88370e = typedArrayObtainStyledAttributes.getFloat(ce.l.f61954K7, 1.0f);
            this.f88371f = typedArrayObtainStyledAttributes.getDimensionPixelSize(ce.l.f61942J7, -1);
            this.f88372g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ce.l.f62024Q7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f88365l);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.q0(this, d());
            }
        }

        void c(ViewGroup viewGroup) {
            this.f88376k = true;
            viewGroup.addView(this);
            this.f88376k = false;
        }

        class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }

            a() {
            }
        }

        private Drawable d() {
            int iK = C15121a.k(this, C6503b.f61556s, C6503b.f61548o, getBackgroundOverlayColorAlpha());
            C17239m c17239m = this.f88367b;
            Drawable drawableZ = c17239m != null ? BaseTransientBottomBar.z(iK, c17239m) : BaseTransientBottomBar.y(iK, getResources());
            if (this.f88373h == null) {
                return C13595a.r(drawableZ);
            }
            Drawable drawableR = C13595a.r(drawableZ);
            C13595a.o(drawableR, this.f88373h);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f88375j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f88366a = baseTransientBottomBar;
        }

        float getActionTextColorAlpha() {
            return this.f88370e;
        }

        int getAnimationMode() {
            return this.f88368c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f88369d;
        }

        int getMaxInlineActionWidth() {
            return this.f88372g;
        }

        int getMaxWidth() {
            return this.f88371f;
        }

        void setAnimationMode(int i10) {
            this.f88368c = i10;
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f88373h != null) {
                drawable = C13595a.r(drawable.mutate());
                C13595a.o(drawable, this.f88373h);
                C13595a.p(drawable, this.f88374i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f88373h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = C13595a.r(getBackground().mutate());
                C13595a.o(drawableR, colorStateList);
                C13595a.p(drawableR, this.f88374i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f88374i = mode;
            if (getBackground() != null) {
                Drawable drawableR = C13595a.r(getBackground().mutate());
                C13595a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f88365l);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f88366a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
            ViewCompat.j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f88366a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.R();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f88366a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.S();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f88371f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f88371f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f88376k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f88366a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.j0();
                }
            }
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f88377a;

        a(int i10) {
            this.f88377a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T(this.f88377a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f88346i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f88346i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f88346i.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.U();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f88347j.a(BaseTransientBottomBar.this.f88340c - BaseTransientBottomBar.this.f88338a, BaseTransientBottomBar.this.f88338a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f88382a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f88383b;

        e(int i10) {
            this.f88383b = i10;
            this.f88382a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f88335E) {
                ViewCompat.Y(BaseTransientBottomBar.this.f88346i, iIntValue - this.f88382a);
            } else {
                BaseTransientBottomBar.this.f88346i.setTranslationY(iIntValue);
            }
            this.f88382a = iIntValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f88385a;

        f(int i10) {
            this.f88385a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T(this.f88385a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f88347j.b(0, BaseTransientBottomBar.this.f88339b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f88387a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f88335E) {
                ViewCompat.Y(BaseTransientBottomBar.this.f88346i, iIntValue - this.f88387a);
            } else {
                BaseTransientBottomBar.this.f88346i.setTranslationY(iIntValue);
            }
            this.f88387a = iIntValue;
        }
    }

    class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).d0();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).N(message.arg1);
            return true;
        }

        h() {
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f88346i == null || baseTransientBottomBar.f88345h == null) {
                return;
            }
            int iHeight = (y.a(BaseTransientBottomBar.this.f88345h).height() - BaseTransientBottomBar.this.L()) + ((int) BaseTransientBottomBar.this.f88346i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f88357t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f88358u = baseTransientBottomBar2.f88357t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f88346i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                FS.log_w(BaseTransientBottomBar.f88337G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f88358u = baseTransientBottomBar3.f88357t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f88357t - iHeight;
            BaseTransientBottomBar.this.f88346i.requestLayout();
        }
    }

    class j implements G {
        j() {
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            BaseTransientBottomBar.this.f88353p = jVar.j();
            BaseTransientBottomBar.this.f88354q = jVar.k();
            BaseTransientBottomBar.this.f88355r = jVar.l();
            BaseTransientBottomBar.this.j0();
            return jVar;
        }
    }

    class k extends androidx.core.view.a {
        k() {
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }

        @Override // androidx.core.view.a
        public void g(View view, q2.y yVar) {
            super.g(view, yVar);
            yVar.a(1048576);
            yVar.v0(true);
        }
    }

    class l implements d.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.d.b
        public void a() {
            Handler handler = BaseTransientBottomBar.f88334D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.d.b
        public void b(int i10) {
            Handler handler = BaseTransientBottomBar.f88334D;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.T(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.d.c().k(BaseTransientBottomBar.this.f88363z);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.d.c().j(BaseTransientBottomBar.this.f88363z);
            }
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f88346i;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.f88346i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f88346i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.f0();
            } else {
                BaseTransientBottomBar.this.h0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.U();
        }
    }

    static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<BaseTransientBottomBar> f88397a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f88398b;

        static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (ViewCompat.R(view)) {
                x.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f88397a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        View b() {
            return this.f88398b.get();
        }

        void c() {
            if (this.f88398b.get() != null) {
                this.f88398b.get().removeOnAttachStateChangeListener(this);
                x.m(this.f88398b.get(), this);
            }
            this.f88398b.clear();
            this.f88397a.clear();
        }

        private q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f88397a = new WeakReference<>(baseTransientBottomBar);
            this.f88398b = new WeakReference<>(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d() && this.f88397a.get().f88351n) {
                this.f88397a.get().V();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            x.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            x.m(view, this);
        }
    }

    public static abstract class r<B> {
        public void a(B b10, int i10) {
        }

        public void b(B b10) {
        }
    }

    public static class s {

        /* renamed from: a, reason: collision with root package name */
        private d.b f88399a;

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f88399a = baseTransientBottomBar.f88363z;
        }

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.d.c().k(this.f88399a);
                    return;
                }
                return;
            }
            if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.d.c().j(this.f88399a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L() {
        int[] iArr = new int[2];
        this.f88346i.getLocationInWindow(iArr);
        return iArr[1] + this.f88346i.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        ValueAnimator valueAnimatorC = C(0.0f, 1.0f);
        ValueAnimator valueAnimatorH = H(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorH);
        animatorSet.setDuration(this.f88338a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void g0(int i10) {
        ValueAnimator valueAnimatorC = C(1.0f, 0.0f);
        valueAnimatorC.setDuration(this.f88339b);
        valueAnimatorC.addListener(new a(i10));
        valueAnimatorC.start();
    }

    public void A() {
        B(3);
    }

    private int J() {
        int height = this.f88346i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f88346i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private boolean P() {
        ViewGroup.LayoutParams layoutParams = this.f88346i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void Z(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorG = this.f88361x;
        if (swipeDismissBehaviorG == null) {
            swipeDismissBehaviorG = G();
        }
        if (swipeDismissBehaviorG instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorG).U(this);
        }
        swipeDismissBehaviorG.P(new n());
        fVar.o(swipeDismissBehaviorG);
        if (D() == null) {
            fVar.f53861g = 80;
        }
    }

    private boolean b0() {
        return this.f88357t > 0 && !this.f88349l && P();
    }

    private void i0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, J());
        valueAnimator.setInterpolator(this.f88342e);
        valueAnimator.setDuration(this.f88340c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        ViewGroup.LayoutParams layoutParams = this.f88346i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            FS.log_w(f88337G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f88346i.f88375j == null) {
            FS.log_w(f88337G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f88346i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f88346i.f88375j.bottom + (D() != null ? this.f88356s : this.f88353p);
        int i11 = this.f88346i.f88375j.left + this.f88354q;
        int i12 = this.f88346i.f88375j.right + this.f88355r;
        int i13 = this.f88346i.f88375j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f88346i.requestLayout();
        }
        if ((z10 || this.f88358u != this.f88357t) && Build.VERSION.SDK_INT >= 29 && b0()) {
            this.f88346i.removeCallbacks(this.f88352o);
            this.f88346i.post(this.f88352o);
        }
    }

    private void w(int i10) {
        if (this.f88346i.getAnimationMode() == 1) {
            g0(i10);
        } else {
            i0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable y(int i10, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(ce.d.f61653x0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C17234h z(int i10, C17239m c17239m) {
        C17234h c17234h = new C17234h(c17239m);
        c17234h.b0(ColorStateList.valueOf(i10));
        return c17234h;
    }

    public View D() {
        q qVar = this.f88350m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public Context E() {
        return this.f88345h;
    }

    public int F() {
        return this.f88348k;
    }

    protected SwipeDismissBehavior<? extends View> G() {
        return new Behavior();
    }

    public View K() {
        return this.f88346i;
    }

    protected boolean M() {
        TypedArray typedArrayObtainStyledAttributes = this.f88345h.obtainStyledAttributes(f88336F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    void Q() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f88346i.getRootWindowInsets()) == null) {
            return;
        }
        this.f88357t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        j0();
    }

    void S() {
        if (this.f88359v) {
            e0();
            this.f88359v = false;
        }
    }

    public B W(int i10) {
        View viewFindViewById = this.f88344g.findViewById(i10);
        if (viewFindViewById != null) {
            return (B) X(viewFindViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i10);
    }

    public B X(View view) {
        q qVar = this.f88350m;
        if (qVar != null) {
            qVar.c();
        }
        this.f88350m = view == null ? null : q.a(this, view);
        return this;
    }

    public B Y(int i10) {
        this.f88348k = i10;
        return this;
    }

    boolean a0() {
        AccessibilityManager accessibilityManager = this.f88362y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    final void d0() {
        if (this.f88346i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f88346i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                Z((CoordinatorLayout.f) layoutParams);
            }
            this.f88346i.c(this.f88344g);
            V();
            this.f88346i.setVisibility(4);
        }
        if (ViewCompat.S(this.f88346i)) {
            e0();
        } else {
            this.f88359v = true;
        }
    }

    public B u(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f88360w == null) {
            this.f88360w = new ArrayList();
        }
        this.f88360w.add(rVar);
        return this;
    }

    void v() {
        this.f88346i.post(new o());
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup != null) {
            if (view != null) {
                if (aVar != null) {
                    this.f88344g = viewGroup;
                    this.f88347j = aVar;
                    this.f88345h = context;
                    com.google.android.material.internal.s.a(context);
                    SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(I(), viewGroup, false);
                    this.f88346i = snackbarBaseLayout;
                    snackbarBaseLayout.setBaseTransientBottomBar(this);
                    if (view instanceof SnackbarContentLayout) {
                        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                        snackbarContentLayout.c(snackbarBaseLayout.getActionTextColorAlpha());
                        snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
                    }
                    snackbarBaseLayout.addView(view);
                    ViewCompat.o0(snackbarBaseLayout, 1);
                    ViewCompat.w0(snackbarBaseLayout, 1);
                    ViewCompat.v0(snackbarBaseLayout, true);
                    ViewCompat.A0(snackbarBaseLayout, new j());
                    ViewCompat.m0(snackbarBaseLayout, new k());
                    this.f88362y = (AccessibilityManager) context.getSystemService("accessibility");
                    this.f88340c = pe.i.f(context, C6503b.f61502I, 250);
                    this.f88338a = pe.i.f(context, C6503b.f61502I, BinsView.TOTE_WIDTH_DP);
                    this.f88339b = pe.i.f(context, C6503b.f61503J, 75);
                    this.f88341d = pe.i.g(context, C6503b.f61512S, f88332B);
                    this.f88343f = pe.i.g(context, C6503b.f61512S, f88333C);
                    this.f88342e = pe.i.g(context, C6503b.f61512S, f88331A);
                    return;
                }
                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f88341d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator H(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f88343f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.f88356s = x();
        j0();
    }

    private void e0() {
        if (a0()) {
            v();
            return;
        }
        if (this.f88346i.getParent() != null) {
            this.f88346i.setVisibility(0);
        }
        U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        int iJ = J();
        if (f88335E) {
            ViewCompat.Y(this.f88346i, iJ);
        } else {
            this.f88346i.setTranslationY(iJ);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iJ, 0);
        valueAnimator.setInterpolator(this.f88342e);
        valueAnimator.setDuration(this.f88340c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(iJ));
        valueAnimator.start();
    }

    private int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f88344g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f88344g.getHeight()) - i10;
    }

    protected void B(int i10) {
        com.google.android.material.snackbar.d.c().b(this.f88363z, i10);
    }

    protected int I() {
        if (M()) {
            return ce.h.f61726A;
        }
        return ce.h.f61731b;
    }

    final void N(int i10) {
        if (a0() && this.f88346i.getVisibility() == 0) {
            w(i10);
        } else {
            T(i10);
        }
    }

    public boolean O() {
        return com.google.android.material.snackbar.d.c().e(this.f88363z);
    }

    void R() {
        if (O()) {
            f88334D.post(new m());
        }
    }

    void T(int i10) {
        com.google.android.material.snackbar.d.c().h(this.f88363z);
        List<r<B>> list = this.f88360w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f88360w.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f88346i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f88346i);
        }
    }

    void U() {
        com.google.android.material.snackbar.d.c().i(this.f88363z);
        List<r<B>> list = this.f88360w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f88360w.get(size).b(this);
            }
        }
    }

    public void c0() {
        com.google.android.material.snackbar.d.c().m(F(), this.f88363z);
    }
}
