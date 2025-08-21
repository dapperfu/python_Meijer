package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.MenuPopupWindow;
import i.C14581d;
import i.C14584g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.r;

/* loaded from: classes.dex */
final class c extends i implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    private static final int f46426B = C14584g.f136409e;

    /* renamed from: A, reason: collision with root package name */
    boolean f46427A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46428b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46429c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46430d;

    /* renamed from: e, reason: collision with root package name */
    private final int f46431e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f46432f;

    /* renamed from: g, reason: collision with root package name */
    final Handler f46433g;

    /* renamed from: o, reason: collision with root package name */
    private View f46441o;

    /* renamed from: p, reason: collision with root package name */
    View f46442p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46444r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46445s;

    /* renamed from: t, reason: collision with root package name */
    private int f46446t;

    /* renamed from: u, reason: collision with root package name */
    private int f46447u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46449w;

    /* renamed from: x, reason: collision with root package name */
    private j.a f46450x;

    /* renamed from: y, reason: collision with root package name */
    ViewTreeObserver f46451y;

    /* renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f46452z;

    /* renamed from: h, reason: collision with root package name */
    private final List<f> f46434h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final List<d> f46435i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f46436j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f46437k = new b();

    /* renamed from: l, reason: collision with root package name */
    private final C f46438l = new C0970c();

    /* renamed from: m, reason: collision with root package name */
    private int f46439m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f46440n = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f46448v = false;

    /* renamed from: q, reason: collision with root package name */
    private int f46443q = E();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!c.this.b() || c.this.f46435i.size() <= 0 || c.this.f46435i.get(0).f46460a.A()) {
                return;
            }
            View view = c.this.f46442p;
            if (view == null || !view.isShown()) {
                c.this.dismiss();
                return;
            }
            Iterator<d> it = c.this.f46435i.iterator();
            while (it.hasNext()) {
                it.next().f46460a.a();
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
            ViewTreeObserver viewTreeObserver = c.this.f46451y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    c.this.f46451y = view.getViewTreeObserver();
                }
                c cVar = c.this;
                cVar.f46451y.removeGlobalOnLayoutListener(cVar.f46436j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.c$c, reason: collision with other inner class name */
    class C0970c implements C {

        /* renamed from: androidx.appcompat.view.menu.c$c$a */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f46456a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f46457b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f f46458c;

            a(d dVar, MenuItem menuItem, f fVar) {
                this.f46456a = dVar;
                this.f46457b = menuItem;
                this.f46458c = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f46456a;
                if (dVar != null) {
                    c.this.f46427A = true;
                    dVar.f46461b.e(false);
                    c.this.f46427A = false;
                }
                if (this.f46457b.isEnabled() && this.f46457b.hasSubMenu()) {
                    this.f46458c.O(this.f46457b, 4);
                }
            }
        }

        C0970c() {
        }

        @Override // androidx.appcompat.widget.C
        public void e(f fVar, MenuItem menuItem) {
            c.this.f46433g.removeCallbacksAndMessages(null);
            int size = c.this.f46435i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (fVar == c.this.f46435i.get(i10).f46461b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            c.this.f46433g.postAtTime(new a(i11 < c.this.f46435i.size() ? c.this.f46435i.get(i11) : null, menuItem, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.C
        public void o(f fVar, MenuItem menuItem) {
            c.this.f46433g.removeCallbacksAndMessages(fVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f46460a;

        /* renamed from: b, reason: collision with root package name */
        public final f f46461b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46462c;

        public ListView a() {
            return this.f46460a.getListView();
        }

        public d(MenuPopupWindow menuPopupWindow, f fVar, int i10) {
            this.f46460a = menuPopupWindow;
            this.f46461b = fVar;
            this.f46462c = i10;
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
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    protected boolean n() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void u(int i10) {
        this.f46444r = true;
        this.f46446t = i10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void x(int i10) {
        this.f46445s = true;
        this.f46447u = i10;
    }

    private MenuPopupWindow A() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f46428b, null, this.f46430d, this.f46431e);
        menuPopupWindow.T(this.f46438l);
        menuPopupWindow.K(this);
        menuPopupWindow.J(this);
        menuPopupWindow.C(this.f46441o);
        menuPopupWindow.F(this.f46440n);
        menuPopupWindow.I(true);
        menuPopupWindow.H(2);
        return menuPopupWindow;
    }

    private int B(f fVar) {
        int size = this.f46435i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (fVar == this.f46435i.get(i10).f46461b) {
                return i10;
            }
        }
        return -1;
    }

    private View D(d dVar, f fVar) {
        e eVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemC = C(dVar.f46461b, fVar);
        if (menuItemC == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            eVar = (e) headerViewListAdapter.getWrappedAdapter();
        } else {
            eVar = (e) adapter;
            headersCount = 0;
        }
        int count = eVar.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemC == eVar.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int E() {
        return this.f46441o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int F(int i10) {
        List<d> list = this.f46435i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f46442p.getWindowVisibleDisplayFrame(rect);
        return this.f46443q == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void G(f fVar) {
        d dVar;
        View viewD;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f46428b);
        e eVar = new e(fVar, layoutInflaterFrom, this.f46432f, f46426B);
        if (!b() && this.f46448v) {
            eVar.d(true);
        } else if (b()) {
            eVar.d(i.y(fVar));
        }
        int iP = i.p(eVar, null, this.f46428b, this.f46429c);
        MenuPopupWindow menuPopupWindowA = A();
        menuPopupWindowA.n(eVar);
        menuPopupWindowA.E(iP);
        menuPopupWindowA.F(this.f46440n);
        if (this.f46435i.size() > 0) {
            List<d> list = this.f46435i;
            dVar = list.get(list.size() - 1);
            viewD = D(dVar, fVar);
        } else {
            dVar = null;
            viewD = null;
        }
        if (viewD != null) {
            menuPopupWindowA.U(false);
            menuPopupWindowA.R(null);
            int iF = F(iP);
            boolean z10 = iF == 1;
            this.f46443q = iF;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowA.C(viewD);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f46441o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewD.getLocationOnScreen(iArr2);
                if ((this.f46440n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f46441o.getWidth();
                    iArr2[0] = iArr2[0] + viewD.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f46440n & 5) == 5) {
                if (!z10) {
                    iP = viewD.getWidth();
                    i12 = i10 - iP;
                }
                i12 = i10 + iP;
            } else {
                if (z10) {
                    iP = viewD.getWidth();
                    i12 = i10 + iP;
                }
                i12 = i10 - iP;
            }
            menuPopupWindowA.f(i12);
            menuPopupWindowA.M(true);
            menuPopupWindowA.j(i11);
        } else {
            if (this.f46444r) {
                menuPopupWindowA.f(this.f46446t);
            }
            if (this.f46445s) {
                menuPopupWindowA.j(this.f46447u);
            }
            menuPopupWindowA.G(o());
        }
        this.f46435i.add(new d(menuPopupWindowA, fVar, this.f46443q));
        menuPopupWindowA.a();
        ListView listView = menuPopupWindowA.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.f46449w && fVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C14584g.f136416l, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fVar.z());
            listView.addHeaderView(frameLayout, null, false);
            menuPopupWindowA.a();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return this.f46435i.size() > 0 && this.f46435i.get(0).f46460a.b();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.f46435i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f46435i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f46460a.b()) {
                    dVar.f46460a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f46450x = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(n nVar) {
        for (d dVar : this.f46435i) {
            if (nVar == dVar.f46461b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        m(nVar);
        j.a aVar = this.f46450x;
        if (aVar != null) {
            aVar.d(nVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        if (this.f46435i.isEmpty()) {
            return null;
        }
        return this.f46435i.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        Iterator<d> it = this.f46435i.iterator();
        while (it.hasNext()) {
            i.z(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void m(f fVar) {
        fVar.c(this, this.f46428b);
        if (b()) {
            G(fVar);
        } else {
            this.f46434h.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f46435i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f46435i.get(i10);
            if (!dVar.f46460a.b()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f46461b.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void q(View view) {
        if (this.f46441o != view) {
            this.f46441o = view;
            this.f46440n = r.b(this.f46439m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void s(boolean z10) {
        this.f46448v = z10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void t(int i10) {
        if (this.f46439m != i10) {
            this.f46439m = i10;
            this.f46440n = r.b(i10, this.f46441o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f46452z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void w(boolean z10) {
        this.f46449w = z10;
    }

    public c(Context context, View view, int i10, int i11, boolean z10) {
        this.f46428b = context;
        this.f46441o = view;
        this.f46430d = i10;
        this.f46431e = i11;
        this.f46432f = z10;
        Resources resources = context.getResources();
        this.f46429c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C14581d.f136317d));
        this.f46433g = new Handler();
    }

    private MenuItem C(f fVar, f fVar2) {
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = fVar.getItem(i10);
            if (item.hasSubMenu() && fVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void a() {
        boolean z10;
        if (!b()) {
            Iterator<f> it = this.f46434h.iterator();
            while (it.hasNext()) {
                G(it.next());
            }
            this.f46434h.clear();
            View view = this.f46441o;
            this.f46442p = view;
            if (view != null) {
                if (this.f46451y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f46451y = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f46436j);
                }
                this.f46442p.addOnAttachStateChangeListener(this.f46437k);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(f fVar, boolean z10) {
        int iB = B(fVar);
        if (iB >= 0) {
            int i10 = iB + 1;
            if (i10 < this.f46435i.size()) {
                this.f46435i.get(i10).f46461b.e(false);
            }
            d dVarRemove = this.f46435i.remove(iB);
            dVarRemove.f46461b.R(this);
            if (this.f46427A) {
                dVarRemove.f46460a.S(null);
                dVarRemove.f46460a.D(0);
            }
            dVarRemove.f46460a.dismiss();
            int size = this.f46435i.size();
            if (size > 0) {
                this.f46443q = this.f46435i.get(size - 1).f46462c;
            } else {
                this.f46443q = E();
            }
            if (size == 0) {
                dismiss();
                j.a aVar = this.f46450x;
                if (aVar != null) {
                    aVar.c(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f46451y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f46451y.removeGlobalOnLayoutListener(this.f46436j);
                    }
                    this.f46451y = null;
                }
                this.f46442p.removeOnAttachStateChangeListener(this.f46437k);
                this.f46452z.onDismiss();
                return;
            }
            if (z10) {
                this.f46435i.get(0).f46461b.e(false);
            }
        }
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
