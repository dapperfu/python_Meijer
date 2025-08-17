package com.google.android.material.tabs;

import ae.C5597b;
import ae.j;
import ae.k;
import ae.l;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import be.C6230a;
import ce.C6386a;
import ce.C6388c;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.fullstory.instrumentation.FSOuterThis;
import com.google.android.gms.common.api.a;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d2.C13462a;
import i.C14584j;
import j.C14791a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ne.i;
import oe.C16026c;
import p2.K;
import pe.C16292b;
import q2.y;
import re.C16760h;
import re.C16761i;
import ue.C17250a;

@ViewPager.e
/* loaded from: classes4.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: W, reason: collision with root package name */
    private static final int f87588W = k.f44800p;

    /* renamed from: a0, reason: collision with root package name */
    private static final o2.f<f> f87589a0 = new o2.h(16);

    /* renamed from: A, reason: collision with root package name */
    int f87590A;

    /* renamed from: B, reason: collision with root package name */
    int f87591B;

    /* renamed from: C, reason: collision with root package name */
    int f87592C;

    /* renamed from: D, reason: collision with root package name */
    int f87593D;

    /* renamed from: E, reason: collision with root package name */
    boolean f87594E;

    /* renamed from: F, reason: collision with root package name */
    boolean f87595F;

    /* renamed from: G, reason: collision with root package name */
    int f87596G;

    /* renamed from: H, reason: collision with root package name */
    int f87597H;

    /* renamed from: I, reason: collision with root package name */
    boolean f87598I;

    /* renamed from: J, reason: collision with root package name */
    private com.google.android.material.tabs.c f87599J;

    /* renamed from: K, reason: collision with root package name */
    private final TimeInterpolator f87600K;

    /* renamed from: L, reason: collision with root package name */
    private c f87601L;

    /* renamed from: M, reason: collision with root package name */
    private c f87602M;

    /* renamed from: N, reason: collision with root package name */
    private ValueAnimator f87603N;

    /* renamed from: O, reason: collision with root package name */
    ViewPager f87604O;

    /* renamed from: P, reason: collision with root package name */
    private androidx.viewpager.widget.a f87605P;

    /* renamed from: Q, reason: collision with root package name */
    private DataSetObserver f87606Q;

    /* renamed from: R, reason: collision with root package name */
    private g f87607R;

    /* renamed from: S, reason: collision with root package name */
    private b f87608S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f87609T;

    /* renamed from: U, reason: collision with root package name */
    private int f87610U;

    /* renamed from: V, reason: collision with root package name */
    private final o2.f<TabView> f87611V;

    /* renamed from: a, reason: collision with root package name */
    int f87612a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<f> f87613b;

    /* renamed from: c, reason: collision with root package name */
    private f f87614c;

    /* renamed from: d, reason: collision with root package name */
    final SlidingTabIndicator f87615d;

    /* renamed from: e, reason: collision with root package name */
    int f87616e;

    /* renamed from: f, reason: collision with root package name */
    int f87617f;

    /* renamed from: g, reason: collision with root package name */
    int f87618g;

    /* renamed from: h, reason: collision with root package name */
    int f87619h;

    /* renamed from: i, reason: collision with root package name */
    private final int f87620i;

    /* renamed from: j, reason: collision with root package name */
    private final int f87621j;

    /* renamed from: k, reason: collision with root package name */
    private int f87622k;

    /* renamed from: l, reason: collision with root package name */
    ColorStateList f87623l;

    /* renamed from: m, reason: collision with root package name */
    ColorStateList f87624m;

    /* renamed from: n, reason: collision with root package name */
    ColorStateList f87625n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f87626o;

    /* renamed from: p, reason: collision with root package name */
    private int f87627p;

    /* renamed from: q, reason: collision with root package name */
    PorterDuff.Mode f87628q;

    /* renamed from: r, reason: collision with root package name */
    float f87629r;

    /* renamed from: s, reason: collision with root package name */
    float f87630s;
    private final ArrayList<c> selectedListeners;

    /* renamed from: t, reason: collision with root package name */
    float f87631t;

    /* renamed from: u, reason: collision with root package name */
    final int f87632u;

    /* renamed from: v, reason: collision with root package name */
    int f87633v;

    /* renamed from: w, reason: collision with root package name */
    private final int f87634w;

    /* renamed from: x, reason: collision with root package name */
    private final int f87635x;

    /* renamed from: y, reason: collision with root package name */
    private final int f87636y;

    /* renamed from: z, reason: collision with root package name */
    private int f87637z;

    class SlidingTabIndicator extends LinearLayout implements FSDraw, FSDispatchDraw {

        /* renamed from: a, reason: collision with root package name */
        ValueAnimator f87638a;

        /* renamed from: b, reason: collision with root package name */
        private int f87639b;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f87641a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f87642b;

            a(View view, View view2) {
                this.f87641a = view;
                this.f87642b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SlidingTabIndicator.this.j(this.f87641a, this.f87642b, valueAnimator.getAnimatedFraction());
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            fsSuperDispatchDraw_4c3317db3b0d42f9f62df552eaea66ee(canvas);
        }

        @Override // android.view.ViewGroup
        public boolean drawChild(Canvas canvas, View view, long j10) {
            return fsSuperDrawChild_4c3317db3b0d42f9f62df552eaea66ee(canvas, view, j10);
        }

        public void fsSuperDispatchDraw_4c3317db3b0d42f9f62df552eaea66ee(Canvas canvas) {
            if (FS.isRecordingDispatchDraw(this, canvas)) {
                return;
            }
            super.dispatchDraw(canvas);
        }

        public boolean fsSuperDrawChild_4c3317db3b0d42f9f62df552eaea66ee(Canvas canvas, View view, long j10) {
            if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
                return false;
            }
            return super.drawChild(canvas, view, j10);
        }

        public void fsSuperDraw_4c3317db3b0d42f9f62df552eaea66ee(Canvas canvas) {
            if (FS.isRecordingDraw(this, canvas)) {
                return;
            }
            super.draw(canvas);
        }

        SlidingTabIndicator(Context context) {
            super(context);
            this.f87639b = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f87612a == -1) {
                tabLayout.f87612a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f87612a);
        }

        private void f(int i10) {
            if (TabLayout.this.f87610U == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.f87599J;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f87626o);
                TabLayout.this.f87612a = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f87626o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f87626o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.f87599J;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f87626o);
            }
            ViewCompat.d0(this);
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f87612a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f87612a = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f87638a.removeAllUpdateListeners();
                this.f87638a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f87638a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f87600K);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f87638a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f87612a != i10) {
                this.f87638a.cancel();
            }
            k(true, i10, i11);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f87626o.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f87626o.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f87592C;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f87626o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f87626o.getBounds();
                TabLayout.this.f87626o.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f87626o.draw(canvas);
            }
            fsSuperDraw_4c3317db3b0d42f9f62df552eaea66ee(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f87612a = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f87638a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f87638a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f87626o.getBounds();
            TabLayout.this.f87626o.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f87638a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z10 = true;
                if (tabLayout.f87590A == 1 || tabLayout.f87593D == 2) {
                    int childCount = getChildCount();
                    int iMax = 0;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = getChildAt(i12);
                        if (childAt.getVisibility() == 0) {
                            iMax = Math.max(iMax, childAt.getMeasuredWidth());
                        }
                    }
                    if (iMax > 0) {
                        if (iMax * childCount <= getMeasuredWidth() - (((int) x.d(getContext(), 16)) * 2)) {
                            boolean z11 = false;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                                if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                                    layoutParams.width = iMax;
                                    layoutParams.weight = 0.0f;
                                    z11 = true;
                                }
                            }
                            z10 = z11;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f87590A = 0;
                            tabLayout2.U(false);
                        }
                        if (z10) {
                            super.onMeasure(i10, i11);
                        }
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public final class TabView extends LinearLayout implements FSOuterThis {

        /* renamed from: a, reason: collision with root package name */
        private f f87644a;

        /* renamed from: b, reason: collision with root package name */
        private TextView f87645b;

        /* renamed from: c, reason: collision with root package name */
        private ImageView f87646c;

        /* renamed from: d, reason: collision with root package name */
        private View f87647d;

        /* renamed from: e, reason: collision with root package name */
        private C6386a f87648e;

        /* renamed from: f, reason: collision with root package name */
        private View f87649f;

        /* renamed from: g, reason: collision with root package name */
        private TextView f87650g;

        /* renamed from: h, reason: collision with root package name */
        private ImageView f87651h;

        /* renamed from: i, reason: collision with root package name */
        private Drawable f87652i;

        /* renamed from: j, reason: collision with root package name */
        private int f87653j;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f87654a;

            a(View view) {
                this.f87654a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f87654a.getVisibility() == 0) {
                    TabView.this.s(this.f87654a);
                }
            }
        }

        @Override // com.fullstory.instrumentation.FSOuterThis
        public Object _fsGetOuterThis() {
            return TabLayout.this;
        }

        void o() {
            setTab(null);
            setSelected(false);
        }

        public TabView(Context context) {
            super(context);
            this.f87653j = 2;
            u(context);
            ViewCompat.B0(this, TabLayout.this.f87616e, TabLayout.this.f87617f, TabLayout.this.f87618g, TabLayout.this.f87619h);
            setGravity(17);
            setOrientation(!TabLayout.this.f87594E ? 1 : 0);
            setClickable(true);
            ViewCompat.C0(this, K.b(getContext(), 1002));
        }

        private void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private C6386a getBadge() {
            return this.f87648e;
        }

        private C6386a getOrCreateBadge() {
            if (this.f87648e == null) {
                this.f87648e = C6386a.e(getContext());
            }
            r();
            C6386a c6386a = this.f87648e;
            if (c6386a != null) {
                return c6386a;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Canvas canvas) {
            Drawable drawable = this.f87652i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f87652i.draw(canvas);
            }
        }

        private FrameLayout k(View view) {
            if ((view == this.f87646c || view == this.f87645b) && C6388c.f61754a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l() {
            return this.f87648e != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m() {
            FrameLayout frameLayoutI;
            if (C6388c.f61754a) {
                frameLayoutI = i();
                addView(frameLayoutI, 0);
            } else {
                frameLayoutI = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(ae.h.f44718d, (ViewGroup) frameLayoutI, false);
            this.f87646c = imageView;
            frameLayoutI.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayoutI;
            if (C6388c.f61754a) {
                frameLayoutI = i();
                addView(frameLayoutI);
            } else {
                frameLayoutI = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(ae.h.f44719e, (ViewGroup) frameLayoutI, false);
            this.f87645b = textView;
            frameLayoutI.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void u(Context context) {
            int i10 = TabLayout.this.f87632u;
            if (i10 != 0) {
                Drawable drawableB = C14791a.b(context, i10);
                this.f87652i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f87652i.setState(getDrawableState());
                }
            } else {
                this.f87652i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f87625n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = C16292b.a(TabLayout.this.f87625n);
                boolean z10 = TabLayout.this.f87598I;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            ViewCompat.q0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void x(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r7.f87644a
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.f()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$f r0 = r7.f87644a
                android.graphics.drawable.Drawable r0 = r0.f()
                android.graphics.drawable.Drawable r0 = d2.C13462a.r(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L2d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f87624m
                d2.C13462a.o(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f87628q
                if (r2 == 0) goto L2d
                d2.C13462a.p(r0, r2)
            L2d:
                com.google.android.material.tabs.TabLayout$f r2 = r7.f87644a
                if (r2 == 0) goto L36
                java.lang.CharSequence r2 = r2.i()
                goto L37
            L36:
                r2 = r1
            L37:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L4e
                if (r0 == 0) goto L48
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L4e
            L48:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L4e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L77
                if (r0 != 0) goto L60
                com.google.android.material.tabs.TabLayout$f r5 = r7.f87644a
                int r5 = com.google.android.material.tabs.TabLayout.f.b(r5)
                r6 = 1
                if (r5 != r6) goto L60
                goto L61
            L60:
                r6 = r4
            L61:
                if (r0 != 0) goto L65
                r5 = r2
                goto L66
            L65:
                r5 = r1
            L66:
                r8.setText(r5)
                if (r6 == 0) goto L6d
                r5 = r4
                goto L6e
            L6d:
                r5 = r3
            L6e:
                r8.setVisibility(r5)
                if (r0 != 0) goto L78
                r7.setVisibility(r4)
                goto L78
            L77:
                r6 = r4
            L78:
                if (r10 == 0) goto Lbc
                if (r9 == 0) goto Lbc
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L94
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L94
                android.content.Context r10 = r7.getContext()
                float r10 = com.google.android.material.internal.x.d(r10, r3)
                int r10 = (int) r10
                goto L95
            L94:
                r10 = r4
            L95:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.f87594E
                if (r3 == 0) goto Lad
                int r3 = p2.C16236t.a(r8)
                if (r10 == r3) goto Lbc
                p2.C16236t.c(r8, r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lbc
            Lad:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lbc
                r8.bottomMargin = r10
                p2.C16236t.c(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lbc:
                com.google.android.material.tabs.TabLayout$f r8 = r7.f87644a
                if (r8 == 0) goto Lc4
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.f.c(r8)
            Lc4:
                if (r0 != 0) goto Lc7
                goto Lc8
            Lc7:
                r2 = r1
            Lc8:
                androidx.appcompat.widget.S.a(r7, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.x(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        int getContentHeight() {
            View[] viewArr = {this.f87645b, this.f87646c, this.f87649f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f87645b, this.f87646c, this.f87649f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public f getTab() {
            return this.f87644a;
        }

        void setTab(f fVar) {
            if (fVar != this.f87644a) {
                this.f87644a = fVar;
                t();
            }
        }

        final void v() {
            setOrientation(!TabLayout.this.f87594E ? 1 : 0);
            TextView textView = this.f87650g;
            if (textView == null && this.f87651h == null) {
                x(this.f87645b, this.f87646c, true);
            } else {
                x(textView, this.f87651h, false);
            }
        }

        final void w() {
            ViewParent parent;
            f fVar = this.f87644a;
            View viewE = fVar != null ? fVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f87649f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f87649f);
                    }
                    addView(viewE);
                }
                this.f87649f = viewE;
                TextView textView = this.f87645b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f87646c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f87646c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f87650g = textView2;
                if (textView2 != null) {
                    this.f87653j = androidx.core.widget.k.d(textView2);
                }
                this.f87651h = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f87649f;
                if (view2 != null) {
                    removeView(view2);
                    this.f87649f = null;
                }
                this.f87650g = null;
                this.f87651h = null;
            }
            if (this.f87649f == null) {
                if (this.f87646c == null) {
                    m();
                }
                if (this.f87645b == null) {
                    n();
                    this.f87653j = androidx.core.widget.k.d(this.f87645b);
                }
                androidx.core.widget.k.p(this.f87645b, TabLayout.this.f87620i);
                if (!isSelected() || TabLayout.this.f87622k == -1) {
                    androidx.core.widget.k.p(this.f87645b, TabLayout.this.f87621j);
                } else {
                    androidx.core.widget.k.p(this.f87645b, TabLayout.this.f87622k);
                }
                ColorStateList colorStateList = TabLayout.this.f87623l;
                if (colorStateList != null) {
                    this.f87645b.setTextColor(colorStateList);
                }
                x(this.f87645b, this.f87646c, true);
                r();
                f(this.f87646c);
                f(this.f87645b);
            } else {
                TextView textView3 = this.f87650g;
                if (textView3 != null || this.f87651h != null) {
                    x(textView3, this.f87651h, false);
                }
            }
            if (fVar == null || TextUtils.isEmpty(fVar.f87663d)) {
                return;
            }
            setContentDescription(fVar.f87663d);
        }

        private float g(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void h(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        private void p(View view) {
            if (l() && view != null) {
                h(false);
                C6388c.b(this.f87648e, view, k(view));
                this.f87647d = view;
            }
        }

        private void q() {
            if (l()) {
                h(true);
                View view = this.f87647d;
                if (view != null) {
                    C6388c.c(this.f87648e, view);
                    this.f87647d = null;
                }
            }
        }

        private void r() {
            f fVar;
            f fVar2;
            if (!l()) {
                return;
            }
            if (this.f87649f != null) {
                q();
                return;
            }
            if (this.f87646c != null && (fVar2 = this.f87644a) != null && fVar2.f() != null) {
                View view = this.f87647d;
                ImageView imageView = this.f87646c;
                if (view != imageView) {
                    q();
                    p(this.f87646c);
                    return;
                } else {
                    s(imageView);
                    return;
                }
            }
            if (this.f87645b != null && (fVar = this.f87644a) != null && fVar.h() == 1) {
                View view2 = this.f87647d;
                TextView textView = this.f87645b;
                if (view2 != textView) {
                    q();
                    p(this.f87645b);
                    return;
                } else {
                    s(textView);
                    return;
                }
            }
            q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            if (l() && view == this.f87647d) {
                C6388c.d(this.f87648e, view, k(view));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            boolean state;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f87652i;
            if (drawable != null && drawable.isStateful()) {
                state = this.f87652i.setState(drawableState);
            } else {
                state = false;
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            y yVarG1 = y.g1(accessibilityNodeInfo);
            C6386a c6386a = this.f87648e;
            if (c6386a != null && c6386a.isVisible()) {
                yVarG1.t0(this.f87648e.i());
            }
            yVarG1.s0(y.f.a(0, 1, this.f87644a.g(), 1, false, isSelected()));
            if (isSelected()) {
                yVarG1.q0(false);
                yVarG1.g0(y.a.f156728i);
            }
            yVarG1.P0(getResources().getString(j.f44754h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f87633v, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f87645b != null) {
                float f10 = TabLayout.this.f87629r;
                int i12 = this.f87653j;
                ImageView imageView = this.f87646c;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    TextView textView = this.f87645b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f87631t;
                    }
                }
                float textSize = this.f87645b.getTextSize();
                int lineCount = this.f87645b.getLineCount();
                int iD = androidx.core.widget.k.d(this.f87645b);
                if (f10 != textSize || (iD >= 0 && i12 != iD)) {
                    if (TabLayout.this.f87593D == 1 && f10 > textSize && lineCount == 1 && ((layout = this.f87645b.getLayout()) == null || g(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        return;
                    }
                    this.f87645b.setTextSize(0, f10);
                    this.f87645b.setMaxLines(i12);
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f87644a != null) {
                if (!zPerformClick) {
                    playSoundEffect(0);
                }
                this.f87644a.l();
                return true;
            }
            return zPerformClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f87645b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f87646c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f87649f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        final void t() {
            boolean z10;
            w();
            f fVar = this.f87644a;
            if (fVar != null && fVar.j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setSelected(z10);
        }
    }

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        private boolean f87657a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f87604O == viewPager) {
                tabLayout.M(aVar2, this.f87657a);
            }
        }

        void b(boolean z10) {
            this.f87657a = z10;
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void A(T t10);

        void F(T t10);

        void L(T t10);
    }

    public interface d extends c<f> {
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.F();
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private Object f87660a;

        /* renamed from: b, reason: collision with root package name */
        private Drawable f87661b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f87662c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f87663d;

        /* renamed from: f, reason: collision with root package name */
        private View f87665f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f87667h;

        /* renamed from: i, reason: collision with root package name */
        public TabView f87668i;

        /* renamed from: e, reason: collision with root package name */
        private int f87664e = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f87666g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f87669j = -1;

        void k() {
            this.f87667h = null;
            this.f87668i = null;
            this.f87660a = null;
            this.f87661b = null;
            this.f87669j = -1;
            this.f87662c = null;
            this.f87663d = null;
            this.f87664e = -1;
            this.f87665f = null;
        }

        public View e() {
            return this.f87665f;
        }

        public Drawable f() {
            return this.f87661b;
        }

        public int g() {
            return this.f87664e;
        }

        public int h() {
            return this.f87666g;
        }

        public CharSequence i() {
            return this.f87662c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f87667h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f87664e;
        }

        public void l() {
            TabLayout tabLayout = this.f87667h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.K(this);
        }

        public f m(CharSequence charSequence) {
            this.f87663d = charSequence;
            s();
            return this;
        }

        public f n(int i10) {
            return o(LayoutInflater.from(this.f87668i.getContext()).inflate(i10, (ViewGroup) this.f87668i, false));
        }

        public f o(View view) {
            this.f87665f = view;
            s();
            return this;
        }

        public f p(Drawable drawable) {
            this.f87661b = drawable;
            TabLayout tabLayout = this.f87667h;
            if (tabLayout.f87590A == 1 || tabLayout.f87593D == 2) {
                tabLayout.U(true);
            }
            s();
            if (C6388c.f61754a && this.f87668i.l() && this.f87668i.f87648e.isVisible()) {
                this.f87668i.invalidate();
            }
            return this;
        }

        void q(int i10) {
            this.f87664e = i10;
        }

        public f r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f87663d) && !TextUtils.isEmpty(charSequence)) {
                this.f87668i.setContentDescription(charSequence);
            }
            this.f87662c = charSequence;
            s();
            return this;
        }

        void s() {
            TabView tabView = this.f87668i;
            if (tabView != null) {
                tabView.t();
            }
        }
    }

    public static class g implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<TabLayout> f87670a;

        /* renamed from: b, reason: collision with root package name */
        private int f87671b;

        /* renamed from: c, reason: collision with root package name */
        private int f87672c;

        void d() {
            this.f87672c = 0;
            this.f87671b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = this.f87670a.get();
            if (tabLayout != null) {
                int i12 = this.f87672c;
                boolean z11 = true;
                if (i12 != 2 || this.f87671b == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f87671b == 0) {
                    z10 = false;
                }
                tabLayout.P(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            this.f87671b = this.f87672c;
            this.f87672c = i10;
            TabLayout tabLayout = this.f87670a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f87672c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            TabLayout tabLayout = this.f87670a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f87672c;
            tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f87671b == 0));
        }

        public g(TabLayout tabLayout) {
            this.f87670a = new WeakReference<>(tabLayout);
        }
    }

    public static class h implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager f87673a;

        @Override // com.google.android.material.tabs.TabLayout.c
        public void F(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void L(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void A(f fVar) throws Resources.NotFoundException {
            this.f87673a.setCurrentItem(fVar.g());
        }

        public h(ViewPager viewPager) {
            this.f87673a = viewPager;
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44528l0);
    }

    private void o(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.S(this) || this.f87615d.d()) {
            N(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iR = r(i10, 0.0f);
        if (scrollX != iR) {
            A();
            this.f87603N.setIntValues(scrollX, iR);
            this.f87603N.start();
        }
        this.f87615d.c(i10, this.f87591B);
    }

    private static ColorStateList t(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    public void K(f fVar) {
        L(fVar, true);
    }

    public void N(int i10, float f10, boolean z10) {
        O(i10, f10, z10, true);
    }

    public void O(int i10, float f10, boolean z10, boolean z11) {
        P(i10, f10, z10, z11, true);
    }

    void P(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f87615d.getChildCount()) {
            return;
        }
        if (z11) {
            this.f87615d.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.f87603N;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f87603N.cancel();
        }
        int iR = r(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iR >= scrollX) || (i10 > getSelectedTabPosition() && iR <= scrollX) || i10 == getSelectedTabPosition();
        if (ViewCompat.z(this) == 1) {
            z13 = (i10 < getSelectedTabPosition() && iR <= scrollX) || (i10 > getSelectedTabPosition() && iR >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.f87610U == 1 || z12) {
            if (i10 < 0) {
                iR = 0;
            }
            scrollTo(iR, 0);
        }
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    public void Q(ViewPager viewPager, boolean z10) {
        R(viewPager, z10, false);
    }

    void U(boolean z10) {
        for (int i10 = 0; i10 < this.f87615d.getChildCount(); i10++) {
            View childAt = this.f87615d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            T((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        n(view);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f87615d.getChildCount(); i10++) {
            View childAt = this.f87615d.getChildAt(i10);
            if (childAt instanceof TabView) {
                ((TabView) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = C13462a.r(drawable).mutate();
        this.f87626o = drawableMutate;
        com.google.android.material.drawable.d.l(drawableMutate, this.f87627p);
        int intrinsicHeight = this.f87596G;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f87626o.getIntrinsicHeight();
        }
        this.f87615d.i(intrinsicHeight);
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        M(aVar, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        Q(viewPager, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = f87588W;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87612a = -1;
        this.f87613b = new ArrayList<>();
        this.f87622k = -1;
        this.f87627p = 0;
        this.f87633v = a.e.API_PRIORITY_OTHER;
        this.f87596G = -1;
        this.selectedListeners = new ArrayList<>();
        this.f87611V = new o2.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f87615d = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f45180f8, i10, i11, l.f44868E8);
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(getBackground());
        if (colorStateListF != null) {
            C16760h c16760h = new C16760h();
            c16760h.b0(colorStateListF);
            c16760h.Q(context2);
            c16760h.a0(ViewCompat.u(this));
            ViewCompat.q0(this, c16760h);
        }
        setSelectedTabIndicator(C16026c.d(context2, typedArrayI, l.f45252l8));
        setSelectedTabIndicatorColor(typedArrayI.getColor(l.f45288o8, 0));
        slidingTabIndicator.i(typedArrayI.getDimensionPixelSize(l.f45324r8, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(l.f45312q8, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(l.f45276n8, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(l.f45300p8, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f45384w8, 0);
        this.f87619h = dimensionPixelSize;
        this.f87618g = dimensionPixelSize;
        this.f87617f = dimensionPixelSize;
        this.f87616e = dimensionPixelSize;
        this.f87616e = typedArrayI.getDimensionPixelSize(l.f45420z8, dimensionPixelSize);
        this.f87617f = typedArrayI.getDimensionPixelSize(l.f44820A8, this.f87617f);
        this.f87618g = typedArrayI.getDimensionPixelSize(l.f45408y8, this.f87618g);
        this.f87619h = typedArrayI.getDimensionPixelSize(l.f45396x8, this.f87619h);
        if (s.g(context2)) {
            this.f87620i = C5597b.f44534o0;
        } else {
            this.f87620i = C5597b.f44530m0;
        }
        int resourceId = typedArrayI.getResourceId(l.f44868E8, k.f44790f);
        this.f87621j = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C14584j.f136734J2);
        try {
            this.f87629r = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14584j.f136738K2, 0);
            this.f87623l = C16026c.a(context2, typedArrayObtainStyledAttributes, C14584j.f136750N2);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayI.hasValue(l.f44844C8)) {
                this.f87622k = typedArrayI.getResourceId(l.f44844C8, resourceId);
            }
            int i12 = this.f87622k;
            if (i12 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i12, C14584j.f136734J2);
                try {
                    this.f87630s = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14584j.f136738K2, (int) this.f87629r);
                    ColorStateList colorStateListA = C16026c.a(context2, typedArrayObtainStyledAttributes, C14584j.f136750N2);
                    if (colorStateListA != null) {
                        this.f87623l = t(this.f87623l.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayI.hasValue(l.f44880F8)) {
                this.f87623l = C16026c.a(context2, typedArrayI, l.f44880F8);
            }
            if (typedArrayI.hasValue(l.f44856D8)) {
                this.f87623l = t(this.f87623l.getDefaultColor(), typedArrayI.getColor(l.f44856D8, 0));
            }
            this.f87624m = C16026c.a(context2, typedArrayI, l.f45228j8);
            this.f87628q = x.l(typedArrayI.getInt(l.f45240k8, -1), null);
            this.f87625n = C16026c.a(context2, typedArrayI, l.f44832B8);
            this.f87591B = typedArrayI.getInt(l.f45264m8, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            this.f87600K = i.g(context2, C5597b.f44497S, C6230a.f60116b);
            this.f87634w = typedArrayI.getDimensionPixelSize(l.f45360u8, -1);
            this.f87635x = typedArrayI.getDimensionPixelSize(l.f45348t8, -1);
            this.f87632u = typedArrayI.getResourceId(l.f45192g8, 0);
            this.f87637z = typedArrayI.getDimensionPixelSize(l.f45204h8, 0);
            this.f87593D = typedArrayI.getInt(l.f45372v8, 1);
            this.f87590A = typedArrayI.getInt(l.f45216i8, 0);
            this.f87594E = typedArrayI.getBoolean(l.f45336s8, false);
            this.f87598I = typedArrayI.getBoolean(l.f44892G8, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f87631t = resources.getDimensionPixelSize(ae.d.f44609j);
            this.f87636y = resources.getDimensionPixelSize(ae.d.f44607i);
            q();
        } finally {
        }
    }

    private void A() {
        if (this.f87603N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f87603N = valueAnimator;
            valueAnimator.setInterpolator(this.f87600K);
            this.f87603N.setDuration(this.f87591B);
            this.f87603N.addUpdateListener(new a());
        }
    }

    private void J(int i10) {
        TabView tabView = (TabView) this.f87615d.getChildAt(i10);
        this.f87615d.removeViewAt(i10);
        if (tabView != null) {
            tabView.o();
            this.f87611V.a(tabView);
        }
        requestLayout();
    }

    private void R(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f87604O;
        if (viewPager2 != null) {
            g gVar = this.f87607R;
            if (gVar != null) {
                viewPager2.J(gVar);
            }
            b bVar = this.f87608S;
            if (bVar != null) {
                this.f87604O.I(bVar);
            }
        }
        c cVar = this.f87602M;
        if (cVar != null) {
            I(cVar);
            this.f87602M = null;
        }
        if (viewPager != null) {
            this.f87604O = viewPager;
            if (this.f87607R == null) {
                this.f87607R = new g(this);
            }
            this.f87607R.d();
            viewPager.c(this.f87607R);
            h hVar = new h(viewPager);
            this.f87602M = hVar;
            g(hVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                M(adapter, z10);
            }
            if (this.f87608S == null) {
                this.f87608S = new b();
            }
            this.f87608S.b(z10);
            viewPager.b(this.f87608S);
            N(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f87604O = null;
            M(null, false);
        }
        this.f87609T = z11;
    }

    private void S() {
        int size = this.f87613b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f87613b.get(i10).s();
        }
    }

    private void T(LinearLayout.LayoutParams layoutParams) {
        if (this.f87593D == 1 && this.f87590A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f87613b.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f87613b.get(i10);
            if (fVar != null && fVar.f() != null && !TextUtils.isEmpty(fVar.i())) {
                return !this.f87594E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f87634w;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f87593D;
        if (i11 == 0 || i11 == 2) {
            return this.f87636y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f87615d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void m(f fVar) {
        TabView tabView = fVar.f87668i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f87615d.addView(tabView, fVar.g(), u());
    }

    private void n(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        l((TabItem) view);
    }

    private void p(int i10) {
        if (i10 == 0) {
            FS.log_w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f87615d.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f87615d.setGravity(8388611);
    }

    private void q() {
        int i10 = this.f87593D;
        ViewCompat.B0(this.f87615d, (i10 == 0 || i10 == 2) ? Math.max(0, this.f87637z - this.f87616e) : 0, 0, 0, 0);
        int i11 = this.f87593D;
        if (i11 == 0) {
            p(this.f87590A);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f87590A == 2) {
                FS.log_w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f87615d.setGravity(1);
        }
        U(true);
    }

    private int r(int i10, float f10) {
        View childAt;
        int i11 = this.f87593D;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f87615d.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f87615d.getChildCount() ? this.f87615d.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return ViewCompat.z(this) == 0 ? left + i13 : left - i13;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f87615d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f87615d.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).w();
                    }
                }
                i11++;
            }
        }
    }

    private LinearLayout.LayoutParams u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        T(layoutParams);
        return layoutParams;
    }

    private TabView w(f fVar) {
        o2.f<TabView> fVar2 = this.f87611V;
        TabView tabViewB = fVar2 != null ? fVar2.b() : null;
        if (tabViewB == null) {
            tabViewB = new TabView(getContext());
        }
        tabViewB.setTab(fVar);
        tabViewB.setFocusable(true);
        tabViewB.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f87663d)) {
            tabViewB.setContentDescription(fVar.f87662c);
            return tabViewB;
        }
        tabViewB.setContentDescription(fVar.f87663d);
        return tabViewB;
    }

    private void x(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).L(fVar);
        }
    }

    private void y(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).A(fVar);
        }
    }

    private void z(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).F(fVar);
        }
    }

    public f B(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f87613b.get(i10);
    }

    public boolean D() {
        return this.f87595F;
    }

    protected boolean G(f fVar) {
        return f87589a0.a(fVar);
    }

    public void H() {
        for (int childCount = this.f87615d.getChildCount() - 1; childCount >= 0; childCount--) {
            J(childCount);
        }
        Iterator<f> it = this.f87613b.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.k();
            G(next);
        }
        this.f87614c = null;
    }

    @Deprecated
    public void I(c cVar) {
        this.selectedListeners.remove(cVar);
    }

    public void L(f fVar, boolean z10) {
        f fVar2 = this.f87614c;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                x(fVar);
                o(fVar.g());
                return;
            }
            return;
        }
        int iG = fVar != null ? fVar.g() : -1;
        if (z10) {
            if ((fVar2 == null || fVar2.g() == -1) && iG != -1) {
                N(iG, 0.0f, true);
            } else {
                o(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f87614c = fVar;
        if (fVar2 != null && fVar2.f87667h != null) {
            z(fVar2);
        }
        if (fVar != null) {
            y(fVar);
        }
    }

    void M(androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f87605P;
        if (aVar2 != null && (dataSetObserver = this.f87606Q) != null) {
            aVar2.s(dataSetObserver);
        }
        this.f87605P = aVar;
        if (z10 && aVar != null) {
            if (this.f87606Q == null) {
                this.f87606Q = new e();
            }
            aVar.k(this.f87606Q);
        }
        F();
    }

    void V(int i10) {
        this.f87610U = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        n(view);
    }

    @Deprecated
    public void g(c cVar) {
        if (this.selectedListeners.contains(cVar)) {
            return;
        }
        this.selectedListeners.add(cVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.f87614c;
        if (fVar != null) {
            return fVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f87613b.size();
    }

    public int getTabGravity() {
        return this.f87590A;
    }

    public ColorStateList getTabIconTint() {
        return this.f87624m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f87597H;
    }

    public int getTabIndicatorGravity() {
        return this.f87592C;
    }

    int getTabMaxWidth() {
        return this.f87633v;
    }

    public int getTabMode() {
        return this.f87593D;
    }

    public ColorStateList getTabRippleColor() {
        return this.f87625n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f87626o;
    }

    public ColorStateList getTabTextColors() {
        return this.f87623l;
    }

    public void i(f fVar) {
        k(fVar, this.f87613b.isEmpty());
    }

    public void j(f fVar, int i10, boolean z10) {
        if (fVar.f87667h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        s(fVar, i10);
        m(fVar);
        if (z10) {
            fVar.l();
        }
    }

    public void k(f fVar, boolean z10) {
        j(fVar, this.f87613b.size(), z10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f87594E != z10) {
            this.f87594E = z10;
            for (int i10 = 0; i10 < this.f87615d.getChildCount(); i10++) {
                View childAt = this.f87615d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).v();
                }
            }
            q();
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f87601L;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.f87601L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f87627p = i10;
        com.google.android.material.drawable.d.l(this.f87626o, i10);
        U(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f87592C != i10) {
            this.f87592C = i10;
            ViewCompat.d0(this.f87615d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f87596G = i10;
        this.f87615d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f87590A != i10) {
            this.f87590A = i10;
            q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f87624m != colorStateList) {
            this.f87624m = colorStateList;
            S();
        }
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f87597H = i10;
        if (i10 == 0) {
            this.f87599J = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.f87599J = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.f87599J = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f87595F = z10;
        this.f87615d.g();
        ViewCompat.d0(this.f87615d);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f87593D) {
            this.f87593D = i10;
            q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f87625n != colorStateList) {
            this.f87625n = colorStateList;
            for (int i10 = 0; i10 < this.f87615d.getChildCount(); i10++) {
                View childAt = this.f87615d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f87623l != colorStateList) {
            this.f87623l = colorStateList;
            S();
        }
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f87598I != z10) {
            this.f87598I = z10;
            for (int i10 = 0; i10 < this.f87615d.getChildCount(); i10++) {
                View childAt = this.f87615d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    protected f v() {
        f fVarB = f87589a0.b();
        return fVarB == null ? new f() : fVarB;
    }

    private boolean C() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    private void l(TabItem tabItem) {
        f fVarE = E();
        CharSequence charSequence = tabItem.f87585a;
        if (charSequence != null) {
            fVarE.r(charSequence);
        }
        Drawable drawable = tabItem.f87586b;
        if (drawable != null) {
            fVarE.p(drawable);
        }
        int i10 = tabItem.f87587c;
        if (i10 != 0) {
            fVarE.n(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            fVarE.m(tabItem.getContentDescription());
        }
        i(fVarE);
    }

    private void s(f fVar, int i10) {
        fVar.q(i10);
        this.f87613b.add(i10, fVar);
        int size = this.f87613b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (this.f87613b.get(i12).g() == this.f87612a) {
                i11 = i12;
            }
            this.f87613b.get(i12).q(i12);
        }
        this.f87612a = i11;
    }

    public f E() {
        f fVarV = v();
        fVarV.f87667h = this;
        fVarV.f87668i = w(fVarV);
        if (fVarV.f87669j != -1) {
            fVarV.f87668i.setId(fVarV.f87669j);
        }
        return fVarV;
    }

    void F() {
        int currentItem;
        H();
        androidx.viewpager.widget.a aVar = this.f87605P;
        if (aVar != null) {
            int iD = aVar.d();
            for (int i10 = 0; i10 < iD; i10++) {
                k(E().r(this.f87605P.f(i10)), false);
            }
            ViewPager viewPager = this.f87604O;
            if (viewPager != null && iD > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                K(B(currentItem));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void h(d dVar) {
        g(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16761i.e(this);
        if (this.f87604O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                R((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f87609T) {
            setupWithViewPager(null);
            this.f87609T = false;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y.g1(accessibilityNodeInfo).r0(y.e.b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (C() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.x.d(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f87635x
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.x.d(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f87633v = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f87593D
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !C()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C16761i.d(this, f10);
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.f87603N.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(C14791a.a(getContext(), i10));
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(C14791a.a(getContext(), i10));
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(C14791a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
