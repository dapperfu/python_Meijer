package androidx.appcompat.view.menu;

import Z.n0;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import f2.InterfaceMenuItemC13944b;
import f2.InterfaceSubMenuC13945c;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f46423a;

    /* renamed from: b, reason: collision with root package name */
    private n0<InterfaceMenuItemC13944b, MenuItem> f46424b;

    /* renamed from: c, reason: collision with root package name */
    private n0<InterfaceSubMenuC13945c, SubMenu> f46425c;

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC13944b)) {
            return menuItem;
        }
        InterfaceMenuItemC13944b interfaceMenuItemC13944b = (InterfaceMenuItemC13944b) menuItem;
        if (this.f46424b == null) {
            this.f46424b = new n0<>();
        }
        MenuItem menuItem2 = this.f46424b.get(interfaceMenuItemC13944b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f46423a, interfaceMenuItemC13944b);
        this.f46424b.put(interfaceMenuItemC13944b, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC13945c)) {
            return subMenu;
        }
        InterfaceSubMenuC13945c interfaceSubMenuC13945c = (InterfaceSubMenuC13945c) subMenu;
        if (this.f46425c == null) {
            this.f46425c = new n0<>();
        }
        SubMenu subMenu2 = this.f46425c.get(interfaceSubMenuC13945c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        o oVar = new o(this.f46423a, interfaceSubMenuC13945c);
        this.f46425c.put(interfaceSubMenuC13945c, oVar);
        return oVar;
    }

    final void e() {
        n0<InterfaceMenuItemC13944b, MenuItem> n0Var = this.f46424b;
        if (n0Var != null) {
            n0Var.clear();
        }
        n0<InterfaceSubMenuC13945c, SubMenu> n0Var2 = this.f46425c;
        if (n0Var2 != null) {
            n0Var2.clear();
        }
    }

    final void f(int i10) {
        if (this.f46424b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f46424b.getSize()) {
            if (this.f46424b.g(i11).getGroupId() == i10) {
                this.f46424b.i(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f46424b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f46424b.getSize(); i11++) {
            if (this.f46424b.g(i11).getItemId() == i10) {
                this.f46424b.i(i11);
                return;
            }
        }
    }

    b(Context context) {
        this.f46423a = context;
    }
}
