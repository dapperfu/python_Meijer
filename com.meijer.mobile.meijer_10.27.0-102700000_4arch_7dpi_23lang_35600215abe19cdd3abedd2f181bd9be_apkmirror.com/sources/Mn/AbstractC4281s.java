package Mn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4281s extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView f20938A;

    /* renamed from: B, reason: collision with root package name */
    public final ComposeView f20939B;

    /* renamed from: C, reason: collision with root package name */
    public final ComposeView f20940C;

    /* renamed from: D, reason: collision with root package name */
    public final ProgressView f20941D;

    /* renamed from: E, reason: collision with root package name */
    public final AbstractC4272p1 f20942E;

    /* renamed from: F, reason: collision with root package name */
    public final MaterialToolbar f20943F;

    /* renamed from: z, reason: collision with root package name */
    public final CoordinatorLayout f20944z;

    @Deprecated
    public static AbstractC4281s M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4281s) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99390j, null, false, obj);
    }

    protected AbstractC4281s(Object obj, View view, int i10, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, ComposeView composeView, ComposeView composeView2, ProgressView progressView, AbstractC4272p1 abstractC4272p1, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f20944z = coordinatorLayout;
        this.f20938A = recyclerView;
        this.f20939B = composeView;
        this.f20940C = composeView2;
        this.f20941D = progressView;
        this.f20942E = abstractC4272p1;
        this.f20943F = materialToolbar;
    }

    public static AbstractC4281s K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
