package n;

import Z1.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d2.C13462a;
import f2.InterfaceMenuItemC13834b;
import p2.AbstractC16199a;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C15714a implements InterfaceMenuItemC13834b {

    /* renamed from: a, reason: collision with root package name */
    private final int f150758a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150759b;

    /* renamed from: c, reason: collision with root package name */
    private final int f150760c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f150761d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f150762e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f150763f;

    /* renamed from: g, reason: collision with root package name */
    private char f150764g;

    /* renamed from: i, reason: collision with root package name */
    private char f150766i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f150768k;

    /* renamed from: l, reason: collision with root package name */
    private Context f150769l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f150770m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f150771n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f150772o;

    /* renamed from: h, reason: collision with root package name */
    private int f150765h = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j, reason: collision with root package name */
    private int f150767j = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f150773p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f150774q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f150775r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f150776s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f150777t = 16;

    @Override // f2.InterfaceMenuItemC13834b
    public AbstractC16199a b() {
        return null;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f150766i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f150768k = drawable;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f150764g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f150764g = c10;
        this.f150766i = Character.toLowerCase(c11);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f150761d = charSequence;
        return this;
    }

    private void c() {
        Drawable drawable = this.f150768k;
        if (drawable != null) {
            if (this.f150775r || this.f150776s) {
                Drawable drawableR = C13462a.r(drawable);
                this.f150768k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f150768k = drawableMutate;
                if (this.f150775r) {
                    C13462a.o(drawableMutate, this.f150773p);
                }
                if (this.f150776s) {
                    C13462a.p(this.f150768k, this.f150774q);
                }
            }
        }
    }

    @Override // f2.InterfaceMenuItemC13834b
    public InterfaceMenuItemC13834b a(AbstractC16199a abstractC16199a) {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13834b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13834b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f150767j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f150766i;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f150771n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f150759b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f150768k;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f150773p;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f150774q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f150763f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f150758a;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f150765h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f150764g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f150760c;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f150761d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f150762e;
        return charSequence != null ? charSequence : this.f150761d;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f150772o;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f150777t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f150777t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f150777t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f150777t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f150766i = Character.toLowerCase(c10);
        this.f150767j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f150777t = (z10 ? 1 : 0) | (this.f150777t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f150777t = (z10 ? 2 : 0) | (this.f150777t & (-3));
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public InterfaceMenuItemC13834b setContentDescription(CharSequence charSequence) {
        this.f150771n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f150777t = (z10 ? 16 : 0) | (this.f150777t & (-17));
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f150773p = colorStateList;
        this.f150775r = true;
        c();
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f150774q = mode;
        this.f150776s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f150763f = intent;
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f150764g = c10;
        this.f150765h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f150770m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f150761d = this.f150769l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f150762e = charSequence;
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public InterfaceMenuItemC13834b setTooltipText(CharSequence charSequence) {
        this.f150772o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f150777t = (this.f150777t & 8) | (z10 ? 0 : 8);
        return this;
    }

    public C15714a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f150769l = context;
        this.f150758a = i11;
        this.f150759b = i10;
        this.f150760c = i13;
        this.f150761d = charSequence;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13834b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f150768k = b.e(this.f150769l, i10);
        c();
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f150764g = c10;
        this.f150765h = KeyEvent.normalizeMetaState(i10);
        this.f150766i = Character.toLowerCase(c11);
        this.f150767j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
