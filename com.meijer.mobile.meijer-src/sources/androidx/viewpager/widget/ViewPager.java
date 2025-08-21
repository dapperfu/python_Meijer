package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p2.G;
import q2.y;
import w2.AbstractC17821a;

/* loaded from: classes4.dex */
public class ViewPager extends ViewGroup implements FSDraw, FSDispatchDraw {

    /* renamed from: d0, reason: collision with root package name */
    static final int[] f59108d0 = {R.attr.layout_gravity};

    /* renamed from: e0, reason: collision with root package name */
    private static final Comparator<f> f59109e0 = new a();

    /* renamed from: f0, reason: collision with root package name */
    private static final Interpolator f59110f0 = new b();

    /* renamed from: g0, reason: collision with root package name */
    private static final m f59111g0 = new m();

    /* renamed from: A, reason: collision with root package name */
    private int f59112A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f59113B;

    /* renamed from: C, reason: collision with root package name */
    private float f59114C;

    /* renamed from: D, reason: collision with root package name */
    private float f59115D;

    /* renamed from: E, reason: collision with root package name */
    private float f59116E;

    /* renamed from: F, reason: collision with root package name */
    private float f59117F;

    /* renamed from: G, reason: collision with root package name */
    private int f59118G;

    /* renamed from: H, reason: collision with root package name */
    private VelocityTracker f59119H;

    /* renamed from: I, reason: collision with root package name */
    private int f59120I;

    /* renamed from: J, reason: collision with root package name */
    private int f59121J;

    /* renamed from: K, reason: collision with root package name */
    private int f59122K;

    /* renamed from: L, reason: collision with root package name */
    private int f59123L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f59124M;

    /* renamed from: N, reason: collision with root package name */
    public EdgeEffect f59125N;

    /* renamed from: O, reason: collision with root package name */
    public EdgeEffect f59126O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f59127P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f59128Q;

    /* renamed from: R, reason: collision with root package name */
    private int f59129R;

    /* renamed from: S, reason: collision with root package name */
    private List<j> f59130S;

    /* renamed from: T, reason: collision with root package name */
    private j f59131T;

    /* renamed from: U, reason: collision with root package name */
    private j f59132U;

    /* renamed from: V, reason: collision with root package name */
    private List<i> f59133V;

    /* renamed from: W, reason: collision with root package name */
    private int f59134W;

    /* renamed from: a, reason: collision with root package name */
    private int f59135a;

    /* renamed from: a0, reason: collision with root package name */
    private ArrayList<View> f59136a0;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<f> f59137b;

    /* renamed from: b0, reason: collision with root package name */
    private final Runnable f59138b0;

    /* renamed from: c, reason: collision with root package name */
    private final f f59139c;

    /* renamed from: c0, reason: collision with root package name */
    private int f59140c0;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f59141d;

    /* renamed from: e, reason: collision with root package name */
    androidx.viewpager.widget.a f59142e;

    /* renamed from: f, reason: collision with root package name */
    int f59143f;

    /* renamed from: g, reason: collision with root package name */
    private int f59144g;

    /* renamed from: h, reason: collision with root package name */
    private Parcelable f59145h;

    /* renamed from: i, reason: collision with root package name */
    private ClassLoader f59146i;

    /* renamed from: j, reason: collision with root package name */
    private Scroller f59147j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f59148k;

    /* renamed from: l, reason: collision with root package name */
    private k f59149l;

    /* renamed from: m, reason: collision with root package name */
    private int f59150m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f59151n;

    /* renamed from: o, reason: collision with root package name */
    private int f59152o;

    /* renamed from: p, reason: collision with root package name */
    private int f59153p;

    /* renamed from: q, reason: collision with root package name */
    private float f59154q;

    /* renamed from: r, reason: collision with root package name */
    private float f59155r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f59156s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f59157t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f59158u;

    /* renamed from: v, reason: collision with root package name */
    private int f59159v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f59160w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f59161x;

    /* renamed from: y, reason: collision with root package name */
    private int f59162y;

    /* renamed from: z, reason: collision with root package name */
    private int f59163z;

    class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f59168b - fVar2.f59168b;
        }

        a() {
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    class d implements G {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f59165a = new Rect();

        d() {
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            androidx.core.view.j jVarZ = ViewCompat.Z(view, jVar);
            if (jVarZ.s()) {
                return jVarZ;
            }
            Rect rect = this.f59165a;
            rect.left = jVarZ.k();
            rect.top = jVarZ.m();
            rect.right = jVarZ.l();
            rect.bottom = jVarZ.j();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.core.view.j jVarH = ViewCompat.h(ViewPager.this.getChildAt(i10), jVarZ);
                rect.left = Math.min(jVarH.k(), rect.left);
                rect.top = Math.min(jVarH.m(), rect.top);
                rect.right = Math.min(jVarH.l(), rect.right);
                rect.bottom = Math.min(jVarH.j(), rect.bottom);
            }
            return new j.a(jVarZ).d(c2.d.c(rect)).a();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    class h extends androidx.core.view.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f59142e;
            return aVar != null && aVar.d() > 1;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f59142e) != null) {
                accessibilityEvent.setItemCount(aVar.d());
                accessibilityEvent.setFromIndex(ViewPager.this.f59143f);
                accessibilityEvent.setToIndex(ViewPager.this.f59143f);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.p0("androidx.viewpager.widget.ViewPager");
            yVar.R0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                yVar.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                yVar.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) throws Resources.NotFoundException {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f59143f - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f59143f + 1);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.h();
        }
    }

    public static class l extends AbstractC17821a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f59180c;

        /* renamed from: d, reason: collision with root package name */
        Parcelable f59181d;

        /* renamed from: e, reason: collision with root package name */
        ClassLoader f59182e;

        class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }

            a() {
            }
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f59180c = parcel.readInt();
            this.f59181d = parcel.readParcelable(classLoader);
            this.f59182e = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f59180c + "}";
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f59180c);
            parcel.writeParcelable(this.f59181d, i10);
        }
    }

    private void H() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f59172a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private boolean L() {
        this.f59118G = -1;
        n();
        this.f59125N.onRelease();
        this.f59126O.onRelease();
        return (this.f59125N.isFinished() && this.f59126O.isFinished()) ? false : true;
    }

    private void n() {
        this.f59160w = false;
        this.f59161x = false;
        VelocityTracker velocityTracker = this.f59119H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f59119H = null;
        }
    }

    public void N(int i10, boolean z10) throws Resources.NotFoundException {
        this.f59158u = false;
        O(i10, z10, false);
    }

    void O(int i10, boolean z10, boolean z11) throws Resources.NotFoundException {
        P(i10, z10, z11, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarR;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f59168b == this.f59143f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f59148k = true;
        if (this.f59147j.isFinished() || !this.f59147j.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f59147j.getCurrX();
        int currY = this.f59147j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.f59147j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_c5e2a2dc45764d08cf6210f28fcf504e(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_c5e2a2dc45764d08cf6210f28fcf504e(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_c5e2a2dc45764d08cf6210f28fcf504e(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_c5e2a2dc45764d08cf6210f28fcf504e(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void fsSuperDraw_c5e2a2dc45764d08cf6210f28fcf504e(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f59163z = Math.min(measuredWidth / 10, this.f59162y);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f59172a) {
                int i15 = gVar2.f59173b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f59156s = true;
        D();
        this.f59156s = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f59172a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f59174c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    f r(View view) {
        for (int i10 = 0; i10 < this.f59137b.size(); i10++) {
            f fVar = this.f59137b.get(i10);
            if (this.f59142e.i(view, fVar.f59167a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setCurrentItem(int i10) throws Resources.NotFoundException {
        this.f59158u = false;
        O(i10, !this.f59127P, false);
    }

    public void setOffscreenPageLimit(int i10) throws Resources.NotFoundException {
        if (i10 < 1) {
            FS.log_w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f59159v) {
            this.f59159v = i10;
            D();
        }
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f59151n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    f t(int i10) {
        for (int i11 = 0; i11 < this.f59137b.size(); i11++) {
            f fVar = this.f59137b.get(i11);
            if (fVar.f59168b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void u(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.f59147j = new Scroller(context, f59110f0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f59112A = viewConfiguration.getScaledPagingTouchSlop();
        this.f59120I = (int) (400.0f * f10);
        this.f59121J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f59125N = FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
        this.f59126O = FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
        this.f59122K = (int) (25.0f * f10);
        this.f59123L = (int) (2.0f * f10);
        this.f59162y = (int) (f10 * 16.0f);
        ViewCompat.m0(this, new h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ViewCompat.A0(this, new d());
    }

    class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }

        b() {
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f59167a;

        /* renamed from: b, reason: collision with root package name */
        int f59168b;

        /* renamed from: c, reason: collision with root package name */
        boolean f59169c;

        /* renamed from: d, reason: collision with root package name */
        float f59170d;

        /* renamed from: e, reason: collision with root package name */
        float f59171e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f59172a;

        /* renamed from: b, reason: collision with root package name */
        public int f59173b;

        /* renamed from: c, reason: collision with root package name */
        float f59174c;

        /* renamed from: d, reason: collision with root package name */
        boolean f59175d;

        /* renamed from: e, reason: collision with root package name */
        int f59176e;

        /* renamed from: f, reason: collision with root package name */
        int f59177f;

        public g() {
            super(-1, -1);
            this.f59174c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f59174c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f59108d0);
            this.f59173b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class m implements Comparator<View> {
        m() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f59172a;
            if (z10 != gVar2.f59172a) {
                if (z10) {
                    return 1;
                }
                return -1;
            }
            return gVar.f59176e - gVar2.f59176e;
        }
    }

    private boolean B(int i10) {
        if (this.f59137b.size() == 0) {
            if (this.f59127P) {
                return false;
            }
            this.f59128Q = false;
            x(0, 0.0f, 0);
            if (this.f59128Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarS = s();
        int clientWidth = getClientWidth();
        int i11 = this.f59150m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = fVarS.f59168b;
        float f11 = ((i10 / f10) - fVarS.f59171e) / (fVarS.f59170d + (i11 / f10));
        this.f59128Q = false;
        x(i13, f11, (int) (i12 * f11));
        if (this.f59128Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean C(float f10, float f11) {
        boolean z10;
        float f12 = this.f59114C - f10;
        this.f59114C = f10;
        float fG = G(f12, f11);
        float f13 = f12 - fG;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = fG != 0.0f;
        if (Math.abs(f13) < 1.0E-4f) {
            return z13;
        }
        float scrollX = getScrollX() + f13;
        float clientWidth = getClientWidth();
        float f14 = this.f59154q * clientWidth;
        float f15 = this.f59155r * clientWidth;
        f fVar = this.f59137b.get(0);
        ArrayList<f> arrayList = this.f59137b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f59168b != 0) {
            f14 = fVar.f59171e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f59168b != this.f59142e.d() - 1) {
            f15 = fVar2.f59171e * clientWidth;
        } else {
            z12 = true;
        }
        if (scrollX < f14) {
            if (z10) {
                androidx.core.widget.f.d(this.f59125N, (f14 - scrollX) / clientWidth, 1.0f - (f11 / getHeight()));
            } else {
                z11 = z13;
            }
            z13 = z11;
            scrollX = f14;
        } else if (scrollX > f15) {
            if (z12) {
                androidx.core.widget.f.d(this.f59126O, (scrollX - f15) / clientWidth, f11 / getHeight());
            } else {
                z11 = z13;
            }
            z13 = z11;
            scrollX = f15;
        }
        int i10 = (int) scrollX;
        this.f59114C += scrollX - i10;
        scrollTo(i10, getScrollY());
        B(i10);
        return z13;
    }

    private void F(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f59137b.isEmpty()) {
            if (!this.f59147j.isFinished()) {
                this.f59147j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f fVarT = t(this.f59143f);
        int iMin = (int) ((fVarT != null ? Math.min(fVarT.f59171e, this.f59155r) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            g(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void R() {
        if (this.f59134W != 0) {
            ArrayList<View> arrayList = this.f59136a0;
            if (arrayList == null) {
                this.f59136a0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f59136a0.add(getChildAt(i10));
            }
            Collections.sort(this.f59136a0, f59111g0);
        }
    }

    private void e(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int iD = this.f59142e.d();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f59150m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f59168b;
            int i14 = fVar.f59168b;
            if (i13 < i14) {
                float fG = fVar2.f59171e + fVar2.f59170d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f59168b && i16 < this.f59137b.size()) {
                    f fVar5 = this.f59137b.get(i16);
                    while (true) {
                        fVar4 = fVar5;
                        if (i15 <= fVar4.f59168b || i16 >= this.f59137b.size() - 1) {
                            break;
                        }
                        i16++;
                        fVar5 = this.f59137b.get(i16);
                    }
                    while (i15 < fVar4.f59168b) {
                        fG += this.f59142e.g(i15) + f10;
                        i15++;
                    }
                    fVar4.f59171e = fG;
                    fG += fVar4.f59170d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f59137b.size() - 1;
                float fG2 = fVar2.f59171e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f59168b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f59137b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i13 >= fVar3.f59168b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f59137b.get(size);
                    }
                    while (i13 > fVar3.f59168b) {
                        fG2 -= this.f59142e.g(i13) + f10;
                        i13--;
                    }
                    fG2 -= fVar3.f59170d + f10;
                    fVar3.f59171e = fG2;
                }
            }
        }
        int size2 = this.f59137b.size();
        float fG3 = fVar.f59171e;
        int i17 = fVar.f59168b;
        int i18 = i17 - 1;
        this.f59154q = i17 == 0 ? fG3 : -3.4028235E38f;
        int i19 = iD - 1;
        this.f59155r = i17 == i19 ? (fVar.f59170d + fG3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar7 = this.f59137b.get(i20);
            while (true) {
                i12 = fVar7.f59168b;
                if (i18 <= i12) {
                    break;
                }
                fG3 -= this.f59142e.g(i18) + f10;
                i18--;
            }
            fG3 -= fVar7.f59170d + f10;
            fVar7.f59171e = fG3;
            if (i12 == 0) {
                this.f59154q = fG3;
            }
            i20--;
            i18--;
        }
        float fG4 = fVar.f59171e + fVar.f59170d + f10;
        int i21 = fVar.f59168b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar8 = this.f59137b.get(i22);
            while (true) {
                i11 = fVar8.f59168b;
                if (i21 >= i11) {
                    break;
                }
                fG4 += this.f59142e.g(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f59155r = (fVar8.f59170d + fG4) - 1.0f;
            }
            fVar8.f59171e = fG4;
            fG4 += fVar8.f59170d + f10;
            i22++;
            i21++;
        }
    }

    private void g(boolean z10) {
        boolean z11 = this.f59140c0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f59147j.isFinished()) {
                this.f59147j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f59147j.getCurrX();
                int currY = this.f59147j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.f59158u = false;
        for (int i10 = 0; i10 < this.f59137b.size(); i10++) {
            f fVar = this.f59137b.get(i10);
            if (fVar.f59169c) {
                fVar.f59169c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                ViewCompat.e0(this, this.f59138b0);
            } else {
                this.f59138b0.run();
            }
        }
    }

    private void j(int i10, float f10, int i11) {
        j jVar = this.f59131T;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List<j> list = this.f59130S;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.f59130S.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f59132U;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    private void k(int i10) {
        j jVar = this.f59131T;
        if (jVar != null) {
            jVar.c(i10);
        }
        List<j> list = this.f59130S;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.f59130S.get(i11);
                if (jVar2 != null) {
                    jVar2.c(i10);
                }
            }
        }
        j jVar3 = this.f59132U;
        if (jVar3 != null) {
            jVar3.c(i10);
        }
    }

    private void l(int i10) {
        j jVar = this.f59131T;
        if (jVar != null) {
            jVar.b(i10);
        }
        List<j> list = this.f59130S;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.f59130S.get(i11);
                if (jVar2 != null) {
                    jVar2.b(i10);
                }
            }
        }
        j jVar3 = this.f59132U;
        if (jVar3 != null) {
            jVar3.b(i10);
        }
    }

    private Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f59157t != z10) {
            this.f59157t = z10;
        }
    }

    private boolean w(float f10, float f11) {
        if (this.f59113B) {
            return false;
        }
        if (f10 >= this.f59163z || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.f59163z)) && f11 < 0.0f;
        }
        return true;
    }

    boolean A() throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f59142e;
        if (aVar == null || this.f59143f >= aVar.d() - 1) {
            return false;
        }
        N(this.f59143f + 1, true);
        return true;
    }

    void D() throws Resources.NotFoundException {
        E(this.f59143f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[PHI: r7 r10 r15
      0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void E(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.E(int):void");
    }

    public void I(i iVar) {
        List<i> list = this.f59133V;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List<j> list = this.f59130S;
        if (list != null) {
            list.remove(jVar);
        }
    }

    void P(int i10, boolean z10, boolean z11, int i11) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f59142e;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f59143f == i10 && this.f59137b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f59142e.d()) {
            i10 = this.f59142e.d() - 1;
        }
        int i12 = this.f59159v;
        int i13 = this.f59143f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f59137b.size(); i14++) {
                this.f59137b.get(i14).f59169c = true;
            }
        }
        boolean z12 = this.f59143f != i10;
        if (!this.f59127P) {
            E(i10);
            M(i10, z10, i11, z12);
        } else {
            this.f59143f = i10;
            if (z12) {
                k(i10);
            }
            requestLayout();
        }
    }

    f a(int i10, int i11) {
        f fVar = new f();
        fVar.f59168b = i10;
        fVar.f59167a = this.f59142e.h(this, i10);
        fVar.f59170d = this.f59142e.g(i10);
        if (i11 < 0 || i11 >= this.f59137b.size()) {
            this.f59137b.add(fVar);
            return fVar;
        }
        this.f59137b.add(i11, fVar);
        return fVar;
    }

    public void b(i iVar) {
        if (this.f59133V == null) {
            this.f59133V = new ArrayList();
        }
        this.f59133V.add(iVar);
    }

    public void c(j jVar) {
        if (this.f59130S == null) {
            this.f59130S = new ArrayList();
        }
        this.f59130S.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f59142e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f59154q)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f59155r));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    protected boolean f(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && f(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f59142e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f59134W == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) this.f59136a0.get(i11).getLayoutParams()).f59177f;
    }

    public int getCurrentItem() {
        return this.f59143f;
    }

    public int getOffscreenPageLimit() {
        return this.f59159v;
    }

    public int getPageMargin() {
        return this.f59150m;
    }

    void h() throws Resources.NotFoundException {
        int iD = this.f59142e.d();
        this.f59135a = iD;
        boolean z10 = this.f59137b.size() < (this.f59159v * 2) + 1 && this.f59137b.size() < iD;
        int iMax = this.f59143f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f59137b.size()) {
            f fVar = this.f59137b.get(i10);
            int iE = this.f59142e.e(fVar.f59167a);
            if (iE != -1) {
                if (iE == -2) {
                    this.f59137b.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f59142e.r(this);
                        z11 = true;
                    }
                    this.f59142e.a(this, fVar.f59168b, fVar.f59167a);
                    int i11 = this.f59143f;
                    if (i11 == fVar.f59168b) {
                        iMax = Math.max(0, Math.min(i11, iD - 1));
                    }
                } else {
                    int i12 = fVar.f59168b;
                    if (i12 != iE) {
                        if (i12 == this.f59143f) {
                            iMax = iE;
                        }
                        fVar.f59168b = iE;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f59142e.c(this);
        }
        Collections.sort(this.f59137b, f59109e0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                g gVar = (g) getChildAt(i13).getLayoutParams();
                if (!gVar.f59172a) {
                    gVar.f59174c = 0.0f;
                }
            }
            O(iMax, false, true);
            requestLayout();
        }
    }

    float m(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f59138b0);
        Scroller scroller = this.f59147j;
        if (scroller != null && !scroller.isFinished()) {
            this.f59147j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.f59150m <= 0 || this.f59151n == null || this.f59137b.size() <= 0 || this.f59142e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f59150m / width;
        int i12 = 0;
        f fVar = this.f59137b.get(0);
        float f12 = fVar.f59171e;
        int size = this.f59137b.size();
        int i13 = fVar.f59168b;
        int i14 = this.f59137b.get(size - 1).f59168b;
        while (i13 < i14) {
            while (true) {
                i10 = fVar.f59168b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                fVar = this.f59137b.get(i12);
            }
            if (i13 == i10) {
                float f13 = fVar.f59171e;
                float f14 = fVar.f59170d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fG = this.f59142e.g(i13);
                f10 = (f12 + fG) * width;
                f12 += fG + f11;
            }
            if (this.f59150m + f10 > scrollX) {
                i11 = scrollX;
                this.f59151n.setBounds(Math.round(f10), this.f59152o, Math.round(this.f59150m + f10), this.f59153p);
                this.f59151n.draw(canvas);
            } else {
                i11 = scrollX;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollX = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.a());
        androidx.viewpager.widget.a aVar = this.f59142e;
        if (aVar != null) {
            aVar.l(lVar.f59181d, lVar.f59182e);
            O(lVar.f59180c, false, true);
        } else {
            this.f59144g = lVar.f59180c;
            this.f59145h = lVar.f59181d;
            this.f59146i = lVar.f59182e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f59156s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar2 = this.f59142e;
        if (aVar2 != null) {
            aVar2.p(null);
            this.f59142e.r(this);
            for (int i10 = 0; i10 < this.f59137b.size(); i10++) {
                f fVar = this.f59137b.get(i10);
                this.f59142e.a(this, fVar.f59168b, fVar.f59167a);
            }
            this.f59142e.c(this);
            this.f59137b.clear();
            H();
            this.f59143f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f59142e;
        this.f59142e = aVar;
        this.f59135a = 0;
        if (aVar != null) {
            if (this.f59149l == null) {
                this.f59149l = new k();
            }
            this.f59142e.p(this.f59149l);
            this.f59158u = false;
            boolean z10 = this.f59127P;
            this.f59127P = true;
            this.f59135a = this.f59142e.d();
            if (this.f59144g >= 0) {
                this.f59142e.l(this.f59145h, this.f59146i);
                O(this.f59144g, false, true);
                this.f59144g = -1;
                this.f59145h = null;
                this.f59146i = null;
            } else if (z10) {
                requestLayout();
            } else {
                D();
            }
        }
        List<i> list = this.f59133V;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f59133V.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f59133V.get(i11).a(this, aVar3, aVar);
        }
    }

    public void setDragInGutterEnabled(boolean z10) {
        this.f59113B = z10;
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f59131T = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f59150m;
        this.f59150m = i10;
        int width = getWidth();
        F(width, width, i10, i11);
        requestLayout();
    }

    void setScrollState(int i10) {
        if (this.f59140c0 == i10) {
            return;
        }
        this.f59140c0 = i10;
        l(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void x(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f59129R
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.f59172a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.f59173b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.j(r12, r13, r14)
            r11.f59128Q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.x(int, float, int):void");
    }

    boolean z() throws Resources.NotFoundException {
        int i10 = this.f59143f;
        if (i10 <= 0) {
            return false;
        }
        N(i10 - 1, true);
        return true;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59137b = new ArrayList<>();
        this.f59139c = new f();
        this.f59141d = new Rect();
        this.f59144g = -1;
        this.f59145h = null;
        this.f59146i = null;
        this.f59154q = -3.4028235E38f;
        this.f59155r = Float.MAX_VALUE;
        this.f59159v = 1;
        this.f59113B = true;
        this.f59118G = -1;
        this.f59127P = true;
        this.f59138b0 = new c();
        this.f59140c0 = 0;
        u(context, attributeSet);
    }

    private float G(float f10, float f11) {
        float height = f11 / getHeight();
        float width = f10 / getWidth();
        float fD = 0.0f;
        if (androidx.core.widget.f.b(this.f59125N) != 0.0f) {
            fD = -androidx.core.widget.f.d(this.f59125N, -width, 1.0f - height);
        } else if (androidx.core.widget.f.b(this.f59126O) != 0.0f) {
            fD = androidx.core.widget.f.d(this.f59126O, width, height);
        }
        return fD * getWidth();
    }

    private void K(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private void M(int i10, boolean z10, int i11, boolean z11) throws Resources.NotFoundException {
        int clientWidth;
        f fVarT = t(i10);
        if (fVarT != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.f59154q, Math.min(fVarT.f59171e, this.f59155r)));
        } else {
            clientWidth = 0;
        }
        if (z10) {
            Q(clientWidth, 0, i11);
            if (z11) {
                k(i10);
                return;
            }
            return;
        }
        if (z11) {
            k(i10);
        }
        g(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int i(int i10, float f10, int i11, int i12) {
        float f11;
        if (Math.abs(i12) > this.f59122K && Math.abs(i11) > this.f59120I && androidx.core.widget.f.b(this.f59125N) == 0.0f && androidx.core.widget.f.b(this.f59126O) == 0.0f) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.f59143f) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i10 += (int) (f10 + f11);
        }
        if (this.f59137b.size() > 0) {
            return Math.max(this.f59137b.get(0).f59168b, Math.min(i10, this.f59137b.get(r4.size() - 1).f59168b));
        }
        return i10;
    }

    private f s() {
        float scrollX;
        float f10;
        int i10;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        if (clientWidth > 0) {
            scrollX = getScrollX() / clientWidth;
        } else {
            scrollX = 0.0f;
        }
        if (clientWidth > 0) {
            f10 = this.f59150m / clientWidth;
        } else {
            f10 = 0.0f;
        }
        int i11 = 0;
        boolean z10 = true;
        f fVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f59137b.size()) {
            f fVar2 = this.f59137b.get(i11);
            if (!z10 && fVar2.f59168b != (i10 = i12 + 1)) {
                fVar2 = this.f59139c;
                fVar2.f59171e = f11 + f12 + f10;
                fVar2.f59168b = i10;
                fVar2.f59170d = this.f59142e.g(i10);
                i11--;
            }
            f fVar3 = fVar2;
            f11 = fVar3.f59171e;
            float f13 = fVar3.f59170d + f11 + f10;
            if (!z10 && scrollX < f11) {
                break;
            }
            if (scrollX >= f13 && i11 != this.f59137b.size() - 1) {
                int i13 = fVar3.f59168b;
                float f14 = fVar3.f59170d;
                i11++;
                i12 = i13;
                f12 = f14;
                fVar = fVar3;
                z10 = false;
            } else {
                return fVar3;
            }
        }
        return fVar;
    }

    private static boolean v(View view) {
        if (view.getClass().getAnnotation(e.class) != null) {
            return true;
        }
        return false;
    }

    private void y(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f59118G) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f59114C = motionEvent.getX(i10);
            this.f59118G = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f59119H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    void Q(int i10, int i11, int i12) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f59147j;
        if (scroller != null && !scroller.isFinished()) {
            if (this.f59148k) {
                scrollX = this.f59147j.getCurrX();
            } else {
                scrollX = this.f59147j.getStartX();
            }
            this.f59147j.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            g(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fM = f11 + (m(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fM / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.f59142e.g(this.f59143f)) + this.f59150m)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f59148k = false;
        this.f59147j.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f fVarR;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f59168b == this.f59143f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zV = gVar.f59172a | v(view);
        gVar.f59172a = zV;
        if (this.f59156s) {
            if (!zV) {
                gVar.f59175d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            com.fullstory.FS.log_e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.f59141d
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f59141d
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.z()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.f59141d
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f59141d
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.A()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.A()
            goto Lca
        Lc6:
            boolean r0 = r4.z()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !o(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarR;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f59168b == this.f59143f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        fsSuperDraw_c5e2a2dc45764d08cf6210f28fcf504e(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f59142e) == null || aVar.d() <= 1)) {
            this.f59125N.finish();
            this.f59126O.finish();
        } else {
            if (!this.f59125N.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f59154q * width);
                this.f59125N.setSize(height, width);
                zDraw = this.f59125N.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f59126O.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f59155r + 1.0f)) * width2);
                this.f59126O.setSize(height2, width2);
                zDraw |= this.f59126O.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f59151n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                        return false;
                    }
                    return false;
                }
                if (keyEvent.hasModifiers(2)) {
                    return A();
                }
                return d(66);
            }
            if (keyEvent.hasModifiers(2)) {
                return z();
            }
            return d(17);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59127P = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        float f10;
        int action = motionEvent.getAction() & l3.f93323c;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f59160w) {
                    return true;
                }
                if (this.f59161x) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        y(motionEvent);
                    }
                } else {
                    int i10 = this.f59118G;
                    if (i10 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float f11 = x10 - this.f59114C;
                        float fAbs = Math.abs(f11);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y10 - this.f59117F);
                        if (f11 != 0.0f && !w(this.f59114C, f11) && f(this, false, (int) f11, (int) x10, (int) y10)) {
                            this.f59114C = x10;
                            this.f59115D = y10;
                            this.f59161x = true;
                            return false;
                        }
                        int i11 = this.f59112A;
                        if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                            this.f59160w = true;
                            K(true);
                            setScrollState(1);
                            if (f11 > 0.0f) {
                                f10 = this.f59116E + this.f59112A;
                            } else {
                                f10 = this.f59116E - this.f59112A;
                            }
                            this.f59114C = f10;
                            this.f59115D = y10;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > i11) {
                            this.f59161x = true;
                        }
                        if (this.f59160w && C(x10, y10)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.f59116E = x11;
                this.f59114C = x11;
                float y11 = motionEvent.getY();
                this.f59117F = y11;
                this.f59115D = y11;
                this.f59118G = motionEvent.getPointerId(0);
                this.f59161x = false;
                this.f59148k = true;
                this.f59147j.computeScrollOffset();
                if (this.f59140c0 == 2 && Math.abs(this.f59147j.getFinalX() - this.f59147j.getCurrX()) > this.f59123L) {
                    this.f59147j.abortAnimation();
                    this.f59158u = false;
                    D();
                    this.f59160w = true;
                    K(true);
                    setScrollState(1);
                } else if (androidx.core.widget.f.b(this.f59125N) == 0.0f && androidx.core.widget.f.b(this.f59126O) == 0.0f) {
                    g(false);
                    this.f59160w = false;
                } else {
                    this.f59160w = true;
                    setScrollState(1);
                    if (androidx.core.widget.f.b(this.f59125N) != 0.0f) {
                        androidx.core.widget.f.d(this.f59125N, 0.0f, 1.0f - (this.f59115D / getHeight()));
                    }
                    if (androidx.core.widget.f.b(this.f59126O) != 0.0f) {
                        androidx.core.widget.f.d(this.f59126O, 0.0f, this.f59115D / getHeight());
                    }
                }
            }
            if (this.f59119H == null) {
                this.f59119H = VelocityTracker.obtain();
            }
            this.f59119H.addMovement(motionEvent);
            return this.f59160w;
        }
        L();
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f fVarR;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f59168b == this.f59143f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f59180c = this.f59143f;
        androidx.viewpager.widget.a aVar = this.f59142e;
        if (aVar != null) {
            lVar.f59181d = aVar.m();
        }
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f59150m;
            F(i10, i12, i14, i14);
        }
    }

    f q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return r(view);
            }
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f59151n) {
            return false;
        }
        return true;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(Z1.b.e(getContext(), i10));
    }
}
