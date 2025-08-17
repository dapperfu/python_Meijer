package Mn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public abstract class E extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f19975A;

    /* renamed from: B, reason: collision with root package name */
    public final ProgressView f19976B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView f19977C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialToolbar f19978D;

    /* renamed from: z, reason: collision with root package name */
    public final ComposeView f19979z;

    @Deprecated
    public static E M0(LayoutInflater layoutInflater, Object obj) {
        return (E) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99408p, null, false, obj);
    }

    protected E(Object obj, View view, int i10, ComposeView composeView, ComposeView composeView2, ProgressView progressView, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f19979z = composeView;
        this.f19975A = composeView2;
        this.f19976B = progressView;
        this.f19977C = recyclerView;
        this.f19978D = materialToolbar;
    }

    public static E K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
