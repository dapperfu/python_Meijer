package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC5643t;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.maps.android.BuildConfig;
import i.C14575a;
import i.C14580f;
import i.C14584j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p2.C16214h0;
import p2.InterfaceC16212g0;
import p2.InterfaceC16216i0;

/* loaded from: classes.dex */
public class z extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* renamed from: E, reason: collision with root package name */
    private static final Interpolator f46022E = new AccelerateInterpolator();

    /* renamed from: F, reason: collision with root package name */
    private static final Interpolator f46023F = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    boolean f46024A;

    /* renamed from: a, reason: collision with root package name */
    Context f46028a;

    /* renamed from: b, reason: collision with root package name */
    private Context f46029b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f46030c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f46031d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f46032e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC5643t f46033f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f46034g;

    /* renamed from: h, reason: collision with root package name */
    View f46035h;

    /* renamed from: i, reason: collision with root package name */
    ScrollingTabContainerView f46036i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f46039l;

    /* renamed from: m, reason: collision with root package name */
    d f46040m;

    /* renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b f46041n;

    /* renamed from: o, reason: collision with root package name */
    b.a f46042o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f46043p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46045r;

    /* renamed from: u, reason: collision with root package name */
    boolean f46048u;

    /* renamed from: v, reason: collision with root package name */
    boolean f46049v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46050w;

    /* renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.h f46052y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f46053z;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f46037j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f46038k = -1;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<a.b> f46044q = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private int f46046s = 0;

    /* renamed from: t, reason: collision with root package name */
    boolean f46047t = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f46051x = true;

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC16212g0 f46025B = new a();

    /* renamed from: C, reason: collision with root package name */
    final InterfaceC16212g0 f46026C = new b();

    /* renamed from: D, reason: collision with root package name */
    final InterfaceC16216i0 f46027D = new c();

    class a extends C16214h0 {
        a() {
        }

        @Override // p2.InterfaceC16212g0
        public void b(View view) {
            View view2;
            z zVar = z.this;
            if (zVar.f46047t && (view2 = zVar.f46035h) != null) {
                view2.setTranslationY(0.0f);
                z.this.f46032e.setTranslationY(0.0f);
            }
            z.this.f46032e.setVisibility(8);
            z.this.f46032e.setTransitioning(false);
            z zVar2 = z.this;
            zVar2.f46052y = null;
            zVar2.G();
            ActionBarOverlayLayout actionBarOverlayLayout = z.this.f46031d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.j0(actionBarOverlayLayout);
            }
        }
    }

    class b extends C16214h0 {
        b() {
        }

        @Override // p2.InterfaceC16212g0
        public void b(View view) {
            z zVar = z.this;
            zVar.f46052y = null;
            zVar.f46032e.requestLayout();
        }
    }

    class c implements InterfaceC16216i0 {
        c() {
        }

        @Override // p2.InterfaceC16216i0
        public void a(View view) {
            ((View) z.this.f46032e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements f.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f46057c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.f f46058d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f46059e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<View> f46060f;

        public d(Context context, b.a aVar) {
            this.f46057c = context;
            this.f46059e = aVar;
            androidx.appcompat.view.menu.f fVarX = new androidx.appcompat.view.menu.f(context).X(1);
            this.f46058d = fVarX;
            fVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            b.a aVar = this.f46059e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f46059e == null) {
                return;
            }
            k();
            z.this.f46034g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            z zVar = z.this;
            if (zVar.f46040m != this) {
                return;
            }
            if (z.F(zVar.f46048u, zVar.f46049v, false)) {
                this.f46059e.a(this);
            } else {
                z zVar2 = z.this;
                zVar2.f46041n = this;
                zVar2.f46042o = this.f46059e;
            }
            this.f46059e = null;
            z.this.E(false);
            z.this.f46034g.g();
            z zVar3 = z.this;
            zVar3.f46031d.setHideOnContentScrollEnabled(zVar3.f46024A);
            z.this.f46040m = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f46060f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f46058d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f46057c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return z.this.f46034g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return z.this.f46034g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (z.this.f46040m != this) {
                return;
            }
            this.f46058d.i0();
            try {
                this.f46059e.d(this, this.f46058d);
            } finally {
                this.f46058d.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return z.this.f46034g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            z.this.f46034g.setCustomView(view);
            this.f46060f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(z.this.f46028a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            z.this.f46034g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(z.this.f46028a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            z.this.f46034g.setTitle(charSequence);
        }

        public boolean t() {
            this.f46058d.i0();
            try {
                return this.f46059e.b(this, this.f46058d);
            } finally {
                this.f46058d.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            z.this.f46034g.setTitleOptional(z10);
        }
    }

    public z(Activity activity, boolean z10) {
        this.f46030c = activity;
        View decorView = activity.getWindow().getDecorView();
        M(decorView);
        if (z10) {
            return;
        }
        this.f46035h = decorView.findViewById(R.id.content);
    }

    static boolean F(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        N(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        N(z10 ? 1 : 0, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC5643t J(View view) {
        if (view instanceof InterfaceC5643t) {
            return (InterfaceC5643t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : BuildConfig.TRAVIS);
        throw new IllegalStateException(sb2.toString());
    }

    private void L() {
        if (this.f46050w) {
            this.f46050w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f46031d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T(false);
        }
    }

    private void M(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C14580f.f136637p);
        this.f46031d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f46033f = J(view.findViewById(C14580f.f136622a));
        this.f46034g = (ActionBarContextView) view.findViewById(C14580f.f136627f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C14580f.f136624c);
        this.f46032e = actionBarContainer;
        InterfaceC5643t interfaceC5643t = this.f46033f;
        if (interfaceC5643t == null || this.f46034g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f46028a = interfaceC5643t.getContext();
        boolean z10 = (this.f46033f.y() & 4) != 0;
        if (z10) {
            this.f46039l = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f46028a);
        z(aVarB.a() || z10);
        P(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f46028a.obtainStyledAttributes(null, C14584j.f136799a, C14575a.f136524c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C14584j.f136849k, false)) {
            Q(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14584j.f136839i, 0);
        if (dimensionPixelSize != 0) {
            O(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void P(boolean z10) {
        this.f46045r = z10;
        if (z10) {
            this.f46032e.setTabContainer(null);
            this.f46033f.t(this.f46036i);
        } else {
            this.f46033f.t(null);
            this.f46032e.setTabContainer(this.f46036i);
        }
        boolean z11 = K() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f46036i;
        if (scrollingTabContainerView != null) {
            if (z11) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f46031d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.j0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f46033f.r(!this.f46045r && z11);
        this.f46031d.setHasNonEmbeddedTabs(!this.f46045r && z11);
    }

    private boolean R() {
        return this.f46032e.isLaidOut();
    }

    private void S() {
        if (this.f46050w) {
            return;
        }
        this.f46050w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f46031d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        T(false);
    }

    private void T(boolean z10) {
        if (F(this.f46048u, this.f46049v, this.f46050w)) {
            if (this.f46051x) {
                return;
            }
            this.f46051x = true;
            I(z10);
            return;
        }
        if (this.f46051x) {
            this.f46051x = false;
            H(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f46053z = z10;
        if (z10 || (hVar = this.f46052y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void B(CharSequence charSequence) {
        this.f46033f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void C(CharSequence charSequence) {
        this.f46033f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b D(b.a aVar) {
        d dVar = this.f46040m;
        if (dVar != null) {
            dVar.c();
        }
        this.f46031d.setHideOnContentScrollEnabled(false);
        this.f46034g.k();
        d dVar2 = new d(this.f46034g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f46040m = dVar2;
        dVar2.k();
        this.f46034g.h(dVar2);
        E(true);
        return dVar2;
    }

    public void E(boolean z10) {
        androidx.core.view.h hVarM;
        androidx.core.view.h hVarF;
        if (z10) {
            S();
        } else {
            L();
        }
        if (!R()) {
            if (z10) {
                this.f46033f.x(4);
                this.f46034g.setVisibility(0);
                return;
            } else {
                this.f46033f.x(0);
                this.f46034g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            hVarF = this.f46033f.m(4, 100L);
            hVarM = this.f46034g.f(0, 200L);
        } else {
            hVarM = this.f46033f.m(0, 200L);
            hVarF = this.f46034g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(hVarF, hVarM);
        hVar.h();
    }

    void G() {
        b.a aVar = this.f46042o;
        if (aVar != null) {
            aVar.a(this.f46041n);
            this.f46041n = null;
            this.f46042o = null;
        }
    }

    public void H(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f46052y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f46046s != 0 || (!this.f46053z && !z10)) {
            this.f46025B.b(null);
            return;
        }
        this.f46032e.setAlpha(1.0f);
        this.f46032e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f46032e.getHeight();
        if (z10) {
            this.f46032e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        androidx.core.view.h hVarM = ViewCompat.f(this.f46032e).m(f10);
        hVarM.j(this.f46027D);
        hVar2.c(hVarM);
        if (this.f46047t && (view = this.f46035h) != null) {
            hVar2.c(ViewCompat.f(view).m(f10));
        }
        hVar2.f(f46022E);
        hVar2.e(250L);
        hVar2.g(this.f46025B);
        this.f46052y = hVar2;
        hVar2.h();
    }

    public void I(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f46052y;
        if (hVar != null) {
            hVar.a();
        }
        this.f46032e.setVisibility(0);
        if (this.f46046s == 0 && (this.f46053z || z10)) {
            this.f46032e.setTranslationY(0.0f);
            float f10 = -this.f46032e.getHeight();
            if (z10) {
                this.f46032e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f46032e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            androidx.core.view.h hVarM = ViewCompat.f(this.f46032e).m(0.0f);
            hVarM.j(this.f46027D);
            hVar2.c(hVarM);
            if (this.f46047t && (view2 = this.f46035h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(ViewCompat.f(this.f46035h).m(0.0f));
            }
            hVar2.f(f46023F);
            hVar2.e(250L);
            hVar2.g(this.f46026C);
            this.f46052y = hVar2;
            hVar2.h();
        } else {
            this.f46032e.setAlpha(1.0f);
            this.f46032e.setTranslationY(0.0f);
            if (this.f46047t && (view = this.f46035h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f46026C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f46031d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.j0(actionBarOverlayLayout);
        }
    }

    public int K() {
        return this.f46033f.l();
    }

    public void N(int i10, int i11) {
        int iY = this.f46033f.y();
        if ((i11 & 4) != 0) {
            this.f46039l = true;
        }
        this.f46033f.i((i10 & i11) | ((~i11) & iY));
    }

    public void O(float f10) {
        ViewCompat.u0(this.f46032e, f10);
    }

    public void Q(boolean z10) {
        if (z10 && !this.f46031d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f46024A = z10;
        this.f46031d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f46049v) {
            this.f46049v = false;
            T(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f46047t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f46049v) {
            return;
        }
        this.f46049v = true;
        T(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f46052y;
        if (hVar != null) {
            hVar.a();
            this.f46052y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        InterfaceC5643t interfaceC5643t = this.f46033f;
        if (interfaceC5643t == null || !interfaceC5643t.h()) {
            return false;
        }
        this.f46033f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f46043p) {
            return;
        }
        this.f46043p = z10;
        int size = this.f46044q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f46044q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f46033f.y();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f46029b == null) {
            TypedValue typedValue = new TypedValue();
            this.f46028a.getTheme().resolveAttribute(C14575a.f136528g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f46029b = new ContextThemeWrapper(this.f46028a, i10);
            } else {
                this.f46029b = this.f46028a;
            }
        }
        return this.f46029b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (this.f46048u) {
            return;
        }
        this.f46048u = true;
        T(false);
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        P(androidx.appcompat.view.a.b(this.f46028a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f46040m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f46046s = i10;
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        if (this.f46039l) {
            return;
        }
        s(z10);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        N(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void v(int i10) {
        this.f46033f.p(i10);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f46033f.j(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        this.f46033f.v(i10);
    }

    @Override // androidx.appcompat.app.a
    public void y(Drawable drawable) {
        this.f46033f.A(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void z(boolean z10) {
        this.f46033f.o(z10);
    }

    public z(Dialog dialog) {
        M(dialog.getWindow().getDecorView());
    }
}
