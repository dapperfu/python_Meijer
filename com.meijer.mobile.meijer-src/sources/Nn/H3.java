package Nn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;

/* loaded from: classes10.dex */
public abstract class H3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f21402A;

    /* renamed from: B, reason: collision with root package name */
    public final Guideline f21403B;

    /* renamed from: C, reason: collision with root package name */
    public final CheckableImageButton f21404C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f21405D;

    /* renamed from: E, reason: collision with root package name */
    public final Guideline f21406E;

    /* renamed from: F, reason: collision with root package name */
    public final CollapsibleStepperView f21407F;

    /* renamed from: G, reason: collision with root package name */
    public final MaterialCardView f21408G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f21409H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f21410I;

    /* renamed from: J, reason: collision with root package name */
    public final FullWordEllipsisTextView f21411J;

    /* renamed from: K, reason: collision with root package name */
    public final Guideline f21412K;

    /* renamed from: z, reason: collision with root package name */
    public final Guideline f21413z;

    @Deprecated
    public static H3 N0(View view, Object obj) {
        return (H3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100290x1);
    }

    protected H3(Object obj, View view, int i10, Guideline guideline, FrameLayout frameLayout, Guideline guideline2, CheckableImageButton checkableImageButton, ComposeView composeView, Guideline guideline3, CollapsibleStepperView collapsibleStepperView, MaterialCardView materialCardView, TextView textView, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView, Guideline guideline4) {
        super(obj, view, i10);
        this.f21413z = guideline;
        this.f21402A = frameLayout;
        this.f21403B = guideline2;
        this.f21404C = checkableImageButton;
        this.f21405D = composeView;
        this.f21406E = guideline3;
        this.f21407F = collapsibleStepperView;
        this.f21408G = materialCardView;
        this.f21409H = textView;
        this.f21410I = imageView;
        this.f21411J = fullWordEllipsisTextView;
        this.f21412K = guideline4;
    }

    public static H3 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
