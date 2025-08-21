package Nn;

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

/* renamed from: Nn.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4255k extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final AppBarLayout f22077A;

    /* renamed from: B, reason: collision with root package name */
    public final TabLayout f22078B;

    /* renamed from: C, reason: collision with root package name */
    public final SwipeViewPager f22079C;

    /* renamed from: D, reason: collision with root package name */
    public final DrawerLayout f22080D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageButton f22081E;

    /* renamed from: F, reason: collision with root package name */
    public final LinearLayout f22082F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f22083G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f22084H;

    /* renamed from: I, reason: collision with root package name */
    public final ConstraintLayout f22085I;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f22086z;

    @Deprecated
    public static AbstractC4255k N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4255k) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100234f, null, false, obj);
    }

    protected AbstractC4255k(Object obj, View view, int i10, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, TabLayout tabLayout, SwipeViewPager swipeViewPager, DrawerLayout drawerLayout, ImageButton imageButton, LinearLayout linearLayout, TextView textView, ImageView imageView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f22086z = materialToolbar;
        this.f22077A = appBarLayout;
        this.f22078B = tabLayout;
        this.f22079C = swipeViewPager;
        this.f22080D = drawerLayout;
        this.f22081E = imageButton;
        this.f22082F = linearLayout;
        this.f22083G = textView;
        this.f22084H = imageView;
        this.f22085I = constraintLayout;
    }

    public static AbstractC4255k M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
