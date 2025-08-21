package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;
import com.meijer.mobile.widget.UnauthFooterView;

/* renamed from: Nn.t1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4292t1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f22307A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f22308B;

    /* renamed from: C, reason: collision with root package name */
    public final LinearLayout f22309C;

    /* renamed from: D, reason: collision with root package name */
    public final RecyclerView f22310D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f22311E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f22312F;

    /* renamed from: G, reason: collision with root package name */
    public final ProgressView f22313G;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f22314H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f22315I;

    /* renamed from: J, reason: collision with root package name */
    public final View f22316J;

    /* renamed from: K, reason: collision with root package name */
    public final UnauthFooterView f22317K;

    /* renamed from: L, reason: collision with root package name */
    protected Lm.h f22318L;

    /* renamed from: z, reason: collision with root package name */
    public final Button f22319z;

    public abstract void O0(Lm.h hVar);

    @Deprecated
    public static AbstractC4292t1 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4292t1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100253l0, viewGroup, z10, obj);
    }

    protected AbstractC4292t1(Object obj, View view, int i10, Button button, Button button2, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView2, TextView textView3, ProgressView progressView, ConstraintLayout constraintLayout, TextView textView4, View view2, UnauthFooterView unauthFooterView) {
        super(obj, view, i10);
        this.f22319z = button;
        this.f22307A = button2;
        this.f22308B = textView;
        this.f22309C = linearLayout;
        this.f22310D = recyclerView;
        this.f22311E = textView2;
        this.f22312F = textView3;
        this.f22313G = progressView;
        this.f22314H = constraintLayout;
        this.f22315I = textView4;
        this.f22316J = view2;
        this.f22317K = unauthFooterView;
    }

    public static AbstractC4292t1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
