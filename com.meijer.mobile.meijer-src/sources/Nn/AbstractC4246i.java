package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.CalloutView;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4246i extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f21998A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialTextView f21999B;

    /* renamed from: C, reason: collision with root package name */
    public final AutoCompleteTextView f22000C;

    /* renamed from: D, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22001D;

    /* renamed from: E, reason: collision with root package name */
    public final AutoCompleteTextView f22002E;

    /* renamed from: F, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22003F;

    /* renamed from: G, reason: collision with root package name */
    public final CalloutView f22004G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f22005H;

    /* renamed from: I, reason: collision with root package name */
    public final MaterialTextView f22006I;

    /* renamed from: J, reason: collision with root package name */
    public final ProgressView f22007J;

    /* renamed from: K, reason: collision with root package name */
    public final MaterialToolbar f22008K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialButton f22009L;

    /* renamed from: M, reason: collision with root package name */
    public final View f22010M;

    /* renamed from: N, reason: collision with root package name */
    public final ConstraintLayout f22011N;

    /* renamed from: z, reason: collision with root package name */
    public final AppBarLayout f22012z;

    @Deprecated
    public static AbstractC4246i N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4246i) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100231e, null, false, obj);
    }

    protected AbstractC4246i(Object obj, View view, int i10, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, MaterialTextView materialTextView, AutoCompleteTextView autoCompleteTextView, EnhancedTextInputLayoutView enhancedTextInputLayoutView, AutoCompleteTextView autoCompleteTextView2, EnhancedTextInputLayoutView enhancedTextInputLayoutView2, CalloutView calloutView, ImageView imageView, MaterialTextView materialTextView2, ProgressView progressView, MaterialToolbar materialToolbar, MaterialButton materialButton, View view2, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.f22012z = appBarLayout;
        this.f21998A = constraintLayout;
        this.f21999B = materialTextView;
        this.f22000C = autoCompleteTextView;
        this.f22001D = enhancedTextInputLayoutView;
        this.f22002E = autoCompleteTextView2;
        this.f22003F = enhancedTextInputLayoutView2;
        this.f22004G = calloutView;
        this.f22005H = imageView;
        this.f22006I = materialTextView2;
        this.f22007J = progressView;
        this.f22008K = materialToolbar;
        this.f22009L = materialButton;
        this.f22010M = view2;
        this.f22011N = constraintLayout2;
    }

    public static AbstractC4246i M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
