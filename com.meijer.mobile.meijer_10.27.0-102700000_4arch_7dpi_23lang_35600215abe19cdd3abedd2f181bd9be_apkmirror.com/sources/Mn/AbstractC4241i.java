package Mn;

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

/* renamed from: Mn.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4241i extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f20666A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialTextView f20667B;

    /* renamed from: C, reason: collision with root package name */
    public final AutoCompleteTextView f20668C;

    /* renamed from: D, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f20669D;

    /* renamed from: E, reason: collision with root package name */
    public final AutoCompleteTextView f20670E;

    /* renamed from: F, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f20671F;

    /* renamed from: G, reason: collision with root package name */
    public final CalloutView f20672G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f20673H;

    /* renamed from: I, reason: collision with root package name */
    public final MaterialTextView f20674I;

    /* renamed from: J, reason: collision with root package name */
    public final ProgressView f20675J;

    /* renamed from: K, reason: collision with root package name */
    public final MaterialToolbar f20676K;

    /* renamed from: L, reason: collision with root package name */
    public final MaterialButton f20677L;

    /* renamed from: M, reason: collision with root package name */
    public final View f20678M;

    /* renamed from: N, reason: collision with root package name */
    public final ConstraintLayout f20679N;

    /* renamed from: z, reason: collision with root package name */
    public final AppBarLayout f20680z;

    @Deprecated
    public static AbstractC4241i M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4241i) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99375e, null, false, obj);
    }

    protected AbstractC4241i(Object obj, View view, int i10, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, MaterialTextView materialTextView, AutoCompleteTextView autoCompleteTextView, EnhancedTextInputLayoutView enhancedTextInputLayoutView, AutoCompleteTextView autoCompleteTextView2, EnhancedTextInputLayoutView enhancedTextInputLayoutView2, CalloutView calloutView, ImageView imageView, MaterialTextView materialTextView2, ProgressView progressView, MaterialToolbar materialToolbar, MaterialButton materialButton, View view2, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.f20680z = appBarLayout;
        this.f20666A = constraintLayout;
        this.f20667B = materialTextView;
        this.f20668C = autoCompleteTextView;
        this.f20669D = enhancedTextInputLayoutView;
        this.f20670E = autoCompleteTextView2;
        this.f20671F = enhancedTextInputLayoutView2;
        this.f20672G = calloutView;
        this.f20673H = imageView;
        this.f20674I = materialTextView2;
        this.f20675J = progressView;
        this.f20676K = materialToolbar;
        this.f20677L = materialButton;
        this.f20678M = view2;
        this.f20679N = constraintLayout2;
    }

    public static AbstractC4241i K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
