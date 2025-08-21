package Nn;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: Nn.t2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4293t2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f22320A;

    /* renamed from: z, reason: collision with root package name */
    public final Button f22321z;

    @Deprecated
    public static AbstractC4293t2 N0(View view, Object obj) {
        return (AbstractC4293t2) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100196O0);
    }

    protected AbstractC4293t2(Object obj, View view, int i10, Button button, TextView textView) {
        super(obj, view, i10);
        this.f22321z = button;
        this.f22320A = textView;
    }

    public static AbstractC4293t2 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
