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
import i.C14578a;
import i.C14583f;
import p2.InterfaceC16343D;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC5784s, InterfaceC16343D, p2.E, FSDraw, FSDispatchDraw {

    /* renamed from: G, reason: collision with root package name */
    static final int[] f46618G = {C14578a.f136280b, R.attr.windowContentOverlay};

    /* renamed from: H, reason: collision with root package name */
    private static final androidx.core.view.j f46619H = new j.a().d(c2.d.b(0, 1, 0, 1)).a();

    /* renamed from: I, reason: collision with root package name */
    private static final Rect f46620I = new Rect();

    /* renamed from: A, reason: collision with root package name */
    ViewPropertyAnimator f46621A;

    /* renamed from: B, reason: collision with root package name */
    final AnimatorListenerAdapter f46622B;

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f46623C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f46624D;

    /* renamed from: E, reason: collision with root package name */
    private final p2.F f46625E;

    /* renamed from: F, reason: collision with root package name */
    private final NoSystemUiLayoutFlagView f46626F;

    /* renamed from: a, reason: collision with root package name */
    private int f46627a;

    /* renamed from: b, reason: collision with root package name */
    private int f46628b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f46629c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f46630d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5785t f46631e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f46632f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46633g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46634h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46635i;

    /* renamed from: j, reason: collision with root package name */
    boolean f46636j;

    /* renamed from: k, reason: collision with root package name */
    private int f46637k;

    /* renamed from: l, reason: collision with root package name */
    private int f46638l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f46639m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f46640n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f46641o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f46642p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f46643q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f46644r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f46645s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f46646t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.core.view.j f46647u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.core.view.j f46648v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.core.view.j f46649w;

    /* renamed from: x, reason: collision with root package name */
    private androidx.core.view.j f46650x;

    /* renamed from: y, reason: collision with root package name */
    private d f46651y;

    /* renamed from: z, reason: collision with root package name */
    private OverScroller f46652z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46621A = null;
            actionBarOverlayLayout.f46636j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46621A = null;
            actionBarOverlayLayout.f46636j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46621A = actionBarOverlayLayout.f46630d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f46622B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f46621A = actionBarOverlayLayout.f46630d.animate().translationY(-ActionBarOverlayLayout.this.f46630d.getHeight()).setListener(ActionBarOverlayLayout.this.f46622B);
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
        this.f46631e.setIcon(i10);
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
        this.f46652z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
        return this.f46652z.getFinalY() > this.f46630d.getHeight();
    }

    private boolean r() {
        ViewCompat.g(this.f46626F, f46619H, this.f46642p);
        return !this.f46642p.equals(f46620I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC5785t u(View view) {
        if (view instanceof InterfaceC5785t) {
            return (InterfaceC5785t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    void A() {
        if (this.f46629c == null) {
            this.f46629c = (ContentFrameLayout) findViewById(C14583f.f136380b);
            this.f46630d = (ActionBarContainer) findViewById(C14583f.f136381c);
            this.f46631e = u(findViewById(C14583f.f136379a));
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
        ActionBarContainer actionBarContainer = this.f46630d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f46625E.a();
    }

    @Override // p2.InterfaceC16343D
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
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

    @Override // p2.InterfaceC16343D
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // p2.InterfaceC16343D
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f46635i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f46636j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f46637k + i11;
        this.f46637k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f46625E.b(view, view2, i10);
        this.f46637k = getActionBarHideOffset();
        v();
        d dVar = this.f46651y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f46630d.getVisibility() != 0) {
            return false;
        }
        return this.f46635i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f46635i && !this.f46636j) {
            if (this.f46637k <= this.f46630d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f46651y;
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
        this.f46651y = dVar;
        if (getWindowToken() != null) {
            this.f46651y.onWindowVisibilityChanged(this.f46628b);
            int i10 = this.f46638l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                ViewCompat.j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f46634h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f46635i) {
            this.f46635i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setOverlayMode(boolean z10) {
        this.f46633g = z10;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.f46623C);
        removeCallbacks(this.f46624D);
        ViewPropertyAnimator viewPropertyAnimator = this.f46621A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f46633g;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46628b = 0;
        this.f46639m = new Rect();
        this.f46640n = new Rect();
        this.f46641o = new Rect();
        this.f46642p = new Rect();
        this.f46643q = new Rect();
        this.f46644r = new Rect();
        this.f46645s = new Rect();
        this.f46646t = new Rect();
        androidx.core.view.j jVar = androidx.core.view.j.f54193b;
        this.f46647u = jVar;
        this.f46648v = jVar;
        this.f46649w = jVar;
        this.f46650x = jVar;
        this.f46622B = new a();
        this.f46623C = new b();
        this.f46624D = new c();
        w(context);
        this.f46625E = new p2.F(this);
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        this.f46626F = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    private void B() {
        v();
        this.f46623C.run();
    }

    private void p() {
        v();
        this.f46624D.run();
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
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f46618G);
        boolean z10 = false;
        this.f46627a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, 1);
        this.f46632f = drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        typedArrayObtainStyledAttributes.recycle();
        this.f46652z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f46624D, 600L);
    }

    private void z() {
        v();
        postDelayed(this.f46623C, 600L);
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public boolean a() {
        A();
        return this.f46631e.a();
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public boolean b() {
        A();
        return this.f46631e.b();
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public boolean c() {
        A();
        return this.f46631e.c();
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public void d(Menu menu, j.a aVar) {
        A();
        this.f46631e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int bottom;
        fsSuperDraw_4cd02ea059c4058ece6112dde1a10fb3(canvas);
        if (this.f46632f != null) {
            if (this.f46630d.getVisibility() == 0) {
                bottom = (int) (this.f46630d.getBottom() + this.f46630d.getTranslationY() + 0.5f);
            } else {
                bottom = 0;
            }
            this.f46632f.setBounds(0, bottom, getWidth(), this.f46632f.getIntrinsicHeight() + bottom);
            this.f46632f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public boolean e() {
        A();
        return this.f46631e.e();
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public void f() {
        A();
        this.f46631e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public boolean g() {
        A();
        return this.f46631e.g();
    }

    public CharSequence getTitle() {
        A();
        return this.f46631e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
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
            this.f46631e.z();
            return;
        }
        this.f46631e.q();
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public void l() {
        A();
        this.f46631e.s();
    }

    @Override // p2.E
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        androidx.core.view.j jVarC = androidx.core.view.j.C(windowInsets, this);
        boolean zQ = q(this.f46630d, new Rect(jVarC.k(), jVarC.m(), jVarC.l(), jVarC.j()), true, true, false, true);
        ViewCompat.g(this, jVarC, this.f46639m);
        Rect rect = this.f46639m;
        androidx.core.view.j jVarQ = jVarC.q(rect.left, rect.top, rect.right, rect.bottom);
        this.f46647u = jVarQ;
        boolean z10 = true;
        if (!this.f46648v.equals(jVarQ)) {
            this.f46648v = this.f46647u;
            zQ = true;
        }
        if (!this.f46640n.equals(this.f46639m)) {
            this.f46640n.set(this.f46639m);
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
        measureChildWithMargins(this.f46630d, i10, 0, i11, 0);
        e eVar = (e) this.f46630d.getLayoutParams();
        int iMax = Math.max(0, this.f46630d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f46630d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f46630d.getMeasuredState());
        if ((ViewCompat.L(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f46627a;
            if (this.f46634h && this.f46630d.getTabContainer() != null) {
                measuredHeight += this.f46627a;
            }
        } else {
            measuredHeight = this.f46630d.getVisibility() != 8 ? this.f46630d.getMeasuredHeight() : 0;
        }
        this.f46641o.set(this.f46639m);
        this.f46649w = this.f46647u;
        if (!this.f46633g && !z10 && r()) {
            Rect rect = this.f46641o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f46649w = this.f46649w.q(0, measuredHeight, 0, 0);
        } else {
            this.f46649w = new j.a(this.f46649w).d(c2.d.b(this.f46649w.k(), this.f46649w.m() + measuredHeight, this.f46649w.l(), this.f46649w.j())).a();
        }
        q(this.f46629c, this.f46641o, true, true, true, true);
        if (!this.f46650x.equals(this.f46649w)) {
            androidx.core.view.j jVar = this.f46649w;
            this.f46650x = jVar;
            ViewCompat.h(this.f46629c, jVar);
        }
        measureChildWithMargins(this.f46629c, i10, 0, i11, 0);
        e eVar2 = (e) this.f46629c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f46629c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f46629c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f46629c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f46638l ^ i10;
        this.f46638l = i10;
        boolean z11 = false;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        d dVar = this.f46651y;
        if (dVar != null) {
            dVar.c(!z11);
            if (!z10 && z11) {
                this.f46651y.d();
            } else {
                this.f46651y.a();
            }
        }
        if ((i11 & 256) != 0 && this.f46651y != null) {
            ViewCompat.j0(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f46628b = i10;
        d dVar = this.f46651y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f46630d.setTranslationY(-Math.max(0, Math.min(i10, this.f46630d.getHeight())));
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f46631e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        A();
        this.f46631e.u(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f46631e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC5784s
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f46631e.setWindowTitle(charSequence);
    }
}
