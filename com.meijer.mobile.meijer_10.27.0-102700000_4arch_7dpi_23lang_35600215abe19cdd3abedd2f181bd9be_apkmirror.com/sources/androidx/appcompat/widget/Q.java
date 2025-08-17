package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import i.C14575a;
import i.C14579e;
import i.C14580f;
import i.C14582h;
import i.C14584j;
import j.C14791a;
import n.C15714a;
import p2.C16214h0;

/* loaded from: classes.dex */
public class Q implements InterfaceC5643t {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f46720a;

    /* renamed from: b, reason: collision with root package name */
    private int f46721b;

    /* renamed from: c, reason: collision with root package name */
    private View f46722c;

    /* renamed from: d, reason: collision with root package name */
    private View f46723d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f46724e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f46725f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f46726g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46727h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f46728i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f46729j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f46730k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f46731l;

    /* renamed from: m, reason: collision with root package name */
    boolean f46732m;

    /* renamed from: n, reason: collision with root package name */
    private ActionMenuPresenter f46733n;

    /* renamed from: o, reason: collision with root package name */
    private int f46734o;

    /* renamed from: p, reason: collision with root package name */
    private int f46735p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f46736q;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final C15714a f46737a;

        a() {
            this.f46737a = new C15714a(Q.this.f46720a.getContext(), 0, R.id.home, 0, 0, Q.this.f46728i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Q q10 = Q.this;
            Window.Callback callback = q10.f46731l;
            if (callback == null || !q10.f46732m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f46737a);
        }
    }

    class b extends C16214h0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46739a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46740b;

        @Override // p2.C16214h0, p2.InterfaceC16212g0
        public void a(View view) {
            this.f46739a = true;
        }

        b(int i10) {
            this.f46740b = i10;
        }

        @Override // p2.InterfaceC16212g0
        public void b(View view) {
            if (this.f46739a) {
                return;
            }
            Q.this.f46720a.setVisibility(this.f46740b);
        }

        @Override // p2.C16214h0, p2.InterfaceC16212g0
        public void c(View view) {
            Q.this.f46720a.setVisibility(0);
        }
    }

    public Q(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, C14582h.f136666a, C14579e.f136602n);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void f() {
        this.f46732m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void o(boolean z10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void setTitle(CharSequence charSequence) {
        this.f46727h = true;
        G(charSequence);
    }

    public Q(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f46734o = 0;
        this.f46735p = 0;
        this.f46720a = toolbar;
        this.f46728i = toolbar.getTitle();
        this.f46729j = toolbar.getSubtitle();
        this.f46727h = this.f46728i != null;
        this.f46726g = toolbar.getNavigationIcon();
        M mV = M.v(toolbar.getContext(), null, C14584j.f136799a, C14575a.f136524c, 0);
        this.f46736q = mV.g(C14584j.f136854l);
        if (z10) {
            CharSequence charSequenceP = mV.p(C14584j.f136884r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = mV.p(C14584j.f136874p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                F(charSequenceP2);
            }
            Drawable drawableG = mV.g(C14584j.f136864n);
            if (drawableG != null) {
                E(drawableG);
            }
            Drawable drawableG2 = mV.g(C14584j.f136859m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f46726g == null && (drawable = this.f46736q) != null) {
                A(drawable);
            }
            i(mV.k(C14584j.f136834h, 0));
            int iN = mV.n(C14584j.f136829g, 0);
            if (iN != 0) {
                C(LayoutInflater.from(this.f46720a.getContext()).inflate(iN, (ViewGroup) this.f46720a, false));
                i(this.f46721b | 16);
            }
            int iM = mV.m(C14584j.f136844j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f46720a.getLayoutParams();
                layoutParams.height = iM;
                this.f46720a.setLayoutParams(layoutParams);
            }
            int iE = mV.e(C14584j.f136824f, -1);
            int iE2 = mV.e(C14584j.f136819e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f46720a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = mV.n(C14584j.f136889s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f46720a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = mV.n(C14584j.f136879q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f46720a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = mV.n(C14584j.f136869o, 0);
            if (iN4 != 0) {
                this.f46720a.setPopupTheme(iN4);
            }
        } else {
            this.f46721b = B();
        }
        mV.x();
        D(i10);
        this.f46730k = this.f46720a.getNavigationContentDescription();
        this.f46720a.setNavigationOnClickListener(new a());
    }

    private int B() {
        if (this.f46720a.getNavigationIcon() == null) {
            return 11;
        }
        this.f46736q = this.f46720a.getNavigationIcon();
        return 15;
    }

    private void G(CharSequence charSequence) {
        this.f46728i = charSequence;
        if ((this.f46721b & 8) != 0) {
            this.f46720a.setTitle(charSequence);
            if (this.f46727h) {
                ViewCompat.p0(this.f46720a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f46721b & 4) != 0) {
            if (TextUtils.isEmpty(this.f46730k)) {
                this.f46720a.setNavigationContentDescription(this.f46735p);
            } else {
                this.f46720a.setNavigationContentDescription(this.f46730k);
            }
        }
    }

    private void I() {
        if ((this.f46721b & 4) == 0) {
            this.f46720a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f46720a;
        Drawable drawable = this.f46726g;
        if (drawable == null) {
            drawable = this.f46736q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f46721b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f46725f) == null) {
            drawable = this.f46724e;
        }
        this.f46720a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void A(Drawable drawable) {
        this.f46726g = drawable;
        I();
    }

    public void C(View view) {
        View view2 = this.f46723d;
        if (view2 != null && (this.f46721b & 16) != 0) {
            this.f46720a.removeView(view2);
        }
        this.f46723d = view;
        if (view == null || (this.f46721b & 16) == 0) {
            return;
        }
        this.f46720a.addView(view);
    }

    public void D(int i10) {
        if (i10 == this.f46735p) {
            return;
        }
        this.f46735p = i10;
        if (TextUtils.isEmpty(this.f46720a.getNavigationContentDescription())) {
            p(this.f46735p);
        }
    }

    public void E(Drawable drawable) {
        this.f46725f = drawable;
        J();
    }

    public void F(CharSequence charSequence) {
        this.f46729j = charSequence;
        if ((this.f46721b & 8) != 0) {
            this.f46720a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public boolean a() {
        return this.f46720a.d();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public boolean b() {
        return this.f46720a.w();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public boolean c() {
        return this.f46720a.Q();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void collapseActionView() {
        this.f46720a.e();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void d(Menu menu, j.a aVar) {
        if (this.f46733n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f46720a.getContext());
            this.f46733n = actionMenuPresenter;
            actionMenuPresenter.r(C14580f.f136628g);
        }
        this.f46733n.e(aVar);
        this.f46720a.K((androidx.appcompat.view.menu.f) menu, this.f46733n);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public boolean e() {
        return this.f46720a.B();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public boolean g() {
        return this.f46720a.A();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public Context getContext() {
        return this.f46720a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public CharSequence getTitle() {
        return this.f46720a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public boolean h() {
        return this.f46720a.v();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void i(int i10) {
        View view;
        int i11 = this.f46721b ^ i10;
        this.f46721b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f46720a.setTitle(this.f46728i);
                    this.f46720a.setSubtitle(this.f46729j);
                } else {
                    this.f46720a.setTitle((CharSequence) null);
                    this.f46720a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f46723d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f46720a.addView(view);
            } else {
                this.f46720a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void j(CharSequence charSequence) {
        this.f46730k = charSequence;
        H();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public Menu k() {
        return this.f46720a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public int l() {
        return this.f46734o;
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public androidx.core.view.h m(int i10, long j10) {
        return ViewCompat.f(this.f46720a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public ViewGroup n() {
        return this.f46720a;
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void p(int i10) {
        j(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void q() {
        FS.log_i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void r(boolean z10) {
        this.f46720a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void s() {
        this.f46720a.f();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void setIcon(Drawable drawable) {
        this.f46724e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void setWindowCallback(Window.Callback callback) {
        this.f46731l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f46727h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void t(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f46722c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f46720a;
            if (parent == toolbar) {
                toolbar.removeView(this.f46722c);
            }
        }
        this.f46722c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f46734o != 2) {
            return;
        }
        this.f46720a.addView(scrollingTabContainerView, 0);
        Toolbar.g gVar = (Toolbar.g) this.f46722c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f45937a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void u(int i10) {
        E(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void v(int i10) {
        A(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void w(j.a aVar, f.a aVar2) {
        this.f46720a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void x(int i10) {
        this.f46720a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public int y() {
        return this.f46721b;
    }

    @Override // androidx.appcompat.widget.InterfaceC5643t
    public void z() {
        FS.log_i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
}
