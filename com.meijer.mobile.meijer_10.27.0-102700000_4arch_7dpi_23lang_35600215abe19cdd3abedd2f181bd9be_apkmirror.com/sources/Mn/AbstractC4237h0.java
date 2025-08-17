package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.h0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4237h0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f20646A;

    /* renamed from: B, reason: collision with root package name */
    public final v3 f20647B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f20648C;

    /* renamed from: D, reason: collision with root package name */
    public final ScrollView f20649D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f20650E;

    /* renamed from: F, reason: collision with root package name */
    public final MaterialButton f20651F;

    /* renamed from: G, reason: collision with root package name */
    public final AppBarLayout f20652G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f20653H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f20654I;

    /* renamed from: J, reason: collision with root package name */
    public final ConstraintLayout f20655J;

    /* renamed from: K, reason: collision with root package name */
    public final TextView f20656K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialToolbar f20657L;

    /* renamed from: M, reason: collision with root package name */
    public final CoordinatorLayout f20658M;

    /* renamed from: z, reason: collision with root package name */
    public final View f20659z;

    @Deprecated
    public static AbstractC4237h0 M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4237h0) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99317D, null, false, obj);
    }

    protected AbstractC4237h0(Object obj, View view, int i10, View view2, View view3, v3 v3Var, ProgressView progressView, ScrollView scrollView, TextView textView, MaterialButton materialButton, AppBarLayout appBarLayout, ImageView imageView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, MaterialToolbar materialToolbar, CoordinatorLayout coordinatorLayout) {
        super(obj, view, i10);
        this.f20659z = view2;
        this.f20646A = view3;
        this.f20647B = v3Var;
        this.f20648C = progressView;
        this.f20649D = scrollView;
        this.f20650E = textView;
        this.f20651F = materialButton;
        this.f20652G = appBarLayout;
        this.f20653H = imageView;
        this.f20654I = textView2;
        this.f20655J = constraintLayout;
        this.f20656K = textView3;
        this.f20657L = materialToolbar;
        this.f20658M = coordinatorLayout;
    }

    public static AbstractC4237h0 K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
