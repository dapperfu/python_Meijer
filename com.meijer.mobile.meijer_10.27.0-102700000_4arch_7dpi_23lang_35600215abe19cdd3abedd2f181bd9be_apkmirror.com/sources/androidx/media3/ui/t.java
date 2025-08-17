package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import h4.C14371u;
import h4.C14374x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class t {

    /* renamed from: A, reason: collision with root package name */
    private boolean f57565A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f57566B;

    /* renamed from: a, reason: collision with root package name */
    private final PlayerControlView f57568a;

    /* renamed from: b, reason: collision with root package name */
    private final View f57569b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f57570c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewGroup f57571d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f57572e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f57573f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f57574g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f57575h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f57576i;

    /* renamed from: j, reason: collision with root package name */
    private final View f57577j;

    /* renamed from: k, reason: collision with root package name */
    private final View f57578k;

    /* renamed from: l, reason: collision with root package name */
    private final AnimatorSet f57579l;

    /* renamed from: m, reason: collision with root package name */
    private final AnimatorSet f57580m;

    /* renamed from: n, reason: collision with root package name */
    private final AnimatorSet f57581n;

    /* renamed from: o, reason: collision with root package name */
    private final AnimatorSet f57582o;

    /* renamed from: p, reason: collision with root package name */
    private final AnimatorSet f57583p;

    /* renamed from: q, reason: collision with root package name */
    private final ValueAnimator f57584q;

    /* renamed from: r, reason: collision with root package name */
    private final ValueAnimator f57585r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f57586s = new Runnable() { // from class: androidx.media3.ui.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f57552a.Y();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f57587t = new Runnable() { // from class: androidx.media3.ui.m
        @Override // java.lang.Runnable
        public final void run() {
            this.f57558a.D();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f57588u = new Runnable() { // from class: androidx.media3.ui.n
        @Override // java.lang.Runnable
        public final void run() {
            this.f57559a.H();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f57589v = new Runnable() { // from class: androidx.media3.ui.o
        @Override // java.lang.Runnable
        public final void run() {
            this.f57560a.G();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f57590w = new Runnable() { // from class: androidx.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f57561a.E();
        }
    };

    /* renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f57591x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.q
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f57562a.N(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };

    /* renamed from: C, reason: collision with root package name */
    private boolean f57567C = true;

    /* renamed from: z, reason: collision with root package name */
    private int f57593z = 0;

    /* renamed from: y, reason: collision with root package name */
    private final List<View> f57592y = new ArrayList();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (t.this.f57569b != null) {
                t.this.f57569b.setVisibility(4);
            }
            if (t.this.f57570c != null) {
                t.this.f57570c.setVisibility(4);
            }
            if (t.this.f57572e != null) {
                t.this.f57572e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(t.this.f57577j instanceof DefaultTimeBar) || t.this.f57565A) {
                return;
            }
            ((DefaultTimeBar) t.this.f57577j).h(250L);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (t.this.f57569b != null) {
                t.this.f57569b.setVisibility(0);
            }
            if (t.this.f57570c != null) {
                t.this.f57570c.setVisibility(0);
            }
            if (t.this.f57572e != null) {
                t.this.f57572e.setVisibility(t.this.f57565A ? 0 : 4);
            }
            if (!(t.this.f57577j instanceof DefaultTimeBar) || t.this.f57565A) {
                return;
            }
            ((DefaultTimeBar) t.this.f57577j).s(250L);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PlayerControlView f57596a;

        c(PlayerControlView playerControlView) {
            this.f57596a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(1);
            if (t.this.f57566B) {
                this.f57596a.post(t.this.f57586s);
                t.this.f57566B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.V(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PlayerControlView f57598a;

        d(PlayerControlView playerControlView) {
            this.f57598a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(2);
            if (t.this.f57566B) {
                this.f57598a.post(t.this.f57586s);
                t.this.f57566B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.V(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PlayerControlView f57600a;

        e(PlayerControlView playerControlView) {
            this.f57600a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(2);
            if (t.this.f57566B) {
                this.f57600a.post(t.this.f57586s);
                t.this.f57566B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.V(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.V(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.V(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (t.this.f57573f != null) {
                t.this.f57573f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (t.this.f57575h != null) {
                t.this.f57575h.setVisibility(0);
                t.this.f57575h.setTranslationX(t.this.f57575h.getWidth());
                t.this.f57575h.scrollTo(t.this.f57575h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (t.this.f57575h != null) {
                t.this.f57575h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (t.this.f57573f != null) {
                t.this.f57573f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        V(2);
    }

    private static ObjectAnimator J(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f57581n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f57579l.start();
        Q(this.f57588u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f57580m.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i10;
        if (this.f57573f == null || this.f57574g == null) {
            return;
        }
        int width = (this.f57568a.getWidth() - this.f57568a.getPaddingLeft()) - this.f57568a.getPaddingRight();
        while (true) {
            if (this.f57574g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f57574g.getChildCount() - 2;
            View childAt = this.f57574g.getChildAt(childCount);
            this.f57574g.removeViewAt(childCount);
            this.f57573f.addView(childAt, 0);
        }
        View view = this.f57578k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f57576i);
        int childCount2 = this.f57573f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f57573f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f57575h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f57585r.isStarted()) {
                return;
            }
            this.f57584q.cancel();
            this.f57585r.start();
            return;
        }
        View view2 = this.f57578k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f57578k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f57573f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f57573f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f57574g.addView((View) arrayList.get(i10), this.f57574g.getChildCount() - 1);
        }
    }

    private void Q(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f57568a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        int i11 = this.f57593z;
        this.f57593z = i10;
        if (i10 == 2) {
            this.f57568a.setVisibility(8);
        } else if (i11 == 2) {
            this.f57568a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f57568a.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!this.f57567C) {
            V(0);
            S();
            return;
        }
        int i10 = this.f57593z;
        if (i10 == 1) {
            this.f57582o.start();
        } else if (i10 == 2) {
            this.f57583p.start();
        } else if (i10 == 3) {
            this.f57566B = true;
        } else if (i10 == 4) {
            return;
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() throws Resources.NotFoundException {
        ViewGroup viewGroup = this.f57572e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f57565A ? 0 : 4);
        }
        if (this.f57577j != null) {
            int dimensionPixelSize = this.f57568a.getResources().getDimensionPixelSize(C14371u.f134372d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f57577j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f57565A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f57577j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f57577j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f57565A) {
                    defaultTimeBar.i(true);
                } else {
                    int i10 = this.f57593z;
                    if (i10 == 1) {
                        defaultTimeBar.i(false);
                    } else if (i10 != 3) {
                        defaultTimeBar.r();
                    }
                }
            }
        }
        for (View view2 : this.f57592y) {
            view2.setVisibility((this.f57565A && W(view2)) ? 4 : 0);
        }
    }

    private boolean a0() {
        int width = (this.f57568a.getWidth() - this.f57568a.getPaddingLeft()) - this.f57568a.getPaddingRight();
        int height = (this.f57568a.getHeight() - this.f57568a.getPaddingBottom()) - this.f57568a.getPaddingTop();
        int iB = B(this.f57570c);
        ViewGroup viewGroup = this.f57570c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f57570c.getPaddingRight() : 0);
        int iZ = z(this.f57570c);
        ViewGroup viewGroup2 = this.f57570c;
        return width <= Math.max(paddingLeft, B(this.f57576i) + B(this.f57578k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f57570c.getPaddingBottom() : 0)) + (z(this.f57571d) * 2);
    }

    private void y(float f10) {
        if (this.f57575h != null) {
            this.f57575h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f57576i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f57573f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f57592y.contains(view);
    }

    public void C() {
        int i10 = this.f57593z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        if (!this.f57567C) {
            E();
        } else if (this.f57593z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f57593z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        E();
    }

    public boolean I() {
        return this.f57593z == 0 && this.f57568a.e0();
    }

    public void K() {
        this.f57568a.addOnLayoutChangeListener(this.f57591x);
    }

    public void L() {
        this.f57568a.removeOnLayoutChangeListener(this.f57591x);
    }

    public void M(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f57569b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void R() {
        this.f57568a.removeCallbacks(this.f57590w);
        this.f57568a.removeCallbacks(this.f57587t);
        this.f57568a.removeCallbacks(this.f57589v);
        this.f57568a.removeCallbacks(this.f57588u);
    }

    public void S() {
        if (this.f57593z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f57568a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f57567C) {
                Q(this.f57590w, showTimeoutMs);
            } else if (this.f57593z == 1) {
                Q(this.f57588u, 2000L);
            } else {
                Q(this.f57589v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z10) {
        this.f57567C = z10;
    }

    public void U(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f57592y.remove(view);
            return;
        }
        if (this.f57565A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f57592y.add(view);
    }

    public void X() {
        if (!this.f57568a.e0()) {
            this.f57568a.setVisibility(0);
            this.f57568a.n0();
            this.f57568a.k0();
        }
        Y();
    }

    public t(PlayerControlView playerControlView) throws Resources.NotFoundException {
        this.f57568a = playerControlView;
        this.f57569b = playerControlView.findViewById(C14374x.f134424l);
        this.f57570c = (ViewGroup) playerControlView.findViewById(C14374x.f134419g);
        this.f57572e = (ViewGroup) playerControlView.findViewById(C14374x.f134435w);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(C14374x.f134417e);
        this.f57571d = viewGroup;
        this.f57576i = (ViewGroup) playerControlView.findViewById(C14374x.f134411S);
        View viewFindViewById = playerControlView.findViewById(C14374x.f134399G);
        this.f57577j = viewFindViewById;
        this.f57573f = (ViewGroup) playerControlView.findViewById(C14374x.f134416d);
        this.f57574g = (ViewGroup) playerControlView.findViewById(C14374x.f134427o);
        this.f57575h = (ViewGroup) playerControlView.findViewById(C14374x.f134428p);
        View viewFindViewById2 = playerControlView.findViewById(C14374x.f134393A);
        this.f57578k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(C14374x.f134438z);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f57563a.P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f57563a.P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.d(this.f57564a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.f(this.f57553a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(C14371u.f134370b) - resources.getDimension(C14371u.f134371c);
        float dimension2 = resources.getDimension(C14371u.f134370b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f57579l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(J(0.0f, dimension, viewFindViewById)).with(J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f57580m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(playerControlView));
        animatorSet2.play(J(dimension, dimension2, viewFindViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f57581n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(J(0.0f, dimension2, viewFindViewById)).with(J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f57582o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(J(dimension, 0.0f, viewFindViewById)).with(J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f57583p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(J(dimension2, 0.0f, viewFindViewById)).with(J(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f57584q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.a(this.f57556a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f57585r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.l(this.f57557a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        boolean zA0 = a0();
        if (this.f57565A != zA0) {
            this.f57565A = zA0;
            view.post(new Runnable() { // from class: androidx.media3.ui.i
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    this.f57554a.Z();
                }
            });
        }
        if (i12 - i10 != i16 - i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f57565A && z10) {
            view.post(new Runnable() { // from class: androidx.media3.ui.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57555a.O();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(View view) {
        S();
        if (view.getId() == C14374x.f134393A) {
            this.f57584q.start();
        } else if (view.getId() == C14374x.f134438z) {
            this.f57585r.start();
        }
    }

    private boolean W(View view) {
        int id2 = view.getId();
        if (id2 != C14374x.f134417e && id2 != C14374x.f134398F && id2 != C14374x.f134437y && id2 != C14374x.f134402J && id2 != C14374x.f134403K && id2 != C14374x.f134429q && id2 != C14374x.f134430r) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void a(t tVar, ValueAnimator valueAnimator) {
        tVar.getClass();
        tVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void d(t tVar, ValueAnimator valueAnimator) {
        tVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = tVar.f57569b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = tVar.f57570c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = tVar.f57572e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void f(t tVar, ValueAnimator valueAnimator) {
        tVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = tVar.f57569b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = tVar.f57570c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = tVar.f57572e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void l(t tVar, ValueAnimator valueAnimator) {
        tVar.getClass();
        tVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
