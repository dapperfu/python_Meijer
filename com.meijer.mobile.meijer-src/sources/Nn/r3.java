package Nn;

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

/* loaded from: classes10.dex */
public abstract class r3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f22252A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f22253B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f22254C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialButton f22255D;

    /* renamed from: E, reason: collision with root package name */
    public final FrameLayout f22256E;

    /* renamed from: F, reason: collision with root package name */
    public final CheckableImageButton f22257F;

    /* renamed from: G, reason: collision with root package name */
    public final MaterialCardView f22258G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f22259H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f22260I;

    /* renamed from: J, reason: collision with root package name */
    public final FullWordEllipsisTextView f22261J;

    /* renamed from: K, reason: collision with root package name */
    public final TextView f22262K;

    /* renamed from: L, reason: collision with root package name */
    public final ComposeView f22263L;

    /* renamed from: M, reason: collision with root package name */
    public final TextView f22264M;

    /* renamed from: N, reason: collision with root package name */
    public final CollapsibleStepperView f22265N;

    /* renamed from: O, reason: collision with root package name */
    public final ComposeView f22266O;

    /* renamed from: P, reason: collision with root package name */
    public final TextView f22267P;

    /* renamed from: Q, reason: collision with root package name */
    protected ProductListDecorator f22268Q;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f22269z;

    public abstract void R0(ProductListDecorator productListDecorator);

    @Deprecated
    public static r3 N0(View view, Object obj) {
        return (r3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100266p1);
    }

    public ProductListDecorator O0() {
        return this.f22268Q;
    }

    protected r3(Object obj, View view, int i10, FrameLayout frameLayout, ComposeView composeView, ImageView imageView, TextView textView, MaterialButton materialButton, FrameLayout frameLayout2, CheckableImageButton checkableImageButton, MaterialCardView materialCardView, ImageView imageView2, TextView textView2, FullWordEllipsisTextView fullWordEllipsisTextView, TextView textView3, ComposeView composeView2, TextView textView4, CollapsibleStepperView collapsibleStepperView, ComposeView composeView3, TextView textView5) {
        super(obj, view, i10);
        this.f22269z = frameLayout;
        this.f22252A = composeView;
        this.f22253B = imageView;
        this.f22254C = textView;
        this.f22255D = materialButton;
        this.f22256E = frameLayout2;
        this.f22257F = checkableImageButton;
        this.f22258G = materialCardView;
        this.f22259H = imageView2;
        this.f22260I = textView2;
        this.f22261J = fullWordEllipsisTextView;
        this.f22262K = textView3;
        this.f22263L = composeView2;
        this.f22264M = textView4;
        this.f22265N = collapsibleStepperView;
        this.f22266O = composeView3;
        this.f22267P = textView5;
    }

    public static r3 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
