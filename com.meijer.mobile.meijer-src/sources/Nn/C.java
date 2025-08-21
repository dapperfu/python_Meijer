package Nn;

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

/* loaded from: classes10.dex */
public abstract class C extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f21257A;

    /* renamed from: B, reason: collision with root package name */
    public final View f21258B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f21259C;

    /* renamed from: D, reason: collision with root package name */
    public final LinearLayout f21260D;

    /* renamed from: E, reason: collision with root package name */
    public final NestedScrollView f21261E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f21262F;

    /* renamed from: G, reason: collision with root package name */
    public final AppBarLayout f21263G;

    /* renamed from: H, reason: collision with root package name */
    public final RecyclerView f21264H;

    /* renamed from: I, reason: collision with root package name */
    public final ProgressView f21265I;

    /* renamed from: J, reason: collision with root package name */
    public final MaterialToolbar f21266J;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f21267z;

    @Deprecated
    public static C N0(LayoutInflater layoutInflater, Object obj) {
        return (C) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100261o, null, false, obj);
    }

    protected C(Object obj, View view, int i10, LinearLayout linearLayout, View view2, View view3, MaterialButton materialButton, LinearLayout linearLayout2, NestedScrollView nestedScrollView, TextView textView, AppBarLayout appBarLayout, RecyclerView recyclerView, ProgressView progressView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f21267z = linearLayout;
        this.f21257A = view2;
        this.f21258B = view3;
        this.f21259C = materialButton;
        this.f21260D = linearLayout2;
        this.f21261E = nestedScrollView;
        this.f21262F = textView;
        this.f21263G = appBarLayout;
        this.f21264H = recyclerView;
        this.f21265I = progressView;
        this.f21266J = materialToolbar;
    }

    public static C M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
