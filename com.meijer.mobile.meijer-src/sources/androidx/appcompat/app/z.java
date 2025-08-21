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
import androidx.appcompat.widget.InterfaceC5785t;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.maps.android.BuildConfig;
import i.C14578a;
import i.C14583f;
import i.C14587j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p2.C16359h0;
import p2.InterfaceC16357g0;
import p2.InterfaceC16361i0;

/* loaded from: classes.dex */
public class z extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* renamed from: E, reason: collision with root package name */
    private static final Interpolator f46246E = new AccelerateInterpolator();

    /* renamed from: F, reason: collision with root package name */
    private static final Interpolator f46247F = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    boolean f46248A;

    /* renamed from: a, reason: collision with root package name */
    Context f46252a;

    /* renamed from: b, reason: collision with root package name */
    private Context f46253b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f46254c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f46255d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f46256e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC5785t f46257f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f46258g;

    /* renamed from: h, reason: collision with root package name */
    View f46259h;

    /* renamed from: i, reason: collision with root package name */
    ScrollingTabContainerView f46260i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f46263l;

    /* renamed from: m, reason: collision with root package name */
    d f46264m;

    /* renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b f46265n;

    /* renamed from: o, reason: collision with root package name */
    b.a f46266o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f46267p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46269r;

    /* renamed from: u, reason: collision with root package name */
    boolean f46272u;

    /* renamed from: v, reason: collision with root package name */
    boolean f46273v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46274w;

    /* renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.h f46276y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f46277z;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f46261j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f46262k = -1;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<a.b> f46268q = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private int f46270s = 0;

    /* renamed from: t, reason: collision with root package name */
    boolean f46271t = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f46275x = true;

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC16357g0 f46249B = new a();

    /* renamed from: C, reason: collision with root package name */
    final InterfaceC16357g0 f46250C = new b();

    /* renamed from: D, reason: collision with root package name */
    final InterfaceC16361i0 f46251D = new c();

    class a extends C16359h0 {
        a() {
        }

        @Override // p2.InterfaceC16357g0
        public void b(View view) {
            View view2;
            z zVar = z.this;
            if (zVar.f46271t && (view2 = zVar.f46259h) != null) {
                view2.setTranslationY(0.0f);
                z.this.f46256e.setTranslationY(0.0f);
            }
            z.this.f46256e.setVisibility(8);
            z.this.f46256e.setTransitioning(false);
            z zVar2 = z.this;
            zVar2.f46276y = null;
            zVar2.G();
            ActionBarOverlayLayout actionBarOverlayLayout = z.this.f46255d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.j0(actionBarOverlayLayout);
            }
        }
    }

    class b extends C16359h0 {
        b() {
        }

        @Override // p2.InterfaceC16357g0
        public void b(View view) {
            z zVar = z.this;
            zVar.f46276y = null;
            zVar.f46256e.requestLayout();
        }
    }

    class c implements InterfaceC16361i0 {
        c() {
        }

        @Override // p2.InterfaceC16361i0
        public void a(View view) {
            ((View) z.this.f46256e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements f.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f46281c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.f f46282d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f46283e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<View> f46284f;

        public d(Context context, b.a aVar) {
            this.f46281c = context;
            this.f46283e = aVar;
            androidx.appcompat.view.menu.f fVarX = new androidx.appcompat.view.menu.f(context).X(1);
            this.f46282d = fVarX;
            fVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            b.a aVar = this.f46283e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f46283e == null) {
                return;
            }
            k();
            z.this.f46258g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            z zVar = z.this;
            if (zVar.f46264m != this) {
                return;
            }
            if (z.F(zVar.f46272u, zVar.f46273v, false)) {
                this.f46283e.a(this);
            } else {
                z zVar2 = z.this;
                zVar2.f46265n = this;
                zVar2.f46266o = this.f46283e;
            }
            this.f46283e = null;
            z.this.E(false);
            z.this.f46258g.g();
            z zVar3 = z.this;
            zVar3.f46255d.setHideOnContentScrollEnabled(zVar3.f46248A);
            z.this.f46264m = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f46284f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f46282d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f46281c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return z.this.f46258g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return z.this.f46258g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (z.this.f46264m != this) {
                return;
            }
            this.f46282d.i0();
            try {
                this.f46283e.d(this, this.f46282d);
            } finally {
                this.f46282d.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return z.this.f46258g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            z.this.f46258g.setCustomView(view);
            this.f46284f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(z.this.f46252a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            z.this.f46258g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(z.this.f46252a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            z.this.f46258g.setTitle(charSequence);
        }

        public boolean t() {
            this.f46282d.i0();
            try {
                return this.f46283e.b(this, this.f46282d);
            } finally {
                this.f46282d.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            z.this.f46258g.setTitleOptional(z10);
        }
    }

    public z(Activity activity, boolean z10) {
        this.f46254c = activity;
        View decorView = activity.getWindow().getDecorView();
        M(decorView);
        if (z10) {
            return;
        }
        this.f46259h = decorView.findViewById(R.id.content);
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
    private InterfaceC5785t J(View view) {
        if (view instanceof InterfaceC5785t) {
            return (InterfaceC5785t) view;
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
        if (this.f46274w) {
            this.f46274w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f46255d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T(false);
        }
    }

    private void M(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C14583f.f136394p);
        this.f46255d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f46257f = J(view.findViewById(C14583f.f136379a));
        this.f46258g = (ActionBarContextView) view.findViewById(C14583f.f136384f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C14583f.f136381c);
        this.f46256e = actionBarContainer;
        InterfaceC5785t interfaceC5785t = this.f46257f;
        if (interfaceC5785t == null || this.f46258g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f46252a = interfaceC5785t.getContext();
        boolean z10 = (this.f46257f.y() & 4) != 0;
        if (z10) {
            this.f46263l = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f46252a);
        z(aVarB.a() || z10);
        P(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f46252a.obtainStyledAttributes(null, C14587j.f136556a, C14578a.f136281c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C14587j.f136606k, false)) {
            Q(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14587j.f136596i, 0);
        if (dimensionPixelSize != 0) {
            O(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void P(boolean z10) {
        this.f46269r = z10;
        if (z10) {
            this.f46256e.setTabContainer(null);
            this.f46257f.t(this.f46260i);
        } else {
            this.f46257f.t(null);
            this.f46256e.setTabContainer(this.f46260i);
        }
        boolean z11 = K() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f46260i;
        if (scrollingTabContainerView != null) {
            if (z11) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f46255d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.j0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f46257f.r(!this.f46269r && z11);
        this.f46255d.setHasNonEmbeddedTabs(!this.f46269r && z11);
    }

    private boolean R() {
        return this.f46256e.isLaidOut();
    }

    private void S() {
        if (this.f46274w) {
            return;
        }
        this.f46274w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f46255d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        T(false);
    }

    private void T(boolean z10) {
        if (F(this.f46272u, this.f46273v, this.f46274w)) {
            if (this.f46275x) {
                return;
            }
            this.f46275x = true;
            I(z10);
            return;
        }
        if (this.f46275x) {
            this.f46275x = false;
            H(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f46277z = z10;
        if (z10 || (hVar = this.f46276y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void B(CharSequence charSequence) {
        this.f46257f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void C(CharSequence charSequence) {
        this.f46257f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b D(b.a aVar) {
        d dVar = this.f46264m;
        if (dVar != null) {
            dVar.c();
        }
        this.f46255d.setHideOnContentScrollEnabled(false);
        this.f46258g.k();
        d dVar2 = new d(this.f46258g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f46264m = dVar2;
        dVar2.k();
        this.f46258g.h(dVar2);
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
                this.f46257f.x(4);
                this.f46258g.setVisibility(0);
                return;
            } else {
                this.f46257f.x(0);
                this.f46258g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            hVarF = this.f46257f.m(4, 100L);
            hVarM = this.f46258g.f(0, 200L);
        } else {
            hVarM = this.f46257f.m(0, 200L);
            hVarF = this.f46258g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(hVarF, hVarM);
        hVar.h();
    }

    void G() {
        b.a aVar = this.f46266o;
        if (aVar != null) {
            aVar.a(this.f46265n);
            this.f46265n = null;
            this.f46266o = null;
        }
    }

    public void H(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f46276y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f46270s != 0 || (!this.f46277z && !z10)) {
            this.f46249B.b(null);
            return;
        }
        this.f46256e.setAlpha(1.0f);
        this.f46256e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f46256e.getHeight();
        if (z10) {
            this.f46256e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        androidx.core.view.h hVarM = ViewCompat.f(this.f46256e).m(f10);
        hVarM.j(this.f46251D);
        hVar2.c(hVarM);
        if (this.f46271t && (view = this.f46259h) != null) {
            hVar2.c(ViewCompat.f(view).m(f10));
        }
        hVar2.f(f46246E);
        hVar2.e(250L);
        hVar2.g(this.f46249B);
        this.f46276y = hVar2;
        hVar2.h();
    }

    public void I(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f46276y;
        if (hVar != null) {
            hVar.a();
        }
        this.f46256e.setVisibility(0);
        if (this.f46270s == 0 && (this.f46277z || z10)) {
            this.f46256e.setTranslationY(0.0f);
            float f10 = -this.f46256e.getHeight();
            if (z10) {
                this.f46256e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f46256e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            androidx.core.view.h hVarM = ViewCompat.f(this.f46256e).m(0.0f);
            hVarM.j(this.f46251D);
            hVar2.c(hVarM);
            if (this.f46271t && (view2 = this.f46259h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(ViewCompat.f(this.f46259h).m(0.0f));
            }
            hVar2.f(f46247F);
            hVar2.e(250L);
            hVar2.g(this.f46250C);
            this.f46276y = hVar2;
            hVar2.h();
        } else {
            this.f46256e.setAlpha(1.0f);
            this.f46256e.setTranslationY(0.0f);
            if (this.f46271t && (view = this.f46259h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f46250C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f46255d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.j0(actionBarOverlayLayout);
        }
    }

    public int K() {
        return this.f46257f.l();
    }

    public void N(int i10, int i11) {
        int iY = this.f46257f.y();
        if ((i11 & 4) != 0) {
            this.f46263l = true;
        }
        this.f46257f.i((i10 & i11) | ((~i11) & iY));
    }

    public void O(float f10) {
        ViewCompat.u0(this.f46256e, f10);
    }

    public void Q(boolean z10) {
        if (z10 && !this.f46255d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f46248A = z10;
        this.f46255d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f46273v) {
            this.f46273v = false;
            T(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f46271t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f46273v) {
            return;
        }
        this.f46273v = true;
        T(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f46276y;
        if (hVar != null) {
            hVar.a();
            this.f46276y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        InterfaceC5785t interfaceC5785t = this.f46257f;
        if (interfaceC5785t == null || !interfaceC5785t.h()) {
            return false;
        }
        this.f46257f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f46267p) {
            return;
        }
        this.f46267p = z10;
        int size = this.f46268q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f46268q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f46257f.y();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f46253b == null) {
            TypedValue typedValue = new TypedValue();
            this.f46252a.getTheme().resolveAttribute(C14578a.f136285g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f46253b = new ContextThemeWrapper(this.f46252a, i10);
            } else {
                this.f46253b = this.f46252a;
            }
        }
        return this.f46253b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (this.f46272u) {
            return;
        }
        this.f46272u = true;
        T(false);
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        P(androidx.appcompat.view.a.b(this.f46252a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f46264m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f46270s = i10;
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        if (this.f46263l) {
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
        this.f46257f.p(i10);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f46257f.j(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        this.f46257f.v(i10);
    }

    @Override // androidx.appcompat.app.a
    public void y(Drawable drawable) {
        this.f46257f.A(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void z(boolean z10) {
        this.f46257f.o(z10);
    }

    public z(Dialog dialog) {
        M(dialog.getWindow().getDecorView());
    }
}
