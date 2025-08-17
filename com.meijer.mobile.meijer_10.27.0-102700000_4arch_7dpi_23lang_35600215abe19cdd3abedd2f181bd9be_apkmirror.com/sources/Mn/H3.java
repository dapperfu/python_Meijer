package Mn;

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

/* loaded from: classes9.dex */
public abstract class H3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f20070A;

    /* renamed from: B, reason: collision with root package name */
    public final Guideline f20071B;

    /* renamed from: C, reason: collision with root package name */
    public final CheckableImageButton f20072C;

    /* renamed from: D, reason: collision with root package name */
    public final ComposeView f20073D;

    /* renamed from: E, reason: collision with root package name */
    public final Guideline f20074E;

    /* renamed from: F, reason: collision with root package name */
    public final CollapsibleStepperView f20075F;

    /* renamed from: G, reason: collision with root package name */
    public final MaterialCardView f20076G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f20077H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f20078I;

    /* renamed from: J, reason: collision with root package name */
    public final FullWordEllipsisTextView f20079J;

    /* renamed from: K, reason: collision with root package name */
    public final Guideline f20080K;

    /* renamed from: z, reason: collision with root package name */
    public final Guideline f20081z;

    @Deprecated
    public static H3 M0(View view, Object obj) {
        return (H3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99434x1);
    }

    protected H3(Object obj, View view, int i10, Guideline guideline, FrameLayout frameLayout, Guideline guideline2, CheckableImageButton checkableImageButton, ComposeView composeView, Guideline guideline3, CollapsibleStepperView collapsibleStepperView, MaterialCardView materialCardView, TextView textView, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView, Guideline guideline4) {
        super(obj, view, i10);
        this.f20081z = guideline;
        this.f20070A = frameLayout;
        this.f20071B = guideline2;
        this.f20072C = checkableImageButton;
        this.f20073D = composeView;
        this.f20074E = guideline3;
        this.f20075F = collapsibleStepperView;
        this.f20076G = materialCardView;
        this.f20077H = textView;
        this.f20078I = imageView;
        this.f20079J = fullWordEllipsisTextView;
        this.f20080K = guideline4;
    }

    public static H3 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
