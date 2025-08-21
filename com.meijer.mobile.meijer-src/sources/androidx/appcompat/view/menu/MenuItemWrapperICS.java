package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import com.fullstory.FS;
import f2.InterfaceMenuItemC13944b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p2.AbstractC16344a;

/* loaded from: classes.dex */
public class MenuItemWrapperICS extends androidx.appcompat.view.menu.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuItemC13944b f46391d;

    /* renamed from: e, reason: collision with root package name */
    private Method f46392e;

    static class CollapsibleActionViewWrapper extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f46393a;

        View a() {
            return (View) this.f46393a;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f46393a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f46393a.onActionViewExpanded();
        }

        /* JADX WARN: Multi-variable type inference failed */
        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f46393a = (CollapsibleActionView) view;
            addView(view);
        }
    }

    private class a extends AbstractC16344a implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private AbstractC16344a.b f46394d;

        /* renamed from: e, reason: collision with root package name */
        private final ActionProvider f46395e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f46395e = actionProvider;
        }

        @Override // p2.AbstractC16344a
        public boolean a() {
            return this.f46395e.hasSubMenu();
        }

        @Override // p2.AbstractC16344a
        public boolean b() {
            return this.f46395e.isVisible();
        }

        @Override // p2.AbstractC16344a
        public View c() {
            return this.f46395e.onCreateActionView();
        }

        @Override // p2.AbstractC16344a
        public View d(MenuItem menuItem) {
            return this.f46395e.onCreateActionView(menuItem);
        }

        @Override // p2.AbstractC16344a
        public boolean e() {
            return this.f46395e.onPerformDefaultAction();
        }

        @Override // p2.AbstractC16344a
        public void f(SubMenu subMenu) {
            this.f46395e.onPrepareSubMenu(MenuItemWrapperICS.this.d(subMenu));
        }

        @Override // p2.AbstractC16344a
        public boolean g() {
            return this.f46395e.overridesItemVisibility();
        }

        @Override // p2.AbstractC16344a
        public void j(AbstractC16344a.b bVar) {
            this.f46394d = bVar;
            this.f46395e.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC16344a.b bVar = this.f46394d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    private class b implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f46397a;

        b(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f46397a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f46397a.onMenuItemActionCollapse(MenuItemWrapperICS.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f46397a.onMenuItemActionExpand(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    private class c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f46399a;

        c(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f46399a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f46399a.onMenuItemClick(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f46391d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f46391d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46391d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f46391d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f46391d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46391d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f46391d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f46391d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC16344a abstractC16344aB = this.f46391d.b();
        if (abstractC16344aB instanceof a) {
            return ((a) abstractC16344aB).f46395e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f46391d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46391d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46391d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46391d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46391d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f46391d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46391d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46391d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46391d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f46391d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f46391d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46391d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46391d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46391d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f46391d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f46391d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f46391d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46391d.getTooltipText();
    }

    public void h(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f46392e == null) {
                this.f46392e = this.f46391d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f46392e.invoke(this.f46391d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            FS.log_w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f46391d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f46391d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f46391d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f46391d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f46391d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f46391d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f46423a, actionProvider);
        InterfaceMenuItemC13944b interfaceMenuItemC13944b = this.f46391d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC13944b.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f46391d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f46391d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f46391d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f46391d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f46391d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f46391d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f46391d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46391d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46391d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f46391d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f46391d.setOnActionExpandListener(onActionExpandListener != null ? new b(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46391d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new c(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f46391d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f46391d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f46391d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f46391d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46391d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f46391d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f46391d.setVisible(z10);
    }

    public MenuItemWrapperICS(Context context, InterfaceMenuItemC13944b interfaceMenuItemC13944b) {
        super(context);
        if (interfaceMenuItemC13944b != null) {
            this.f46391d = interfaceMenuItemC13944b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f46391d.setActionView(i10);
        View actionView = this.f46391d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f46391d.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
