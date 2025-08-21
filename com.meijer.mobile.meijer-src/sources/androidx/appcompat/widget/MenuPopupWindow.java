package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.fullstory.FS;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class MenuPopupWindow extends B implements C {

    /* renamed from: J, reason: collision with root package name */
    private static Method f46929J;

    /* renamed from: I, reason: collision with root package name */
    private C f46930I;

    public static class MenuDropDownListView extends DropDownListView {

        /* renamed from: n, reason: collision with root package name */
        final int f46931n;

        /* renamed from: o, reason: collision with root package name */
        final int f46932o;

        /* renamed from: p, reason: collision with root package name */
        private C f46933p;

        /* renamed from: q, reason: collision with root package name */
        private MenuItem f46934q;

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f46933p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= eVar.getCount()) ? null : eVar.getItem(i10);
                MenuItem menuItem = this.f46934q;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.f fVarB = eVar.b();
                    if (menuItem != null) {
                        this.f46933p.o(fVarB, menuItem);
                    }
                    this.f46934q = item;
                    if (item != null) {
                        this.f46933p.e(fVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public void setHoverListener(C c10) {
            this.f46933p = c10;
        }

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f46931n = 21;
                this.f46932o = 22;
            } else {
                this.f46931n = 22;
                this.f46932o = 21;
            }
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.e eVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f46931n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i10 == this.f46932o) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    eVar = (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                }
                eVar.b().e(false);
                return true;
            }
            return super.onKeyDown(i10, keyEvent);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f46929J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            FS.log_i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public void R(Object obj) {
        a.a(this.f46787F, (Transition) obj);
    }

    public void S(Object obj) {
        a.b(this.f46787F, (Transition) obj);
    }

    public void T(C c10) {
        this.f46930I = c10;
    }

    public void U(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.f46787F, z10);
            return;
        }
        Method method = f46929J;
        if (method != null) {
            try {
                method.invoke(this.f46787F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                FS.log_i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.C
    public void e(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        C c10 = this.f46930I;
        if (c10 != null) {
            c10.e(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C
    public void o(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        C c10 = this.f46930I;
        if (c10 != null) {
            c10.o(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.B
    DropDownListView r(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
