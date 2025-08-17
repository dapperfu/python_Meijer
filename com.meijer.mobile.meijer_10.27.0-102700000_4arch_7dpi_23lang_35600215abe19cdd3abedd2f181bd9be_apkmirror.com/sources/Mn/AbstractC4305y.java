package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.meijer.mobile.widget.HomeSearchAppBar;
import com.meijer.mobile.widget.UnauthFooterViewNewHomeScreen;

/* renamed from: Mn.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4305y extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f21122A;

    /* renamed from: B, reason: collision with root package name */
    public final View f21123B;

    /* renamed from: C, reason: collision with root package name */
    public final HomeSearchAppBar f21124C;

    /* renamed from: D, reason: collision with root package name */
    public final UnauthFooterViewNewHomeScreen f21125D;

    /* renamed from: E, reason: collision with root package name */
    public final DrawerLayout f21126E;

    /* renamed from: F, reason: collision with root package name */
    public final FrameLayout f21127F;

    /* renamed from: G, reason: collision with root package name */
    public final NestedScrollView f21128G;

    /* renamed from: z, reason: collision with root package name */
    public final CoordinatorLayout f21129z;

    @Deprecated
    public static AbstractC4305y M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4305y) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99399m, null, false, obj);
    }

    protected AbstractC4305y(Object obj, View view, int i10, CoordinatorLayout coordinatorLayout, ComposeView composeView, View view2, HomeSearchAppBar homeSearchAppBar, UnauthFooterViewNewHomeScreen unauthFooterViewNewHomeScreen, DrawerLayout drawerLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView) {
        super(obj, view, i10);
        this.f21129z = coordinatorLayout;
        this.f21122A = composeView;
        this.f21123B = view2;
        this.f21124C = homeSearchAppBar;
        this.f21125D = unauthFooterViewNewHomeScreen;
        this.f21126E = drawerLayout;
        this.f21127F = frameLayout;
        this.f21128G = nestedScrollView;
    }

    public static AbstractC4305y K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
