package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import p2.C16342C;
import p2.E;
import p2.F;
import p2.InterfaceC16341B;
import p2.InterfaceC16343D;

/* loaded from: classes4.dex */
public class SwipeRefreshLayout extends ViewGroup implements E, InterfaceC16343D, InterfaceC16341B {

    /* renamed from: P, reason: collision with root package name */
    private static final String f58897P = "SwipeRefreshLayout";

    /* renamed from: Q, reason: collision with root package name */
    private static final int[] f58898Q = {R.attr.enabled};

    /* renamed from: A, reason: collision with root package name */
    int f58899A;

    /* renamed from: B, reason: collision with root package name */
    int f58900B;

    /* renamed from: C, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f58901C;

    /* renamed from: D, reason: collision with root package name */
    private Animation f58902D;

    /* renamed from: E, reason: collision with root package name */
    private Animation f58903E;

    /* renamed from: F, reason: collision with root package name */
    private Animation f58904F;

    /* renamed from: G, reason: collision with root package name */
    private Animation f58905G;

    /* renamed from: H, reason: collision with root package name */
    private Animation f58906H;

    /* renamed from: I, reason: collision with root package name */
    boolean f58907I;

    /* renamed from: J, reason: collision with root package name */
    private int f58908J;

    /* renamed from: K, reason: collision with root package name */
    boolean f58909K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f58910L;

    /* renamed from: M, reason: collision with root package name */
    private Animation.AnimationListener f58911M;

    /* renamed from: N, reason: collision with root package name */
    private final Animation f58912N;

    /* renamed from: O, reason: collision with root package name */
    private final Animation f58913O;

    /* renamed from: a, reason: collision with root package name */
    private View f58914a;

    /* renamed from: b, reason: collision with root package name */
    j f58915b;

    /* renamed from: c, reason: collision with root package name */
    boolean f58916c;

    /* renamed from: d, reason: collision with root package name */
    private int f58917d;

    /* renamed from: e, reason: collision with root package name */
    private float f58918e;

    /* renamed from: f, reason: collision with root package name */
    private float f58919f;

    /* renamed from: g, reason: collision with root package name */
    private final F f58920g;

    /* renamed from: h, reason: collision with root package name */
    private final C16342C f58921h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f58922i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f58923j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f58924k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f58925l;

    /* renamed from: m, reason: collision with root package name */
    private int f58926m;

    /* renamed from: n, reason: collision with root package name */
    int f58927n;

    /* renamed from: o, reason: collision with root package name */
    private float f58928o;

    /* renamed from: p, reason: collision with root package name */
    private float f58929p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f58930q;

    /* renamed from: r, reason: collision with root package name */
    private int f58931r;

    /* renamed from: s, reason: collision with root package name */
    boolean f58932s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f58933t;

    /* renamed from: u, reason: collision with root package name */
    private final DecelerateInterpolator f58934u;

    /* renamed from: v, reason: collision with root package name */
    CircleImageView f58935v;

    /* renamed from: w, reason: collision with root package name */
    private int f58936w;

    /* renamed from: x, reason: collision with root package name */
    protected int f58937x;

    /* renamed from: y, reason: collision with root package name */
    float f58938y;

    /* renamed from: z, reason: collision with root package name */
    protected int f58939z;

    class a implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f58916c) {
                swipeRefreshLayout.r();
                return;
            }
            swipeRefreshLayout.f58901C.setAlpha(l3.f93323c);
            SwipeRefreshLayout.this.f58901C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f58907I && (jVar = swipeRefreshLayout2.f58915b) != null) {
                jVar.onRefresh();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f58927n = swipeRefreshLayout3.f58935v.getTop();
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58944b;

        d(int i10, int i11) {
            this.f58943a = i10;
            this.f58944b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.f58901C.setAlpha((int) (this.f58943a + ((this.f58944b - r0) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f58932s) {
                return;
            }
            swipeRefreshLayout.x(null);
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f58909K ? swipeRefreshLayout.f58899A - Math.abs(swipeRefreshLayout.f58939z) : swipeRefreshLayout.f58899A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f58937x + ((int) ((iAbs - r1) * f10))) - swipeRefreshLayout2.f58935v.getTop());
            SwipeRefreshLayout.this.f58901C.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.p(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f58938y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.p(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void onRefresh();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f58919f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f58919f = 0.0f;
                } else {
                    this.f58919f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f58919f);
            }
        }
        if (this.f58909K && i11 > 0 && this.f58919f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f58935v.setVisibility(8);
        }
        int[] iArr2 = this.f58922i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f58924k);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f58918e = i10;
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f58916c == z10) {
            s(z10, false);
            return;
        }
        this.f58916c = z10;
        setTargetOffsetTopAndBottom((!this.f58909K ? this.f58899A + this.f58939z : this.f58899A) - this.f58927n);
        this.f58907I = false;
        z(this.f58911M);
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        final boolean f58950a;

        class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }

            a() {
            }
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f58950a = z10;
        }

        k(Parcel parcel) {
            super(parcel);
            this.f58950a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f58950a ? (byte) 1 : (byte) 0);
        }
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f58937x = i10;
        this.f58912N.reset();
        this.f58912N.setDuration(200L);
        this.f58912N.setInterpolator(this.f58934u);
        if (animationListener != null) {
            this.f58935v.b(animationListener);
        }
        this.f58935v.clearAnimation();
        this.f58935v.startAnimation(this.f58912N);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f58932s) {
            y(i10, animationListener);
            return;
        }
        this.f58937x = i10;
        this.f58913O.reset();
        this.f58913O.setDuration(200L);
        this.f58913O.setInterpolator(this.f58934u);
        if (animationListener != null) {
            this.f58935v.b(animationListener);
        }
        this.f58935v.clearAnimation();
        this.f58935v.startAnimation(this.f58913O);
    }

    private void d() {
        this.f58935v = new CircleImageView(getContext());
        androidx.swiperefreshlayout.widget.a aVar = new androidx.swiperefreshlayout.widget.a(getContext());
        this.f58901C = aVar;
        aVar.l(1);
        this.f58935v.setImageDrawable(this.f58901C);
        this.f58935v.setVisibility(8);
        addView(this.f58935v);
    }

    private void f() {
        if (this.f58914a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f58935v)) {
                    this.f58914a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f58918e) {
            s(true, true);
            return;
        }
        this.f58916c = false;
        this.f58901C.j(0.0f, 0.0f);
        b(this.f58927n, !this.f58932s ? new e() : null);
        this.f58901C.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f10) {
        this.f58901C.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f58918e));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f58918e;
        int i10 = this.f58900B;
        if (i10 <= 0) {
            i10 = this.f58909K ? this.f58899A - this.f58939z : this.f58899A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f58939z + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f58935v.getVisibility() != 0) {
            this.f58935v.setVisibility(0);
        }
        if (!this.f58932s) {
            this.f58935v.setScaleX(1.0f);
            this.f58935v.setScaleY(1.0f);
        }
        if (this.f58932s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f58918e));
        }
        if (f10 < this.f58918e) {
            if (this.f58901C.getAlpha() > 76 && !h(this.f58904F)) {
                w();
            }
        } else if (this.f58901C.getAlpha() < 255 && !h(this.f58905G)) {
            v();
        }
        this.f58901C.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f58901C.e(Math.min(1.0f, fMax));
        this.f58901C.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f58927n);
    }

    private void s(boolean z10, boolean z11) {
        if (this.f58916c != z10) {
            this.f58907I = z11;
            f();
            this.f58916c = z10;
            if (z10) {
                a(this.f58927n, this.f58911M);
            } else {
                x(this.f58911M);
            }
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f58935v.getBackground().setAlpha(i10);
        this.f58901C.setAlpha(i10);
    }

    private Animation t(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f58935v.b(null);
        this.f58935v.clearAnimation();
        this.f58935v.startAnimation(dVar);
        return dVar;
    }

    private void u(float f10) {
        float f11 = this.f58929p;
        float f12 = f10 - f11;
        int i10 = this.f58917d;
        if (f12 <= i10 || this.f58930q) {
            return;
        }
        this.f58928o = f11 + i10;
        this.f58930q = true;
        this.f58901C.setAlpha(76);
    }

    private void v() {
        this.f58905G = t(this.f58901C.getAlpha(), l3.f93323c);
    }

    private void w() {
        this.f58904F = t(this.f58901C.getAlpha(), 76);
    }

    private void y(int i10, Animation.AnimationListener animationListener) {
        this.f58937x = i10;
        this.f58938y = this.f58935v.getScaleX();
        h hVar = new h();
        this.f58906H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f58935v.b(animationListener);
        }
        this.f58935v.clearAnimation();
        this.f58935v.startAnimation(this.f58906H);
    }

    private void z(Animation.AnimationListener animationListener) {
        this.f58935v.setVisibility(0);
        this.f58901C.setAlpha(l3.f93323c);
        b bVar = new b();
        this.f58902D = bVar;
        bVar.setDuration(this.f58926m);
        if (animationListener != null) {
            this.f58935v.b(animationListener);
        }
        this.f58935v.clearAnimation();
        this.f58935v.startAnimation(this.f58902D);
    }

    public boolean c() {
        View view = this.f58914a;
        return view instanceof ListView ? androidx.core.widget.i.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f58921h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f58921h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f58921h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f58921h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f58921h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f58936w;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f58920g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f58908J;
    }

    public int getProgressViewEndOffset() {
        return this.f58899A;
    }

    public int getProgressViewStartOffset() {
        return this.f58939z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f58921h.k();
    }

    @Override // p2.InterfaceC16343D
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f58921h.m();
    }

    @Override // p2.InterfaceC16343D
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p2.InterfaceC16343D
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // p2.E
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f58923j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        if ((i16 == 0 ? i13 + this.f58923j[1] : i16) >= 0 || c()) {
            return;
        }
        float fAbs = this.f58919f + Math.abs(r14);
        this.f58919f = fAbs;
        l(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // p2.InterfaceC16343D
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f58924k);
    }

    @Override // p2.InterfaceC16343D
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f58920g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f58919f = 0.0f;
        this.f58925l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f58950a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f58920g.d(view);
        this.f58925l = false;
        float f10 = this.f58919f;
        if (f10 > 0.0f) {
            g(f10);
            this.f58919f = 0.0f;
        }
        stopNestedScroll();
    }

    void p(float f10) {
        setTargetOffsetTopAndBottom((this.f58937x + ((int) ((this.f58939z - r0) * f10))) - this.f58935v.getTop());
    }

    void r() {
        this.f58935v.clearAnimation();
        this.f58901C.stop();
        this.f58935v.setVisibility(8);
        setColorViewAlpha(l3.f93323c);
        if (this.f58932s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f58939z - this.f58927n);
        }
        this.f58927n = this.f58935v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f58914a;
        if (view == null || ViewCompat.T(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        } else {
            if (this.f58910L || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    void setAnimationProgress(float f10) {
        this.f58935v.setScaleX(f10);
        this.f58935v.setScaleY(f10);
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f58910L = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f58921h.n(z10);
    }

    public void setOnRefreshListener(j jVar) {
        this.f58915b = jVar;
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f58935v.setBackgroundColor(i10);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f58908J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f58908J = (int) (displayMetrics.density * 40.0f);
            }
            this.f58935v.setImageDrawable(null);
            this.f58901C.l(i10);
            this.f58935v.setImageDrawable(this.f58901C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f58900B = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f58935v.bringToFront();
        ViewCompat.Y(this.f58935v, i10);
        this.f58927n = this.f58935v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f58921h.p(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f58921h.r();
    }

    void x(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f58903E = cVar;
        cVar.setDuration(150L);
        this.f58935v.b(animationListener);
        this.f58935v.clearAnimation();
        this.f58935v.startAnimation(this.f58903E);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58916c = false;
        this.f58918e = -1.0f;
        this.f58922i = new int[2];
        this.f58923j = new int[2];
        this.f58924k = new int[2];
        this.f58931r = -1;
        this.f58936w = -1;
        this.f58911M = new a();
        this.f58912N = new f();
        this.f58913O = new g();
        this.f58917d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f58926m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f58934u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f58908J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f58899A = i10;
        this.f58918e = i10;
        this.f58920g = new F(this);
        this.f58921h = new C16342C(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f58908J;
        this.f58927n = i11;
        this.f58939z = i11;
        p(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f58898Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void q(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f58931r) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f58931r = motionEvent.getPointerId(i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.f()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f58933t
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.f58933t = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.f58933t
            if (r1 != 0) goto L81
            boolean r1 = r4.c()
            if (r1 != 0) goto L81
            boolean r1 = r4.f58916c
            if (r1 != 0) goto L81
            boolean r1 = r4.f58925l
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.q(r5)
            goto L7e
        L3d:
            int r0 = r4.f58931r
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f58897P
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            com.fullstory.FS.log_e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.u(r5)
            goto L7e
        L58:
            r4.f58930q = r2
            r4.f58931r = r3
            goto L7e
        L5d:
            int r0 = r4.f58939z
            androidx.swiperefreshlayout.widget.CircleImageView r1 = r4.f58935v
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.f58931r = r0
            r4.f58930q = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.f58929p = r5
        L7e:
            boolean r5 = r4.f58930q
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f58914a == null) {
                f();
            }
            View view = this.f58914a;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.f58935v.getMeasuredWidth();
            int measuredHeight2 = this.f58935v.getMeasuredHeight();
            int i14 = measuredWidth / 2;
            int i15 = measuredWidth2 / 2;
            int i16 = this.f58927n;
            this.f58935v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f58914a == null) {
            f();
        }
        View view = this.f58914a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f58935v.measure(View.MeasureSpec.makeMeasureSpec(this.f58908J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f58908J, 1073741824));
            this.f58936w = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == this.f58935v) {
                    this.f58936w = i12;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f58916c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if (isEnabled() && !this.f58933t && !this.f58916c && (i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f58933t && actionMasked == 0) {
            this.f58933t = false;
        }
        if (!isEnabled() || this.f58933t || c() || this.f58916c || this.f58925l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            q(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            FS.log_e(f58897P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.f58931r = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f58931r);
                    if (iFindPointerIndex < 0) {
                        FS.log_e(f58897P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    u(y10);
                    if (this.f58930q) {
                        float f10 = (y10 - this.f58928o) * 0.5f;
                        if (f10 <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        l(f10);
                    }
                }
            } else {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f58931r);
                if (iFindPointerIndex2 < 0) {
                    FS.log_e(f58897P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f58930q) {
                    float y11 = (motionEvent.getY(iFindPointerIndex2) - this.f58928o) * 0.5f;
                    this.f58930q = false;
                    g(y11);
                }
                this.f58931r = -1;
                return false;
            }
        } else {
            this.f58931r = motionEvent.getPointerId(0);
            this.f58930q = false;
        }
        return true;
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f58901C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = Z1.b.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            r();
        }
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(Z1.b.c(getContext(), i10));
    }
}
