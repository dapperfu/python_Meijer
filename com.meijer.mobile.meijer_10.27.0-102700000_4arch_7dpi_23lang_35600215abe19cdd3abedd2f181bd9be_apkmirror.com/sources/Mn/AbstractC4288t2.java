package Mn;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: Mn.t2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4288t2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f20988A;

    /* renamed from: z, reason: collision with root package name */
    public final Button f20989z;

    @Deprecated
    public static AbstractC4288t2 M0(View view, Object obj) {
        return (AbstractC4288t2) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99340O0);
    }

    protected AbstractC4288t2(Object obj, View view, int i10, Button button, TextView textView) {
        super(obj, view, i10);
        this.f20989z = button;
        this.f20988A = textView;
    }

    public static AbstractC4288t2 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
