package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import f2.InterfaceSubMenuC13835c;

/* loaded from: classes.dex */
class o extends l implements SubMenu {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceSubMenuC13835c f46347e;

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f46347e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f46347e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f46347e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f46347e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f46347e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f46347e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f46347e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f46347e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f46347e.setIcon(drawable);
        return this;
    }

    o(Context context, InterfaceSubMenuC13835c interfaceSubMenuC13835c) {
        super(context, interfaceSubMenuC13835c);
        this.f46347e = interfaceSubMenuC13835c;
    }
}
