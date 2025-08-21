package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import f2.InterfaceSubMenuC13945c;

/* loaded from: classes.dex */
class o extends l implements SubMenu {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceSubMenuC13945c f46571e;

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f46571e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f46571e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f46571e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f46571e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f46571e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f46571e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f46571e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f46571e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f46571e.setIcon(drawable);
        return this;
    }

    o(Context context, InterfaceSubMenuC13945c interfaceSubMenuC13945c) {
        super(context, interfaceSubMenuC13945c);
        this.f46571e = interfaceSubMenuC13945c;
    }
}
