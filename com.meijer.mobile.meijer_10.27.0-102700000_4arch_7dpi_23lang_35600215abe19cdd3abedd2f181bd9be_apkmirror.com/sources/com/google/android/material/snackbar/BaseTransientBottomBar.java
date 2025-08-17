package com.google.android.material.snackbar;

import ae.C5597b;
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
import be.C6230a;
import com.fullstory.FS;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.x;
import com.google.android.material.internal.y;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.d;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d2.C13462a;
import ie.C14718a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import oe.C16026c;
import p2.G;
import re.C16760h;
import re.C16765m;
import ue.C17250a;

/* loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f87498a;

    /* renamed from: b, reason: collision with root package name */
    private final int f87499b;

    /* renamed from: c, reason: collision with root package name */
    private final int f87500c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f87501d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f87502e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f87503f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f87504g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f87505h;

    /* renamed from: i, reason: collision with root package name */
    protected final SnackbarBaseLayout f87506i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f87507j;

    /* renamed from: k, reason: collision with root package name */
    private int f87508k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87509l;

    /* renamed from: m, reason: collision with root package name */
    private q f87510m;

    /* renamed from: p, reason: collision with root package name */
    private int f87513p;

    /* renamed from: q, reason: collision with root package name */
    private int f87514q;

    /* renamed from: r, reason: collision with root package name */
    private int f87515r;

    /* renamed from: s, reason: collision with root package name */
    private int f87516s;

    /* renamed from: t, reason: collision with root package name */
    private int f87517t;

    /* renamed from: u, reason: collision with root package name */
    private int f87518u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f87519v;

    /* renamed from: w, reason: collision with root package name */
    private List<r<B>> f87520w;

    /* renamed from: x, reason: collision with root package name */
    private Behavior f87521x;

    /* renamed from: y, reason: collision with root package name */
    private final AccessibilityManager f87522y;

    /* renamed from: A, reason: collision with root package name */
    private static final TimeInterpolator f87491A = C6230a.f60116b;

    /* renamed from: B, reason: collision with root package name */
    private static final TimeInterpolator f87492B = C6230a.f60115a;

    /* renamed from: C, reason: collision with root package name */
    private static final TimeInterpolator f87493C = C6230a.f60118d;

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f87495E = false;

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f87496F = {C5597b.f44508b0};

    /* renamed from: G, reason: collision with root package name */
    private static final String f87497G = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: D, reason: collision with root package name */
    static final Handler f87494D = new Handler(Looper.getMainLooper(), new h());

    /* renamed from: n, reason: collision with root package name */
    private boolean f87511n = false;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f87512o = new i();

    /* renamed from: z, reason: collision with root package name */
    d.b f87523z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l, reason: collision with root package name */
        private final s f87524l = new s(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void U(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f87524l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f87524l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f87524l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    protected static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: l, reason: collision with root package name */
        private static final View.OnTouchListener f87525l = new a();

        /* renamed from: a, reason: collision with root package name */
        private BaseTransientBottomBar<?> f87526a;

        /* renamed from: b, reason: collision with root package name */
        C16765m f87527b;

        /* renamed from: c, reason: collision with root package name */
        private int f87528c;

        /* renamed from: d, reason: collision with root package name */
        private final float f87529d;

        /* renamed from: e, reason: collision with root package name */
        private final float f87530e;

        /* renamed from: f, reason: collision with root package name */
        private final int f87531f;

        /* renamed from: g, reason: collision with root package name */
        private final int f87532g;

        /* renamed from: h, reason: collision with root package name */
        private ColorStateList f87533h;

        /* renamed from: i, reason: collision with root package name */
        private PorterDuff.Mode f87534i;

        /* renamed from: j, reason: collision with root package name */
        private Rect f87535j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f87536k;

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(C17250a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ae.l.f44915I7);
            if (typedArrayObtainStyledAttributes.hasValue(ae.l.f44998P7)) {
                ViewCompat.u0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(ae.l.f44998P7, 0));
            }
            this.f87528c = typedArrayObtainStyledAttributes.getInt(ae.l.f44951L7, 0);
            if (typedArrayObtainStyledAttributes.hasValue(ae.l.f45020R7) || typedArrayObtainStyledAttributes.hasValue(ae.l.f45031S7)) {
                this.f87527b = C16765m.e(context2, attributeSet, 0, 0).m();
            }
            this.f87529d = typedArrayObtainStyledAttributes.getFloat(ae.l.f44963M7, 1.0f);
            setBackgroundTintList(C16026c.a(context2, typedArrayObtainStyledAttributes, ae.l.f44975N7));
            setBackgroundTintMode(x.l(typedArrayObtainStyledAttributes.getInt(ae.l.f44987O7, -1), PorterDuff.Mode.SRC_IN));
            this.f87530e = typedArrayObtainStyledAttributes.getFloat(ae.l.f44939K7, 1.0f);
            this.f87531f = typedArrayObtainStyledAttributes.getDimensionPixelSize(ae.l.f44927J7, -1);
            this.f87532g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ae.l.f45009Q7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f87525l);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.q0(this, d());
            }
        }

        void c(ViewGroup viewGroup) {
            this.f87536k = true;
            viewGroup.addView(this);
            this.f87536k = false;
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
            int iK = C14718a.k(this, C5597b.f44541s, C5597b.f44533o, getBackgroundOverlayColorAlpha());
            C16765m c16765m = this.f87527b;
            Drawable drawableZ = c16765m != null ? BaseTransientBottomBar.z(iK, c16765m) : BaseTransientBottomBar.y(iK, getResources());
            if (this.f87533h == null) {
                return C13462a.r(drawableZ);
            }
            Drawable drawableR = C13462a.r(drawableZ);
            C13462a.o(drawableR, this.f87533h);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f87535j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f87526a = baseTransientBottomBar;
        }

        float getActionTextColorAlpha() {
            return this.f87530e;
        }

        int getAnimationMode() {
            return this.f87528c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f87529d;
        }

        int getMaxInlineActionWidth() {
            return this.f87532g;
        }

        int getMaxWidth() {
            return this.f87531f;
        }

        void setAnimationMode(int i10) {
            this.f87528c = i10;
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f87533h != null) {
                drawable = C13462a.r(drawable.mutate());
                C13462a.o(drawable, this.f87533h);
                C13462a.p(drawable, this.f87534i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f87533h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = C13462a.r(getBackground().mutate());
                C13462a.o(drawableR, colorStateList);
                C13462a.p(drawableR, this.f87534i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f87534i = mode;
            if (getBackground() != null) {
                Drawable drawableR = C13462a.r(getBackground().mutate());
                C13462a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f87525l);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f87526a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
            ViewCompat.j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f87526a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.R();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f87526a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.S();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f87531f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f87531f;
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
            if (!this.f87536k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f87526a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.j0();
                }
            }
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87537a;

        a(int i10) {
            this.f87537a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T(this.f87537a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f87506i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f87506i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f87506i.setScaleY(fFloatValue);
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
            BaseTransientBottomBar.this.f87507j.a(BaseTransientBottomBar.this.f87500c - BaseTransientBottomBar.this.f87498a, BaseTransientBottomBar.this.f87498a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f87542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87543b;

        e(int i10) {
            this.f87543b = i10;
            this.f87542a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f87495E) {
                ViewCompat.Y(BaseTransientBottomBar.this.f87506i, iIntValue - this.f87542a);
            } else {
                BaseTransientBottomBar.this.f87506i.setTranslationY(iIntValue);
            }
            this.f87542a = iIntValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87545a;

        f(int i10) {
            this.f87545a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T(this.f87545a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f87507j.b(0, BaseTransientBottomBar.this.f87499b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f87547a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f87495E) {
                ViewCompat.Y(BaseTransientBottomBar.this.f87506i, iIntValue - this.f87547a);
            } else {
                BaseTransientBottomBar.this.f87506i.setTranslationY(iIntValue);
            }
            this.f87547a = iIntValue;
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
            if (baseTransientBottomBar.f87506i == null || baseTransientBottomBar.f87505h == null) {
                return;
            }
            int iHeight = (y.a(BaseTransientBottomBar.this.f87505h).height() - BaseTransientBottomBar.this.L()) + ((int) BaseTransientBottomBar.this.f87506i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f87517t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f87518u = baseTransientBottomBar2.f87517t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f87506i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                FS.log_w(BaseTransientBottomBar.f87497G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f87518u = baseTransientBottomBar3.f87517t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f87517t - iHeight;
            BaseTransientBottomBar.this.f87506i.requestLayout();
        }
    }

    class j implements G {
        j() {
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            BaseTransientBottomBar.this.f87513p = jVar.j();
            BaseTransientBottomBar.this.f87514q = jVar.k();
            BaseTransientBottomBar.this.f87515r = jVar.l();
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
            Handler handler = BaseTransientBottomBar.f87494D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.d.b
        public void b(int i10) {
            Handler handler = BaseTransientBottomBar.f87494D;
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
                com.google.android.material.snackbar.d.c().k(BaseTransientBottomBar.this.f87523z);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.d.c().j(BaseTransientBottomBar.this.f87523z);
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
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f87506i;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.f87506i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f87506i.getAnimationMode() == 1) {
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
        private final WeakReference<BaseTransientBottomBar> f87557a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f87558b;

        static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (ViewCompat.R(view)) {
                x.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f87557a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        View b() {
            return this.f87558b.get();
        }

        void c() {
            if (this.f87558b.get() != null) {
                this.f87558b.get().removeOnAttachStateChangeListener(this);
                x.m(this.f87558b.get(), this);
            }
            this.f87558b.clear();
            this.f87557a.clear();
        }

        private q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f87557a = new WeakReference<>(baseTransientBottomBar);
            this.f87558b = new WeakReference<>(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d() && this.f87557a.get().f87511n) {
                this.f87557a.get().V();
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
        private d.b f87559a;

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f87559a = baseTransientBottomBar.f87523z;
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
                    com.google.android.material.snackbar.d.c().k(this.f87559a);
                    return;
                }
                return;
            }
            if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.d.c().j(this.f87559a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L() {
        int[] iArr = new int[2];
        this.f87506i.getLocationInWindow(iArr);
        return iArr[1] + this.f87506i.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        ValueAnimator valueAnimatorC = C(0.0f, 1.0f);
        ValueAnimator valueAnimatorH = H(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorH);
        animatorSet.setDuration(this.f87498a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void g0(int i10) {
        ValueAnimator valueAnimatorC = C(1.0f, 0.0f);
        valueAnimatorC.setDuration(this.f87499b);
        valueAnimatorC.addListener(new a(i10));
        valueAnimatorC.start();
    }

    public void A() {
        B(3);
    }

    private int J() {
        int height = this.f87506i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f87506i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private boolean P() {
        ViewGroup.LayoutParams layoutParams = this.f87506i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void Z(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorG = this.f87521x;
        if (swipeDismissBehaviorG == null) {
            swipeDismissBehaviorG = G();
        }
        if (swipeDismissBehaviorG instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorG).U(this);
        }
        swipeDismissBehaviorG.P(new n());
        fVar.o(swipeDismissBehaviorG);
        if (D() == null) {
            fVar.f53637g = 80;
        }
    }

    private boolean b0() {
        return this.f87517t > 0 && !this.f87509l && P();
    }

    private void i0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, J());
        valueAnimator.setInterpolator(this.f87502e);
        valueAnimator.setDuration(this.f87500c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        ViewGroup.LayoutParams layoutParams = this.f87506i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            FS.log_w(f87497G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f87506i.f87535j == null) {
            FS.log_w(f87497G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f87506i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f87506i.f87535j.bottom + (D() != null ? this.f87516s : this.f87513p);
        int i11 = this.f87506i.f87535j.left + this.f87514q;
        int i12 = this.f87506i.f87535j.right + this.f87515r;
        int i13 = this.f87506i.f87535j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f87506i.requestLayout();
        }
        if ((z10 || this.f87518u != this.f87517t) && Build.VERSION.SDK_INT >= 29 && b0()) {
            this.f87506i.removeCallbacks(this.f87512o);
            this.f87506i.post(this.f87512o);
        }
    }

    private void w(int i10) {
        if (this.f87506i.getAnimationMode() == 1) {
            g0(i10);
        } else {
            i0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable y(int i10, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(ae.d.f44638x0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C16760h z(int i10, C16765m c16765m) {
        C16760h c16760h = new C16760h(c16765m);
        c16760h.b0(ColorStateList.valueOf(i10));
        return c16760h;
    }

    public View D() {
        q qVar = this.f87510m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public Context E() {
        return this.f87505h;
    }

    public int F() {
        return this.f87508k;
    }

    protected SwipeDismissBehavior<? extends View> G() {
        return new Behavior();
    }

    public View K() {
        return this.f87506i;
    }

    protected boolean M() {
        TypedArray typedArrayObtainStyledAttributes = this.f87505h.obtainStyledAttributes(f87496F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    void Q() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f87506i.getRootWindowInsets()) == null) {
            return;
        }
        this.f87517t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        j0();
    }

    void S() {
        if (this.f87519v) {
            e0();
            this.f87519v = false;
        }
    }

    public B W(int i10) {
        View viewFindViewById = this.f87504g.findViewById(i10);
        if (viewFindViewById != null) {
            return (B) X(viewFindViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i10);
    }

    public B X(View view) {
        q qVar = this.f87510m;
        if (qVar != null) {
            qVar.c();
        }
        this.f87510m = view == null ? null : q.a(this, view);
        return this;
    }

    public B Y(int i10) {
        this.f87508k = i10;
        return this;
    }

    boolean a0() {
        AccessibilityManager accessibilityManager = this.f87522y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    final void d0() {
        if (this.f87506i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f87506i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                Z((CoordinatorLayout.f) layoutParams);
            }
            this.f87506i.c(this.f87504g);
            V();
            this.f87506i.setVisibility(4);
        }
        if (ViewCompat.S(this.f87506i)) {
            e0();
        } else {
            this.f87519v = true;
        }
    }

    public B u(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f87520w == null) {
            this.f87520w = new ArrayList();
        }
        this.f87520w.add(rVar);
        return this;
    }

    void v() {
        this.f87506i.post(new o());
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup != null) {
            if (view != null) {
                if (aVar != null) {
                    this.f87504g = viewGroup;
                    this.f87507j = aVar;
                    this.f87505h = context;
                    com.google.android.material.internal.s.a(context);
                    SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(I(), viewGroup, false);
                    this.f87506i = snackbarBaseLayout;
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
                    this.f87522y = (AccessibilityManager) context.getSystemService("accessibility");
                    this.f87500c = ne.i.f(context, C5597b.f44487I, 250);
                    this.f87498a = ne.i.f(context, C5597b.f44487I, BinsView.TOTE_WIDTH_DP);
                    this.f87499b = ne.i.f(context, C5597b.f44488J, 75);
                    this.f87501d = ne.i.g(context, C5597b.f44497S, f87492B);
                    this.f87503f = ne.i.g(context, C5597b.f44497S, f87493C);
                    this.f87502e = ne.i.g(context, C5597b.f44497S, f87491A);
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
        valueAnimatorOfFloat.setInterpolator(this.f87501d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator H(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f87503f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.f87516s = x();
        j0();
    }

    private void e0() {
        if (a0()) {
            v();
            return;
        }
        if (this.f87506i.getParent() != null) {
            this.f87506i.setVisibility(0);
        }
        U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        int iJ = J();
        if (f87495E) {
            ViewCompat.Y(this.f87506i, iJ);
        } else {
            this.f87506i.setTranslationY(iJ);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iJ, 0);
        valueAnimator.setInterpolator(this.f87502e);
        valueAnimator.setDuration(this.f87500c);
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
        this.f87504g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f87504g.getHeight()) - i10;
    }

    protected void B(int i10) {
        com.google.android.material.snackbar.d.c().b(this.f87523z, i10);
    }

    protected int I() {
        if (M()) {
            return ae.h.f44711A;
        }
        return ae.h.f44716b;
    }

    final void N(int i10) {
        if (a0() && this.f87506i.getVisibility() == 0) {
            w(i10);
        } else {
            T(i10);
        }
    }

    public boolean O() {
        return com.google.android.material.snackbar.d.c().e(this.f87523z);
    }

    void R() {
        if (O()) {
            f87494D.post(new m());
        }
    }

    void T(int i10) {
        com.google.android.material.snackbar.d.c().h(this.f87523z);
        List<r<B>> list = this.f87520w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f87520w.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f87506i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f87506i);
        }
    }

    void U() {
        com.google.android.material.snackbar.d.c().i(this.f87523z);
        List<r<B>> list = this.f87520w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f87520w.get(size).b(this);
            }
        }
    }

    public void c0() {
        com.google.android.material.snackbar.d.c().m(F(), this.f87523z);
    }
}
