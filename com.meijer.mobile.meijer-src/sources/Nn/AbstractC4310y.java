package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.meijer.mobile.widget.HomeSearchAppBar;
import com.meijer.mobile.widget.UnauthFooterViewNewHomeScreen;

/* renamed from: Nn.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4310y extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f22454A;

    /* renamed from: B, reason: collision with root package name */
    public final View f22455B;

    /* renamed from: C, reason: collision with root package name */
    public final HomeSearchAppBar f22456C;

    /* renamed from: D, reason: collision with root package name */
    public final UnauthFooterViewNewHomeScreen f22457D;

    /* renamed from: E, reason: collision with root package name */
    public final DrawerLayout f22458E;

    /* renamed from: F, reason: collision with root package name */
    public final FrameLayout f22459F;

    /* renamed from: G, reason: collision with root package name */
    public final NestedScrollView f22460G;

    /* renamed from: z, reason: collision with root package name */
    public final CoordinatorLayout f22461z;

    @Deprecated
    public static AbstractC4310y N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4310y) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100255m, null, false, obj);
    }

    protected AbstractC4310y(Object obj, View view, int i10, CoordinatorLayout coordinatorLayout, ComposeView composeView, View view2, HomeSearchAppBar homeSearchAppBar, UnauthFooterViewNewHomeScreen unauthFooterViewNewHomeScreen, DrawerLayout drawerLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView) {
        super(obj, view, i10);
        this.f22461z = coordinatorLayout;
        this.f22454A = composeView;
        this.f22455B = view2;
        this.f22456C = homeSearchAppBar;
        this.f22457D = unauthFooterViewNewHomeScreen;
        this.f22458E = drawerLayout;
        this.f22459F = frameLayout;
        this.f22460G = nestedScrollView;
    }

    public static AbstractC4310y M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
