package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i implements ShowableListMenu, j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private Rect f46544a;

    protected static int p(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, f fVar) {
    }

    public abstract void m(f fVar);

    protected boolean n() {
        return true;
    }

    public abstract void q(View view);

    public abstract void s(boolean z10);

    public abstract void t(int i10);

    public abstract void u(int i10);

    public abstract void v(PopupWindow.OnDismissListener onDismissListener);

    public abstract void w(boolean z10);

    public abstract void x(int i10);

    protected static e z(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (e) listAdapter;
    }

    public Rect o() {
        return this.f46544a;
    }

    public void r(Rect rect) {
        this.f46544a = rect;
    }

    i() {
    }

    protected static boolean y(f fVar) {
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = fVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        int i11;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        f fVar = z(listAdapter).f46475a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i10);
        if (n()) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        fVar.P(menuItem, this, i11);
    }
}
