package androidx.appcompat.view.menu;

import Z.n0;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import f2.InterfaceMenuItemC13834b;
import f2.InterfaceSubMenuC13835c;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f46199a;

    /* renamed from: b, reason: collision with root package name */
    private n0<InterfaceMenuItemC13834b, MenuItem> f46200b;

    /* renamed from: c, reason: collision with root package name */
    private n0<InterfaceSubMenuC13835c, SubMenu> f46201c;

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC13834b)) {
            return menuItem;
        }
        InterfaceMenuItemC13834b interfaceMenuItemC13834b = (InterfaceMenuItemC13834b) menuItem;
        if (this.f46200b == null) {
            this.f46200b = new n0<>();
        }
        MenuItem menuItem2 = this.f46200b.get(interfaceMenuItemC13834b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f46199a, interfaceMenuItemC13834b);
        this.f46200b.put(interfaceMenuItemC13834b, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC13835c)) {
            return subMenu;
        }
        InterfaceSubMenuC13835c interfaceSubMenuC13835c = (InterfaceSubMenuC13835c) subMenu;
        if (this.f46201c == null) {
            this.f46201c = new n0<>();
        }
        SubMenu subMenu2 = this.f46201c.get(interfaceSubMenuC13835c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        o oVar = new o(this.f46199a, interfaceSubMenuC13835c);
        this.f46201c.put(interfaceSubMenuC13835c, oVar);
        return oVar;
    }

    final void e() {
        n0<InterfaceMenuItemC13834b, MenuItem> n0Var = this.f46200b;
        if (n0Var != null) {
            n0Var.clear();
        }
        n0<InterfaceSubMenuC13835c, SubMenu> n0Var2 = this.f46201c;
        if (n0Var2 != null) {
            n0Var2.clear();
        }
    }

    final void f(int i10) {
        if (this.f46200b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f46200b.getSize()) {
            if (this.f46200b.g(i11).getGroupId() == i10) {
                this.f46200b.i(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f46200b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f46200b.getSize(); i11++) {
            if (this.f46200b.g(i11).getItemId() == i10) {
                this.f46200b.i(i11);
                return;
            }
        }
    }

    b(Context context) {
        this.f46199a = context;
    }
}
