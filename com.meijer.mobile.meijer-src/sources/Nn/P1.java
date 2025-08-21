package Nn;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public abstract class P1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f21601A;

    /* renamed from: z, reason: collision with root package name */
    public final View f21602z;

    @Deprecated
    public static P1 N0(View view, Object obj) {
        return (P1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100286w0);
    }

    protected P1(Object obj, View view, int i10, View view2, TextView textView) {
        super(obj, view, i10);
        this.f21602z = view2;
        this.f21601A = textView;
    }

    public static P1 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
