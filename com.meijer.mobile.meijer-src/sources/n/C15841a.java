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
import d2.C13595a;
import f2.InterfaceMenuItemC13944b;
import p2.AbstractC16344a;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C15841a implements InterfaceMenuItemC13944b {

    /* renamed from: a, reason: collision with root package name */
    private final int f151793a;

    /* renamed from: b, reason: collision with root package name */
    private final int f151794b;

    /* renamed from: c, reason: collision with root package name */
    private final int f151795c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f151796d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f151797e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f151798f;

    /* renamed from: g, reason: collision with root package name */
    private char f151799g;

    /* renamed from: i, reason: collision with root package name */
    private char f151801i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f151803k;

    /* renamed from: l, reason: collision with root package name */
    private Context f151804l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f151805m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f151806n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f151807o;

    /* renamed from: h, reason: collision with root package name */
    private int f151800h = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j, reason: collision with root package name */
    private int f151802j = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f151808p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f151809q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f151810r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f151811s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f151812t = 16;

    @Override // f2.InterfaceMenuItemC13944b
    public AbstractC16344a b() {
        return null;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
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

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f151801i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f151803k = drawable;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f151799g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f151799g = c10;
        this.f151801i = Character.toLowerCase(c11);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f151796d = charSequence;
        return this;
    }

    private void c() {
        Drawable drawable = this.f151803k;
        if (drawable != null) {
            if (this.f151810r || this.f151811s) {
                Drawable drawableR = C13595a.r(drawable);
                this.f151803k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f151803k = drawableMutate;
                if (this.f151810r) {
                    C13595a.o(drawableMutate, this.f151808p);
                }
                if (this.f151811s) {
                    C13595a.p(this.f151803k, this.f151809q);
                }
            }
        }
    }

    @Override // f2.InterfaceMenuItemC13944b
    public InterfaceMenuItemC13944b a(AbstractC16344a abstractC16344a) {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13944b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13944b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f151802j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f151801i;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f151806n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f151794b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f151803k;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f151808p;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f151809q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f151798f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f151793a;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f151800h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f151799g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f151795c;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f151796d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f151797e;
        return charSequence != null ? charSequence : this.f151796d;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f151807o;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f151812t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f151812t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f151812t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f151812t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f151801i = Character.toLowerCase(c10);
        this.f151802j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f151812t = (z10 ? 1 : 0) | (this.f151812t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f151812t = (z10 ? 2 : 0) | (this.f151812t & (-3));
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public InterfaceMenuItemC13944b setContentDescription(CharSequence charSequence) {
        this.f151806n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f151812t = (z10 ? 16 : 0) | (this.f151812t & (-17));
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f151808p = colorStateList;
        this.f151810r = true;
        c();
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f151809q = mode;
        this.f151811s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f151798f = intent;
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f151799g = c10;
        this.f151800h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f151805m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f151796d = this.f151804l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f151797e = charSequence;
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public InterfaceMenuItemC13944b setTooltipText(CharSequence charSequence) {
        this.f151807o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f151812t = (this.f151812t & 8) | (z10 ? 0 : 8);
        return this;
    }

    public C15841a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f151804l = context;
        this.f151793a = i11;
        this.f151794b = i10;
        this.f151795c = i13;
        this.f151796d = charSequence;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13944b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f151803k = b.e(this.f151804l, i10);
        c();
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f151799g = c10;
        this.f151800h = KeyEvent.normalizeMetaState(i10);
        this.f151801i = Character.toLowerCase(c11);
        this.f151802j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
