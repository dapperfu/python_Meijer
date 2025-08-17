package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4247j0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f20699A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f20700B;

    /* renamed from: C, reason: collision with root package name */
    public final ConstraintLayout f20701C;

    /* renamed from: D, reason: collision with root package name */
    public final ContentLoadingProgressBar f20702D;

    /* renamed from: E, reason: collision with root package name */
    public final v3 f20703E;

    /* renamed from: F, reason: collision with root package name */
    public final ConstraintLayout f20704F;

    /* renamed from: G, reason: collision with root package name */
    public final ProgressView f20705G;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f20706H;

    /* renamed from: I, reason: collision with root package name */
    public final AppBarLayout f20707I;

    /* renamed from: J, reason: collision with root package name */
    public final NestedScrollView f20708J;

    /* renamed from: K, reason: collision with root package name */
    public final F2 f20709K;

    /* renamed from: L, reason: collision with root package name */
    public final RecyclerView f20710L;

    /* renamed from: M, reason: collision with root package name */
    public final H2 f20711M;

    /* renamed from: N, reason: collision with root package name */
    public final MaterialToolbar f20712N;

    /* renamed from: O, reason: collision with root package name */
    public final TextView f20713O;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20714z;

    @Deprecated
    public static AbstractC4247j0 M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4247j0) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99319E, null, false, obj);
    }

    protected AbstractC4247j0(Object obj, View view, int i10, TextView textView, TextView textView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ContentLoadingProgressBar contentLoadingProgressBar, v3 v3Var, ConstraintLayout constraintLayout3, ProgressView progressView, ConstraintLayout constraintLayout4, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, F2 f22, RecyclerView recyclerView, H2 h22, MaterialToolbar materialToolbar, TextView textView3) {
        super(obj, view, i10);
        this.f20714z = textView;
        this.f20699A = textView2;
        this.f20700B = constraintLayout;
        this.f20701C = constraintLayout2;
        this.f20702D = contentLoadingProgressBar;
        this.f20703E = v3Var;
        this.f20704F = constraintLayout3;
        this.f20705G = progressView;
        this.f20706H = constraintLayout4;
        this.f20707I = appBarLayout;
        this.f20708J = nestedScrollView;
        this.f20709K = f22;
        this.f20710L = recyclerView;
        this.f20711M = h22;
        this.f20712N = materialToolbar;
        this.f20713O = textView3;
    }

    public static AbstractC4247j0 K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
