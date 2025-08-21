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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class t {

    /* renamed from: A, reason: collision with root package name */
    private boolean f57789A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f57790B;

    /* renamed from: a, reason: collision with root package name */
    private final PlayerControlView f57792a;

    /* renamed from: b, reason: collision with root package name */
    private final View f57793b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f57794c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewGroup f57795d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f57796e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f57797f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f57798g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f57799h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f57800i;

    /* renamed from: j, reason: collision with root package name */
    private final View f57801j;

    /* renamed from: k, reason: collision with root package name */
    private final View f57802k;

    /* renamed from: l, reason: collision with root package name */
    private final AnimatorSet f57803l;

    /* renamed from: m, reason: collision with root package name */
    private final AnimatorSet f57804m;

    /* renamed from: n, reason: collision with root package name */
    private final AnimatorSet f57805n;

    /* renamed from: o, reason: collision with root package name */
    private final AnimatorSet f57806o;

    /* renamed from: p, reason: collision with root package name */
    private final AnimatorSet f57807p;

    /* renamed from: q, reason: collision with root package name */
    private final ValueAnimator f57808q;

    /* renamed from: r, reason: collision with root package name */
    private final ValueAnimator f57809r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f57810s = new Runnable() { // from class: androidx.media3.ui.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f57776a.Y();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f57811t = new Runnable() { // from class: androidx.media3.ui.m
        @Override // java.lang.Runnable
        public final void run() {
            this.f57782a.D();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f57812u = new Runnable() { // from class: androidx.media3.ui.n
        @Override // java.lang.Runnable
        public final void run() {
            this.f57783a.H();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f57813v = new Runnable() { // from class: androidx.media3.ui.o
        @Override // java.lang.Runnable
        public final void run() {
            this.f57784a.G();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f57814w = new Runnable() { // from class: androidx.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f57785a.E();
        }
    };

    /* renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f57815x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.q
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f57786a.N(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };

    /* renamed from: C, reason: collision with root package name */
    private boolean f57791C = true;

    /* renamed from: z, reason: collision with root package name */
    private int f57817z = 0;

    /* renamed from: y, reason: collision with root package name */
    private final List<View> f57816y = new ArrayList();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (t.this.f57793b != null) {
                t.this.f57793b.setVisibility(4);
            }
            if (t.this.f57794c != null) {
                t.this.f57794c.setVisibility(4);
            }
            if (t.this.f57796e != null) {
                t.this.f57796e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(t.this.f57801j instanceof DefaultTimeBar) || t.this.f57789A) {
                return;
            }
            ((DefaultTimeBar) t.this.f57801j).h(250L);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (t.this.f57793b != null) {
                t.this.f57793b.setVisibility(0);
            }
            if (t.this.f57794c != null) {
                t.this.f57794c.setVisibility(0);
            }
            if (t.this.f57796e != null) {
                t.this.f57796e.setVisibility(t.this.f57789A ? 0 : 4);
            }
            if (!(t.this.f57801j instanceof DefaultTimeBar) || t.this.f57789A) {
                return;
            }
            ((DefaultTimeBar) t.this.f57801j).s(250L);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PlayerControlView f57820a;

        c(PlayerControlView playerControlView) {
            this.f57820a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(1);
            if (t.this.f57790B) {
                this.f57820a.post(t.this.f57810s);
                t.this.f57790B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.V(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PlayerControlView f57822a;

        d(PlayerControlView playerControlView) {
            this.f57822a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(2);
            if (t.this.f57790B) {
                this.f57822a.post(t.this.f57810s);
                t.this.f57790B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.V(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PlayerControlView f57824a;

        e(PlayerControlView playerControlView) {
            this.f57824a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.V(2);
            if (t.this.f57790B) {
                this.f57824a.post(t.this.f57810s);
                t.this.f57790B = false;
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
            if (t.this.f57797f != null) {
                t.this.f57797f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (t.this.f57799h != null) {
                t.this.f57799h.setVisibility(0);
                t.this.f57799h.setTranslationX(t.this.f57799h.getWidth());
                t.this.f57799h.scrollTo(t.this.f57799h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (t.this.f57799h != null) {
                t.this.f57799h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (t.this.f57797f != null) {
                t.this.f57797f.setVisibility(0);
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
        this.f57805n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f57803l.start();
        Q(this.f57812u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f57804m.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i10;
        if (this.f57797f == null || this.f57798g == null) {
            return;
        }
        int width = (this.f57792a.getWidth() - this.f57792a.getPaddingLeft()) - this.f57792a.getPaddingRight();
        while (true) {
            if (this.f57798g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f57798g.getChildCount() - 2;
            View childAt = this.f57798g.getChildAt(childCount);
            this.f57798g.removeViewAt(childCount);
            this.f57797f.addView(childAt, 0);
        }
        View view = this.f57802k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f57800i);
        int childCount2 = this.f57797f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f57797f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f57799h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f57809r.isStarted()) {
                return;
            }
            this.f57808q.cancel();
            this.f57809r.start();
            return;
        }
        View view2 = this.f57802k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f57802k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f57797f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f57797f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f57798g.addView((View) arrayList.get(i10), this.f57798g.getChildCount() - 1);
        }
    }

    private void Q(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f57792a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        int i11 = this.f57817z;
        this.f57817z = i10;
        if (i10 == 2) {
            this.f57792a.setVisibility(8);
        } else if (i11 == 2) {
            this.f57792a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f57792a.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!this.f57791C) {
            V(0);
            S();
            return;
        }
        int i10 = this.f57817z;
        if (i10 == 1) {
            this.f57806o.start();
        } else if (i10 == 2) {
            this.f57807p.start();
        } else if (i10 == 3) {
            this.f57790B = true;
        } else if (i10 == 4) {
            return;
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() throws Resources.NotFoundException {
        ViewGroup viewGroup = this.f57796e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f57789A ? 0 : 4);
        }
        if (this.f57801j != null) {
            int dimensionPixelSize = this.f57792a.getResources().getDimensionPixelSize(h4.u.f134843d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f57801j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f57789A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f57801j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f57801j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f57789A) {
                    defaultTimeBar.i(true);
                } else {
                    int i10 = this.f57817z;
                    if (i10 == 1) {
                        defaultTimeBar.i(false);
                    } else if (i10 != 3) {
                        defaultTimeBar.r();
                    }
                }
            }
        }
        for (View view2 : this.f57816y) {
            view2.setVisibility((this.f57789A && W(view2)) ? 4 : 0);
        }
    }

    private boolean a0() {
        int width = (this.f57792a.getWidth() - this.f57792a.getPaddingLeft()) - this.f57792a.getPaddingRight();
        int height = (this.f57792a.getHeight() - this.f57792a.getPaddingBottom()) - this.f57792a.getPaddingTop();
        int iB = B(this.f57794c);
        ViewGroup viewGroup = this.f57794c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f57794c.getPaddingRight() : 0);
        int iZ = z(this.f57794c);
        ViewGroup viewGroup2 = this.f57794c;
        return width <= Math.max(paddingLeft, B(this.f57800i) + B(this.f57802k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f57794c.getPaddingBottom() : 0)) + (z(this.f57795d) * 2);
    }

    private void y(float f10) {
        if (this.f57799h != null) {
            this.f57799h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f57800i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f57797f;
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
        return view != null && this.f57816y.contains(view);
    }

    public void C() {
        int i10 = this.f57817z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        if (!this.f57791C) {
            E();
        } else if (this.f57817z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f57817z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        E();
    }

    public boolean I() {
        return this.f57817z == 0 && this.f57792a.e0();
    }

    public void K() {
        this.f57792a.addOnLayoutChangeListener(this.f57815x);
    }

    public void L() {
        this.f57792a.removeOnLayoutChangeListener(this.f57815x);
    }

    public void M(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f57793b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void R() {
        this.f57792a.removeCallbacks(this.f57814w);
        this.f57792a.removeCallbacks(this.f57811t);
        this.f57792a.removeCallbacks(this.f57813v);
        this.f57792a.removeCallbacks(this.f57812u);
    }

    public void S() {
        if (this.f57817z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f57792a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f57791C) {
                Q(this.f57814w, showTimeoutMs);
            } else if (this.f57817z == 1) {
                Q(this.f57812u, 2000L);
            } else {
                Q(this.f57813v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z10) {
        this.f57791C = z10;
    }

    public void U(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f57816y.remove(view);
            return;
        }
        if (this.f57789A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f57816y.add(view);
    }

    public void X() {
        if (!this.f57792a.e0()) {
            this.f57792a.setVisibility(0);
            this.f57792a.n0();
            this.f57792a.k0();
        }
        Y();
    }

    public t(PlayerControlView playerControlView) throws Resources.NotFoundException {
        this.f57792a = playerControlView;
        this.f57793b = playerControlView.findViewById(h4.x.f134895l);
        this.f57794c = (ViewGroup) playerControlView.findViewById(h4.x.f134890g);
        this.f57796e = (ViewGroup) playerControlView.findViewById(h4.x.f134906w);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(h4.x.f134888e);
        this.f57795d = viewGroup;
        this.f57800i = (ViewGroup) playerControlView.findViewById(h4.x.f134882S);
        View viewFindViewById = playerControlView.findViewById(h4.x.f134870G);
        this.f57801j = viewFindViewById;
        this.f57797f = (ViewGroup) playerControlView.findViewById(h4.x.f134887d);
        this.f57798g = (ViewGroup) playerControlView.findViewById(h4.x.f134898o);
        this.f57799h = (ViewGroup) playerControlView.findViewById(h4.x.f134899p);
        View viewFindViewById2 = playerControlView.findViewById(h4.x.f134864A);
        this.f57802k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(h4.x.f134909z);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f57787a.P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f57787a.P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.d(this.f57788a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.f(this.f57777a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(h4.u.f134841b) - resources.getDimension(h4.u.f134842c);
        float dimension2 = resources.getDimension(h4.u.f134841b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f57803l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(J(0.0f, dimension, viewFindViewById)).with(J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f57804m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(playerControlView));
        animatorSet2.play(J(dimension, dimension2, viewFindViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f57805n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(J(0.0f, dimension2, viewFindViewById)).with(J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f57806o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(J(dimension, 0.0f, viewFindViewById)).with(J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f57807p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(J(dimension2, 0.0f, viewFindViewById)).with(J(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f57808q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.a(this.f57780a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f57809r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.l(this.f57781a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        boolean zA0 = a0();
        if (this.f57789A != zA0) {
            this.f57789A = zA0;
            view.post(new Runnable() { // from class: androidx.media3.ui.i
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    this.f57778a.Z();
                }
            });
        }
        if (i12 - i10 != i16 - i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f57789A && z10) {
            view.post(new Runnable() { // from class: androidx.media3.ui.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57779a.O();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(View view) {
        S();
        if (view.getId() == h4.x.f134864A) {
            this.f57808q.start();
        } else if (view.getId() == h4.x.f134909z) {
            this.f57809r.start();
        }
    }

    private boolean W(View view) {
        int id2 = view.getId();
        if (id2 != h4.x.f134888e && id2 != h4.x.f134869F && id2 != h4.x.f134908y && id2 != h4.x.f134873J && id2 != h4.x.f134874K && id2 != h4.x.f134900q && id2 != h4.x.f134901r) {
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
        View view = tVar.f57793b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = tVar.f57794c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = tVar.f57796e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void f(t tVar, ValueAnimator valueAnimator) {
        tVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = tVar.f57793b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = tVar.f57794c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = tVar.f57796e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void l(t tVar, ValueAnimator valueAnimator) {
        tVar.getClass();
        tVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
