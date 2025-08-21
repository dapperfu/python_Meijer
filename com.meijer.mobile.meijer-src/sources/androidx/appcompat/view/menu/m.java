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
import i.C14581d;
import i.C14584g;

/* loaded from: classes.dex */
final class m extends i implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    private static final int f46546v = C14584g.f136417m;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46547b;

    /* renamed from: c, reason: collision with root package name */
    private final f f46548c;

    /* renamed from: d, reason: collision with root package name */
    private final e f46549d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f46550e;

    /* renamed from: f, reason: collision with root package name */
    private final int f46551f;

    /* renamed from: g, reason: collision with root package name */
    private final int f46552g;

    /* renamed from: h, reason: collision with root package name */
    private final int f46553h;

    /* renamed from: i, reason: collision with root package name */
    final MenuPopupWindow f46554i;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f46557l;

    /* renamed from: m, reason: collision with root package name */
    private View f46558m;

    /* renamed from: n, reason: collision with root package name */
    View f46559n;

    /* renamed from: o, reason: collision with root package name */
    private j.a f46560o;

    /* renamed from: p, reason: collision with root package name */
    ViewTreeObserver f46561p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46562q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46563r;

    /* renamed from: s, reason: collision with root package name */
    private int f46564s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f46566u;

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f46555j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f46556k = new b();

    /* renamed from: t, reason: collision with root package name */
    private int f46565t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!m.this.b() || m.this.f46554i.A()) {
                return;
            }
            View view = m.this.f46559n;
            if (view == null || !view.isShown()) {
                m.this.dismiss();
            } else {
                m.this.f46554i.a();
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
            ViewTreeObserver viewTreeObserver = m.this.f46561p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    m.this.f46561p = view.getViewTreeObserver();
                }
                m mVar = m.this;
                mVar.f46561p.removeGlobalOnLayoutListener(mVar.f46555j);
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
        this.f46563r = false;
        e eVar = this.f46549d;
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
        this.f46562q = true;
        this.f46548c.close();
        ViewTreeObserver viewTreeObserver = this.f46561p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f46561p = this.f46559n.getViewTreeObserver();
            }
            this.f46561p.removeGlobalOnLayoutListener(this.f46555j);
            this.f46561p = null;
        }
        this.f46559n.removeOnAttachStateChangeListener(this.f46556k);
        PopupWindow.OnDismissListener onDismissListener = this.f46557l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return !this.f46562q && this.f46554i.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(f fVar, boolean z10) {
        if (fVar != this.f46548c) {
            return;
        }
        dismiss();
        j.a aVar = this.f46560o;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f46560o = aVar;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        return this.f46554i.getListView();
    }

    @Override // androidx.appcompat.view.menu.i
    public void q(View view) {
        this.f46558m = view;
    }

    @Override // androidx.appcompat.view.menu.i
    public void s(boolean z10) {
        this.f46549d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.i
    public void t(int i10) {
        this.f46565t = i10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void u(int i10) {
        this.f46554i.f(i10);
    }

    @Override // androidx.appcompat.view.menu.i
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f46557l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void w(boolean z10) {
        this.f46566u = z10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void x(int i10) {
        this.f46554i.j(i10);
    }

    public m(Context context, f fVar, View view, int i10, int i11, boolean z10) {
        this.f46547b = context;
        this.f46548c = fVar;
        this.f46550e = z10;
        this.f46549d = new e(fVar, LayoutInflater.from(context), z10, f46546v);
        this.f46552g = i10;
        this.f46553h = i11;
        Resources resources = context.getResources();
        this.f46551f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C14581d.f136317d));
        this.f46558m = view;
        this.f46554i = new MenuPopupWindow(context, null, i10, i11);
        fVar.c(this, context);
    }

    private boolean A() {
        View view;
        boolean z10;
        if (b()) {
            return true;
        }
        if (this.f46562q || (view = this.f46558m) == null) {
            return false;
        }
        this.f46559n = view;
        this.f46554i.J(this);
        this.f46554i.K(this);
        this.f46554i.I(true);
        View view2 = this.f46559n;
        if (this.f46561p == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f46561p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f46555j);
        }
        view2.addOnAttachStateChangeListener(this.f46556k);
        this.f46554i.C(view2);
        this.f46554i.F(this.f46565t);
        if (!this.f46563r) {
            this.f46564s = i.p(this.f46549d, null, this.f46547b, this.f46551f);
            this.f46563r = true;
        }
        this.f46554i.E(this.f46564s);
        this.f46554i.H(2);
        this.f46554i.G(o());
        this.f46554i.a();
        ListView listView = this.f46554i.getListView();
        listView.setOnKeyListener(this);
        if (this.f46566u && this.f46548c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f46547b).inflate(C14584g.f136416l, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f46548c.z());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f46554i.n(this.f46549d);
        this.f46554i.a();
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
            this.f46554i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(n nVar) {
        if (nVar.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f46547b, nVar, this.f46559n, this.f46550e, this.f46552g, this.f46553h);
            menuPopupHelper.j(this.f46560o);
            menuPopupHelper.g(i.y(nVar));
            menuPopupHelper.i(this.f46557l);
            this.f46557l = null;
            this.f46548c.e(false);
            int iD = this.f46554i.d();
            int iM = this.f46554i.m();
            if ((Gravity.getAbsoluteGravity(this.f46565t, this.f46558m.getLayoutDirection()) & 7) == 5) {
                iD += this.f46558m.getWidth();
            }
            if (menuPopupHelper.n(iD, iM)) {
                j.a aVar = this.f46560o;
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
