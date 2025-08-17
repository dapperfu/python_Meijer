package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import d2.C13462a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2.E;
import p2.F;
import p2.G;
import p2.InterfaceC16198D;
import p2.r;
import w2.AbstractC17751a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC16198D, E, FSDispatchDraw {

    /* renamed from: t, reason: collision with root package name */
    static final String f53605t;

    /* renamed from: u, reason: collision with root package name */
    static final Class<?>[] f53606u;

    /* renamed from: v, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f53607v;

    /* renamed from: w, reason: collision with root package name */
    static final Comparator<View> f53608w;

    /* renamed from: x, reason: collision with root package name */
    private static final o2.f<Rect> f53609x;

    /* renamed from: a, reason: collision with root package name */
    private final List<View> f53610a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f53611b;

    /* renamed from: c, reason: collision with root package name */
    private final List<View> f53612c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f53613d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f53614e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f53615f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53616g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53617h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f53618i;

    /* renamed from: j, reason: collision with root package name */
    private View f53619j;

    /* renamed from: k, reason: collision with root package name */
    private View f53620k;

    /* renamed from: l, reason: collision with root package name */
    private g f53621l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f53622m;

    /* renamed from: n, reason: collision with root package name */
    private j f53623n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f53624o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f53625p;

    /* renamed from: q, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f53626q;

    /* renamed from: r, reason: collision with root package name */
    private G f53627r;

    /* renamed from: s, reason: collision with root package name */
    private final F f53628s;

    class a implements G {
        a() {
        }

        @Override // p2.G
        public j onApplyWindowInsets(View view, j jVar) {
            return CoordinatorLayout.this.Z(jVar);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        @Deprecated
        public boolean D(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        @Deprecated
        public void F(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public j j(CoordinatorLayout coordinatorLayout, V v10, j jVar) {
            return jVar;
        }

        public void k(f fVar) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        @Deprecated
        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void y(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        public void G(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, v10, view);
            }
        }

        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void w(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10) {
            if (h(coordinatorLayout, v10) > 0.0f) {
                return true;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f53626q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.J(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f53626q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f53631a;

        /* renamed from: b, reason: collision with root package name */
        boolean f53632b;

        /* renamed from: c, reason: collision with root package name */
        public int f53633c;

        /* renamed from: d, reason: collision with root package name */
        public int f53634d;

        /* renamed from: e, reason: collision with root package name */
        public int f53635e;

        /* renamed from: f, reason: collision with root package name */
        int f53636f;

        /* renamed from: g, reason: collision with root package name */
        public int f53637g;

        /* renamed from: h, reason: collision with root package name */
        public int f53638h;

        /* renamed from: i, reason: collision with root package name */
        int f53639i;

        /* renamed from: j, reason: collision with root package name */
        int f53640j;

        /* renamed from: k, reason: collision with root package name */
        View f53641k;

        /* renamed from: l, reason: collision with root package name */
        View f53642l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f53643m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f53644n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f53645o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f53646p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f53647q;

        /* renamed from: r, reason: collision with root package name */
        Object f53648r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f53632b = false;
            this.f53633c = 0;
            this.f53634d = 0;
            this.f53635e = -1;
            this.f53636f = -1;
            this.f53637g = 0;
            this.f53638h = 0;
            this.f53647q = new Rect();
        }

        void k() {
            this.f53646p = false;
        }

        void l(int i10) {
            r(i10, false);
        }

        void m() {
            this.f53643m = false;
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f53636f);
            this.f53641k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f53642l = null;
                    this.f53641k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f53636f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f53642l = null;
                this.f53641k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f53642l = null;
                    this.f53641k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f53642l = viewFindViewById;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f53641k.getId() != this.f53636f) {
                return false;
            }
            View view2 = this.f53641k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f53642l = null;
                    this.f53641k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f53642l = view2;
            return true;
        }

        boolean a() {
            return this.f53641k == null && this.f53636f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f53642l || s(view2, ViewCompat.z(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f53631a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f53631a == null) {
                this.f53643m = false;
            }
            return this.f53643m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f53636f == -1) {
                this.f53642l = null;
                this.f53641k = null;
                return null;
            }
            if (this.f53641k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f53641k;
        }

        public int e() {
            return this.f53636f;
        }

        public c f() {
            return this.f53631a;
        }

        boolean g() {
            return this.f53646p;
        }

        Rect h() {
            return this.f53647q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f53643m;
            if (z10) {
                return true;
            }
            c cVar = this.f53631a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f53643m = zE;
            return zE;
        }

        boolean j(int i10) {
            if (i10 == 0) {
                return this.f53644n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f53645o;
        }

        public void o(c cVar) {
            c cVar2 = this.f53631a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f53631a = cVar;
                this.f53648r = null;
                this.f53632b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        void p(boolean z10) {
            this.f53646p = z10;
        }

        void q(Rect rect) {
            this.f53647q.set(rect);
        }

        void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f53644n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f53645o = z10;
            }
        }

        private boolean s(View view, int i10) {
            int iB = r.b(((f) view.getLayoutParams()).f53637g, i10);
            if (iB != 0 && (r.b(this.f53638h, i10) & iB) == iB) {
                return true;
            }
            return false;
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53632b = false;
            this.f53633c = 0;
            this.f53634d = 0;
            this.f53635e = -1;
            this.f53636f = -1;
            this.f53637g = 0;
            this.f53638h = 0;
            this.f53647q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X1.c.f39086d);
            this.f53633c = typedArrayObtainStyledAttributes.getInteger(X1.c.f39087e, 0);
            this.f53636f = typedArrayObtainStyledAttributes.getResourceId(X1.c.f39088f, -1);
            this.f53634d = typedArrayObtainStyledAttributes.getInteger(X1.c.f39089g, 0);
            this.f53635e = typedArrayObtainStyledAttributes.getInteger(X1.c.f39093k, -1);
            this.f53637g = typedArrayObtainStyledAttributes.getInt(X1.c.f39092j, 0);
            this.f53638h = typedArrayObtainStyledAttributes.getInt(X1.c.f39091i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(X1.c.f39090h);
            this.f53632b = zHasValue;
            if (zHasValue) {
                this.f53631a = CoordinatorLayout.M(context, attributeSet, typedArrayObtainStyledAttributes.getString(X1.c.f39090h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f53631a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f53632b = false;
            this.f53633c = 0;
            this.f53634d = 0;
            this.f53635e = -1;
            this.f53636f = -1;
            this.f53637g = 0;
            this.f53638h = 0;
            this.f53647q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f53632b = false;
            this.f53633c = 0;
            this.f53634d = 0;
            this.f53635e = -1;
            this.f53636f = -1;
            this.f53637g = 0;
            this.f53638h = 0;
            this.f53647q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f53632b = false;
            this.f53633c = 0;
            this.f53634d = 0;
            this.f53635e = -1;
            this.f53636f = -1;
            this.f53637g = 0;
            this.f53638h = 0;
            this.f53647q = new Rect();
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.J(0);
            return true;
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, X1.a.f39081a);
    }

    private static int U(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int V(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int W(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    private static int d(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_4774dcc000161de84c13d383cdfdce85(canvas);
    }

    public void fsSuperDispatchDraw_4774dcc000161de84c13d383cdfdce85(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_4774dcc000161de84c13d383cdfdce85(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // p2.InterfaceC16198D
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f53615f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    protected static class h extends AbstractC17751a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        SparseArray<Parcelable> f53650c;

        class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }

            a() {
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f53650c = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f53650c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int size;
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f53650c;
            if (sparseArray != null) {
                size = sparseArray.size();
            } else {
                size = 0;
            }
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f53650c.keyAt(i11);
                parcelableArr[i11] = this.f53650c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM = ViewCompat.M(view);
            float fM2 = ViewCompat.M(view2);
            if (fM > fM2) {
                return -1;
            }
            if (fM < fM2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f53605t = r02 != null ? r02.getName() : null;
        f53608w = new i();
        f53606u = new Class[]{Context.class, AttributeSet.class};
        f53607v = new ThreadLocal<>();
        f53609x = new o2.h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i10);
        this.f53610a = new ArrayList();
        this.f53611b = new androidx.coordinatorlayout.widget.a<>();
        this.f53612c = new ArrayList();
        this.f53614e = new int[2];
        this.f53615f = new int[2];
        this.f53628s = new F(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, X1.c.f39083a, 0, X1.b.f39082a) : context.obtainStyledAttributes(attributeSet, X1.c.f39083a, i10, 0);
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            ViewCompat.k0(coordinatorLayout, context2, X1.c.f39083a, attributeSet, typedArrayObtainStyledAttributes, 0, X1.b.f39082a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            ViewCompat.k0(coordinatorLayout, context2, X1.c.f39083a, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(X1.c.f39084b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f53618i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f53618i.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.f53618i[i11] = (int) (r12[i11] * f10);
            }
        }
        coordinatorLayout.f53625p = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, X1.c.f39085c);
        typedArrayObtainStyledAttributes.recycle();
        a0();
        super.setOnHierarchyChangeListener(new e());
        if (ViewCompat.x(this) == 0) {
            ViewCompat.w0(this, 1);
        }
    }

    private boolean B(View view) {
        return this.f53611b.k(view);
    }

    private boolean N(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.o(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.H(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private void P() {
        this.f53610a.clear();
        this.f53611b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarZ = z(childAt);
            fVarZ.d(this, childAt);
            this.f53611b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarZ.b(this, childAt, childAt2)) {
                        if (!this.f53611b.d(childAt2)) {
                            this.f53611b.b(childAt2);
                        }
                        this.f53611b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f53610a.addAll(this.f53611b.j());
        Collections.reverse(this.f53610a);
    }

    private void T() {
        View view = this.f53619j;
        if (view != null) {
            c cVarF = ((f) view.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cVarF.H(this, this.f53619j, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f53619j = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).m();
        }
        this.f53616g = false;
    }

    private static Rect a() {
        Rect rectB = f53609x.b();
        return rectB == null ? new Rect() : rectB;
    }

    private void w(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iB = r.b(U(fVar.f53633c), i10);
        int iB2 = r.b(V(fVar.f53634d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        int iWidth = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int x(int i10) {
        int[] iArr = this.f53618i;
        if (iArr == null) {
            FS.log_e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        FS.log_e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void J(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.J(int):void");
    }

    void S() {
        if (this.f53617h && this.f53621l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f53621l);
        }
        this.f53622m = false;
    }

    final j Z(j jVar) {
        if (o2.c.a(this.f53623n, jVar)) {
            return jVar;
        }
        this.f53623n = jVar;
        boolean z10 = false;
        boolean z11 = jVar != null && jVar.m() > 0;
        this.f53624o = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        j jVarF = f(jVar);
        requestLayout();
        return jVarF;
    }

    void b() {
        if (this.f53617h) {
            if (this.f53621l == null) {
                this.f53621l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f53621l);
        }
        this.f53622m = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r2.f53631a
            if (r3 == 0) goto L8f
            float r3 = r3.h(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8f
            android.graphics.Paint r4 = r0.f53613d
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.f53613d = r4
        L22:
            android.graphics.Paint r4 = r0.f53613d
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f53631a
            int r2 = r2.g(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.f53613d
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r3 = d(r3, r4, r5)
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L65
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L65:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.f53613d
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L91
        L8f:
            r4 = r17
        L91:
            boolean r1 = r16.fsSuperDrawChild_4774dcc000161de84c13d383cdfdce85(r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public void g(View view) {
        ArrayList<View> arrayListH = this.f53611b.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayListH.size(); i10++) {
            View view2 = arrayListH.get(i10);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.l(this, view2, view);
            }
        }
    }

    public final j getLastWindowInsets() {
        return this.f53623n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f53628s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f53625p;
    }

    @Override // p2.InterfaceC16198D
    public void i(View view, View view2, int i10, int i11) {
        c cVarF;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f53628s.c(view, view2, i10, i11);
        this.f53620k = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (cVarF = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarF.z(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // p2.InterfaceC16198D
    public void j(View view, int i10) {
        this.f53628s.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.G(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f53620k = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // p2.E
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f53614e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, this.f53614e[0]) : Math.min(iMax, this.f53614e[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, this.f53614e[1]) : Math.min(iMax2, this.f53614e[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            J(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f53650c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = z(childAt).f();
            if (id2 != -1 && cVarF != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVarF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && cVarF != null && (parcelableC = cVarF.C(this, childAt)) != null) {
                sparseArray.append(id2, parcelableC);
            }
        }
        hVar.f53650c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public List<View> s(View view) {
        List<View> listI = this.f53611b.i(view);
        return listI == null ? Collections.EMPTY_LIST : listI;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f53626q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f53625p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f53625p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f53625p.setState(getDrawableState());
                }
                C13462a.m(this.f53625p, ViewCompat.z(this));
                this.f53625p.setVisible(getVisibility() == 0, false);
                this.f53625p.setCallback(this);
            }
            ViewCompat.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? Z1.b.e(getContext(), i10) : null);
    }

    public List<View> t(View view) {
        List<View> listG = this.f53611b.g(view);
        return listG == null ? Collections.EMPTY_LIST : listG;
    }

    private void A(List<View> list) {
        int childDrawingOrder;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            if (zIsChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i10);
            } else {
                childDrawingOrder = i10;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        Comparator<View> comparator = f53608w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private void D(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f53623n != null && ViewCompat.w(this) && !ViewCompat.w(view)) {
            rectA.left += this.f53623n.k();
            rectA.top += this.f53623n.m();
            rectA.right -= this.f53623n.l();
            rectA.bottom -= this.f53623n.j();
        }
        Rect rectA2 = a();
        r.a(V(fVar.f53633c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        R(rectA);
        R(rectA2);
    }

    private void E(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            u(view2, rectA);
            v(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            R(rectA);
            R(rectA2);
        }
    }

    private void F(View view, int i10, int i11) {
        int i12;
        f fVar = (f) view.getLayoutParams();
        int iB = r.b(W(fVar.f53633c), i11);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iX = x(i10) - measuredWidth;
        if (i13 != 1) {
            if (i13 == 5) {
                iX += measuredWidth;
            }
        } else {
            iX += measuredWidth / 2;
        }
        if (i14 != 16) {
            if (i14 != 80) {
                i12 = 0;
            } else {
                i12 = measuredHeight;
            }
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iX, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent G(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void H(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (ViewCompat.S(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF != null && cVarF.f(this, view, rectA)) {
                if (!rectA2.contains(rectA)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
                }
            } else {
                rectA.set(rectA2);
            }
            R(rectA2);
            if (rectA.isEmpty()) {
                R(rectA);
                return;
            }
            int iB = r.b(fVar.f53638h, i10);
            boolean z12 = true;
            if ((iB & 48) == 48 && (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f53640j) < (i16 = rect.top)) {
                Y(view, i16 - i15);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f53640j) < (i14 = rect.bottom)) {
                Y(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                Y(view, 0);
            }
            if ((iB & 3) == 3 && (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f53639i) < (i13 = rect.left)) {
                X(view, i13 - i12);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((iB & 5) == 5 && (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f53639i) < (i11 = rect.right)) {
                X(view, width - i11);
            } else {
                z12 = z11;
            }
            if (!z12) {
                X(view, 0);
            }
            R(rectA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c M(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f53605t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f53607v;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f53606u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean O(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f53612c;
        A(list);
        int size = list.size();
        MotionEvent motionEventG = null;
        boolean zN = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if ((zN || z10) && actionMasked != 0) {
                if (cVarF != null) {
                    if (motionEventG == null) {
                        motionEventG = G(motionEvent);
                    }
                    N(cVarF, view, motionEventG, i10);
                }
            } else {
                if (!z10 && !zN && cVarF != null && (zN = N(cVarF, view, motionEvent, i10))) {
                    this.f53619j = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view2 = list.get(i12);
                            c cVarF2 = ((f) view2.getLayoutParams()).f();
                            if (cVarF2 != null) {
                                if (motionEventG == null) {
                                    motionEventG = G(motionEvent);
                                }
                                N(cVarF2, view2, motionEventG, i10);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                if (zI && !zC) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zI && !z10) {
                    break;
                }
            }
        }
        list.clear();
        if (motionEventG != null) {
            motionEventG.recycle();
        }
        return zN;
    }

    private static void R(Rect rect) {
        rect.setEmpty();
        f53609x.a(rect);
    }

    private void X(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f53639i;
        if (i11 != i10) {
            ViewCompat.X(view, i10 - i11);
            fVar.f53639i = i10;
        }
    }

    private void Y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f53640j;
        if (i11 != i10) {
            ViewCompat.Y(view, i10 - i11);
            fVar.f53640j = i10;
        }
    }

    private void a0() {
        if (ViewCompat.w(this)) {
            if (this.f53627r == null) {
                this.f53627r = new a();
            }
            ViewCompat.A0(this, this.f53627r);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.A0(this, null);
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                cVarF.o(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private void e(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private j f(j jVar) {
        c cVarF;
        if (jVar.s()) {
            return jVar;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (ViewCompat.w(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                jVar = cVarF.j(this, childAt, jVar);
                if (jVar.s()) {
                    return jVar;
                }
            }
        }
        return jVar;
    }

    public boolean C(View view, int i10, int i11) {
        Rect rectA = a();
        u(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            R(rectA);
        }
    }

    void I(View view, int i10) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f53641k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            u(fVar.f53641k, rectA);
            boolean z10 = false;
            r(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            if (rectA3.left != rectA2.left || rectA3.top != rectA2.top) {
                z10 = true;
            }
            e(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                ViewCompat.X(view, i11);
            }
            if (i12 != 0) {
                ViewCompat.Y(view, i12);
            }
            if (z10 && (cVarF = fVar.f()) != null) {
                cVarF.l(this, view, fVar.f53641k);
            }
            R(rectA);
            R(rectA2);
            R(rectA3);
        }
    }

    public void K(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f53641k;
            if (view2 != null) {
                E(view, view2, i10);
                return;
            }
            int i11 = fVar.f53635e;
            if (i11 >= 0) {
                F(view, i11, i10);
                return;
            } else {
                D(view, i10);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void L(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void Q(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f53625p;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        if (state) {
            invalidate();
        }
    }

    final List<View> getDependencySortedChildren() {
        P();
        return Collections.unmodifiableList(this.f53610a);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    void h() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (B(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f53622m) {
            if (z10) {
                b();
            } else {
                S();
            }
        }
    }

    @Override // p2.InterfaceC16198D
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarF;
        int iMin;
        int iMin2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f53614e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.u(this, childAt, view, i10, i11, iArr2, i12);
                    if (i10 > 0) {
                        iMin = Math.max(i13, this.f53614e[0]);
                    } else {
                        iMin = Math.min(i13, this.f53614e[0]);
                    }
                    i13 = iMin;
                    if (i11 > 0) {
                        iMin2 = Math.max(i14, this.f53614e[1]);
                    } else {
                        iMin2 = Math.min(i14, this.f53614e[1]);
                    }
                    i14 = iMin2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            J(1);
        }
    }

    @Override // p2.InterfaceC16198D
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zE = cVarF.E(this, childAt, view, view2, i10, i11);
                    z10 |= zE;
                    fVar.r(i11, zE);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
        if (this.f53622m) {
            if (this.f53621l == null) {
                this.f53621l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f53621l);
        }
        if (this.f53623n == null && ViewCompat.w(this)) {
            ViewCompat.j0(this);
        }
        this.f53617h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T();
        if (this.f53622m && this.f53621l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f53621l);
        }
        View view = this.f53620k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f53617h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int iM;
        super.onDraw(canvas);
        if (this.f53624o && this.f53625p != null) {
            j jVar = this.f53623n;
            if (jVar != null) {
                iM = jVar.m();
            } else {
                iM = 0;
            }
            if (iM > 0) {
                this.f53625p.setBounds(0, 0, getWidth(), iM);
                this.f53625p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        boolean zO = O(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zO;
        }
        this.f53619j = null;
        T();
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarF;
        int iZ = ViewCompat.z(this);
        int size = this.f53610a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f53610a.get(i14);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.p(this, view, iZ))) {
                K(view, iZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3f
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            boolean r5 = r4.j(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r12 = r4.r(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r12
        L38:
            int r2 = r2 + 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L3f:
            r5 = r11
            if (r3 == 0) goto L46
            r12 = 1
            r11.J(r12)
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3b
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L19
        L15:
            r7 = r11
            r8 = r12
            r9 = r13
            goto L35
        L19:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            boolean r5 = r4.j(r1)
            if (r5 != 0) goto L26
            goto L15
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r4.s(r5, r6, r7, r8, r9)
            r3 = r3 | r11
        L35:
            int r2 = r2 + 1
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zO;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f53619j;
        boolean z10 = false;
        if (view != null) {
            c cVarF = ((f) view.getLayoutParams()).f();
            zO = cVarF != null ? cVarF.H(this, this.f53619j, motionEvent) : false;
        } else {
            zO = O(motionEvent, 1);
            if (actionMasked != 0 && zO) {
                z10 = true;
            }
        }
        if (this.f53619j != null && actionMasked != 3) {
            if (z10) {
                MotionEvent motionEventG = G(motionEvent);
                super.onTouchEvent(motionEventG);
                motionEventG.recycle();
            }
        } else {
            zO |= super.onTouchEvent(motionEvent);
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zO;
        }
        this.f53619j = null;
        T();
        return zO;
    }

    void r(View view, boolean z10, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                u(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF != null && cVarF.A(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f53616g) {
            if (this.f53619j == null) {
                c();
            }
            T();
            this.f53616g = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        a0();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f53625p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f53625p.setVisible(z10, false);
        }
    }

    void u(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void v(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f53625p) {
            return false;
        }
        return true;
    }

    void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f53632b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    FS.log_e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f53632b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    FS.log_e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.f53632b = true;
        }
        return fVar;
    }
}
