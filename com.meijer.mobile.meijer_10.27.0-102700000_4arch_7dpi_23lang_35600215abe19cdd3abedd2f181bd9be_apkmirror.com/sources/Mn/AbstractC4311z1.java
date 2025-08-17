package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.z1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4311z1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f21153A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f21154B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView f21155C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f21156D;

    /* renamed from: E, reason: collision with root package name */
    public final ConstraintLayout f21157E;

    /* renamed from: F, reason: collision with root package name */
    public final ProgressView f21158F;

    /* renamed from: G, reason: collision with root package name */
    public final View f21159G;

    /* renamed from: H, reason: collision with root package name */
    public final AbstractC4296v2 f21160H;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21161z;

    @Deprecated
    public static AbstractC4311z1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4311z1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99406o0, viewGroup, z10, obj);
    }

    protected AbstractC4311z1(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, ComposeView composeView, ConstraintLayout constraintLayout, ProgressView progressView, View view2, AbstractC4296v2 abstractC4296v2) {
        super(obj, view, i10);
        this.f21161z = textView;
        this.f21153A = textView2;
        this.f21154B = textView3;
        this.f21155C = recyclerView;
        this.f21156D = composeView;
        this.f21157E = constraintLayout;
        this.f21158F = progressView;
        this.f21159G = view2;
        this.f21160H = abstractC4296v2;
    }

    public static AbstractC4311z1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
