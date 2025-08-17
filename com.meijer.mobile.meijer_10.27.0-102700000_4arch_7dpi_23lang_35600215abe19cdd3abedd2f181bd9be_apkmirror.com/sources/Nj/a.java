package Nj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes7.dex */
public final class a implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f22070a;

    /* renamed from: b, reason: collision with root package name */
    public final TabLayout f22071b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialToolbar f22072c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewPager2 f22073d;

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a a(View view) {
        int i10 = Bj.k.f2864b1;
        TabLayout tabLayout = (TabLayout) J4.b.a(view, i10);
        if (tabLayout != null) {
            i10 = Bj.k.f2885i1;
            MaterialToolbar materialToolbar = (MaterialToolbar) J4.b.a(view, i10);
            if (materialToolbar != null) {
                i10 = Bj.k.f2897m1;
                ViewPager2 viewPager2 = (ViewPager2) J4.b.a(view, i10);
                if (viewPager2 != null) {
                    return new a((CoordinatorLayout) view, tabLayout, materialToolbar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(Bj.m.f2931a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f22070a;
    }

    private a(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, ViewPager2 viewPager2) {
        this.f22070a = coordinatorLayout;
        this.f22071b = tabLayout;
        this.f22072c = materialToolbar;
        this.f22073d = viewPager2;
    }
}
