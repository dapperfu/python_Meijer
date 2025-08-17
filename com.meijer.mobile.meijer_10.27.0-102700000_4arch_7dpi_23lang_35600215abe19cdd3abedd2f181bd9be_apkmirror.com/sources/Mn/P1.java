package Mn;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes9.dex */
public abstract class P1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f20269A;

    /* renamed from: z, reason: collision with root package name */
    public final View f20270z;

    @Deprecated
    public static P1 M0(View view, Object obj) {
        return (P1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99430w0);
    }

    protected P1(Object obj, View view, int i10, View view2, TextView textView) {
        super(obj, view, i10);
        this.f20270z = view2;
        this.f20269A = textView;
    }

    public static P1 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
