package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.gms.common.api.a;
import p2.C16340A;
import p2.C16342C;
import p2.C16370n;
import p2.E;
import p2.F;
import p2.InterfaceC16341B;
import p2.InterfaceC16372o;
import p2.M;
import q2.C16592A;
import q2.y;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements E, InterfaceC16341B, FSDraw {

    /* renamed from: E, reason: collision with root package name */
    private static final float f54238E = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: F, reason: collision with root package name */
    private static final a f54239F = new a();

    /* renamed from: G, reason: collision with root package name */
    private static final int[] f54240G = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    private float f54241A;

    /* renamed from: B, reason: collision with root package name */
    private e f54242B;

    /* renamed from: C, reason: collision with root package name */
    final d f54243C;

    /* renamed from: D, reason: collision with root package name */
    C16370n f54244D;

    /* renamed from: a, reason: collision with root package name */
    private final float f54245a;

    /* renamed from: b, reason: collision with root package name */
    private long f54246b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f54247c;

    /* renamed from: d, reason: collision with root package name */
    private OverScroller f54248d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f54249e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f54250f;

    /* renamed from: g, reason: collision with root package name */
    M f54251g;

    /* renamed from: h, reason: collision with root package name */
    private int f54252h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f54253i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f54254j;

    /* renamed from: k, reason: collision with root package name */
    private View f54255k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f54256l;

    /* renamed from: m, reason: collision with root package name */
    private VelocityTracker f54257m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f54258n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f54259o;

    /* renamed from: p, reason: collision with root package name */
    private int f54260p;

    /* renamed from: q, reason: collision with root package name */
    private int f54261q;

    /* renamed from: r, reason: collision with root package name */
    private int f54262r;

    /* renamed from: s, reason: collision with root package name */
    private int f54263s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f54264t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f54265u;

    /* renamed from: v, reason: collision with root package name */
    private int f54266v;

    /* renamed from: w, reason: collision with root package name */
    private int f54267w;

    /* renamed from: x, reason: collision with root package name */
    private f f54268x;

    /* renamed from: y, reason: collision with root package name */
    private final F f54269y;

    /* renamed from: z, reason: collision with root package name */
    private final C16342C f54270z;

    class d implements InterfaceC16372o {
        @Override // p2.InterfaceC16372o
        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f10);
            return true;
        }

        d() {
        }

        @Override // p2.InterfaceC16372o
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // p2.InterfaceC16372o
        public void c() {
            NestedScrollView.this.f54248d.abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f54272a;

        class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }

            a() {
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f54272a = parcel.readInt();
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f54272a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f54272a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y1.a.f42776c);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private void N(boolean z10) {
        if (z10) {
            Y(2, 1);
        } else {
            a0(1);
        }
        this.f54267w = getScrollY();
        postInvalidateOnAnimation();
    }

    private int P(int i10, int i11, int i12, boolean z10) {
        return Q(i10, -1, null, i11, i12, z10);
    }

    private boolean T(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return x(-i10) < androidx.core.widget.f.b(edgeEffect) * ((float) getHeight());
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private void s() {
        this.f54263s = -1;
        this.f54256l = false;
        L();
        a0(0);
        this.f54249e.onRelease();
        this.f54250f.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View u(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(boolean, int, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return l(i10, i11, iArr, iArr2, 0);
    }

    public void fsSuperDraw_525147df17cfa12d62e03b9c86575ca7(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    @Override // p2.InterfaceC16343D
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        l(i10, i11, iArr, null, i12);
    }

    @Override // p2.InterfaceC16343D
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, null);
    }

    @Override // p2.InterfaceC16343D
    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f54253i = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return Y(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        a0(0);
    }

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C16592A.a(accessibilityEvent, nestedScrollView.getScrollX());
            C16592A.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            int scrollRange;
            super.g(view, yVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            yVar.p0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                yVar.R0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    yVar.b(y.a.f157850r);
                    yVar.b(y.a.f157817C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    yVar.b(y.a.f157849q);
                    yVar.b(y.a.f157819E);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 != 8192 && i10 != 16908344) {
                    if (i10 != 16908346) {
                        return false;
                    }
                } else {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.X(0, iMax, true);
                    return true;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.X(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54247c = new Rect();
        this.f54253i = true;
        this.f54254j = false;
        this.f54255k = null;
        this.f54256l = false;
        this.f54259o = true;
        this.f54263s = -1;
        this.f54264t = new int[2];
        this.f54265u = new int[2];
        d dVar = new d();
        this.f54243C = dVar;
        this.f54244D = new C16370n(getContext(), dVar);
        this.f54249e = androidx.core.widget.f.a(context, attributeSet);
        this.f54250f = androidx.core.widget.f.a(context, attributeSet);
        this.f54245a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f54240G, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f54269y = new F(this);
        this.f54270z = new C16342C(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m0(this, f54239F);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f54257m;
        if (velocityTracker == null) {
            this.f54257m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f54248d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f54260p = viewConfiguration.getScaledTouchSlop();
        this.f54261q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f54262r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f54257m == null) {
            this.f54257m = VelocityTracker.obtain();
        }
    }

    private void D(int i10, int i11) {
        this.f54252h = i10;
        this.f54263s = i11;
        Y(2, 0);
    }

    private boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.f54247c);
        offsetDescendantRectToMyCoords(view, this.f54247c);
        return this.f54247c.bottom + i10 >= getScrollY() && this.f54247c.top - i10 <= getScrollY() + i11;
    }

    private void L() {
        VelocityTracker velocityTracker = this.f54257m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f54257m = null;
        }
    }

    private void R(View view) {
        view.getDrawingRect(this.f54247c);
        offsetDescendantRectToMyCoords(view, this.f54247c);
        int iG = g(this.f54247c);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean Z(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.f.b(this.f54249e) != 0.0f) {
            androidx.core.widget.f.d(this.f54249e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.f.b(this.f54250f) == 0.0f) {
            return z10;
        }
        androidx.core.widget.f.d(this.f54250f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f54248d.abortAnimation();
        a0(1);
    }

    private M getScrollFeedbackProvider() {
        if (this.f54251g == null) {
            this.f54251g = M.a(this);
        }
        return this.f54251g;
    }

    private void q(int i10) {
        if (i10 != 0) {
            if (this.f54259o) {
                U(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean r(int i10) {
        if (androidx.core.widget.f.b(this.f54249e) != 0.0f) {
            if (T(this.f54249e, i10)) {
                this.f54249e.onAbsorb(i10);
                return true;
            }
            v(-i10);
            return true;
        }
        if (androidx.core.widget.f.b(this.f54250f) == 0.0f) {
            return false;
        }
        int i11 = -i10;
        if (T(this.f54250f, i11)) {
            this.f54250f.onAbsorb(i11);
            return true;
        }
        v(i11);
        return true;
    }

    public boolean K(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f54247c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f54247c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f54247c.top = getScrollY() - height;
            Rect rect2 = this.f54247c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f54247c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return O(i10, i11, i12);
    }

    int Q(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            Y(2, i13);
        }
        boolean z11 = false;
        if (l(0, i10, this.f54265u, this.f54264t, i13)) {
            int i16 = i10 - this.f54265u[1];
            i15 = this.f54264t[1];
            i14 = i16;
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = d() && !z10;
        int i17 = i14;
        boolean z13 = J(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().c(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        int[] iArr = this.f54265u;
        iArr[1] = 0;
        p(0, scrollY2, 0, i17 - scrollY2, this.f54264t, i13, iArr);
        int i18 = i15 + this.f54264t[1];
        int i19 = i17 - this.f54265u[1];
        int i20 = scrollY + i19;
        if (i20 < 0) {
            if (z12) {
                androidx.core.widget.f.d(this.f54249e, (-i19) / getHeight(), i12 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
                }
                if (!this.f54250f.isFinished()) {
                    this.f54250f.onRelease();
                }
            }
        } else if (i20 > scrollRange && z12) {
            androidx.core.widget.f.d(this.f54250f, i19 / getHeight(), 1.0f - (i12 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
            }
            if (!this.f54249e.isFinished()) {
                this.f54249e.onRelease();
            }
        }
        if (this.f54249e.isFinished() && this.f54250f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i13 == 0 && (velocityTracker = this.f54257m) != null) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            a0(i13);
            this.f54249e.onRelease();
            this.f54250f.onRelease();
        }
        return i18;
    }

    public final void U(int i10, int i11) {
        V(i10, i11, 250, false);
    }

    void X(int i10, int i11, boolean z10) {
        W(i10, i11, 250, z10);
    }

    public boolean Y(int i10, int i11) {
        return this.f54270z.q(i10, i11);
    }

    public void a0(int i10) {
        this.f54270z.s(i10);
    }

    @Override // android.view.View
    public void computeScroll() {
        int i10;
        if (this.f54248d.isFinished()) {
            return;
        }
        this.f54248d.computeScrollOffset();
        int currY = this.f54248d.getCurrY();
        int iH = h(currY - this.f54267w);
        this.f54267w = currY;
        int[] iArr = this.f54265u;
        iArr[1] = 0;
        l(0, iH, iArr, null, 1);
        int i11 = iH - this.f54265u[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(this, Math.abs(this.f54248d.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY = getScrollY();
            J(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i10 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f54265u;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i12, this.f54264t, 1, iArr2);
            i11 = i12 - this.f54265u[1];
        } else {
            i10 = scrollRange;
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i10 > 0)) {
                if (i11 < 0) {
                    if (this.f54249e.isFinished()) {
                        this.f54249e.onAbsorb((int) this.f54248d.getCurrVelocity());
                    }
                } else if (this.f54250f.isFinished()) {
                    this.f54250f.onAbsorb((int) this.f54248d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f54248d.isFinished()) {
            a0(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f54270z.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f54270z.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f54270z.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f54269y.a();
    }

    float getVerticalScrollFactorCompat() {
        if (this.f54241A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f54241A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f54241A;
    }

    @Override // p2.InterfaceC16343D
    public void i(View view, View view2, int i10, int i11) {
        this.f54269y.c(view, view2, i10, i11);
        Y(2, i11);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f54270z.m();
    }

    @Override // p2.InterfaceC16343D
    public void j(View view, int i10) {
        this.f54269y.e(view, i10);
        a0(i10);
    }

    public boolean l(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f54270z.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        v((int) f11);
        return true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f54268x = fVar;
        requestLayout();
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f54270z.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f54253i) {
            this.f54255k = view2;
        } else {
            R(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f54258n) {
            this.f54258n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f54270z.n(z10);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.f54242B = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f54259o = z10;
    }

    public boolean t(KeyEvent keyEvent) {
        this.f54247c.setEmpty();
        if (!e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : c(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    public boolean w(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f54247c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f54247c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f54247c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f54247c;
        return O(i10, rect3.top, rect3.bottom);
    }

    public boolean y(int i10) {
        return this.f54270z.l(i10);
    }

    private void H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f54270z.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f54263s) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f54252h = (int) motionEvent.getY(i10);
            this.f54263s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f54257m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f54249e
            float r0 = androidx.core.widget.f.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f54249e
            float r4 = -r4
            float r4 = androidx.core.widget.f.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f54249e
            float r5 = androidx.core.widget.f.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f54249e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f54250f
            float r0 = androidx.core.widget.f.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f54250f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.f.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f54250f
            float r5 = androidx.core.widget.f.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f54250f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    private boolean O(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z11 = false;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        View viewU = u(z10, i11, i12);
        if (viewU == null) {
            viewU = this;
        }
        if (i11 < scrollY || i12 > i14) {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            P(i13, 0, 1, true);
            z11 = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i10);
        }
        return z11;
    }

    private boolean S(Rect rect, boolean z10) {
        boolean z11;
        int iG = g(rect);
        if (iG != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, iG);
                return z11;
            }
            U(0, iG);
        }
        return z11;
    }

    private void V(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f54246b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f54248d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            N(z10);
        } else {
            if (!this.f54248d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f54246b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private float x(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f54245a * 0.015f));
        float f10 = f54238E;
        return (float) (this.f54245a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * dLog));
    }

    private boolean z(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    boolean J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i18;
        int i19;
        boolean z15;
        boolean z16;
        int i20;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z11)) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z12)) {
            z14 = false;
        } else {
            z14 = true;
        }
        int i21 = i12 + i10;
        if (!z13) {
            i18 = 0;
        } else {
            i18 = i16;
        }
        int i22 = i13 + i11;
        if (!z14) {
            i19 = 0;
        } else {
            i19 = i17;
        }
        int i23 = -i18;
        int i24 = i18 + i14;
        int i25 = -i19;
        int i26 = i19 + i15;
        if (i21 > i24) {
            i21 = i24;
            z15 = true;
        } else if (i21 < i23) {
            z15 = true;
            i21 = i23;
        } else {
            z15 = false;
        }
        if (i22 > i26) {
            i22 = i26;
            z16 = true;
        } else if (i22 < i25) {
            z16 = true;
            i22 = i25;
        } else {
            z16 = false;
        }
        if (z16 && !y(1)) {
            int i27 = i21;
            this.f54248d.springBack(i27, i22, 0, 0, 0, getScrollRange());
            i20 = i27;
        } else {
            i20 = i21;
        }
        onOverScrolled(i20, i22, z15, z16);
        if (!z15 && !z16) {
            return false;
        }
        return true;
    }

    void W(int i10, int i11, int i12, boolean z10) {
        V(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    public boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus != null && G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            viewFindNextFocus.getDrawingRect(this.f54247c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f54247c);
            P(g(this.f54247c), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > iMax) {
            return bottom + (scrollY - iMax);
        }
        return bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !t(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        fsSuperDraw_525147df17cfa12d62e03b9c86575ca7(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f54249e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f54249e.setSize(width, height);
            if (this.f54249e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (!this.f54250f.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f54250f.setSize(width2, height2);
            if (this.f54250f.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    protected int g(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        }
        if (rect.height() > height) {
            i11 = 0 - (i10 - rect.bottom);
        } else {
            i11 = 0 - (scrollY - rect.top);
        }
        return Math.max(i11, -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.f.b(this.f54249e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.f.d(this.f54249e, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f54249e.finish();
            }
            return i10 - iRound;
        }
        if (i10 < 0 && androidx.core.widget.f.b(this.f54250f) != 0.0f) {
            float f10 = height;
            int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.f.d(this.f54250f, (i10 * 4.0f) / f10, 0.5f));
            if (iRound2 != i10) {
                this.f54250f.finish();
            }
            return i10 - iRound2;
        }
        return i10;
    }

    @Override // p2.E
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        H(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54254j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f54256l) {
            if (C16340A.a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i10 = 9;
                width = (int) motionEvent.getX();
            } else if (C16340A.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                Q(-((int) (axisValue * getVerticalScrollFactorCompat())), i10, motionEvent, width, 1, C16340A.a(motionEvent, 8194));
                if (i10 != 0) {
                    this.f54244D.g(motionEvent, i10);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f54253i = false;
        View view = this.f54255k;
        if (view != null && F(view, this)) {
            R(this.f54255k);
        }
        this.f54255k = null;
        if (!this.f54254j) {
            if (this.f54268x != null) {
                scrollTo(getScrollX(), this.f54268x.f54272a);
                this.f54268x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f54254j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f54258n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f54272a = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f54242B;
        if (eVar != null) {
            eVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus != null && this != viewFindFocus && G(viewFindFocus, 0, i13)) {
            viewFindFocus.getDrawingRect(this.f54247c);
            offsetDescendantRectToMyCoords(viewFindFocus, this.f54247c);
            q(g(this.f54247c));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f54266v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f54266v);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                I(motionEvent);
                                this.f54252h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f54263s));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f54252h = (int) motionEvent.getY(actionIndex);
                            this.f54263s = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f54256l && getChildCount() > 0 && this.f54248d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        s();
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f54263s);
                    if (iFindPointerIndex == -1) {
                        FS.log_e("NestedScrollView", "Invalid pointerId=" + this.f54263s + " in onTouchEvent");
                    } else {
                        int y10 = (int) motionEvent.getY(iFindPointerIndex);
                        int i10 = this.f54252h - y10;
                        int iM = i10 - M(i10, motionEvent.getX(iFindPointerIndex));
                        if (!this.f54256l && Math.abs(iM) > this.f54260p) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f54256l = true;
                            iM = iM > 0 ? iM - this.f54260p : iM + this.f54260p;
                        }
                        int i11 = iM;
                        if (this.f54256l) {
                            nestedScrollView = this;
                            int iQ = nestedScrollView.Q(i11, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            nestedScrollView.f54252h = y10 - iQ;
                            nestedScrollView.f54266v += iQ;
                        }
                    }
                }
                nestedScrollView = this;
            } else {
                nestedScrollView = this;
                VelocityTracker velocityTracker = nestedScrollView.f54257m;
                velocityTracker.computeCurrentVelocity(1000, nestedScrollView.f54262r);
                int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f54263s);
                if (Math.abs(yVelocity) >= nestedScrollView.f54261q) {
                    if (!r(yVelocity)) {
                        int i12 = -yVelocity;
                        float f10 = i12;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            v(i12);
                        }
                    }
                } else if (nestedScrollView.f54248d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            }
        } else {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f54256l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f54248d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f54257m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return S(rect, z10);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i10, width, width2);
            int iF2 = f(i11, height, height2);
            if (iF != getScrollX() || iF2 != getScrollY()) {
                super.scrollTo(iF, iF2);
            }
        }
    }

    public void v(int i10) {
        if (getChildCount() > 0) {
            this.f54248d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, 0, 0);
            N(true);
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.f54248d.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
