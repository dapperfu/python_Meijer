package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.f;

/* loaded from: classes.dex */
public class n extends f implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    private f f46569B;

    /* renamed from: C, reason: collision with root package name */
    private h f46570C;

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f46570C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f
    public f F() {
        return this.f46569B.F();
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean I() {
        return this.f46569B.I();
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean J() {
        return this.f46569B.J();
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean K() {
        return this.f46569B.K();
    }

    @Override // androidx.appcompat.view.menu.f
    public void W(f.a aVar) {
        this.f46569B.W(aVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean f(h hVar) {
        return this.f46569B.f(hVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f46570C;
    }

    public Menu j0() {
        return this.f46569B;
    }

    @Override // androidx.appcompat.view.menu.f
    public boolean m(h hVar) {
        return this.f46569B.m(hVar);
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f46569B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f46570C.setIcon(i10);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f46569B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.f
    public String v() {
        h hVar = this.f46570C;
        int itemId = hVar != null ? hVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    public n(Context context, f fVar, h hVar) {
        super(context);
        this.f46569B = fVar;
        this.f46570C = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    boolean h(f fVar, MenuItem menuItem) {
        if (!super.h(fVar, menuItem) && !this.f46569B.h(fVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }
}
