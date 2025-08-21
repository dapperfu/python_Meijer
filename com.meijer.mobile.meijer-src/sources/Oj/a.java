package Oj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes8.dex */
public final class a implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f24315a;

    /* renamed from: b, reason: collision with root package name */
    public final TabLayout f24316b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialToolbar f24317c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewPager2 f24318d;

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a a(View view) {
        int i10 = Cj.k.f4909b1;
        TabLayout tabLayout = (TabLayout) K4.b.a(view, i10);
        if (tabLayout != null) {
            i10 = Cj.k.f4930i1;
            MaterialToolbar materialToolbar = (MaterialToolbar) K4.b.a(view, i10);
            if (materialToolbar != null) {
                i10 = Cj.k.f4942m1;
                ViewPager2 viewPager2 = (ViewPager2) K4.b.a(view, i10);
                if (viewPager2 != null) {
                    return new a((CoordinatorLayout) view, tabLayout, materialToolbar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(Cj.m.f4976a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f24315a;
    }

    private a(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, ViewPager2 viewPager2) {
        this.f24315a = coordinatorLayout;
        this.f24316b = tabLayout;
        this.f24317c = materialToolbar;
        this.f24318d = viewPager2;
    }
}
