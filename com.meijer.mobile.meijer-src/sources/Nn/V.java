package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public abstract class V extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f21689A;

    /* renamed from: B, reason: collision with root package name */
    public final DrawerLayout f21690B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f21691C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f21692D;

    /* renamed from: E, reason: collision with root package name */
    public final LinearLayout f21693E;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f21694z;

    @Deprecated
    public static V N0(LayoutInflater layoutInflater, Object obj) {
        return (V) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100288x, null, false, obj);
    }

    protected V(Object obj, View view, int i10, MaterialToolbar materialToolbar, ComposeView composeView, DrawerLayout drawerLayout, ProgressView progressView, ComposeView composeView2, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.f21694z = materialToolbar;
        this.f21689A = composeView;
        this.f21690B = drawerLayout;
        this.f21691C = progressView;
        this.f21692D = composeView2;
        this.f21693E = linearLayout;
    }

    public static V M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
