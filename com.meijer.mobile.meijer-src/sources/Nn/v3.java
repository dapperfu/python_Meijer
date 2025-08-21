package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;

/* loaded from: classes10.dex */
public abstract class v3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f22379A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f22380B;

    /* renamed from: z, reason: collision with root package name */
    public final ProgressIndicatorView f22381z;

    @Deprecated
    public static v3 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (v3) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100272r1, viewGroup, z10, obj);
    }

    protected v3(Object obj, View view, int i10, ProgressIndicatorView progressIndicatorView, View view2, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f22381z = progressIndicatorView;
        this.f22379A = view2;
        this.f22380B = constraintLayout;
    }

    public static v3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
