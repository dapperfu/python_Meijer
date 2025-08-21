package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;

/* renamed from: Nn.f3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4235f3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Group f21949A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f21950B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageView f21951C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f21952D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f21953E;

    /* renamed from: F, reason: collision with root package name */
    public final Group f21954F;

    /* renamed from: G, reason: collision with root package name */
    public final View f21955G;

    /* renamed from: H, reason: collision with root package name */
    public final ProgressBar f21956H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f21957I;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21958z;

    @Deprecated
    public static AbstractC4235f3 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4235f3) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100248j1, viewGroup, z10, obj);
    }

    protected AbstractC4235f3(Object obj, View view, int i10, TextView textView, Group group, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, Group group2, View view2, ProgressBar progressBar, ImageView imageView3) {
        super(obj, view, i10);
        this.f21958z = textView;
        this.f21949A = group;
        this.f21950B = imageView;
        this.f21951C = imageView2;
        this.f21952D = textView2;
        this.f21953E = textView3;
        this.f21954F = group2;
        this.f21955G = view2;
        this.f21956H = progressBar;
        this.f21957I = imageView3;
    }

    public static AbstractC4235f3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
