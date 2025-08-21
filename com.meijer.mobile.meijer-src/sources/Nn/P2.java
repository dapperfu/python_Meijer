package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/* loaded from: classes10.dex */
public abstract class P2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f21603A;

    /* renamed from: B, reason: collision with root package name */
    public final View f21604B;

    /* renamed from: z, reason: collision with root package name */
    public final Button f21605z;

    @Deprecated
    public static P2 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (P2) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100224b1, viewGroup, z10, obj);
    }

    protected P2(Object obj, View view, int i10, Button button, Button button2, View view2) {
        super(obj, view, i10);
        this.f21605z = button;
        this.f21603A = button2;
        this.f21604B = view2;
    }

    public static P2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
