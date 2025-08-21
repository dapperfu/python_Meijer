package Nn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public abstract class E extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f21307A;

    /* renamed from: B, reason: collision with root package name */
    public final ProgressView f21308B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView f21309C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialToolbar f21310D;

    /* renamed from: z, reason: collision with root package name */
    public final ComposeView f21311z;

    @Deprecated
    public static E N0(LayoutInflater layoutInflater, Object obj) {
        return (E) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100264p, null, false, obj);
    }

    protected E(Object obj, View view, int i10, ComposeView composeView, ComposeView composeView2, ProgressView progressView, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f21311z = composeView;
        this.f21307A = composeView2;
        this.f21308B = progressView;
        this.f21309C = recyclerView;
        this.f21310D = materialToolbar;
    }

    public static E M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
