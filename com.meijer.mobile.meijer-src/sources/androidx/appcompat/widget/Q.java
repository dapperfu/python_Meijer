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
import i.C14578a;
import i.C14582e;
import i.C14583f;
import i.C14585h;
import i.C14587j;
import j.C14879a;
import n.C15841a;
import p2.C16359h0;

/* loaded from: classes.dex */
public class Q implements InterfaceC5785t {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f46944a;

    /* renamed from: b, reason: collision with root package name */
    private int f46945b;

    /* renamed from: c, reason: collision with root package name */
    private View f46946c;

    /* renamed from: d, reason: collision with root package name */
    private View f46947d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f46948e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f46949f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f46950g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46951h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f46952i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f46953j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f46954k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f46955l;

    /* renamed from: m, reason: collision with root package name */
    boolean f46956m;

    /* renamed from: n, reason: collision with root package name */
    private ActionMenuPresenter f46957n;

    /* renamed from: o, reason: collision with root package name */
    private int f46958o;

    /* renamed from: p, reason: collision with root package name */
    private int f46959p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f46960q;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final C15841a f46961a;

        a() {
            this.f46961a = new C15841a(Q.this.f46944a.getContext(), 0, R.id.home, 0, 0, Q.this.f46952i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Q q10 = Q.this;
            Window.Callback callback = q10.f46955l;
            if (callback == null || !q10.f46956m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f46961a);
        }
    }

    class b extends C16359h0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46963a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46964b;

        @Override // p2.C16359h0, p2.InterfaceC16357g0
        public void a(View view) {
            this.f46963a = true;
        }

        b(int i10) {
            this.f46964b = i10;
        }

        @Override // p2.InterfaceC16357g0
        public void b(View view) {
            if (this.f46963a) {
                return;
            }
            Q.this.f46944a.setVisibility(this.f46964b);
        }

        @Override // p2.C16359h0, p2.InterfaceC16357g0
        public void c(View view) {
            Q.this.f46944a.setVisibility(0);
        }
    }

    public Q(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, C14585h.f136423a, C14582e.f136359n);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void f() {
        this.f46956m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void o(boolean z10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void setTitle(CharSequence charSequence) {
        this.f46951h = true;
        G(charSequence);
    }

    public Q(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f46958o = 0;
        this.f46959p = 0;
        this.f46944a = toolbar;
        this.f46952i = toolbar.getTitle();
        this.f46953j = toolbar.getSubtitle();
        this.f46951h = this.f46952i != null;
        this.f46950g = toolbar.getNavigationIcon();
        M mV = M.v(toolbar.getContext(), null, C14587j.f136556a, C14578a.f136281c, 0);
        this.f46960q = mV.g(C14587j.f136611l);
        if (z10) {
            CharSequence charSequenceP = mV.p(C14587j.f136641r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = mV.p(C14587j.f136631p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                F(charSequenceP2);
            }
            Drawable drawableG = mV.g(C14587j.f136621n);
            if (drawableG != null) {
                E(drawableG);
            }
            Drawable drawableG2 = mV.g(C14587j.f136616m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f46950g == null && (drawable = this.f46960q) != null) {
                A(drawable);
            }
            i(mV.k(C14587j.f136591h, 0));
            int iN = mV.n(C14587j.f136586g, 0);
            if (iN != 0) {
                C(LayoutInflater.from(this.f46944a.getContext()).inflate(iN, (ViewGroup) this.f46944a, false));
                i(this.f46945b | 16);
            }
            int iM = mV.m(C14587j.f136601j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f46944a.getLayoutParams();
                layoutParams.height = iM;
                this.f46944a.setLayoutParams(layoutParams);
            }
            int iE = mV.e(C14587j.f136581f, -1);
            int iE2 = mV.e(C14587j.f136576e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f46944a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = mV.n(C14587j.f136646s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f46944a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = mV.n(C14587j.f136636q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f46944a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = mV.n(C14587j.f136626o, 0);
            if (iN4 != 0) {
                this.f46944a.setPopupTheme(iN4);
            }
        } else {
            this.f46945b = B();
        }
        mV.x();
        D(i10);
        this.f46954k = this.f46944a.getNavigationContentDescription();
        this.f46944a.setNavigationOnClickListener(new a());
    }

    private int B() {
        if (this.f46944a.getNavigationIcon() == null) {
            return 11;
        }
        this.f46960q = this.f46944a.getNavigationIcon();
        return 15;
    }

    private void G(CharSequence charSequence) {
        this.f46952i = charSequence;
        if ((this.f46945b & 8) != 0) {
            this.f46944a.setTitle(charSequence);
            if (this.f46951h) {
                ViewCompat.p0(this.f46944a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f46945b & 4) != 0) {
            if (TextUtils.isEmpty(this.f46954k)) {
                this.f46944a.setNavigationContentDescription(this.f46959p);
            } else {
                this.f46944a.setNavigationContentDescription(this.f46954k);
            }
        }
    }

    private void I() {
        if ((this.f46945b & 4) == 0) {
            this.f46944a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f46944a;
        Drawable drawable = this.f46950g;
        if (drawable == null) {
            drawable = this.f46960q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f46945b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f46949f) == null) {
            drawable = this.f46948e;
        }
        this.f46944a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void A(Drawable drawable) {
        this.f46950g = drawable;
        I();
    }

    public void C(View view) {
        View view2 = this.f46947d;
        if (view2 != null && (this.f46945b & 16) != 0) {
            this.f46944a.removeView(view2);
        }
        this.f46947d = view;
        if (view == null || (this.f46945b & 16) == 0) {
            return;
        }
        this.f46944a.addView(view);
    }

    public void D(int i10) {
        if (i10 == this.f46959p) {
            return;
        }
        this.f46959p = i10;
        if (TextUtils.isEmpty(this.f46944a.getNavigationContentDescription())) {
            p(this.f46959p);
        }
    }

    public void E(Drawable drawable) {
        this.f46949f = drawable;
        J();
    }

    public void F(CharSequence charSequence) {
        this.f46953j = charSequence;
        if ((this.f46945b & 8) != 0) {
            this.f46944a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public boolean a() {
        return this.f46944a.d();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public boolean b() {
        return this.f46944a.w();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public boolean c() {
        return this.f46944a.Q();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void collapseActionView() {
        this.f46944a.e();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void d(Menu menu, j.a aVar) {
        if (this.f46957n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f46944a.getContext());
            this.f46957n = actionMenuPresenter;
            actionMenuPresenter.r(C14583f.f136385g);
        }
        this.f46957n.e(aVar);
        this.f46944a.K((androidx.appcompat.view.menu.f) menu, this.f46957n);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public boolean e() {
        return this.f46944a.B();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public boolean g() {
        return this.f46944a.A();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public Context getContext() {
        return this.f46944a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public CharSequence getTitle() {
        return this.f46944a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public boolean h() {
        return this.f46944a.v();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void i(int i10) {
        View view;
        int i11 = this.f46945b ^ i10;
        this.f46945b = i10;
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
                    this.f46944a.setTitle(this.f46952i);
                    this.f46944a.setSubtitle(this.f46953j);
                } else {
                    this.f46944a.setTitle((CharSequence) null);
                    this.f46944a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f46947d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f46944a.addView(view);
            } else {
                this.f46944a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void j(CharSequence charSequence) {
        this.f46954k = charSequence;
        H();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public Menu k() {
        return this.f46944a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public int l() {
        return this.f46958o;
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public androidx.core.view.h m(int i10, long j10) {
        return ViewCompat.f(this.f46944a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public ViewGroup n() {
        return this.f46944a;
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void p(int i10) {
        j(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void q() {
        FS.log_i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void r(boolean z10) {
        this.f46944a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void s() {
        this.f46944a.f();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void setIcon(Drawable drawable) {
        this.f46948e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void setWindowCallback(Window.Callback callback) {
        this.f46955l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f46951h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void t(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f46946c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f46944a;
            if (parent == toolbar) {
                toolbar.removeView(this.f46946c);
            }
        }
        this.f46946c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f46958o != 2) {
            return;
        }
        this.f46944a.addView(scrollingTabContainerView, 0);
        Toolbar.g gVar = (Toolbar.g) this.f46946c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f46161a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void u(int i10) {
        E(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void v(int i10) {
        A(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void w(j.a aVar, f.a aVar2) {
        this.f46944a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void x(int i10) {
        this.f46944a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public int y() {
        return this.f46945b;
    }

    @Override // androidx.appcompat.widget.InterfaceC5785t
    public void z() {
        FS.log_i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
}
