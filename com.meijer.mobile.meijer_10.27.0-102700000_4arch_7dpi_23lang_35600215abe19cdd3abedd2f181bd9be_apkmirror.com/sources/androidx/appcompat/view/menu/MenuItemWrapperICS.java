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
import f2.InterfaceMenuItemC13834b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p2.AbstractC16199a;

/* loaded from: classes.dex */
public class MenuItemWrapperICS extends androidx.appcompat.view.menu.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuItemC13834b f46167d;

    /* renamed from: e, reason: collision with root package name */
    private Method f46168e;

    static class CollapsibleActionViewWrapper extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f46169a;

        View a() {
            return (View) this.f46169a;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f46169a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f46169a.onActionViewExpanded();
        }

        /* JADX WARN: Multi-variable type inference failed */
        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f46169a = (CollapsibleActionView) view;
            addView(view);
        }
    }

    private class a extends AbstractC16199a implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private AbstractC16199a.b f46170d;

        /* renamed from: e, reason: collision with root package name */
        private final ActionProvider f46171e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f46171e = actionProvider;
        }

        @Override // p2.AbstractC16199a
        public boolean a() {
            return this.f46171e.hasSubMenu();
        }

        @Override // p2.AbstractC16199a
        public boolean b() {
            return this.f46171e.isVisible();
        }

        @Override // p2.AbstractC16199a
        public View c() {
            return this.f46171e.onCreateActionView();
        }

        @Override // p2.AbstractC16199a
        public View d(MenuItem menuItem) {
            return this.f46171e.onCreateActionView(menuItem);
        }

        @Override // p2.AbstractC16199a
        public boolean e() {
            return this.f46171e.onPerformDefaultAction();
        }

        @Override // p2.AbstractC16199a
        public void f(SubMenu subMenu) {
            this.f46171e.onPrepareSubMenu(MenuItemWrapperICS.this.d(subMenu));
        }

        @Override // p2.AbstractC16199a
        public boolean g() {
            return this.f46171e.overridesItemVisibility();
        }

        @Override // p2.AbstractC16199a
        public void j(AbstractC16199a.b bVar) {
            this.f46170d = bVar;
            this.f46171e.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC16199a.b bVar = this.f46170d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    private class b implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f46173a;

        b(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f46173a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f46173a.onMenuItemActionCollapse(MenuItemWrapperICS.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f46173a.onMenuItemActionExpand(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    private class c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f46175a;

        c(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f46175a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f46175a.onMenuItemClick(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f46167d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f46167d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46167d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f46167d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f46167d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46167d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f46167d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f46167d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC16199a abstractC16199aB = this.f46167d.b();
        if (abstractC16199aB instanceof a) {
            return ((a) abstractC16199aB).f46171e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f46167d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46167d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46167d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46167d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46167d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f46167d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46167d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46167d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46167d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f46167d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f46167d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46167d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46167d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46167d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f46167d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f46167d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f46167d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46167d.getTooltipText();
    }

    public void h(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f46168e == null) {
                this.f46168e = this.f46167d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f46168e.invoke(this.f46167d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            FS.log_w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f46167d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f46167d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f46167d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f46167d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f46167d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f46167d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f46199a, actionProvider);
        InterfaceMenuItemC13834b interfaceMenuItemC13834b = this.f46167d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC13834b.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f46167d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f46167d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f46167d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f46167d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f46167d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f46167d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f46167d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46167d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46167d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f46167d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f46167d.setOnActionExpandListener(onActionExpandListener != null ? new b(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46167d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new c(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f46167d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f46167d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f46167d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f46167d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46167d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f46167d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f46167d.setVisible(z10);
    }

    public MenuItemWrapperICS(Context context, InterfaceMenuItemC13834b interfaceMenuItemC13834b) {
        super(context);
        if (interfaceMenuItemC13834b != null) {
            this.f46167d = interfaceMenuItemC13834b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f46167d.setActionView(i10);
        View actionView = this.f46167d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f46167d.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
