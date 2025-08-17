package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4289u extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Group f20992A;

    /* renamed from: B, reason: collision with root package name */
    public final Group f20993B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20994C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f20995D;

    /* renamed from: E, reason: collision with root package name */
    public final ComposeView f20996E;

    /* renamed from: F, reason: collision with root package name */
    public final AppBarLayout f20997F;

    /* renamed from: G, reason: collision with root package name */
    public final CoordinatorLayout f20998G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f20999H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f21000I;

    /* renamed from: J, reason: collision with root package name */
    public final MaterialToolbar f21001J;

    /* renamed from: K, reason: collision with root package name */
    public final View f21002K;

    /* renamed from: L, reason: collision with root package name */
    public final View f21003L;

    /* renamed from: M, reason: collision with root package name */
    public final View f21004M;

    /* renamed from: N, reason: collision with root package name */
    public final ImageView f21005N;

    /* renamed from: O, reason: collision with root package name */
    public final FullWordEllipsisTextView f21006O;

    /* renamed from: P, reason: collision with root package name */
    public final ProgressView f21007P;

    /* renamed from: Q, reason: collision with root package name */
    public final ConstraintLayout f21008Q;

    /* renamed from: R, reason: collision with root package name */
    public final MaterialButton f21009R;

    /* renamed from: S, reason: collision with root package name */
    public final MaterialButton f21010S;

    /* renamed from: T, reason: collision with root package name */
    public final ViewPager2 f21011T;

    /* renamed from: U, reason: collision with root package name */
    public final Guideline f21012U;

    /* renamed from: z, reason: collision with root package name */
    public final View f21013z;

    @Deprecated
    public static AbstractC4289u M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4289u) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99393k, null, false, obj);
    }

    protected AbstractC4289u(Object obj, View view, int i10, View view2, Group group, Group group2, TextView textView, TextView textView2, ComposeView composeView, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, TextView textView3, TextView textView4, MaterialToolbar materialToolbar, View view3, View view4, View view5, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView, ProgressView progressView, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ViewPager2 viewPager2, Guideline guideline) {
        super(obj, view, i10);
        this.f21013z = view2;
        this.f20992A = group;
        this.f20993B = group2;
        this.f20994C = textView;
        this.f20995D = textView2;
        this.f20996E = composeView;
        this.f20997F = appBarLayout;
        this.f20998G = coordinatorLayout;
        this.f20999H = textView3;
        this.f21000I = textView4;
        this.f21001J = materialToolbar;
        this.f21002K = view3;
        this.f21003L = view4;
        this.f21004M = view5;
        this.f21005N = imageView;
        this.f21006O = fullWordEllipsisTextView;
        this.f21007P = progressView;
        this.f21008Q = constraintLayout;
        this.f21009R = materialButton;
        this.f21010S = materialButton2;
        this.f21011T = viewPager2;
        this.f21012U = guideline;
    }

    public static AbstractC4289u K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
