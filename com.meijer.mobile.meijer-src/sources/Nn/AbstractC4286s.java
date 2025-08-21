package Nn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4286s extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView f22270A;

    /* renamed from: B, reason: collision with root package name */
    public final ComposeView f22271B;

    /* renamed from: C, reason: collision with root package name */
    public final ComposeView f22272C;

    /* renamed from: D, reason: collision with root package name */
    public final ProgressView f22273D;

    /* renamed from: E, reason: collision with root package name */
    public final AbstractC4277p1 f22274E;

    /* renamed from: F, reason: collision with root package name */
    public final MaterialToolbar f22275F;

    /* renamed from: z, reason: collision with root package name */
    public final CoordinatorLayout f22276z;

    @Deprecated
    public static AbstractC4286s N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4286s) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100246j, null, false, obj);
    }

    protected AbstractC4286s(Object obj, View view, int i10, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, ComposeView composeView, ComposeView composeView2, ProgressView progressView, AbstractC4277p1 abstractC4277p1, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f22276z = coordinatorLayout;
        this.f22270A = recyclerView;
        this.f22271B = composeView;
        this.f22272C = composeView2;
        this.f22273D = progressView;
        this.f22274E = abstractC4277p1;
        this.f22275F = materialToolbar;
    }

    public static AbstractC4286s M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
