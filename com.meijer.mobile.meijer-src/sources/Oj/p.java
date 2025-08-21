package Oj;

import android.view.View;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;

/* loaded from: classes8.dex */
public final class p implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24390a;

    /* renamed from: b, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f24391b;

    /* renamed from: c, reason: collision with root package name */
    public final TextInputLayout f24392c;

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f24393d;

    /* renamed from: e, reason: collision with root package name */
    public final TextInputLayout f24394e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f24395f;

    /* renamed from: g, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f24396g;

    /* renamed from: h, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f24397h;

    /* renamed from: i, reason: collision with root package name */
    public final TextInputEditText f24398i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialAutoCompleteTextView f24399j;

    /* renamed from: k, reason: collision with root package name */
    public final SwitchMaterial f24400k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f24401l;

    /* renamed from: m, reason: collision with root package name */
    public final SwitchMaterial f24402m;

    /* renamed from: n, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f24403n;

    public static p a(View view) {
        int i10 = Cj.k.f4878N;
        EnhancedTextInputLayoutView enhancedTextInputLayoutView = (EnhancedTextInputLayoutView) K4.b.a(view, i10);
        if (enhancedTextInputLayoutView != null) {
            i10 = Cj.k.f4908b0;
            TextInputLayout textInputLayout = (TextInputLayout) K4.b.a(view, i10);
            if (textInputLayout != null) {
                i10 = Cj.k.f4911c0;
                TextInputLayout textInputLayout2 = (TextInputLayout) K4.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = Cj.k.f4914d0;
                    TextInputLayout textInputLayout3 = (TextInputLayout) K4.b.a(view, i10);
                    if (textInputLayout3 != null) {
                        i10 = Cj.k.f4917e0;
                        TextInputLayout textInputLayout4 = (TextInputLayout) K4.b.a(view, i10);
                        if (textInputLayout4 != null) {
                            i10 = Cj.k.f4941m0;
                            EnhancedTextInputLayoutView enhancedTextInputLayoutView2 = (EnhancedTextInputLayoutView) K4.b.a(view, i10);
                            if (enhancedTextInputLayoutView2 != null) {
                                i10 = Cj.k.f4861E0;
                                EnhancedTextInputLayoutView enhancedTextInputLayoutView3 = (EnhancedTextInputLayoutView) K4.b.a(view, i10);
                                if (enhancedTextInputLayoutView3 != null) {
                                    i10 = Cj.k.f4863F0;
                                    TextInputEditText textInputEditText = (TextInputEditText) K4.b.a(view, i10);
                                    if (textInputEditText != null) {
                                        i10 = Cj.k.f4879N0;
                                        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) K4.b.a(view, i10);
                                        if (materialAutoCompleteTextView != null) {
                                            i10 = Cj.k.f4915d1;
                                            SwitchMaterial switchMaterial = (SwitchMaterial) K4.b.a(view, i10);
                                            if (switchMaterial != null) {
                                                i10 = Cj.k.f4918e1;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) K4.b.a(view, i10);
                                                if (textInputLayout5 != null) {
                                                    i10 = Cj.k.f4921f1;
                                                    SwitchMaterial switchMaterial2 = (SwitchMaterial) K4.b.a(view, i10);
                                                    if (switchMaterial2 != null) {
                                                        i10 = Cj.k.f4924g1;
                                                        EnhancedTextInputLayoutView enhancedTextInputLayoutView4 = (EnhancedTextInputLayoutView) K4.b.a(view, i10);
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

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24390a;
    }

    private p(ExpandableCardView expandableCardView, EnhancedTextInputLayoutView enhancedTextInputLayoutView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, EnhancedTextInputLayoutView enhancedTextInputLayoutView2, EnhancedTextInputLayoutView enhancedTextInputLayoutView3, TextInputEditText textInputEditText, MaterialAutoCompleteTextView materialAutoCompleteTextView, SwitchMaterial switchMaterial, TextInputLayout textInputLayout5, SwitchMaterial switchMaterial2, EnhancedTextInputLayoutView enhancedTextInputLayoutView4) {
        this.f24390a = expandableCardView;
        this.f24391b = enhancedTextInputLayoutView;
        this.f24392c = textInputLayout;
        this.f24393d = textInputLayout2;
        this.f24394e = textInputLayout3;
        this.f24395f = textInputLayout4;
        this.f24396g = enhancedTextInputLayoutView2;
        this.f24397h = enhancedTextInputLayoutView3;
        this.f24398i = textInputEditText;
        this.f24399j = materialAutoCompleteTextView;
        this.f24400k = switchMaterial;
        this.f24401l = textInputLayout5;
        this.f24402m = switchMaterial2;
        this.f24403n = enhancedTextInputLayoutView4;
    }
}
