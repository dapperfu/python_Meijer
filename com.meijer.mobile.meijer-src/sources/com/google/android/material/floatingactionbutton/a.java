package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import ce.C6503b;
import com.google.android.material.internal.n;
import d2.C13595a;
import de.C13661a;
import de.C13662b;
import de.C13666f;
import de.C13667g;
import de.C13668h;
import java.util.ArrayList;
import java.util.Iterator;
import re.C16896b;
import se.InterfaceC17069b;
import te.C17234h;
import te.C17235i;
import te.C17239m;
import te.InterfaceC17242p;

/* loaded from: classes4.dex */
class a {

    /* renamed from: C, reason: collision with root package name */
    static final TimeInterpolator f87819C = C13661a.f128352c;

    /* renamed from: D, reason: collision with root package name */
    private static final int f87820D = C6503b.f61502I;

    /* renamed from: E, reason: collision with root package name */
    private static final int f87821E = C6503b.f61512S;

    /* renamed from: F, reason: collision with root package name */
    private static final int f87822F = C6503b.f61503J;

    /* renamed from: G, reason: collision with root package name */
    private static final int f87823G = C6503b.f61510Q;

    /* renamed from: H, reason: collision with root package name */
    static final int[] f87824H = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: I, reason: collision with root package name */
    static final int[] f87825I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    static final int[] f87826J = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: K, reason: collision with root package name */
    static final int[] f87827K = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: L, reason: collision with root package name */
    static final int[] f87828L = {R.attr.state_enabled};

    /* renamed from: M, reason: collision with root package name */
    static final int[] f87829M = new int[0];

    /* renamed from: B, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f87831B;

    /* renamed from: a, reason: collision with root package name */
    C17239m f87832a;

    /* renamed from: b, reason: collision with root package name */
    C17234h f87833b;

    /* renamed from: c, reason: collision with root package name */
    Drawable f87834c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f87835d;

    /* renamed from: e, reason: collision with root package name */
    boolean f87836e;

    /* renamed from: g, reason: collision with root package name */
    float f87838g;

    /* renamed from: h, reason: collision with root package name */
    float f87839h;

    /* renamed from: i, reason: collision with root package name */
    float f87840i;

    /* renamed from: j, reason: collision with root package name */
    int f87841j;

    /* renamed from: k, reason: collision with root package name */
    private final n f87842k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f87843l;

    /* renamed from: m, reason: collision with root package name */
    private C13668h f87844m;

    /* renamed from: n, reason: collision with root package name */
    private C13668h f87845n;

    /* renamed from: o, reason: collision with root package name */
    private float f87846o;

    /* renamed from: q, reason: collision with root package name */
    private int f87848q;

    /* renamed from: s, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f87850s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f87851t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<j> f87852u;

    /* renamed from: v, reason: collision with root package name */
    final FloatingActionButton f87853v;

    /* renamed from: w, reason: collision with root package name */
    final InterfaceC17069b f87854w;

    /* renamed from: f, reason: collision with root package name */
    boolean f87837f = true;

    /* renamed from: p, reason: collision with root package name */
    private float f87847p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    private int f87849r = 0;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f87855x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    private final RectF f87856y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    private final RectF f87857z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    private final Matrix f87830A = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    class C1278a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f87858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f87859b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f87860c;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f87858a = true;
        }

        C1278a(boolean z10, k kVar) {
            this.f87859b = z10;
            this.f87860c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f87849r = 0;
            a.this.f87843l = null;
            if (this.f87858a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f87853v;
            boolean z10 = this.f87859b;
            floatingActionButton.a(z10 ? 8 : 4, z10);
            k kVar = this.f87860c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f87853v.a(0, this.f87859b);
            a.this.f87849r = 1;
            a.this.f87843l = animator;
            this.f87858a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f87862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f87863b;

        b(boolean z10, k kVar) {
            this.f87862a = z10;
            this.f87863b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f87849r = 0;
            a.this.f87843l = null;
            k kVar = this.f87863b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f87853v.a(0, this.f87862a);
            a.this.f87849r = 2;
            a.this.f87843l = animator;
        }
    }

    class c extends C13667g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f87847p = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f87866a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f87867b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f87868c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f87869d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f87870e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f87871f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f87872g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f87873h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f87866a = f10;
            this.f87867b = f11;
            this.f87868c = f12;
            this.f87869d = f13;
            this.f87870e = f14;
            this.f87871f = f15;
            this.f87872g = f16;
            this.f87873h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f87853v.setAlpha(C13661a.b(this.f87866a, this.f87867b, 0.0f, 0.2f, fFloatValue));
            a.this.f87853v.setScaleX(C13661a.a(this.f87868c, this.f87869d, fFloatValue));
            a.this.f87853v.setScaleY(C13661a.a(this.f87870e, this.f87869d, fFloatValue));
            a.this.f87847p = C13661a.a(this.f87871f, this.f87872g, fFloatValue);
            a.this.h(C13661a.a(this.f87871f, this.f87872g, fFloatValue), this.f87873h);
            a.this.f87853v.setImageMatrix(this.f87873h);
        }
    }

    class e implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f87875a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f87875a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.G();
            return true;
        }
    }

    private class g extends m {
        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return 0.0f;
        }

        g() {
            super(a.this, null);
        }
    }

    private class h extends m {
        h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f87838g + aVar.f87839h;
        }
    }

    private class i extends m {
        i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f87838g + aVar.f87840i;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return a.this.f87838g;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f87882a;

        /* renamed from: b, reason: collision with root package name */
        private float f87883b;

        /* renamed from: c, reason: collision with root package name */
        private float f87884c;

        private m() {
        }

        protected abstract float a();

        /* synthetic */ m(a aVar, C1278a c1278a) {
            this();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.e0((int) this.f87884c);
            this.f87882a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f87882a) {
                C17234h c17234h = a.this.f87833b;
                this.f87883b = c17234h == null ? 0.0f : c17234h.w();
                this.f87884c = a();
                this.f87882a = true;
            }
            a aVar = a.this;
            float f10 = this.f87883b;
            aVar.e0((int) (f10 + ((this.f87884c - f10) * valueAnimator.getAnimatedFraction())));
        }
    }

    void B() {
        throw null;
    }

    void D(int[] iArr) {
        throw null;
    }

    void E(float f10, float f11, float f12) {
        throw null;
    }

    boolean J() {
        throw null;
    }

    boolean X() {
        throw null;
    }

    void b0() {
        throw null;
    }

    float m() {
        throw null;
    }

    void z() {
        throw null;
    }

    private boolean Y() {
        return ViewCompat.S(this.f87853v) && !this.f87853v.isInEditMode();
    }

    private void f0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    private AnimatorSet i(C13668h c13668h, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f87853v, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        c13668h.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f87853v, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c13668h.e("scale").a(objectAnimatorOfFloat2);
        f0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f87853v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c13668h.e("scale").a(objectAnimatorOfFloat3);
        f0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.f87830A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f87853v, new C13666f(), new c(), new Matrix(this.f87830A));
        c13668h.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C13662b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f87853v.getAlpha(), f10, this.f87853v.getScaleX(), f11, this.f87853v.getScaleY(), this.f87847p, f12, new Matrix(this.f87830A)));
        arrayList.add(valueAnimatorOfFloat);
        C13662b.a(animatorSet, arrayList);
        animatorSet.setDuration(pe.i.f(this.f87853v.getContext(), i10, this.f87853v.getContext().getResources().getInteger(ce.g.f61724b)));
        animatorSet.setInterpolator(pe.i.g(this.f87853v.getContext(), i11, C13661a.f128351b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f87819C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.f87831B == null) {
            this.f87831B = new f();
        }
        return this.f87831B;
    }

    void A() {
        C17234h c17234h = this.f87833b;
        if (c17234h != null) {
            C17235i.f(this.f87853v, c17234h);
        }
        if (J()) {
            this.f87853v.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    void C() {
        ViewTreeObserver viewTreeObserver = this.f87853v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f87831B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f87831B = null;
        }
    }

    void F(Rect rect) {
        o2.i.h(this.f87835d, "Didn't initialize content background");
        if (!X()) {
            this.f87854w.c(this.f87835d);
        } else {
            this.f87854w.c(new InsetDrawable(this.f87835d, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void G() {
        float rotation = this.f87853v.getRotation();
        if (this.f87846o != rotation) {
            this.f87846o = rotation;
            b0();
        }
    }

    void H() {
        ArrayList<j> arrayList = this.f87852u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void I() {
        ArrayList<j> arrayList = this.f87852u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    void K(ColorStateList colorStateList) {
        C17234h c17234h = this.f87833b;
        if (c17234h != null) {
            c17234h.setTintList(colorStateList);
        }
    }

    void L(PorterDuff.Mode mode) {
        C17234h c17234h = this.f87833b;
        if (c17234h != null) {
            c17234h.setTintMode(mode);
        }
    }

    final void M(float f10) {
        if (this.f87838g != f10) {
            this.f87838g = f10;
            E(f10, this.f87839h, this.f87840i);
        }
    }

    void N(boolean z10) {
        this.f87836e = z10;
    }

    final void O(C13668h c13668h) {
        this.f87845n = c13668h;
    }

    final void P(float f10) {
        if (this.f87839h != f10) {
            this.f87839h = f10;
            E(this.f87838g, f10, this.f87840i);
        }
    }

    final void Q(float f10) {
        this.f87847p = f10;
        Matrix matrix = this.f87830A;
        h(f10, matrix);
        this.f87853v.setImageMatrix(matrix);
    }

    final void R(int i10) {
        if (this.f87848q != i10) {
            this.f87848q = i10;
            c0();
        }
    }

    final void S(float f10) {
        if (this.f87840i != f10) {
            this.f87840i = f10;
            E(this.f87838g, this.f87839h, f10);
        }
    }

    void T(ColorStateList colorStateList) {
        Drawable drawable = this.f87834c;
        if (drawable != null) {
            C13595a.o(drawable, C16896b.d(colorStateList));
        }
    }

    void U(boolean z10) {
        this.f87837f = z10;
        d0();
    }

    final void V(C17239m c17239m) {
        this.f87832a = c17239m;
        C17234h c17234h = this.f87833b;
        if (c17234h != null) {
            c17234h.setShapeAppearanceModel(c17239m);
        }
        Object obj = this.f87834c;
        if (obj instanceof InterfaceC17242p) {
            ((InterfaceC17242p) obj).setShapeAppearanceModel(c17239m);
        }
    }

    final void W(C13668h c13668h) {
        this.f87844m = c13668h;
    }

    final boolean Z() {
        return !this.f87836e || this.f87853v.getSizeDimension() >= this.f87841j;
    }

    final void c0() {
        Q(this.f87847p);
    }

    final void d0() {
        Rect rect = this.f87855x;
        r(rect);
        F(rect);
        this.f87854w.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f87851t == null) {
            this.f87851t = new ArrayList<>();
        }
        this.f87851t.add(animatorListener);
    }

    void e0(float f10) {
        C17234h c17234h = this.f87833b;
        if (c17234h != null) {
            c17234h.a0(f10);
        }
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.f87850s == null) {
            this.f87850s = new ArrayList<>();
        }
        this.f87850s.add(animatorListener);
    }

    void g(j jVar) {
        if (this.f87852u == null) {
            this.f87852u = new ArrayList<>();
        }
        this.f87852u.add(jVar);
    }

    final Drawable l() {
        return this.f87835d;
    }

    boolean n() {
        return this.f87836e;
    }

    final C13668h o() {
        return this.f87845n;
    }

    float p() {
        return this.f87839h;
    }

    float s() {
        return this.f87840i;
    }

    final C17239m t() {
        return this.f87832a;
    }

    final C13668h u() {
        return this.f87844m;
    }

    int v() {
        if (this.f87836e) {
            return Math.max((this.f87841j - this.f87853v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    boolean x() {
        return this.f87853v.getVisibility() == 0 ? this.f87849r == 1 : this.f87849r != 2;
    }

    boolean y() {
        return this.f87853v.getVisibility() != 0 ? this.f87849r == 2 : this.f87849r != 1;
    }

    a(FloatingActionButton floatingActionButton, InterfaceC17069b interfaceC17069b) {
        this.f87853v = floatingActionButton;
        this.f87854w = interfaceC17069b;
        n nVar = new n();
        this.f87842k = nVar;
        nVar.a(f87824H, k(new i()));
        nVar.a(f87825I, k(new h()));
        nVar.a(f87826J, k(new h()));
        nVar.a(f87827K, k(new h()));
        nVar.a(f87828L, k(new l()));
        nVar.a(f87829M, k(new g()));
        this.f87846o = floatingActionButton.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f87853v.getDrawable() != null && this.f87848q != 0) {
            RectF rectF = this.f87856y;
            RectF rectF2 = this.f87857z;
            rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i10 = this.f87848q;
            rectF2.set(0.0f, 0.0f, i10, i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f87848q;
            matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
        }
    }

    void a0(k kVar, boolean z10) {
        boolean z11;
        AnimatorSet animatorSetJ;
        a aVar;
        float f10;
        float f11;
        if (!y()) {
            Animator animator = this.f87843l;
            if (animator != null) {
                animator.cancel();
            }
            if (this.f87844m == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (Y()) {
                if (this.f87853v.getVisibility() != 0) {
                    float f12 = 0.0f;
                    this.f87853v.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton = this.f87853v;
                    if (z11) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton.setScaleY(f10);
                    FloatingActionButton floatingActionButton2 = this.f87853v;
                    if (z11) {
                        f11 = 0.4f;
                    } else {
                        f11 = 0.0f;
                    }
                    floatingActionButton2.setScaleX(f11);
                    if (z11) {
                        f12 = 0.4f;
                    }
                    Q(f12);
                }
                C13668h c13668h = this.f87844m;
                if (c13668h != null) {
                    animatorSetJ = i(c13668h, 1.0f, 1.0f, 1.0f);
                    aVar = this;
                } else {
                    animatorSetJ = j(1.0f, 1.0f, 1.0f, f87820D, f87821E);
                    aVar = this;
                }
                animatorSetJ.addListener(new b(z10, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = aVar.f87850s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSetJ.addListener(it.next());
                    }
                }
                animatorSetJ.start();
                return;
            }
            this.f87853v.a(0, z10);
            this.f87853v.setAlpha(1.0f);
            this.f87853v.setScaleY(1.0f);
            this.f87853v.setScaleX(1.0f);
            Q(1.0f);
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    void r(Rect rect) {
        float fM;
        int iV = v();
        if (this.f87837f) {
            fM = m() + this.f87840i;
        } else {
            fM = 0.0f;
        }
        int iMax = Math.max(iV, (int) Math.ceil(fM));
        int iMax2 = Math.max(iV, (int) Math.ceil(fM * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    void w(k kVar, boolean z10) {
        int i10;
        a aVar;
        AnimatorSet animatorSetJ;
        if (!x()) {
            Animator animator = this.f87843l;
            if (animator != null) {
                animator.cancel();
            }
            if (Y()) {
                C13668h c13668h = this.f87845n;
                if (c13668h != null) {
                    animatorSetJ = i(c13668h, 0.0f, 0.0f, 0.0f);
                    aVar = this;
                } else {
                    aVar = this;
                    animatorSetJ = aVar.j(0.0f, 0.4f, 0.4f, f87822F, f87823G);
                }
                animatorSetJ.addListener(new C1278a(z10, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = aVar.f87851t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSetJ.addListener(it.next());
                    }
                }
                animatorSetJ.start();
                return;
            }
            FloatingActionButton floatingActionButton = this.f87853v;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.a(i10, z10);
            if (kVar != null) {
                kVar.b();
            }
        }
    }
}
