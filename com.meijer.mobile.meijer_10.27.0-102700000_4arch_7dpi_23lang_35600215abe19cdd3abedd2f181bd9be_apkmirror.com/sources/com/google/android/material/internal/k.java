package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import q2.y;

/* loaded from: classes4.dex */
public class k implements androidx.appcompat.view.menu.j {

    /* renamed from: A, reason: collision with root package name */
    private int f87197A;

    /* renamed from: B, reason: collision with root package name */
    int f87198B;

    /* renamed from: a, reason: collision with root package name */
    private NavigationMenuView f87201a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f87202b;

    /* renamed from: c, reason: collision with root package name */
    private j.a f87203c;

    /* renamed from: d, reason: collision with root package name */
    androidx.appcompat.view.menu.f f87204d;

    /* renamed from: e, reason: collision with root package name */
    private int f87205e;

    /* renamed from: f, reason: collision with root package name */
    c f87206f;

    /* renamed from: g, reason: collision with root package name */
    LayoutInflater f87207g;

    /* renamed from: i, reason: collision with root package name */
    ColorStateList f87209i;

    /* renamed from: l, reason: collision with root package name */
    ColorStateList f87212l;

    /* renamed from: m, reason: collision with root package name */
    ColorStateList f87213m;

    /* renamed from: n, reason: collision with root package name */
    Drawable f87214n;

    /* renamed from: o, reason: collision with root package name */
    RippleDrawable f87215o;

    /* renamed from: p, reason: collision with root package name */
    int f87216p;

    /* renamed from: q, reason: collision with root package name */
    int f87217q;

    /* renamed from: r, reason: collision with root package name */
    int f87218r;

    /* renamed from: s, reason: collision with root package name */
    int f87219s;

    /* renamed from: t, reason: collision with root package name */
    int f87220t;

    /* renamed from: u, reason: collision with root package name */
    int f87221u;

    /* renamed from: v, reason: collision with root package name */
    int f87222v;

    /* renamed from: w, reason: collision with root package name */
    int f87223w;

    /* renamed from: x, reason: collision with root package name */
    boolean f87224x;

    /* renamed from: z, reason: collision with root package name */
    private int f87226z;

    /* renamed from: h, reason: collision with root package name */
    int f87208h = 0;

    /* renamed from: j, reason: collision with root package name */
    int f87210j = 0;

    /* renamed from: k, reason: collision with root package name */
    boolean f87211k = true;

    /* renamed from: y, reason: collision with root package name */
    boolean f87225y = true;

    /* renamed from: C, reason: collision with root package name */
    private int f87199C = -1;

    /* renamed from: D, reason: collision with root package name */
    final View.OnClickListener f87200D = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            k.this.Z(true);
            androidx.appcompat.view.menu.h itemData = ((NavigationMenuItemView) view).getItemData();
            k kVar = k.this;
            boolean zP = kVar.f87204d.P(itemData, kVar, 0);
            if (itemData != null && itemData.isCheckable() && zP) {
                k.this.f87206f.q(itemData);
            } else {
                z10 = false;
            }
            k.this.Z(false);
            if (z10) {
                k.this.i(false);
            }
        }
    }

    private class c extends RecyclerView.h<l> {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<e> f87228a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private androidx.appcompat.view.menu.h f87229b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f87230c;

        class a extends androidx.core.view.a {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f87232d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f87233e;

            a(int i10, boolean z10) {
                this.f87232d = i10;
                this.f87233e = z10;
            }

            @Override // androidx.core.view.a
            public void g(View view, q2.y yVar) {
                super.g(view, yVar);
                yVar.s0(y.f.a(c.this.c(this.f87232d), 1, 1, 1, this.f87233e, view.isSelected()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (k.this.f87206f.getItemViewType(i12) == 2 || k.this.f87206f.getItemViewType(i12) == 3) {
                    i11--;
                }
            }
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }

        int j() {
            int i10 = 0;
            for (int i11 = 0; i11 < k.this.f87206f.getTotalNumberOfTabs(); i11++) {
                int itemViewType = k.this.f87206f.getItemViewType(i11);
                if (itemViewType == 0 || itemViewType == 1) {
                    i10++;
                }
            }
            return i10;
        }

        c() {
            n();
        }

        private void f(int i10, int i11) {
            while (i10 < i11) {
                ((g) this.f87228a.get(i10)).f87238b = true;
                i10++;
            }
        }

        private void n() {
            if (this.f87230c) {
                return;
            }
            boolean z10 = true;
            this.f87230c = true;
            this.f87228a.clear();
            this.f87228a.add(new d());
            int size = k.this.f87204d.G().size();
            int i10 = -1;
            int i11 = 0;
            boolean z11 = false;
            int size2 = 0;
            while (i11 < size) {
                androidx.appcompat.view.menu.h hVar = k.this.f87204d.G().get(i11);
                if (hVar.isChecked()) {
                    q(hVar);
                }
                if (hVar.isCheckable()) {
                    hVar.t(false);
                }
                if (hVar.hasSubMenu()) {
                    SubMenu subMenu = hVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.f87228a.add(new f(k.this.f87198B, 0));
                        }
                        this.f87228a.add(new g(hVar));
                        int size3 = this.f87228a.size();
                        int size4 = subMenu.size();
                        int i12 = 0;
                        boolean z12 = false;
                        while (i12 < size4) {
                            androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) subMenu.getItem(i12);
                            if (hVar2.isVisible()) {
                                if (!z12 && hVar2.getIcon() != null) {
                                    z12 = z10;
                                }
                                if (hVar2.isCheckable()) {
                                    hVar2.t(false);
                                }
                                if (hVar.isChecked()) {
                                    q(hVar);
                                }
                                this.f87228a.add(new g(hVar2));
                            }
                            i12++;
                            z10 = true;
                        }
                        if (z12) {
                            f(size3, this.f87228a.size());
                        }
                    }
                } else {
                    int groupId = hVar.getGroupId();
                    if (groupId != i10) {
                        size2 = this.f87228a.size();
                        z11 = hVar.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            ArrayList<e> arrayList = this.f87228a;
                            int i13 = k.this.f87198B;
                            arrayList.add(new f(i13, i13));
                        }
                    } else if (!z11 && hVar.getIcon() != null) {
                        f(size2, this.f87228a.size());
                        z11 = true;
                    }
                    g gVar = new g(hVar);
                    gVar.f87238b = z11;
                    this.f87228a.add(gVar);
                    i10 = groupId;
                }
                i11++;
                z10 = true;
            }
            this.f87230c = false;
        }

        private void p(View view, int i10, boolean z10) {
            ViewCompat.m0(view, new a(i10, z10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: getItemCount */
        public int getTotalNumberOfTabs() {
            return this.f87228a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i10) {
            e eVar = this.f87228a.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public Bundle h() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.h hVar = this.f87229b;
            if (hVar != null) {
                bundle.putInt("android:menu:checked", hVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f87228a.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f87228a.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.h hVarA = ((g) eVar).a();
                    View actionView = hVarA != null ? hVarA.getActionView() : null;
                    if (actionView != null) {
                        m mVar = new m();
                        actionView.saveHierarchyState(mVar);
                        sparseArray.put(hVarA.getItemId(), mVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.h i() {
            return this.f87229b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                k kVar = k.this;
                return new i(kVar.f87207g, viewGroup, kVar.f87200D);
            }
            if (i10 == 1) {
                return new C1272k(k.this.f87207g, viewGroup);
            }
            if (i10 == 2) {
                return new j(k.this.f87207g, viewGroup);
            }
            if (i10 != 3) {
                return null;
            }
            return new b(k.this.f87202b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).C();
            }
        }

        public void o(Bundle bundle) {
            androidx.appcompat.view.menu.h hVarA;
            View actionView;
            m mVar;
            androidx.appcompat.view.menu.h hVarA2;
            int i10 = bundle.getInt("android:menu:checked", 0);
            if (i10 != 0) {
                this.f87230c = true;
                int size = this.f87228a.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    e eVar = this.f87228a.get(i11);
                    if ((eVar instanceof g) && (hVarA2 = ((g) eVar).a()) != null && hVarA2.getItemId() == i10) {
                        q(hVarA2);
                        break;
                    }
                    i11++;
                }
                this.f87230c = false;
                n();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f87228a.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = this.f87228a.get(i12);
                    if ((eVar2 instanceof g) && (hVarA = ((g) eVar2).a()) != null && (actionView = hVarA.getActionView()) != null && (mVar = (m) sparseParcelableArray.get(hVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(mVar);
                    }
                }
            }
        }

        public void q(androidx.appcompat.view.menu.h hVar) {
            if (this.f87229b == hVar || !hVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.h hVar2 = this.f87229b;
            if (hVar2 != null) {
                hVar2.setChecked(false);
            }
            this.f87229b = hVar;
            hVar.setChecked(true);
        }

        public void r(boolean z10) {
            this.f87230c = z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(l lVar, int i10) throws Resources.NotFoundException {
            Drawable drawableNewDrawable;
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.f87228a.get(i10);
                    lVar.itemView.setPadding(k.this.f87220t, fVar.b(), k.this.f87221u, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f87228a.get(i10)).a().getTitle());
                androidx.core.widget.k.p(textView, k.this.f87208h);
                textView.setPadding(k.this.f87222v, textView.getPaddingTop(), k.this.f87223w, textView.getPaddingBottom());
                ColorStateList colorStateList = k.this.f87209i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                p(textView, i10, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(k.this.f87213m);
            navigationMenuItemView.setTextAppearance(k.this.f87210j);
            ColorStateList colorStateList2 = k.this.f87212l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = k.this.f87214n;
            if (drawable != null) {
                drawableNewDrawable = drawable.getConstantState().newDrawable();
            } else {
                drawableNewDrawable = null;
            }
            ViewCompat.q0(navigationMenuItemView, drawableNewDrawable);
            RippleDrawable rippleDrawable = k.this.f87215o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f87228a.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f87238b);
            k kVar = k.this;
            int i11 = kVar.f87216p;
            int i12 = kVar.f87217q;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(k.this.f87218r);
            k kVar2 = k.this;
            if (kVar2.f87224x) {
                navigationMenuItemView.setIconSize(kVar2.f87219s);
            }
            navigationMenuItemView.setMaxLines(k.this.f87226z);
            navigationMenuItemView.B(gVar.a(), k.this.f87211k);
            p(navigationMenuItemView, i10, false);
        }

        public void s() {
            n();
            notifyDataSetChanged();
        }
    }

    private interface e {
    }

    private static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f87235a;

        /* renamed from: b, reason: collision with root package name */
        private final int f87236b;

        public int a() {
            return this.f87236b;
        }

        public int b() {
            return this.f87235a;
        }

        public f(int i10, int i11) {
            this.f87235a = i10;
            this.f87236b = i11;
        }
    }

    private static class g implements e {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.h f87237a;

        /* renamed from: b, reason: collision with root package name */
        boolean f87238b;

        public androidx.appcompat.view.menu.h a() {
            return this.f87237a;
        }

        g(androidx.appcompat.view.menu.h hVar) {
            this.f87237a = hVar;
        }
    }

    private class h extends androidx.recyclerview.widget.v {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.v, androidx.core.view.a
        public void g(View view, q2.y yVar) {
            super.g(view, yVar);
            yVar.r0(y.e.a(k.this.f87206f.j(), 1, false));
        }
    }

    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(ae.h.f44720f, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ae.h.f44722h, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.k$k, reason: collision with other inner class name */
    private static class C1272k extends l {
        public C1272k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ae.h.f44723i, viewGroup, false));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.n nVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    private static class d implements e {
        d() {
        }
    }

    private static abstract class l extends RecyclerView.F {
        public l(View view) {
            super(view);
        }
    }

    public int A() {
        return this.f87223w;
    }

    public int B() {
        return this.f87222v;
    }

    public View D(int i10) {
        View viewInflate = this.f87207g.inflate(i10, (ViewGroup) this.f87202b, false);
        b(viewInflate);
        return viewInflate;
    }

    public void E(boolean z10) {
        if (this.f87225y != z10) {
            this.f87225y = z10;
            a0();
        }
    }

    public void F(androidx.appcompat.view.menu.h hVar) {
        this.f87206f.q(hVar);
    }

    public void G(int i10) {
        this.f87221u = i10;
        i(false);
    }

    public void H(int i10) {
        this.f87220t = i10;
        i(false);
    }

    public void I(int i10) {
        this.f87205e = i10;
    }

    public void J(Drawable drawable) {
        this.f87214n = drawable;
        i(false);
    }

    public void K(RippleDrawable rippleDrawable) {
        this.f87215o = rippleDrawable;
        i(false);
    }

    public void L(int i10) {
        this.f87216p = i10;
        i(false);
    }

    public void M(int i10) {
        this.f87218r = i10;
        i(false);
    }

    public void N(int i10) {
        if (this.f87219s != i10) {
            this.f87219s = i10;
            this.f87224x = true;
            i(false);
        }
    }

    public void O(ColorStateList colorStateList) {
        this.f87213m = colorStateList;
        i(false);
    }

    public void P(int i10) {
        this.f87226z = i10;
        i(false);
    }

    public void Q(int i10) {
        this.f87210j = i10;
        i(false);
    }

    public void R(boolean z10) {
        this.f87211k = z10;
        i(false);
    }

    public void S(ColorStateList colorStateList) {
        this.f87212l = colorStateList;
        i(false);
    }

    public void T(int i10) {
        this.f87217q = i10;
        i(false);
    }

    public void U(int i10) {
        this.f87199C = i10;
        NavigationMenuView navigationMenuView = this.f87201a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void V(ColorStateList colorStateList) {
        this.f87209i = colorStateList;
        i(false);
    }

    public void W(int i10) {
        this.f87223w = i10;
        i(false);
    }

    public void X(int i10) {
        this.f87222v = i10;
        i(false);
    }

    public void Y(int i10) {
        this.f87208h = i10;
        i(false);
    }

    public void Z(boolean z10) {
        c cVar = this.f87206f;
        if (cVar != null) {
            cVar.r(z10);
        }
    }

    public void b(View view) {
        this.f87202b.addView(view);
        NavigationMenuView navigationMenuView = this.f87201a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        j.a aVar = this.f87203c;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f87201a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f87206f.o(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f87202b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f87205e;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        Bundle bundle = new Bundle();
        if (this.f87201a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f87201a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f87206f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.h());
        }
        if (this.f87202b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f87202b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        c cVar = this.f87206f;
        if (cVar != null) {
            cVar.s();
        }
    }

    public androidx.appcompat.view.menu.h n() {
        return this.f87206f.i();
    }

    public int o() {
        return this.f87221u;
    }

    public int p() {
        return this.f87220t;
    }

    public int q() {
        return this.f87202b.getChildCount();
    }

    public View r(int i10) {
        return this.f87202b.getChildAt(i10);
    }

    public Drawable s() {
        return this.f87214n;
    }

    public int t() {
        return this.f87216p;
    }

    public int u() {
        return this.f87218r;
    }

    public int v() {
        return this.f87226z;
    }

    public ColorStateList w() {
        return this.f87212l;
    }

    public ColorStateList x() {
        return this.f87213m;
    }

    public int y() {
        return this.f87217q;
    }

    public androidx.appcompat.view.menu.k z(ViewGroup viewGroup) {
        if (this.f87201a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f87207g.inflate(ae.h.f44724j, viewGroup, false);
            this.f87201a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f87201a));
            if (this.f87206f == null) {
                c cVar = new c();
                this.f87206f = cVar;
                cVar.setHasStableIds(true);
            }
            int i10 = this.f87199C;
            if (i10 != -1) {
                this.f87201a.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.f87207g.inflate(ae.h.f44721g, (ViewGroup) this.f87201a, false);
            this.f87202b = linearLayout;
            ViewCompat.w0(linearLayout, 2);
            this.f87201a.setAdapter(this.f87206f);
        }
        return this.f87201a;
    }

    private boolean C() {
        if (q() > 0) {
            return true;
        }
        return false;
    }

    private void a0() {
        int i10;
        if (!C() && this.f87225y) {
            i10 = this.f87197A;
        } else {
            i10 = 0;
        }
        NavigationMenuView navigationMenuView = this.f87201a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f87207g = LayoutInflater.from(context);
        this.f87204d = fVar;
        this.f87198B = context.getResources().getDimensionPixelOffset(ae.d.f44601f);
    }

    public void m(androidx.core.view.j jVar) {
        int iM = jVar.m();
        if (this.f87197A != iM) {
            this.f87197A = iM;
            a0();
        }
        NavigationMenuView navigationMenuView = this.f87201a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, jVar.j());
        ViewCompat.h(this.f87202b, jVar);
    }
}
