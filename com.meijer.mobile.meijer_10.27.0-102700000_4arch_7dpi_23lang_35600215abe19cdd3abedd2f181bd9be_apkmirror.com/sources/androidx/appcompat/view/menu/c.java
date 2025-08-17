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
import i.C14578d;
import i.C14581g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.r;

/* loaded from: classes.dex */
final class c extends i implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    private static final int f46202B = C14581g.f136652e;

    /* renamed from: A, reason: collision with root package name */
    boolean f46203A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46204b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46205c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46206d;

    /* renamed from: e, reason: collision with root package name */
    private final int f46207e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f46208f;

    /* renamed from: g, reason: collision with root package name */
    final Handler f46209g;

    /* renamed from: o, reason: collision with root package name */
    private View f46217o;

    /* renamed from: p, reason: collision with root package name */
    View f46218p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46220r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46221s;

    /* renamed from: t, reason: collision with root package name */
    private int f46222t;

    /* renamed from: u, reason: collision with root package name */
    private int f46223u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46225w;

    /* renamed from: x, reason: collision with root package name */
    private j.a f46226x;

    /* renamed from: y, reason: collision with root package name */
    ViewTreeObserver f46227y;

    /* renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f46228z;

    /* renamed from: h, reason: collision with root package name */
    private final List<f> f46210h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final List<d> f46211i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f46212j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f46213k = new b();

    /* renamed from: l, reason: collision with root package name */
    private final C f46214l = new C0957c();

    /* renamed from: m, reason: collision with root package name */
    private int f46215m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f46216n = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f46224v = false;

    /* renamed from: q, reason: collision with root package name */
    private int f46219q = E();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!c.this.b() || c.this.f46211i.size() <= 0 || c.this.f46211i.get(0).f46236a.A()) {
                return;
            }
            View view = c.this.f46218p;
            if (view == null || !view.isShown()) {
                c.this.dismiss();
                return;
            }
            Iterator<d> it = c.this.f46211i.iterator();
            while (it.hasNext()) {
                it.next().f46236a.a();
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
            ViewTreeObserver viewTreeObserver = c.this.f46227y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    c.this.f46227y = view.getViewTreeObserver();
                }
                c cVar = c.this;
                cVar.f46227y.removeGlobalOnLayoutListener(cVar.f46212j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.c$c, reason: collision with other inner class name */
    class C0957c implements C {

        /* renamed from: androidx.appcompat.view.menu.c$c$a */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f46232a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f46233b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f f46234c;

            a(d dVar, MenuItem menuItem, f fVar) {
                this.f46232a = dVar;
                this.f46233b = menuItem;
                this.f46234c = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f46232a;
                if (dVar != null) {
                    c.this.f46203A = true;
                    dVar.f46237b.e(false);
                    c.this.f46203A = false;
                }
                if (this.f46233b.isEnabled() && this.f46233b.hasSubMenu()) {
                    this.f46234c.O(this.f46233b, 4);
                }
            }
        }

        C0957c() {
        }

        @Override // androidx.appcompat.widget.C
        public void e(f fVar, MenuItem menuItem) {
            c.this.f46209g.removeCallbacksAndMessages(null);
            int size = c.this.f46211i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (fVar == c.this.f46211i.get(i10).f46237b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            c.this.f46209g.postAtTime(new a(i11 < c.this.f46211i.size() ? c.this.f46211i.get(i11) : null, menuItem, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.C
        public void o(f fVar, MenuItem menuItem) {
            c.this.f46209g.removeCallbacksAndMessages(fVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f46236a;

        /* renamed from: b, reason: collision with root package name */
        public final f f46237b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46238c;

        public ListView a() {
            return this.f46236a.getListView();
        }

        public d(MenuPopupWindow menuPopupWindow, f fVar, int i10) {
            this.f46236a = menuPopupWindow;
            this.f46237b = fVar;
            this.f46238c = i10;
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
        this.f46220r = true;
        this.f46222t = i10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void x(int i10) {
        this.f46221s = true;
        this.f46223u = i10;
    }

    private MenuPopupWindow A() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f46204b, null, this.f46206d, this.f46207e);
        menuPopupWindow.T(this.f46214l);
        menuPopupWindow.K(this);
        menuPopupWindow.J(this);
        menuPopupWindow.C(this.f46217o);
        menuPopupWindow.F(this.f46216n);
        menuPopupWindow.I(true);
        menuPopupWindow.H(2);
        return menuPopupWindow;
    }

    private int B(f fVar) {
        int size = this.f46211i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (fVar == this.f46211i.get(i10).f46237b) {
                return i10;
            }
        }
        return -1;
    }

    private View D(d dVar, f fVar) {
        e eVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemC = C(dVar.f46237b, fVar);
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
        return this.f46217o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int F(int i10) {
        List<d> list = this.f46211i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f46218p.getWindowVisibleDisplayFrame(rect);
        return this.f46219q == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void G(f fVar) {
        d dVar;
        View viewD;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f46204b);
        e eVar = new e(fVar, layoutInflaterFrom, this.f46208f, f46202B);
        if (!b() && this.f46224v) {
            eVar.d(true);
        } else if (b()) {
            eVar.d(i.y(fVar));
        }
        int iP = i.p(eVar, null, this.f46204b, this.f46205c);
        MenuPopupWindow menuPopupWindowA = A();
        menuPopupWindowA.n(eVar);
        menuPopupWindowA.E(iP);
        menuPopupWindowA.F(this.f46216n);
        if (this.f46211i.size() > 0) {
            List<d> list = this.f46211i;
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
            this.f46219q = iF;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowA.C(viewD);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f46217o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewD.getLocationOnScreen(iArr2);
                if ((this.f46216n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f46217o.getWidth();
                    iArr2[0] = iArr2[0] + viewD.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f46216n & 5) == 5) {
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
            if (this.f46220r) {
                menuPopupWindowA.f(this.f46222t);
            }
            if (this.f46221s) {
                menuPopupWindowA.j(this.f46223u);
            }
            menuPopupWindowA.G(o());
        }
        this.f46211i.add(new d(menuPopupWindowA, fVar, this.f46219q));
        menuPopupWindowA.a();
        ListView listView = menuPopupWindowA.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.f46225w && fVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C14581g.f136659l, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fVar.z());
            listView.addHeaderView(frameLayout, null, false);
            menuPopupWindowA.a();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return this.f46211i.size() > 0 && this.f46211i.get(0).f46236a.b();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.f46211i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f46211i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f46236a.b()) {
                    dVar.f46236a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f46226x = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(n nVar) {
        for (d dVar : this.f46211i) {
            if (nVar == dVar.f46237b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        m(nVar);
        j.a aVar = this.f46226x;
        if (aVar != null) {
            aVar.d(nVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        if (this.f46211i.isEmpty()) {
            return null;
        }
        return this.f46211i.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        Iterator<d> it = this.f46211i.iterator();
        while (it.hasNext()) {
            i.z(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void m(f fVar) {
        fVar.c(this, this.f46204b);
        if (b()) {
            G(fVar);
        } else {
            this.f46210h.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f46211i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f46211i.get(i10);
            if (!dVar.f46236a.b()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f46237b.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void q(View view) {
        if (this.f46217o != view) {
            this.f46217o = view;
            this.f46216n = r.b(this.f46215m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void s(boolean z10) {
        this.f46224v = z10;
    }

    @Override // androidx.appcompat.view.menu.i
    public void t(int i10) {
        if (this.f46215m != i10) {
            this.f46215m = i10;
            this.f46216n = r.b(i10, this.f46217o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f46228z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void w(boolean z10) {
        this.f46225w = z10;
    }

    public c(Context context, View view, int i10, int i11, boolean z10) {
        this.f46204b = context;
        this.f46217o = view;
        this.f46206d = i10;
        this.f46207e = i11;
        this.f46208f = z10;
        Resources resources = context.getResources();
        this.f46205c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C14578d.f136560d));
        this.f46209g = new Handler();
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
            Iterator<f> it = this.f46210h.iterator();
            while (it.hasNext()) {
                G(it.next());
            }
            this.f46210h.clear();
            View view = this.f46217o;
            this.f46218p = view;
            if (view != null) {
                if (this.f46227y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f46227y = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f46212j);
                }
                this.f46218p.addOnAttachStateChangeListener(this.f46213k);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(f fVar, boolean z10) {
        int iB = B(fVar);
        if (iB >= 0) {
            int i10 = iB + 1;
            if (i10 < this.f46211i.size()) {
                this.f46211i.get(i10).f46237b.e(false);
            }
            d dVarRemove = this.f46211i.remove(iB);
            dVarRemove.f46237b.R(this);
            if (this.f46203A) {
                dVarRemove.f46236a.S(null);
                dVarRemove.f46236a.D(0);
            }
            dVarRemove.f46236a.dismiss();
            int size = this.f46211i.size();
            if (size > 0) {
                this.f46219q = this.f46211i.get(size - 1).f46238c;
            } else {
                this.f46219q = E();
            }
            if (size == 0) {
                dismiss();
                j.a aVar = this.f46226x;
                if (aVar != null) {
                    aVar.c(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f46227y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f46227y.removeGlobalOnLayoutListener(this.f46212j);
                    }
                    this.f46227y = null;
                }
                this.f46218p.removeOnAttachStateChangeListener(this.f46213k);
                this.f46228z.onDismiss();
                return;
            }
            if (z10) {
                this.f46211i.get(0).f46237b.e(false);
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
