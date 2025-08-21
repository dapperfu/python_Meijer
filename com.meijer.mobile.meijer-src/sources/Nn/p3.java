package Nn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes10.dex */
public abstract class p3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialButton f22188A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialCardView f22189B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f22190C;

    /* renamed from: D, reason: collision with root package name */
    public final Guideline f22191D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f22192E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f22193F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f22194G;

    /* renamed from: H, reason: collision with root package name */
    public final FullWordEllipsisTextView f22195H;

    /* renamed from: I, reason: collision with root package name */
    public final Guideline f22196I;

    /* renamed from: J, reason: collision with root package name */
    public final Guideline f22197J;

    /* renamed from: z, reason: collision with root package name */
    public final Guideline f22198z;

    @Deprecated
    public static p3 N0(View view, Object obj) {
        return (p3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100263o1);
    }

    protected p3(Object obj, View view, int i10, Guideline guideline, MaterialButton materialButton, MaterialCardView materialCardView, MaterialButton materialButton2, Guideline guideline2, TextView textView, TextView textView2, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView, Guideline guideline3, Guideline guideline4) {
        super(obj, view, i10);
        this.f22198z = guideline;
        this.f22188A = materialButton;
        this.f22189B = materialCardView;
        this.f22190C = materialButton2;
        this.f22191D = guideline2;
        this.f22192E = textView;
        this.f22193F = textView2;
        this.f22194G = imageView;
        this.f22195H = fullWordEllipsisTextView;
        this.f22196I = guideline3;
        this.f22197J = guideline4;
    }

    public static p3 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
