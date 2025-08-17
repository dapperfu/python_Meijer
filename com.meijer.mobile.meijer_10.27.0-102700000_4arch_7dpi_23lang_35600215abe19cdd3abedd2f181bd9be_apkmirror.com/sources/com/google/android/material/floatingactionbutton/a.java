package com.google.android.material.floatingactionbutton;

import ae.C5597b;
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
import be.C6230a;
import be.C6231b;
import be.C6235f;
import be.C6236g;
import be.C6237h;
import com.google.android.material.internal.n;
import d2.C13462a;
import java.util.ArrayList;
import java.util.Iterator;
import pe.C16292b;
import qe.InterfaceC16521b;
import re.C16760h;
import re.C16761i;
import re.C16765m;
import re.InterfaceC16768p;

/* loaded from: classes4.dex */
class a {

    /* renamed from: C, reason: collision with root package name */
    static final TimeInterpolator f86979C = C6230a.f60117c;

    /* renamed from: D, reason: collision with root package name */
    private static final int f86980D = C5597b.f44487I;

    /* renamed from: E, reason: collision with root package name */
    private static final int f86981E = C5597b.f44497S;

    /* renamed from: F, reason: collision with root package name */
    private static final int f86982F = C5597b.f44488J;

    /* renamed from: G, reason: collision with root package name */
    private static final int f86983G = C5597b.f44495Q;

    /* renamed from: H, reason: collision with root package name */
    static final int[] f86984H = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: I, reason: collision with root package name */
    static final int[] f86985I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    static final int[] f86986J = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: K, reason: collision with root package name */
    static final int[] f86987K = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: L, reason: collision with root package name */
    static final int[] f86988L = {R.attr.state_enabled};

    /* renamed from: M, reason: collision with root package name */
    static final int[] f86989M = new int[0];

    /* renamed from: B, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f86991B;

    /* renamed from: a, reason: collision with root package name */
    C16765m f86992a;

    /* renamed from: b, reason: collision with root package name */
    C16760h f86993b;

    /* renamed from: c, reason: collision with root package name */
    Drawable f86994c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f86995d;

    /* renamed from: e, reason: collision with root package name */
    boolean f86996e;

    /* renamed from: g, reason: collision with root package name */
    float f86998g;

    /* renamed from: h, reason: collision with root package name */
    float f86999h;

    /* renamed from: i, reason: collision with root package name */
    float f87000i;

    /* renamed from: j, reason: collision with root package name */
    int f87001j;

    /* renamed from: k, reason: collision with root package name */
    private final n f87002k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f87003l;

    /* renamed from: m, reason: collision with root package name */
    private C6237h f87004m;

    /* renamed from: n, reason: collision with root package name */
    private C6237h f87005n;

    /* renamed from: o, reason: collision with root package name */
    private float f87006o;

    /* renamed from: q, reason: collision with root package name */
    private int f87008q;

    /* renamed from: s, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f87010s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f87011t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<j> f87012u;

    /* renamed from: v, reason: collision with root package name */
    final FloatingActionButton f87013v;

    /* renamed from: w, reason: collision with root package name */
    final InterfaceC16521b f87014w;

    /* renamed from: f, reason: collision with root package name */
    boolean f86997f = true;

    /* renamed from: p, reason: collision with root package name */
    private float f87007p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    private int f87009r = 0;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f87015x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    private final RectF f87016y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    private final RectF f87017z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    private final Matrix f86990A = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    class C1269a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f87018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f87019b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f87020c;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f87018a = true;
        }

        C1269a(boolean z10, k kVar) {
            this.f87019b = z10;
            this.f87020c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f87009r = 0;
            a.this.f87003l = null;
            if (this.f87018a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f87013v;
            boolean z10 = this.f87019b;
            floatingActionButton.a(z10 ? 8 : 4, z10);
            k kVar = this.f87020c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f87013v.a(0, this.f87019b);
            a.this.f87009r = 1;
            a.this.f87003l = animator;
            this.f87018a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f87022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f87023b;

        b(boolean z10, k kVar) {
            this.f87022a = z10;
            this.f87023b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f87009r = 0;
            a.this.f87003l = null;
            k kVar = this.f87023b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f87013v.a(0, this.f87022a);
            a.this.f87009r = 2;
            a.this.f87003l = animator;
        }
    }

    class c extends C6236g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f87007p = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f87026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f87027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f87028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f87029d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f87030e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f87031f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f87032g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f87033h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f87026a = f10;
            this.f87027b = f11;
            this.f87028c = f12;
            this.f87029d = f13;
            this.f87030e = f14;
            this.f87031f = f15;
            this.f87032g = f16;
            this.f87033h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f87013v.setAlpha(C6230a.b(this.f87026a, this.f87027b, 0.0f, 0.2f, fFloatValue));
            a.this.f87013v.setScaleX(C6230a.a(this.f87028c, this.f87029d, fFloatValue));
            a.this.f87013v.setScaleY(C6230a.a(this.f87030e, this.f87029d, fFloatValue));
            a.this.f87007p = C6230a.a(this.f87031f, this.f87032g, fFloatValue);
            a.this.h(C6230a.a(this.f87031f, this.f87032g, fFloatValue), this.f87033h);
            a.this.f87013v.setImageMatrix(this.f87033h);
        }
    }

    class e implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f87035a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f87035a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
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
            return aVar.f86998g + aVar.f86999h;
        }
    }

    private class i extends m {
        i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f86998g + aVar.f87000i;
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
            return a.this.f86998g;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f87042a;

        /* renamed from: b, reason: collision with root package name */
        private float f87043b;

        /* renamed from: c, reason: collision with root package name */
        private float f87044c;

        private m() {
        }

        protected abstract float a();

        /* synthetic */ m(a aVar, C1269a c1269a) {
            this();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.e0((int) this.f87044c);
            this.f87042a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f87042a) {
                C16760h c16760h = a.this.f86993b;
                this.f87043b = c16760h == null ? 0.0f : c16760h.w();
                this.f87044c = a();
                this.f87042a = true;
            }
            a aVar = a.this;
            float f10 = this.f87043b;
            aVar.e0((int) (f10 + ((this.f87044c - f10) * valueAnimator.getAnimatedFraction())));
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
        return ViewCompat.S(this.f87013v) && !this.f87013v.isInEditMode();
    }

    private void f0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    private AnimatorSet i(C6237h c6237h, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f87013v, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        c6237h.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f87013v, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c6237h.e("scale").a(objectAnimatorOfFloat2);
        f0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f87013v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c6237h.e("scale").a(objectAnimatorOfFloat3);
        f0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.f86990A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f87013v, new C6235f(), new c(), new Matrix(this.f86990A));
        c6237h.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C6231b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f87013v.getAlpha(), f10, this.f87013v.getScaleX(), f11, this.f87013v.getScaleY(), this.f87007p, f12, new Matrix(this.f86990A)));
        arrayList.add(valueAnimatorOfFloat);
        C6231b.a(animatorSet, arrayList);
        animatorSet.setDuration(ne.i.f(this.f87013v.getContext(), i10, this.f87013v.getContext().getResources().getInteger(ae.g.f44709b)));
        animatorSet.setInterpolator(ne.i.g(this.f87013v.getContext(), i11, C6230a.f60116b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f86979C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.f86991B == null) {
            this.f86991B = new f();
        }
        return this.f86991B;
    }

    void A() {
        C16760h c16760h = this.f86993b;
        if (c16760h != null) {
            C16761i.f(this.f87013v, c16760h);
        }
        if (J()) {
            this.f87013v.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    void C() {
        ViewTreeObserver viewTreeObserver = this.f87013v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f86991B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f86991B = null;
        }
    }

    void F(Rect rect) {
        o2.i.h(this.f86995d, "Didn't initialize content background");
        if (!X()) {
            this.f87014w.c(this.f86995d);
        } else {
            this.f87014w.c(new InsetDrawable(this.f86995d, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void G() {
        float rotation = this.f87013v.getRotation();
        if (this.f87006o != rotation) {
            this.f87006o = rotation;
            b0();
        }
    }

    void H() {
        ArrayList<j> arrayList = this.f87012u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void I() {
        ArrayList<j> arrayList = this.f87012u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    void K(ColorStateList colorStateList) {
        C16760h c16760h = this.f86993b;
        if (c16760h != null) {
            c16760h.setTintList(colorStateList);
        }
    }

    void L(PorterDuff.Mode mode) {
        C16760h c16760h = this.f86993b;
        if (c16760h != null) {
            c16760h.setTintMode(mode);
        }
    }

    final void M(float f10) {
        if (this.f86998g != f10) {
            this.f86998g = f10;
            E(f10, this.f86999h, this.f87000i);
        }
    }

    void N(boolean z10) {
        this.f86996e = z10;
    }

    final void O(C6237h c6237h) {
        this.f87005n = c6237h;
    }

    final void P(float f10) {
        if (this.f86999h != f10) {
            this.f86999h = f10;
            E(this.f86998g, f10, this.f87000i);
        }
    }

    final void Q(float f10) {
        this.f87007p = f10;
        Matrix matrix = this.f86990A;
        h(f10, matrix);
        this.f87013v.setImageMatrix(matrix);
    }

    final void R(int i10) {
        if (this.f87008q != i10) {
            this.f87008q = i10;
            c0();
        }
    }

    final void S(float f10) {
        if (this.f87000i != f10) {
            this.f87000i = f10;
            E(this.f86998g, this.f86999h, f10);
        }
    }

    void T(ColorStateList colorStateList) {
        Drawable drawable = this.f86994c;
        if (drawable != null) {
            C13462a.o(drawable, C16292b.d(colorStateList));
        }
    }

    void U(boolean z10) {
        this.f86997f = z10;
        d0();
    }

    final void V(C16765m c16765m) {
        this.f86992a = c16765m;
        C16760h c16760h = this.f86993b;
        if (c16760h != null) {
            c16760h.setShapeAppearanceModel(c16765m);
        }
        Object obj = this.f86994c;
        if (obj instanceof InterfaceC16768p) {
            ((InterfaceC16768p) obj).setShapeAppearanceModel(c16765m);
        }
    }

    final void W(C6237h c6237h) {
        this.f87004m = c6237h;
    }

    final boolean Z() {
        return !this.f86996e || this.f87013v.getSizeDimension() >= this.f87001j;
    }

    final void c0() {
        Q(this.f87007p);
    }

    final void d0() {
        Rect rect = this.f87015x;
        r(rect);
        F(rect);
        this.f87014w.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f87011t == null) {
            this.f87011t = new ArrayList<>();
        }
        this.f87011t.add(animatorListener);
    }

    void e0(float f10) {
        C16760h c16760h = this.f86993b;
        if (c16760h != null) {
            c16760h.a0(f10);
        }
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.f87010s == null) {
            this.f87010s = new ArrayList<>();
        }
        this.f87010s.add(animatorListener);
    }

    void g(j jVar) {
        if (this.f87012u == null) {
            this.f87012u = new ArrayList<>();
        }
        this.f87012u.add(jVar);
    }

    final Drawable l() {
        return this.f86995d;
    }

    boolean n() {
        return this.f86996e;
    }

    final C6237h o() {
        return this.f87005n;
    }

    float p() {
        return this.f86999h;
    }

    float s() {
        return this.f87000i;
    }

    final C16765m t() {
        return this.f86992a;
    }

    final C6237h u() {
        return this.f87004m;
    }

    int v() {
        if (this.f86996e) {
            return Math.max((this.f87001j - this.f87013v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    boolean x() {
        return this.f87013v.getVisibility() == 0 ? this.f87009r == 1 : this.f87009r != 2;
    }

    boolean y() {
        return this.f87013v.getVisibility() != 0 ? this.f87009r == 2 : this.f87009r != 1;
    }

    a(FloatingActionButton floatingActionButton, InterfaceC16521b interfaceC16521b) {
        this.f87013v = floatingActionButton;
        this.f87014w = interfaceC16521b;
        n nVar = new n();
        this.f87002k = nVar;
        nVar.a(f86984H, k(new i()));
        nVar.a(f86985I, k(new h()));
        nVar.a(f86986J, k(new h()));
        nVar.a(f86987K, k(new h()));
        nVar.a(f86988L, k(new l()));
        nVar.a(f86989M, k(new g()));
        this.f87006o = floatingActionButton.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f87013v.getDrawable() != null && this.f87008q != 0) {
            RectF rectF = this.f87016y;
            RectF rectF2 = this.f87017z;
            rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i10 = this.f87008q;
            rectF2.set(0.0f, 0.0f, i10, i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f87008q;
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
            Animator animator = this.f87003l;
            if (animator != null) {
                animator.cancel();
            }
            if (this.f87004m == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (Y()) {
                if (this.f87013v.getVisibility() != 0) {
                    float f12 = 0.0f;
                    this.f87013v.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton = this.f87013v;
                    if (z11) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton.setScaleY(f10);
                    FloatingActionButton floatingActionButton2 = this.f87013v;
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
                C6237h c6237h = this.f87004m;
                if (c6237h != null) {
                    animatorSetJ = i(c6237h, 1.0f, 1.0f, 1.0f);
                    aVar = this;
                } else {
                    animatorSetJ = j(1.0f, 1.0f, 1.0f, f86980D, f86981E);
                    aVar = this;
                }
                animatorSetJ.addListener(new b(z10, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = aVar.f87010s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSetJ.addListener(it.next());
                    }
                }
                animatorSetJ.start();
                return;
            }
            this.f87013v.a(0, z10);
            this.f87013v.setAlpha(1.0f);
            this.f87013v.setScaleY(1.0f);
            this.f87013v.setScaleX(1.0f);
            Q(1.0f);
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    void r(Rect rect) {
        float fM;
        int iV = v();
        if (this.f86997f) {
            fM = m() + this.f87000i;
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
            Animator animator = this.f87003l;
            if (animator != null) {
                animator.cancel();
            }
            if (Y()) {
                C6237h c6237h = this.f87005n;
                if (c6237h != null) {
                    animatorSetJ = i(c6237h, 0.0f, 0.0f, 0.0f);
                    aVar = this;
                } else {
                    aVar = this;
                    animatorSetJ = aVar.j(0.0f, 0.4f, 0.4f, f86982F, f86983G);
                }
                animatorSetJ.addListener(new C1269a(z10, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = aVar.f87011t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSetJ.addListener(it.next());
                    }
                }
                animatorSetJ.start();
                return;
            }
            FloatingActionButton floatingActionButton = this.f87013v;
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
