package Mn;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: Mn.b2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4209b2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f20484A;

    /* renamed from: z, reason: collision with root package name */
    public final Button f20485z;

    @Deprecated
    public static AbstractC4209b2 M0(View view, Object obj) {
        return (AbstractC4209b2) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99318D0);
    }

    protected AbstractC4209b2(Object obj, View view, int i10, Button button, TextView textView) {
        super(obj, view, i10);
        this.f20485z = button;
        this.f20484A = textView;
    }

    public static AbstractC4209b2 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
