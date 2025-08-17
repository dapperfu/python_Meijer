package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public abstract class C extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f19925A;

    /* renamed from: B, reason: collision with root package name */
    public final View f19926B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f19927C;

    /* renamed from: D, reason: collision with root package name */
    public final LinearLayout f19928D;

    /* renamed from: E, reason: collision with root package name */
    public final NestedScrollView f19929E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f19930F;

    /* renamed from: G, reason: collision with root package name */
    public final AppBarLayout f19931G;

    /* renamed from: H, reason: collision with root package name */
    public final RecyclerView f19932H;

    /* renamed from: I, reason: collision with root package name */
    public final ProgressView f19933I;

    /* renamed from: J, reason: collision with root package name */
    public final MaterialToolbar f19934J;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f19935z;

    @Deprecated
    public static C M0(LayoutInflater layoutInflater, Object obj) {
        return (C) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99405o, null, false, obj);
    }

    protected C(Object obj, View view, int i10, LinearLayout linearLayout, View view2, View view3, MaterialButton materialButton, LinearLayout linearLayout2, NestedScrollView nestedScrollView, TextView textView, AppBarLayout appBarLayout, RecyclerView recyclerView, ProgressView progressView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f19935z = linearLayout;
        this.f19925A = view2;
        this.f19926B = view3;
        this.f19927C = materialButton;
        this.f19928D = linearLayout2;
        this.f19929E = nestedScrollView;
        this.f19930F = textView;
        this.f19931G = appBarLayout;
        this.f19932H = recyclerView;
        this.f19933I = progressView;
        this.f19934J = materialToolbar;
    }

    public static C K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
