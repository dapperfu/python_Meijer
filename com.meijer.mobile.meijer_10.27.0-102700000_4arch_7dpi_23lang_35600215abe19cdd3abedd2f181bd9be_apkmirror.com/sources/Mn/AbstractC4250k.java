package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.widget.SwipeViewPager;

/* renamed from: Mn.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4250k extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final AppBarLayout f20745A;

    /* renamed from: B, reason: collision with root package name */
    public final TabLayout f20746B;

    /* renamed from: C, reason: collision with root package name */
    public final SwipeViewPager f20747C;

    /* renamed from: D, reason: collision with root package name */
    public final DrawerLayout f20748D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageButton f20749E;

    /* renamed from: F, reason: collision with root package name */
    public final LinearLayout f20750F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f20751G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f20752H;

    /* renamed from: I, reason: collision with root package name */
    public final ConstraintLayout f20753I;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20754z;

    @Deprecated
    public static AbstractC4250k M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4250k) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99378f, null, false, obj);
    }

    protected AbstractC4250k(Object obj, View view, int i10, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, TabLayout tabLayout, SwipeViewPager swipeViewPager, DrawerLayout drawerLayout, ImageButton imageButton, LinearLayout linearLayout, TextView textView, ImageView imageView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f20754z = materialToolbar;
        this.f20745A = appBarLayout;
        this.f20746B = tabLayout;
        this.f20747C = swipeViewPager;
        this.f20748D = drawerLayout;
        this.f20749E = imageButton;
        this.f20750F = linearLayout;
        this.f20751G = textView;
        this.f20752H = imageView;
        this.f20753I = constraintLayout;
    }

    public static AbstractC4250k K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
