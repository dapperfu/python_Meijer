package Nn;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes10.dex */
public abstract class J1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f21474A;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f21475z;

    @Deprecated
    public static J1 N0(View view, Object obj) {
        return (J1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100277t0);
    }

    protected J1(Object obj, View view, int i10, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i10);
        this.f21475z = constraintLayout;
        this.f21474A = textView;
    }

    public static J1 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
