package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;

/* renamed from: Mn.f3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4230f3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Group f20617A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f20618B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageView f20619C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f20620D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f20621E;

    /* renamed from: F, reason: collision with root package name */
    public final Group f20622F;

    /* renamed from: G, reason: collision with root package name */
    public final View f20623G;

    /* renamed from: H, reason: collision with root package name */
    public final ProgressBar f20624H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f20625I;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20626z;

    @Deprecated
    public static AbstractC4230f3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4230f3) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99392j1, viewGroup, z10, obj);
    }

    protected AbstractC4230f3(Object obj, View view, int i10, TextView textView, Group group, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, Group group2, View view2, ProgressBar progressBar, ImageView imageView3) {
        super(obj, view, i10);
        this.f20626z = textView;
        this.f20617A = group;
        this.f20618B = imageView;
        this.f20619C = imageView2;
        this.f20620D = textView2;
        this.f20621E = textView3;
        this.f20622F = group2;
        this.f20623G = view2;
        this.f20624H = progressBar;
        this.f20625I = imageView3;
    }

    public static AbstractC4230f3 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
