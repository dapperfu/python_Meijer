package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final TabLayout f88514a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager2 f88515b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f88516c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f88517d;

    /* renamed from: e, reason: collision with root package name */
    private final b f88518e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.h<?> f88519f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f88520g;

    /* renamed from: h, reason: collision with root package name */
    private c f88521h;

    /* renamed from: i, reason: collision with root package name */
    private TabLayout.d f88522i;

    /* renamed from: j, reason: collision with root package name */
    private RecyclerView.j f88523j;

    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            d.this.b();
        }
    }

    public interface b {
        void onConfigureTab(TabLayout.f fVar, int i10);
    }

    private static class c extends ViewPager2.i {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<TabLayout> f88525a;

        /* renamed from: b, reason: collision with root package name */
        private int f88526b;

        /* renamed from: c, reason: collision with root package name */
        private int f88527c;

        void a() {
            this.f88527c = 0;
            this.f88526b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i10) {
            this.f88526b = this.f88527c;
            this.f88527c = i10;
            TabLayout tabLayout = this.f88525a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f88527c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = this.f88525a.get();
            if (tabLayout != null) {
                int i12 = this.f88527c;
                boolean z11 = true;
                if (i12 != 2 || this.f88526b == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f88526b == 0) {
                    z10 = false;
                }
                tabLayout.P(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i10) {
            TabLayout tabLayout = this.f88525a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f88527c;
            tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f88526b == 0));
        }

        c(TabLayout tabLayout) {
            this.f88525a = new WeakReference<>(tabLayout);
            a();
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d, reason: collision with other inner class name */
    private static class C1284d implements TabLayout.d {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager2 f88528a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f88529b;

        @Override // com.google.android.material.tabs.TabLayout.c
        public void H(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void N(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void C(TabLayout.f fVar) {
            this.f88528a.j(fVar.g(), this.f88529b);
        }

        C1284d(ViewPager2 viewPager2, boolean z10) {
            this.f88528a = viewPager2;
            this.f88529b = z10;
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public void a() {
        if (this.f88520g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.h<?> adapter = this.f88515b.getAdapter();
        this.f88519f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f88520g = true;
        c cVar = new c(this.f88514a);
        this.f88521h = cVar;
        this.f88515b.g(cVar);
        C1284d c1284d = new C1284d(this.f88515b, this.f88517d);
        this.f88522i = c1284d;
        this.f88514a.h(c1284d);
        if (this.f88516c) {
            a aVar = new a();
            this.f88523j = aVar;
            this.f88519f.registerAdapterDataObserver(aVar);
        }
        b();
        this.f88514a.N(this.f88515b.getCurrentItem(), 0.0f, true);
    }

    void b() {
        this.f88514a.H();
        RecyclerView.h<?> hVar = this.f88519f;
        if (hVar != null) {
            int totalNumberOfTabs = hVar.getTotalNumberOfTabs();
            for (int i10 = 0; i10 < totalNumberOfTabs; i10++) {
                TabLayout.f fVarE = this.f88514a.E();
                this.f88518e.onConfigureTab(fVarE, i10);
                this.f88514a.k(fVarE, false);
            }
            if (totalNumberOfTabs > 0) {
                int iMin = Math.min(this.f88515b.getCurrentItem(), this.f88514a.getTabCount() - 1);
                if (iMin != this.f88514a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f88514a;
                    tabLayout.K(tabLayout.B(iMin));
                }
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, boolean z11, b bVar) {
        this.f88514a = tabLayout;
        this.f88515b = viewPager2;
        this.f88516c = z10;
        this.f88517d = z11;
        this.f88518e = bVar;
    }
}
