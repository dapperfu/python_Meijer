package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import ce.C6503b;
import ce.h;
import ce.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.x;
import ke.C15121a;
import p2.C16363j0;
import p2.G;
import q2.y;
import te.C17234h;

/* loaded from: classes4.dex */
public class a extends q {

    /* renamed from: f, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f87299f;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f87300g;

    /* renamed from: h, reason: collision with root package name */
    private CoordinatorLayout f87301h;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f87302i;

    /* renamed from: j, reason: collision with root package name */
    boolean f87303j;

    /* renamed from: k, reason: collision with root package name */
    boolean f87304k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87305l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87306m;

    /* renamed from: n, reason: collision with root package name */
    private f f87307n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f87308o;

    /* renamed from: p, reason: collision with root package name */
    private pe.c f87309p;

    /* renamed from: q, reason: collision with root package name */
    private BottomSheetBehavior.g f87310q;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C1273a implements G {
        C1273a() {
        }

        @Override // p2.G
        public j onApplyWindowInsets(View view, j jVar) {
            if (a.this.f87307n != null) {
                a.this.f87299f.E0(a.this.f87307n);
            }
            if (jVar != null) {
                a aVar = a.this;
                aVar.f87307n = new f(aVar.f87302i, jVar, null);
                a.this.f87307n.e(a.this.getWindow());
                a.this.f87299f.c0(a.this.f87307n);
            }
            return jVar;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f87304k && aVar.isShowing() && a.this.q()) {
                a.this.cancel();
            }
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f87304k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            if (a.this.f87304k) {
                yVar.a(1048576);
                yVar.v0(true);
            } else {
                yVar.v0(false);
            }
        }
    }

    class d implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }

        d() {
        }
    }

    class e extends BottomSheetBehavior.g {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }

        e() {
        }
    }

    private static class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f87316a;

        /* renamed from: b, reason: collision with root package name */
        private final j f87317b;

        /* renamed from: c, reason: collision with root package name */
        private Window f87318c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f87319d;

        /* synthetic */ f(View view, j jVar, C1273a c1273a) {
            this(view, jVar);
        }

        private f(View view, j jVar) {
            this.f87317b = jVar;
            C17234h c17234hT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListX = c17234hT0 != null ? c17234hT0.x() : ViewCompat.r(view);
            if (colorStateListX != null) {
                this.f87316a = Boolean.valueOf(C15121a.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numE = x.e(view);
            if (numE != null) {
                this.f87316a = Boolean.valueOf(C15121a.h(numE.intValue()));
            } else {
                this.f87316a = null;
            }
        }

        void e(Window window) {
            if (this.f87318c == window) {
                return;
            }
            this.f87318c = window;
            if (window != null) {
                this.f87319d = C16363j0.a(window, window.getDecorView()).a();
            }
        }

        private void d(View view) {
            boolean zBooleanValue;
            if (view.getTop() < this.f87317b.m()) {
                Window window = this.f87318c;
                if (window != null) {
                    Boolean bool = this.f87316a;
                    if (bool == null) {
                        zBooleanValue = this.f87319d;
                    } else {
                        zBooleanValue = bool.booleanValue();
                    }
                    com.google.android.material.internal.e.f(window, zBooleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.f87317b.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f87318c;
                if (window2 != null) {
                    com.google.android.material.internal.e.f(window2, this.f87319d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            d(view);
        }
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(s(i10, null, null));
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C6503b.f61528e, typedValue, true) ? typedValue.resourceId : k.f61807h;
    }

    private FrameLayout m() {
        if (this.f87300g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f61730a, null);
            this.f87300g = frameLayout;
            this.f87301h = (CoordinatorLayout) frameLayout.findViewById(ce.f.f61703g);
            FrameLayout frameLayout2 = (FrameLayout) this.f87300g.findViewById(ce.f.f61704h);
            this.f87302i = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f87299f = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f87310q);
            this.f87299f.P0(this.f87304k);
            this.f87309p = new pe.c(this.f87299f, this.f87302i);
        }
        return this.f87300g;
    }

    private void r() {
        pe.c cVar = this.f87309p;
        if (cVar == null) {
            return;
        }
        if (this.f87304k) {
            cVar.c();
        } else {
            cVar.f();
        }
    }

    public BottomSheetBehavior<FrameLayout> n() {
        if (this.f87299f == null) {
            m();
        }
        return this.f87299f;
    }

    public boolean o() {
        return this.f87303j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f87307n;
        if (fVar != null) {
            fVar.e(null);
        }
        pe.c cVar = this.f87309p;
        if (cVar != null) {
            cVar.f();
        }
    }

    void p() {
        this.f87299f.E0(this.f87310q);
    }

    boolean q() {
        if (!this.f87306m) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f87305l = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f87306m = true;
        }
        return this.f87305l;
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(s(0, view, null));
    }

    public a(Context context, int i10) {
        super(context, f(context, i10));
        this.f87304k = true;
        this.f87305l = true;
        this.f87310q = new e();
        h(1);
        this.f87308o = getContext().getTheme().obtainStyledAttributes(new int[]{C6503b.f61563y}).getBoolean(0, false);
    }

    private View s(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f87300g.findViewById(ce.f.f61703g);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f87308o) {
            ViewCompat.A0(this.f87302i, new C1273a());
        }
        this.f87302i.removeAllViews();
        if (layoutParams == null) {
            this.f87302i.addView(view);
        } else {
            this.f87302i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ce.f.f61694Y).setOnClickListener(new b());
        ViewCompat.m0(this.f87302i, new c());
        this.f87302i.setOnTouchListener(new d());
        return this.f87300g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorN = n();
        if (this.f87303j && bottomSheetBehaviorN.u0() != 5) {
            bottomSheetBehaviorN.X0(5);
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f87308o && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f87300g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f87301h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            C16363j0.b(window, !z10);
            f fVar = this.f87307n;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        r();
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.view.q, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f87299f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.u0() == 5) {
            this.f87299f.X0(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f87304k != z10) {
            this.f87304k = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f87299f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.P0(z10);
            }
            if (getWindow() != null) {
                r();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f87304k) {
            this.f87304k = true;
        }
        this.f87305l = z10;
        this.f87306m = true;
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(s(0, view, layoutParams));
    }
}
