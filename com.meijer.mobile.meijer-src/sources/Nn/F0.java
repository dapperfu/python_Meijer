package Nn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public abstract class F0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialTextView f21333A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f21334B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageView f21335C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f21336D;

    /* renamed from: E, reason: collision with root package name */
    public final ListCardView f21337E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f21338F;

    /* renamed from: G, reason: collision with root package name */
    public final Guideline f21339G;

    /* renamed from: H, reason: collision with root package name */
    public final Guideline f21340H;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f21341z;

    protected F0(Object obj, View view, int i10, Barrier barrier, MaterialTextView materialTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ListCardView listCardView, TextView textView, Guideline guideline, Guideline guideline2) {
        super(obj, view, i10);
        this.f21341z = barrier;
        this.f21333A = materialTextView;
        this.f21334B = imageView;
        this.f21335C = imageView2;
        this.f21336D = imageView3;
        this.f21337E = listCardView;
        this.f21338F = textView;
        this.f21339G = guideline;
        this.f21340H = guideline2;
    }
}
