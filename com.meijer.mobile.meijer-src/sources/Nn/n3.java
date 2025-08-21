package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes10.dex */
public abstract class n3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialCardView f22147A;

    /* renamed from: B, reason: collision with root package name */
    public final Guideline f22148B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f22149C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f22150D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f22151E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f22152F;

    /* renamed from: G, reason: collision with root package name */
    public final FullWordEllipsisTextView f22153G;

    /* renamed from: H, reason: collision with root package name */
    public final Guideline f22154H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f22155I;

    /* renamed from: J, reason: collision with root package name */
    public final Guideline f22156J;

    /* renamed from: z, reason: collision with root package name */
    public final Guideline f22157z;

    @Deprecated
    public static n3 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (n3) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100260n1, viewGroup, z10, obj);
    }

    protected n3(Object obj, View view, int i10, Guideline guideline, MaterialCardView materialCardView, Guideline guideline2, MaterialButton materialButton, TextView textView, TextView textView2, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView, Guideline guideline3, TextView textView3, Guideline guideline4) {
        super(obj, view, i10);
        this.f22157z = guideline;
        this.f22147A = materialCardView;
        this.f22148B = guideline2;
        this.f22149C = materialButton;
        this.f22150D = textView;
        this.f22151E = textView2;
        this.f22152F = imageView;
        this.f22153G = fullWordEllipsisTextView;
        this.f22154H = guideline3;
        this.f22155I = textView3;
        this.f22156J = guideline4;
    }

    public static n3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
