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
    private int f88037A;

    /* renamed from: B, reason: collision with root package name */
    int f88038B;

    /* renamed from: a, reason: collision with root package name */
    private NavigationMenuView f88041a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f88042b;

    /* renamed from: c, reason: collision with root package name */
    private j.a f88043c;

    /* renamed from: d, reason: collision with root package name */
    androidx.appcompat.view.menu.f f88044d;

    /* renamed from: e, reason: collision with root package name */
    private int f88045e;

    /* renamed from: f, reason: collision with root package name */
    c f88046f;

    /* renamed from: g, reason: collision with root package name */
    LayoutInflater f88047g;

    /* renamed from: i, reason: collision with root package name */
    ColorStateList f88049i;

    /* renamed from: l, reason: collision with root package name */
    ColorStateList f88052l;

    /* renamed from: m, reason: collision with root package name */
    ColorStateList f88053m;

    /* renamed from: n, reason: collision with root package name */
    Drawable f88054n;

    /* renamed from: o, reason: collision with root package name */
    RippleDrawable f88055o;

    /* renamed from: p, reason: collision with root package name */
    int f88056p;

    /* renamed from: q, reason: collision with root package name */
    int f88057q;

    /* renamed from: r, reason: collision with root package name */
    int f88058r;

    /* renamed from: s, reason: collision with root package name */
    int f88059s;

    /* renamed from: t, reason: collision with root package name */
    int f88060t;

    /* renamed from: u, reason: collision with root package name */
    int f88061u;

    /* renamed from: v, reason: collision with root package name */
    int f88062v;

    /* renamed from: w, reason: collision with root package name */
    int f88063w;

    /* renamed from: x, reason: collision with root package name */
    boolean f88064x;

    /* renamed from: z, reason: collision with root package name */
    private int f88066z;

    /* renamed from: h, reason: collision with root package name */
    int f88048h = 0;

    /* renamed from: j, reason: collision with root package name */
    int f88050j = 0;

    /* renamed from: k, reason: collision with root package name */
    boolean f88051k = true;

    /* renamed from: y, reason: collision with root package name */
    boolean f88065y = true;

    /* renamed from: C, reason: collision with root package name */
    private int f88039C = -1;

    /* renamed from: D, reason: collision with root package name */
    final View.OnClickListener f88040D = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            k.this.Z(true);
            androidx.appcompat.view.menu.h itemData = ((NavigationMenuItemView) view).getItemData();
            k kVar = k.this;
            boolean zP = kVar.f88044d.P(itemData, kVar, 0);
            if (itemData != null && itemData.isCheckable() && zP) {
                k.this.f88046f.q(itemData);
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
        private final ArrayList<e> f88068a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private androidx.appcompat.view.menu.h f88069b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f88070c;

        class a extends androidx.core.view.a {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f88072d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f88073e;

            a(int i10, boolean z10) {
                this.f88072d = i10;
                this.f88073e = z10;
            }

            @Override // androidx.core.view.a
            public void g(View view, q2.y yVar) {
                super.g(view, yVar);
                yVar.s0(y.f.a(c.this.c(this.f88072d), 1, 1, 1, this.f88073e, view.isSelected()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (k.this.f88046f.getItemViewType(i12) == 2 || k.this.f88046f.getItemViewType(i12) == 3) {
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
            for (int i11 = 0; i11 < k.this.f88046f.getTotalNumberOfTabs(); i11++) {
                int itemViewType = k.this.f88046f.getItemViewType(i11);
                if (itemViewType == 0 || itemViewType == 1) {
                    i10++;
                }
            }
            return i10;
        }

        c() {
            n();
        }

        private void g(int i10, int i11) {
            while (i10 < i11) {
                ((g) this.f88068a.get(i10)).f88078b = true;
                i10++;
            }
        }

        private void n() {
            if (this.f88070c) {
                return;
            }
            boolean z10 = true;
            this.f88070c = true;
            this.f88068a.clear();
            this.f88068a.add(new d());
            int size = k.this.f88044d.G().size();
            int i10 = -1;
            int i11 = 0;
            boolean z11 = false;
            int size2 = 0;
            while (i11 < size) {
                androidx.appcompat.view.menu.h hVar = k.this.f88044d.G().get(i11);
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
                            this.f88068a.add(new f(k.this.f88038B, 0));
                        }
                        this.f88068a.add(new g(hVar));
                        int size3 = this.f88068a.size();
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
                                this.f88068a.add(new g(hVar2));
                            }
                            i12++;
                            z10 = true;
                        }
                        if (z12) {
                            g(size3, this.f88068a.size());
                        }
                    }
                } else {
                    int groupId = hVar.getGroupId();
                    if (groupId != i10) {
                        size2 = this.f88068a.size();
                        z11 = hVar.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            ArrayList<e> arrayList = this.f88068a;
                            int i13 = k.this.f88038B;
                            arrayList.add(new f(i13, i13));
                        }
                    } else if (!z11 && hVar.getIcon() != null) {
                        g(size2, this.f88068a.size());
                        z11 = true;
                    }
                    g gVar = new g(hVar);
                    gVar.f88078b = z11;
                    this.f88068a.add(gVar);
                    i10 = groupId;
                }
                i11++;
                z10 = true;
            }
            this.f88070c = false;
        }

        private void p(View view, int i10, boolean z10) {
            ViewCompat.m0(view, new a(i10, z10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: getItemCount */
        public int getTotalNumberOfTabs() {
            return this.f88068a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i10) {
            e eVar = this.f88068a.get(i10);
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
            androidx.appcompat.view.menu.h hVar = this.f88069b;
            if (hVar != null) {
                bundle.putInt("android:menu:checked", hVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f88068a.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f88068a.get(i10);
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
            return this.f88069b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                k kVar = k.this;
                return new i(kVar.f88047g, viewGroup, kVar.f88040D);
            }
            if (i10 == 1) {
                return new C1281k(k.this.f88047g, viewGroup);
            }
            if (i10 == 2) {
                return new j(k.this.f88047g, viewGroup);
            }
            if (i10 != 3) {
                return null;
            }
            return new b(k.this.f88042b);
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
                this.f88070c = true;
                int size = this.f88068a.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    e eVar = this.f88068a.get(i11);
                    if ((eVar instanceof g) && (hVarA2 = ((g) eVar).a()) != null && hVarA2.getItemId() == i10) {
                        q(hVarA2);
                        break;
                    }
                    i11++;
                }
                this.f88070c = false;
                n();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f88068a.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = this.f88068a.get(i12);
                    if ((eVar2 instanceof g) && (hVarA = ((g) eVar2).a()) != null && (actionView = hVarA.getActionView()) != null && (mVar = (m) sparseParcelableArray.get(hVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(mVar);
                    }
                }
            }
        }

        public void q(androidx.appcompat.view.menu.h hVar) {
            if (this.f88069b == hVar || !hVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.h hVar2 = this.f88069b;
            if (hVar2 != null) {
                hVar2.setChecked(false);
            }
            this.f88069b = hVar;
            hVar.setChecked(true);
        }

        public void r(boolean z10) {
            this.f88070c = z10;
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
                    f fVar = (f) this.f88068a.get(i10);
                    lVar.itemView.setPadding(k.this.f88060t, fVar.b(), k.this.f88061u, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f88068a.get(i10)).a().getTitle());
                androidx.core.widget.k.p(textView, k.this.f88048h);
                textView.setPadding(k.this.f88062v, textView.getPaddingTop(), k.this.f88063w, textView.getPaddingBottom());
                ColorStateList colorStateList = k.this.f88049i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                p(textView, i10, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(k.this.f88053m);
            navigationMenuItemView.setTextAppearance(k.this.f88050j);
            ColorStateList colorStateList2 = k.this.f88052l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = k.this.f88054n;
            if (drawable != null) {
                drawableNewDrawable = drawable.getConstantState().newDrawable();
            } else {
                drawableNewDrawable = null;
            }
            ViewCompat.q0(navigationMenuItemView, drawableNewDrawable);
            RippleDrawable rippleDrawable = k.this.f88055o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f88068a.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f88078b);
            k kVar = k.this;
            int i11 = kVar.f88056p;
            int i12 = kVar.f88057q;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(k.this.f88058r);
            k kVar2 = k.this;
            if (kVar2.f88064x) {
                navigationMenuItemView.setIconSize(kVar2.f88059s);
            }
            navigationMenuItemView.setMaxLines(k.this.f88066z);
            navigationMenuItemView.B(gVar.a(), k.this.f88051k);
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
        private final int f88075a;

        /* renamed from: b, reason: collision with root package name */
        private final int f88076b;

        public int a() {
            return this.f88076b;
        }

        public int b() {
            return this.f88075a;
        }

        public f(int i10, int i11) {
            this.f88075a = i10;
            this.f88076b = i11;
        }
    }

    private static class g implements e {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.h f88077a;

        /* renamed from: b, reason: collision with root package name */
        boolean f88078b;

        public androidx.appcompat.view.menu.h a() {
            return this.f88077a;
        }

        g(androidx.appcompat.view.menu.h hVar) {
            this.f88077a = hVar;
        }
    }

    private class h extends androidx.recyclerview.widget.v {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.v, androidx.core.view.a
        public void g(View view, q2.y yVar) {
            super.g(view, yVar);
            yVar.r0(y.e.a(k.this.f88046f.j(), 1, false));
        }
    }

    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(ce.h.f61735f, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ce.h.f61737h, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.k$k, reason: collision with other inner class name */
    private static class C1281k extends l {
        public C1281k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ce.h.f61738i, viewGroup, false));
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
        return this.f88063w;
    }

    public int B() {
        return this.f88062v;
    }

    public View D(int i10) {
        View viewInflate = this.f88047g.inflate(i10, (ViewGroup) this.f88042b, false);
        b(viewInflate);
        return viewInflate;
    }

    public void E(boolean z10) {
        if (this.f88065y != z10) {
            this.f88065y = z10;
            a0();
        }
    }

    public void F(androidx.appcompat.view.menu.h hVar) {
        this.f88046f.q(hVar);
    }

    public void G(int i10) {
        this.f88061u = i10;
        i(false);
    }

    public void H(int i10) {
        this.f88060t = i10;
        i(false);
    }

    public void I(int i10) {
        this.f88045e = i10;
    }

    public void J(Drawable drawable) {
        this.f88054n = drawable;
        i(false);
    }

    public void K(RippleDrawable rippleDrawable) {
        this.f88055o = rippleDrawable;
        i(false);
    }

    public void L(int i10) {
        this.f88056p = i10;
        i(false);
    }

    public void M(int i10) {
        this.f88058r = i10;
        i(false);
    }

    public void N(int i10) {
        if (this.f88059s != i10) {
            this.f88059s = i10;
            this.f88064x = true;
            i(false);
        }
    }

    public void O(ColorStateList colorStateList) {
        this.f88053m = colorStateList;
        i(false);
    }

    public void P(int i10) {
        this.f88066z = i10;
        i(false);
    }

    public void Q(int i10) {
        this.f88050j = i10;
        i(false);
    }

    public void R(boolean z10) {
        this.f88051k = z10;
        i(false);
    }

    public void S(ColorStateList colorStateList) {
        this.f88052l = colorStateList;
        i(false);
    }

    public void T(int i10) {
        this.f88057q = i10;
        i(false);
    }

    public void U(int i10) {
        this.f88039C = i10;
        NavigationMenuView navigationMenuView = this.f88041a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void V(ColorStateList colorStateList) {
        this.f88049i = colorStateList;
        i(false);
    }

    public void W(int i10) {
        this.f88063w = i10;
        i(false);
    }

    public void X(int i10) {
        this.f88062v = i10;
        i(false);
    }

    public void Y(int i10) {
        this.f88048h = i10;
        i(false);
    }

    public void Z(boolean z10) {
        c cVar = this.f88046f;
        if (cVar != null) {
            cVar.r(z10);
        }
    }

    public void b(View view) {
        this.f88042b.addView(view);
        NavigationMenuView navigationMenuView = this.f88041a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        j.a aVar = this.f88043c;
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
                this.f88041a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f88046f.o(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f88042b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f88045e;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        Bundle bundle = new Bundle();
        if (this.f88041a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f88041a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f88046f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.h());
        }
        if (this.f88042b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f88042b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        c cVar = this.f88046f;
        if (cVar != null) {
            cVar.s();
        }
    }

    public androidx.appcompat.view.menu.h n() {
        return this.f88046f.i();
    }

    public int o() {
        return this.f88061u;
    }

    public int p() {
        return this.f88060t;
    }

    public int q() {
        return this.f88042b.getChildCount();
    }

    public View r(int i10) {
        return this.f88042b.getChildAt(i10);
    }

    public Drawable s() {
        return this.f88054n;
    }

    public int t() {
        return this.f88056p;
    }

    public int u() {
        return this.f88058r;
    }

    public int v() {
        return this.f88066z;
    }

    public ColorStateList w() {
        return this.f88052l;
    }

    public ColorStateList x() {
        return this.f88053m;
    }

    public int y() {
        return this.f88057q;
    }

    public androidx.appcompat.view.menu.k z(ViewGroup viewGroup) {
        if (this.f88041a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f88047g.inflate(ce.h.f61739j, viewGroup, false);
            this.f88041a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f88041a));
            if (this.f88046f == null) {
                c cVar = new c();
                this.f88046f = cVar;
                cVar.setHasStableIds(true);
            }
            int i10 = this.f88039C;
            if (i10 != -1) {
                this.f88041a.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.f88047g.inflate(ce.h.f61736g, (ViewGroup) this.f88041a, false);
            this.f88042b = linearLayout;
            ViewCompat.w0(linearLayout, 2);
            this.f88041a.setAdapter(this.f88046f);
        }
        return this.f88041a;
    }

    private boolean C() {
        if (q() > 0) {
            return true;
        }
        return false;
    }

    private void a0() {
        int i10;
        if (!C() && this.f88065y) {
            i10 = this.f88037A;
        } else {
            i10 = 0;
        }
        NavigationMenuView navigationMenuView = this.f88041a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f88047g = LayoutInflater.from(context);
        this.f88044d = fVar;
        this.f88038B = context.getResources().getDimensionPixelOffset(ce.d.f61616f);
    }

    public void m(androidx.core.view.j jVar) {
        int iM = jVar.m();
        if (this.f88037A != iM) {
            this.f88037A = iM;
            a0();
        }
        NavigationMenuView navigationMenuView = this.f88041a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, jVar.j());
        ViewCompat.h(this.f88042b, jVar);
    }
}
