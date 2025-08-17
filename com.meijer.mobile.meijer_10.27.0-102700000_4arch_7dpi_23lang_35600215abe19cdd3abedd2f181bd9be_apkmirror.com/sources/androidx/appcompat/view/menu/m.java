package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.MenuPopupWindow;
import i.C14578d;
import i.C14581g;

/* loaded from: classes.dex */
final class m extends i implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    private static final int f46322v = C14581g.f136660m;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46323b;

    /* renamed from: c, reason: collision with root package name */
    private final f f46324c;

    /* renamed from: d, reason: collision with root package name */
    private final e f46325d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f46326e;

    /* renamed from: f, reason: collision with root package name */
    private final int f46327f;

    /* renamed from: g, reason: collision with root package name */
    private final int f46328g;

    /* renamed from: h, reason: collision with root package name */
    private final int f46329h;

    /* renamed from: i, reason: collision with root package name */
    final MenuPopupWindow f46330i;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f46333l;

    /* renamed from: m, reason: collision with root package name */
    private View f46334m;

    /* renamed from: n, reason: collision with root package name */
    View f46335n;

    /* renamed from: o, reason: collision with root package name */
    private j.a f46336o;

    /* renamed from: p, reason: collision with root package name */
    ViewTreeObserver f46337p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46338q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46339r;

    /* renamed from: s, reason: collision with root package name */
    private int f46340s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f46342u;

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f46331j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f46332k = new b();

    /* renamed from: t, reason: collision with root package name */
    private int f46341t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!m.this.b() || m.this.f46330i.A()) {
                return;
            }
            View view = m.this.f46335n;
            if (view == null || !view.isShown()) {
                m.this.dismiss();
            } else {
                m.this.f46330i.a();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = m.this.f46337p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    m.this.f46337p = view.getViewTreeObserver();
                }
                m mVar = m.this;
                mVar.f46337p.removeGlobalOnLayoutListener(mVar.f46331j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        this.f46339r = false;
        e eVar = this.f46325d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void m(f fVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f46338q = true;
        this.f46324c.close();
        ViewTreeObserver viewTreeObserver = this.f46337p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f46337p = this.f46335n.getViewTreeObserver();
            }
            this.f46337p.removeGlobalOnLayoutListener(this.f46331j);
            this.f46337p = null;
        }
        this.f46335n.removeOnAttachStateChangeListener(this.f46332k);
        PopupWindow.OnDismissListener onDismissListener = this.f46333l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return !this.f46338q && this.f46330i.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(f fVar, boolean z10) {
        if (fVar != this.f46324c) {
            return;
        }
        dismiss();
        j.a aVar = this.f46336o;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f46336o = aVar;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        return this.f46330i.getListView();
    }

    @Override // androidx.appcompat.view.menu.i
    public void q(View view) {
        this.f46334m = view;
    }

    @Override // androidx.appcompat.view.menu.i
    public void s(boolean z10) {
        this.f46325d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.i
    public void t(int i10) {
        this.f46341t = i10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void u(int i10) {
        this.f46330i.f(i10);
    }

    @Override // androidx.appcompat.view.menu.i
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f46333l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void w(boolean z10) {
        this.f46342u = z10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void x(int i10) {
        this.f46330i.j(i10);
    }

    public m(Context context, f fVar, View view, int i10, int i11, boolean z10) {
        this.f46323b = context;
        this.f46324c = fVar;
        this.f46326e = z10;
        this.f46325d = new e(fVar, LayoutInflater.from(context), z10, f46322v);
        this.f46328g = i10;
        this.f46329h = i11;
        Resources resources = context.getResources();
        this.f46327f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C14578d.f136560d));
        this.f46334m = view;
        this.f46330i = new MenuPopupWindow(context, null, i10, i11);
        fVar.c(this, context);
    }

    private boolean A() {
        View view;
        boolean z10;
        if (b()) {
            return true;
        }
        if (this.f46338q || (view = this.f46334m) == null) {
            return false;
        }
        this.f46335n = view;
        this.f46330i.J(this);
        this.f46330i.K(this);
        this.f46330i.I(true);
        View view2 = this.f46335n;
        if (this.f46337p == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f46337p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f46331j);
        }
        view2.addOnAttachStateChangeListener(this.f46332k);
        this.f46330i.C(view2);
        this.f46330i.F(this.f46341t);
        if (!this.f46339r) {
            this.f46340s = i.p(this.f46325d, null, this.f46323b, this.f46327f);
            this.f46339r = true;
        }
        this.f46330i.E(this.f46340s);
        this.f46330i.H(2);
        this.f46330i.G(o());
        this.f46330i.a();
        ListView listView = this.f46330i.getListView();
        listView.setOnKeyListener(this);
        if (this.f46342u && this.f46324c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f46323b).inflate(C14581g.f136659l, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f46324c.z());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f46330i.n(this.f46325d);
        this.f46330i.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void a() {
        if (A()) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        if (b()) {
            this.f46330i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(n nVar) {
        if (nVar.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f46323b, nVar, this.f46335n, this.f46326e, this.f46328g, this.f46329h);
            menuPopupHelper.j(this.f46336o);
            menuPopupHelper.g(i.y(nVar));
            menuPopupHelper.i(this.f46333l);
            this.f46333l = null;
            this.f46324c.e(false);
            int iD = this.f46330i.d();
            int iM = this.f46330i.m();
            if ((Gravity.getAbsoluteGravity(this.f46341t, this.f46334m.getLayoutDirection()) & 7) == 5) {
                iD += this.f46334m.getWidth();
            }
            if (menuPopupHelper.n(iD, iM)) {
                j.a aVar = this.f46336o;
                if (aVar != null) {
                    aVar.d(nVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }
}
