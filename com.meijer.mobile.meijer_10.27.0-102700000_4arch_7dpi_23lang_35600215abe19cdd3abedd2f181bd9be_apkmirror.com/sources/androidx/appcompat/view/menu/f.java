package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import f2.InterfaceMenuC13833a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p2.AbstractC16199a;

/* loaded from: classes.dex */
public class f implements InterfaceMenuC13833a {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f46257A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f46258a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f46259b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46260c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46261d;

    /* renamed from: e, reason: collision with root package name */
    private a f46262e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f46270m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f46271n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f46272o;

    /* renamed from: p, reason: collision with root package name */
    View f46273p;

    /* renamed from: x, reason: collision with root package name */
    private h f46281x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f46283z;

    /* renamed from: l, reason: collision with root package name */
    private int f46269l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46274q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46275r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46276s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f46277t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f46278u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<h> f46279v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f46280w = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private boolean f46282y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<h> f46263f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<h> f46264g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f46265h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<h> f46266i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<h> f46267j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private boolean f46268k = true;

    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    public interface b {
        boolean c(h hVar);
    }

    public f F() {
        return this;
    }

    void L(h hVar) {
        this.f46268k = true;
        N(true);
    }

    void M(h hVar) {
        this.f46265h = true;
        N(true);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    protected f Z(int i10) {
        b0(0, null, i10, null, null);
        return this;
    }

    protected f a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    protected f c0(int i10) {
        b0(i10, null, 0, null, null);
        return this;
    }

    public void clearHeader() {
        this.f46272o = null;
        this.f46271n = null;
        this.f46273p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    protected f d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    protected f e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public void h0() {
        this.f46274q = false;
        if (this.f46275r) {
            this.f46275r = false;
            N(this.f46276s);
        }
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    private static int D(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f46257A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void Q(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f46263f.size()) {
            return;
        }
        this.f46263f.remove(i10);
        if (z10) {
            N(true);
        }
    }

    private h g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new h(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f46259b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f46258a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f46258a
            boolean r3 = p2.C16200a0.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f46261d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.g0(boolean):void");
    }

    private void i(boolean z10) {
        if (this.f46280w.isEmpty()) {
            return;
        }
        i0();
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f46280w.remove(next);
            } else {
                jVar.i(z10);
            }
        }
        h0();
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f46280w.isEmpty()) {
            return;
        }
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f46280w.remove(next);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    jVar.f(parcelable);
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable parcelableH;
        if (this.f46280w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f46280w.remove(next);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelableH = jVar.h()) != null) {
                    sparseArray.put(id2, parcelableH);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean l(n nVar, j jVar) {
        if (this.f46280w.isEmpty()) {
            return false;
        }
        boolean zG = jVar != null ? jVar.g(nVar) : false;
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.f46280w.remove(next);
            } else if (!zG) {
                zG = jVar2.g(nVar);
            }
        }
        return zG;
    }

    public View A() {
        return this.f46273p;
    }

    boolean C() {
        return this.f46277t;
    }

    Resources E() {
        return this.f46259b;
    }

    public ArrayList<h> G() {
        if (!this.f46265h) {
            return this.f46264g;
        }
        this.f46264g.clear();
        int size = this.f46263f.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f46263f.get(i10);
            if (hVar.isVisible()) {
                this.f46264g.add(hVar);
            }
        }
        this.f46265h = false;
        this.f46268k = true;
        return this.f46264g;
    }

    public boolean H() {
        return !this.f46274q;
    }

    public boolean I() {
        return this.f46282y;
    }

    boolean J() {
        return this.f46260c;
    }

    public boolean K() {
        return this.f46261d;
    }

    public void N(boolean z10) {
        if (this.f46274q) {
            this.f46275r = true;
            if (z10) {
                this.f46276s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f46265h = true;
            this.f46268k = true;
        }
        i(z10);
    }

    public boolean P(MenuItem menuItem, j jVar, int i10) {
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean zK = hVar.k();
        AbstractC16199a abstractC16199aB = hVar.b();
        boolean z10 = abstractC16199aB != null && abstractC16199aB.a();
        if (hVar.j()) {
            boolean zExpandActionView = hVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!hVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!hVar.hasSubMenu()) {
            hVar.x(new n(w(), this, hVar));
        }
        n nVar = (n) hVar.getSubMenu();
        if (z10) {
            abstractC16199aB.f(nVar);
        }
        boolean zL = l(nVar, jVar) | zK;
        if (!zL) {
            e(true);
        }
        return zL;
    }

    public void R(j jVar) {
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f46280w.remove(next);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((n) item.getSubMenu()).S(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void W(a aVar) {
        this.f46262e = aVar;
    }

    public f X(int i10) {
        this.f46269l = i10;
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f46259b.getString(i10));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f46258a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f46259b.getString(i10));
    }

    public void b(j jVar) {
        c(jVar, this.f46258a);
    }

    public void c(j jVar, Context context) {
        this.f46280w.add(new WeakReference<>(jVar));
        jVar.l(context, this);
        this.f46268k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        h hVar = this.f46281x;
        if (hVar != null) {
            f(hVar);
        }
        this.f46263f.clear();
        N(true);
    }

    public void d() {
        a aVar = this.f46262e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public final void e(boolean z10) {
        if (this.f46278u) {
            return;
        }
        this.f46278u = true;
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f46280w.remove(next);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f46278u = false;
    }

    public boolean f(h hVar) {
        boolean zK = false;
        if (!this.f46280w.isEmpty() && this.f46281x == hVar) {
            i0();
            Iterator<WeakReference<j>> it = this.f46280w.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f46280w.remove(next);
                } else {
                    zK = jVar.k(this, hVar);
                    if (zK) {
                        break;
                    }
                }
            }
            h0();
            if (zK) {
                this.f46281x = null;
            }
        }
        return zK;
    }

    public void f0(boolean z10) {
        this.f46283z = z10;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f46263f.get(i10);
    }

    boolean h(f fVar, MenuItem menuItem) {
        a aVar = this.f46262e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f46283z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f46263f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i0() {
        if (this.f46274q) {
            return;
        }
        this.f46274q = true;
        this.f46275r = false;
        this.f46276s = false;
    }

    public boolean m(h hVar) {
        boolean zD = false;
        if (this.f46280w.isEmpty()) {
            return false;
        }
        i0();
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f46280w.remove(next);
            } else {
                zD = jVar.d(this, hVar);
                if (zD) {
                    break;
                }
            }
        }
        h0();
        if (zD) {
            this.f46281x = hVar;
        }
        return zD;
    }

    h r(int i10, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f46279v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zJ = J();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            char alphabeticShortcut = zJ ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f46263f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f46263f.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.t(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f46282y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f46263f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f46263f.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f46263f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f46263f.get(i11);
            if (hVar.getGroupId() == i10 && hVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f46260c = z10;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f46263f.size();
    }

    protected String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f46258a;
    }

    public h x() {
        return this.f46281x;
    }

    public Drawable y() {
        return this.f46272o;
    }

    public CharSequence z() {
        return this.f46271n;
    }

    public f(Context context) {
        this.f46258a = context;
        this.f46259b = context.getResources();
        g0(true);
    }

    private void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f46273p = view;
            this.f46271n = null;
            this.f46272o = null;
        } else {
            if (i10 > 0) {
                this.f46271n = resourcesE.getText(i10);
            } else if (charSequence != null) {
                this.f46271n = charSequence;
            }
            if (i11 > 0) {
                this.f46272o = Z1.b.e(w(), i11);
            } else if (drawable != null) {
                this.f46272o = drawable;
            }
            this.f46273p = null;
        }
        N(false);
    }

    private static int p(ArrayList<h> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public ArrayList<h> B() {
        t();
        return this.f46267j;
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((n) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    void Y(MenuItem menuItem) {
        boolean z10;
        int groupId = menuItem.getGroupId();
        int size = this.f46263f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f46263f.get(i10);
            if (hVar.getGroupId() == groupId && hVar.m() && hVar.isCheckable()) {
                if (hVar == menuItem) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hVar.s(z10);
            }
        }
        h0();
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iD = D(i12);
        h hVarG = g(i10, i11, i12, iD, charSequence, this.f46269l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f46270m;
        if (contextMenuInfo != null) {
            hVarG.v(contextMenuInfo);
        }
        ArrayList<h> arrayList = this.f46263f;
        arrayList.add(p(arrayList, iD), hVarG);
        N(true);
        return hVarG;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h hVar = (h) a(i10, i11, i12, charSequence);
        n nVar = new n(this.f46258a, this, hVar);
        hVar.x(nVar);
        return nVar;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f46263f.get(i11);
            if (hVar.getItemId() == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (menuItemFindItem = hVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (r(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f46263f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean zO;
        h hVarR = r(i10, keyEvent);
        if (hVarR != null) {
            zO = O(hVarR, i11);
        } else {
            zO = false;
        }
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zO;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f46263f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iN = n(i10);
        if (iN >= 0) {
            int size = this.f46263f.size() - iN;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f46263f.get(iN).getGroupId() != i10) {
                    break;
                }
                Q(iN, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    void s(List<h> list, int i10, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f46263f.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = this.f46263f.get(i11);
                if (hVar.hasSubMenu()) {
                    ((f) hVar.getSubMenu()).s(list, i10, keyEvent);
                }
                if (zJ) {
                    numericShortcut = hVar.getAlphabeticShortcut();
                } else {
                    numericShortcut = hVar.getNumericShortcut();
                }
                if (zJ) {
                    numericModifiers = hVar.getAlphabeticModifiers();
                } else {
                    numericModifiers = hVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (zJ && numericShortcut == '\b' && i10 == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    public void t() {
        ArrayList<h> arrayListG = G();
        if (!this.f46268k) {
            return;
        }
        Iterator<WeakReference<j>> it = this.f46280w.iterator();
        boolean zJ = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f46280w.remove(next);
            } else {
                zJ |= jVar.j();
            }
        }
        if (zJ) {
            this.f46266i.clear();
            this.f46267j.clear();
            int size = arrayListG.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = arrayListG.get(i10);
                if (hVar.l()) {
                    this.f46266i.add(hVar);
                } else {
                    this.f46267j.add(hVar);
                }
            }
        } else {
            this.f46266i.clear();
            this.f46267j.clear();
            this.f46267j.addAll(G());
        }
        this.f46268k = false;
    }

    public ArrayList<h> u() {
        t();
        return this.f46266i;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f46259b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f46259b.getString(i13));
    }
}
