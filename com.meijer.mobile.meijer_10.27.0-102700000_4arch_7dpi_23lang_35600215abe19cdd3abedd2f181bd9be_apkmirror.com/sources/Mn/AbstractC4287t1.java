package Mn;

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

/* renamed from: Mn.t1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4287t1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f20975A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f20976B;

    /* renamed from: C, reason: collision with root package name */
    public final LinearLayout f20977C;

    /* renamed from: D, reason: collision with root package name */
    public final RecyclerView f20978D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f20979E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f20980F;

    /* renamed from: G, reason: collision with root package name */
    public final ProgressView f20981G;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f20982H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f20983I;

    /* renamed from: J, reason: collision with root package name */
    public final View f20984J;

    /* renamed from: K, reason: collision with root package name */
    public final UnauthFooterView f20985K;

    /* renamed from: L, reason: collision with root package name */
    protected Km.h f20986L;

    /* renamed from: z, reason: collision with root package name */
    public final Button f20987z;

    public abstract void O0(Km.h hVar);

    @Deprecated
    public static AbstractC4287t1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4287t1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99397l0, viewGroup, z10, obj);
    }

    protected AbstractC4287t1(Object obj, View view, int i10, Button button, Button button2, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView2, TextView textView3, ProgressView progressView, ConstraintLayout constraintLayout, TextView textView4, View view2, UnauthFooterView unauthFooterView) {
        super(obj, view, i10);
        this.f20987z = button;
        this.f20975A = button2;
        this.f20976B = textView;
        this.f20977C = linearLayout;
        this.f20978D = recyclerView;
        this.f20979E = textView2;
        this.f20980F = textView3;
        this.f20981G = progressView;
        this.f20982H = constraintLayout;
        this.f20983I = textView4;
        this.f20984J = view2;
        this.f20985K = unauthFooterView;
    }

    public static AbstractC4287t1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
