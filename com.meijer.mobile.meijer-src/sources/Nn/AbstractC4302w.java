package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.StickyNestedScrollView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4302w extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Z0 f22382A;

    /* renamed from: B, reason: collision with root package name */
    public final LinearLayout f22383B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f22384C;

    /* renamed from: D, reason: collision with root package name */
    public final v3 f22385D;

    /* renamed from: E, reason: collision with root package name */
    public final ProgressView f22386E;

    /* renamed from: F, reason: collision with root package name */
    public final RecyclerView f22387F;

    /* renamed from: G, reason: collision with root package name */
    public final L1 f22388G;

    /* renamed from: H, reason: collision with root package name */
    public final N1 f22389H;

    /* renamed from: I, reason: collision with root package name */
    public final StickyNestedScrollView f22390I;

    /* renamed from: J, reason: collision with root package name */
    public final J2 f22391J;

    /* renamed from: K, reason: collision with root package name */
    public final RecyclerView f22392K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialToolbar f22393L;

    /* renamed from: z, reason: collision with root package name */
    public final AppBarLayout f22394z;

    @Deprecated
    public static AbstractC4302w N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4302w) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100252l, null, false, obj);
    }

    protected AbstractC4302w(Object obj, View view, int i10, AppBarLayout appBarLayout, Z0 z02, LinearLayout linearLayout, MaterialButton materialButton, v3 v3Var, ProgressView progressView, RecyclerView recyclerView, L1 l12, N1 n12, StickyNestedScrollView stickyNestedScrollView, J2 j22, RecyclerView recyclerView2, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f22394z = appBarLayout;
        this.f22382A = z02;
        this.f22383B = linearLayout;
        this.f22384C = materialButton;
        this.f22385D = v3Var;
        this.f22386E = progressView;
        this.f22387F = recyclerView;
        this.f22388G = l12;
        this.f22389H = n12;
        this.f22390I = stickyNestedScrollView;
        this.f22391J = j22;
        this.f22392K = recyclerView2;
        this.f22393L = materialToolbar;
    }

    public static AbstractC4302w M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
