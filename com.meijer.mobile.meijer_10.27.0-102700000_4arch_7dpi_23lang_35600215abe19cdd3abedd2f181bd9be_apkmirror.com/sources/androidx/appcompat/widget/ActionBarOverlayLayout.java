package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.gms.common.api.a;
import i.C14575a;
import i.C14580f;
import p2.InterfaceC16198D;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC5642s, InterfaceC16198D, p2.E, FSDraw, FSDispatchDraw {

    /* renamed from: G, reason: collision with root package name */
    static final int[] f46394G = {C14575a.f136523b, R.attr.windowContentOverlay};

    /* renamed from: H, reason: collision with root package name */
    private static final androidx.core.view.j f46395H = new j.a().d(c2.d.b(0, 1, 0, 1)).a();

    /* renamed from: I, reason: collision with root package name */
    private static final Rect f46396I = new Rect();

    /* renamed from: A, reason: collision with root package name */
    ViewPropertyAnimator f46397A;

    /* renamed from: B, reason: collision with root package name */
    final AnimatorListenerAdapter f46398B;

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f46399C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f46400D;

    /* renamed from: E, reason: collision with root package name */
    private final p2.F f46401E;

    /* renamed from: F, reason: collision with root package name */
    private final NoSystemUiLayoutFlagView f46402F;

    /* renamed from: a, reason: collision with root package name */
    private int f46403a;

    /* renamed from: b, reason: collision with root package name */
    private int f46404b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f46405c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f46406d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5643t f46407e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f46408f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46409g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46410h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46411i;

    /* renamed from: j, reason: collision with root package name */
    boolean f46412j;

    /* renamed from: k, reason: collision with root package name */
    private int f46413k;

    /* renamed from: l, reason: collision with root package name */
    private int f46414l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f46415m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f46416n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f46417o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f46418p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f46419q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f46420r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f46421s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f46422t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.core.view.j f46423u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.core.view.j f46424v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.core.view.j f46425w;

    /* renamed from: x, reason: collision with root package name */
    private androidx.core.view.j f46426x;

    /* renamed from: y, reason: collision with root package name */
    private d f46427y;

    /* renamed from: z, reason: collision with root package name */
    private OverScroller f46428z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46397A = null;
            actionBarOverlayLayout.f46412j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46397A = null;
            actionBarOverlayLayout.f46412j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46397A = actionBarOverlayLayout.f46406d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f46398B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46397A = actionBarOverlayLayout.f46406d.animate().translationY(-ActionBarOverlayLayout.this.f46406d.getHeight()).setListener(ActionBarOverlayLayout.this.f46398B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_4cd02ea059c4058ece6112dde1a10fb3(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_4cd02ea059c4058ece6112dde1a10fb3(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_4cd02ea059c4058ece6112dde1a10fb3(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_4cd02ea059c4058ece6112dde1a10fb3(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void fsSuperDraw_4cd02ea059c4058ece6112dde1a10fb3(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void setIcon(int i10) {
        A();
        this.f46407e.setIcon(i10);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private static final class NoSystemUiLayoutFlagView extends View {
        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }

        NoSystemUiLayoutFlagView(Context context) {
            super(context);
            setWillNotDraw(true);
        }
    }

    private boolean C(float f10) {
        this.f46428z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
        return this.f46428z.getFinalY() > this.f46406d.getHeight();
    }

    private boolean r() {
        ViewCompat.g(this.f46402F, f46395H, this.f46418p);
        return !this.f46418p.equals(f46396I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC5643t u(View view) {
        if (view instanceof InterfaceC5643t) {
            return (InterfaceC5643t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    void A() {
        if (this.f46405c == null) {
            this.f46405c = (ContentFrameLayout) findViewById(C14580f.f136623b);
            this.f46406d = (ActionBarContainer) findViewById(C14580f.f136624c);
            this.f46407e = u(findViewById(C14580f.f136622a));
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f46406d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f46401E.a();
    }

    @Override // p2.InterfaceC16198D
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // p2.InterfaceC16198D
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p2.InterfaceC16198D
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // p2.InterfaceC16198D
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // p2.InterfaceC16198D
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f46411i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f46412j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f46413k + i11;
        this.f46413k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f46401E.b(view, view2, i10);
        this.f46413k = getActionBarHideOffset();
        v();
        d dVar = this.f46427y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f46406d.getVisibility() != 0) {
            return false;
        }
        return this.f46411i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f46411i && !this.f46412j) {
            if (this.f46413k <= this.f46406d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f46427y;
        if (dVar != null) {
            dVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f46427y = dVar;
        if (getWindowToken() != null) {
            this.f46427y.onWindowVisibilityChanged(this.f46404b);
            int i10 = this.f46414l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                ViewCompat.j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f46410h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f46411i) {
            this.f46411i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setOverlayMode(boolean z10) {
        this.f46409g = z10;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.f46399C);
        removeCallbacks(this.f46400D);
        ViewPropertyAnimator viewPropertyAnimator = this.f46397A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f46409g;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46404b = 0;
        this.f46415m = new Rect();
        this.f46416n = new Rect();
        this.f46417o = new Rect();
        this.f46418p = new Rect();
        this.f46419q = new Rect();
        this.f46420r = new Rect();
        this.f46421s = new Rect();
        this.f46422t = new Rect();
        androidx.core.view.j jVar = androidx.core.view.j.f53969b;
        this.f46423u = jVar;
        this.f46424v = jVar;
        this.f46425w = jVar;
        this.f46426x = jVar;
        this.f46398B = new a();
        this.f46399C = new b();
        this.f46400D = new c();
        w(context);
        this.f46401E = new p2.F(this);
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        this.f46402F = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    private void B() {
        v();
        this.f46399C.run();
    }

    private void p() {
        v();
        this.f46400D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f46394G);
        boolean z10 = false;
        this.f46403a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, 1);
        this.f46408f = drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        typedArrayObtainStyledAttributes.recycle();
        this.f46428z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f46400D, 600L);
    }

    private void z() {
        v();
        postDelayed(this.f46399C, 600L);
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public boolean a() {
        A();
        return this.f46407e.a();
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public boolean b() {
        A();
        return this.f46407e.b();
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public boolean c() {
        A();
        return this.f46407e.c();
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public void d(Menu menu, j.a aVar) {
        A();
        this.f46407e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int bottom;
        fsSuperDraw_4cd02ea059c4058ece6112dde1a10fb3(canvas);
        if (this.f46408f != null) {
            if (this.f46406d.getVisibility() == 0) {
                bottom = (int) (this.f46406d.getBottom() + this.f46406d.getTranslationY() + 0.5f);
            } else {
                bottom = 0;
            }
            this.f46408f.setBounds(0, bottom, getWidth(), this.f46408f.getIntrinsicHeight() + bottom);
            this.f46408f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public boolean e() {
        A();
        return this.f46407e.e();
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public void f() {
        A();
        this.f46407e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public boolean g() {
        A();
        return this.f46407e.g();
    }

    public CharSequence getTitle() {
        A();
        return this.f46407e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public void h(int i10) {
        A();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            }
            this.f46407e.z();
            return;
        }
        this.f46407e.q();
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public void l() {
        A();
        this.f46407e.s();
    }

    @Override // p2.E
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        androidx.core.view.j jVarC = androidx.core.view.j.C(windowInsets, this);
        boolean zQ = q(this.f46406d, new Rect(jVarC.k(), jVarC.m(), jVarC.l(), jVarC.j()), true, true, false, true);
        ViewCompat.g(this, jVarC, this.f46415m);
        Rect rect = this.f46415m;
        androidx.core.view.j jVarQ = jVarC.q(rect.left, rect.top, rect.right, rect.bottom);
        this.f46423u = jVarQ;
        boolean z10 = true;
        if (!this.f46424v.equals(jVarQ)) {
            this.f46424v = this.f46423u;
            zQ = true;
        }
        if (!this.f46416n.equals(this.f46415m)) {
            this.f46416n.set(this.f46415m);
        } else {
            z10 = zQ;
        }
        if (z10) {
            requestLayout();
        }
        return jVarC.a().c().b().A();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        ViewCompat.j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        A();
        measureChildWithMargins(this.f46406d, i10, 0, i11, 0);
        e eVar = (e) this.f46406d.getLayoutParams();
        int iMax = Math.max(0, this.f46406d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f46406d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f46406d.getMeasuredState());
        if ((ViewCompat.L(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f46403a;
            if (this.f46410h && this.f46406d.getTabContainer() != null) {
                measuredHeight += this.f46403a;
            }
        } else {
            measuredHeight = this.f46406d.getVisibility() != 8 ? this.f46406d.getMeasuredHeight() : 0;
        }
        this.f46417o.set(this.f46415m);
        this.f46425w = this.f46423u;
        if (!this.f46409g && !z10 && r()) {
            Rect rect = this.f46417o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f46425w = this.f46425w.q(0, measuredHeight, 0, 0);
        } else {
            this.f46425w = new j.a(this.f46425w).d(c2.d.b(this.f46425w.k(), this.f46425w.m() + measuredHeight, this.f46425w.l(), this.f46425w.j())).a();
        }
        q(this.f46405c, this.f46417o, true, true, true, true);
        if (!this.f46426x.equals(this.f46425w)) {
            androidx.core.view.j jVar = this.f46425w;
            this.f46426x = jVar;
            ViewCompat.h(this.f46405c, jVar);
        }
        measureChildWithMargins(this.f46405c, i10, 0, i11, 0);
        e eVar2 = (e) this.f46405c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f46405c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f46405c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f46405c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f46414l ^ i10;
        this.f46414l = i10;
        boolean z11 = false;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        d dVar = this.f46427y;
        if (dVar != null) {
            dVar.c(!z11);
            if (!z10 && z11) {
                this.f46427y.d();
            } else {
                this.f46427y.a();
            }
        }
        if ((i11 & 256) != 0 && this.f46427y != null) {
            ViewCompat.j0(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f46404b = i10;
        d dVar = this.f46427y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f46406d.setTranslationY(-Math.max(0, Math.min(i10, this.f46406d.getHeight())));
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f46407e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        A();
        this.f46407e.u(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f46407e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC5642s
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f46407e.setWindowTitle(charSequence);
    }
}
