package Mn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import vs.ProductListDecorator;

/* loaded from: classes9.dex */
public abstract class r3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f20920A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f20921B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20922C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialButton f20923D;

    /* renamed from: E, reason: collision with root package name */
    public final FrameLayout f20924E;

    /* renamed from: F, reason: collision with root package name */
    public final CheckableImageButton f20925F;

    /* renamed from: G, reason: collision with root package name */
    public final MaterialCardView f20926G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f20927H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f20928I;

    /* renamed from: J, reason: collision with root package name */
    public final FullWordEllipsisTextView f20929J;

    /* renamed from: K, reason: collision with root package name */
    public final TextView f20930K;

    /* renamed from: L, reason: collision with root package name */
    public final ComposeView f20931L;

    /* renamed from: M, reason: collision with root package name */
    public final TextView f20932M;

    /* renamed from: N, reason: collision with root package name */
    public final CollapsibleStepperView f20933N;

    /* renamed from: O, reason: collision with root package name */
    public final ComposeView f20934O;

    /* renamed from: P, reason: collision with root package name */
    public final TextView f20935P;

    /* renamed from: Q, reason: collision with root package name */
    protected ProductListDecorator f20936Q;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f20937z;

    public abstract void P0(ProductListDecorator productListDecorator);

    @Deprecated
    public static r3 M0(View view, Object obj) {
        return (r3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99410p1);
    }

    public ProductListDecorator O0() {
        return this.f20936Q;
    }

    protected r3(Object obj, View view, int i10, FrameLayout frameLayout, ComposeView composeView, ImageView imageView, TextView textView, MaterialButton materialButton, FrameLayout frameLayout2, CheckableImageButton checkableImageButton, MaterialCardView materialCardView, ImageView imageView2, TextView textView2, FullWordEllipsisTextView fullWordEllipsisTextView, TextView textView3, ComposeView composeView2, TextView textView4, CollapsibleStepperView collapsibleStepperView, ComposeView composeView3, TextView textView5) {
        super(obj, view, i10);
        this.f20937z = frameLayout;
        this.f20920A = composeView;
        this.f20921B = imageView;
        this.f20922C = textView;
        this.f20923D = materialButton;
        this.f20924E = frameLayout2;
        this.f20925F = checkableImageButton;
        this.f20926G = materialCardView;
        this.f20927H = imageView2;
        this.f20928I = textView2;
        this.f20929J = fullWordEllipsisTextView;
        this.f20930K = textView3;
        this.f20931L = composeView2;
        this.f20932M = textView4;
        this.f20933N = collapsibleStepperView;
        this.f20934O = composeView3;
        this.f20935P = textView5;
    }

    public static r3 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
