package Nj;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;

/* loaded from: classes7.dex */
public abstract class s extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22168A;

    /* renamed from: B, reason: collision with root package name */
    public final TextInputEditText f22169B;

    /* renamed from: C, reason: collision with root package name */
    public final EnhancedTextInputLayoutView f22170C;

    /* renamed from: z, reason: collision with root package name */
    public final TextInputEditText f22171z;

    @Deprecated
    public static s M0(View view, Object obj) {
        return (s) androidx.databinding.p.U(obj, view, Bj.m.f2950t);
    }

    protected s(Object obj, View view, int i10, TextInputEditText textInputEditText, EnhancedTextInputLayoutView enhancedTextInputLayoutView, TextInputEditText textInputEditText2, EnhancedTextInputLayoutView enhancedTextInputLayoutView2) {
        super(obj, view, i10);
        this.f22171z = textInputEditText;
        this.f22168A = enhancedTextInputLayoutView;
        this.f22169B = textInputEditText2;
        this.f22170C = enhancedTextInputLayoutView2;
    }

    public static s K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
