package Mn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes9.dex */
public abstract class p3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialButton f20856A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialCardView f20857B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f20858C;

    /* renamed from: D, reason: collision with root package name */
    public final Guideline f20859D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f20860E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f20861F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f20862G;

    /* renamed from: H, reason: collision with root package name */
    public final FullWordEllipsisTextView f20863H;

    /* renamed from: I, reason: collision with root package name */
    public final Guideline f20864I;

    /* renamed from: J, reason: collision with root package name */
    public final Guideline f20865J;

    /* renamed from: z, reason: collision with root package name */
    public final Guideline f20866z;

    @Deprecated
    public static p3 M0(View view, Object obj) {
        return (p3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99407o1);
    }

    protected p3(Object obj, View view, int i10, Guideline guideline, MaterialButton materialButton, MaterialCardView materialCardView, MaterialButton materialButton2, Guideline guideline2, TextView textView, TextView textView2, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView, Guideline guideline3, Guideline guideline4) {
        super(obj, view, i10);
        this.f20866z = guideline;
        this.f20856A = materialButton;
        this.f20857B = materialCardView;
        this.f20858C = materialButton2;
        this.f20859D = guideline2;
        this.f20860E = textView;
        this.f20861F = textView2;
        this.f20862G = imageView;
        this.f20863H = fullWordEllipsisTextView;
        this.f20864I = guideline3;
        this.f20865J = guideline4;
    }

    public static p3 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
