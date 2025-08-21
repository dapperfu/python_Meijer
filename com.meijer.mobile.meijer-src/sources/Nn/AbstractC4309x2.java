package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: Nn.x2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4309x2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f22444A;

    /* renamed from: B, reason: collision with root package name */
    public final Button f22445B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f22446C;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f22447z;

    @Deprecated
    public static AbstractC4309x2 N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4309x2) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100200Q0, null, false, obj);
    }

    protected AbstractC4309x2(Object obj, View view, int i10, TextView textView, Button button, Button button2, TextView textView2) {
        super(obj, view, i10);
        this.f22447z = textView;
        this.f22444A = button;
        this.f22445B = button2;
        this.f22446C = textView2;
    }

    public static AbstractC4309x2 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
