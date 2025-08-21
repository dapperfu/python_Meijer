package com.google.android.material.tabs;

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
import ce.C6503b;
import ce.j;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.fullstory.instrumentation.FSOuterThis;
import com.google.android.gms.common.api.a;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d2.C13595a;
import de.C13661a;
import ee.C13790a;
import ee.C13792c;
import i.C14587j;
import j.C14879a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p2.K;
import pe.i;
import q2.y;
import qe.C16634c;
import re.C16896b;
import te.C17234h;
import te.C17235i;
import we.C17867a;

@ViewPager.e
/* loaded from: classes4.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: W, reason: collision with root package name */
    private static final int f88428W = k.f61815p;

    /* renamed from: a0, reason: collision with root package name */
    private static final o2.f<f> f88429a0 = new o2.h(16);

    /* renamed from: A, reason: collision with root package name */
    int f88430A;

    /* renamed from: B, reason: collision with root package name */
    int f88431B;

    /* renamed from: C, reason: collision with root package name */
    int f88432C;

    /* renamed from: D, reason: collision with root package name */
    int f88433D;

    /* renamed from: E, reason: collision with root package name */
    boolean f88434E;

    /* renamed from: F, reason: collision with root package name */
    boolean f88435F;

    /* renamed from: G, reason: collision with root package name */
    int f88436G;

    /* renamed from: H, reason: collision with root package name */
    int f88437H;

    /* renamed from: I, reason: collision with root package name */
    boolean f88438I;

    /* renamed from: J, reason: collision with root package name */
    private com.google.android.material.tabs.c f88439J;

    /* renamed from: K, reason: collision with root package name */
    private final TimeInterpolator f88440K;

    /* renamed from: L, reason: collision with root package name */
    private c f88441L;

    /* renamed from: M, reason: collision with root package name */
    private c f88442M;

    /* renamed from: N, reason: collision with root package name */
    private ValueAnimator f88443N;

    /* renamed from: O, reason: collision with root package name */
    ViewPager f88444O;

    /* renamed from: P, reason: collision with root package name */
    private androidx.viewpager.widget.a f88445P;

    /* renamed from: Q, reason: collision with root package name */
    private DataSetObserver f88446Q;

    /* renamed from: R, reason: collision with root package name */
    private g f88447R;

    /* renamed from: S, reason: collision with root package name */
    private b f88448S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f88449T;

    /* renamed from: U, reason: collision with root package name */
    private int f88450U;

    /* renamed from: V, reason: collision with root package name */
    private final o2.f<TabView> f88451V;

    /* renamed from: a, reason: collision with root package name */
    int f88452a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<f> f88453b;

    /* renamed from: c, reason: collision with root package name */
    private f f88454c;

    /* renamed from: d, reason: collision with root package name */
    final SlidingTabIndicator f88455d;

    /* renamed from: e, reason: collision with root package name */
    int f88456e;

    /* renamed from: f, reason: collision with root package name */
    int f88457f;

    /* renamed from: g, reason: collision with root package name */
    int f88458g;

    /* renamed from: h, reason: collision with root package name */
    int f88459h;

    /* renamed from: i, reason: collision with root package name */
    private final int f88460i;

    /* renamed from: j, reason: collision with root package name */
    private final int f88461j;

    /* renamed from: k, reason: collision with root package name */
    private int f88462k;

    /* renamed from: l, reason: collision with root package name */
    ColorStateList f88463l;

    /* renamed from: m, reason: collision with root package name */
    ColorStateList f88464m;

    /* renamed from: n, reason: collision with root package name */
    ColorStateList f88465n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f88466o;

    /* renamed from: p, reason: collision with root package name */
    private int f88467p;

    /* renamed from: q, reason: collision with root package name */
    PorterDuff.Mode f88468q;

    /* renamed from: r, reason: collision with root package name */
    float f88469r;

    /* renamed from: s, reason: collision with root package name */
    float f88470s;
    private final ArrayList<c> selectedListeners;

    /* renamed from: t, reason: collision with root package name */
    float f88471t;

    /* renamed from: u, reason: collision with root package name */
    final int f88472u;

    /* renamed from: v, reason: collision with root package name */
    int f88473v;

    /* renamed from: w, reason: collision with root package name */
    private final int f88474w;

    /* renamed from: x, reason: collision with root package name */
    private final int f88475x;

    /* renamed from: y, reason: collision with root package name */
    private final int f88476y;

    /* renamed from: z, reason: collision with root package name */
    private int f88477z;

    class SlidingTabIndicator extends LinearLayout implements FSDraw, FSDispatchDraw {

        /* renamed from: a, reason: collision with root package name */
        ValueAnimator f88478a;

        /* renamed from: b, reason: collision with root package name */
        private int f88479b;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f88481a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f88482b;

            a(View view, View view2) {
                this.f88481a = view;
                this.f88482b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SlidingTabIndicator.this.j(this.f88481a, this.f88482b, valueAnimator.getAnimatedFraction());
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
            this.f88479b = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f88452a == -1) {
                tabLayout.f88452a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f88452a);
        }

        private void f(int i10) {
            if (TabLayout.this.f88450U == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.f88439J;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f88466o);
                TabLayout.this.f88452a = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f88466o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f88466o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.f88439J;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f88466o);
            }
            ViewCompat.d0(this);
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f88452a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f88452a = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f88478a.removeAllUpdateListeners();
                this.f88478a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f88478a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f88440K);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f88478a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f88452a != i10) {
                this.f88478a.cancel();
            }
            k(true, i10, i11);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f88466o.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f88466o.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f88432C;
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
            if (TabLayout.this.f88466o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f88466o.getBounds();
                TabLayout.this.f88466o.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f88466o.draw(canvas);
            }
            fsSuperDraw_4c3317db3b0d42f9f62df552eaea66ee(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f88452a = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f88478a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f88478a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f88466o.getBounds();
            TabLayout.this.f88466o.setBounds(bounds.left, 0, bounds.right, i10);
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
            ValueAnimator valueAnimator = this.f88478a;
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
                if (tabLayout.f88430A == 1 || tabLayout.f88433D == 2) {
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
                            tabLayout2.f88430A = 0;
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
        private f f88484a;

        /* renamed from: b, reason: collision with root package name */
        private TextView f88485b;

        /* renamed from: c, reason: collision with root package name */
        private ImageView f88486c;

        /* renamed from: d, reason: collision with root package name */
        private View f88487d;

        /* renamed from: e, reason: collision with root package name */
        private C13790a f88488e;

        /* renamed from: f, reason: collision with root package name */
        private View f88489f;

        /* renamed from: g, reason: collision with root package name */
        private TextView f88490g;

        /* renamed from: h, reason: collision with root package name */
        private ImageView f88491h;

        /* renamed from: i, reason: collision with root package name */
        private Drawable f88492i;

        /* renamed from: j, reason: collision with root package name */
        private int f88493j;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f88494a;

            a(View view) {
                this.f88494a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f88494a.getVisibility() == 0) {
                    TabView.this.s(this.f88494a);
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
            this.f88493j = 2;
            u(context);
            ViewCompat.B0(this, TabLayout.this.f88456e, TabLayout.this.f88457f, TabLayout.this.f88458g, TabLayout.this.f88459h);
            setGravity(17);
            setOrientation(!TabLayout.this.f88434E ? 1 : 0);
            setClickable(true);
            ViewCompat.C0(this, K.b(getContext(), 1002));
        }

        private void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private C13790a getBadge() {
            return this.f88488e;
        }

        private C13790a getOrCreateBadge() {
            if (this.f88488e == null) {
                this.f88488e = C13790a.e(getContext());
            }
            r();
            C13790a c13790a = this.f88488e;
            if (c13790a != null) {
                return c13790a;
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
            Drawable drawable = this.f88492i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f88492i.draw(canvas);
            }
        }

        private FrameLayout k(View view) {
            if ((view == this.f88486c || view == this.f88485b) && C13792c.f130136a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l() {
            return this.f88488e != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m() {
            FrameLayout frameLayoutI;
            if (C13792c.f130136a) {
                frameLayoutI = i();
                addView(frameLayoutI, 0);
            } else {
                frameLayoutI = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(ce.h.f61733d, (ViewGroup) frameLayoutI, false);
            this.f88486c = imageView;
            frameLayoutI.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayoutI;
            if (C13792c.f130136a) {
                frameLayoutI = i();
                addView(frameLayoutI);
            } else {
                frameLayoutI = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(ce.h.f61734e, (ViewGroup) frameLayoutI, false);
            this.f88485b = textView;
            frameLayoutI.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void u(Context context) {
            int i10 = TabLayout.this.f88472u;
            if (i10 != 0) {
                Drawable drawableB = C14879a.b(context, i10);
                this.f88492i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f88492i.setState(getDrawableState());
                }
            } else {
                this.f88492i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f88465n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = C16896b.a(TabLayout.this.f88465n);
                boolean z10 = TabLayout.this.f88438I;
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
                com.google.android.material.tabs.TabLayout$f r0 = r7.f88484a
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.f()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$f r0 = r7.f88484a
                android.graphics.drawable.Drawable r0 = r0.f()
                android.graphics.drawable.Drawable r0 = d2.C13595a.r(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L2d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f88464m
                d2.C13595a.o(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f88468q
                if (r2 == 0) goto L2d
                d2.C13595a.p(r0, r2)
            L2d:
                com.google.android.material.tabs.TabLayout$f r2 = r7.f88484a
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
                com.google.android.material.tabs.TabLayout$f r5 = r7.f88484a
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
                boolean r3 = r3.f88434E
                if (r3 == 0) goto Lad
                int r3 = p2.C16381t.a(r8)
                if (r10 == r3) goto Lbc
                p2.C16381t.c(r8, r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lbc
            Lad:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lbc
                r8.bottomMargin = r10
                p2.C16381t.c(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lbc:
                com.google.android.material.tabs.TabLayout$f r8 = r7.f88484a
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
            View[] viewArr = {this.f88485b, this.f88486c, this.f88489f};
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
            View[] viewArr = {this.f88485b, this.f88486c, this.f88489f};
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
            return this.f88484a;
        }

        void setTab(f fVar) {
            if (fVar != this.f88484a) {
                this.f88484a = fVar;
                t();
            }
        }

        final void v() {
            setOrientation(!TabLayout.this.f88434E ? 1 : 0);
            TextView textView = this.f88490g;
            if (textView == null && this.f88491h == null) {
                x(this.f88485b, this.f88486c, true);
            } else {
                x(textView, this.f88491h, false);
            }
        }

        final void w() {
            ViewParent parent;
            f fVar = this.f88484a;
            View viewE = fVar != null ? fVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f88489f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f88489f);
                    }
                    addView(viewE);
                }
                this.f88489f = viewE;
                TextView textView = this.f88485b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f88486c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f88486c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f88490g = textView2;
                if (textView2 != null) {
                    this.f88493j = androidx.core.widget.k.d(textView2);
                }
                this.f88491h = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f88489f;
                if (view2 != null) {
                    removeView(view2);
                    this.f88489f = null;
                }
                this.f88490g = null;
                this.f88491h = null;
            }
            if (this.f88489f == null) {
                if (this.f88486c == null) {
                    m();
                }
                if (this.f88485b == null) {
                    n();
                    this.f88493j = androidx.core.widget.k.d(this.f88485b);
                }
                androidx.core.widget.k.p(this.f88485b, TabLayout.this.f88460i);
                if (!isSelected() || TabLayout.this.f88462k == -1) {
                    androidx.core.widget.k.p(this.f88485b, TabLayout.this.f88461j);
                } else {
                    androidx.core.widget.k.p(this.f88485b, TabLayout.this.f88462k);
                }
                ColorStateList colorStateList = TabLayout.this.f88463l;
                if (colorStateList != null) {
                    this.f88485b.setTextColor(colorStateList);
                }
                x(this.f88485b, this.f88486c, true);
                r();
                f(this.f88486c);
                f(this.f88485b);
            } else {
                TextView textView3 = this.f88490g;
                if (textView3 != null || this.f88491h != null) {
                    x(textView3, this.f88491h, false);
                }
            }
            if (fVar == null || TextUtils.isEmpty(fVar.f88503d)) {
                return;
            }
            setContentDescription(fVar.f88503d);
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
                C13792c.b(this.f88488e, view, k(view));
                this.f88487d = view;
            }
        }

        private void q() {
            if (l()) {
                h(true);
                View view = this.f88487d;
                if (view != null) {
                    C13792c.c(this.f88488e, view);
                    this.f88487d = null;
                }
            }
        }

        private void r() {
            f fVar;
            f fVar2;
            if (!l()) {
                return;
            }
            if (this.f88489f != null) {
                q();
                return;
            }
            if (this.f88486c != null && (fVar2 = this.f88484a) != null && fVar2.f() != null) {
                View view = this.f88487d;
                ImageView imageView = this.f88486c;
                if (view != imageView) {
                    q();
                    p(this.f88486c);
                    return;
                } else {
                    s(imageView);
                    return;
                }
            }
            if (this.f88485b != null && (fVar = this.f88484a) != null && fVar.h() == 1) {
                View view2 = this.f88487d;
                TextView textView = this.f88485b;
                if (view2 != textView) {
                    q();
                    p(this.f88485b);
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
            if (l() && view == this.f88487d) {
                C13792c.d(this.f88488e, view, k(view));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            boolean state;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f88492i;
            if (drawable != null && drawable.isStateful()) {
                state = this.f88492i.setState(drawableState);
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
            C13790a c13790a = this.f88488e;
            if (c13790a != null && c13790a.isVisible()) {
                yVarG1.t0(this.f88488e.i());
            }
            yVarG1.s0(y.f.a(0, 1, this.f88484a.g(), 1, false, isSelected()));
            if (isSelected()) {
                yVarG1.q0(false);
                yVarG1.g0(y.a.f157841i);
            }
            yVarG1.P0(getResources().getString(j.f61769h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f88473v, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f88485b != null) {
                float f10 = TabLayout.this.f88469r;
                int i12 = this.f88493j;
                ImageView imageView = this.f88486c;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    TextView textView = this.f88485b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f88471t;
                    }
                }
                float textSize = this.f88485b.getTextSize();
                int lineCount = this.f88485b.getLineCount();
                int iD = androidx.core.widget.k.d(this.f88485b);
                if (f10 != textSize || (iD >= 0 && i12 != iD)) {
                    if (TabLayout.this.f88433D == 1 && f10 > textSize && lineCount == 1 && ((layout = this.f88485b.getLayout()) == null || g(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        return;
                    }
                    this.f88485b.setTextSize(0, f10);
                    this.f88485b.setMaxLines(i12);
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f88484a != null) {
                if (!zPerformClick) {
                    playSoundEffect(0);
                }
                this.f88484a.l();
                return true;
            }
            return zPerformClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f88485b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f88486c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f88489f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        final void t() {
            boolean z10;
            w();
            f fVar = this.f88484a;
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
        private boolean f88497a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f88444O == viewPager) {
                tabLayout.M(aVar2, this.f88497a);
            }
        }

        void b(boolean z10) {
            this.f88497a = z10;
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void C(T t10);

        void H(T t10);

        void N(T t10);
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
        private Object f88500a;

        /* renamed from: b, reason: collision with root package name */
        private Drawable f88501b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f88502c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f88503d;

        /* renamed from: f, reason: collision with root package name */
        private View f88505f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f88507h;

        /* renamed from: i, reason: collision with root package name */
        public TabView f88508i;

        /* renamed from: e, reason: collision with root package name */
        private int f88504e = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f88506g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f88509j = -1;

        void k() {
            this.f88507h = null;
            this.f88508i = null;
            this.f88500a = null;
            this.f88501b = null;
            this.f88509j = -1;
            this.f88502c = null;
            this.f88503d = null;
            this.f88504e = -1;
            this.f88505f = null;
        }

        public View e() {
            return this.f88505f;
        }

        public Drawable f() {
            return this.f88501b;
        }

        public int g() {
            return this.f88504e;
        }

        public int h() {
            return this.f88506g;
        }

        public CharSequence i() {
            return this.f88502c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f88507h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f88504e;
        }

        public void l() {
            TabLayout tabLayout = this.f88507h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.K(this);
        }

        public f m(CharSequence charSequence) {
            this.f88503d = charSequence;
            s();
            return this;
        }

        public f n(int i10) {
            return o(LayoutInflater.from(this.f88508i.getContext()).inflate(i10, (ViewGroup) this.f88508i, false));
        }

        public f o(View view) {
            this.f88505f = view;
            s();
            return this;
        }

        public f p(Drawable drawable) {
            this.f88501b = drawable;
            TabLayout tabLayout = this.f88507h;
            if (tabLayout.f88430A == 1 || tabLayout.f88433D == 2) {
                tabLayout.U(true);
            }
            s();
            if (C13792c.f130136a && this.f88508i.l() && this.f88508i.f88488e.isVisible()) {
                this.f88508i.invalidate();
            }
            return this;
        }

        void q(int i10) {
            this.f88504e = i10;
        }

        public f r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f88503d) && !TextUtils.isEmpty(charSequence)) {
                this.f88508i.setContentDescription(charSequence);
            }
            this.f88502c = charSequence;
            s();
            return this;
        }

        void s() {
            TabView tabView = this.f88508i;
            if (tabView != null) {
                tabView.t();
            }
        }
    }

    public static class g implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<TabLayout> f88510a;

        /* renamed from: b, reason: collision with root package name */
        private int f88511b;

        /* renamed from: c, reason: collision with root package name */
        private int f88512c;

        void d() {
            this.f88512c = 0;
            this.f88511b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = this.f88510a.get();
            if (tabLayout != null) {
                int i12 = this.f88512c;
                boolean z11 = true;
                if (i12 != 2 || this.f88511b == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f88511b == 0) {
                    z10 = false;
                }
                tabLayout.P(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            this.f88511b = this.f88512c;
            this.f88512c = i10;
            TabLayout tabLayout = this.f88510a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f88512c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            TabLayout tabLayout = this.f88510a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f88512c;
            tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f88511b == 0));
        }

        public g(TabLayout tabLayout) {
            this.f88510a = new WeakReference<>(tabLayout);
        }
    }

    public static class h implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager f88513a;

        @Override // com.google.android.material.tabs.TabLayout.c
        public void H(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void N(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void C(f fVar) throws Resources.NotFoundException {
            this.f88513a.setCurrentItem(fVar.g());
        }

        public h(ViewPager viewPager) {
            this.f88513a = viewPager;
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61543l0);
    }

    private void o(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.S(this) || this.f88455d.d()) {
            N(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iR = r(i10, 0.0f);
        if (scrollX != iR) {
            A();
            this.f88443N.setIntValues(scrollX, iR);
            this.f88443N.start();
        }
        this.f88455d.c(i10, this.f88431B);
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
        if (iRound < 0 || iRound >= this.f88455d.getChildCount()) {
            return;
        }
        if (z11) {
            this.f88455d.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.f88443N;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f88443N.cancel();
        }
        int iR = r(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iR >= scrollX) || (i10 > getSelectedTabPosition() && iR <= scrollX) || i10 == getSelectedTabPosition();
        if (ViewCompat.z(this) == 1) {
            z13 = (i10 < getSelectedTabPosition() && iR <= scrollX) || (i10 > getSelectedTabPosition() && iR >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.f88450U == 1 || z12) {
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
        for (int i10 = 0; i10 < this.f88455d.getChildCount(); i10++) {
            View childAt = this.f88455d.getChildAt(i10);
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
        for (int i10 = 0; i10 < this.f88455d.getChildCount(); i10++) {
            View childAt = this.f88455d.getChildAt(i10);
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
        Drawable drawableMutate = C13595a.r(drawable).mutate();
        this.f88466o = drawableMutate;
        com.google.android.material.drawable.d.l(drawableMutate, this.f88467p);
        int intrinsicHeight = this.f88436G;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f88466o.getIntrinsicHeight();
        }
        this.f88455d.i(intrinsicHeight);
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
        int i11 = f88428W;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f88452a = -1;
        this.f88453b = new ArrayList<>();
        this.f88462k = -1;
        this.f88467p = 0;
        this.f88473v = a.e.API_PRIORITY_OTHER;
        this.f88436G = -1;
        this.selectedListeners = new ArrayList<>();
        this.f88451V = new o2.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f88455d = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f62195f8, i10, i11, l.f61883E8);
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(getBackground());
        if (colorStateListF != null) {
            C17234h c17234h = new C17234h();
            c17234h.b0(colorStateListF);
            c17234h.Q(context2);
            c17234h.a0(ViewCompat.u(this));
            ViewCompat.q0(this, c17234h);
        }
        setSelectedTabIndicator(C16634c.d(context2, typedArrayI, l.f62267l8));
        setSelectedTabIndicatorColor(typedArrayI.getColor(l.f62303o8, 0));
        slidingTabIndicator.i(typedArrayI.getDimensionPixelSize(l.f62339r8, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(l.f62327q8, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(l.f62291n8, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(l.f62315p8, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f62399w8, 0);
        this.f88459h = dimensionPixelSize;
        this.f88458g = dimensionPixelSize;
        this.f88457f = dimensionPixelSize;
        this.f88456e = dimensionPixelSize;
        this.f88456e = typedArrayI.getDimensionPixelSize(l.f62435z8, dimensionPixelSize);
        this.f88457f = typedArrayI.getDimensionPixelSize(l.f61835A8, this.f88457f);
        this.f88458g = typedArrayI.getDimensionPixelSize(l.f62423y8, this.f88458g);
        this.f88459h = typedArrayI.getDimensionPixelSize(l.f62411x8, this.f88459h);
        if (s.g(context2)) {
            this.f88460i = C6503b.f61549o0;
        } else {
            this.f88460i = C6503b.f61545m0;
        }
        int resourceId = typedArrayI.getResourceId(l.f61883E8, k.f61805f);
        this.f88461j = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C14587j.f136491J2);
        try {
            this.f88469r = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14587j.f136495K2, 0);
            this.f88463l = C16634c.a(context2, typedArrayObtainStyledAttributes, C14587j.f136507N2);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayI.hasValue(l.f61859C8)) {
                this.f88462k = typedArrayI.getResourceId(l.f61859C8, resourceId);
            }
            int i12 = this.f88462k;
            if (i12 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i12, C14587j.f136491J2);
                try {
                    this.f88470s = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14587j.f136495K2, (int) this.f88469r);
                    ColorStateList colorStateListA = C16634c.a(context2, typedArrayObtainStyledAttributes, C14587j.f136507N2);
                    if (colorStateListA != null) {
                        this.f88463l = t(this.f88463l.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayI.hasValue(l.f61895F8)) {
                this.f88463l = C16634c.a(context2, typedArrayI, l.f61895F8);
            }
            if (typedArrayI.hasValue(l.f61871D8)) {
                this.f88463l = t(this.f88463l.getDefaultColor(), typedArrayI.getColor(l.f61871D8, 0));
            }
            this.f88464m = C16634c.a(context2, typedArrayI, l.f62243j8);
            this.f88468q = x.l(typedArrayI.getInt(l.f62255k8, -1), null);
            this.f88465n = C16634c.a(context2, typedArrayI, l.f61847B8);
            this.f88431B = typedArrayI.getInt(l.f62279m8, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
            this.f88440K = i.g(context2, C6503b.f61512S, C13661a.f128351b);
            this.f88474w = typedArrayI.getDimensionPixelSize(l.f62375u8, -1);
            this.f88475x = typedArrayI.getDimensionPixelSize(l.f62363t8, -1);
            this.f88472u = typedArrayI.getResourceId(l.f62207g8, 0);
            this.f88477z = typedArrayI.getDimensionPixelSize(l.f62219h8, 0);
            this.f88433D = typedArrayI.getInt(l.f62387v8, 1);
            this.f88430A = typedArrayI.getInt(l.f62231i8, 0);
            this.f88434E = typedArrayI.getBoolean(l.f62351s8, false);
            this.f88438I = typedArrayI.getBoolean(l.f61907G8, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f88471t = resources.getDimensionPixelSize(ce.d.f61624j);
            this.f88476y = resources.getDimensionPixelSize(ce.d.f61622i);
            q();
        } finally {
        }
    }

    private void A() {
        if (this.f88443N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f88443N = valueAnimator;
            valueAnimator.setInterpolator(this.f88440K);
            this.f88443N.setDuration(this.f88431B);
            this.f88443N.addUpdateListener(new a());
        }
    }

    private void J(int i10) {
        TabView tabView = (TabView) this.f88455d.getChildAt(i10);
        this.f88455d.removeViewAt(i10);
        if (tabView != null) {
            tabView.o();
            this.f88451V.a(tabView);
        }
        requestLayout();
    }

    private void R(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f88444O;
        if (viewPager2 != null) {
            g gVar = this.f88447R;
            if (gVar != null) {
                viewPager2.J(gVar);
            }
            b bVar = this.f88448S;
            if (bVar != null) {
                this.f88444O.I(bVar);
            }
        }
        c cVar = this.f88442M;
        if (cVar != null) {
            I(cVar);
            this.f88442M = null;
        }
        if (viewPager != null) {
            this.f88444O = viewPager;
            if (this.f88447R == null) {
                this.f88447R = new g(this);
            }
            this.f88447R.d();
            viewPager.c(this.f88447R);
            h hVar = new h(viewPager);
            this.f88442M = hVar;
            g(hVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                M(adapter, z10);
            }
            if (this.f88448S == null) {
                this.f88448S = new b();
            }
            this.f88448S.b(z10);
            viewPager.b(this.f88448S);
            N(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f88444O = null;
            M(null, false);
        }
        this.f88449T = z11;
    }

    private void S() {
        int size = this.f88453b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f88453b.get(i10).s();
        }
    }

    private void T(LinearLayout.LayoutParams layoutParams) {
        if (this.f88433D == 1 && this.f88430A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f88453b.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f88453b.get(i10);
            if (fVar != null && fVar.f() != null && !TextUtils.isEmpty(fVar.i())) {
                return !this.f88434E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f88474w;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f88433D;
        if (i11 == 0 || i11 == 2) {
            return this.f88476y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f88455d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void m(f fVar) {
        TabView tabView = fVar.f88508i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f88455d.addView(tabView, fVar.g(), u());
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
            this.f88455d.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f88455d.setGravity(8388611);
    }

    private void q() {
        int i10 = this.f88433D;
        ViewCompat.B0(this.f88455d, (i10 == 0 || i10 == 2) ? Math.max(0, this.f88477z - this.f88456e) : 0, 0, 0, 0);
        int i11 = this.f88433D;
        if (i11 == 0) {
            p(this.f88430A);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f88430A == 2) {
                FS.log_w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f88455d.setGravity(1);
        }
        U(true);
    }

    private int r(int i10, float f10) {
        View childAt;
        int i11 = this.f88433D;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f88455d.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f88455d.getChildCount() ? this.f88455d.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return ViewCompat.z(this) == 0 ? left + i13 : left - i13;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f88455d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f88455d.getChildAt(i11);
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
        o2.f<TabView> fVar2 = this.f88451V;
        TabView tabViewB = fVar2 != null ? fVar2.b() : null;
        if (tabViewB == null) {
            tabViewB = new TabView(getContext());
        }
        tabViewB.setTab(fVar);
        tabViewB.setFocusable(true);
        tabViewB.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f88503d)) {
            tabViewB.setContentDescription(fVar.f88502c);
            return tabViewB;
        }
        tabViewB.setContentDescription(fVar.f88503d);
        return tabViewB;
    }

    private void x(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).N(fVar);
        }
    }

    private void y(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).C(fVar);
        }
    }

    private void z(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).H(fVar);
        }
    }

    public f B(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f88453b.get(i10);
    }

    public boolean D() {
        return this.f88435F;
    }

    protected boolean G(f fVar) {
        return f88429a0.a(fVar);
    }

    public void H() {
        for (int childCount = this.f88455d.getChildCount() - 1; childCount >= 0; childCount--) {
            J(childCount);
        }
        Iterator<f> it = this.f88453b.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.k();
            G(next);
        }
        this.f88454c = null;
    }

    @Deprecated
    public void I(c cVar) {
        this.selectedListeners.remove(cVar);
    }

    public void L(f fVar, boolean z10) {
        f fVar2 = this.f88454c;
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
        this.f88454c = fVar;
        if (fVar2 != null && fVar2.f88507h != null) {
            z(fVar2);
        }
        if (fVar != null) {
            y(fVar);
        }
    }

    void M(androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f88445P;
        if (aVar2 != null && (dataSetObserver = this.f88446Q) != null) {
            aVar2.s(dataSetObserver);
        }
        this.f88445P = aVar;
        if (z10 && aVar != null) {
            if (this.f88446Q == null) {
                this.f88446Q = new e();
            }
            aVar.k(this.f88446Q);
        }
        F();
    }

    void V(int i10) {
        this.f88450U = i10;
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
        f fVar = this.f88454c;
        if (fVar != null) {
            return fVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f88453b.size();
    }

    public int getTabGravity() {
        return this.f88430A;
    }

    public ColorStateList getTabIconTint() {
        return this.f88464m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f88437H;
    }

    public int getTabIndicatorGravity() {
        return this.f88432C;
    }

    int getTabMaxWidth() {
        return this.f88473v;
    }

    public int getTabMode() {
        return this.f88433D;
    }

    public ColorStateList getTabRippleColor() {
        return this.f88465n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f88466o;
    }

    public ColorStateList getTabTextColors() {
        return this.f88463l;
    }

    public void i(f fVar) {
        k(fVar, this.f88453b.isEmpty());
    }

    public void j(f fVar, int i10, boolean z10) {
        if (fVar.f88507h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        s(fVar, i10);
        m(fVar);
        if (z10) {
            fVar.l();
        }
    }

    public void k(f fVar, boolean z10) {
        j(fVar, this.f88453b.size(), z10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f88434E != z10) {
            this.f88434E = z10;
            for (int i10 = 0; i10 < this.f88455d.getChildCount(); i10++) {
                View childAt = this.f88455d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).v();
                }
            }
            q();
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f88441L;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.f88441L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f88467p = i10;
        com.google.android.material.drawable.d.l(this.f88466o, i10);
        U(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f88432C != i10) {
            this.f88432C = i10;
            ViewCompat.d0(this.f88455d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f88436G = i10;
        this.f88455d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f88430A != i10) {
            this.f88430A = i10;
            q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f88464m != colorStateList) {
            this.f88464m = colorStateList;
            S();
        }
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f88437H = i10;
        if (i10 == 0) {
            this.f88439J = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.f88439J = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.f88439J = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f88435F = z10;
        this.f88455d.g();
        ViewCompat.d0(this.f88455d);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f88433D) {
            this.f88433D = i10;
            q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f88465n != colorStateList) {
            this.f88465n = colorStateList;
            for (int i10 = 0; i10 < this.f88455d.getChildCount(); i10++) {
                View childAt = this.f88455d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f88463l != colorStateList) {
            this.f88463l = colorStateList;
            S();
        }
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f88438I != z10) {
            this.f88438I = z10;
            for (int i10 = 0; i10 < this.f88455d.getChildCount(); i10++) {
                View childAt = this.f88455d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).u(getContext());
                }
            }
        }
    }

    protected f v() {
        f fVarB = f88429a0.b();
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
        CharSequence charSequence = tabItem.f88425a;
        if (charSequence != null) {
            fVarE.r(charSequence);
        }
        Drawable drawable = tabItem.f88426b;
        if (drawable != null) {
            fVarE.p(drawable);
        }
        int i10 = tabItem.f88427c;
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
        this.f88453b.add(i10, fVar);
        int size = this.f88453b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (this.f88453b.get(i12).g() == this.f88452a) {
                i11 = i12;
            }
            this.f88453b.get(i12).q(i12);
        }
        this.f88452a = i11;
    }

    public f E() {
        f fVarV = v();
        fVarV.f88507h = this;
        fVarV.f88508i = w(fVarV);
        if (fVarV.f88509j != -1) {
            fVarV.f88508i.setId(fVarV.f88509j);
        }
        return fVarV;
    }

    void F() {
        int currentItem;
        H();
        androidx.viewpager.widget.a aVar = this.f88445P;
        if (aVar != null) {
            int iD = aVar.d();
            for (int i10 = 0; i10 < iD; i10++) {
                k(E().r(this.f88445P.f(i10)), false);
            }
            ViewPager viewPager = this.f88444O;
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
        C17235i.e(this);
        if (this.f88444O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                R((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f88449T) {
            setupWithViewPager(null);
            this.f88449T = false;
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
            int r1 = r6.f88475x
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
            r6.f88473v = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f88433D
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
        C17235i.d(this, f10);
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.f88443N.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(C14879a.a(getContext(), i10));
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(C14879a.a(getContext(), i10));
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
            setSelectedTabIndicator(C14879a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
