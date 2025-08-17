package com.google.android.material.bottomsheet;

import ae.C5597b;
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
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.view.C5614b;
import com.fullstory.FS;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import h2.C14329a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ne.InterfaceC15792b;
import oe.C16026c;
import q2.InterfaceC16438B;
import q2.y;
import re.C16760h;
import re.C16765m;
import w2.AbstractC17751a;
import x2.C17994c;

/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements InterfaceC15792b {

    /* renamed from: i0, reason: collision with root package name */
    private static final int f86376i0 = k.f44795k;

    /* renamed from: A, reason: collision with root package name */
    private boolean f86377A;

    /* renamed from: B, reason: collision with root package name */
    private final BottomSheetBehavior<V>.i f86378B;

    /* renamed from: C, reason: collision with root package name */
    private ValueAnimator f86379C;

    /* renamed from: D, reason: collision with root package name */
    int f86380D;

    /* renamed from: E, reason: collision with root package name */
    int f86381E;

    /* renamed from: F, reason: collision with root package name */
    int f86382F;

    /* renamed from: G, reason: collision with root package name */
    float f86383G;

    /* renamed from: H, reason: collision with root package name */
    int f86384H;

    /* renamed from: I, reason: collision with root package name */
    float f86385I;

    /* renamed from: J, reason: collision with root package name */
    boolean f86386J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f86387K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f86388L;

    /* renamed from: M, reason: collision with root package name */
    int f86389M;

    /* renamed from: N, reason: collision with root package name */
    int f86390N;

    /* renamed from: O, reason: collision with root package name */
    C17994c f86391O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f86392P;

    /* renamed from: Q, reason: collision with root package name */
    private int f86393Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f86394R;

    /* renamed from: S, reason: collision with root package name */
    private float f86395S;

    /* renamed from: T, reason: collision with root package name */
    private int f86396T;

    /* renamed from: U, reason: collision with root package name */
    int f86397U;

    /* renamed from: V, reason: collision with root package name */
    int f86398V;

    /* renamed from: W, reason: collision with root package name */
    WeakReference<V> f86399W;

    /* renamed from: X, reason: collision with root package name */
    WeakReference<View> f86400X;

    /* renamed from: Y, reason: collision with root package name */
    WeakReference<View> f86401Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ArrayList<g> f86402Z;

    /* renamed from: a, reason: collision with root package name */
    private int f86403a;

    /* renamed from: a0, reason: collision with root package name */
    private VelocityTracker f86404a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f86405b;

    /* renamed from: b0, reason: collision with root package name */
    ne.f f86406b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f86407c;

    /* renamed from: c0, reason: collision with root package name */
    int f86408c0;

    /* renamed from: d, reason: collision with root package name */
    private float f86409d;

    /* renamed from: d0, reason: collision with root package name */
    private int f86410d0;

    /* renamed from: e, reason: collision with root package name */
    private int f86411e;

    /* renamed from: e0, reason: collision with root package name */
    boolean f86412e0;

    /* renamed from: f, reason: collision with root package name */
    private int f86413f;

    /* renamed from: f0, reason: collision with root package name */
    private Map<View, Integer> f86414f0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f86415g;

    /* renamed from: g0, reason: collision with root package name */
    final SparseIntArray f86416g0;

    /* renamed from: h, reason: collision with root package name */
    private int f86417h;

    /* renamed from: h0, reason: collision with root package name */
    private final C17994c.d f86418h0;

    /* renamed from: i, reason: collision with root package name */
    private int f86419i;

    /* renamed from: j, reason: collision with root package name */
    private C16760h f86420j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f86421k;

    /* renamed from: l, reason: collision with root package name */
    private int f86422l;

    /* renamed from: m, reason: collision with root package name */
    private int f86423m;

    /* renamed from: n, reason: collision with root package name */
    private int f86424n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f86425o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f86426p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f86427q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f86428r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f86429s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f86430t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f86431u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f86432v;

    /* renamed from: w, reason: collision with root package name */
    private int f86433w;

    /* renamed from: x, reason: collision with root package name */
    private int f86434x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f86435y;

    /* renamed from: z, reason: collision with root package name */
    private C16765m f86436z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f86437a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f86438b;

        a(View view, int i10) {
            this.f86437a = view;
            this.f86438b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f1(this.f86437a, this.f86438b, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Y0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.f86399W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.f86399W.get().requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f86420j != null) {
                BottomSheetBehavior.this.f86420j.c0(fFloatValue);
            }
        }
    }

    class d implements x.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f86442a;

        d(boolean z10) {
            this.f86442a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.x.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.j a(android.view.View r11, androidx.core.view.j r12, com.google.android.material.internal.x.d r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.j.n.i()
                c2.d r0 = r12.f(r0)
                int r1 = androidx.core.view.j.n.f()
                c2.d r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f61363b
                com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2, r3)
                boolean r2 = com.google.android.material.internal.x.k(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.j()
                com.google.android.material.bottomsheet.BottomSheetBehavior.W(r3, r6)
                int r3 = r13.f87280d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.X(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f87279c
                goto L50
            L4e:
                int r4 = r13.f87277a
            L50:
                int r6 = r0.f61362a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Y(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f87277a
                goto L62
            L60:
                int r13 = r13.f87279c
            L62:
                int r2 = r0.f61364c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.Z(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f61362a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.a0(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f61364c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.J(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f61363b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f86442a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f61365d
                com.google.android.material.bottomsheet.BottomSheetBehavior.K(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r11)
                if (r11 != 0) goto Lc9
                boolean r11 = r10.f86442a
                if (r11 == 0) goto Lc8
                goto Lc9
            Lc8:
                return r12
            Lc9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.L(r11, r6)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, androidx.core.view.j, com.google.android.material.internal.x$d):androidx.core.view.j");
        }
    }

    class e extends C17994c.d {

        /* renamed from: a, reason: collision with root package name */
        private long f86444a;

        @Override // x2.C17994c.d
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f86388L) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // x2.C17994c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        e() {
        }

        @Override // x2.C17994c.d
        public int b(View view, int i10, int i11) {
            return C14329a.b(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // x2.C17994c.d
        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.f86398V : BottomSheetBehavior.this.f86384H;
        }

        @Override // x2.C17994c.d
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        @Override // x2.C17994c.d
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f86389M;
            if (i11 == 1 || bottomSheetBehavior.f86412e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f86408c0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f86401Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f86444a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f86399W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f86398V + bottomSheetBehavior.s0()) / 2) {
                return true;
            }
            return false;
        }

        @Override // x2.C17994c.d
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }
    }

    class f implements InterfaceC16438B {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f86446a;

        f(int i10) {
            this.f86446a = i10;
        }

        @Override // q2.InterfaceC16438B
        public boolean a(View view, InterfaceC16438B.a aVar) {
            BottomSheetBehavior.this.X0(this.f86446a);
            return true;
        }
    }

    public static abstract class g {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    private class i {

        /* renamed from: a, reason: collision with root package name */
        private int f86453a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f86454b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f86455c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f86454b = false;
                C17994c c17994c = BottomSheetBehavior.this.f86391O;
                if (c17994c != null && c17994c.n(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f86453a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f86389M == 2) {
                    bottomSheetBehavior.Y0(iVar2.f86453a);
                }
            }
        }

        private i() {
            this.f86455c = new a();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f86399W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f86453a = i10;
            if (this.f86454b) {
                return;
            }
            ViewCompat.e0(BottomSheetBehavior.this.f86399W.get(), this.f86455c);
            this.f86454b = true;
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior() {
        this.f86403a = 0;
        this.f86405b = true;
        this.f86407c = false;
        this.f86422l = -1;
        this.f86423m = -1;
        this.f86378B = new i(this, null);
        this.f86383G = 0.5f;
        this.f86385I = -1.0f;
        this.f86388L = true;
        this.f86389M = 4;
        this.f86390N = 4;
        this.f86395S = 0.1f;
        this.f86402Z = new ArrayList<>();
        this.f86410d0 = -1;
        this.f86416g0 = new SparseIntArray();
        this.f86418h0 = new e();
    }

    private void F0(View view, y.a aVar, int i10) {
        ViewCompat.i0(view, aVar, null, l0(i10));
    }

    private void G0() {
        this.f86408c0 = -1;
        this.f86410d0 = -1;
        VelocityTracker velocityTracker = this.f86404a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f86404a0 = null;
        }
    }

    private float e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private void i1(int i10, boolean z10) {
        boolean zY0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f86377A == (zY0 = y0()) || this.f86420j == null) {
            return;
        }
        this.f86377A = zY0;
        if (!z10 || (valueAnimator = this.f86379C) == null) {
            ValueAnimator valueAnimator2 = this.f86379C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f86379C.cancel();
            }
            this.f86420j.c0(this.f86377A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f86379C.reverse();
        } else {
            this.f86379C.setFloatValues(this.f86420j.y(), zY0 ? g0() : 1.0f);
            this.f86379C.start();
        }
    }

    private int v0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.f86384H;
        }
        if (i10 == 5) {
            return this.f86398V;
        }
        if (i10 == 6) {
            return this.f86382F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    public boolean B0() {
        return true;
    }

    public boolean D0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f86393Q = 0;
        this.f86394R = false;
        return (i10 & 2) != 0;
    }

    public void O0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f86383G = f10;
        if (this.f86399W != null) {
            f0();
        }
    }

    public void S0(int i10) {
        T0(i10, false);
    }

    public final void T0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f86415g) {
                return;
            } else {
                this.f86415g = true;
            }
        } else {
            if (!this.f86415g && this.f86413f == i10) {
                return;
            }
            this.f86415g = false;
            this.f86413f = Math.max(0, i10);
        }
        k1(z10);
    }

    public void X0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f86386J && i10 == 5) {
            FS.log_w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f86405b && v0(i10) <= this.f86381E) ? 3 : i10;
        WeakReference<V> weakReference = this.f86399W;
        if (weakReference == null || weakReference.get() == null) {
            Y0(i10);
        } else {
            V v10 = this.f86399W.get();
            I0(v10, new a(v10, i11));
        }
    }

    public boolean a1(long j10, float f10) {
        return false;
    }

    public boolean d1() {
        return false;
    }

    public boolean e1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f86401Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!D0() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    ViewCompat.Y(v10, -iS0);
                    Y0(3);
                } else {
                    if (!this.f86388L) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.Y(v10, -i11);
                    Y0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.f86384H && !j0()) {
                    int i14 = top - this.f86384H;
                    iArr[1] = i14;
                    ViewCompat.Y(v10, -i14);
                    Y0(4);
                } else {
                    if (!this.f86388L) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.Y(v10, -i11);
                    Y0(1);
                }
            }
            o0(v10.getTop());
            this.f86393Q = i11;
            this.f86394R = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    protected static class h extends AbstractC17751a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f86448c;

        /* renamed from: d, reason: collision with root package name */
        int f86449d;

        /* renamed from: e, reason: collision with root package name */
        boolean f86450e;

        /* renamed from: f, reason: collision with root package name */
        boolean f86451f;

        /* renamed from: g, reason: collision with root package name */
        boolean f86452g;

        class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
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
            this.f86448c = parcel.readInt();
            this.f86449d = parcel.readInt();
            this.f86450e = parcel.readInt() == 1;
            this.f86451f = parcel.readInt() == 1;
            this.f86452g = parcel.readInt() == 1;
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f86448c);
            parcel.writeInt(this.f86449d);
            parcel.writeInt(this.f86450e ? 1 : 0);
            parcel.writeInt(this.f86451f ? 1 : 0);
            parcel.writeInt(this.f86452g ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f86448c = bottomSheetBehavior.f86389M;
            this.f86449d = ((BottomSheetBehavior) bottomSheetBehavior).f86413f;
            this.f86450e = ((BottomSheetBehavior) bottomSheetBehavior).f86405b;
            this.f86451f = bottomSheetBehavior.f86386J;
            this.f86452g = ((BottomSheetBehavior) bottomSheetBehavior).f86387K;
        }
    }

    private void H0(h hVar) {
        int i10 = this.f86403a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f86413f = hVar.f86449d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f86405b = hVar.f86450e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f86386J = hVar.f86451f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f86387K = hVar.f86452g;
        }
    }

    private void Z0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || z0() || this.f86415g) ? false : true;
        if (this.f86426p || this.f86427q || this.f86428r || this.f86430t || this.f86431u || this.f86432v || z10) {
            x.c(view, new d(z10));
        }
    }

    private boolean b1() {
        if (this.f86391O != null) {
            return this.f86388L || this.f86389M == 1;
        }
        return false;
    }

    private void f0() {
        this.f86382F = (int) (this.f86398V * (1.0f - this.f86383G));
    }

    private float g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f86420j == null || (weakReference = this.f86399W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v10 = this.f86399W.get();
        if (!x0() || (rootWindowInsets = v10.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f86420j.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f86420j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void g1() {
        WeakReference<V> weakReference = this.f86399W;
        if (weakReference != null) {
            h1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f86400X;
        if (weakReference2 != null) {
            h1(weakReference2.get(), 1);
        }
    }

    private int h0() {
        int i10;
        return this.f86415g ? Math.min(Math.max(this.f86417h, this.f86398V - ((this.f86397U * 9) / 16)), this.f86396T) + this.f86433w : (this.f86425o || this.f86426p || (i10 = this.f86424n) <= 0) ? this.f86413f + this.f86433w : Math.max(this.f86413f, i10 + this.f86419i);
    }

    private void h1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.f86405b && this.f86389M != 6) {
            this.f86416g0.put(i10, b0(view, j.f44747a, 6));
        }
        if (this.f86386J && B0() && this.f86389M != 5) {
            F0(view, y.a.f156744y, 5);
        }
        int i11 = this.f86389M;
        if (i11 == 3) {
            F0(view, y.a.f156743x, this.f86405b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            F0(view, y.a.f156742w, this.f86405b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            F0(view, y.a.f156743x, 4);
            F0(view, y.a.f156742w, 3);
        }
    }

    private float i0(int i10) {
        float f10;
        float fS0;
        int i11 = this.f86384H;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.f86384H;
            f10 = i12 - i10;
            fS0 = this.f86398V - i12;
        } else {
            int i13 = this.f86384H;
            f10 = i13 - i10;
            fS0 = i13 - s0();
        }
        return f10 / fS0;
    }

    private void j1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f86399W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f86414f0 != null) {
                    return;
                } else {
                    this.f86414f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f86399W.get()) {
                    if (z10) {
                        this.f86414f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f86407c) {
                            ViewCompat.w0(childAt, 4);
                        }
                    } else if (this.f86407c && (map = this.f86414f0) != null && map.containsKey(childAt)) {
                        ViewCompat.w0(childAt, this.f86414f0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f86414f0 = null;
            } else if (this.f86407c) {
                this.f86399W.get().sendAccessibilityEvent(8);
            }
        }
    }

    private void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        ViewCompat.g0(view, 524288);
        ViewCompat.g0(view, 262144);
        ViewCompat.g0(view, 1048576);
        int i11 = this.f86416g0.get(i10, -1);
        if (i11 != -1) {
            ViewCompat.g0(view, i11);
            this.f86416g0.delete(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1(boolean z10) {
        V v10;
        if (this.f86399W != null) {
            d0();
            if (this.f86389M != 4 || (v10 = this.f86399W.get()) == null) {
                return;
            }
            if (z10) {
                X0(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    private InterfaceC16438B l0(int i10) {
        return new f(i10);
    }

    private void m0(Context context) {
        if (this.f86436z == null) {
            return;
        }
        C16760h c16760h = new C16760h(this.f86436z);
        this.f86420j = c16760h;
        c16760h.Q(context);
        ColorStateList colorStateList = this.f86421k;
        if (colorStateList != null) {
            this.f86420j.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f86420j.setTint(typedValue.data);
    }

    private float w0() {
        VelocityTracker velocityTracker = this.f86404a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f86409d);
        return this.f86404a0.getYVelocity(this.f86408c0);
    }

    private boolean x0() {
        WeakReference<V> weakReference = this.f86399W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.f86399W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean y0() {
        if (this.f86389M == 3) {
            return this.f86435y || x0();
        }
        return false;
    }

    public boolean A0() {
        return this.f86386J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, v10, hVar.a());
        H0(hVar);
        int i10 = hVar.f86448c;
        if (i10 == 1 || i10 == 2) {
            this.f86389M = 4;
            this.f86390N = 4;
        } else {
            this.f86389M = i10;
            this.f86390N = i10;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
        return new h(super.C(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public void E0(g gVar) {
        this.f86402Z.remove(gVar);
    }

    @Deprecated
    public void J0(g gVar) {
        FS.log_w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f86402Z.clear();
        if (gVar != null) {
            this.f86402Z.add(gVar);
        }
    }

    public void K0(boolean z10) {
        this.f86388L = z10;
    }

    public void L0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f86380D = i10;
        i1(this.f86389M, true);
    }

    public void M0(boolean z10) {
        if (this.f86405b == z10) {
            return;
        }
        this.f86405b = z10;
        if (this.f86399W != null) {
            d0();
        }
        Y0((this.f86405b && this.f86389M == 6) ? 3 : this.f86389M);
        i1(this.f86389M, true);
        g1();
    }

    public void N0(boolean z10) {
        this.f86425o = z10;
    }

    public void P0(boolean z10) {
        if (this.f86386J != z10) {
            this.f86386J = z10;
            if (!z10 && this.f86389M == 5) {
                X0(4);
            }
            g1();
        }
    }

    public void Q0(int i10) {
        this.f86423m = i10;
    }

    public void R0(int i10) {
        this.f86422l = i10;
    }

    public void U0(int i10) {
        this.f86403a = i10;
    }

    public void V0(int i10) {
        this.f86411e = i10;
    }

    public void W0(boolean z10) {
        this.f86387K = z10;
    }

    void Y0(int i10) {
        V v10;
        if (this.f86389M == i10) {
            return;
        }
        this.f86389M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f86386J && i10 == 5)) {
            this.f86390N = i10;
        }
        WeakReference<V> weakReference = this.f86399W;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            j1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            j1(false);
        }
        i1(i10, true);
        for (int i11 = 0; i11 < this.f86402Z.size(); i11++) {
            this.f86402Z.get(i11).c(v10, i10);
        }
        g1();
    }

    @Override // ne.InterfaceC15792b
    public void a() {
        ne.f fVar = this.f86406b0;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    @Override // ne.InterfaceC15792b
    public void b(C5614b c5614b) {
        ne.f fVar = this.f86406b0;
        if (fVar == null) {
            return;
        }
        fVar.j(c5614b);
    }

    @Override // ne.InterfaceC15792b
    public void c(C5614b c5614b) {
        ne.f fVar = this.f86406b0;
        if (fVar == null) {
            return;
        }
        fVar.l(c5614b);
    }

    public void c0(g gVar) {
        if (this.f86402Z.contains(gVar)) {
            return;
        }
        this.f86402Z.add(gVar);
    }

    boolean c1(View view, float f10) {
        if (this.f86387K) {
            return true;
        }
        if (B0() && view.getTop() >= this.f86384H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f86395S)) - ((float) this.f86384H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    @Override // ne.InterfaceC15792b
    public void d() {
        ne.f fVar = this.f86406b0;
        if (fVar == null) {
            return;
        }
        C5614b c5614bC = fVar.c();
        if (c5614bC == null || Build.VERSION.SDK_INT < 34) {
            X0(this.f86386J ? 5 : 4);
        } else if (this.f86386J) {
            this.f86406b0.h(c5614bC, new b());
        } else {
            this.f86406b0.i(c5614bC, null);
            X0(4);
        }
    }

    void o0(int i10) {
        V v10 = this.f86399W.get();
        if (v10 == null || this.f86402Z.isEmpty()) {
            return;
        }
        float fI0 = i0(i10);
        for (int i11 = 0; i11 < this.f86402Z.size(); i11++) {
            this.f86402Z.get(i11).b(v10, fI0);
        }
    }

    public int s0() {
        if (this.f86405b) {
            return this.f86381E;
        }
        return Math.max(this.f86380D, this.f86429s ? 0 : this.f86434x);
    }

    C16760h t0() {
        return this.f86420j;
    }

    public int u0() {
        return this.f86389M;
    }

    public boolean z0() {
        return this.f86425o;
    }

    private boolean C0(V v10) {
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.R(v10)) {
            return true;
        }
        return false;
    }

    private void I0(V v10, Runnable runnable) {
        if (C0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int b0(View view, int i10, int i11) {
        return ViewCompat.c(view, view.getResources().getString(i10), l0(i11));
    }

    private void d0() {
        int iH0 = h0();
        if (this.f86405b) {
            this.f86384H = Math.max(this.f86398V - iH0, this.f86381E);
        } else {
            this.f86384H = this.f86398V - iH0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(View view, int i10, boolean z10) {
        int iV0 = v0(i10);
        C17994c c17994c = this.f86391O;
        if (c17994c != null && (!z10 ? c17994c.S(view, view.getLeft(), iV0) : c17994c.Q(view.getLeft(), iV0))) {
            Y0(2);
            i1(i10, true);
            this.f86378B.c(i10);
            return;
        }
        Y0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        if (A0() && B0()) {
            return true;
        }
        return false;
    }

    private void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.f86379C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f86379C.addUpdateListener(new c());
    }

    public static <V extends View> BottomSheetBehavior<V> q0(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
            if (cVarF instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVarF;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int r0(int i10, int i11, int i12, int i13) {
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

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.s0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Y0(r0)
            return
        Lf:
            boolean r3 = r2.D0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f86401Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f86394R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f86393Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f86405b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f86382F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f86386J
            if (r3 == 0) goto L49
            float r3 = r2.w0()
            boolean r3 = r2.c1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f86393Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f86405b
            if (r1 == 0) goto L68
            int r5 = r2.f86381E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f86384H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f86382F
            if (r3 >= r1) goto L7e
            int r1 = r2.f86384H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.d1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f86384H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f86405b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f86382F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f86384H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.f1(r4, r0, r3)
            r2.f86394R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f86389M == 1 && actionMasked == 0) {
            return true;
        }
        if (b1()) {
            this.f86391O.G(motionEvent);
        }
        if (actionMasked == 0) {
            G0();
        }
        if (this.f86404a0 == null) {
            this.f86404a0 = VelocityTracker.obtain();
        }
        this.f86404a0.addMovement(motionEvent);
        if (b1() && actionMasked == 2 && !this.f86392P && Math.abs(this.f86410d0 - motionEvent.getY()) > this.f86391O.A()) {
            this.f86391O.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f86392P;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f86399W = null;
        this.f86391O = null;
        this.f86406b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f86399W = null;
        this.f86391O = null;
        this.f86406b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        View view;
        int i10;
        C17994c c17994c;
        if (v10.isShown() && this.f86388L) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                G0();
            }
            if (this.f86404a0 == null) {
                this.f86404a0 = VelocityTracker.obtain();
            }
            this.f86404a0.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f86412e0 = false;
                    this.f86408c0 = -1;
                    if (this.f86392P) {
                        this.f86392P = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.f86410d0 = (int) motionEvent.getY();
                if (this.f86389M != 2) {
                    WeakReference<View> weakReference = this.f86401Y;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.C(view, x10, this.f86410d0)) {
                        this.f86408c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f86412e0 = true;
                    }
                }
                if (this.f86408c0 == -1 && !coordinatorLayout.C(v10, x10, this.f86410d0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f86392P = z10;
            }
            if (!this.f86392P && (c17994c = this.f86391O) != null && c17994c.R(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.f86401Y;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.f86392P || this.f86389M == 1 || coordinatorLayout.C(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f86391O == null || (i10 = this.f86410d0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.f86391O.A()) {
                return false;
            }
            return true;
        }
        this.f86392P = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (ViewCompat.w(coordinatorLayout) && !ViewCompat.w(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f86399W == null) {
            this.f86417h = coordinatorLayout.getResources().getDimensionPixelSize(ae.d.f44593b);
            Z0(v10);
            ViewCompat.I0(v10, new com.google.android.material.bottomsheet.b(v10));
            this.f86399W = new WeakReference<>(v10);
            this.f86406b0 = new ne.f(v10);
            C16760h c16760h = this.f86420j;
            if (c16760h != null) {
                ViewCompat.q0(v10, c16760h);
                C16760h c16760h2 = this.f86420j;
                float fU = this.f86385I;
                if (fU == -1.0f) {
                    fU = ViewCompat.u(v10);
                }
                c16760h2.a0(fU);
            } else {
                ColorStateList colorStateList = this.f86421k;
                if (colorStateList != null) {
                    ViewCompat.r0(v10, colorStateList);
                }
            }
            g1();
            if (ViewCompat.x(v10) == 0) {
                ViewCompat.w0(v10, 1);
            }
        }
        if (this.f86391O == null) {
            this.f86391O = C17994c.p(coordinatorLayout, this.f86418h0);
        }
        int top = v10.getTop();
        coordinatorLayout.K(v10, i10);
        this.f86397U = coordinatorLayout.getWidth();
        this.f86398V = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f86396T = height;
        int iMin = this.f86398V;
        int i11 = iMin - height;
        int i12 = this.f86434x;
        if (i11 < i12) {
            if (this.f86429s) {
                int i13 = this.f86423m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f86396T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f86423m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f86396T = iMin2;
            }
        }
        this.f86381E = Math.max(0, this.f86398V - this.f86396T);
        f0();
        d0();
        int i15 = this.f86389M;
        if (i15 == 3) {
            ViewCompat.Y(v10, s0());
        } else if (i15 == 6) {
            ViewCompat.Y(v10, this.f86382F);
        } else if (this.f86386J && i15 == 5) {
            ViewCompat.Y(v10, this.f86398V);
        } else if (i15 == 4) {
            ViewCompat.Y(v10, this.f86384H);
        } else if (i15 == 1 || i15 == 2) {
            ViewCompat.Y(v10, top - v10.getTop());
        }
        i1(this.f86389M, false);
        this.f86401Y = new WeakReference<>(p0(v10));
        for (int i16 = 0; i16 < this.f86402Z.size(); i16++) {
            this.f86402Z.get(i16).a(v10);
        }
        return true;
    }

    View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.T(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewP0 = p0(viewGroup.getChildAt(i10));
                if (viewP0 != null) {
                    return viewP0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f86422l, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f86423m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (!D0() || (weakReference = this.f86401Y) == null || view != weakReference.get() || (this.f86389M == 3 && !super.s(coordinatorLayout, v10, view, f10, f11))) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f86403a = 0;
        this.f86405b = true;
        this.f86407c = false;
        this.f86422l = -1;
        this.f86423m = -1;
        this.f86378B = new i(this, null);
        this.f86383G = 0.5f;
        this.f86385I = -1.0f;
        this.f86388L = true;
        this.f86389M = 4;
        this.f86390N = 4;
        this.f86395S = 0.1f;
        this.f86402Z = new ArrayList<>();
        this.f86410d0 = -1;
        this.f86416g0 = new SparseIntArray();
        this.f86418h0 = new e();
        this.f86419i = context.getResources().getDimensionPixelSize(ae.d.f44620o0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f45232k0);
        if (typedArrayObtainStyledAttributes.hasValue(l.f45280o0)) {
            this.f86421k = C16026c.a(context, typedArrayObtainStyledAttributes, l.f45280o0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f44884G0)) {
            this.f86436z = C16765m.e(context, attributeSet, C5597b.f44515f, f86376i0).m();
        }
        m0(context);
        n0();
        this.f86385I = typedArrayObtainStyledAttributes.getDimension(l.f45268n0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(l.f45244l0)) {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45244l0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f45256m0)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45256m0, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(l.f45352u0);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            S0(i10);
        } else {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45352u0, -1));
        }
        P0(typedArrayObtainStyledAttributes.getBoolean(l.f45340t0, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(l.f45400y0, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(l.f45316r0, true));
        W0(typedArrayObtainStyledAttributes.getBoolean(l.f45388x0, false));
        K0(typedArrayObtainStyledAttributes.getBoolean(l.f45292p0, true));
        U0(typedArrayObtainStyledAttributes.getInt(l.f45364v0, 0));
        O0(typedArrayObtainStyledAttributes.getFloat(l.f45328s0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(l.f45304q0);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            L0(typedValuePeekValue2.data);
        } else {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.f45304q0, 0));
        }
        V0(typedArrayObtainStyledAttributes.getInt(l.f45376w0, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR));
        this.f86426p = typedArrayObtainStyledAttributes.getBoolean(l.f44836C0, false);
        this.f86427q = typedArrayObtainStyledAttributes.getBoolean(l.f44848D0, false);
        this.f86428r = typedArrayObtainStyledAttributes.getBoolean(l.f44860E0, false);
        this.f86429s = typedArrayObtainStyledAttributes.getBoolean(l.f44872F0, true);
        this.f86430t = typedArrayObtainStyledAttributes.getBoolean(l.f45412z0, false);
        this.f86431u = typedArrayObtainStyledAttributes.getBoolean(l.f44812A0, false);
        this.f86432v = typedArrayObtainStyledAttributes.getBoolean(l.f44824B0, false);
        this.f86435y = typedArrayObtainStyledAttributes.getBoolean(l.f44896H0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f86409d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
