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
import d2.C13462a;
import f2.InterfaceMenuItemC13834b;
import i.C14582h;
import j.C14791a;
import p2.AbstractC16199a;

/* loaded from: classes.dex */
public final class h implements InterfaceMenuItemC13834b {

    /* renamed from: A, reason: collision with root package name */
    private View f46288A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC16199a f46289B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f46290C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f46292E;

    /* renamed from: a, reason: collision with root package name */
    private final int f46293a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46294b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46295c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46296d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f46297e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f46298f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f46299g;

    /* renamed from: h, reason: collision with root package name */
    private char f46300h;

    /* renamed from: j, reason: collision with root package name */
    private char f46302j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f46304l;

    /* renamed from: n, reason: collision with root package name */
    f f46306n;

    /* renamed from: o, reason: collision with root package name */
    private n f46307o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f46308p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f46309q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f46310r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f46311s;

    /* renamed from: z, reason: collision with root package name */
    private int f46318z;

    /* renamed from: i, reason: collision with root package name */
    private int f46301i = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k, reason: collision with root package name */
    private int f46303k = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: m, reason: collision with root package name */
    private int f46305m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f46312t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f46313u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f46314v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46315w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f46316x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f46317y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f46291D = false;

    class a implements AbstractC16199a.b {
        a() {
        }

        @Override // p2.AbstractC16199a.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            h hVar = h.this;
            hVar.f46306n.M(hVar);
        }
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f46302j == c10) {
            return this;
        }
        this.f46302j = Character.toLowerCase(c10);
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46305m = 0;
        this.f46304l = drawable;
        this.f46316x = true;
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f46300h == c10) {
            return this;
        }
        this.f46300h = c10;
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f46300h = c10;
        this.f46302j = Character.toLowerCase(c11);
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46297e = charSequence;
        this.f46306n.N(false);
        n nVar = this.f46307o;
        if (nVar != null) {
            nVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f46316x && (this.f46314v || this.f46315w)) {
            drawable = C13462a.r(drawable).mutate();
            if (this.f46314v) {
                C13462a.o(drawable, this.f46312t);
            }
            if (this.f46315w) {
                C13462a.p(drawable, this.f46313u);
            }
            this.f46316x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f46306n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f46318z & 4) == 4;
    }

    @Override // f2.InterfaceMenuItemC13834b
    public InterfaceMenuItemC13834b a(AbstractC16199a abstractC16199a) {
        AbstractC16199a abstractC16199a2 = this.f46289B;
        if (abstractC16199a2 != null) {
            abstractC16199a2.h();
        }
        this.f46288A = null;
        this.f46289B = abstractC16199a;
        this.f46306n.N(true);
        AbstractC16199a abstractC16199a3 = this.f46289B;
        if (abstractC16199a3 != null) {
            abstractC16199a3.j(new a());
        }
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b
    public AbstractC16199a b() {
        return this.f46289B;
    }

    public void c() {
        this.f46306n.L(this);
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f46318z & 8) == 0) {
            return false;
        }
        if (this.f46288A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f46290C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f46306n.f(this);
        }
        return false;
    }

    public int f() {
        return this.f46296d;
    }

    char g() {
        return this.f46306n.J() ? this.f46302j : this.f46300h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public View getActionView() {
        View view = this.f46288A;
        if (view != null) {
            return view;
        }
        AbstractC16199a abstractC16199a = this.f46289B;
        if (abstractC16199a == null) {
            return null;
        }
        View viewD = abstractC16199a.d(this);
        this.f46288A = viewD;
        return viewD;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46303k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46302j;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46310r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46294b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f46304l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f46305m == 0) {
            return null;
        }
        Drawable drawableB = C14791a.b(this.f46306n.w(), this.f46305m);
        this.f46305m = 0;
        this.f46304l = drawableB;
        return e(drawableB);
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46312t;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46313u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46299g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f46293a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f46292E;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46301i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46300h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46295c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f46307o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f46297e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f46298f;
        return charSequence != null ? charSequence : this.f46297e;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46311s;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f46307o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.e()) ? getTitle() : getTitleCondensed();
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f46291D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f46317y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f46317y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f46317y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC16199a abstractC16199a = this.f46289B;
        return (abstractC16199a == null || !abstractC16199a.g()) ? (this.f46317y & 8) == 0 : (this.f46317y & 8) == 0 && this.f46289B.b();
    }

    public boolean j() {
        AbstractC16199a abstractC16199a;
        if ((this.f46318z & 8) != 0) {
            if (this.f46288A == null && (abstractC16199a = this.f46289B) != null) {
                this.f46288A = abstractC16199a.d(this);
            }
            if (this.f46288A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f46309q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        f fVar = this.f46306n;
        if (fVar.h(fVar, this)) {
            return true;
        }
        Runnable runnable = this.f46308p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f46299g != null) {
            try {
                this.f46306n.w().startActivity(this.f46299g);
                return true;
            } catch (ActivityNotFoundException e10) {
                FS.log_e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC16199a abstractC16199a = this.f46289B;
        return abstractC16199a != null && abstractC16199a.e();
    }

    public boolean l() {
        return (this.f46317y & 32) == 32;
    }

    public boolean m() {
        return (this.f46317y & 4) != 0;
    }

    public boolean n() {
        return (this.f46318z & 1) == 1;
    }

    public boolean o() {
        return (this.f46318z & 2) == 2;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13834b setActionView(int i10) {
        Context contextW = this.f46306n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13834b setActionView(View view) {
        int i10;
        this.f46288A = view;
        this.f46289B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f46293a) > 0) {
            view.setId(i10);
        }
        this.f46306n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f46291D = z10;
        this.f46306n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f46317y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f46317y = i11;
        if (i10 != i11) {
            this.f46306n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f46317y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f46317y = i11;
        if (i10 != i11) {
            this.f46306n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f46317y & 4) != 0) {
            this.f46306n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public InterfaceMenuItemC13834b setContentDescription(CharSequence charSequence) {
        this.f46310r = charSequence;
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f46317y |= 16;
        } else {
            this.f46317y &= -17;
        }
        this.f46306n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f46312t = colorStateList;
        this.f46314v = true;
        this.f46316x = true;
        this.f46306n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46313u = mode;
        this.f46315w = true;
        this.f46316x = true;
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46299g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f46290C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46309q = onMenuItemClickListener;
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f46318z = i10;
        this.f46306n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46298f = charSequence;
        this.f46306n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public InterfaceMenuItemC13834b setTooltipText(CharSequence charSequence) {
        this.f46311s = charSequence;
        this.f46306n.N(false);
        return this;
    }

    public void t(boolean z10) {
        this.f46317y = (z10 ? 4 : 0) | (this.f46317y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f46297e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f46317y |= 32;
        } else {
            this.f46317y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f46292E = contextMenuInfo;
    }

    public void x(n nVar) {
        this.f46307o = nVar;
        nVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f46317y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f46317y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f46306n.C();
    }

    h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f46306n = fVar;
        this.f46293a = i11;
        this.f46294b = i10;
        this.f46295c = i12;
        this.f46296d = i13;
        this.f46297e = charSequence;
        this.f46318z = i14;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f46290C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f46306n.m(this);
    }

    String h() {
        int i10;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f46306n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f46306n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C14582h.f136678m));
        }
        if (this.f46306n.J()) {
            i10 = this.f46303k;
        } else {
            i10 = this.f46301i;
        }
        d(sb2, i10, 65536, resources.getString(C14582h.f136674i));
        d(sb2, i10, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(C14582h.f136670e));
        d(sb2, i10, 2, resources.getString(C14582h.f136669d));
        d(sb2, i10, 1, resources.getString(C14582h.f136675j));
        d(sb2, i10, 4, resources.getString(C14582h.f136677l));
        d(sb2, i10, 8, resources.getString(C14582h.f136673h));
        if (cG != '\b') {
            if (cG != '\n') {
                if (cG != ' ') {
                    sb2.append(cG);
                } else {
                    sb2.append(resources.getString(C14582h.f136676k));
                }
            } else {
                sb2.append(resources.getString(C14582h.f136672g));
            }
        } else {
            sb2.append(resources.getString(C14582h.f136671f));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f46306n.M(this);
        }
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC13834b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f46302j == c10 && this.f46303k == i10) {
            return this;
        }
        this.f46302j = Character.toLowerCase(c10);
        this.f46303k = KeyEvent.normalizeMetaState(i10);
        this.f46306n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f46300h == c10 && this.f46301i == i10) {
            return this;
        }
        this.f46300h = c10;
        this.f46301i = KeyEvent.normalizeMetaState(i10);
        this.f46306n.N(false);
        return this;
    }

    @Override // f2.InterfaceMenuItemC13834b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f46300h = c10;
        this.f46301i = KeyEvent.normalizeMetaState(i10);
        this.f46302j = Character.toLowerCase(c11);
        this.f46303k = KeyEvent.normalizeMetaState(i11);
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f46304l = null;
        this.f46305m = i10;
        this.f46316x = true;
        this.f46306n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f46306n.w().getString(i10));
    }
}
