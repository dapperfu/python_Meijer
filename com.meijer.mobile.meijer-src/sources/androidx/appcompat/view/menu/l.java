package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import f2.InterfaceMenuC13943a;

/* loaded from: classes.dex */
public class l extends b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuC13943a f46545d;

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f46545d.add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f46545d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return c(this.f46545d.add(i10));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f46545d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return d(this.f46545d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public void close() {
        this.f46545d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return c(this.f46545d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return c(this.f46545d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f46545d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f46545d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f46545d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f46545d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f46545d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f46545d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f46545d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f46545d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f46545d.size();
    }

    public l(Context context, InterfaceMenuC13943a interfaceMenuC13943a) {
        super(context);
        if (interfaceMenuC13943a != null) {
            this.f46545d = interfaceMenuC13943a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f46545d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f46545d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f46545d.clear();
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        f(i10);
        this.f46545d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        g(i10);
        this.f46545d.removeItem(i10);
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f46545d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f46545d.addSubMenu(i10, i11, i12, i13));
    }
}
