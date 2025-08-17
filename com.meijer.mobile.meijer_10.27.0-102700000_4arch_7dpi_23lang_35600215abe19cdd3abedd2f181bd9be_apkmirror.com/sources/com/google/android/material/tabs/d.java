package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final TabLayout f87674a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager2 f87675b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f87676c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f87677d;

    /* renamed from: e, reason: collision with root package name */
    private final b f87678e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.h<?> f87679f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f87680g;

    /* renamed from: h, reason: collision with root package name */
    private c f87681h;

    /* renamed from: i, reason: collision with root package name */
    private TabLayout.d f87682i;

    /* renamed from: j, reason: collision with root package name */
    private RecyclerView.j f87683j;

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
        private final WeakReference<TabLayout> f87685a;

        /* renamed from: b, reason: collision with root package name */
        private int f87686b;

        /* renamed from: c, reason: collision with root package name */
        private int f87687c;

        void a() {
            this.f87687c = 0;
            this.f87686b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i10) {
            this.f87686b = this.f87687c;
            this.f87687c = i10;
            TabLayout tabLayout = this.f87685a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f87687c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = this.f87685a.get();
            if (tabLayout != null) {
                int i12 = this.f87687c;
                boolean z11 = true;
                if (i12 != 2 || this.f87686b == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f87686b == 0) {
                    z10 = false;
                }
                tabLayout.P(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i10) {
            TabLayout tabLayout = this.f87685a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f87687c;
            tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f87686b == 0));
        }

        c(TabLayout tabLayout) {
            this.f87685a = new WeakReference<>(tabLayout);
            a();
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d, reason: collision with other inner class name */
    private static class C1275d implements TabLayout.d {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager2 f87688a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f87689b;

        @Override // com.google.android.material.tabs.TabLayout.c
        public void F(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void L(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void A(TabLayout.f fVar) {
            this.f87688a.j(fVar.g(), this.f87689b);
        }

        C1275d(ViewPager2 viewPager2, boolean z10) {
            this.f87688a = viewPager2;
            this.f87689b = z10;
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public void a() {
        if (this.f87680g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.h<?> adapter = this.f87675b.getAdapter();
        this.f87679f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f87680g = true;
        c cVar = new c(this.f87674a);
        this.f87681h = cVar;
        this.f87675b.g(cVar);
        C1275d c1275d = new C1275d(this.f87675b, this.f87677d);
        this.f87682i = c1275d;
        this.f87674a.h(c1275d);
        if (this.f87676c) {
            a aVar = new a();
            this.f87683j = aVar;
            this.f87679f.registerAdapterDataObserver(aVar);
        }
        b();
        this.f87674a.N(this.f87675b.getCurrentItem(), 0.0f, true);
    }

    void b() {
        this.f87674a.H();
        RecyclerView.h<?> hVar = this.f87679f;
        if (hVar != null) {
            int totalNumberOfTabs = hVar.getTotalNumberOfTabs();
            for (int i10 = 0; i10 < totalNumberOfTabs; i10++) {
                TabLayout.f fVarE = this.f87674a.E();
                this.f87678e.onConfigureTab(fVarE, i10);
                this.f87674a.k(fVarE, false);
            }
            if (totalNumberOfTabs > 0) {
                int iMin = Math.min(this.f87675b.getCurrentItem(), this.f87674a.getTabCount() - 1);
                if (iMin != this.f87674a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f87674a;
                    tabLayout.K(tabLayout.B(iMin));
                }
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, boolean z11, b bVar) {
        this.f87674a = tabLayout;
        this.f87675b = viewPager2;
        this.f87676c = z10;
        this.f87677d = z11;
        this.f87678e = bVar;
    }
}
