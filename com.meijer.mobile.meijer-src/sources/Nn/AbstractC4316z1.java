package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.z1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4316z1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f22485A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f22486B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView f22487C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f22488D;

    /* renamed from: E, reason: collision with root package name */
    public final ConstraintLayout f22489E;

    /* renamed from: F, reason: collision with root package name */
    public final ProgressView f22490F;

    /* renamed from: G, reason: collision with root package name */
    public final View f22491G;

    /* renamed from: H, reason: collision with root package name */
    public final AbstractC4301v2 f22492H;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f22493z;

    @Deprecated
    public static AbstractC4316z1 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4316z1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100262o0, viewGroup, z10, obj);
    }

    protected AbstractC4316z1(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, ComposeView composeView, ConstraintLayout constraintLayout, ProgressView progressView, View view2, AbstractC4301v2 abstractC4301v2) {
        super(obj, view, i10);
        this.f22493z = textView;
        this.f22485A = textView2;
        this.f22486B = textView3;
        this.f22487C = recyclerView;
        this.f22488D = composeView;
        this.f22489E = constraintLayout;
        this.f22490F = progressView;
        this.f22491G = view2;
        this.f22492H = abstractC4301v2;
    }

    public static AbstractC4316z1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
