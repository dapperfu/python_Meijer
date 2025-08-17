package com.google.android.material.bottomsheet;

import ae.C5597b;
import ae.h;
import ae.k;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.x;
import ie.C14718a;
import p2.C16218j0;
import p2.G;
import q2.y;
import re.C16760h;

/* loaded from: classes4.dex */
public class a extends q {

    /* renamed from: f, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f86459f;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f86460g;

    /* renamed from: h, reason: collision with root package name */
    private CoordinatorLayout f86461h;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f86462i;

    /* renamed from: j, reason: collision with root package name */
    boolean f86463j;

    /* renamed from: k, reason: collision with root package name */
    boolean f86464k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f86465l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f86466m;

    /* renamed from: n, reason: collision with root package name */
    private f f86467n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f86468o;

    /* renamed from: p, reason: collision with root package name */
    private ne.c f86469p;

    /* renamed from: q, reason: collision with root package name */
    private BottomSheetBehavior.g f86470q;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C1264a implements G {
        C1264a() {
        }

        @Override // p2.G
        public j onApplyWindowInsets(View view, j jVar) {
            if (a.this.f86467n != null) {
                a.this.f86459f.E0(a.this.f86467n);
            }
            if (jVar != null) {
                a aVar = a.this;
                aVar.f86467n = new f(aVar.f86462i, jVar, null);
                a.this.f86467n.e(a.this.getWindow());
                a.this.f86459f.c0(a.this.f86467n);
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
            if (aVar.f86464k && aVar.isShowing() && a.this.q()) {
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
                if (aVar.f86464k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            if (a.this.f86464k) {
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
        private final Boolean f86476a;

        /* renamed from: b, reason: collision with root package name */
        private final j f86477b;

        /* renamed from: c, reason: collision with root package name */
        private Window f86478c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f86479d;

        /* synthetic */ f(View view, j jVar, C1264a c1264a) {
            this(view, jVar);
        }

        private f(View view, j jVar) {
            this.f86477b = jVar;
            C16760h c16760hT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListX = c16760hT0 != null ? c16760hT0.x() : ViewCompat.r(view);
            if (colorStateListX != null) {
                this.f86476a = Boolean.valueOf(C14718a.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numE = x.e(view);
            if (numE != null) {
                this.f86476a = Boolean.valueOf(C14718a.h(numE.intValue()));
            } else {
                this.f86476a = null;
            }
        }

        void e(Window window) {
            if (this.f86478c == window) {
                return;
            }
            this.f86478c = window;
            if (window != null) {
                this.f86479d = C16218j0.a(window, window.getDecorView()).a();
            }
        }

        private void d(View view) {
            boolean zBooleanValue;
            if (view.getTop() < this.f86477b.m()) {
                Window window = this.f86478c;
                if (window != null) {
                    Boolean bool = this.f86476a;
                    if (bool == null) {
                        zBooleanValue = this.f86479d;
                    } else {
                        zBooleanValue = bool.booleanValue();
                    }
                    com.google.android.material.internal.e.f(window, zBooleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.f86477b.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f86478c;
                if (window2 != null) {
                    com.google.android.material.internal.e.f(window2, this.f86479d);
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
        return context.getTheme().resolveAttribute(C5597b.f44513e, typedValue, true) ? typedValue.resourceId : k.f44792h;
    }

    private FrameLayout m() {
        if (this.f86460g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f44715a, null);
            this.f86460g = frameLayout;
            this.f86461h = (CoordinatorLayout) frameLayout.findViewById(ae.f.f44688g);
            FrameLayout frameLayout2 = (FrameLayout) this.f86460g.findViewById(ae.f.f44689h);
            this.f86462i = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f86459f = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f86470q);
            this.f86459f.P0(this.f86464k);
            this.f86469p = new ne.c(this.f86459f, this.f86462i);
        }
        return this.f86460g;
    }

    private void r() {
        ne.c cVar = this.f86469p;
        if (cVar == null) {
            return;
        }
        if (this.f86464k) {
            cVar.c();
        } else {
            cVar.f();
        }
    }

    public BottomSheetBehavior<FrameLayout> n() {
        if (this.f86459f == null) {
            m();
        }
        return this.f86459f;
    }

    public boolean o() {
        return this.f86463j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f86467n;
        if (fVar != null) {
            fVar.e(null);
        }
        ne.c cVar = this.f86469p;
        if (cVar != null) {
            cVar.f();
        }
    }

    void p() {
        this.f86459f.E0(this.f86470q);
    }

    boolean q() {
        if (!this.f86466m) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f86465l = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f86466m = true;
        }
        return this.f86465l;
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(s(0, view, null));
    }

    public a(Context context, int i10) {
        super(context, f(context, i10));
        this.f86464k = true;
        this.f86465l = true;
        this.f86470q = new e();
        h(1);
        this.f86468o = getContext().getTheme().obtainStyledAttributes(new int[]{C5597b.f44548y}).getBoolean(0, false);
    }

    private View s(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f86460g.findViewById(ae.f.f44688g);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f86468o) {
            ViewCompat.A0(this.f86462i, new C1264a());
        }
        this.f86462i.removeAllViews();
        if (layoutParams == null) {
            this.f86462i.addView(view);
        } else {
            this.f86462i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ae.f.f44679Y).setOnClickListener(new b());
        ViewCompat.m0(this.f86462i, new c());
        this.f86462i.setOnTouchListener(new d());
        return this.f86460g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorN = n();
        if (this.f86463j && bottomSheetBehaviorN.u0() != 5) {
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
            if (this.f86468o && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f86460g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f86461h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            C16218j0.b(window, !z10);
            f fVar = this.f86467n;
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
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f86459f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.u0() == 5) {
            this.f86459f.X0(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f86464k != z10) {
            this.f86464k = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f86459f;
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
        if (z10 && !this.f86464k) {
            this.f86464k = true;
        }
        this.f86465l = z10;
        this.f86466m = true;
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(s(0, view, layoutParams));
    }
}
