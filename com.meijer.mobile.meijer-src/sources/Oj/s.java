package Oj;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;

/* loaded from: classes8.dex */
public abstract class s extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f24413A;

    /* renamed from: B, reason: collision with root package name */
    public final TextInputEditText f24414B;

    /* renamed from: C, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f24415C;

    /* renamed from: z, reason: collision with root package name */
    public final TextInputEditText f24416z;

    @Deprecated
    public static s N0(View view, Object obj) {
        return (s) androidx.databinding.p.U(obj, view, Cj.m.f4995t);
    }

    protected s(Object obj, View view, int i10, TextInputEditText textInputEditText, EnhancedTextInputLayoutView enhancedTextInputLayoutView, TextInputEditText textInputEditText2, EnhancedTextInputLayoutView enhancedTextInputLayoutView2) {
        super(obj, view, i10);
        this.f24416z = textInputEditText;
        this.f24413A = enhancedTextInputLayoutView;
        this.f24414B = textInputEditText2;
        this.f24415C = enhancedTextInputLayoutView2;
    }

    public static s M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
