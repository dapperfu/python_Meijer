package Nn;

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

/* renamed from: Nn.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4242h0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f21978A;

    /* renamed from: B, reason: collision with root package name */
    public final v3 f21979B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f21980C;

    /* renamed from: D, reason: collision with root package name */
    public final ScrollView f21981D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f21982E;

    /* renamed from: F, reason: collision with root package name */
    public final MaterialButton f21983F;

    /* renamed from: G, reason: collision with root package name */
    public final AppBarLayout f21984G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f21985H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f21986I;

    /* renamed from: J, reason: collision with root package name */
    public final ConstraintLayout f21987J;

    /* renamed from: K, reason: collision with root package name */
    public final TextView f21988K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialToolbar f21989L;

    /* renamed from: M, reason: collision with root package name */
    public final CoordinatorLayout f21990M;

    /* renamed from: z, reason: collision with root package name */
    public final View f21991z;

    @Deprecated
    public static AbstractC4242h0 N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4242h0) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100173D, null, false, obj);
    }

    protected AbstractC4242h0(Object obj, View view, int i10, View view2, View view3, v3 v3Var, ProgressView progressView, ScrollView scrollView, TextView textView, MaterialButton materialButton, AppBarLayout appBarLayout, ImageView imageView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, MaterialToolbar materialToolbar, CoordinatorLayout coordinatorLayout) {
        super(obj, view, i10);
        this.f21991z = view2;
        this.f21978A = view3;
        this.f21979B = v3Var;
        this.f21980C = progressView;
        this.f21981D = scrollView;
        this.f21982E = textView;
        this.f21983F = materialButton;
        this.f21984G = appBarLayout;
        this.f21985H = imageView;
        this.f21986I = textView2;
        this.f21987J = constraintLayout;
        this.f21988K = textView3;
        this.f21989L = materialToolbar;
        this.f21990M = coordinatorLayout;
    }

    public static AbstractC4242h0 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
