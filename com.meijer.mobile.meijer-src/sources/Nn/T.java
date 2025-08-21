package Nn;

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

/* loaded from: classes10.dex */
public abstract class T extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f21651A;

    /* renamed from: B, reason: collision with root package name */
    public final View f21652B;

    /* renamed from: C, reason: collision with root package name */
    public final ComposeView f21653C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f21654D;

    /* renamed from: E, reason: collision with root package name */
    public final AppBarLayout f21655E;

    /* renamed from: F, reason: collision with root package name */
    public final AbstractC4317z2 f21656F;

    /* renamed from: G, reason: collision with root package name */
    public final CoordinatorLayout f21657G;

    /* renamed from: H, reason: collision with root package name */
    public final RecyclerView f21658H;

    /* renamed from: I, reason: collision with root package name */
    public final LinearLayout f21659I;

    /* renamed from: J, reason: collision with root package name */
    public final TabLayout f21660J;

    /* renamed from: K, reason: collision with root package name */
    public final ViewPager2 f21661K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialButton f21662L;

    /* renamed from: M, reason: collision with root package name */
    public final RecyclerView f21663M;

    /* renamed from: N, reason: collision with root package name */
    public final MaterialToolbar f21664N;

    /* renamed from: O, reason: collision with root package name */
    public final ComposeView f21665O;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f21666z;

    @Deprecated
    public static T N0(LayoutInflater layoutInflater, Object obj) {
        return (T) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100285w, null, false, obj);
    }

    protected T(Object obj, View view, int i10, FrameLayout frameLayout, ComposeView composeView, View view2, ComposeView composeView2, ComposeView composeView3, AppBarLayout appBarLayout, AbstractC4317z2 abstractC4317z2, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, LinearLayout linearLayout, TabLayout tabLayout, ViewPager2 viewPager2, MaterialButton materialButton, RecyclerView recyclerView2, MaterialToolbar materialToolbar, ComposeView composeView4) {
        super(obj, view, i10);
        this.f21666z = frameLayout;
        this.f21651A = composeView;
        this.f21652B = view2;
        this.f21653C = composeView2;
        this.f21654D = composeView3;
        this.f21655E = appBarLayout;
        this.f21656F = abstractC4317z2;
        this.f21657G = coordinatorLayout;
        this.f21658H = recyclerView;
        this.f21659I = linearLayout;
        this.f21660J = tabLayout;
        this.f21661K = viewPager2;
        this.f21662L = materialButton;
        this.f21663M = recyclerView2;
        this.f21664N = materialToolbar;
        this.f21665O = composeView4;
    }

    public static T M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
