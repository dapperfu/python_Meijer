package Nn;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes10.dex */
public abstract class Q extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f21606A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialToolbar f21607B;

    /* renamed from: C, reason: collision with root package name */
    public final SurfaceView f21608C;

    /* renamed from: D, reason: collision with root package name */
    public final Guideline f21609D;

    /* renamed from: E, reason: collision with root package name */
    public final RecyclerView f21610E;

    /* renamed from: F, reason: collision with root package name */
    public final ProgressBar f21611F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f21612G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f21613H;

    /* renamed from: I, reason: collision with root package name */
    protected zn.c f21614I;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f21615z;

    public abstract void O0(zn.c cVar);

    @Deprecated
    public static Q N0(LayoutInflater layoutInflater, Object obj) {
        return (Q) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100282v, null, false, obj);
    }

    protected Q(Object obj, View view, int i10, MaterialToolbar materialToolbar, ConstraintLayout constraintLayout, MaterialToolbar materialToolbar2, SurfaceView surfaceView, Guideline guideline, RecyclerView recyclerView, ProgressBar progressBar, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f21615z = materialToolbar;
        this.f21606A = constraintLayout;
        this.f21607B = materialToolbar2;
        this.f21608C = surfaceView;
        this.f21609D = guideline;
        this.f21610E = recyclerView;
        this.f21611F = progressBar;
        this.f21612G = imageView;
        this.f21613H = textView;
    }

    public static Q M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
