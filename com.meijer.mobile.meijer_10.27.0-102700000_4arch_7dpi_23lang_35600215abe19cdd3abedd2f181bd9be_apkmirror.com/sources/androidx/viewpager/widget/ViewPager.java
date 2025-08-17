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
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class ViewPager extends ViewGroup implements FSDraw, FSDispatchDraw {

    /* renamed from: d0, reason: collision with root package name */
    static final int[] f58922d0 = {R.attr.layout_gravity};

    /* renamed from: e0, reason: collision with root package name */
    private static final Comparator<f> f58923e0 = new a();

    /* renamed from: f0, reason: collision with root package name */
    private static final Interpolator f58924f0 = new b();

    /* renamed from: g0, reason: collision with root package name */
    private static final m f58925g0 = new m();

    /* renamed from: A, reason: collision with root package name */
    private int f58926A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f58927B;

    /* renamed from: C, reason: collision with root package name */
    private float f58928C;

    /* renamed from: D, reason: collision with root package name */
    private float f58929D;

    /* renamed from: E, reason: collision with root package name */
    private float f58930E;

    /* renamed from: F, reason: collision with root package name */
    private float f58931F;

    /* renamed from: G, reason: collision with root package name */
    private int f58932G;

    /* renamed from: H, reason: collision with root package name */
    private VelocityTracker f58933H;

    /* renamed from: I, reason: collision with root package name */
    private int f58934I;

    /* renamed from: J, reason: collision with root package name */
    private int f58935J;

    /* renamed from: K, reason: collision with root package name */
    private int f58936K;

    /* renamed from: L, reason: collision with root package name */
    private int f58937L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f58938M;

    /* renamed from: N, reason: collision with root package name */
    public EdgeEffect f58939N;

    /* renamed from: O, reason: collision with root package name */
    public EdgeEffect f58940O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f58941P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f58942Q;

    /* renamed from: R, reason: collision with root package name */
    private int f58943R;

    /* renamed from: S, reason: collision with root package name */
    private List<j> f58944S;

    /* renamed from: T, reason: collision with root package name */
    private j f58945T;

    /* renamed from: U, reason: collision with root package name */
    private j f58946U;

    /* renamed from: V, reason: collision with root package name */
    private List<i> f58947V;

    /* renamed from: W, reason: collision with root package name */
    private int f58948W;

    /* renamed from: a, reason: collision with root package name */
    private int f58949a;

    /* renamed from: a0, reason: collision with root package name */
    private ArrayList<View> f58950a0;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<f> f58951b;

    /* renamed from: b0, reason: collision with root package name */
    private final Runnable f58952b0;

    /* renamed from: c, reason: collision with root package name */
    private final f f58953c;

    /* renamed from: c0, reason: collision with root package name */
    private int f58954c0;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f58955d;

    /* renamed from: e, reason: collision with root package name */
    androidx.viewpager.widget.a f58956e;

    /* renamed from: f, reason: collision with root package name */
    int f58957f;

    /* renamed from: g, reason: collision with root package name */
    private int f58958g;

    /* renamed from: h, reason: collision with root package name */
    private Parcelable f58959h;

    /* renamed from: i, reason: collision with root package name */
    private ClassLoader f58960i;

    /* renamed from: j, reason: collision with root package name */
    private Scroller f58961j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f58962k;

    /* renamed from: l, reason: collision with root package name */
    private k f58963l;

    /* renamed from: m, reason: collision with root package name */
    private int f58964m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f58965n;

    /* renamed from: o, reason: collision with root package name */
    private int f58966o;

    /* renamed from: p, reason: collision with root package name */
    private int f58967p;

    /* renamed from: q, reason: collision with root package name */
    private float f58968q;

    /* renamed from: r, reason: collision with root package name */
    private float f58969r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f58970s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f58971t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f58972u;

    /* renamed from: v, reason: collision with root package name */
    private int f58973v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f58974w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f58975x;

    /* renamed from: y, reason: collision with root package name */
    private int f58976y;

    /* renamed from: z, reason: collision with root package name */
    private int f58977z;

    class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f58982b - fVar2.f58982b;
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
        private final Rect f58979a = new Rect();

        d() {
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            androidx.core.view.j jVarZ = ViewCompat.Z(view, jVar);
            if (jVarZ.s()) {
                return jVarZ;
            }
            Rect rect = this.f58979a;
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
            androidx.viewpager.widget.a aVar = ViewPager.this.f58956e;
            return aVar != null && aVar.d() > 1;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f58956e) != null) {
                accessibilityEvent.setItemCount(aVar.d());
                accessibilityEvent.setFromIndex(ViewPager.this.f58957f);
                accessibilityEvent.setToIndex(ViewPager.this.f58957f);
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
                viewPager.setCurrentItem(viewPager.f58957f - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f58957f + 1);
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

    public static class l extends AbstractC17751a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f58994c;

        /* renamed from: d, reason: collision with root package name */
        Parcelable f58995d;

        /* renamed from: e, reason: collision with root package name */
        ClassLoader f58996e;

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
            this.f58994c = parcel.readInt();
            this.f58995d = parcel.readParcelable(classLoader);
            this.f58996e = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f58994c + "}";
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f58994c);
            parcel.writeParcelable(this.f58995d, i10);
        }
    }

    private void H() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f58986a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private boolean L() {
        this.f58932G = -1;
        n();
        this.f58939N.onRelease();
        this.f58940O.onRelease();
        return (this.f58939N.isFinished() && this.f58940O.isFinished()) ? false : true;
    }

    private void n() {
        this.f58974w = false;
        this.f58975x = false;
        VelocityTracker velocityTracker = this.f58933H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f58933H = null;
        }
    }

    public void N(int i10, boolean z10) throws Resources.NotFoundException {
        this.f58972u = false;
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
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f58982b == this.f58957f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f58962k = true;
        if (this.f58961j.isFinished() || !this.f58961j.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f58961j.getCurrX();
        int currY = this.f58961j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.f58961j.abortAnimation();
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
        this.f58977z = Math.min(measuredWidth / 10, this.f58976y);
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
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f58986a) {
                int i15 = gVar2.f58987b;
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
        this.f58970s = true;
        D();
        this.f58970s = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f58986a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f58988c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    f r(View view) {
        for (int i10 = 0; i10 < this.f58951b.size(); i10++) {
            f fVar = this.f58951b.get(i10);
            if (this.f58956e.i(view, fVar.f58981a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setCurrentItem(int i10) throws Resources.NotFoundException {
        this.f58972u = false;
        O(i10, !this.f58941P, false);
    }

    public void setOffscreenPageLimit(int i10) throws Resources.NotFoundException {
        if (i10 < 1) {
            FS.log_w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f58973v) {
            this.f58973v = i10;
            D();
        }
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f58965n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    f t(int i10) {
        for (int i11 = 0; i11 < this.f58951b.size(); i11++) {
            f fVar = this.f58951b.get(i11);
            if (fVar.f58982b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void u(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.f58961j = new Scroller(context, f58924f0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f58926A = viewConfiguration.getScaledPagingTouchSlop();
        this.f58934I = (int) (400.0f * f10);
        this.f58935J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f58939N = FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
        this.f58940O = FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
        this.f58936K = (int) (25.0f * f10);
        this.f58937L = (int) (2.0f * f10);
        this.f58976y = (int) (f10 * 16.0f);
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
        Object f58981a;

        /* renamed from: b, reason: collision with root package name */
        int f58982b;

        /* renamed from: c, reason: collision with root package name */
        boolean f58983c;

        /* renamed from: d, reason: collision with root package name */
        float f58984d;

        /* renamed from: e, reason: collision with root package name */
        float f58985e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f58986a;

        /* renamed from: b, reason: collision with root package name */
        public int f58987b;

        /* renamed from: c, reason: collision with root package name */
        float f58988c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58989d;

        /* renamed from: e, reason: collision with root package name */
        int f58990e;

        /* renamed from: f, reason: collision with root package name */
        int f58991f;

        public g() {
            super(-1, -1);
            this.f58988c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f58988c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f58922d0);
            this.f58987b = typedArrayObtainStyledAttributes.getInteger(0, 48);
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
            boolean z10 = gVar.f58986a;
            if (z10 != gVar2.f58986a) {
                if (z10) {
                    return 1;
                }
                return -1;
            }
            return gVar.f58990e - gVar2.f58990e;
        }
    }

    private boolean B(int i10) {
        if (this.f58951b.size() == 0) {
            if (this.f58941P) {
                return false;
            }
            this.f58942Q = false;
            x(0, 0.0f, 0);
            if (this.f58942Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarS = s();
        int clientWidth = getClientWidth();
        int i11 = this.f58964m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = fVarS.f58982b;
        float f11 = ((i10 / f10) - fVarS.f58985e) / (fVarS.f58984d + (i11 / f10));
        this.f58942Q = false;
        x(i13, f11, (int) (i12 * f11));
        if (this.f58942Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean C(float f10, float f11) {
        boolean z10;
        float f12 = this.f58928C - f10;
        this.f58928C = f10;
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
        float f14 = this.f58968q * clientWidth;
        float f15 = this.f58969r * clientWidth;
        f fVar = this.f58951b.get(0);
        ArrayList<f> arrayList = this.f58951b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f58982b != 0) {
            f14 = fVar.f58985e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f58982b != this.f58956e.d() - 1) {
            f15 = fVar2.f58985e * clientWidth;
        } else {
            z12 = true;
        }
        if (scrollX < f14) {
            if (z10) {
                androidx.core.widget.f.d(this.f58939N, (f14 - scrollX) / clientWidth, 1.0f - (f11 / getHeight()));
            } else {
                z11 = z13;
            }
            z13 = z11;
            scrollX = f14;
        } else if (scrollX > f15) {
            if (z12) {
                androidx.core.widget.f.d(this.f58940O, (scrollX - f15) / clientWidth, f11 / getHeight());
            } else {
                z11 = z13;
            }
            z13 = z11;
            scrollX = f15;
        }
        int i10 = (int) scrollX;
        this.f58928C += scrollX - i10;
        scrollTo(i10, getScrollY());
        B(i10);
        return z13;
    }

    private void F(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f58951b.isEmpty()) {
            if (!this.f58961j.isFinished()) {
                this.f58961j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f fVarT = t(this.f58957f);
        int iMin = (int) ((fVarT != null ? Math.min(fVarT.f58985e, this.f58969r) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            g(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void R() {
        if (this.f58948W != 0) {
            ArrayList<View> arrayList = this.f58950a0;
            if (arrayList == null) {
                this.f58950a0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f58950a0.add(getChildAt(i10));
            }
            Collections.sort(this.f58950a0, f58925g0);
        }
    }

    private void e(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int iD = this.f58956e.d();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f58964m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f58982b;
            int i14 = fVar.f58982b;
            if (i13 < i14) {
                float fG = fVar2.f58985e + fVar2.f58984d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f58982b && i16 < this.f58951b.size()) {
                    f fVar5 = this.f58951b.get(i16);
                    while (true) {
                        fVar4 = fVar5;
                        if (i15 <= fVar4.f58982b || i16 >= this.f58951b.size() - 1) {
                            break;
                        }
                        i16++;
                        fVar5 = this.f58951b.get(i16);
                    }
                    while (i15 < fVar4.f58982b) {
                        fG += this.f58956e.g(i15) + f10;
                        i15++;
                    }
                    fVar4.f58985e = fG;
                    fG += fVar4.f58984d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f58951b.size() - 1;
                float fG2 = fVar2.f58985e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f58982b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f58951b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i13 >= fVar3.f58982b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f58951b.get(size);
                    }
                    while (i13 > fVar3.f58982b) {
                        fG2 -= this.f58956e.g(i13) + f10;
                        i13--;
                    }
                    fG2 -= fVar3.f58984d + f10;
                    fVar3.f58985e = fG2;
                }
            }
        }
        int size2 = this.f58951b.size();
        float fG3 = fVar.f58985e;
        int i17 = fVar.f58982b;
        int i18 = i17 - 1;
        this.f58968q = i17 == 0 ? fG3 : -3.4028235E38f;
        int i19 = iD - 1;
        this.f58969r = i17 == i19 ? (fVar.f58984d + fG3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar7 = this.f58951b.get(i20);
            while (true) {
                i12 = fVar7.f58982b;
                if (i18 <= i12) {
                    break;
                }
                fG3 -= this.f58956e.g(i18) + f10;
                i18--;
            }
            fG3 -= fVar7.f58984d + f10;
            fVar7.f58985e = fG3;
            if (i12 == 0) {
                this.f58968q = fG3;
            }
            i20--;
            i18--;
        }
        float fG4 = fVar.f58985e + fVar.f58984d + f10;
        int i21 = fVar.f58982b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar8 = this.f58951b.get(i22);
            while (true) {
                i11 = fVar8.f58982b;
                if (i21 >= i11) {
                    break;
                }
                fG4 += this.f58956e.g(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f58969r = (fVar8.f58984d + fG4) - 1.0f;
            }
            fVar8.f58985e = fG4;
            fG4 += fVar8.f58984d + f10;
            i22++;
            i21++;
        }
    }

    private void g(boolean z10) {
        boolean z11 = this.f58954c0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f58961j.isFinished()) {
                this.f58961j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f58961j.getCurrX();
                int currY = this.f58961j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.f58972u = false;
        for (int i10 = 0; i10 < this.f58951b.size(); i10++) {
            f fVar = this.f58951b.get(i10);
            if (fVar.f58983c) {
                fVar.f58983c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                ViewCompat.e0(this, this.f58952b0);
            } else {
                this.f58952b0.run();
            }
        }
    }

    private void j(int i10, float f10, int i11) {
        j jVar = this.f58945T;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List<j> list = this.f58944S;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.f58944S.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f58946U;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    private void k(int i10) {
        j jVar = this.f58945T;
        if (jVar != null) {
            jVar.c(i10);
        }
        List<j> list = this.f58944S;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.f58944S.get(i11);
                if (jVar2 != null) {
                    jVar2.c(i10);
                }
            }
        }
        j jVar3 = this.f58946U;
        if (jVar3 != null) {
            jVar3.c(i10);
        }
    }

    private void l(int i10) {
        j jVar = this.f58945T;
        if (jVar != null) {
            jVar.b(i10);
        }
        List<j> list = this.f58944S;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.f58944S.get(i11);
                if (jVar2 != null) {
                    jVar2.b(i10);
                }
            }
        }
        j jVar3 = this.f58946U;
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
        if (this.f58971t != z10) {
            this.f58971t = z10;
        }
    }

    private boolean w(float f10, float f11) {
        if (this.f58927B) {
            return false;
        }
        if (f10 >= this.f58977z || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.f58977z)) && f11 < 0.0f;
        }
        return true;
    }

    boolean A() throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f58956e;
        if (aVar == null || this.f58957f >= aVar.d() - 1) {
            return false;
        }
        N(this.f58957f + 1, true);
        return true;
    }

    void D() throws Resources.NotFoundException {
        E(this.f58957f);
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
        List<i> list = this.f58947V;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List<j> list = this.f58944S;
        if (list != null) {
            list.remove(jVar);
        }
    }

    void P(int i10, boolean z10, boolean z11, int i11) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f58956e;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f58957f == i10 && this.f58951b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f58956e.d()) {
            i10 = this.f58956e.d() - 1;
        }
        int i12 = this.f58973v;
        int i13 = this.f58957f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f58951b.size(); i14++) {
                this.f58951b.get(i14).f58983c = true;
            }
        }
        boolean z12 = this.f58957f != i10;
        if (!this.f58941P) {
            E(i10);
            M(i10, z10, i11, z12);
        } else {
            this.f58957f = i10;
            if (z12) {
                k(i10);
            }
            requestLayout();
        }
    }

    f a(int i10, int i11) {
        f fVar = new f();
        fVar.f58982b = i10;
        fVar.f58981a = this.f58956e.h(this, i10);
        fVar.f58984d = this.f58956e.g(i10);
        if (i11 < 0 || i11 >= this.f58951b.size()) {
            this.f58951b.add(fVar);
            return fVar;
        }
        this.f58951b.add(i11, fVar);
        return fVar;
    }

    public void b(i iVar) {
        if (this.f58947V == null) {
            this.f58947V = new ArrayList();
        }
        this.f58947V.add(iVar);
    }

    public void c(j jVar) {
        if (this.f58944S == null) {
            this.f58944S = new ArrayList();
        }
        this.f58944S.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f58956e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f58968q)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f58969r));
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
        return this.f58956e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f58948W == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) this.f58950a0.get(i11).getLayoutParams()).f58991f;
    }

    public int getCurrentItem() {
        return this.f58957f;
    }

    public int getOffscreenPageLimit() {
        return this.f58973v;
    }

    public int getPageMargin() {
        return this.f58964m;
    }

    void h() throws Resources.NotFoundException {
        int iD = this.f58956e.d();
        this.f58949a = iD;
        boolean z10 = this.f58951b.size() < (this.f58973v * 2) + 1 && this.f58951b.size() < iD;
        int iMax = this.f58957f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f58951b.size()) {
            f fVar = this.f58951b.get(i10);
            int iE = this.f58956e.e(fVar.f58981a);
            if (iE != -1) {
                if (iE == -2) {
                    this.f58951b.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f58956e.r(this);
                        z11 = true;
                    }
                    this.f58956e.a(this, fVar.f58982b, fVar.f58981a);
                    int i11 = this.f58957f;
                    if (i11 == fVar.f58982b) {
                        iMax = Math.max(0, Math.min(i11, iD - 1));
                    }
                } else {
                    int i12 = fVar.f58982b;
                    if (i12 != iE) {
                        if (i12 == this.f58957f) {
                            iMax = iE;
                        }
                        fVar.f58982b = iE;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f58956e.c(this);
        }
        Collections.sort(this.f58951b, f58923e0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                g gVar = (g) getChildAt(i13).getLayoutParams();
                if (!gVar.f58986a) {
                    gVar.f58988c = 0.0f;
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
        removeCallbacks(this.f58952b0);
        Scroller scroller = this.f58961j;
        if (scroller != null && !scroller.isFinished()) {
            this.f58961j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.f58964m <= 0 || this.f58965n == null || this.f58951b.size() <= 0 || this.f58956e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f58964m / width;
        int i12 = 0;
        f fVar = this.f58951b.get(0);
        float f12 = fVar.f58985e;
        int size = this.f58951b.size();
        int i13 = fVar.f58982b;
        int i14 = this.f58951b.get(size - 1).f58982b;
        while (i13 < i14) {
            while (true) {
                i10 = fVar.f58982b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                fVar = this.f58951b.get(i12);
            }
            if (i13 == i10) {
                float f13 = fVar.f58985e;
                float f14 = fVar.f58984d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fG = this.f58956e.g(i13);
                f10 = (f12 + fG) * width;
                f12 += fG + f11;
            }
            if (this.f58964m + f10 > scrollX) {
                i11 = scrollX;
                this.f58965n.setBounds(Math.round(f10), this.f58966o, Math.round(this.f58964m + f10), this.f58967p);
                this.f58965n.draw(canvas);
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
        androidx.viewpager.widget.a aVar = this.f58956e;
        if (aVar != null) {
            aVar.l(lVar.f58995d, lVar.f58996e);
            O(lVar.f58994c, false, true);
        } else {
            this.f58958g = lVar.f58994c;
            this.f58959h = lVar.f58995d;
            this.f58960i = lVar.f58996e;
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
        if (this.f58970s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar2 = this.f58956e;
        if (aVar2 != null) {
            aVar2.p(null);
            this.f58956e.r(this);
            for (int i10 = 0; i10 < this.f58951b.size(); i10++) {
                f fVar = this.f58951b.get(i10);
                this.f58956e.a(this, fVar.f58982b, fVar.f58981a);
            }
            this.f58956e.c(this);
            this.f58951b.clear();
            H();
            this.f58957f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f58956e;
        this.f58956e = aVar;
        this.f58949a = 0;
        if (aVar != null) {
            if (this.f58963l == null) {
                this.f58963l = new k();
            }
            this.f58956e.p(this.f58963l);
            this.f58972u = false;
            boolean z10 = this.f58941P;
            this.f58941P = true;
            this.f58949a = this.f58956e.d();
            if (this.f58958g >= 0) {
                this.f58956e.l(this.f58959h, this.f58960i);
                O(this.f58958g, false, true);
                this.f58958g = -1;
                this.f58959h = null;
                this.f58960i = null;
            } else if (z10) {
                requestLayout();
            } else {
                D();
            }
        }
        List<i> list = this.f58947V;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f58947V.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f58947V.get(i11).a(this, aVar3, aVar);
        }
    }

    public void setDragInGutterEnabled(boolean z10) {
        this.f58927B = z10;
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f58945T = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f58964m;
        this.f58964m = i10;
        int width = getWidth();
        F(width, width, i10, i11);
        requestLayout();
    }

    void setScrollState(int i10) {
        if (this.f58954c0 == i10) {
            return;
        }
        this.f58954c0 = i10;
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
            int r0 = r11.f58943R
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
            boolean r9 = r8.f58986a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.f58987b
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
            r11.f58942Q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.x(int, float, int):void");
    }

    boolean z() throws Resources.NotFoundException {
        int i10 = this.f58957f;
        if (i10 <= 0) {
            return false;
        }
        N(i10 - 1, true);
        return true;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58951b = new ArrayList<>();
        this.f58953c = new f();
        this.f58955d = new Rect();
        this.f58958g = -1;
        this.f58959h = null;
        this.f58960i = null;
        this.f58968q = -3.4028235E38f;
        this.f58969r = Float.MAX_VALUE;
        this.f58973v = 1;
        this.f58927B = true;
        this.f58932G = -1;
        this.f58941P = true;
        this.f58952b0 = new c();
        this.f58954c0 = 0;
        u(context, attributeSet);
    }

    private float G(float f10, float f11) {
        float height = f11 / getHeight();
        float width = f10 / getWidth();
        float fD = 0.0f;
        if (androidx.core.widget.f.b(this.f58939N) != 0.0f) {
            fD = -androidx.core.widget.f.d(this.f58939N, -width, 1.0f - height);
        } else if (androidx.core.widget.f.b(this.f58940O) != 0.0f) {
            fD = androidx.core.widget.f.d(this.f58940O, width, height);
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
            clientWidth = (int) (getClientWidth() * Math.max(this.f58968q, Math.min(fVarT.f58985e, this.f58969r)));
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
        if (Math.abs(i12) > this.f58936K && Math.abs(i11) > this.f58934I && androidx.core.widget.f.b(this.f58939N) == 0.0f && androidx.core.widget.f.b(this.f58940O) == 0.0f) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.f58957f) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i10 += (int) (f10 + f11);
        }
        if (this.f58951b.size() > 0) {
            return Math.max(this.f58951b.get(0).f58982b, Math.min(i10, this.f58951b.get(r4.size() - 1).f58982b));
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
            f10 = this.f58964m / clientWidth;
        } else {
            f10 = 0.0f;
        }
        int i11 = 0;
        boolean z10 = true;
        f fVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f58951b.size()) {
            f fVar2 = this.f58951b.get(i11);
            if (!z10 && fVar2.f58982b != (i10 = i12 + 1)) {
                fVar2 = this.f58953c;
                fVar2.f58985e = f11 + f12 + f10;
                fVar2.f58982b = i10;
                fVar2.f58984d = this.f58956e.g(i10);
                i11--;
            }
            f fVar3 = fVar2;
            f11 = fVar3.f58985e;
            float f13 = fVar3.f58984d + f11 + f10;
            if (!z10 && scrollX < f11) {
                break;
            }
            if (scrollX >= f13 && i11 != this.f58951b.size() - 1) {
                int i13 = fVar3.f58982b;
                float f14 = fVar3.f58984d;
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
        if (motionEvent.getPointerId(actionIndex) == this.f58932G) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f58928C = motionEvent.getX(i10);
            this.f58932G = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f58933H;
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
        Scroller scroller = this.f58961j;
        if (scroller != null && !scroller.isFinished()) {
            if (this.f58962k) {
                scrollX = this.f58961j.getCurrX();
            } else {
                scrollX = this.f58961j.getStartX();
            }
            this.f58961j.abortAnimation();
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
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.f58956e.g(this.f58957f)) + this.f58964m)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f58962k = false;
        this.f58961j.startScroll(i13, scrollY, i14, i15, iMin);
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
                if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f58982b == this.f58957f) {
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
        boolean zV = gVar.f58986a | v(view);
        gVar.f58986a = zV;
        if (this.f58970s) {
            if (!zV) {
                gVar.f58989d = true;
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
            android.graphics.Rect r2 = r4.f58955d
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f58955d
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
            android.graphics.Rect r2 = r4.f58955d
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f58955d
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
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f58982b == this.f58957f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f58956e) == null || aVar.d() <= 1)) {
            this.f58939N.finish();
            this.f58940O.finish();
        } else {
            if (!this.f58939N.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f58968q * width);
                this.f58939N.setSize(height, width);
                zDraw = this.f58939N.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f58940O.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f58969r + 1.0f)) * width2);
                this.f58940O.setSize(height2, width2);
                zDraw |= this.f58940O.draw(canvas);
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
        Drawable drawable = this.f58965n;
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
        this.f58941P = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        float f10;
        int action = motionEvent.getAction() & l3.f92484c;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f58974w) {
                    return true;
                }
                if (this.f58975x) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        y(motionEvent);
                    }
                } else {
                    int i10 = this.f58932G;
                    if (i10 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float f11 = x10 - this.f58928C;
                        float fAbs = Math.abs(f11);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y10 - this.f58931F);
                        if (f11 != 0.0f && !w(this.f58928C, f11) && f(this, false, (int) f11, (int) x10, (int) y10)) {
                            this.f58928C = x10;
                            this.f58929D = y10;
                            this.f58975x = true;
                            return false;
                        }
                        int i11 = this.f58926A;
                        if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                            this.f58974w = true;
                            K(true);
                            setScrollState(1);
                            if (f11 > 0.0f) {
                                f10 = this.f58930E + this.f58926A;
                            } else {
                                f10 = this.f58930E - this.f58926A;
                            }
                            this.f58928C = f10;
                            this.f58929D = y10;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > i11) {
                            this.f58975x = true;
                        }
                        if (this.f58974w && C(x10, y10)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.f58930E = x11;
                this.f58928C = x11;
                float y11 = motionEvent.getY();
                this.f58931F = y11;
                this.f58929D = y11;
                this.f58932G = motionEvent.getPointerId(0);
                this.f58975x = false;
                this.f58962k = true;
                this.f58961j.computeScrollOffset();
                if (this.f58954c0 == 2 && Math.abs(this.f58961j.getFinalX() - this.f58961j.getCurrX()) > this.f58937L) {
                    this.f58961j.abortAnimation();
                    this.f58972u = false;
                    D();
                    this.f58974w = true;
                    K(true);
                    setScrollState(1);
                } else if (androidx.core.widget.f.b(this.f58939N) == 0.0f && androidx.core.widget.f.b(this.f58940O) == 0.0f) {
                    g(false);
                    this.f58974w = false;
                } else {
                    this.f58974w = true;
                    setScrollState(1);
                    if (androidx.core.widget.f.b(this.f58939N) != 0.0f) {
                        androidx.core.widget.f.d(this.f58939N, 0.0f, 1.0f - (this.f58929D / getHeight()));
                    }
                    if (androidx.core.widget.f.b(this.f58940O) != 0.0f) {
                        androidx.core.widget.f.d(this.f58940O, 0.0f, this.f58929D / getHeight());
                    }
                }
            }
            if (this.f58933H == null) {
                this.f58933H = VelocityTracker.obtain();
            }
            this.f58933H.addMovement(motionEvent);
            return this.f58974w;
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
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f58982b == this.f58957f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f58994c = this.f58957f;
        androidx.viewpager.widget.a aVar = this.f58956e;
        if (aVar != null) {
            lVar.f58995d = aVar.m();
        }
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f58964m;
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
        if (!super.verifyDrawable(drawable) && drawable != this.f58965n) {
            return false;
        }
        return true;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(Z1.b.e(getContext(), i10));
    }
}
