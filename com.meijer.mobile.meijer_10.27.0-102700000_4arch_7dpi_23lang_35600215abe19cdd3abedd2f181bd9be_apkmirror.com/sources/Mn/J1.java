package Mn;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes9.dex */
public abstract class J1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f20142A;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f20143z;

    @Deprecated
    public static J1 M0(View view, Object obj) {
        return (J1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99421t0);
    }

    protected J1(Object obj, View view, int i10, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i10);
        this.f20143z = constraintLayout;
        this.f20142A = textView;
    }

    public static J1 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
