package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/* loaded from: classes9.dex */
public abstract class P2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f20271A;

    /* renamed from: B, reason: collision with root package name */
    public final View f20272B;

    /* renamed from: z, reason: collision with root package name */
    public final Button f20273z;

    @Deprecated
    public static P2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (P2) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99368b1, viewGroup, z10, obj);
    }

    protected P2(Object obj, View view, int i10, Button button, Button button2, View view2) {
        super(obj, view, i10);
        this.f20273z = button;
        this.f20271A = button2;
        this.f20272B = view2;
    }

    public static P2 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
