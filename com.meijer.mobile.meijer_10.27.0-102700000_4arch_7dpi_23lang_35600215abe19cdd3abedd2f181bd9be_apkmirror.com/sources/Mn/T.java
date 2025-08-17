package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes9.dex */
public abstract class T extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f20319A;

    /* renamed from: B, reason: collision with root package name */
    public final View f20320B;

    /* renamed from: C, reason: collision with root package name */
    public final ComposeView f20321C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f20322D;

    /* renamed from: E, reason: collision with root package name */
    public final AppBarLayout f20323E;

    /* renamed from: F, reason: collision with root package name */
    public final AbstractC4312z2 f20324F;

    /* renamed from: G, reason: collision with root package name */
    public final CoordinatorLayout f20325G;

    /* renamed from: H, reason: collision with root package name */
    public final RecyclerView f20326H;

    /* renamed from: I, reason: collision with root package name */
    public final LinearLayout f20327I;

    /* renamed from: J, reason: collision with root package name */
    public final TabLayout f20328J;

    /* renamed from: K, reason: collision with root package name */
    public final ViewPager2 f20329K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialButton f20330L;

    /* renamed from: M, reason: collision with root package name */
    public final RecyclerView f20331M;

    /* renamed from: N, reason: collision with root package name */
    public final MaterialToolbar f20332N;

    /* renamed from: O, reason: collision with root package name */
    public final ComposeView f20333O;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f20334z;

    @Deprecated
    public static T M0(LayoutInflater layoutInflater, Object obj) {
        return (T) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99429w, null, false, obj);
    }

    protected T(Object obj, View view, int i10, FrameLayout frameLayout, ComposeView composeView, View view2, ComposeView composeView2, ComposeView composeView3, AppBarLayout appBarLayout, AbstractC4312z2 abstractC4312z2, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, LinearLayout linearLayout, TabLayout tabLayout, ViewPager2 viewPager2, MaterialButton materialButton, RecyclerView recyclerView2, MaterialToolbar materialToolbar, ComposeView composeView4) {
        super(obj, view, i10);
        this.f20334z = frameLayout;
        this.f20319A = composeView;
        this.f20320B = view2;
        this.f20321C = composeView2;
        this.f20322D = composeView3;
        this.f20323E = appBarLayout;
        this.f20324F = abstractC4312z2;
        this.f20325G = coordinatorLayout;
        this.f20326H = recyclerView;
        this.f20327I = linearLayout;
        this.f20328J = tabLayout;
        this.f20329K = viewPager2;
        this.f20330L = materialButton;
        this.f20331M = recyclerView2;
        this.f20332N = materialToolbar;
        this.f20333O = composeView4;
    }

    public static T K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
