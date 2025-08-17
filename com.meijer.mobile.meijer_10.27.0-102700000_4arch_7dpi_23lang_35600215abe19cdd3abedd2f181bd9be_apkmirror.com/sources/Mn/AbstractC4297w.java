package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.StickyNestedScrollView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4297w extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Z0 f21050A;

    /* renamed from: B, reason: collision with root package name */
    public final LinearLayout f21051B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f21052C;

    /* renamed from: D, reason: collision with root package name */
    public final v3 f21053D;

    /* renamed from: E, reason: collision with root package name */
    public final ProgressView f21054E;

    /* renamed from: F, reason: collision with root package name */
    public final RecyclerView f21055F;

    /* renamed from: G, reason: collision with root package name */
    public final L1 f21056G;

    /* renamed from: H, reason: collision with root package name */
    public final N1 f21057H;

    /* renamed from: I, reason: collision with root package name */
    public final StickyNestedScrollView f21058I;

    /* renamed from: J, reason: collision with root package name */
    public final J2 f21059J;

    /* renamed from: K, reason: collision with root package name */
    public final RecyclerView f21060K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialToolbar f21061L;

    /* renamed from: z, reason: collision with root package name */
    public final AppBarLayout f21062z;

    @Deprecated
    public static AbstractC4297w M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4297w) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99396l, null, false, obj);
    }

    protected AbstractC4297w(Object obj, View view, int i10, AppBarLayout appBarLayout, Z0 z02, LinearLayout linearLayout, MaterialButton materialButton, v3 v3Var, ProgressView progressView, RecyclerView recyclerView, L1 l12, N1 n12, StickyNestedScrollView stickyNestedScrollView, J2 j22, RecyclerView recyclerView2, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f21062z = appBarLayout;
        this.f21050A = z02;
        this.f21051B = linearLayout;
        this.f21052C = materialButton;
        this.f21053D = v3Var;
        this.f21054E = progressView;
        this.f21055F = recyclerView;
        this.f21056G = l12;
        this.f21057H = n12;
        this.f21058I = stickyNestedScrollView;
        this.f21059J = j22;
        this.f21060K = recyclerView2;
        this.f21061L = materialToolbar;
    }

    public static AbstractC4297w K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
