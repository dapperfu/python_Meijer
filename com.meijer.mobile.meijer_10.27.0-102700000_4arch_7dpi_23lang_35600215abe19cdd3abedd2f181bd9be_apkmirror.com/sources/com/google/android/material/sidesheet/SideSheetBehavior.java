package com.google.android.material.sidesheet;

import ae.j;
import ae.k;
import ae.l;
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
import androidx.view.C5614b;
import be.C6230a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import h2.C14329a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ne.InterfaceC15792b;
import ne.h;
import oe.C16026c;
import p2.r;
import q2.InterfaceC16438B;
import q2.y;
import re.C16760h;
import re.C16765m;
import w2.AbstractC17751a;
import x2.C17994c;

/* loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements InterfaceC15792b {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.d f87362a;

    /* renamed from: b, reason: collision with root package name */
    private float f87363b;

    /* renamed from: c, reason: collision with root package name */
    private C16760h f87364c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f87365d;

    /* renamed from: e, reason: collision with root package name */
    private C16765m f87366e;

    /* renamed from: f, reason: collision with root package name */
    private final SideSheetBehavior<V>.d f87367f;

    /* renamed from: g, reason: collision with root package name */
    private float f87368g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f87369h;

    /* renamed from: i, reason: collision with root package name */
    private int f87370i;

    /* renamed from: j, reason: collision with root package name */
    private int f87371j;

    /* renamed from: k, reason: collision with root package name */
    private C17994c f87372k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87373l;

    /* renamed from: m, reason: collision with root package name */
    private float f87374m;

    /* renamed from: n, reason: collision with root package name */
    private int f87375n;

    /* renamed from: o, reason: collision with root package name */
    private int f87376o;

    /* renamed from: p, reason: collision with root package name */
    private int f87377p;

    /* renamed from: q, reason: collision with root package name */
    private int f87378q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference<V> f87379r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference<View> f87380s;

    /* renamed from: t, reason: collision with root package name */
    private int f87381t;

    /* renamed from: u, reason: collision with root package name */
    private VelocityTracker f87382u;

    /* renamed from: v, reason: collision with root package name */
    private h f87383v;

    /* renamed from: w, reason: collision with root package name */
    private int f87384w;

    /* renamed from: x, reason: collision with root package name */
    private final Set<g> f87385x;

    /* renamed from: y, reason: collision with root package name */
    private final C17994c.d f87386y;

    /* renamed from: z, reason: collision with root package name */
    private static final int f87361z = j.f44746E;

    /* renamed from: A, reason: collision with root package name */
    private static final int f87360A = k.f44805u;

    class a extends C17994c.d {
        @Override // x2.C17994c.d
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f87369h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        a() {
        }

        @Override // x2.C17994c.d
        public int a(View view, int i10, int i11) {
            return C14329a.b(i10, SideSheetBehavior.this.f87362a.g(), SideSheetBehavior.this.f87362a.f());
        }

        @Override // x2.C17994c.d
        public int d(View view) {
            return SideSheetBehavior.this.f87375n + SideSheetBehavior.this.k0();
        }

        @Override // x2.C17994c.d
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f87362a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // x2.C17994c.d
        public void l(View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // x2.C17994c.d
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f87370i == 1 || SideSheetBehavior.this.f87379r == null || SideSheetBehavior.this.f87379r.get() != view) ? false : true;
        }

        @Override // x2.C17994c.d
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
            if (SideSheetBehavior.this.f87379r == null || SideSheetBehavior.this.f87379r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f87379r.get()).requestLayout();
        }
    }

    class d {

        /* renamed from: a, reason: collision with root package name */
        private int f87390a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f87391b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f87392c = new Runnable() { // from class: com.google.android.material.sidesheet.f
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(this.f87396a);
            }
        };

        public static /* synthetic */ void a(d dVar) {
            dVar.f87391b = false;
            if (SideSheetBehavior.this.f87372k != null && SideSheetBehavior.this.f87372k.n(true)) {
                dVar.b(dVar.f87390a);
            } else if (SideSheetBehavior.this.f87370i == 2) {
                SideSheetBehavior.this.G0(dVar.f87390a);
            }
        }

        d() {
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f87379r == null || SideSheetBehavior.this.f87379r.get() == null) {
                return;
            }
            this.f87390a = i10;
            if (this.f87391b) {
                return;
            }
            ViewCompat.e0((View) SideSheetBehavior.this.f87379r.get(), this.f87392c);
            this.f87391b = true;
        }
    }

    public SideSheetBehavior() {
        this.f87367f = new d();
        this.f87369h = true;
        this.f87370i = 5;
        this.f87371j = 5;
        this.f87374m = 0.1f;
        this.f87381t = -1;
        this.f87385x = new LinkedHashSet();
        this.f87386y = new a();
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
        WeakReference<V> weakReference = this.f87379r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0(this.f87379r.get(), new Runnable() { // from class: se.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f160430a, i10);
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
            return this.f87362a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int o0() {
        return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    protected static class c extends AbstractC17751a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f87389c;

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
            this.f87389c = parcel.readInt();
        }

        public c(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f87389c = ((SideSheetBehavior) sideSheetBehavior).f87370i;
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f87389c);
        }
    }

    private void D0(int i10) {
        com.google.android.material.sidesheet.d dVar = this.f87362a;
        if (dVar == null || dVar.j() != i10) {
            if (i10 == 0) {
                this.f87362a = new com.google.android.material.sidesheet.b(this);
                if (this.f87366e == null || s0()) {
                    return;
                }
                C16765m.b bVarV = this.f87366e.v();
                bVarV.H(0.0f).z(0.0f);
                O0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f87362a = new com.google.android.material.sidesheet.a(this);
                if (this.f87366e == null || r0()) {
                    return;
                }
                C16765m.b bVarV2 = this.f87366e.v();
                bVarV2.D(0.0f).v(0.0f);
                O0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private boolean H0() {
        if (this.f87372k != null) {
            return this.f87369h || this.f87370i == 1;
        }
        return false;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        V v10 = sideSheetBehavior.f87379r.get();
        if (v10 != null) {
            sideSheetBehavior.L0(v10, i10, false);
        }
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f87362a.o(marginLayoutParams, C6230a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private void M0() {
        V v10;
        WeakReference<V> weakReference = this.f87379r;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.g0(v10, 262144);
        ViewCompat.g0(v10, 1048576);
        if (this.f87370i != 5) {
            y0(v10, y.a.f156744y, 5);
        }
        if (this.f87370i != 3) {
            y0(v10, y.a.f156742w, 3);
        }
    }

    private void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f87379r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v10 = this.f87379r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f87362a.o(marginLayoutParams, (int) ((this.f87375n * v10.getScaleX()) + this.f87378q));
        viewF0.requestLayout();
    }

    private void O0(C16765m c16765m) {
        C16760h c16760h = this.f87364c;
        if (c16760h != null) {
            c16760h.setShapeAppearanceModel(c16765m);
        }
    }

    private void P0(View view) {
        int i10 = this.f87370i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, V v10) {
        int i11 = this.f87370i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f87362a.h(v10);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f87362a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f87370i);
    }

    private void X() {
        WeakReference<View> weakReference = this.f87380s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f87380s = null;
    }

    private InterfaceC16438B Y(final int i10) {
        return new InterfaceC16438B() { // from class: se.a
            @Override // q2.InterfaceC16438B
            public final boolean a(View view, InterfaceC16438B.a aVar) {
                return SideSheetBehavior.I(this.f160428a, i10, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.f87366e == null) {
            return;
        }
        C16760h c16760h = new C16760h(this.f87366e);
        this.f87364c = c16760h;
        c16760h.Q(context);
        ColorStateList colorStateList = this.f87365d;
        if (colorStateList != null) {
            this.f87364c.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f87364c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(View view, int i10) {
        if (this.f87385x.isEmpty()) {
            return;
        }
        float fB = this.f87362a.b(i10);
        Iterator<g> it = this.f87385x.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private int h0() {
        com.google.android.material.sidesheet.d dVar = this.f87362a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        V v10;
        WeakReference<V> weakReference = this.f87379r;
        if (weakReference == null || (v10 = weakReference.get()) == null || !(v10.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v10.getLayoutParams();
    }

    private boolean u0(float f10) {
        return this.f87362a.k(f10);
    }

    private void x0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f87380s != null || (i10 = this.f87381t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f87380s = new WeakReference<>(viewFindViewById);
    }

    private void z0() {
        VelocityTracker velocityTracker = this.f87382u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f87382u = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, v10, cVar.a());
        }
        int i10 = cVar.f87389c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f87370i = i10;
        this.f87371j = i10;
    }

    public void B0(int i10) {
        this.f87381t = i10;
        X();
        WeakReference<V> weakReference = this.f87379r;
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
        this.f87369h = z10;
    }

    void G0(int i10) {
        V v10;
        if (this.f87370i == i10) {
            return;
        }
        this.f87370i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f87371j = i10;
        }
        WeakReference<V> weakReference = this.f87379r;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        P0(v10);
        Iterator<g> it = this.f87385x.iterator();
        while (it.hasNext()) {
            it.next().a(v10, i10);
        }
        M0();
    }

    boolean I0(View view, float f10) {
        return this.f87362a.n(view, f10);
    }

    @Override // ne.InterfaceC15792b
    public void a() {
        h hVar = this.f87383v;
        if (hVar == null) {
            return;
        }
        hVar.f();
    }

    @Override // ne.InterfaceC15792b
    public void b(C5614b c5614b) {
        h hVar = this.f87383v;
        if (hVar == null) {
            return;
        }
        hVar.j(c5614b);
    }

    @Override // ne.InterfaceC15792b
    public void c(C5614b c5614b) {
        h hVar = this.f87383v;
        if (hVar == null) {
            return;
        }
        hVar.l(c5614b, h0());
        N0();
    }

    @Override // ne.InterfaceC15792b
    public void d() {
        h hVar = this.f87383v;
        if (hVar == null) {
            return;
        }
        C5614b c5614bC = hVar.c();
        if (c5614bC == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f87383v.h(c5614bC, h0(), new b(), e0());
        }
    }

    int d0() {
        return this.f87375n;
    }

    public View f0() {
        WeakReference<View> weakReference = this.f87380s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f87362a.d();
    }

    public float i0() {
        return this.f87374m;
    }

    int k0() {
        return this.f87378q;
    }

    int m0() {
        return this.f87377p;
    }

    int n0() {
        return this.f87376o;
    }

    C17994c p0() {
        return this.f87372k;
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
        if (r.b(((CoordinatorLayout.f) v10.getLayoutParams()).f53633c, i10) == 3) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        D0(i11);
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, InterfaceC16438B.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    private boolean J0(V v10) {
        if ((v10.isShown() || ViewCompat.o(v10) != null) && this.f87369h) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (w0(view, i10, z10)) {
            G0(2);
            this.f87367f.b(i10);
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
            if (!this.f87362a.m(f10, f11) && !this.f87362a.l(view)) {
                return 3;
            }
            return 5;
        }
        if (f10 != 0.0f && e.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        if (Math.abs(left - g0()) < Math.abs(left - this.f87362a.e())) {
            return 3;
        }
        return 5;
    }

    private void b0(View view) {
        if (ViewCompat.o(view) == null) {
            ViewCompat.p0(view, view.getResources().getString(f87361z));
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
        final int iC = this.f87362a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: se.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f160432a, marginLayoutParams, iC, viewF0, valueAnimator);
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
        if (!H0() || V(this.f87384w, motionEvent.getX()) <= this.f87372k.A()) {
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
        C17994c c17994cP0 = p0();
        if (c17994cP0 != null) {
            if (z10) {
                if (c17994cP0.Q(iL0, view.getTop())) {
                    return true;
                }
                return false;
            }
            if (c17994cP0.S(view, iL0, view.getTop())) {
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
        if (this.f87370i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f87372k.G(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f87382u == null) {
            this.f87382u = VelocityTracker.obtain();
        }
        this.f87382u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f87373l && t0(motionEvent)) {
            this.f87372k.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f87373l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f87379r = null;
        this.f87372k = null;
        this.f87383v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f87379r = null;
        this.f87372k = null;
        this.f87383v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        C17994c c17994c;
        if (!J0(v10)) {
            this.f87373l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f87382u == null) {
            this.f87382u = VelocityTracker.obtain();
        }
        this.f87382u.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f87373l) {
                this.f87373l = false;
                return false;
            }
        } else {
            this.f87384w = (int) motionEvent.getX();
        }
        if (!this.f87373l && (c17994c = this.f87372k) != null && c17994c.R(motionEvent)) {
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
        if (this.f87379r == null) {
            this.f87379r = new WeakReference<>(v10);
            this.f87383v = new h(v10);
            C16760h c16760h = this.f87364c;
            if (c16760h != null) {
                ViewCompat.q0(v10, c16760h);
                C16760h c16760h2 = this.f87364c;
                float fU = this.f87368g;
                if (fU == -1.0f) {
                    fU = ViewCompat.u(v10);
                }
                c16760h2.a0(fU);
            } else {
                ColorStateList colorStateList = this.f87365d;
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
        if (this.f87372k == null) {
            this.f87372k = C17994c.p(coordinatorLayout, this.f87386y);
        }
        int iH = this.f87362a.h(v10);
        coordinatorLayout.K(v10, i10);
        this.f87376o = coordinatorLayout.getWidth();
        this.f87377p = this.f87362a.i(coordinatorLayout);
        this.f87375n = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        if (marginLayoutParams != null) {
            iA = this.f87362a.a(marginLayoutParams);
        } else {
            iA = 0;
        }
        this.f87378q = iA;
        ViewCompat.X(v10, U(iH, v10));
        x0(coordinatorLayout);
        for (g gVar : this.f87385x) {
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
        this.f87367f = new d();
        this.f87369h = true;
        this.f87370i = 5;
        this.f87371j = 5;
        this.f87374m = 0.1f;
        this.f87381t = -1;
        this.f87385x = new LinkedHashSet();
        this.f87386y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f45085X6);
        if (typedArrayObtainStyledAttributes.hasValue(l.f45107Z6)) {
            this.f87365d = C16026c.a(context, typedArrayObtainStyledAttributes, l.f45107Z6);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f45143c7)) {
            this.f87366e = C16765m.e(context, attributeSet, 0, f87360A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f45131b7)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(l.f45131b7, -1));
        }
        Z(context);
        this.f87368g = typedArrayObtainStyledAttributes.getDimension(l.f45096Y6, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(l.f45119a7, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f87363b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
