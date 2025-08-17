package Nj;

import android.view.View;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;

/* loaded from: classes7.dex */
public final class p implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22145a;

    /* renamed from: b, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22146b;

    /* renamed from: c, reason: collision with root package name */
    public final TextInputLayout f22147c;

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f22148d;

    /* renamed from: e, reason: collision with root package name */
    public final TextInputLayout f22149e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f22150f;

    /* renamed from: g, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22151g;

    /* renamed from: h, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22152h;

    /* renamed from: i, reason: collision with root package name */
    public final TextInputEditText f22153i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialAutoCompleteTextView f22154j;

    /* renamed from: k, reason: collision with root package name */
    public final SwitchMaterial f22155k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f22156l;

    /* renamed from: m, reason: collision with root package name */
    public final SwitchMaterial f22157m;

    /* renamed from: n, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22158n;

    public static p a(View view) {
        int i10 = Bj.k.f2833N;
        EnhancedTextInputLayoutView enhancedTextInputLayoutView = (EnhancedTextInputLayoutView) J4.b.a(view, i10);
        if (enhancedTextInputLayoutView != null) {
            i10 = Bj.k.f2863b0;
            TextInputLayout textInputLayout = (TextInputLayout) J4.b.a(view, i10);
            if (textInputLayout != null) {
                i10 = Bj.k.f2866c0;
                TextInputLayout textInputLayout2 = (TextInputLayout) J4.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = Bj.k.f2869d0;
                    TextInputLayout textInputLayout3 = (TextInputLayout) J4.b.a(view, i10);
                    if (textInputLayout3 != null) {
                        i10 = Bj.k.f2872e0;
                        TextInputLayout textInputLayout4 = (TextInputLayout) J4.b.a(view, i10);
                        if (textInputLayout4 != null) {
                            i10 = Bj.k.f2896m0;
                            EnhancedTextInputLayoutView enhancedTextInputLayoutView2 = (EnhancedTextInputLayoutView) J4.b.a(view, i10);
                            if (enhancedTextInputLayoutView2 != null) {
                                i10 = Bj.k.f2816E0;
                                EnhancedTextInputLayoutView enhancedTextInputLayoutView3 = (EnhancedTextInputLayoutView) J4.b.a(view, i10);
                                if (enhancedTextInputLayoutView3 != null) {
                                    i10 = Bj.k.f2818F0;
                                    TextInputEditText textInputEditText = (TextInputEditText) J4.b.a(view, i10);
                                    if (textInputEditText != null) {
                                        i10 = Bj.k.f2834N0;
                                        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) J4.b.a(view, i10);
                                        if (materialAutoCompleteTextView != null) {
                                            i10 = Bj.k.f2870d1;
                                            SwitchMaterial switchMaterial = (SwitchMaterial) J4.b.a(view, i10);
                                            if (switchMaterial != null) {
                                                i10 = Bj.k.f2873e1;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) J4.b.a(view, i10);
                                                if (textInputLayout5 != null) {
                                                    i10 = Bj.k.f2876f1;
                                                    SwitchMaterial switchMaterial2 = (SwitchMaterial) J4.b.a(view, i10);
                                                    if (switchMaterial2 != null) {
                                                        i10 = Bj.k.f2879g1;
                                                        EnhancedTextInputLayoutView enhancedTextInputLayoutView4 = (EnhancedTextInputLayoutView) J4.b.a(view, i10);
                                                        if (enhancedTextInputLayoutView4 != null) {
                                                            return new p((ExpandableCardView) view, enhancedTextInputLayoutView, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, enhancedTextInputLayoutView2, enhancedTextInputLayoutView3, textInputEditText, materialAutoCompleteTextView, switchMaterial, textInputLayout5, switchMaterial2, enhancedTextInputLayoutView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f22145a;
    }

    private p(ExpandableCardView expandableCardView, EnhancedTextInputLayoutView enhancedTextInputLayoutView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, EnhancedTextInputLayoutView enhancedTextInputLayoutView2, EnhancedTextInputLayoutView enhancedTextInputLayoutView3, TextInputEditText textInputEditText, MaterialAutoCompleteTextView materialAutoCompleteTextView, SwitchMaterial switchMaterial, TextInputLayout textInputLayout5, SwitchMaterial switchMaterial2, EnhancedTextInputLayoutView enhancedTextInputLayoutView4) {
        this.f22145a = expandableCardView;
        this.f22146b = enhancedTextInputLayoutView;
        this.f22147c = textInputLayout;
        this.f22148d = textInputLayout2;
        this.f22149e = textInputLayout3;
        this.f22150f = textInputLayout4;
        this.f22151g = enhancedTextInputLayoutView2;
        this.f22152h = enhancedTextInputLayoutView3;
        this.f22153i = textInputEditText;
        this.f22154j = materialAutoCompleteTextView;
        this.f22155k = switchMaterial;
        this.f22156l = textInputLayout5;
        this.f22157m = switchMaterial2;
        this.f22158n = enhancedTextInputLayoutView4;
    }
}
