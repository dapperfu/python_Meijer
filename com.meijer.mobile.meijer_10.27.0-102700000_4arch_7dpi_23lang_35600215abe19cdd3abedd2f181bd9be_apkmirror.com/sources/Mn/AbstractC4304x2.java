package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: Mn.x2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4304x2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f21112A;

    /* renamed from: B, reason: collision with root package name */
    public final Button f21113B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f21114C;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21115z;

    @Deprecated
    public static AbstractC4304x2 M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4304x2) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99344Q0, null, false, obj);
    }

    protected AbstractC4304x2(Object obj, View view, int i10, TextView textView, Button button, Button button2, TextView textView2) {
        super(obj, view, i10);
        this.f21115z = textView;
        this.f21112A = button;
        this.f21113B = button2;
        this.f21114C = textView2;
    }

    public static AbstractC4304x2 K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
