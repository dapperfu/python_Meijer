package com.google.android.material.bottomsheet;

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
import androidx.view.C5756b;
import ce.C6503b;
import ce.j;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import h2.C14442a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pe.InterfaceC16420b;
import q2.InterfaceC16593B;
import q2.y;
import qe.C16634c;
import te.C17234h;
import te.C17239m;
import w2.AbstractC17821a;
import x2.C18060c;

/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements InterfaceC16420b {

    /* renamed from: i0, reason: collision with root package name */
    private static final int f87216i0 = k.f61810k;

    /* renamed from: A, reason: collision with root package name */
    private boolean f87217A;

    /* renamed from: B, reason: collision with root package name */
    private final BottomSheetBehavior<V>.i f87218B;

    /* renamed from: C, reason: collision with root package name */
    private ValueAnimator f87219C;

    /* renamed from: D, reason: collision with root package name */
    int f87220D;

    /* renamed from: E, reason: collision with root package name */
    int f87221E;

    /* renamed from: F, reason: collision with root package name */
    int f87222F;

    /* renamed from: G, reason: collision with root package name */
    float f87223G;

    /* renamed from: H, reason: collision with root package name */
    int f87224H;

    /* renamed from: I, reason: collision with root package name */
    float f87225I;

    /* renamed from: J, reason: collision with root package name */
    boolean f87226J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f87227K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f87228L;

    /* renamed from: M, reason: collision with root package name */
    int f87229M;

    /* renamed from: N, reason: collision with root package name */
    int f87230N;

    /* renamed from: O, reason: collision with root package name */
    C18060c f87231O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f87232P;

    /* renamed from: Q, reason: collision with root package name */
    private int f87233Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f87234R;

    /* renamed from: S, reason: collision with root package name */
    private float f87235S;

    /* renamed from: T, reason: collision with root package name */
    private int f87236T;

    /* renamed from: U, reason: collision with root package name */
    int f87237U;

    /* renamed from: V, reason: collision with root package name */
    int f87238V;

    /* renamed from: W, reason: collision with root package name */
    WeakReference<V> f87239W;

    /* renamed from: X, reason: collision with root package name */
    WeakReference<View> f87240X;

    /* renamed from: Y, reason: collision with root package name */
    WeakReference<View> f87241Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ArrayList<g> f87242Z;

    /* renamed from: a, reason: collision with root package name */
    private int f87243a;

    /* renamed from: a0, reason: collision with root package name */
    private VelocityTracker f87244a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f87245b;

    /* renamed from: b0, reason: collision with root package name */
    pe.f f87246b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f87247c;

    /* renamed from: c0, reason: collision with root package name */
    int f87248c0;

    /* renamed from: d, reason: collision with root package name */
    private float f87249d;

    /* renamed from: d0, reason: collision with root package name */
    private int f87250d0;

    /* renamed from: e, reason: collision with root package name */
    private int f87251e;

    /* renamed from: e0, reason: collision with root package name */
    boolean f87252e0;

    /* renamed from: f, reason: collision with root package name */
    private int f87253f;

    /* renamed from: f0, reason: collision with root package name */
    private Map<View, Integer> f87254f0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f87255g;

    /* renamed from: g0, reason: collision with root package name */
    final SparseIntArray f87256g0;

    /* renamed from: h, reason: collision with root package name */
    private int f87257h;

    /* renamed from: h0, reason: collision with root package name */
    private final C18060c.d f87258h0;

    /* renamed from: i, reason: collision with root package name */
    private int f87259i;

    /* renamed from: j, reason: collision with root package name */
    private C17234h f87260j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f87261k;

    /* renamed from: l, reason: collision with root package name */
    private int f87262l;

    /* renamed from: m, reason: collision with root package name */
    private int f87263m;

    /* renamed from: n, reason: collision with root package name */
    private int f87264n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f87265o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f87266p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f87267q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f87268r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f87269s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f87270t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f87271u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f87272v;

    /* renamed from: w, reason: collision with root package name */
    private int f87273w;

    /* renamed from: x, reason: collision with root package name */
    private int f87274x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f87275y;

    /* renamed from: z, reason: collision with root package name */
    private C17239m f87276z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f87277a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87278b;

        a(View view, int i10) {
            this.f87277a = view;
            this.f87278b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f1(this.f87277a, this.f87278b, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Y0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.f87239W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.f87239W.get().requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f87260j != null) {
                BottomSheetBehavior.this.f87260j.c0(fFloatValue);
            }
        }
    }

    class d implements x.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f87282a;

        d(boolean z10) {
            this.f87282a = z10;
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
                int r3 = r0.f61162b
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
                int r3 = r13.f88120d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.X(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f88119c
                goto L50
            L4e:
                int r4 = r13.f88117a
            L50:
                int r6 = r0.f61161a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Y(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f88117a
                goto L62
            L60:
                int r13 = r13.f88119c
            L62:
                int r2 = r0.f61163c
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
                int r8 = r0.f61161a
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
                int r9 = r0.f61163c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.J(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f61162b
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
                boolean r11 = r10.f87282a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f61164d
                com.google.android.material.bottomsheet.BottomSheetBehavior.K(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r11)
                if (r11 != 0) goto Lc9
                boolean r11 = r10.f87282a
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

    class e extends C18060c.d {

        /* renamed from: a, reason: collision with root package name */
        private long f87284a;

        @Override // x2.C18060c.d
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f87228L) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // x2.C18060c.d
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

        @Override // x2.C18060c.d
        public int b(View view, int i10, int i11) {
            return C14442a.b(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // x2.C18060c.d
        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.f87238V : BottomSheetBehavior.this.f87224H;
        }

        @Override // x2.C18060c.d
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        @Override // x2.C18060c.d
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f87229M;
            if (i11 == 1 || bottomSheetBehavior.f87252e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f87248c0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f87241Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f87284a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f87239W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f87238V + bottomSheetBehavior.s0()) / 2) {
                return true;
            }
            return false;
        }

        @Override // x2.C18060c.d
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }
    }

    class f implements InterfaceC16593B {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87286a;

        f(int i10) {
            this.f87286a = i10;
        }

        @Override // q2.InterfaceC16593B
        public boolean a(View view, InterfaceC16593B.a aVar) {
            BottomSheetBehavior.this.X0(this.f87286a);
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
        private int f87293a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f87294b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f87295c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f87294b = false;
                C18060c c18060c = BottomSheetBehavior.this.f87231O;
                if (c18060c != null && c18060c.n(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f87293a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f87229M == 2) {
                    bottomSheetBehavior.Y0(iVar2.f87293a);
                }
            }
        }

        private i() {
            this.f87295c = new a();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f87239W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f87293a = i10;
            if (this.f87294b) {
                return;
            }
            ViewCompat.e0(BottomSheetBehavior.this.f87239W.get(), this.f87295c);
            this.f87294b = true;
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior() {
        this.f87243a = 0;
        this.f87245b = true;
        this.f87247c = false;
        this.f87262l = -1;
        this.f87263m = -1;
        this.f87218B = new i(this, null);
        this.f87223G = 0.5f;
        this.f87225I = -1.0f;
        this.f87228L = true;
        this.f87229M = 4;
        this.f87230N = 4;
        this.f87235S = 0.1f;
        this.f87242Z = new ArrayList<>();
        this.f87250d0 = -1;
        this.f87256g0 = new SparseIntArray();
        this.f87258h0 = new e();
    }

    private void F0(View view, y.a aVar, int i10) {
        ViewCompat.i0(view, aVar, null, l0(i10));
    }

    private void G0() {
        this.f87248c0 = -1;
        this.f87250d0 = -1;
        VelocityTracker velocityTracker = this.f87244a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f87244a0 = null;
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
        if (i10 == 2 || this.f87217A == (zY0 = y0()) || this.f87260j == null) {
            return;
        }
        this.f87217A = zY0;
        if (!z10 || (valueAnimator = this.f87219C) == null) {
            ValueAnimator valueAnimator2 = this.f87219C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f87219C.cancel();
            }
            this.f87260j.c0(this.f87217A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f87219C.reverse();
        } else {
            this.f87219C.setFloatValues(this.f87260j.y(), zY0 ? g0() : 1.0f);
            this.f87219C.start();
        }
    }

    private int v0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.f87224H;
        }
        if (i10 == 5) {
            return this.f87238V;
        }
        if (i10 == 6) {
            return this.f87222F;
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
        this.f87233Q = 0;
        this.f87234R = false;
        return (i10 & 2) != 0;
    }

    public void O0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f87223G = f10;
        if (this.f87239W != null) {
            f0();
        }
    }

    public void S0(int i10) {
        T0(i10, false);
    }

    public final void T0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f87255g) {
                return;
            } else {
                this.f87255g = true;
            }
        } else {
            if (!this.f87255g && this.f87253f == i10) {
                return;
            }
            this.f87255g = false;
            this.f87253f = Math.max(0, i10);
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
        if (!this.f87226J && i10 == 5) {
            FS.log_w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f87245b && v0(i10) <= this.f87221E) ? 3 : i10;
        WeakReference<V> weakReference = this.f87239W;
        if (weakReference == null || weakReference.get() == null) {
            Y0(i10);
        } else {
            V v10 = this.f87239W.get();
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
        WeakReference<View> weakReference = this.f87241Y;
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
                    if (!this.f87228L) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.Y(v10, -i11);
                    Y0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.f87224H && !j0()) {
                    int i14 = top - this.f87224H;
                    iArr[1] = i14;
                    ViewCompat.Y(v10, -i14);
                    Y0(4);
                } else {
                    if (!this.f87228L) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.Y(v10, -i11);
                    Y0(1);
                }
            }
            o0(v10.getTop());
            this.f87233Q = i11;
            this.f87234R = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    protected static class h extends AbstractC17821a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f87288c;

        /* renamed from: d, reason: collision with root package name */
        int f87289d;

        /* renamed from: e, reason: collision with root package name */
        boolean f87290e;

        /* renamed from: f, reason: collision with root package name */
        boolean f87291f;

        /* renamed from: g, reason: collision with root package name */
        boolean f87292g;

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
            this.f87288c = parcel.readInt();
            this.f87289d = parcel.readInt();
            this.f87290e = parcel.readInt() == 1;
            this.f87291f = parcel.readInt() == 1;
            this.f87292g = parcel.readInt() == 1;
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f87288c);
            parcel.writeInt(this.f87289d);
            parcel.writeInt(this.f87290e ? 1 : 0);
            parcel.writeInt(this.f87291f ? 1 : 0);
            parcel.writeInt(this.f87292g ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f87288c = bottomSheetBehavior.f87229M;
            this.f87289d = ((BottomSheetBehavior) bottomSheetBehavior).f87253f;
            this.f87290e = ((BottomSheetBehavior) bottomSheetBehavior).f87245b;
            this.f87291f = bottomSheetBehavior.f87226J;
            this.f87292g = ((BottomSheetBehavior) bottomSheetBehavior).f87227K;
        }
    }

    private void H0(h hVar) {
        int i10 = this.f87243a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f87253f = hVar.f87289d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f87245b = hVar.f87290e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f87226J = hVar.f87291f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f87227K = hVar.f87292g;
        }
    }

    private void Z0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || z0() || this.f87255g) ? false : true;
        if (this.f87266p || this.f87267q || this.f87268r || this.f87270t || this.f87271u || this.f87272v || z10) {
            x.c(view, new d(z10));
        }
    }

    private boolean b1() {
        if (this.f87231O != null) {
            return this.f87228L || this.f87229M == 1;
        }
        return false;
    }

    private void f0() {
        this.f87222F = (int) (this.f87238V * (1.0f - this.f87223G));
    }

    private float g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f87260j == null || (weakReference = this.f87239W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v10 = this.f87239W.get();
        if (!x0() || (rootWindowInsets = v10.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f87260j.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f87260j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void g1() {
        WeakReference<V> weakReference = this.f87239W;
        if (weakReference != null) {
            h1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f87240X;
        if (weakReference2 != null) {
            h1(weakReference2.get(), 1);
        }
    }

    private int h0() {
        int i10;
        return this.f87255g ? Math.min(Math.max(this.f87257h, this.f87238V - ((this.f87237U * 9) / 16)), this.f87236T) + this.f87273w : (this.f87265o || this.f87266p || (i10 = this.f87264n) <= 0) ? this.f87253f + this.f87273w : Math.max(this.f87253f, i10 + this.f87259i);
    }

    private void h1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.f87245b && this.f87229M != 6) {
            this.f87256g0.put(i10, b0(view, j.f61762a, 6));
        }
        if (this.f87226J && B0() && this.f87229M != 5) {
            F0(view, y.a.f157857y, 5);
        }
        int i11 = this.f87229M;
        if (i11 == 3) {
            F0(view, y.a.f157856x, this.f87245b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            F0(view, y.a.f157855w, this.f87245b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            F0(view, y.a.f157856x, 4);
            F0(view, y.a.f157855w, 3);
        }
    }

    private float i0(int i10) {
        float f10;
        float fS0;
        int i11 = this.f87224H;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.f87224H;
            f10 = i12 - i10;
            fS0 = this.f87238V - i12;
        } else {
            int i13 = this.f87224H;
            f10 = i13 - i10;
            fS0 = i13 - s0();
        }
        return f10 / fS0;
    }

    private void j1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f87239W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f87254f0 != null) {
                    return;
                } else {
                    this.f87254f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f87239W.get()) {
                    if (z10) {
                        this.f87254f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f87247c) {
                            ViewCompat.w0(childAt, 4);
                        }
                    } else if (this.f87247c && (map = this.f87254f0) != null && map.containsKey(childAt)) {
                        ViewCompat.w0(childAt, this.f87254f0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f87254f0 = null;
            } else if (this.f87247c) {
                this.f87239W.get().sendAccessibilityEvent(8);
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
        int i11 = this.f87256g0.get(i10, -1);
        if (i11 != -1) {
            ViewCompat.g0(view, i11);
            this.f87256g0.delete(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1(boolean z10) {
        V v10;
        if (this.f87239W != null) {
            d0();
            if (this.f87229M != 4 || (v10 = this.f87239W.get()) == null) {
                return;
            }
            if (z10) {
                X0(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    private InterfaceC16593B l0(int i10) {
        return new f(i10);
    }

    private void m0(Context context) {
        if (this.f87276z == null) {
            return;
        }
        C17234h c17234h = new C17234h(this.f87276z);
        this.f87260j = c17234h;
        c17234h.Q(context);
        ColorStateList colorStateList = this.f87261k;
        if (colorStateList != null) {
            this.f87260j.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f87260j.setTint(typedValue.data);
    }

    private float w0() {
        VelocityTracker velocityTracker = this.f87244a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f87249d);
        return this.f87244a0.getYVelocity(this.f87248c0);
    }

    private boolean x0() {
        WeakReference<V> weakReference = this.f87239W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.f87239W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean y0() {
        if (this.f87229M == 3) {
            return this.f87275y || x0();
        }
        return false;
    }

    public boolean A0() {
        return this.f87226J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, v10, hVar.a());
        H0(hVar);
        int i10 = hVar.f87288c;
        if (i10 == 1 || i10 == 2) {
            this.f87229M = 4;
            this.f87230N = 4;
        } else {
            this.f87229M = i10;
            this.f87230N = i10;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
        return new h(super.C(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public void E0(g gVar) {
        this.f87242Z.remove(gVar);
    }

    @Deprecated
    public void J0(g gVar) {
        FS.log_w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f87242Z.clear();
        if (gVar != null) {
            this.f87242Z.add(gVar);
        }
    }

    public void K0(boolean z10) {
        this.f87228L = z10;
    }

    public void L0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f87220D = i10;
        i1(this.f87229M, true);
    }

    public void M0(boolean z10) {
        if (this.f87245b == z10) {
            return;
        }
        this.f87245b = z10;
        if (this.f87239W != null) {
            d0();
        }
        Y0((this.f87245b && this.f87229M == 6) ? 3 : this.f87229M);
        i1(this.f87229M, true);
        g1();
    }

    public void N0(boolean z10) {
        this.f87265o = z10;
    }

    public void P0(boolean z10) {
        if (this.f87226J != z10) {
            this.f87226J = z10;
            if (!z10 && this.f87229M == 5) {
                X0(4);
            }
            g1();
        }
    }

    public void Q0(int i10) {
        this.f87263m = i10;
    }

    public void R0(int i10) {
        this.f87262l = i10;
    }

    public void U0(int i10) {
        this.f87243a = i10;
    }

    public void V0(int i10) {
        this.f87251e = i10;
    }

    public void W0(boolean z10) {
        this.f87227K = z10;
    }

    void Y0(int i10) {
        V v10;
        if (this.f87229M == i10) {
            return;
        }
        this.f87229M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f87226J && i10 == 5)) {
            this.f87230N = i10;
        }
        WeakReference<V> weakReference = this.f87239W;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            j1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            j1(false);
        }
        i1(i10, true);
        for (int i11 = 0; i11 < this.f87242Z.size(); i11++) {
            this.f87242Z.get(i11).c(v10, i10);
        }
        g1();
    }

    @Override // pe.InterfaceC16420b
    public void a() {
        pe.f fVar = this.f87246b0;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    @Override // pe.InterfaceC16420b
    public void b(C5756b c5756b) {
        pe.f fVar = this.f87246b0;
        if (fVar == null) {
            return;
        }
        fVar.j(c5756b);
    }

    @Override // pe.InterfaceC16420b
    public void c(C5756b c5756b) {
        pe.f fVar = this.f87246b0;
        if (fVar == null) {
            return;
        }
        fVar.l(c5756b);
    }

    public void c0(g gVar) {
        if (this.f87242Z.contains(gVar)) {
            return;
        }
        this.f87242Z.add(gVar);
    }

    boolean c1(View view, float f10) {
        if (this.f87227K) {
            return true;
        }
        if (B0() && view.getTop() >= this.f87224H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f87235S)) - ((float) this.f87224H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    @Override // pe.InterfaceC16420b
    public void d() {
        pe.f fVar = this.f87246b0;
        if (fVar == null) {
            return;
        }
        C5756b c5756bC = fVar.c();
        if (c5756bC == null || Build.VERSION.SDK_INT < 34) {
            X0(this.f87226J ? 5 : 4);
        } else if (this.f87226J) {
            this.f87246b0.h(c5756bC, new b());
        } else {
            this.f87246b0.i(c5756bC, null);
            X0(4);
        }
    }

    void o0(int i10) {
        V v10 = this.f87239W.get();
        if (v10 == null || this.f87242Z.isEmpty()) {
            return;
        }
        float fI0 = i0(i10);
        for (int i11 = 0; i11 < this.f87242Z.size(); i11++) {
            this.f87242Z.get(i11).b(v10, fI0);
        }
    }

    public int s0() {
        if (this.f87245b) {
            return this.f87221E;
        }
        return Math.max(this.f87220D, this.f87269s ? 0 : this.f87274x);
    }

    C17234h t0() {
        return this.f87260j;
    }

    public int u0() {
        return this.f87229M;
    }

    public boolean z0() {
        return this.f87265o;
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
        if (this.f87245b) {
            this.f87224H = Math.max(this.f87238V - iH0, this.f87221E);
        } else {
            this.f87224H = this.f87238V - iH0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(View view, int i10, boolean z10) {
        int iV0 = v0(i10);
        C18060c c18060c = this.f87231O;
        if (c18060c != null && (!z10 ? c18060c.S(view, view.getLeft(), iV0) : c18060c.Q(view.getLeft(), iV0))) {
            Y0(2);
            i1(i10, true);
            this.f87218B.c(i10);
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
        this.f87219C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f87219C.addUpdateListener(new c());
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
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f87241Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f87234R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f87233Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f87245b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f87222F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f87226J
            if (r3 == 0) goto L49
            float r3 = r2.w0()
            boolean r3 = r2.c1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f87233Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f87245b
            if (r1 == 0) goto L68
            int r5 = r2.f87221E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f87224H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f87222F
            if (r3 >= r1) goto L7e
            int r1 = r2.f87224H
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
            int r1 = r2.f87224H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f87245b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f87222F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f87224H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.f1(r4, r0, r3)
            r2.f87234R = r3
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
        if (this.f87229M == 1 && actionMasked == 0) {
            return true;
        }
        if (b1()) {
            this.f87231O.G(motionEvent);
        }
        if (actionMasked == 0) {
            G0();
        }
        if (this.f87244a0 == null) {
            this.f87244a0 = VelocityTracker.obtain();
        }
        this.f87244a0.addMovement(motionEvent);
        if (b1() && actionMasked == 2 && !this.f87232P && Math.abs(this.f87250d0 - motionEvent.getY()) > this.f87231O.A()) {
            this.f87231O.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f87232P;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f87239W = null;
        this.f87231O = null;
        this.f87246b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f87239W = null;
        this.f87231O = null;
        this.f87246b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        View view;
        int i10;
        C18060c c18060c;
        if (v10.isShown() && this.f87228L) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                G0();
            }
            if (this.f87244a0 == null) {
                this.f87244a0 = VelocityTracker.obtain();
            }
            this.f87244a0.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f87252e0 = false;
                    this.f87248c0 = -1;
                    if (this.f87232P) {
                        this.f87232P = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.f87250d0 = (int) motionEvent.getY();
                if (this.f87229M != 2) {
                    WeakReference<View> weakReference = this.f87241Y;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.C(view, x10, this.f87250d0)) {
                        this.f87248c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f87252e0 = true;
                    }
                }
                if (this.f87248c0 == -1 && !coordinatorLayout.C(v10, x10, this.f87250d0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f87232P = z10;
            }
            if (!this.f87232P && (c18060c = this.f87231O) != null && c18060c.R(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.f87241Y;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.f87232P || this.f87229M == 1 || coordinatorLayout.C(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f87231O == null || (i10 = this.f87250d0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.f87231O.A()) {
                return false;
            }
            return true;
        }
        this.f87232P = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (ViewCompat.w(coordinatorLayout) && !ViewCompat.w(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f87239W == null) {
            this.f87257h = coordinatorLayout.getResources().getDimensionPixelSize(ce.d.f61608b);
            Z0(v10);
            ViewCompat.I0(v10, new com.google.android.material.bottomsheet.b(v10));
            this.f87239W = new WeakReference<>(v10);
            this.f87246b0 = new pe.f(v10);
            C17234h c17234h = this.f87260j;
            if (c17234h != null) {
                ViewCompat.q0(v10, c17234h);
                C17234h c17234h2 = this.f87260j;
                float fU = this.f87225I;
                if (fU == -1.0f) {
                    fU = ViewCompat.u(v10);
                }
                c17234h2.a0(fU);
            } else {
                ColorStateList colorStateList = this.f87261k;
                if (colorStateList != null) {
                    ViewCompat.r0(v10, colorStateList);
                }
            }
            g1();
            if (ViewCompat.x(v10) == 0) {
                ViewCompat.w0(v10, 1);
            }
        }
        if (this.f87231O == null) {
            this.f87231O = C18060c.p(coordinatorLayout, this.f87258h0);
        }
        int top = v10.getTop();
        coordinatorLayout.K(v10, i10);
        this.f87237U = coordinatorLayout.getWidth();
        this.f87238V = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f87236T = height;
        int iMin = this.f87238V;
        int i11 = iMin - height;
        int i12 = this.f87274x;
        if (i11 < i12) {
            if (this.f87269s) {
                int i13 = this.f87263m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f87236T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f87263m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f87236T = iMin2;
            }
        }
        this.f87221E = Math.max(0, this.f87238V - this.f87236T);
        f0();
        d0();
        int i15 = this.f87229M;
        if (i15 == 3) {
            ViewCompat.Y(v10, s0());
        } else if (i15 == 6) {
            ViewCompat.Y(v10, this.f87222F);
        } else if (this.f87226J && i15 == 5) {
            ViewCompat.Y(v10, this.f87238V);
        } else if (i15 == 4) {
            ViewCompat.Y(v10, this.f87224H);
        } else if (i15 == 1 || i15 == 2) {
            ViewCompat.Y(v10, top - v10.getTop());
        }
        i1(this.f87229M, false);
        this.f87241Y = new WeakReference<>(p0(v10));
        for (int i16 = 0; i16 < this.f87242Z.size(); i16++) {
            this.f87242Z.get(i16).a(v10);
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
        v10.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f87262l, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f87263m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (!D0() || (weakReference = this.f87241Y) == null || view != weakReference.get() || (this.f87229M == 3 && !super.s(coordinatorLayout, v10, view, f10, f11))) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f87243a = 0;
        this.f87245b = true;
        this.f87247c = false;
        this.f87262l = -1;
        this.f87263m = -1;
        this.f87218B = new i(this, null);
        this.f87223G = 0.5f;
        this.f87225I = -1.0f;
        this.f87228L = true;
        this.f87229M = 4;
        this.f87230N = 4;
        this.f87235S = 0.1f;
        this.f87242Z = new ArrayList<>();
        this.f87250d0 = -1;
        this.f87256g0 = new SparseIntArray();
        this.f87258h0 = new e();
        this.f87259i = context.getResources().getDimensionPixelSize(ce.d.f61635o0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f62247k0);
        if (typedArrayObtainStyledAttributes.hasValue(l.f62295o0)) {
            this.f87261k = C16634c.a(context, typedArrayObtainStyledAttributes, l.f62295o0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f61899G0)) {
            this.f87276z = C17239m.e(context, attributeSet, C6503b.f61530f, f87216i0).m();
        }
        m0(context);
        n0();
        this.f87225I = typedArrayObtainStyledAttributes.getDimension(l.f62283n0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(l.f62259l0)) {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62259l0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(l.f62271m0)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62271m0, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(l.f62367u0);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            S0(i10);
        } else {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62367u0, -1));
        }
        P0(typedArrayObtainStyledAttributes.getBoolean(l.f62355t0, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(l.f62415y0, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(l.f62331r0, true));
        W0(typedArrayObtainStyledAttributes.getBoolean(l.f62403x0, false));
        K0(typedArrayObtainStyledAttributes.getBoolean(l.f62307p0, true));
        U0(typedArrayObtainStyledAttributes.getInt(l.f62379v0, 0));
        O0(typedArrayObtainStyledAttributes.getFloat(l.f62343s0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(l.f62319q0);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            L0(typedValuePeekValue2.data);
        } else {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.f62319q0, 0));
        }
        V0(typedArrayObtainStyledAttributes.getInt(l.f62391w0, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR));
        this.f87266p = typedArrayObtainStyledAttributes.getBoolean(l.f61851C0, false);
        this.f87267q = typedArrayObtainStyledAttributes.getBoolean(l.f61863D0, false);
        this.f87268r = typedArrayObtainStyledAttributes.getBoolean(l.f61875E0, false);
        this.f87269s = typedArrayObtainStyledAttributes.getBoolean(l.f61887F0, true);
        this.f87270t = typedArrayObtainStyledAttributes.getBoolean(l.f62427z0, false);
        this.f87271u = typedArrayObtainStyledAttributes.getBoolean(l.f61827A0, false);
        this.f87272v = typedArrayObtainStyledAttributes.getBoolean(l.f61839B0, false);
        this.f87275y = typedArrayObtainStyledAttributes.getBoolean(l.f61911H0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f87249d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
