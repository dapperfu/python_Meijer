package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.view.C5756b;
import ce.j;
import ce.k;
import ce.l;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import de.C13661a;
import h2.C14442a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p2.r;
import pe.InterfaceC16420b;
import pe.h;
import q2.InterfaceC16593B;
import q2.y;
import qe.C16634c;
import te.C17234h;
import te.C17239m;
import w2.AbstractC17821a;
import x2.C18060c;

/* loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements InterfaceC16420b {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.d f88202a;

    /* renamed from: b, reason: collision with root package name */
    private float f88203b;

    /* renamed from: c, reason: collision with root package name */
    private C17234h f88204c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f88205d;

    /* renamed from: e, reason: collision with root package name */
    private C17239m f88206e;

    /* renamed from: f, reason: collision with root package name */
    private final SideSheetBehavior<V>.d f88207f;

    /* renamed from: g, reason: collision with root package name */
    private float f88208g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f88209h;

    /* renamed from: i, reason: collision with root package name */
    private int f88210i;

    /* renamed from: j, reason: collision with root package name */
    private int f88211j;

    /* renamed from: k, reason: collision with root package name */
    private C18060c f88212k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f88213l;

    /* renamed from: m, reason: collision with root package name */
    private float f88214m;

    /* renamed from: n, reason: collision with root package name */
    private int f88215n;

    /* renamed from: o, reason: collision with root package name */
    private int f88216o;

    /* renamed from: p, reason: collision with root package name */
    private int f88217p;

    /* renamed from: q, reason: collision with root package name */
    private int f88218q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference<V> f88219r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference<View> f88220s;

    /* renamed from: t, reason: collision with root package name */
    private int f88221t;

    /* renamed from: u, reason: collision with root package name */
    private VelocityTracker f88222u;

    /* renamed from: v, reason: collision with root package name */
    private h f88223v;

    /* renamed from: w, reason: collision with root package name */
    private int f88224w;

    /* renamed from: x, reason: collision with root package name */
    private final Set<g> f88225x;

    /* renamed from: y, reason: collision with root package name */
    private final C18060c.d f88226y;

    /* renamed from: z, reason: collision with root package name */
    private static final int f88201z = j.f61761E;

    /* renamed from: A, reason: collision with root package name */
    private static final int f88200A = k.f61820u;

    class a extends C18060c.d {
        @Override // x2.C18060c.d
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f88209h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        a() {
        }

        @Override // x2.C18060c.d
        public int a(View view, int i10, int i11) {
            return C14442a.b(i10, SideSheetBehavior.this.f88202a.g(), SideSheetBehavior.this.f88202a.f());
        }

        @Override // x2.C18060c.d
        public int d(View view) {
            return SideSheetBehavior.this.f88215n + SideSheetBehavior.this.k0();
        }

        @Override // x2.C18060c.d
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f88202a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // x2.C18060c.d
        public void l(View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // x2.C18060c.d
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f88210i == 1 || SideSheetBehavior.this.f88219r == null || SideSheetBehavior.this.f88219r.get() != view) ? false : true;
        }

        @Override // x2.C18060c.d
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f88219r == null || SideSheetBehavior.this.f88219r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f88219r.get()).requestLayout();
        }
    }

    class d {

        /* renamed from: a, reason: collision with root package name */
        private int f88230a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f88231b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f88232c = new Runnable() { // from class: com.google.android.material.sidesheet.f
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(this.f88236a);
            }
        };

        public static /* synthetic */ void a(d dVar) {
            dVar.f88231b = false;
            if (SideSheetBehavior.this.f88212k != null && SideSheetBehavior.this.f88212k.n(true)) {
                dVar.b(dVar.f88230a);
            } else if (SideSheetBehavior.this.f88210i == 2) {
                SideSheetBehavior.this.G0(dVar.f88230a);
            }
        }

        d() {
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f88219r == null || SideSheetBehavior.this.f88219r.get() == null) {
                return;
            }
            this.f88230a = i10;
            if (this.f88231b) {
                return;
            }
            ViewCompat.e0((View) SideSheetBehavior.this.f88219r.get(), this.f88232c);
            this.f88231b = true;
        }
    }

    public SideSheetBehavior() {
        this.f88207f = new d();
        this.f88209h = true;
        this.f88210i = 5;
        this.f88211j = 5;
        this.f88214m = 0.1f;
        this.f88221t = -1;
        this.f88225x = new LinkedHashSet();
        this.f88226y = new a();
    }

    private float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    private void y0(V v10, y.a aVar, int i10) {
        ViewCompat.i0(v10, aVar, null, Y(i10));
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f88219r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0(this.f88219r.get(), new Runnable() { // from class: ue.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f163916a, i10);
                }
            });
        }
    }

    public boolean K0() {
        return true;
    }

    float j0() {
        return 0.5f;
    }

    int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f88202a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int o0() {
        return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    protected static class c extends AbstractC17821a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f88229c;

        class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }

            a() {
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f88229c = parcel.readInt();
        }

        public c(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f88229c = ((SideSheetBehavior) sideSheetBehavior).f88210i;
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f88229c);
        }
    }

    private void D0(int i10) {
        com.google.android.material.sidesheet.d dVar = this.f88202a;
        if (dVar == null || dVar.j() != i10) {
            if (i10 == 0) {
                this.f88202a = new com.google.android.material.sidesheet.b(this);
                if (this.f88206e == null || s0()) {
                    return;
                }
                C17239m.b bVarV = this.f88206e.v();
                bVarV.H(0.0f).z(0.0f);
                O0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f88202a = new com.google.android.material.sidesheet.a(this);
                if (this.f88206e == null || r0()) {
                    return;
                }
                C17239m.b bVarV2 = this.f88206e.v();
                bVarV2.D(0.0f).v(0.0f);
                O0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private boolean H0() {
        if (this.f88212k != null) {
            return this.f88209h || this.f88210i == 1;
        }
        return false;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        V v10 = sideSheetBehavior.f88219r.get();
        if (v10 != null) {
            sideSheetBehavior.L0(v10, i10, false);
        }
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f88202a.o(marginLayoutParams, C13661a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private void M0() {
        V v10;
        WeakReference<V> weakReference = this.f88219r;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.g0(v10, 262144);
        ViewCompat.g0(v10, 1048576);
        if (this.f88210i != 5) {
            y0(v10, y.a.f157857y, 5);
        }
        if (this.f88210i != 3) {
            y0(v10, y.a.f157855w, 3);
        }
    }

    private void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f88219r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v10 = this.f88219r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f88202a.o(marginLayoutParams, (int) ((this.f88215n * v10.getScaleX()) + this.f88218q));
        viewF0.requestLayout();
    }

    private void O0(C17239m c17239m) {
        C17234h c17234h = this.f88204c;
        if (c17234h != null) {
            c17234h.setShapeAppearanceModel(c17239m);
        }
    }

    private void P0(View view) {
        int i10 = this.f88210i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, V v10) {
        int i11 = this.f88210i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f88202a.h(v10);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f88202a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f88210i);
    }

    private void X() {
        WeakReference<View> weakReference = this.f88220s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f88220s = null;
    }

    private InterfaceC16593B Y(final int i10) {
        return new InterfaceC16593B() { // from class: ue.a
            @Override // q2.InterfaceC16593B
            public final boolean a(View view, InterfaceC16593B.a aVar) {
                return SideSheetBehavior.I(this.f163914a, i10, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.f88206e == null) {
            return;
        }
        C17234h c17234h = new C17234h(this.f88206e);
        this.f88204c = c17234h;
        c17234h.Q(context);
        ColorStateList colorStateList = this.f88205d;
        if (colorStateList != null) {
            this.f88204c.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f88204c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(View view, int i10) {
        if (this.f88225x.isEmpty()) {
            return;
        }
        float fB = this.f88202a.b(i10);
        Iterator<g> it = this.f88225x.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private int h0() {
        com.google.android.material.sidesheet.d dVar = this.f88202a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        V v10;
        WeakReference<V> weakReference = this.f88219r;
        if (weakReference == null || (v10 = weakReference.get()) == null || !(v10.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v10.getLayoutParams();
    }

    private boolean u0(float f10) {
        return this.f88202a.k(f10);
    }

    private void x0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f88220s != null || (i10 = this.f88221t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f88220s = new WeakReference<>(viewFindViewById);
    }

    private void z0() {
        VelocityTracker velocityTracker = this.f88222u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f88222u = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, v10, cVar.a());
        }
        int i10 = cVar.f88229c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f88210i = i10;
        this.f88211j = i10;
    }

    public void B0(int i10) {
        this.f88221t = i10;
        X();
        WeakReference<V> weakReference = this.f88219r;
        if (weakReference != null) {
            V v10 = weakReference.get();
            if (i10 == -1 || !ViewCompat.S(v10)) {
                return;
            }
            v10.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
        return new c(super.C(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    public void C0(boolean z10) {
        this.f88209h = z10;
    }

    void G0(int i10) {
        V v10;
        if (this.f88210i == i10) {
            return;
        }
        this.f88210i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f88211j = i10;
        }
        WeakReference<V> weakReference = this.f88219r;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        P0(v10);
        Iterator<g> it = this.f88225x.iterator();
        while (it.hasNext()) {
            it.next().a(v10, i10);
        }
        M0();
    }

    boolean I0(View view, float f10) {
        return this.f88202a.n(view, f10);
    }

    @Override // pe.InterfaceC16420b
    public void a() {
        h hVar = this.f88223v;
        if (hVar == null) {
            return;
        }
        hVar.f();
    }

    @Override // pe.InterfaceC16420b
    public void b(C5756b c5756b) {
        h hVar = this.f88223v;
        if (hVar == null) {
            return;
        }
        hVar.j(c5756b);
    }

    @Override // pe.InterfaceC16420b
    public void c(C5756b c5756b) {
        h hVar = this.f88223v;
        if (hVar == null) {
            return;
        }
        hVar.l(c5756b, h0());
        N0();
    }

    @Override // pe.InterfaceC16420b
    public void d() {
        h hVar = this.f88223v;
        if (hVar == null) {
            return;
        }
        C5756b c5756bC = hVar.c();
        if (c5756bC == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f88223v.h(c5756bC, h0(), new b(), e0());
        }
    }

    int d0() {
        return this.f88215n;
    }

    public View f0() {
        WeakReference<View> weakReference = this.f88220s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f88202a.d();
    }

    public float i0() {
        return this.f88214m;
    }

    int k0() {
        return this.f88218q;
    }

    int m0() {
        return this.f88217p;
    }

    int n0() {
        return this.f88216o;
    }

    C18060c p0() {
        return this.f88212k;
    }

    private void A0(V v10, Runnable runnable) {
        if (v0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void E0(V v10, int i10) {
        int i11;
        if (r.b(((CoordinatorLayout.f) v10.getLayoutParams()).f53857c, i10) == 3) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        D0(i11);
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, InterfaceC16593B.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    private boolean J0(V v10) {
        if ((v10.isShown() || ViewCompat.o(v10) != null) && this.f88209h) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (w0(view, i10, z10)) {
            G0(2);
            this.f88207f.b(i10);
        } else {
            G0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            if (!this.f88202a.m(f10, f11) && !this.f88202a.l(view)) {
                return 3;
            }
            return 5;
        }
        if (f10 != 0.0f && e.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        if (Math.abs(left - g0()) < Math.abs(left - this.f88202a.e())) {
            return 3;
        }
        return 5;
    }

    private void b0(View view) {
        if (ViewCompat.o(view) == null) {
            ViewCompat.p0(view, view.getResources().getString(f88201z));
        }
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    private ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f88202a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: ue.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f163918a, marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    private boolean r0() {
        CoordinatorLayout.f fVarQ0 = q0();
        if (fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).leftMargin > 0) {
            return true;
        }
        return false;
    }

    private boolean s0() {
        CoordinatorLayout.f fVarQ0 = q0();
        if (fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).rightMargin > 0) {
            return true;
        }
        return false;
    }

    private boolean t0(MotionEvent motionEvent) {
        if (!H0() || V(this.f88224w, motionEvent.getX()) <= this.f88212k.A()) {
            return false;
        }
        return true;
    }

    private boolean v0(V v10) {
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.R(v10)) {
            return true;
        }
        return false;
    }

    private boolean w0(View view, int i10, boolean z10) {
        int iL0 = l0(i10);
        C18060c c18060cP0 = p0();
        if (c18060cP0 != null) {
            if (z10) {
                if (c18060cP0.Q(iL0, view.getTop())) {
                    return true;
                }
                return false;
            }
            if (c18060cP0.S(view, iL0, view.getTop())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f88210i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f88212k.G(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f88222u == null) {
            this.f88222u = VelocityTracker.obtain();
        }
        this.f88222u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f88213l && t0(motionEvent)) {
            this.f88212k.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f88213l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f88219r = null;
        this.f88212k = null;
        this.f88223v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f88219r = null;
        this.f88212k = null;
        this.f88223v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        C18060c c18060c;
        if (!J0(v10)) {
            this.f88213l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f88222u == null) {
            this.f88222u = VelocityTracker.obtain();
        }
        this.f88222u.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f88213l) {
                this.f88213l = false;
                return false;
            }
        } else {
            this.f88224w = (int) motionEvent.getX();
        }
        if (!this.f88213l && (c18060c = this.f88212k) != null && c18060c.R(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int iA;
        if (ViewCompat.w(coordinatorLayout) && !ViewCompat.w(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f88219r == null) {
            this.f88219r = new WeakReference<>(v10);
            this.f88223v = new h(v10);
            C17234h c17234h = this.f88204c;
            if (c17234h != null) {
                ViewCompat.q0(v10, c17234h);
                C17234h c17234h2 = this.f88204c;
                float fU = this.f88208g;
                if (fU == -1.0f) {
                    fU = ViewCompat.u(v10);
                }
                c17234h2.a0(fU);
            } else {
                ColorStateList colorStateList = this.f88205d;
                if (colorStateList != null) {
                    ViewCompat.r0(v10, colorStateList);
                }
            }
            P0(v10);
            M0();
            if (ViewCompat.x(v10) == 0) {
                ViewCompat.w0(v10, 1);
            }
            b0(v10);
        }
        E0(v10, i10);
        if (this.f88212k == null) {
            this.f88212k = C18060c.p(coordinatorLayout, this.f88226y);
        }
        int iH = this.f88202a.h(v10);
        coordinatorLayout.K(v10, i10);
        this.f88216o = coordinatorLayout.getWidth();
        this.f88217p = this.f88202a.i(coordinatorLayout);
        this.f88215n = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        if (marginLayoutParams != null) {
            iA = this.f88202a.a(marginLayoutParams);
        } else {
            iA = 0;
        }
        this.f88218q = iA;
        ViewCompat.X(v10, U(iH, v10));
        x0(coordinatorLayout);
        for (g gVar : this.f88225x) {
            if (gVar instanceof g) {
                gVar.c(v10);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88207f = new d();
        this.f88209h = true;
        this.f88210i = 5;
        this.f88211j = 5;
        this.f88214m = 0.1f;
        this.f88221t = -1;
        this.f88225x = new LinkedHashSet();
        this.f88226y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f62100X6);
        if (typedArrayObtainStyledAttributes.hasValue(l.f62122Z6)) {
            this.f88205d = C16634c.a(context, typedArrayObtainStyledAttributes, l.f62122Z6);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f62158c7)) {
            this.f88206e = C17239m.e(context, attributeSet, 0, f88200A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f62146b7)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(l.f62146b7, -1));
        }
        Z(context);
        this.f88208g = typedArrayObtainStyledAttributes.getDimension(l.f62111Y6, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(l.f62134a7, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f88203b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
