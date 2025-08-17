package Mn;

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

/* loaded from: classes9.dex */
public abstract class Q extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f20274A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialToolbar f20275B;

    /* renamed from: C, reason: collision with root package name */
    public final SurfaceView f20276C;

    /* renamed from: D, reason: collision with root package name */
    public final Guideline f20277D;

    /* renamed from: E, reason: collision with root package name */
    public final RecyclerView f20278E;

    /* renamed from: F, reason: collision with root package name */
    public final ProgressBar f20279F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f20280G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f20281H;

    /* renamed from: I, reason: collision with root package name */
    protected yn.c f20282I;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20283z;

    public abstract void O0(yn.c cVar);

    @Deprecated
    public static Q M0(LayoutInflater layoutInflater, Object obj) {
        return (Q) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99426v, null, false, obj);
    }

    protected Q(Object obj, View view, int i10, MaterialToolbar materialToolbar, ConstraintLayout constraintLayout, MaterialToolbar materialToolbar2, SurfaceView surfaceView, Guideline guideline, RecyclerView recyclerView, ProgressBar progressBar, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f20283z = materialToolbar;
        this.f20274A = constraintLayout;
        this.f20275B = materialToolbar2;
        this.f20276C = surfaceView;
        this.f20277D = guideline;
        this.f20278E = recyclerView;
        this.f20279F = progressBar;
        this.f20280G = imageView;
        this.f20281H = textView;
    }

    public static Q K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
