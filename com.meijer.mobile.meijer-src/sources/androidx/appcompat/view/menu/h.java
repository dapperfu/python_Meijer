package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import d2.C13595a;
import f2.InterfaceMenuItemC13944b;
import i.C14585h;
import j.C14879a;
import p2.AbstractC16344a;

/* loaded from: classes.dex */
public final class h implements InterfaceMenuItemC13944b {

    /* renamed from: A, reason: collision with root package name */
    private View f46512A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC16344a f46513B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f46514C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f46516E;

    /* renamed from: a, reason: collision with root package name */
    private final int f46517a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46518b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46519c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46520d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f46521e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f46522f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f46523g;

    /* renamed from: h, reason: collision with root package name */
    private char f46524h;

    /* renamed from: j, reason: collision with root package name */
    private char f46526j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f46528l;

    /* renamed from: n, reason: collision with root package name */
    f f46530n;

    /* renamed from: o, reason: collision with root package name */
    private n f46531o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f46532p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f46533q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f46534r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f46535s;

    /* renamed from: z, reason: collision with root package name */
    private int f46542z;

    /* renamed from: i, reason: collision with root package name */
    private int f46525i = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k, reason: collision with root package name */
    private int f46527k = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: m, reason: collision with root package name */
    private int f46529m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f46536t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f46537u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f46538v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46539w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f46540x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f46541y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f46515D = false;

    class a implements AbstractC16344a.b {
        a() {
        }

        @Override // p2.AbstractC16344a.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            h hVar = h.this;
            hVar.f46530n.M(hVar);
        }
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f46526j == c10) {
            return this;
        }
        this.f46526j = Character.toLowerCase(c10);
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46529m = 0;
        this.f46528l = drawable;
        this.f46540x = true;
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f46524h == c10) {
            return this;
        }
        this.f46524h = c10;
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f46524h = c10;
        this.f46526j = Character.toLowerCase(c11);
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46521e = charSequence;
        this.f46530n.N(false);
        n nVar = this.f46531o;
        if (nVar != null) {
            nVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f46540x && (this.f46538v || this.f46539w)) {
            drawable = C13595a.r(drawable).mutate();
            if (this.f46538v) {
                C13595a.o(drawable, this.f46536t);
            }
            if (this.f46539w) {
                C13595a.p(drawable, this.f46537u);
            }
            this.f46540x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f46530n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f46542z & 4) == 4;
    }

    @Override // f2.InterfaceMenuItemC13944b
    public InterfaceMenuItemC13944b a(AbstractC16344a abstractC16344a) {
        AbstractC16344a abstractC16344a2 = this.f46513B;
        if (abstractC16344a2 != null) {
            abstractC16344a2.h();
        }
        this.f46512A = null;
        this.f46513B = abstractC16344a;
        this.f46530n.N(true);
        AbstractC16344a abstractC16344a3 = this.f46513B;
        if (abstractC16344a3 != null) {
            abstractC16344a3.j(new a());
        }
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b
    public AbstractC16344a b() {
        return this.f46513B;
    }

    public void c() {
        this.f46530n.L(this);
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f46542z & 8) == 0) {
            return false;
        }
        if (this.f46512A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f46514C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f46530n.f(this);
        }
        return false;
    }

    public int f() {
        return this.f46520d;
    }

    char g() {
        return this.f46530n.J() ? this.f46526j : this.f46524h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public View getActionView() {
        View view = this.f46512A;
        if (view != null) {
            return view;
        }
        AbstractC16344a abstractC16344a = this.f46513B;
        if (abstractC16344a == null) {
            return null;
        }
        View viewD = abstractC16344a.d(this);
        this.f46512A = viewD;
        return viewD;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46527k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46526j;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46534r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46518b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f46528l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f46529m == 0) {
            return null;
        }
        Drawable drawableB = C14879a.b(this.f46530n.w(), this.f46529m);
        this.f46529m = 0;
        this.f46528l = drawableB;
        return e(drawableB);
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46536t;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46537u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46523g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f46517a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f46516E;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46525i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46524h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46519c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f46531o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f46521e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f46522f;
        return charSequence != null ? charSequence : this.f46521e;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46535s;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f46531o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.e()) ? getTitle() : getTitleCondensed();
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f46515D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f46541y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f46541y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f46541y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC16344a abstractC16344a = this.f46513B;
        return (abstractC16344a == null || !abstractC16344a.g()) ? (this.f46541y & 8) == 0 : (this.f46541y & 8) == 0 && this.f46513B.b();
    }

    public boolean j() {
        AbstractC16344a abstractC16344a;
        if ((this.f46542z & 8) != 0) {
            if (this.f46512A == null && (abstractC16344a = this.f46513B) != null) {
                this.f46512A = abstractC16344a.d(this);
            }
            if (this.f46512A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f46533q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        f fVar = this.f46530n;
        if (fVar.h(fVar, this)) {
            return true;
        }
        Runnable runnable = this.f46532p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f46523g != null) {
            try {
                this.f46530n.w().startActivity(this.f46523g);
                return true;
            } catch (ActivityNotFoundException e10) {
                FS.log_e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC16344a abstractC16344a = this.f46513B;
        return abstractC16344a != null && abstractC16344a.e();
    }

    public boolean l() {
        return (this.f46541y & 32) == 32;
    }

    public boolean m() {
        return (this.f46541y & 4) != 0;
    }

    public boolean n() {
        return (this.f46542z & 1) == 1;
    }

    public boolean o() {
        return (this.f46542z & 2) == 2;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13944b setActionView(int i10) {
        Context contextW = this.f46530n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13944b setActionView(View view) {
        int i10;
        this.f46512A = view;
        this.f46513B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f46517a) > 0) {
            view.setId(i10);
        }
        this.f46530n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f46515D = z10;
        this.f46530n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f46541y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f46541y = i11;
        if (i10 != i11) {
            this.f46530n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f46541y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f46541y = i11;
        if (i10 != i11) {
            this.f46530n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f46541y & 4) != 0) {
            this.f46530n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public InterfaceMenuItemC13944b setContentDescription(CharSequence charSequence) {
        this.f46534r = charSequence;
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f46541y |= 16;
        } else {
            this.f46541y &= -17;
        }
        this.f46530n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f46536t = colorStateList;
        this.f46538v = true;
        this.f46540x = true;
        this.f46530n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46537u = mode;
        this.f46539w = true;
        this.f46540x = true;
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46523g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f46514C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46533q = onMenuItemClickListener;
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f46542z = i10;
        this.f46530n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46522f = charSequence;
        this.f46530n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public InterfaceMenuItemC13944b setTooltipText(CharSequence charSequence) {
        this.f46535s = charSequence;
        this.f46530n.N(false);
        return this;
    }

    public void t(boolean z10) {
        this.f46541y = (z10 ? 4 : 0) | (this.f46541y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f46521e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f46541y |= 32;
        } else {
            this.f46541y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f46516E = contextMenuInfo;
    }

    public void x(n nVar) {
        this.f46531o = nVar;
        nVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f46541y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f46541y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f46530n.C();
    }

    h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f46530n = fVar;
        this.f46517a = i11;
        this.f46518b = i10;
        this.f46519c = i12;
        this.f46520d = i13;
        this.f46521e = charSequence;
        this.f46542z = i14;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f46514C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f46530n.m(this);
    }

    String h() {
        int i10;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f46530n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f46530n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C14585h.f136435m));
        }
        if (this.f46530n.J()) {
            i10 = this.f46527k;
        } else {
            i10 = this.f46525i;
        }
        d(sb2, i10, 65536, resources.getString(C14585h.f136431i));
        d(sb2, i10, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(C14585h.f136427e));
        d(sb2, i10, 2, resources.getString(C14585h.f136426d));
        d(sb2, i10, 1, resources.getString(C14585h.f136432j));
        d(sb2, i10, 4, resources.getString(C14585h.f136434l));
        d(sb2, i10, 8, resources.getString(C14585h.f136430h));
        if (cG != '\b') {
            if (cG != '\n') {
                if (cG != ' ') {
                    sb2.append(cG);
                } else {
                    sb2.append(resources.getString(C14585h.f136433k));
                }
            } else {
                sb2.append(resources.getString(C14585h.f136429g));
            }
        } else {
            sb2.append(resources.getString(C14585h.f136428f));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f46530n.M(this);
        }
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13944b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f46526j == c10 && this.f46527k == i10) {
            return this;
        }
        this.f46526j = Character.toLowerCase(c10);
        this.f46527k = KeyEvent.normalizeMetaState(i10);
        this.f46530n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f46524h == c10 && this.f46525i == i10) {
            return this;
        }
        this.f46524h = c10;
        this.f46525i = KeyEvent.normalizeMetaState(i10);
        this.f46530n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13944b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f46524h = c10;
        this.f46525i = KeyEvent.normalizeMetaState(i10);
        this.f46526j = Character.toLowerCase(c11);
        this.f46527k = KeyEvent.normalizeMetaState(i11);
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f46528l = null;
        this.f46529m = i10;
        this.f46540x = true;
        this.f46530n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f46530n.w().getString(i10));
    }
}
