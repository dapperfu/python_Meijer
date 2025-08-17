package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.f;
import i.C14575a;

/* loaded from: classes.dex */
public class PopupMenu {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46714a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.f f46715b;

    /* renamed from: c, reason: collision with root package name */
    private final View f46716c;

    /* renamed from: d, reason: collision with root package name */
    c f46717d;
    final MenuPopupHelper mPopup;

    class a implements f.a {
        @Override // androidx.appcompat.view.menu.f.a
        public void b(androidx.appcompat.view.menu.f fVar) {
        }

        a() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            c cVar = PopupMenu.this.f46717d;
            if (cVar != null) {
                return cVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupMenu.this.getClass();
        }
    }

    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i10) {
        this(context, view, i10, C14575a.f136513J, 0);
    }

    public void a() {
        this.mPopup.b();
    }

    public Menu b() {
        return this.f46715b;
    }

    public void c(c cVar) {
        this.f46717d = cVar;
    }

    public void d() {
        this.mPopup.k();
    }

    public PopupMenu(Context context, View view, int i10, int i11, int i12) {
        this.f46714a = context;
        this.f46716c = view;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        this.f46715b = fVar;
        fVar.W(new a());
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, fVar, view, false, i11, i12);
        this.mPopup = menuPopupHelper;
        menuPopupHelper.h(i10);
        menuPopupHelper.i(new b());
    }
}
