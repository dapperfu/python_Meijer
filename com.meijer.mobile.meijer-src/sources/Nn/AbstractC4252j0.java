package Nn;

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

/* renamed from: Nn.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4252j0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f22031A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f22032B;

    /* renamed from: C, reason: collision with root package name */
    public final ConstraintLayout f22033C;

    /* renamed from: D, reason: collision with root package name */
    public final ContentLoadingProgressBar f22034D;

    /* renamed from: E, reason: collision with root package name */
    public final v3 f22035E;

    /* renamed from: F, reason: collision with root package name */
    public final ConstraintLayout f22036F;

    /* renamed from: G, reason: collision with root package name */
    public final ProgressView f22037G;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f22038H;

    /* renamed from: I, reason: collision with root package name */
    public final AppBarLayout f22039I;

    /* renamed from: J, reason: collision with root package name */
    public final NestedScrollView f22040J;

    /* renamed from: K, reason: collision with root package name */
    public final F2 f22041K;

    /* renamed from: L, reason: collision with root package name */
    public final RecyclerView f22042L;

    /* renamed from: M, reason: collision with root package name */
    public final H2 f22043M;

    /* renamed from: N, reason: collision with root package name */
    public final MaterialToolbar f22044N;

    /* renamed from: O, reason: collision with root package name */
    public final TextView f22045O;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f22046z;

    @Deprecated
    public static AbstractC4252j0 N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4252j0) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100175E, null, false, obj);
    }

    protected AbstractC4252j0(Object obj, View view, int i10, TextView textView, TextView textView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ContentLoadingProgressBar contentLoadingProgressBar, v3 v3Var, ConstraintLayout constraintLayout3, ProgressView progressView, ConstraintLayout constraintLayout4, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, F2 f22, RecyclerView recyclerView, H2 h22, MaterialToolbar materialToolbar, TextView textView3) {
        super(obj, view, i10);
        this.f22046z = textView;
        this.f22031A = textView2;
        this.f22032B = constraintLayout;
        this.f22033C = constraintLayout2;
        this.f22034D = contentLoadingProgressBar;
        this.f22035E = v3Var;
        this.f22036F = constraintLayout3;
        this.f22037G = progressView;
        this.f22038H = constraintLayout4;
        this.f22039I = appBarLayout;
        this.f22040J = nestedScrollView;
        this.f22041K = f22;
        this.f22042L = recyclerView;
        this.f22043M = h22;
        this.f22044N = materialToolbar;
        this.f22045O = textView3;
    }

    public static AbstractC4252j0 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
