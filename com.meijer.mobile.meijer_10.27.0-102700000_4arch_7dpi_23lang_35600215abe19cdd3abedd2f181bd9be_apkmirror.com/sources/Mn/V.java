package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public abstract class V extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f20357A;

    /* renamed from: B, reason: collision with root package name */
    public final DrawerLayout f20358B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f20359C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f20360D;

    /* renamed from: E, reason: collision with root package name */
    public final LinearLayout f20361E;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20362z;

    @Deprecated
    public static V M0(LayoutInflater layoutInflater, Object obj) {
        return (V) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99432x, null, false, obj);
    }

    protected V(Object obj, View view, int i10, MaterialToolbar materialToolbar, ComposeView composeView, DrawerLayout drawerLayout, ProgressView progressView, ComposeView composeView2, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.f20362z = materialToolbar;
        this.f20357A = composeView;
        this.f20358B = drawerLayout;
        this.f20359C = progressView;
        this.f20360D = composeView2;
        this.f20361E = linearLayout;
    }

    public static V K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
